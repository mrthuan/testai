package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class IterationRecord extends StandardRecord {
    private static final BitField iterationOn = BitFieldFactory.getInstance(1);
    public static final short sid = 17;
    private int _flags;

    public IterationRecord(boolean z10) {
        this._flags = iterationOn.setBoolean(0, z10);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return new IterationRecord(getIteration());
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public boolean getIteration() {
        return iterationOn.isSet(this._flags);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 17;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this._flags);
    }

    public void setIteration(boolean z10) {
        this._flags = iterationOn.setBoolean(this._flags, z10);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[ITERATION]\n    .flags      = ");
        stringBuffer.append(HexDump.shortToHex(this._flags));
        stringBuffer.append("\n[/ITERATION]\n");
        return stringBuffer.toString();
    }

    public IterationRecord(RecordInputStream recordInputStream) {
        this._flags = recordInputStream.readShort();
    }
}
