package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class SCLRecord extends StandardRecord {
    public static final short sid = 160;
    private short field_1_numerator;
    private short field_2_denominator;

    public SCLRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        SCLRecord sCLRecord = new SCLRecord();
        sCLRecord.field_1_numerator = this.field_1_numerator;
        sCLRecord.field_2_denominator = this.field_2_denominator;
        return sCLRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 4;
    }

    public short getDenominator() {
        return this.field_2_denominator;
    }

    public short getNumerator() {
        return this.field_1_numerator;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_numerator);
        littleEndianOutput.writeShort(this.field_2_denominator);
    }

    public void setDenominator(short s4) {
        this.field_2_denominator = s4;
    }

    public void setNumerator(short s4) {
        this.field_1_numerator = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[SCL]\n    .numerator            = 0x");
        stringBuffer.append(HexDump.toHex(getNumerator()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getNumerator());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .denominator          = 0x");
        stringBuffer.append(HexDump.toHex(getDenominator()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getDenominator());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("[/SCL]\n");
        return stringBuffer.toString();
    }

    public SCLRecord(RecordInputStream recordInputStream) {
        this.field_1_numerator = recordInputStream.readShort();
        this.field_2_denominator = recordInputStream.readShort();
    }
}
