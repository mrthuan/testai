package lib.zj.office.fc.hslf.record;

import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class TxInteractiveInfoAtom extends RecordAtom {
    private byte[] _data;
    private byte[] _header;

    public TxInteractiveInfoAtom() {
        byte[] bArr = new byte[8];
        this._header = bArr;
        this._data = new byte[8];
        LittleEndian.putShort(bArr, 2, (short) getRecordType());
        LittleEndian.putInt(this._header, 4, this._data.length);
    }

    public int getEndIndex() {
        return LittleEndian.getInt(this._data, 4);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.TxInteractiveInfoAtom.typeID;
    }

    public int getStartIndex() {
        return LittleEndian.getInt(this._data, 0);
    }

    public void setEndIndex(int i10) {
        LittleEndian.putInt(this._data, 4, i10);
    }

    public void setStartIndex(int i10) {
        LittleEndian.putInt(this._data, 0, i10);
    }

    public TxInteractiveInfoAtom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        int i12 = i11 - 8;
        byte[] bArr3 = new byte[i12];
        this._data = bArr3;
        System.arraycopy(bArr, i10 + 8, bArr3, 0, i12);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}
