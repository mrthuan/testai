package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class DataFormatRecord extends StandardRecord {
    public static final short sid = 4102;
    private static final BitField useExcel4Colors = BitFieldFactory.getInstance(1);
    private short field_1_pointNumber;
    private short field_2_seriesIndex;
    private short field_3_seriesNumber;
    private short field_4_formatFlags;

    public DataFormatRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        DataFormatRecord dataFormatRecord = new DataFormatRecord();
        dataFormatRecord.field_1_pointNumber = this.field_1_pointNumber;
        dataFormatRecord.field_2_seriesIndex = this.field_2_seriesIndex;
        dataFormatRecord.field_3_seriesNumber = this.field_3_seriesNumber;
        dataFormatRecord.field_4_formatFlags = this.field_4_formatFlags;
        return dataFormatRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 8;
    }

    public short getFormatFlags() {
        return this.field_4_formatFlags;
    }

    public short getPointNumber() {
        return this.field_1_pointNumber;
    }

    public short getSeriesIndex() {
        return this.field_2_seriesIndex;
    }

    public short getSeriesNumber() {
        return this.field_3_seriesNumber;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public boolean isUseExcel4Colors() {
        return useExcel4Colors.isSet(this.field_4_formatFlags);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_pointNumber);
        littleEndianOutput.writeShort(this.field_2_seriesIndex);
        littleEndianOutput.writeShort(this.field_3_seriesNumber);
        littleEndianOutput.writeShort(this.field_4_formatFlags);
    }

    public void setFormatFlags(short s4) {
        this.field_4_formatFlags = s4;
    }

    public void setPointNumber(short s4) {
        this.field_1_pointNumber = s4;
    }

    public void setSeriesIndex(short s4) {
        this.field_2_seriesIndex = s4;
    }

    public void setSeriesNumber(short s4) {
        this.field_3_seriesNumber = s4;
    }

    public void setUseExcel4Colors(boolean z10) {
        this.field_4_formatFlags = useExcel4Colors.setShortBoolean(this.field_4_formatFlags, z10);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[DATAFORMAT]\n    .pointNumber          = 0x");
        stringBuffer.append(HexDump.toHex(getPointNumber()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getPointNumber());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .seriesIndex          = 0x");
        stringBuffer.append(HexDump.toHex(getSeriesIndex()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getSeriesIndex());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .seriesNumber         = 0x");
        stringBuffer.append(HexDump.toHex(getSeriesNumber()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getSeriesNumber());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .formatFlags          = 0x");
        stringBuffer.append(HexDump.toHex(getFormatFlags()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getFormatFlags());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("         .useExcel4Colors          = ");
        stringBuffer.append(isUseExcel4Colors());
        stringBuffer.append("\n[/DATAFORMAT]\n");
        return stringBuffer.toString();
    }

    public DataFormatRecord(RecordInputStream recordInputStream) {
        this.field_1_pointNumber = recordInputStream.readShort();
        this.field_2_seriesIndex = recordInputStream.readShort();
        this.field_3_seriesNumber = recordInputStream.readShort();
        this.field_4_formatFlags = recordInputStream.readShort();
    }
}
