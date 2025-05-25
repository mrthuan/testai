package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class StyleRecord extends StandardRecord {
    public static final short sid = 659;
    private int field_1_xf_index;
    private int field_2_builtin_style;
    private int field_3_outline_style_level;
    private boolean field_3_stringHasMultibyte;
    private String field_4_name;
    private static final BitField styleIndexMask = BitFieldFactory.getInstance(4095);
    private static final BitField isBuiltinFlag = BitFieldFactory.getInstance(Variant.VT_RESERVED);

    public StyleRecord() {
        this.field_1_xf_index = isBuiltinFlag.set(this.field_1_xf_index);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        int i10;
        if (isBuiltin()) {
            return 4;
        }
        int length = this.field_4_name.length();
        if (this.field_3_stringHasMultibyte) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        return (length * i10) + 5;
    }

    public String getName() {
        return this.field_4_name;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public int getXFIndex() {
        return styleIndexMask.getValue(this.field_1_xf_index);
    }

    public boolean isBuiltin() {
        return isBuiltinFlag.isSet(this.field_1_xf_index);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_xf_index);
        if (isBuiltin()) {
            littleEndianOutput.writeByte(this.field_2_builtin_style);
            littleEndianOutput.writeByte(this.field_3_outline_style_level);
            return;
        }
        littleEndianOutput.writeShort(this.field_4_name.length());
        littleEndianOutput.writeByte(this.field_3_stringHasMultibyte ? 1 : 0);
        if (this.field_3_stringHasMultibyte) {
            StringUtil.putUnicodeLE(getName(), littleEndianOutput);
        } else {
            StringUtil.putCompressedUnicode(getName(), littleEndianOutput);
        }
    }

    public void setBuiltinStyle(int i10) {
        this.field_1_xf_index = isBuiltinFlag.set(this.field_1_xf_index);
        this.field_2_builtin_style = i10;
    }

    public void setName(String str) {
        this.field_4_name = str;
        this.field_3_stringHasMultibyte = StringUtil.hasMultibyte(str);
        this.field_1_xf_index = isBuiltinFlag.clear(this.field_1_xf_index);
    }

    public void setOutlineStyleLevel(int i10) {
        this.field_3_outline_style_level = i10 & FunctionEval.FunctionID.EXTERNAL_FUNC;
    }

    public void setXFIndex(int i10) {
        this.field_1_xf_index = styleIndexMask.setValue(this.field_1_xf_index, i10);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer("[STYLE]\n    .xf_index_raw =");
        stringBuffer.append(HexDump.shortToHex(this.field_1_xf_index));
        stringBuffer.append("\n        .type     =");
        if (isBuiltin()) {
            str = "built-in";
        } else {
            str = "user-defined";
        }
        stringBuffer.append(str);
        stringBuffer.append("\n        .xf_index =");
        stringBuffer.append(HexDump.shortToHex(getXFIndex()));
        stringBuffer.append("\n");
        if (isBuiltin()) {
            stringBuffer.append("    .builtin_style=");
            stringBuffer.append(HexDump.byteToHex(this.field_2_builtin_style));
            stringBuffer.append("\n    .outline_level=");
            stringBuffer.append(HexDump.byteToHex(this.field_3_outline_style_level));
            stringBuffer.append("\n");
        } else {
            stringBuffer.append("    .name        =");
            stringBuffer.append(getName());
            stringBuffer.append("\n");
        }
        stringBuffer.append("[/STYLE]\n");
        return stringBuffer.toString();
    }

    public StyleRecord(RecordInputStream recordInputStream) {
        this.field_1_xf_index = recordInputStream.readShort();
        if (isBuiltin()) {
            this.field_2_builtin_style = recordInputStream.readByte();
            this.field_3_outline_style_level = recordInputStream.readByte();
            return;
        }
        short readShort = recordInputStream.readShort();
        if (recordInputStream.remaining() < 1) {
            if (readShort == 0) {
                this.field_4_name = "";
                return;
            }
            throw new RecordFormatException("Ran out of data reading style record");
        }
        boolean z10 = recordInputStream.readByte() != 0;
        this.field_3_stringHasMultibyte = z10;
        if (z10) {
            this.field_4_name = StringUtil.readUnicodeLE(recordInputStream, readShort);
        } else {
            this.field_4_name = StringUtil.readCompressedUnicode(recordInputStream, readShort);
        }
    }
}
