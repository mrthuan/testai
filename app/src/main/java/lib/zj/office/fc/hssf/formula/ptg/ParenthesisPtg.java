package lib.zj.office.fc.hssf.formula.ptg;

import androidx.activity.r;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class ParenthesisPtg extends ControlPtg {
    private static final int SIZE = 1;
    public static final ControlPtg instance = new ParenthesisPtg();
    public static final byte sid = 21;

    private ParenthesisPtg() {
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public int getSize() {
        return 1;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toFormulaString() {
        return "()";
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + 21);
    }

    public String toFormulaString(String[] strArr) {
        return r.g(new StringBuilder("("), strArr[0], ")");
    }
}
