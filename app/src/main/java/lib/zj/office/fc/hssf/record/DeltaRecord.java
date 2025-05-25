package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class DeltaRecord extends StandardRecord {
    public static final double DEFAULT_VALUE = 0.001d;
    public static final short sid = 16;
    private double field_1_max_change;

    public DeltaRecord(double d10) {
        this.field_1_max_change = d10;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 8;
    }

    public double getMaxChange() {
        return this.field_1_max_change;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 16;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeDouble(getMaxChange());
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[DELTA]\n    .maxchange = ");
        stringBuffer.append(getMaxChange());
        stringBuffer.append("\n[/DELTA]\n");
        return stringBuffer.toString();
    }

    public DeltaRecord(RecordInputStream recordInputStream) {
        this.field_1_max_change = recordInputStream.readDouble();
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return this;
    }
}
