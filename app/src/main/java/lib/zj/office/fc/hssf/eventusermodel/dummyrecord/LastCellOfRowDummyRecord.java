package lib.zj.office.fc.hssf.eventusermodel.dummyrecord;

/* loaded from: classes3.dex */
public final class LastCellOfRowDummyRecord extends DummyRecordBase {
    private int lastColumnNumber;
    private int row;

    public LastCellOfRowDummyRecord(int i10, int i11) {
        this.row = i10;
        this.lastColumnNumber = i11;
    }

    public int getLastColumnNumber() {
        return this.lastColumnNumber;
    }

    public int getRow() {
        return this.row;
    }

    @Override // lib.zj.office.fc.hssf.eventusermodel.dummyrecord.DummyRecordBase, lib.zj.office.fc.hssf.record.RecordBase
    public /* bridge */ /* synthetic */ int serialize(int i10, byte[] bArr) {
        return super.serialize(i10, bArr);
    }
}
