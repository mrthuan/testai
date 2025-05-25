package lib.zj.office.fc.hslf.record;

import java.io.OutputStream;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class OutlineTextRefAtom extends RecordAtom {
    private byte[] _header;
    private int _index;

    public OutlineTextRefAtom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this._index = LittleEndian.getInt(bArr, i10 + 8);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.OutlineTextRefAtom.typeID;
    }

    public int getTextIndex() {
        return this._index;
    }

    public void setTextIndex(int i10) {
        this._index = i10;
    }

    public void writeOut(OutputStream outputStream) {
        outputStream.write(this._header);
        byte[] bArr = new byte[4];
        LittleEndian.putInt(bArr, 0, this._index);
        outputStream.write(bArr);
    }

    public OutlineTextRefAtom() {
        this._index = 0;
        byte[] bArr = new byte[8];
        this._header = bArr;
        LittleEndian.putUShort(bArr, 0, 0);
        LittleEndian.putUShort(this._header, 2, (int) getRecordType());
        LittleEndian.putInt(this._header, 4, 4);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}
