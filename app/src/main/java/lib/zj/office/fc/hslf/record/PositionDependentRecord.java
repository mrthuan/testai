package lib.zj.office.fc.hslf.record;

import java.util.Hashtable;

/* loaded from: classes3.dex */
public interface PositionDependentRecord {
    void dispose();

    int getLastOnDiskOffset();

    void setLastOnDiskOffset(int i10);

    void updateOtherRecordReferences(Hashtable<Integer, Integer> hashtable);
}
