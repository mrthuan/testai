package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class ObjectLinkRecord extends StandardRecord {
    public static final short ANCHOR_ID_CHART_TITLE = 1;
    public static final short ANCHOR_ID_SERIES_OR_POINT = 4;
    public static final short ANCHOR_ID_X_AXIS = 3;
    public static final short ANCHOR_ID_Y_AXIS = 2;
    public static final short ANCHOR_ID_Z_AXIS = 7;
    public static final short sid = 4135;
    private short field_1_anchorId;
    private short field_2_link1;
    private short field_3_link2;

    public ObjectLinkRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        ObjectLinkRecord objectLinkRecord = new ObjectLinkRecord();
        objectLinkRecord.field_1_anchorId = this.field_1_anchorId;
        objectLinkRecord.field_2_link1 = this.field_2_link1;
        objectLinkRecord.field_3_link2 = this.field_3_link2;
        return objectLinkRecord;
    }

    public short getAnchorId() {
        return this.field_1_anchorId;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 6;
    }

    public short getLink1() {
        return this.field_2_link1;
    }

    public short getLink2() {
        return this.field_3_link2;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_anchorId);
        littleEndianOutput.writeShort(this.field_2_link1);
        littleEndianOutput.writeShort(this.field_3_link2);
    }

    public void setAnchorId(short s4) {
        this.field_1_anchorId = s4;
    }

    public void setLink1(short s4) {
        this.field_2_link1 = s4;
    }

    public void setLink2(short s4) {
        this.field_3_link2 = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[OBJECTLINK]\n    .anchorId             = 0x");
        stringBuffer.append(HexDump.toHex(getAnchorId()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getAnchorId());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .link1                = 0x");
        stringBuffer.append(HexDump.toHex(getLink1()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getLink1());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .link2                = 0x");
        stringBuffer.append(HexDump.toHex(getLink2()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getLink2());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("[/OBJECTLINK]\n");
        return stringBuffer.toString();
    }

    public ObjectLinkRecord(RecordInputStream recordInputStream) {
        this.field_1_anchorId = recordInputStream.readShort();
        this.field_2_link1 = recordInputStream.readShort();
        this.field_3_link2 = recordInputStream.readShort();
    }

    public ObjectLinkRecord(UnknownRecord unknownRecord) {
        if (unknownRecord.getSid() == 4135 && unknownRecord.getData().length == getDataSize()) {
            byte[] data = unknownRecord.getData();
            this.field_1_anchorId = LittleEndian.getShort(data, 0);
            this.field_2_link1 = LittleEndian.getShort(data, 2);
            this.field_3_link2 = LittleEndian.getShort(data, 4);
        }
    }
}
