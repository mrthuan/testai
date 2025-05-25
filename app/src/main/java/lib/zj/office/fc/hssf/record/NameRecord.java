package lib.zj.office.fc.hssf.record;

import androidx.activity.r;
import com.tom_roush.fontbox.ttf.OpenTypeScript;
import lib.zj.office.fc.hssf.formula.Formula;
import lib.zj.office.fc.hssf.formula.ptg.Area3DPtg;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.formula.ptg.Ref3DPtg;
import lib.zj.office.fc.hssf.record.cont.ContinuableRecord;
import lib.zj.office.fc.hssf.record.cont.ContinuableRecordOutput;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianByteArrayInputStream;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class NameRecord extends ContinuableRecord {
    public static final byte BUILTIN_AUTO_ACTIVATE = 10;
    public static final byte BUILTIN_AUTO_CLOSE = 3;
    public static final byte BUILTIN_AUTO_DEACTIVATE = 11;
    public static final byte BUILTIN_AUTO_OPEN = 2;
    public static final byte BUILTIN_CONSOLIDATE_AREA = 1;
    public static final byte BUILTIN_CRITERIA = 5;
    public static final byte BUILTIN_DATABASE = 4;
    public static final byte BUILTIN_DATA_FORM = 9;
    public static final byte BUILTIN_FILTER_DB = 13;
    public static final byte BUILTIN_PRINT_AREA = 6;
    public static final byte BUILTIN_PRINT_TITLE = 7;
    public static final byte BUILTIN_RECORDER = 8;
    public static final byte BUILTIN_SHEET_TITLE = 12;
    public static final short sid = 24;
    private boolean field_11_nameIsMultibyte;
    private byte field_12_built_in_code;
    private String field_12_name_text;
    private Formula field_13_name_definition;
    private String field_14_custom_menu_text;
    private String field_15_description_text;
    private String field_16_help_topic_text;
    private String field_17_status_bar_text;
    private short field_1_option_flag;
    private byte field_2_keyboard_shortcut;
    private short field_5_externSheetIndex_plus1;
    private int field_6_sheetNumber;

    /* loaded from: classes3.dex */
    public static final class Option {
        public static final int OPT_BINDATA = 4096;
        public static final int OPT_BUILTIN = 32;
        public static final int OPT_COMMAND_NAME = 4;
        public static final int OPT_COMPLEX = 16;
        public static final int OPT_FUNCTION_NAME = 2;
        public static final int OPT_HIDDEN_NAME = 1;
        public static final int OPT_MACRO = 8;

        private Option() {
        }

        public static final boolean isFormula(int i10) {
            if ((i10 & 15) == 0) {
                return true;
            }
            return false;
        }
    }

    public NameRecord() {
        this.field_13_name_definition = Formula.create(Ptg.EMPTY_PTG_ARRAY);
        this.field_12_name_text = "";
        this.field_14_custom_menu_text = "";
        this.field_15_description_text = "";
        this.field_16_help_topic_text = "";
        this.field_17_status_bar_text = "";
    }

    private int getNameRawSize() {
        if (isBuiltInName()) {
            return 1;
        }
        int length = this.field_12_name_text.length();
        if (this.field_11_nameIsMultibyte) {
            return length * 2;
        }
        return length;
    }

    private int getNameTextLength() {
        if (isBuiltInName()) {
            return 1;
        }
        return this.field_12_name_text.length();
    }

    private static String translateBuiltInName(byte b10) {
        switch (b10) {
            case 1:
                return "Consolidate_Area";
            case 2:
                return "Auto_Open";
            case 3:
                return "Auto_Close";
            case 4:
                return "Database";
            case 5:
                return "Criteria";
            case 6:
                return "Print_Area";
            case 7:
                return "Print_Titles";
            case 8:
                return "Recorder";
            case 9:
                return "Data_Form";
            case 10:
                return "Auto_Activate";
            case 11:
                return "Auto_Deactivate";
            case 12:
                return "Sheet_Title";
            case 13:
                return "_FilterDatabase";
            default:
                return OpenTypeScript.UNKNOWN;
        }
    }

    public byte getBuiltInName() {
        return this.field_12_built_in_code;
    }

    public String getCustomMenuText() {
        return this.field_14_custom_menu_text;
    }

    public int getDataSize() {
        return this.field_13_name_definition.getEncodedSize() + this.field_17_status_bar_text.length() + this.field_16_help_topic_text.length() + this.field_15_description_text.length() + this.field_14_custom_menu_text.length() + getNameRawSize() + 13;
    }

    public String getDescriptionText() {
        return this.field_15_description_text;
    }

    public int getExternSheetNumber() {
        if (this.field_13_name_definition.getEncodedSize() < 1) {
            return 0;
        }
        Ptg ptg = this.field_13_name_definition.getTokens()[0];
        if (ptg.getClass() == Area3DPtg.class) {
            return ((Area3DPtg) ptg).getExternSheetIndex();
        }
        if (ptg.getClass() != Ref3DPtg.class) {
            return 0;
        }
        return ((Ref3DPtg) ptg).getExternSheetIndex();
    }

    public byte getFnGroup() {
        return (byte) ((this.field_1_option_flag & 4032) >> 4);
    }

    public String getHelpTopicText() {
        return this.field_16_help_topic_text;
    }

    public byte getKeyboardShortcut() {
        return this.field_2_keyboard_shortcut;
    }

    public Ptg[] getNameDefinition() {
        return this.field_13_name_definition.getTokens();
    }

    public String getNameText() {
        if (isBuiltInName()) {
            return translateBuiltInName(getBuiltInName());
        }
        return this.field_12_name_text;
    }

    public short getOptionFlag() {
        return this.field_1_option_flag;
    }

    public int getSheetNumber() {
        return this.field_6_sheetNumber;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 24;
    }

    public String getStatusBarText() {
        return this.field_17_status_bar_text;
    }

    public boolean hasFormula() {
        if (Option.isFormula(this.field_1_option_flag) && this.field_13_name_definition.getEncodedTokenSize() > 0) {
            return true;
        }
        return false;
    }

    public boolean isBuiltInName() {
        if ((this.field_1_option_flag & 32) != 0) {
            return true;
        }
        return false;
    }

    public boolean isCommandName() {
        if ((this.field_1_option_flag & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean isComplexFunction() {
        if ((this.field_1_option_flag & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean isFunctionName() {
        if ((this.field_1_option_flag & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean isHiddenName() {
        if ((this.field_1_option_flag & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean isMacro() {
        if ((this.field_1_option_flag & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hssf.record.cont.ContinuableRecord
    public void serialize(ContinuableRecordOutput continuableRecordOutput) {
        int length = this.field_14_custom_menu_text.length();
        int length2 = this.field_15_description_text.length();
        int length3 = this.field_16_help_topic_text.length();
        int length4 = this.field_17_status_bar_text.length();
        continuableRecordOutput.writeShort(getOptionFlag());
        continuableRecordOutput.writeByte(getKeyboardShortcut());
        continuableRecordOutput.writeByte(getNameTextLength());
        continuableRecordOutput.writeShort(this.field_13_name_definition.getEncodedTokenSize());
        continuableRecordOutput.writeShort(this.field_5_externSheetIndex_plus1);
        continuableRecordOutput.writeShort(this.field_6_sheetNumber);
        continuableRecordOutput.writeByte(length);
        continuableRecordOutput.writeByte(length2);
        continuableRecordOutput.writeByte(length3);
        continuableRecordOutput.writeByte(length4);
        continuableRecordOutput.writeByte(this.field_11_nameIsMultibyte ? 1 : 0);
        if (isBuiltInName()) {
            continuableRecordOutput.writeByte(this.field_12_built_in_code);
        } else {
            String str = this.field_12_name_text;
            if (this.field_11_nameIsMultibyte) {
                StringUtil.putUnicodeLE(str, continuableRecordOutput);
            } else {
                StringUtil.putCompressedUnicode(str, continuableRecordOutput);
            }
        }
        this.field_13_name_definition.serializeTokens(continuableRecordOutput);
        this.field_13_name_definition.serializeArrayConstantData(continuableRecordOutput);
        StringUtil.putCompressedUnicode(getCustomMenuText(), continuableRecordOutput);
        StringUtil.putCompressedUnicode(getDescriptionText(), continuableRecordOutput);
        StringUtil.putCompressedUnicode(getHelpTopicText(), continuableRecordOutput);
        StringUtil.putCompressedUnicode(getStatusBarText(), continuableRecordOutput);
    }

    public void setCustomMenuText(String str) {
        this.field_14_custom_menu_text = str;
    }

    public void setDescriptionText(String str) {
        this.field_15_description_text = str;
    }

    public void setFunction(boolean z10) {
        if (z10) {
            this.field_1_option_flag = (short) (this.field_1_option_flag | 2);
        } else {
            this.field_1_option_flag = (short) (this.field_1_option_flag & (-3));
        }
    }

    public void setHelpTopicText(String str) {
        this.field_16_help_topic_text = str;
    }

    public void setHidden(boolean z10) {
        if (z10) {
            this.field_1_option_flag = (short) (this.field_1_option_flag | 1);
        } else {
            this.field_1_option_flag = (short) (this.field_1_option_flag & (-2));
        }
    }

    public void setKeyboardShortcut(byte b10) {
        this.field_2_keyboard_shortcut = b10;
    }

    public void setNameDefinition(Ptg[] ptgArr) {
        this.field_13_name_definition = Formula.create(ptgArr);
    }

    public void setNameText(String str) {
        this.field_12_name_text = str;
        this.field_11_nameIsMultibyte = StringUtil.hasMultibyte(str);
    }

    public void setOptionFlag(short s4) {
        this.field_1_option_flag = s4;
    }

    public void setSheetNumber(int i10) {
        this.field_6_sheetNumber = i10;
    }

    public void setStatusBarText(String str) {
        this.field_17_status_bar_text = str;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[NAME]\n    .option flags           = ");
        r.j(this.field_1_option_flag, stringBuffer, "\n    .keyboard shortcut      = ");
        stringBuffer.append(HexDump.byteToHex(this.field_2_keyboard_shortcut));
        stringBuffer.append("\n    .length of the name     = ");
        stringBuffer.append(getNameTextLength());
        stringBuffer.append("\n    .extSheetIx(1-based, 0=Global)= ");
        stringBuffer.append((int) this.field_5_externSheetIndex_plus1);
        stringBuffer.append("\n    .sheetTabIx             = ");
        stringBuffer.append(this.field_6_sheetNumber);
        stringBuffer.append("\n    .Menu text length       = ");
        stringBuffer.append(this.field_14_custom_menu_text.length());
        stringBuffer.append("\n    .Description text length= ");
        stringBuffer.append(this.field_15_description_text.length());
        stringBuffer.append("\n    .Help topic text length = ");
        stringBuffer.append(this.field_16_help_topic_text.length());
        stringBuffer.append("\n    .Status bar text length = ");
        stringBuffer.append(this.field_17_status_bar_text.length());
        stringBuffer.append("\n    .NameIsMultibyte        = ");
        stringBuffer.append(this.field_11_nameIsMultibyte);
        stringBuffer.append("\n    .Name (Unicode text)    = ");
        stringBuffer.append(getNameText());
        stringBuffer.append("\n    .Formula (nTokens=");
        Ptg[] tokens = this.field_13_name_definition.getTokens();
        stringBuffer.append(tokens.length);
        stringBuffer.append("):\n");
        for (Ptg ptg : tokens) {
            stringBuffer.append("       " + ptg.toString());
            stringBuffer.append(ptg.getRVAType());
            stringBuffer.append("\n");
        }
        stringBuffer.append("    .Menu text       = ");
        stringBuffer.append(this.field_14_custom_menu_text);
        stringBuffer.append("\n    .Description text= ");
        stringBuffer.append(this.field_15_description_text);
        stringBuffer.append("\n    .Help topic text = ");
        stringBuffer.append(this.field_16_help_topic_text);
        stringBuffer.append("\n    .Status bar text = ");
        stringBuffer.append(this.field_17_status_bar_text);
        stringBuffer.append("\n[/NAME]\n");
        return stringBuffer.toString();
    }

    public NameRecord(byte b10, int i10) {
        this();
        this.field_12_built_in_code = b10;
        setOptionFlag((short) (this.field_1_option_flag | 32));
        this.field_6_sheetNumber = i10;
    }

    public NameRecord(RecordInputStream recordInputStream) {
        LittleEndianByteArrayInputStream littleEndianByteArrayInputStream = new LittleEndianByteArrayInputStream(recordInputStream.readAllContinuedRemainder());
        this.field_1_option_flag = littleEndianByteArrayInputStream.readShort();
        this.field_2_keyboard_shortcut = littleEndianByteArrayInputStream.readByte();
        int readUByte = littleEndianByteArrayInputStream.readUByte();
        short readShort = littleEndianByteArrayInputStream.readShort();
        this.field_5_externSheetIndex_plus1 = littleEndianByteArrayInputStream.readShort();
        this.field_6_sheetNumber = littleEndianByteArrayInputStream.readUShort();
        int readUByte2 = littleEndianByteArrayInputStream.readUByte();
        int readUByte3 = littleEndianByteArrayInputStream.readUByte();
        int readUByte4 = littleEndianByteArrayInputStream.readUByte();
        int readUByte5 = littleEndianByteArrayInputStream.readUByte();
        this.field_11_nameIsMultibyte = littleEndianByteArrayInputStream.readByte() != 0;
        if (isBuiltInName()) {
            this.field_12_built_in_code = littleEndianByteArrayInputStream.readByte();
        } else if (this.field_11_nameIsMultibyte) {
            this.field_12_name_text = StringUtil.readUnicodeLE(littleEndianByteArrayInputStream, readUByte);
        } else {
            this.field_12_name_text = StringUtil.readCompressedUnicode(littleEndianByteArrayInputStream, readUByte);
        }
        this.field_13_name_definition = Formula.read(readShort, littleEndianByteArrayInputStream, littleEndianByteArrayInputStream.available() - (((readUByte2 + readUByte3) + readUByte4) + readUByte5));
        this.field_14_custom_menu_text = StringUtil.readCompressedUnicode(littleEndianByteArrayInputStream, readUByte2);
        this.field_15_description_text = StringUtil.readCompressedUnicode(littleEndianByteArrayInputStream, readUByte3);
        this.field_16_help_topic_text = StringUtil.readCompressedUnicode(littleEndianByteArrayInputStream, readUByte4);
        this.field_17_status_bar_text = StringUtil.readCompressedUnicode(littleEndianByteArrayInputStream, readUByte5);
    }
}
