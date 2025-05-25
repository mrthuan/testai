package lib.zj.office.fc.hssf.formula.ptg;

/* loaded from: classes3.dex */
public abstract class OperationPtg extends Ptg {
    public static final int TYPE_BINARY = 1;
    public static final int TYPE_FUNCTION = 2;
    public static final int TYPE_UNARY = 0;

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public byte getDefaultOperandClass() {
        return (byte) 32;
    }

    public abstract int getNumberOfOperands();

    public abstract String toFormulaString(String[] strArr);
}
