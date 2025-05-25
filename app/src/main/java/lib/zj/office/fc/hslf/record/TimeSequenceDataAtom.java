package lib.zj.office.fc.hslf.record;

import java.util.Hashtable;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class TimeSequenceDataAtom extends PositionDependentRecordAtom {
    private static long _type = 61761;
    private byte[] _header;
    private int concurrency;
    private boolean fConcurrencyPropertyUsed;
    private boolean fNextActionPropertyUsed;
    private boolean fPreviousActionPropertyUsed;
    private int nextAction;
    private int previousAction;
    private int reserved1;
    private byte[] reserved2;

    public TimeSequenceDataAtom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this.concurrency = LittleEndian.getInt(bArr, i10 + 8);
        this.nextAction = LittleEndian.getInt(bArr, i10 + 12);
        this.previousAction = LittleEndian.getInt(bArr, i10 + 16);
        this.reserved1 = LittleEndian.getInt(bArr, i10 + 20);
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
