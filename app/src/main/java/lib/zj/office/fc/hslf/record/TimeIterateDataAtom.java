package lib.zj.office.fc.hslf.record;

import java.util.Hashtable;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class TimeIterateDataAtom extends PositionDependentRecordAtom {
    private static long _type = 61760;
    private byte[] _header;
    private boolean fIterateDirectionPropertyUsed;
    private boolean fIterateIntervalPropertyUsed;
    private boolean fIterateIntervalTypePropertyUsed;
    private boolean fIterateTypePropertyUsed;
    private int iterateDirection;
    private int iterateInterval;
    private int iterateIntervalType;
    private int iterateType;
    private byte[] reserved;

    public TimeIterateDataAtom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this.iterateInterval = LittleEndian.getInt(bArr, i10 + 8);
        this.iterateType = LittleEndian.getInt(bArr, i10 + 12);
        this.iterateDirection = LittleEndian.getInt(bArr, i10 + 16);
        this.iterateIntervalType = LittleEndian.getInt(bArr, i10 + 20);
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
