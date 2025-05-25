package lib.zj.office.fc.hslf.record;

import java.util.Hashtable;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class TimeNodeAtom extends PositionDependentRecordAtom {
    public static final int TNT_Behavior = 2;
    public static final int TNT_Parallel = 0;
    public static final int TNT_Sequential = 1;
    public static final int TNT__Media = 3;
    private static long _type = 61735;
    private byte[] _header;
    private int duration;
    private boolean fDurationProperty;
    private boolean fFillProperty;
    private boolean fGroupingTypeProperty;
    private boolean fRestartProperty;
    private int fill;
    private int reserved1;
    private int reserved2;
    private byte reserved3;
    private boolean reserved4;
    private byte[] reserved5;
    private int restart;
    private int timeNodeType;
    private int unused;

    public TimeNodeAtom(byte[] bArr, int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this.reserved1 = LittleEndian.getInt(bArr, i10 + 8);
        this.restart = LittleEndian.getInt(bArr, i10 + 12);
        this.timeNodeType = LittleEndian.getInt(bArr, i10 + 16);
        this.fill = LittleEndian.getInt(bArr, i10 + 20);
        this.duration = LittleEndian.getInt(bArr, i10 + 32);
        byte b10 = bArr[i10 + 36];
        if (((b10 & 16) >> 4) > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.fDurationProperty = z10;
        if (((b10 & 8) >> 3) > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.fGroupingTypeProperty = z11;
        if (((b10 & 2) >> 1) > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.fRestartProperty = z12;
        this.fFillProperty = (b10 & 1) > 0;
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
