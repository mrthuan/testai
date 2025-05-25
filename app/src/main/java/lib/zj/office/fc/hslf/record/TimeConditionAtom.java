package lib.zj.office.fc.hslf.record;

import java.util.Hashtable;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class TimeConditionAtom extends PositionDependentRecordAtom {
    public static final int TOT_None = 0;
    public static final int TOT_RuntimeNodeRef = 3;
    public static final int TOT_TimeNode = 2;
    public static final int TOT_VisualElement = 1;
    private static long _type = 61736;
    private byte[] _header;
    private int delay;

    /* renamed from: id  reason: collision with root package name */
    private int f20665id;
    private int triggerEvent;
    private int triggerObject;

    public TimeConditionAtom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this.triggerObject = LittleEndian.getInt(bArr, i10 + 8);
        this.triggerEvent = LittleEndian.getInt(bArr, i10 + 12);
        this.f20665id = LittleEndian.getInt(bArr, i10 + 16);
        this.delay = LittleEndian.getInt(bArr, i10 + 20);
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
