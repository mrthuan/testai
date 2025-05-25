package lib.zj.office.fc.hssf.formula.ptg;

/* loaded from: classes3.dex */
public abstract class OperandPtg extends Ptg implements Cloneable {
    public final OperandPtg copy() {
        try {
            return (OperandPtg) clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public final boolean isBaseToken() {
        return false;
    }
}
