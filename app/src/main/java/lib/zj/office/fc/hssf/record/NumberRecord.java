package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.ss.util.NumberToTextConverter;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class NumberRecord extends CellRecord {
    public static final short sid = 515;
    private double field_4_value;

    public NumberRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.CellRecord
    public void appendValueText(StringBuilder sb2) {
        sb2.append("  .value= ");
        sb2.append(NumberToTextConverter.toText(this.field_4_value));
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        NumberRecord numberRecord = new NumberRecord();
        copyBaseFields(numberRecord);
        numberRecord.field_4_value = this.field_4_value;
        return numberRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.CellRecord
    public String getRecordName() {
        return "NUMBER";
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 515;
    }

    public double getValue() {
        return this.field_4_value;
    }

    @Override // lib.zj.office.fc.hssf.record.CellRecord
    public int getValueDataSize() {
        return 8;
    }

    @Override // lib.zj.office.fc.hssf.record.CellRecord
    public void serializeValue(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeDouble(getValue());
    }

    public void setValue(double d10) {
        this.field_4_value = d10;
    }

    public NumberRecord(RecordInputStream recordInputStream) {
        super(recordInputStream);
        this.field_4_value = recordInputStream.readDouble();
    }
}
