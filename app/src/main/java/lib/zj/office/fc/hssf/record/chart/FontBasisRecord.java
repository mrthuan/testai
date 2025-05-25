package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class FontBasisRecord extends StandardRecord {
    public static final short sid = 4192;
    private short field_1_xBasis;
    private short field_2_yBasis;
    private short field_3_heightBasis;
    private short field_4_scale;
    private short field_5_indexToFontTable;

    public FontBasisRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        FontBasisRecord fontBasisRecord = new FontBasisRecord();
        fontBasisRecord.field_1_xBasis = this.field_1_xBasis;
        fontBasisRecord.field_2_yBasis = this.field_2_yBasis;
        fontBasisRecord.field_3_heightBasis = this.field_3_heightBasis;
        fontBasisRecord.field_4_scale = this.field_4_scale;
        fontBasisRecord.field_5_indexToFontTable = this.field_5_indexToFontTable;
        return fontBasisRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 10;
    }

    public short getHeightBasis() {
        return this.field_3_heightBasis;
    }

    public short getIndexToFontTable() {
        return this.field_5_indexToFontTable;
    }

    public short getScale() {
        return this.field_4_scale;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public short getXBasis() {
        return this.field_1_xBasis;
    }

    public short getYBasis() {
        return this.field_2_yBasis;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_xBasis);
        littleEndianOutput.writeShort(this.field_2_yBasis);
        littleEndianOutput.writeShort(this.field_3_heightBasis);
        littleEndianOutput.writeShort(this.field_4_scale);
        littleEndianOutput.writeShort(this.field_5_indexToFontTable);
    }

    public void setHeightBasis(short s4) {
        this.field_3_heightBasis = s4;
    }

    public void setIndexToFontTable(short s4) {
        this.field_5_indexToFontTable = s4;
    }

    public void setScale(short s4) {
        this.field_4_scale = s4;
    }

    public void setXBasis(short s4) {
        this.field_1_xBasis = s4;
    }

    public void setYBasis(short s4) {
        this.field_2_yBasis = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[FBI]\n    .xBasis               = 0x");
        stringBuffer.append(HexDump.toHex(getXBasis()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getXBasis());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .yBasis               = 0x");
        stringBuffer.append(HexDump.toHex(getYBasis()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getYBasis());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .heightBasis          = 0x");
        stringBuffer.append(HexDump.toHex(getHeightBasis()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getHeightBasis());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .scale                = 0x");
        stringBuffer.append(HexDump.toHex(getScale()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getScale());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .indexToFontTable     = 0x");
        stringBuffer.append(HexDump.toHex(getIndexToFontTable()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getIndexToFontTable());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("[/FBI]\n");
        return stringBuffer.toString();
    }

    public FontBasisRecord(RecordInputStream recordInputStream) {
        this.field_1_xBasis = recordInputStream.readShort();
        this.field_2_yBasis = recordInputStream.readShort();
        this.field_3_heightBasis = recordInputStream.readShort();
        this.field_4_scale = recordInputStream.readShort();
        this.field_5_indexToFontTable = recordInputStream.readShort();
    }
}
