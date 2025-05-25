package lib.zj.office.fc.hssf.formula.ptg;

import b.a;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class IntPtg extends ScalarConstantPtg {
    private static final int MAX_VALUE = 65535;
    private static final int MIN_VALUE = 0;
    public static final int SIZE = 3;
    public static final byte sid = 30;
    private final int field_1_value;

    public IntPtg(LittleEndianInput littleEndianInput) {
        this(littleEndianInput.readUShort());
    }

    public static boolean isInRange(int i10) {
        if (i10 >= 0 && i10 <= 65535) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public int getSize() {
        return 3;
    }

    public int getValue() {
        return this.field_1_value;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toFormulaString() {
        return String.valueOf(getValue());
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + 30);
        littleEndianOutput.writeShort(getValue());
    }

    public IntPtg(int i10) {
        if (isInRange(i10)) {
            this.field_1_value = i10;
            return;
        }
        throw new IllegalArgumentException(a.c("value is out of range: ", i10));
    }
}
