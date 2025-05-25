package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.ss.usermodel.ErrorConstants;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class RefErrorPtg extends OperandPtg {
    private static final int SIZE = 5;
    public static final byte sid = 42;
    private int field_1_reserved;

    public RefErrorPtg() {
        this.field_1_reserved = 0;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public byte getDefaultOperandClass() {
        return (byte) 0;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public int getSize() {
        return 5;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toFormulaString() {
        return ErrorConstants.getText(23);
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toString() {
        return RefErrorPtg.class.getName();
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + 42);
        littleEndianOutput.writeInt(this.field_1_reserved);
    }

    public RefErrorPtg(LittleEndianInput littleEndianInput) {
        this.field_1_reserved = littleEndianInput.readInt();
    }
}
