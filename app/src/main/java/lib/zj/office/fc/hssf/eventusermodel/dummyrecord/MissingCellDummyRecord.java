package lib.zj.office.fc.hssf.eventusermodel.dummyrecord;

/* loaded from: classes3.dex */
public final class MissingCellDummyRecord extends DummyRecordBase {
    private int column;
    private int row;

    public MissingCellDummyRecord(int i10, int i11) {
        this.row = i10;
        this.column = i11;
    }

    public int getColumn() {
        return this.column;
    }

    public int getRow() {
        return this.row;
    }

    @Override // lib.zj.office.fc.hssf.eventusermodel.dummyrecord.DummyRecordBase, lib.zj.office.fc.hssf.record.RecordBase
    public /* bridge */ /* synthetic */ int serialize(int i10, byte[] bArr) {
        return super.serialize(i10, bArr);
    }
}
