package lib.zj.office.fc.hssf.formula;

import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
public interface TwoDEval extends ValueEval {
    TwoDEval getColumn(int i10);

    int getHeight();

    TwoDEval getRow(int i10);

    ValueEval getValue(int i10, int i11);

    int getWidth();

    boolean isColumn();

    boolean isRow();

    boolean isSubTotal(int i10, int i11);
}
