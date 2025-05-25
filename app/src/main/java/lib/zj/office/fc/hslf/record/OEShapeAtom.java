package lib.zj.office.fc.hslf.record;

import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class OEShapeAtom extends RecordAtom {
    private byte[] _header;
    private byte[] _recdata;

    public OEShapeAtom() {
        this._recdata = new byte[4];
        byte[] bArr = new byte[8];
        this._header = bArr;
        LittleEndian.putShort(bArr, 2, (short) getRecordType());
        LittleEndian.putInt(this._header, 4, this._recdata.length);
    }

    public int getOptions() {
        return LittleEndian.getInt(this._recdata, 0);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.OEShapeAtom.typeID;
    }

    public void setOptions(int i10) {
        LittleEndian.putInt(this._recdata, 0, i10);
    }

    public OEShapeAtom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        int i12 = i11 - 8;
        byte[] bArr3 = new byte[i12];
        this._recdata = bArr3;
        System.arraycopy(bArr, i10 + 8, bArr3, 0, i12);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}
