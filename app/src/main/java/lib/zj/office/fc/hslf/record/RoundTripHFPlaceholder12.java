package lib.zj.office.fc.hslf.record;

/* loaded from: classes3.dex */
public final class RoundTripHFPlaceholder12 extends RecordAtom {
    private byte[] _header;
    private byte _placeholderId;

    public RoundTripHFPlaceholder12(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this._placeholderId = bArr[i10 + 8];
    }

    public int getPlaceholderId() {
        return this._placeholderId;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.RoundTripHFPlaceholder12.typeID;
    }

    public void setPlaceholderId(int i10) {
        this._placeholderId = (byte) i10;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}
