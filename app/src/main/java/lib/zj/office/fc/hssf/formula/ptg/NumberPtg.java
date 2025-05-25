package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.ss.util.NumberToTextConverter;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class NumberPtg extends ScalarConstantPtg {
    public static final int SIZE = 9;
    public static final byte sid = 31;
    private final double field_1_value;

    public NumberPtg(LittleEndianInput littleEndianInput) {
        this(littleEndianInput.readDouble());
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public int getSize() {
        return 9;
    }

    public double getValue() {
        return this.field_1_value;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toFormulaString() {
        return NumberToTextConverter.toText(this.field_1_value);
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + 31);
        littleEndianOutput.writeDouble(getValue());
    }

    public NumberPtg(String str) {
        this(Double.parseDouble(str));
    }

    public NumberPtg(double d10) {
        this.field_1_value = d10;
    }
}
