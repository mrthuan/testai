package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class PaneRecord extends StandardRecord {
    public static final short ACTIVE_PANE_LOWER_LEFT = 2;
    public static final short ACTIVE_PANE_LOWER_RIGHT = 0;
    public static final short ACTIVE_PANE_UPER_LEFT = 3;
    public static final short ACTIVE_PANE_UPPER_LEFT = 3;
    public static final short ACTIVE_PANE_UPPER_RIGHT = 1;
    public static final short sid = 65;
    private short field_1_x;
    private short field_2_y;
    private short field_3_topRow;
    private short field_4_leftColumn;
    private short field_5_activePane;

    public PaneRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        PaneRecord paneRecord = new PaneRecord();
        paneRecord.field_1_x = this.field_1_x;
        paneRecord.field_2_y = this.field_2_y;
        paneRecord.field_3_topRow = this.field_3_topRow;
        paneRecord.field_4_leftColumn = this.field_4_leftColumn;
        paneRecord.field_5_activePane = this.field_5_activePane;
        return paneRecord;
    }

    public short getActivePane() {
        return this.field_5_activePane;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 10;
    }

    public short getLeftColumn() {
        return this.field_4_leftColumn;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 65;
    }

    public short getTopRow() {
        return this.field_3_topRow;
    }

    public short getX() {
        return this.field_1_x;
    }

    public short getY() {
        return this.field_2_y;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_x);
        littleEndianOutput.writeShort(this.field_2_y);
        littleEndianOutput.writeShort(this.field_3_topRow);
        littleEndianOutput.writeShort(this.field_4_leftColumn);
        littleEndianOutput.writeShort(this.field_5_activePane);
    }

    public void setActivePane(short s4) {
        this.field_5_activePane = s4;
    }

    public void setLeftColumn(short s4) {
        this.field_4_leftColumn = s4;
    }

    public void setTopRow(short s4) {
        this.field_3_topRow = s4;
    }

    public void setX(short s4) {
        this.field_1_x = s4;
    }

    public void setY(short s4) {
        this.field_2_y = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[PANE]\n    .x                    = 0x");
        stringBuffer.append(HexDump.toHex(getX()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getX());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .y                    = 0x");
        stringBuffer.append(HexDump.toHex(getY()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getY());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .topRow               = 0x");
        stringBuffer.append(HexDump.toHex(getTopRow()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getTopRow());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .leftColumn           = 0x");
        stringBuffer.append(HexDump.toHex(getLeftColumn()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getLeftColumn());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .activePane           = 0x");
        stringBuffer.append(HexDump.toHex(getActivePane()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getActivePane());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("[/PANE]\n");
        return stringBuffer.toString();
    }

    public PaneRecord(RecordInputStream recordInputStream) {
        this.field_1_x = recordInputStream.readShort();
        this.field_2_y = recordInputStream.readShort();
        this.field_3_topRow = recordInputStream.readShort();
        this.field_4_leftColumn = recordInputStream.readShort();
        this.field_5_activePane = recordInputStream.readShort();
    }
}
