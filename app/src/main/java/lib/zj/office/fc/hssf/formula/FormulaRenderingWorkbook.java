package lib.zj.office.fc.hssf.formula;

import lib.zj.office.fc.hssf.formula.EvaluationWorkbook;
import lib.zj.office.fc.hssf.formula.ptg.NamePtg;
import lib.zj.office.fc.hssf.formula.ptg.NameXPtg;

/* loaded from: classes3.dex */
public interface FormulaRenderingWorkbook {
    EvaluationWorkbook.ExternalSheet getExternalSheet(int i10);

    String getNameText(NamePtg namePtg);

    String getSheetNameByExternSheet(int i10);

    String resolveNameXText(NameXPtg nameXPtg);
}
