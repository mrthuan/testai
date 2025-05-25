package lib.zj.office.fc.hssf.formula.ptg;

/* loaded from: classes3.dex */
public abstract class ControlPtg extends Ptg {
    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public final byte getDefaultOperandClass() {
        throw new IllegalStateException("Control tokens are not classified");
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public boolean isBaseToken() {
        return true;
    }
}
