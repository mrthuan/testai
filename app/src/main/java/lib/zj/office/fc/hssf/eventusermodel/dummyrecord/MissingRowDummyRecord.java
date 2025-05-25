package lib.zj.office.fc.hssf.eventusermodel.dummyrecord;

/* loaded from: classes3.dex */
public final class MissingRowDummyRecord extends DummyRecordBase {
    private int rowNumber;

    public MissingRowDummyRecord(int i10) {
        this.rowNumber = i10;
    }

    public int getRowNumber() {
        return this.rowNumber;
    }

    @Override // lib.zj.office.fc.hssf.eventusermodel.dummyrecord.DummyRecordBase, lib.zj.office.fc.hssf.record.RecordBase
    public /* bridge */ /* synthetic */ int serialize(int i10, byte[] bArr) {
        return super.serialize(i10, bArr);
    }
}
