package lib.zj.office.fc.hssf.formula.eval;

import lib.zj.office.fc.hssf.formula.TwoDEval;

/* loaded from: classes3.dex */
public interface AreaEval extends TwoDEval {
    boolean contains(int i10, int i11);

    boolean containsColumn(int i10);

    boolean containsRow(int i10);

    ValueEval getAbsoluteValue(int i10, int i11);

    int getFirstColumn();

    int getFirstRow();

    @Override // lib.zj.office.fc.hssf.formula.TwoDEval
    int getHeight();

    int getLastColumn();

    int getLastRow();

    ValueEval getRelativeValue(int i10, int i11);

    @Override // lib.zj.office.fc.hssf.formula.TwoDEval
    int getWidth();

    AreaEval offset(int i10, int i11, int i12, int i13);
}
