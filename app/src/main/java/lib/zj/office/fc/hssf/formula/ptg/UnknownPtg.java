package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public class UnknownPtg extends Ptg {
    private final int _sid;
    private short size = 1;

    public UnknownPtg(int i10) {
        this._sid = i10;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public byte getDefaultOperandClass() {
        return (byte) 32;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public int getSize() {
        return this.size;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public boolean isBaseToken() {
        return true;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toFormulaString() {
        return "UNKNOWN";
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(this._sid);
    }
}
