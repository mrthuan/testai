package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class HideObjRecord extends StandardRecord {
    public static final short HIDE_ALL = 2;
    public static final short SHOW_ALL = 0;
    public static final short SHOW_PLACEHOLDERS = 1;
    public static final short sid = 141;
    private short field_1_hide_obj;

    public HideObjRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public short getHideObj() {
        return this.field_1_hide_obj;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(getHideObj());
    }

    public void setHideObj(short s4) {
        this.field_1_hide_obj = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[HIDEOBJ]\n    .hideobj         = ");
        stringBuffer.append(Integer.toHexString(getHideObj()));
        stringBuffer.append("\n[/HIDEOBJ]\n");
        return stringBuffer.toString();
    }

    public HideObjRecord(RecordInputStream recordInputStream) {
        this.field_1_hide_obj = recordInputStream.readShort();
    }
}
