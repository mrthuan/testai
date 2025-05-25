package lib.zj.office.fc.hslf.record;

import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class UnknownRecordPlaceholder extends RecordAtom {
    private byte[] _contents;
    private long _type;

    public UnknownRecordPlaceholder(byte[] bArr, int i10, int i11) {
        i11 = i11 < 0 ? 0 : i11;
        byte[] bArr2 = new byte[i11];
        this._contents = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this._type = LittleEndian.getUShort(this._contents, 2);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return this._type;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}
