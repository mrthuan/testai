package lib.zj.office.fc.hslf.record;

import java.util.Hashtable;

/* loaded from: classes3.dex */
public abstract class PositionDependentRecordContainer extends RecordContainer implements PositionDependentRecord {
    protected int myLastOnDiskOffset;
    private int sheetId;

    @Override // lib.zj.office.fc.hslf.record.PositionDependentRecord
    public int getLastOnDiskOffset() {
        return this.myLastOnDiskOffset;
    }

    public int getSheetId() {
        return this.sheetId;
    }

    @Override // lib.zj.office.fc.hslf.record.PositionDependentRecord
    public void setLastOnDiskOffset(int i10) {
        this.myLastOnDiskOffset = i10;
    }

    public void setSheetId(int i10) {
        this.sheetId = i10;
    }

    @Override // lib.zj.office.fc.hslf.record.PositionDependentRecord
    public void updateOtherRecordReferences(Hashtable<Integer, Integer> hashtable) {
    }
}
