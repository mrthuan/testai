package lib.zj.office.fc.hslf.record;

/* loaded from: classes3.dex */
public class TimeEffectBehaviorContainer extends PositionDependentRecordContainer {
    public static long RECORD_ID = 61741;
    private byte[] _header;

    public TimeEffectBehaviorContainer(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this._children = Record.findChildRecords(bArr, i10 + 8, i11 - 8);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RECORD_ID;
    }
}
