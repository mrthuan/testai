package lib.zj.office.fc.hslf.record;

/* loaded from: classes3.dex */
public class TimeColorBehaviorContainer extends PositionDependentRecordContainer {
    public static long RECORD_ID = 61740;
    private byte[] _header;
    private TimeColorBehaviorAtom colorBehaviorAtom;

    public TimeColorBehaviorContainer(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        int i12 = i10 + 8;
        this.colorBehaviorAtom = new TimeColorBehaviorAtom(bArr, i12, 60);
        this._children = Record.findChildRecords(bArr, i12, i11 - 8);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RECORD_ID;
    }
}
