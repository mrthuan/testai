package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class RowRecord extends StandardRecord {
    private static final int DEFAULT_HEIGHT_BIT = 32768;
    public static final int ENCODED_SIZE = 20;
    private static final int OPTION_BITS_ALWAYS_SET = 256;
    public static final short sid = 520;
    private int field_1_row_number;
    private int field_2_first_col;
    private int field_3_last_col;
    private short field_4_height;
    private short field_5_optimize;
    private short field_6_reserved;
    private int field_7_option_flags;
    private short field_8_xf_index;
    private static final BitField outlineLevel = BitFieldFactory.getInstance(7);
    private static final BitField colapsed = BitFieldFactory.getInstance(16);
    private static final BitField zeroHeight = BitFieldFactory.getInstance(32);
    private static final BitField badFontHeight = BitFieldFactory.getInstance(64);
    private static final BitField formatted = BitFieldFactory.getInstance(128);

    public RowRecord(int i10) {
        this.field_1_row_number = i10;
        this.field_4_height = (short) 255;
        this.field_5_optimize = (short) 0;
        this.field_6_reserved = (short) 0;
        this.field_7_option_flags = 256;
        this.field_8_xf_index = (short) 15;
        setEmpty();
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        RowRecord rowRecord = new RowRecord(this.field_1_row_number);
        rowRecord.field_2_first_col = this.field_2_first_col;
        rowRecord.field_3_last_col = this.field_3_last_col;
        rowRecord.field_4_height = this.field_4_height;
        rowRecord.field_5_optimize = this.field_5_optimize;
        rowRecord.field_6_reserved = this.field_6_reserved;
        rowRecord.field_7_option_flags = this.field_7_option_flags;
        rowRecord.field_8_xf_index = this.field_8_xf_index;
        return rowRecord;
    }

    public boolean getBadFontHeight() {
        return badFontHeight.isSet(this.field_7_option_flags);
    }

    public boolean getColapsed() {
        return colapsed.isSet(this.field_7_option_flags);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 16;
    }

    public int getFirstCol() {
        return this.field_2_first_col;
    }

    public boolean getFormatted() {
        return formatted.isSet(this.field_7_option_flags);
    }

    public short getHeight() {
        return this.field_4_height;
    }

    public int getLastCol() {
        return this.field_3_last_col;
    }

    public short getOptimize() {
        return this.field_5_optimize;
    }

    public short getOptionFlags() {
        return (short) this.field_7_option_flags;
    }

    public short getOutlineLevel() {
        return (short) outlineLevel.getValue(this.field_7_option_flags);
    }

    public int getRowNumber() {
        return this.field_1_row_number;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 520;
    }

    public short getXFIndex() {
        return this.field_8_xf_index;
    }

    public boolean getZeroHeight() {
        return zeroHeight.isSet(this.field_7_option_flags);
    }

    public boolean isEmpty() {
        if ((this.field_2_first_col | this.field_3_last_col) == 0) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        int firstCol;
        littleEndianOutput.writeShort(getRowNumber());
        int i10 = 0;
        if (getFirstCol() == -1) {
            firstCol = 0;
        } else {
            firstCol = getFirstCol();
        }
        littleEndianOutput.writeShort(firstCol);
        if (getLastCol() != -1) {
            i10 = getLastCol();
        }
        littleEndianOutput.writeShort(i10);
        littleEndianOutput.writeShort(getHeight());
        littleEndianOutput.writeShort(getOptimize());
        littleEndianOutput.writeShort(this.field_6_reserved);
        littleEndianOutput.writeShort(getOptionFlags());
        littleEndianOutput.writeShort(getXFIndex());
    }

    public void setBadFontHeight(boolean z10) {
        this.field_7_option_flags = badFontHeight.setBoolean(this.field_7_option_flags, z10);
    }

    public void setColapsed(boolean z10) {
        this.field_7_option_flags = colapsed.setBoolean(this.field_7_option_flags, z10);
    }

    public void setEmpty() {
        this.field_2_first_col = 0;
        this.field_3_last_col = 0;
    }

    public void setFirstCol(int i10) {
        this.field_2_first_col = i10;
    }

    public void setFormatted(boolean z10) {
        this.field_7_option_flags = formatted.setBoolean(this.field_7_option_flags, z10);
    }

    public void setHeight(short s4) {
        this.field_4_height = s4;
    }

    public void setLastCol(int i10) {
        this.field_3_last_col = i10;
    }

    public void setOptimize(short s4) {
        this.field_5_optimize = s4;
    }

    public void setOutlineLevel(short s4) {
        this.field_7_option_flags = outlineLevel.setValue(this.field_7_option_flags, s4);
    }

    public void setRowNumber(int i10) {
        this.field_1_row_number = i10;
    }

    public void setXFIndex(short s4) {
        this.field_8_xf_index = s4;
    }

    public void setZeroHeight(boolean z10) {
        this.field_7_option_flags = zeroHeight.setBoolean(this.field_7_option_flags, z10);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[ROW]\n    .rownumber      = ");
        stringBuffer.append(Integer.toHexString(getRowNumber()));
        stringBuffer.append("\n    .firstcol       = ");
        stringBuffer.append(HexDump.shortToHex(getFirstCol()));
        stringBuffer.append("\n    .lastcol        = ");
        stringBuffer.append(HexDump.shortToHex(getLastCol()));
        stringBuffer.append("\n    .height         = ");
        stringBuffer.append(HexDump.shortToHex(getHeight()));
        stringBuffer.append("\n    .optimize       = ");
        stringBuffer.append(HexDump.shortToHex(getOptimize()));
        stringBuffer.append("\n    .reserved       = ");
        stringBuffer.append(HexDump.shortToHex(this.field_6_reserved));
        stringBuffer.append("\n    .optionflags    = ");
        stringBuffer.append(HexDump.shortToHex(getOptionFlags()));
        stringBuffer.append("\n        .outlinelvl = ");
        stringBuffer.append(Integer.toHexString(getOutlineLevel()));
        stringBuffer.append("\n        .colapsed   = ");
        stringBuffer.append(getColapsed());
        stringBuffer.append("\n        .zeroheight = ");
        stringBuffer.append(getZeroHeight());
        stringBuffer.append("\n        .badfontheig= ");
        stringBuffer.append(getBadFontHeight());
        stringBuffer.append("\n        .formatted  = ");
        stringBuffer.append(getFormatted());
        stringBuffer.append("\n    .xfindex        = ");
        stringBuffer.append(Integer.toHexString(getXFIndex()));
        stringBuffer.append("\n[/ROW]\n");
        return stringBuffer.toString();
    }

    public RowRecord(RecordInputStream recordInputStream) {
        this.field_1_row_number = recordInputStream.readUShort();
        this.field_2_first_col = recordInputStream.readShort();
        this.field_3_last_col = recordInputStream.readShort();
        this.field_4_height = recordInputStream.readShort();
        this.field_5_optimize = recordInputStream.readShort();
        this.field_6_reserved = recordInputStream.readShort();
        this.field_7_option_flags = recordInputStream.readShort();
        this.field_8_xf_index = recordInputStream.readShort();
    }
}
