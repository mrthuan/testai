package lib.zj.office.fc.hssf.formula;

import lib.zj.office.fc.hssf.formula.ptg.NamePtg;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;

/* loaded from: classes3.dex */
public interface EvaluationName {
    NamePtg createPtg();

    Ptg[] getNameDefinition();

    String getNameText();

    boolean hasFormula();

    boolean isFunctionName();

    boolean isRange();
}
