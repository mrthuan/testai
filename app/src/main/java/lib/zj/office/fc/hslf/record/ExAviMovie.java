package lib.zj.office.fc.hslf.record;

/* loaded from: classes3.dex */
public final class ExAviMovie extends ExMCIMovie {
    public ExAviMovie(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11);
    }

    @Override // lib.zj.office.fc.hslf.record.ExMCIMovie, lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.ExAviMovie.typeID;
    }

    public ExAviMovie() {
    }
}
