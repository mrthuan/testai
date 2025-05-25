package lib.zj.office.fc.hwpf.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lib.zj.office.fc.hwpf.model.io.HWPFOutputStream;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class PAPFormattedDiskPage extends FormattedDiskPage {
    private static final int BX_SIZE = 13;
    private static final int FC_SIZE = 4;
    private ArrayList<PAPX> _overFlow;
    private ArrayList<PAPX> _papxList;

    public PAPFormattedDiskPage(byte[] bArr) {
        this();
    }

    private ParagraphHeight getParagraphHeight(int i10) {
        int i11 = (i10 * 13) + ((this._crun + 1) * 4);
        return new ParagraphHeight(this._fkp, i11 + this._offset + 1);
    }

    public void fill(List<PAPX> list) {
        this._papxList.addAll(list);
    }

    @Override // lib.zj.office.fc.hwpf.model.FormattedDiskPage
    public byte[] getGrpprl(int i10) {
        int i11;
        int unsignedByte = LittleEndian.getUnsignedByte(this._fkp, (i10 * 13) + ((this._crun + 1) * 4) + this._offset) * 2;
        int unsignedByte2 = LittleEndian.getUnsignedByte(this._fkp, this._offset + unsignedByte) * 2;
        if (unsignedByte2 == 0) {
            unsignedByte++;
            i11 = LittleEndian.getUnsignedByte(this._fkp, this._offset + unsignedByte) * 2;
        } else {
            i11 = unsignedByte2 - 1;
        }
        byte[] bArr = new byte[i11];
        System.arraycopy(this._fkp, unsignedByte + 1 + this._offset, bArr, 0, i11);
        return bArr;
    }

    public ArrayList<PAPX> getOverflow() {
        return this._overFlow;
    }

    public PAPX getPAPX(int i10) {
        return this._papxList.get(i10);
    }

    public List<PAPX> getPAPXs() {
        return Collections.unmodifiableList(this._papxList);
    }

    public byte[] toByteArray(HWPFOutputStream hWPFOutputStream, CharIndexTranslator charIndexTranslator) {
        int i10;
        int i11;
        byte[] bArr;
        int i12;
        int i13;
        int i14;
        PAPFormattedDiskPage pAPFormattedDiskPage = this;
        byte[] bArr2 = new byte[512];
        int size = pAPFormattedDiskPage._papxList.size();
        byte[] bArr3 = new byte[0];
        int i15 = 0;
        int i16 = 4;
        while (true) {
            i10 = 488;
            i11 = 511;
            if (i15 >= size) {
                break;
            }
            byte[] grpprl = pAPFormattedDiskPage._papxList.get(i15).getGrpprl();
            int length = grpprl.length;
            if (length > 488) {
                length = 8;
            }
            if (!Arrays.equals(grpprl, bArr3)) {
                i14 = length + 17 + 1;
            } else {
                i14 = 17;
            }
            int i17 = i16 + i14;
            if (i17 > (i15 % 2) + 511) {
                break;
            }
            if (length % 2 > 0) {
                i16 = i17 + 1;
            } else {
                i16 = i17 + 2;
            }
            i15++;
            bArr3 = grpprl;
        }
        if (i15 != size) {
            ArrayList<PAPX> arrayList = new ArrayList<>();
            pAPFormattedDiskPage._overFlow = arrayList;
            arrayList.addAll(pAPFormattedDiskPage._papxList.subList(i15, size));
        }
        bArr2[511] = (byte) i15;
        int i18 = (i15 * 4) + 4;
        byte[] bArr4 = new byte[0];
        PAPX papx = null;
        int i19 = 0;
        int i20 = 0;
        while (i19 < i15) {
            papx = pAPFormattedDiskPage._papxList.get(i19);
            byte[] byteArray = papx.getParagraphHeight().toByteArray();
            byte[] grpprl2 = papx.getGrpprl();
            if (grpprl2.length > i10) {
                byte[] bArr5 = new byte[grpprl2.length - 2];
                System.arraycopy(grpprl2, 2, bArr5, 0, grpprl2.length - 2);
                int offset = hWPFOutputStream.getOffset();
                hWPFOutputStream.write(bArr5);
                bArr = new byte[8];
                LittleEndian.putUShort(bArr, 0, LittleEndian.getUShort(grpprl2, 0));
                i12 = 2;
                LittleEndian.putUShort(bArr, 2, 26182);
                LittleEndian.putInt(bArr, 4, offset);
            } else {
                bArr = grpprl2;
                i12 = 2;
            }
            boolean equals = Arrays.equals(bArr4, bArr);
            if (!equals) {
                int length2 = i11 - ((2 - (bArr.length % i12)) + bArr.length);
                i11 = length2 - (length2 % 2);
            }
            LittleEndian.putInt(bArr2, i20, charIndexTranslator.getByteIndex(papx.getStart()));
            bArr2[i18] = (byte) (i11 / 2);
            System.arraycopy(byteArray, 0, bArr2, i18 + 1, byteArray.length);
            if (!equals) {
                if (bArr.length % 2 > 0) {
                    i13 = i11 + 1;
                    bArr2[i11] = (byte) ((bArr.length + 1) / 2);
                } else {
                    int i21 = i11 + 1;
                    bArr2[i21] = (byte) (bArr.length / 2);
                    i13 = i21 + 1;
                }
                System.arraycopy(bArr, 0, bArr2, i13, bArr.length);
                bArr4 = bArr;
            }
            i18 += 13;
            i20 += 4;
            i19++;
            pAPFormattedDiskPage = this;
            i10 = 488;
        }
        LittleEndian.putInt(bArr2, i20, charIndexTranslator.getByteIndex(papx.getEnd()));
        return bArr2;
    }

    public PAPFormattedDiskPage() {
        this._papxList = new ArrayList<>();
    }

    public PAPFormattedDiskPage(byte[] bArr, byte[] bArr2, int i10, int i11, TextPieceTable textPieceTable) {
        this(bArr, bArr2, i10, textPieceTable);
    }

    public PAPFormattedDiskPage(byte[] bArr, byte[] bArr2, int i10, CharIndexTranslator charIndexTranslator) {
        super(bArr, i10);
        this._papxList = new ArrayList<>();
        for (int i11 = 0; i11 < this._crun; i11++) {
            int start = getStart(i11);
            int end = getEnd(i11);
            int charIndex = charIndexTranslator.getCharIndex(start);
            int charIndex2 = charIndexTranslator.getCharIndex(end, charIndex);
            if (charIndex <= charIndex2) {
                this._papxList.add(new PAPX(charIndex, charIndex2, getGrpprl(i11), getParagraphHeight(i11), bArr2));
            }
        }
        this._crun = this._papxList.size();
        this._fkp = null;
    }
}
