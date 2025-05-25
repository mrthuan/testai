package lib.zj.office.fc.hslf.record;

import java.util.Hashtable;

/* loaded from: classes3.dex */
public abstract class PositionDependentRecordAtom extends RecordAtom implements PositionDependentRecord {
    protected int myLastOnDiskOffset;

    @Override // lib.zj.office.fc.hslf.record.PositionDependentRecord
    public int getLastOnDiskOffset() {
        return this.myLastOnDiskOffset;
    }

    @Override // lib.zj.office.fc.hslf.record.PositionDependentRecord
    public void setLastOnDiskOffset(int i10) {
        this.myLastOnDiskOffset = i10;
    }

    public abstract void updateOtherRecordReferences(Hashtable<Integer, Integer> hashtable);
}
