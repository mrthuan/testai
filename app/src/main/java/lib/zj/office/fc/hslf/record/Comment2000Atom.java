package lib.zj.office.fc.hslf.record;

import java.io.OutputStream;
import java.util.Date;
import lib.zj.office.fc.hslf.util.SystemTimeUtils;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class Comment2000Atom extends RecordAtom {
    private byte[] _data;
    private byte[] _header;

    public Comment2000Atom() {
        byte[] bArr = new byte[8];
        this._header = bArr;
        this._data = new byte[28];
        LittleEndian.putShort(bArr, 2, (short) getRecordType());
        LittleEndian.putInt(this._header, 4, this._data.length);
    }

    public Date getDate() {
        return SystemTimeUtils.getDate(this._data, 4);
    }

    public int getNumber() {
        return LittleEndian.getInt(this._data, 0);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.Comment2000Atom.typeID;
    }

    public int getXOffset() {
        return LittleEndian.getInt(this._data, 20);
    }

    public int getYOffset() {
        return LittleEndian.getInt(this._data, 24);
    }

    public void setDate(Date date) {
        SystemTimeUtils.storeDate(date, this._data, 4);
    }

    public void setNumber(int i10) {
        LittleEndian.putInt(this._data, 0, i10);
    }

    public void setXOffset(int i10) {
        LittleEndian.putInt(this._data, 20, i10);
    }

    public void setYOffset(int i10) {
        LittleEndian.putInt(this._data, 24, i10);
    }

    public void writeOut(OutputStream outputStream) {
        outputStream.write(this._header);
        outputStream.write(this._data);
    }

    public Comment2000Atom(byte[] bArr, int i10, int i11) {
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
