package lib.zj.office.fc.hslf.record;

import java.io.OutputStream;
import java.util.ArrayList;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class TextSpecInfoAtom extends RecordAtom {
    private byte[] _data;
    private byte[] _header;

    /* loaded from: classes3.dex */
    public static class TextSpecInfoRun {
        protected int len;
        protected int mask;
        protected short spellInfo = -1;
        protected short langId = -1;
        protected short altLangId = -1;

        public short getAltLangId() {
            return this.altLangId;
        }

        public short getLangId() {
            return this.spellInfo;
        }

        public short getSpellInfo() {
            return this.spellInfo;
        }

        public int length() {
            return this.len;
        }
    }

    public TextSpecInfoAtom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        int i12 = i11 - 8;
        byte[] bArr3 = new byte[i12];
        this._data = bArr3;
        System.arraycopy(bArr, i10 + 8, bArr3, 0, i12);
    }

    public int getCharactersCovered() {
        int i10 = 0;
        for (TextSpecInfoRun textSpecInfoRun : getTextSpecInfoRuns()) {
            i10 += textSpecInfoRun.len;
        }
        return i10;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.TextSpecInfoAtom.typeID;
    }

    public TextSpecInfoRun[] getTextSpecInfoRuns() {
        ArrayList arrayList = new ArrayList();
        int[] iArr = {1, 0, 2};
        int i10 = 0;
        while (i10 < this._data.length) {
            TextSpecInfoRun textSpecInfoRun = new TextSpecInfoRun();
            textSpecInfoRun.len = LittleEndian.getInt(this._data, i10);
            int i11 = i10 + 4;
            textSpecInfoRun.mask = LittleEndian.getInt(this._data, i11);
            i10 = i11 + 4;
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = textSpecInfoRun.mask;
                int i14 = iArr[i12];
                if ((i13 & (1 << i14)) != 0) {
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                textSpecInfoRun.altLangId = LittleEndian.getShort(this._data, i10);
                            }
                        } else {
                            textSpecInfoRun.langId = LittleEndian.getShort(this._data, i10);
                        }
                    } else {
                        textSpecInfoRun.spellInfo = LittleEndian.getShort(this._data, i10);
                    }
                    i10 += 2;
                }
            }
            arrayList.add(textSpecInfoRun);
        }
        return (TextSpecInfoRun[]) arrayList.toArray(new TextSpecInfoRun[arrayList.size()]);
    }

    public void reset(int i10) {
        byte[] bArr = new byte[10];
        this._data = bArr;
        LittleEndian.putInt(bArr, 0, i10);
        LittleEndian.putInt(this._data, 4, 1);
        LittleEndian.putShort(this._data, 8, (short) 0);
        LittleEndian.putInt(this._header, 4, this._data.length);
    }

    public void setTextSize(int i10) {
        LittleEndian.putInt(this._data, 0, i10);
    }

    public void writeOut(OutputStream outputStream) {
        outputStream.write(this._header);
        outputStream.write(this._data);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}
