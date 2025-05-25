package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.ss.usermodel.ErrorConstants;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class AreaErrPtg extends OperandPtg {
    public static final byte sid = 43;
    private final int unused1;
    private final int unused2;

    public AreaErrPtg() {
        this.unused1 = 0;
        this.unused2 = 0;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public byte getDefaultOperandClass() {
        return (byte) 0;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public int getSize() {
        return 9;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toFormulaString() {
        return ErrorConstants.getText(23);
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + 43);
        littleEndianOutput.writeInt(this.unused1);
        littleEndianOutput.writeInt(this.unused2);
    }

    public AreaErrPtg(LittleEndianInput littleEndianInput) {
        this.unused1 = littleEndianInput.readInt();
        this.unused2 = littleEndianInput.readInt();
    }
}
