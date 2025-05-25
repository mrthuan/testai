package lib.zj.office.fc.hssf.record;

import a0.a;
import a6.h;
import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.hssf.formula.Formula;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class FormulaRecord extends CellRecord {
    private static int FIXED_SIZE = 14;
    private static final BitField alwaysCalc = BitFieldFactory.getInstance(1);
    private static final BitField calcOnLoad = BitFieldFactory.getInstance(2);
    private static final BitField sharedFormula = BitFieldFactory.getInstance(8);
    public static final short sid = 6;
    private double field_4_value;
    private short field_5_options;
    private int field_6_zero;
    private Formula field_8_parsed_expr;
    private SpecialCachedValue specialCachedValue;

    public FormulaRecord() {
        this.field_8_parsed_expr = Formula.create(Ptg.EMPTY_PTG_ARRAY);
    }

    @Override // lib.zj.office.fc.hssf.record.CellRecord
    public void appendValueText(StringBuilder sb2) {
        sb2.append("  .value\t = ");
        SpecialCachedValue specialCachedValue = this.specialCachedValue;
        if (specialCachedValue == null) {
            sb2.append(this.field_4_value);
            sb2.append("\n");
        } else {
            sb2.append(specialCachedValue.formatDebugString());
            sb2.append("\n");
        }
        sb2.append("  .options   = ");
        sb2.append(HexDump.shortToHex(getOptions()));
        sb2.append("\n");
        sb2.append("    .alwaysCalc= ");
        sb2.append(isAlwaysCalc());
        sb2.append("\n");
        sb2.append("    .calcOnLoad= ");
        sb2.append(isCalcOnLoad());
        sb2.append("\n");
        sb2.append("    .shared    = ");
        sb2.append(isSharedFormula());
        sb2.append("\n");
        sb2.append("  .zero      = ");
        sb2.append(HexDump.intToHex(this.field_6_zero));
        sb2.append("\n");
        Ptg[] tokens = this.field_8_parsed_expr.getTokens();
        for (int i10 = 0; i10 < tokens.length; i10++) {
            if (i10 > 0) {
                sb2.append("\n");
            }
            sb2.append("    Ptg[");
            sb2.append(i10);
            sb2.append("]=");
            Ptg ptg = tokens[i10];
            sb2.append(ptg.toString());
            sb2.append(ptg.getRVAType());
        }
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        FormulaRecord formulaRecord = new FormulaRecord();
        copyBaseFields(formulaRecord);
        formulaRecord.field_4_value = this.field_4_value;
        formulaRecord.field_5_options = this.field_5_options;
        formulaRecord.field_6_zero = this.field_6_zero;
        formulaRecord.field_8_parsed_expr = this.field_8_parsed_expr;
        formulaRecord.specialCachedValue = this.specialCachedValue;
        return formulaRecord;
    }

    public boolean getCachedBooleanValue() {
        return this.specialCachedValue.getBooleanValue();
    }

    public int getCachedErrorValue() {
        return this.specialCachedValue.getErrorValue();
    }

    public int getCachedResultType() {
        SpecialCachedValue specialCachedValue = this.specialCachedValue;
        if (specialCachedValue == null) {
            return 0;
        }
        return specialCachedValue.getValueType();
    }

    public Formula getFormula() {
        return this.field_8_parsed_expr;
    }

    public short getOptions() {
        return this.field_5_options;
    }

    public Ptg[] getParsedExpression() {
        return this.field_8_parsed_expr.getTokens();
    }

    @Override // lib.zj.office.fc.hssf.record.CellRecord
    public String getRecordName() {
        return "FORMULA";
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 6;
    }

    public double getValue() {
        return this.field_4_value;
    }

    @Override // lib.zj.office.fc.hssf.record.CellRecord
    public int getValueDataSize() {
        return this.field_8_parsed_expr.getEncodedSize() + FIXED_SIZE;
    }

    public boolean hasCachedResultString() {
        SpecialCachedValue specialCachedValue = this.specialCachedValue;
        if (specialCachedValue == null || specialCachedValue.getTypeCode() != 0) {
            return false;
        }
        return true;
    }

    public boolean isAlwaysCalc() {
        return alwaysCalc.isSet(this.field_5_options);
    }

    public boolean isCalcOnLoad() {
        return calcOnLoad.isSet(this.field_5_options);
    }

    public boolean isSharedFormula() {
        return sharedFormula.isSet(this.field_5_options);
    }

    @Override // lib.zj.office.fc.hssf.record.CellRecord
    public void serializeValue(LittleEndianOutput littleEndianOutput) {
        SpecialCachedValue specialCachedValue = this.specialCachedValue;
        if (specialCachedValue == null) {
            littleEndianOutput.writeDouble(this.field_4_value);
        } else {
            specialCachedValue.serialize(littleEndianOutput);
        }
        littleEndianOutput.writeShort(getOptions());
        littleEndianOutput.writeInt(this.field_6_zero);
        this.field_8_parsed_expr.serialize(littleEndianOutput);
    }

    public void setAlwaysCalc(boolean z10) {
        this.field_5_options = alwaysCalc.setShortBoolean(this.field_5_options, z10);
    }

    public void setCachedResultBoolean(boolean z10) {
        this.specialCachedValue = SpecialCachedValue.createCachedBoolean(z10);
    }

    public void setCachedResultErrorCode(int i10) {
        this.specialCachedValue = SpecialCachedValue.createCachedErrorCode(i10);
    }

    public void setCachedResultTypeEmptyString() {
        this.specialCachedValue = SpecialCachedValue.createCachedEmptyValue();
    }

    public void setCachedResultTypeString() {
        this.specialCachedValue = SpecialCachedValue.createForString();
    }

    public void setCalcOnLoad(boolean z10) {
        this.field_5_options = calcOnLoad.setShortBoolean(this.field_5_options, z10);
    }

    public void setOptions(short s4) {
        this.field_5_options = s4;
    }

    public void setParsedExpression(Ptg[] ptgArr) {
        this.field_8_parsed_expr = Formula.create(ptgArr);
    }

    public void setSharedFormula(boolean z10) {
        this.field_5_options = sharedFormula.setShortBoolean(this.field_5_options, z10);
    }

    public void setValue(double d10) {
        this.field_4_value = d10;
        this.specialCachedValue = null;
    }

    public FormulaRecord(RecordInputStream recordInputStream) {
        super(recordInputStream);
        long readLong = recordInputStream.readLong();
        this.field_5_options = recordInputStream.readShort();
        SpecialCachedValue create = SpecialCachedValue.create(readLong);
        this.specialCachedValue = create;
        if (create == null) {
            this.field_4_value = Double.longBitsToDouble(readLong);
        }
        this.field_6_zero = recordInputStream.readInt();
        this.field_8_parsed_expr = Formula.read(recordInputStream.readShort(), recordInputStream, recordInputStream.available());
    }

    /* loaded from: classes3.dex */
    public static final class SpecialCachedValue {
        private static final long BIT_MARKER = -281474976710656L;
        public static final int BOOLEAN = 1;
        private static final int DATA_INDEX = 2;
        public static final int EMPTY = 3;
        public static final int ERROR_CODE = 2;
        public static final int STRING = 0;
        private static final int VARIABLE_DATA_LENGTH = 6;
        private final byte[] _variableData;

        private SpecialCachedValue(byte[] bArr) {
            this._variableData = bArr;
        }

        public static SpecialCachedValue create(long j10) {
            if ((j10 & BIT_MARKER) != BIT_MARKER) {
                return null;
            }
            byte[] bArr = new byte[6];
            for (int i10 = 0; i10 < 6; i10++) {
                bArr[i10] = (byte) j10;
                j10 >>= 8;
            }
            byte b10 = bArr[0];
            if (b10 != 0 && b10 != 1 && b10 != 2 && b10 != 3) {
                throw new RecordFormatException(h.g(new StringBuilder("Bad special value code ("), bArr[0], ")"));
            }
            return new SpecialCachedValue(bArr);
        }

        public static SpecialCachedValue createCachedBoolean(boolean z10) {
            return create(1, z10 ? 1 : 0);
        }

        public static SpecialCachedValue createCachedEmptyValue() {
            return create(3, 0);
        }

        public static SpecialCachedValue createCachedErrorCode(int i10) {
            return create(2, i10);
        }

        public static SpecialCachedValue createForString() {
            return create(0, 0);
        }

        private String formatValue() {
            int typeCode = getTypeCode();
            if (typeCode != 0) {
                if (typeCode != 1) {
                    if (typeCode != 2) {
                        if (typeCode != 3) {
                            return a.g("#error(type=", typeCode, ")#");
                        }
                        return "<empty>";
                    }
                    return ErrorEval.getText(getDataValue());
                } else if (getDataValue() == 0) {
                    return "FALSE";
                } else {
                    return "TRUE";
                }
            }
            return "<string>";
        }

        private int getDataValue() {
            return this._variableData[2];
        }

        public String formatDebugString() {
            return formatValue() + ' ' + HexDump.toHex(this._variableData);
        }

        public boolean getBooleanValue() {
            if (getTypeCode() == 1) {
                if (getDataValue() != 0) {
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("Not a boolean cached value - " + formatValue());
        }

        public int getErrorValue() {
            if (getTypeCode() == 2) {
                return getDataValue();
            }
            throw new IllegalStateException("Not an error cached value - " + formatValue());
        }

        public int getTypeCode() {
            return this._variableData[0];
        }

        public int getValueType() {
            int typeCode = getTypeCode();
            if (typeCode == 0) {
                return 1;
            }
            if (typeCode != 1) {
                if (typeCode != 2) {
                    if (typeCode == 3) {
                        return 1;
                    }
                    throw new IllegalStateException(a.g("Unexpected type id (", typeCode, ")"));
                }
                return 5;
            }
            return 4;
        }

        public void serialize(LittleEndianOutput littleEndianOutput) {
            littleEndianOutput.write(this._variableData);
            littleEndianOutput.writeShort(Variant.VT_ILLEGAL);
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer(64);
            stringBuffer.append(SpecialCachedValue.class.getName());
            stringBuffer.append('[');
            stringBuffer.append(formatValue());
            stringBuffer.append(']');
            return stringBuffer.toString();
        }

        private static SpecialCachedValue create(int i10, int i11) {
            return new SpecialCachedValue(new byte[]{(byte) i10, 0, (byte) i11, 0, 0, 0});
        }
    }
}
