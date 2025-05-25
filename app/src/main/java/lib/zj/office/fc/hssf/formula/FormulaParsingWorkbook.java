package lib.zj.office.fc.hssf.formula;

import lib.zj.office.fc.hssf.formula.ptg.NameXPtg;
import lib.zj.office.fc.ss.SpreadsheetVersion;

/* loaded from: classes3.dex */
public interface FormulaParsingWorkbook {
    int getExternalSheetIndex(String str);

    int getExternalSheetIndex(String str, String str2);

    EvaluationName getName(String str, int i10);

    NameXPtg getNameXPtg(String str);

    SpreadsheetVersion getSpreadsheetVersion();
}
