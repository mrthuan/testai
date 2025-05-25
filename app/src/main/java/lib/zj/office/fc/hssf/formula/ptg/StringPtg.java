package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class StringPtg extends ScalarConstantPtg {
    private static final char FORMULA_DELIMITER = '\"';
    public static final byte sid = 23;
    private final boolean _is16bitUnicode;
    private final String field_3_string;

    public StringPtg(LittleEndianInput littleEndianInput) {
        int readUByte = littleEndianInput.readUByte();
        boolean z10 = (littleEndianInput.readByte() & 1) != 0;
        this._is16bitUnicode = z10;
        if (z10) {
            this.field_3_string = StringUtil.readUnicodeLE(littleEndianInput, readUByte);
        } else {
            this.field_3_string = StringUtil.readCompressedUnicode(littleEndianInput, readUByte);
        }
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public int getSize() {
        int i10;
        int length = this.field_3_string.length();
        if (this._is16bitUnicode) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        return (length * i10) + 3;
    }

    public String getValue() {
        return this.field_3_string;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toFormulaString() {
        String str = this.field_3_string;
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length + 4);
        stringBuffer.append(FORMULA_DELIMITER);
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '\"') {
                stringBuffer.append(FORMULA_DELIMITER);
            }
            stringBuffer.append(charAt);
        }
        stringBuffer.append(FORMULA_DELIMITER);
        return stringBuffer.toString();
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + 23);
        littleEndianOutput.writeByte(this.field_3_string.length());
        littleEndianOutput.writeByte(this._is16bitUnicode ? 1 : 0);
        if (this._is16bitUnicode) {
            StringUtil.putUnicodeLE(this.field_3_string, littleEndianOutput);
        } else {
            StringUtil.putCompressedUnicode(this.field_3_string, littleEndianOutput);
        }
    }

    public StringPtg(String str) {
        if (str.length() <= 255) {
            this._is16bitUnicode = StringUtil.hasMultibyte(str);
            this.field_3_string = str;
            return;
        }
        throw new IllegalArgumentException("String literals in formulas can't be bigger than 255 characters ASCII");
    }
}
