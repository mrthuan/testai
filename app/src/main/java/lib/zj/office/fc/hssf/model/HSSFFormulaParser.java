package lib.zj.office.fc.hssf.model;

import di.e;
import lib.zj.office.fc.hssf.formula.FormulaParser;
import lib.zj.office.fc.hssf.formula.FormulaParsingWorkbook;
import lib.zj.office.fc.hssf.formula.FormulaRenderer;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.usermodel.HSSFEvaluationWorkbook;

/* loaded from: classes3.dex */
public final class HSSFFormulaParser {
    private HSSFFormulaParser() {
    }

    private static FormulaParsingWorkbook createParsingWorkbook(e eVar) {
        return HSSFEvaluationWorkbook.create(eVar);
    }

    public static Ptg[] parse(String str, e eVar) {
        return parse(str, eVar, 0);
    }

    public static String toFormulaString(e eVar, Ptg[] ptgArr) {
        return FormulaRenderer.toFormulaString(HSSFEvaluationWorkbook.create(eVar), ptgArr);
    }

    public static Ptg[] parse(String str, e eVar, int i10) {
        return parse(str, eVar, i10, -1);
    }

    public static Ptg[] parse(String str, e eVar, int i10, int i11) {
        return FormulaParser.parse(str, createParsingWorkbook(eVar), i10, i11);
    }
}
