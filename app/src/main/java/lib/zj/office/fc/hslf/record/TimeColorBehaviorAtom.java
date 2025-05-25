package lib.zj.office.fc.hslf.record;

import java.util.Hashtable;

/* loaded from: classes3.dex */
public class TimeColorBehaviorAtom extends PositionDependentRecordAtom {
    private static long _type = 61749;
    private byte[] _header;
    private int flag;

    public TimeColorBehaviorAtom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }

    @Override // lib.zj.office.fc.hslf.record.PositionDependentRecordAtom, lib.zj.office.fc.hslf.record.PositionDependentRecord
    public void updateOtherRecordReferences(Hashtable<Integer, Integer> hashtable) {
    }
}
