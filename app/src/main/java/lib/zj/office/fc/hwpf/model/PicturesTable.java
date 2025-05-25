package lib.zj.office.fc.hwpf.model;

import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.ddf.DefaultEscherRecordFactory;
import lib.zj.office.fc.ddf.EscherBSERecord;
import lib.zj.office.fc.ddf.EscherBlipRecord;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.ddf.EscherRecordFactory;
import lib.zj.office.fc.hwpf.HWPFDocument;
import lib.zj.office.fc.hwpf.usermodel.CharacterRun;
import lib.zj.office.fc.hwpf.usermodel.InlineWordArt;
import lib.zj.office.fc.hwpf.usermodel.Picture;
import lib.zj.office.fc.hwpf.usermodel.Range;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class PicturesTable {
    static final int BLOCK_TYPE_OFFSET = 14;
    static final int MM_MODE_TYPE_OFFSET = 6;
    static final int TYPE_HORIZONTAL_LINE = 14;
    static final int TYPE_IMAGE = 8;
    static final int TYPE_IMAGE_PASTED_FROM_CLIPBOARD = 10;
    static final int TYPE_IMAGE_PASTED_FROM_CLIPBOARD_WORD2000 = 2;
    static final int TYPE_IMAGE_WORD2000 = 0;
    private byte[] _dataStream;
    @Deprecated
    private EscherRecordHolder _dgg;
    private HWPFDocument _document;
    @Deprecated
    private FSPATable _fspa;
    private byte[] _mainStream;

    @Deprecated
    public PicturesTable(HWPFDocument hWPFDocument, byte[] bArr, byte[] bArr2, FSPATable fSPATable, EscherRecordHolder escherRecordHolder) {
        this._document = hWPFDocument;
        this._dataStream = bArr;
        this._mainStream = bArr2;
        this._fspa = fSPATable;
        this._dgg = escherRecordHolder;
    }

    private static short getBlockType(byte[] bArr, int i10) {
        return LittleEndian.getShort(bArr, i10 + 14);
    }

    private static short getMmMode(byte[] bArr, int i10) {
        return LittleEndian.getShort(bArr, i10 + 6);
    }

    private boolean isBlockContainsHorizontalLine(int i10) {
        if (getBlockType(this._dataStream, i10) == 14 && getMmMode(this._dataStream, i10) == 100) {
            return true;
        }
        return false;
    }

    private boolean isBlockContainsImage(int i10) {
        return isPictureRecognized(getBlockType(this._dataStream, i10), getMmMode(this._dataStream, i10));
    }

    private boolean isBlockContainsInlineWordArt(int i10) {
        return isInlineWordArtRecognized(getBlockType(this._dataStream, i10), getMmMode(this._dataStream, i10));
    }

    private boolean isInlineWordArtRecognized(short s4, short s10) {
        if (s4 == 6 && s10 == 100) {
            return true;
        }
        return false;
    }

    private boolean isPictureRecognized(short s4, short s10) {
        if (s4 != 8 && s4 != 10 && ((s4 != 0 || s10 != 100) && (s4 != 2 || s10 != 100))) {
            return false;
        }
        return true;
    }

    private void searchForPictures(List<EscherRecord> list, List<Picture> list2) {
        for (EscherRecord escherRecord : list) {
            if (escherRecord instanceof EscherBSERecord) {
                EscherBSERecord escherBSERecord = (EscherBSERecord) escherRecord;
                EscherBlipRecord blipRecord = escherBSERecord.getBlipRecord();
                if (blipRecord != null) {
                    list2.add(new Picture(blipRecord.getPicturedata()));
                } else if (escherBSERecord.getOffset() > 0) {
                    EscherRecordFactory defaultEscherRecordFactory = new DefaultEscherRecordFactory();
                    EscherRecord createRecord = defaultEscherRecordFactory.createRecord(this._mainStream, escherBSERecord.getOffset());
                    if (createRecord instanceof EscherBlipRecord) {
                        createRecord.fillFields(this._mainStream, escherBSERecord.getOffset(), defaultEscherRecordFactory);
                        list2.add(new Picture(((EscherBlipRecord) createRecord).getPicturedata()));
                    }
                }
            }
            searchForPictures(escherRecord.getChildRecords(), list2);
        }
    }

    public InlineWordArt extracInlineWordArt(CharacterRun characterRun) {
        if (hasInlineWordArt(characterRun)) {
            return new InlineWordArt(this._dataStream, characterRun.getPicOffset());
        }
        return null;
    }

    public Picture extractPicture(String str, CharacterRun characterRun, boolean z10) {
        if (hasPicture(characterRun)) {
            try {
                return new Picture(str, characterRun.getPicOffset(), this._dataStream, z10);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public List<Picture> getAllPictures(String str) {
        Picture extractPicture;
        ArrayList arrayList = new ArrayList();
        Range overallRange = this._document.getOverallRange();
        for (int i10 = 0; i10 < overallRange.numCharacterRuns(); i10++) {
            CharacterRun characterRun = overallRange.getCharacterRun(i10);
            if (characterRun != null && (extractPicture = extractPicture(str, characterRun, false)) != null) {
                arrayList.add(extractPicture);
            }
        }
        searchForPictures(this._dgg.getEscherRecords(), arrayList);
        return arrayList;
    }

    public boolean hasEscherPicture(CharacterRun characterRun) {
        if (characterRun.isSpecialCharacter() && !characterRun.isObj() && !characterRun.isOle2() && !characterRun.isData() && characterRun.text().startsWith("\b")) {
            return true;
        }
        return false;
    }

    public boolean hasHorizontalLine(CharacterRun characterRun) {
        if (characterRun.isSpecialCharacter() && "\u0001".equals(characterRun.text())) {
            return isBlockContainsHorizontalLine(characterRun.getPicOffset());
        }
        return false;
    }

    public boolean hasInlineWordArt(CharacterRun characterRun) {
        if (characterRun == null || !characterRun.isSpecialCharacter() || characterRun.isObj() || characterRun.isOle2() || characterRun.isData() || (!"\u0001".equals(characterRun.text()) && !"\u0001\u0015".equals(characterRun.text()))) {
            return false;
        }
        return isBlockContainsInlineWordArt(characterRun.getPicOffset());
    }

    public boolean hasPicture(CharacterRun characterRun) {
        if (characterRun == null || !characterRun.isSpecialCharacter() || characterRun.isObj() || characterRun.isOle2() || characterRun.isData() || (!"\u0001".equals(characterRun.text()) && !"\u0001\u0015".equals(characterRun.text()))) {
            return false;
        }
        return isBlockContainsImage(characterRun.getPicOffset());
    }

    public PicturesTable(HWPFDocument hWPFDocument, byte[] bArr, byte[] bArr2) {
        this._document = hWPFDocument;
        this._dataStream = bArr;
        this._mainStream = bArr2;
    }
}
