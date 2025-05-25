package lib.zj.office.fc.hslf.record;

import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class ExObjListAtom extends RecordAtom {
    private byte[] _data;
    private byte[] _header;

    public ExObjListAtom() {
        byte[] bArr = new byte[8];
        this._header = bArr;
        this._data = new byte[4];
        LittleEndian.putShort(bArr, 2, (short) getRecordType());
        LittleEndian.putInt(this._header, 4, this._data.length);
    }

    public long getObjectIDSeed() {
        return LittleEndian.getUInt(this._data, 0);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.ExObjListAtom.typeID;
    }

    public void setObjectIDSeed(int i10) {
        LittleEndian.putInt(this._data, 0, i10);
    }

    public ExObjListAtom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        int i12 = i11 - 8;
        byte[] bArr3 = new byte[i12];
        this._data = bArr3;
        System.arraycopy(bArr, i10 + 8, bArr3, 0, i12);
        if (this._data.length >= 4) {
            return;
        }
        throw new IllegalArgumentException("The length of the data for a ExObjListAtom must be at least 4 bytes, but was only " + this._data.length);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}
