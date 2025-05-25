package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class BoolPtg extends ScalarConstantPtg {
    public static final int SIZE = 2;
    public static final byte sid = 29;
    private final boolean _value;
    private static final BoolPtg FALSE = new BoolPtg(false);
    private static final BoolPtg TRUE = new BoolPtg(true);

    private BoolPtg(boolean z10) {
        this._value = z10;
    }

    public static BoolPtg read(LittleEndianInput littleEndianInput) {
        boolean z10 = true;
        if (littleEndianInput.readByte() != 1) {
            z10 = false;
        }
        return valueOf(z10);
    }

    public static BoolPtg valueOf(boolean z10) {
        if (z10) {
            return TRUE;
        }
        return FALSE;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public int getSize() {
        return 2;
    }

    public boolean getValue() {
        return this._value;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toFormulaString() {
        if (this._value) {
            return "TRUE";
        }
        return "FALSE";
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + 29);
        littleEndianOutput.writeByte(this._value ? 1 : 0);
    }
}
