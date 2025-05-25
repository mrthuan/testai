package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public abstract class ValueOperatorPtg extends OperationPtg {
    @Override // lib.zj.office.fc.hssf.formula.ptg.OperationPtg, lib.zj.office.fc.hssf.formula.ptg.Ptg
    public final byte getDefaultOperandClass() {
        return (byte) 32;
    }

    public abstract byte getSid();

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public final int getSize() {
        return 1;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public final boolean isBaseToken() {
        return true;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public final String toFormulaString() {
        throw new RuntimeException("toFormulaString(String[] operands) should be used for subclasses of OperationPtgs");
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getSid());
    }
}
