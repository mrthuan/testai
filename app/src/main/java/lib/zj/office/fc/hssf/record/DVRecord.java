package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.hssf.formula.Formula;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.ss.util.CellRangeAddressList;
import lib.zj.office.fc.ss.util.HSSFCellRangeAddress;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class DVRecord extends StandardRecord {
    public static final short sid = 446;
    private lib.zj.office.fc.hssf.record.common.UnicodeString _errorText;
    private lib.zj.office.fc.hssf.record.common.UnicodeString _errorTitle;
    private Formula _formula1;
    private Formula _formula2;
    private short _not_used_1;
    private short _not_used_2;
    private int _option_flags;
    private lib.zj.office.fc.hssf.record.common.UnicodeString _promptText;
    private lib.zj.office.fc.hssf.record.common.UnicodeString _promptTitle;
    private CellRangeAddressList _regions;
    private static final lib.zj.office.fc.hssf.record.common.UnicodeString NULL_TEXT_STRING = new lib.zj.office.fc.hssf.record.common.UnicodeString("\u0000");
    private static final BitField opt_data_type = new BitField(15);
    private static final BitField opt_error_style = new BitField(112);
    private static final BitField opt_string_list_formula = new BitField(128);
    private static final BitField opt_empty_cell_allowed = new BitField(256);
    private static final BitField opt_suppress_dropdown_arrow = new BitField(512);
    private static final BitField opt_show_prompt_on_cell_selected = new BitField(262144);
    private static final BitField opt_show_error_on_invalid_value = new BitField(524288);
    private static final BitField opt_condition_operator = new BitField(7340032);

    public DVRecord(int i10, int i11, int i12, boolean z10, boolean z11, boolean z12, boolean z13, String str, String str2, boolean z14, String str3, String str4, Ptg[] ptgArr, Ptg[] ptgArr2, CellRangeAddressList cellRangeAddressList) {
        this._not_used_1 = (short) 16352;
        this._not_used_2 = (short) 0;
        this._option_flags = opt_show_error_on_invalid_value.setBoolean(opt_show_prompt_on_cell_selected.setBoolean(opt_string_list_formula.setBoolean(opt_suppress_dropdown_arrow.setBoolean(opt_empty_cell_allowed.setBoolean(opt_error_style.setValue(opt_condition_operator.setValue(opt_data_type.setValue(0, i10), i11), i12), z10), z11), z12), z13), z14);
        this._promptTitle = resolveTitleText(str);
        this._promptText = resolveTitleText(str2);
        this._errorTitle = resolveTitleText(str3);
        this._errorText = resolveTitleText(str4);
        this._formula1 = Formula.create(ptgArr);
        this._formula2 = Formula.create(ptgArr2);
        this._regions = cellRangeAddressList;
    }

    private static void appendFormula(StringBuffer stringBuffer, String str, Formula formula) {
        stringBuffer.append(str);
        if (formula == null) {
            stringBuffer.append("<empty>\n");
            return;
        }
        Ptg[] tokens = formula.getTokens();
        stringBuffer.append('\n');
        for (Ptg ptg : tokens) {
            stringBuffer.append('\t');
            stringBuffer.append(ptg.toString());
            stringBuffer.append('\n');
        }
    }

    private static String formatTextTitle(lib.zj.office.fc.hssf.record.common.UnicodeString unicodeString) {
        String string = unicodeString.getString();
        if (string.length() == 1 && string.charAt(0) == 0) {
            return "'\\0'";
        }
        return string;
    }

    private static int getUnicodeStringSize(lib.zj.office.fc.hssf.record.common.UnicodeString unicodeString) {
        int i10;
        String string = unicodeString.getString();
        int length = string.length();
        if (StringUtil.hasMultibyte(string)) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        return (length * i10) + 3;
    }

    private static lib.zj.office.fc.hssf.record.common.UnicodeString readUnicodeString(RecordInputStream recordInputStream) {
        return new lib.zj.office.fc.hssf.record.common.UnicodeString(recordInputStream);
    }

    private static lib.zj.office.fc.hssf.record.common.UnicodeString resolveTitleText(String str) {
        if (str != null && str.length() >= 1) {
            return new lib.zj.office.fc.hssf.record.common.UnicodeString(str);
        }
        return NULL_TEXT_STRING;
    }

    private static void serializeUnicodeString(lib.zj.office.fc.hssf.record.common.UnicodeString unicodeString, LittleEndianOutput littleEndianOutput) {
        StringUtil.writeUnicodeString(littleEndianOutput, unicodeString.getString());
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return cloneViaReserialise();
    }

    public CellRangeAddressList getCellRangeAddress() {
        return this._regions;
    }

    public int getConditionOperator() {
        return opt_condition_operator.getValue(this._option_flags);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return this._regions.getSize() + this._formula2.getEncodedTokenSize() + this._formula1.getEncodedTokenSize() + getUnicodeStringSize(this._promptTitle) + 12 + getUnicodeStringSize(this._errorTitle) + getUnicodeStringSize(this._promptText) + getUnicodeStringSize(this._errorText);
    }

    public int getDataType() {
        return opt_data_type.getValue(this._option_flags);
    }

    public boolean getEmptyCellAllowed() {
        return opt_empty_cell_allowed.isSet(this._option_flags);
    }

    public int getErrorStyle() {
        return opt_error_style.getValue(this._option_flags);
    }

    public boolean getListExplicitFormula() {
        return opt_string_list_formula.isSet(this._option_flags);
    }

    public boolean getShowErrorOnInvalidValue() {
        return opt_show_error_on_invalid_value.isSet(this._option_flags);
    }

    public boolean getShowPromptOnCellSelected() {
        return opt_show_prompt_on_cell_selected.isSet(this._option_flags);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 446;
    }

    public boolean getSuppressDropdownArrow() {
        return opt_suppress_dropdown_arrow.isSet(this._option_flags);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeInt(this._option_flags);
        serializeUnicodeString(this._promptTitle, littleEndianOutput);
        serializeUnicodeString(this._errorTitle, littleEndianOutput);
        serializeUnicodeString(this._promptText, littleEndianOutput);
        serializeUnicodeString(this._errorText, littleEndianOutput);
        littleEndianOutput.writeShort(this._formula1.getEncodedTokenSize());
        littleEndianOutput.writeShort(this._not_used_1);
        this._formula1.serializeTokens(littleEndianOutput);
        littleEndianOutput.writeShort(this._formula2.getEncodedTokenSize());
        littleEndianOutput.writeShort(this._not_used_2);
        this._formula2.serializeTokens(littleEndianOutput);
        this._regions.serialize(littleEndianOutput);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[DV]\n options=");
        stringBuffer.append(Integer.toHexString(this._option_flags));
        stringBuffer.append(" title-prompt=");
        stringBuffer.append(formatTextTitle(this._promptTitle));
        stringBuffer.append(" title-error=");
        stringBuffer.append(formatTextTitle(this._errorTitle));
        stringBuffer.append(" text-prompt=");
        stringBuffer.append(formatTextTitle(this._promptText));
        stringBuffer.append(" text-error=");
        stringBuffer.append(formatTextTitle(this._errorText));
        stringBuffer.append("\n");
        appendFormula(stringBuffer, "Formula 1:", this._formula1);
        appendFormula(stringBuffer, "Formula 2:", this._formula2);
        stringBuffer.append("Regions: ");
        int countRanges = this._regions.countRanges();
        for (int i10 = 0; i10 < countRanges; i10++) {
            if (i10 > 0) {
                stringBuffer.append(", ");
            }
            HSSFCellRangeAddress cellRangeAddress = this._regions.getCellRangeAddress(i10);
            stringBuffer.append('(');
            stringBuffer.append(cellRangeAddress.getFirstRow());
            stringBuffer.append(',');
            stringBuffer.append(cellRangeAddress.getLastRow());
            stringBuffer.append(',');
            stringBuffer.append(cellRangeAddress.getFirstColumn());
            stringBuffer.append(',');
            stringBuffer.append(cellRangeAddress.getLastColumn());
            stringBuffer.append(')');
        }
        stringBuffer.append("\n");
        stringBuffer.append("[/DV]");
        return stringBuffer.toString();
    }

    public DVRecord(RecordInputStream recordInputStream) {
        this._not_used_1 = (short) 16352;
        this._not_used_2 = (short) 0;
        this._option_flags = recordInputStream.readInt();
        this._promptTitle = readUnicodeString(recordInputStream);
        this._errorTitle = readUnicodeString(recordInputStream);
        this._promptText = readUnicodeString(recordInputStream);
        this._errorText = readUnicodeString(recordInputStream);
        int readUShort = recordInputStream.readUShort();
        this._not_used_1 = recordInputStream.readShort();
        this._formula1 = Formula.read(readUShort, recordInputStream);
        int readUShort2 = recordInputStream.readUShort();
        this._not_used_2 = recordInputStream.readShort();
        this._formula2 = Formula.read(readUShort2, recordInputStream);
        this._regions = new CellRangeAddressList(recordInputStream);
    }
}
