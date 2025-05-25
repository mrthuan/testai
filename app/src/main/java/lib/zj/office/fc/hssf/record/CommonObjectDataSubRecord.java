package lib.zj.office.fc.hssf.record;

import a0.a;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class CommonObjectDataSubRecord extends SubRecord {
    public static final short OBJECT_TYPE_ARC = 4;
    public static final short OBJECT_TYPE_BUTTON = 7;
    public static final short OBJECT_TYPE_CHART = 5;
    public static final short OBJECT_TYPE_CHECKBOX = 11;
    public static final short OBJECT_TYPE_COMBO_BOX = 20;
    public static final short OBJECT_TYPE_COMMENT = 25;
    public static final short OBJECT_TYPE_DIALOG_BOX = 15;
    public static final short OBJECT_TYPE_EDIT_BOX = 13;
    public static final short OBJECT_TYPE_GROUP = 0;
    public static final short OBJECT_TYPE_GROUP_BOX = 19;
    public static final short OBJECT_TYPE_LABEL = 14;
    public static final short OBJECT_TYPE_LINE = 1;
    public static final short OBJECT_TYPE_LIST_BOX = 18;
    public static final short OBJECT_TYPE_MICROSOFT_OFFICE_DRAWING = 30;
    public static final short OBJECT_TYPE_OPTION_BUTTON = 12;
    public static final short OBJECT_TYPE_OVAL = 3;
    public static final short OBJECT_TYPE_PICTURE = 8;
    public static final short OBJECT_TYPE_POLYGON = 9;
    public static final short OBJECT_TYPE_RECTANGLE = 2;
    public static final short OBJECT_TYPE_RESERVED1 = 10;
    public static final short OBJECT_TYPE_RESERVED2 = 21;
    public static final short OBJECT_TYPE_RESERVED3 = 22;
    public static final short OBJECT_TYPE_RESERVED4 = 23;
    public static final short OBJECT_TYPE_RESERVED5 = 24;
    public static final short OBJECT_TYPE_RESERVED6 = 26;
    public static final short OBJECT_TYPE_RESERVED7 = 27;
    public static final short OBJECT_TYPE_RESERVED8 = 28;
    public static final short OBJECT_TYPE_RESERVED9 = 29;
    public static final short OBJECT_TYPE_SCROLL_BAR = 17;
    public static final short OBJECT_TYPE_SPINNER = 16;
    public static final short OBJECT_TYPE_TEXT = 6;
    public static final short sid = 21;
    private short field_1_objectType;
    private int field_2_objectId;
    private short field_3_option;
    private int field_4_reserved1;
    private int field_5_reserved2;
    private int field_6_reserved3;
    private static final BitField locked = BitFieldFactory.getInstance(1);
    private static final BitField printable = BitFieldFactory.getInstance(16);
    private static final BitField autofill = BitFieldFactory.getInstance(8192);
    private static final BitField autoline = BitFieldFactory.getInstance(16384);

    public CommonObjectDataSubRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.SubRecord
    public Object clone() {
        CommonObjectDataSubRecord commonObjectDataSubRecord = new CommonObjectDataSubRecord();
        commonObjectDataSubRecord.field_1_objectType = this.field_1_objectType;
        commonObjectDataSubRecord.field_2_objectId = this.field_2_objectId;
        commonObjectDataSubRecord.field_3_option = this.field_3_option;
        commonObjectDataSubRecord.field_4_reserved1 = this.field_4_reserved1;
        commonObjectDataSubRecord.field_5_reserved2 = this.field_5_reserved2;
        commonObjectDataSubRecord.field_6_reserved3 = this.field_6_reserved3;
        return commonObjectDataSubRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.SubRecord
    public int getDataSize() {
        return 18;
    }

    public int getObjectId() {
        return this.field_2_objectId;
    }

    public short getObjectType() {
        return this.field_1_objectType;
    }

    public short getOption() {
        return this.field_3_option;
    }

    public int getReserved1() {
        return this.field_4_reserved1;
    }

    public int getReserved2() {
        return this.field_5_reserved2;
    }

    public int getReserved3() {
        return this.field_6_reserved3;
    }

    public short getSid() {
        return (short) 21;
    }

    public boolean isAutofill() {
        return autofill.isSet(this.field_3_option);
    }

    public boolean isAutoline() {
        return autoline.isSet(this.field_3_option);
    }

    public boolean isLocked() {
        return locked.isSet(this.field_3_option);
    }

    public boolean isPrintable() {
        return printable.isSet(this.field_3_option);
    }

    @Override // lib.zj.office.fc.hssf.record.SubRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(21);
        littleEndianOutput.writeShort(getDataSize());
        littleEndianOutput.writeShort(this.field_1_objectType);
        littleEndianOutput.writeShort(this.field_2_objectId);
        littleEndianOutput.writeShort(this.field_3_option);
        littleEndianOutput.writeInt(this.field_4_reserved1);
        littleEndianOutput.writeInt(this.field_5_reserved2);
        littleEndianOutput.writeInt(this.field_6_reserved3);
    }

    public void setAutofill(boolean z10) {
        this.field_3_option = autofill.setShortBoolean(this.field_3_option, z10);
    }

    public void setAutoline(boolean z10) {
        this.field_3_option = autoline.setShortBoolean(this.field_3_option, z10);
    }

    public void setLocked(boolean z10) {
        this.field_3_option = locked.setShortBoolean(this.field_3_option, z10);
    }

    public void setObjectId(int i10) {
        this.field_2_objectId = i10;
    }

    public void setObjectType(short s4) {
        this.field_1_objectType = s4;
    }

    public void setOption(short s4) {
        this.field_3_option = s4;
    }

    public void setPrintable(boolean z10) {
        this.field_3_option = printable.setShortBoolean(this.field_3_option, z10);
    }

    public void setReserved1(int i10) {
        this.field_4_reserved1 = i10;
    }

    public void setReserved2(int i10) {
        this.field_5_reserved2 = i10;
    }

    public void setReserved3(int i10) {
        this.field_6_reserved3 = i10;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[ftCmo]\n    .objectType           = 0x");
        stringBuffer.append(HexDump.toHex(getObjectType()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getObjectType());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .objectId             = 0x");
        stringBuffer.append(HexDump.toHex(getObjectId()));
        stringBuffer.append(" (");
        stringBuffer.append(getObjectId());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .option               = 0x");
        stringBuffer.append(HexDump.toHex(getOption()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getOption());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("         .locked                   = ");
        stringBuffer.append(isLocked());
        stringBuffer.append("\n         .printable                = ");
        stringBuffer.append(isPrintable());
        stringBuffer.append("\n         .autofill                 = ");
        stringBuffer.append(isAutofill());
        stringBuffer.append("\n         .autoline                 = ");
        stringBuffer.append(isAutoline());
        stringBuffer.append("\n    .reserved1            = 0x");
        stringBuffer.append(HexDump.toHex(getReserved1()));
        stringBuffer.append(" (");
        stringBuffer.append(getReserved1());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .reserved2            = 0x");
        stringBuffer.append(HexDump.toHex(getReserved2()));
        stringBuffer.append(" (");
        stringBuffer.append(getReserved2());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .reserved3            = 0x");
        stringBuffer.append(HexDump.toHex(getReserved3()));
        stringBuffer.append(" (");
        stringBuffer.append(getReserved3());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("[/ftCmo]\n");
        return stringBuffer.toString();
    }

    public CommonObjectDataSubRecord(LittleEndianInput littleEndianInput, int i10) {
        if (i10 == 18) {
            this.field_1_objectType = littleEndianInput.readShort();
            this.field_2_objectId = littleEndianInput.readUShort();
            this.field_3_option = littleEndianInput.readShort();
            this.field_4_reserved1 = littleEndianInput.readInt();
            this.field_5_reserved2 = littleEndianInput.readInt();
            this.field_6_reserved3 = littleEndianInput.readInt();
            return;
        }
        throw new RecordFormatException(a.g("Expected size 18 but got (", i10, ")"));
    }
}
