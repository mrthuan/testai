package lib.zj.office.fc.hslf.record;

import java.io.OutputStream;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class ExControlAtom extends RecordAtom {
    private byte[] _header;
    private int _id;

    public ExControlAtom() {
        byte[] bArr = new byte[8];
        this._header = bArr;
        LittleEndian.putShort(bArr, 2, (short) getRecordType());
        LittleEndian.putInt(this._header, 4, 4);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.ExControlAtom.typeID;
    }

    public int getSlideId() {
        return this._id;
    }

    public void setSlideId(int i10) {
        this._id = i10;
    }

    public void writeOut(OutputStream outputStream) {
        outputStream.write(this._header);
        byte[] bArr = new byte[4];
        LittleEndian.putInt(bArr, this._id);
        outputStream.write(bArr);
    }

    public ExControlAtom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this._id = LittleEndian.getInt(bArr, i10 + 8);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}
