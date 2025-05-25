package lib.zj.office.fc.hslf.record;

import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class ExtendedParagraphHeaderAtom extends RecordAtom {
    private static long _type = 4015;
    private byte[] _header;
    private int refSlideID;
    private int textType;

    public ExtendedParagraphHeaderAtom(byte[] bArr, int i10, int i11) {
        i11 = i11 < 8 ? 8 : i11;
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        if (i11 >= 16) {
            this.refSlideID = LittleEndian.getInt(bArr, i10 + 8);
            this.textType = LittleEndian.getInt(bArr, i10 + 12);
        }
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    public int getRefSlideID() {
        return this.refSlideID;
    }

    public int getTextType() {
        return this.textType;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}
