package lib.zj.office.fc.hssf.formula.eval;

import di.e;
import lib.zj.office.fc.hssf.formula.CollaboratingWorkbooksEnvironment;
import lib.zj.office.fc.hssf.formula.EvaluationCell;
import lib.zj.office.fc.hssf.formula.EvaluationWorkbook;
import lib.zj.office.fc.hssf.formula.IStabilityClassifier;
import lib.zj.office.fc.hssf.formula.WorkbookEvaluator;
import lib.zj.office.fc.hssf.formula.udf.UDFFinder;
import lib.zj.office.fc.hssf.usermodel.HSSFEvaluationWorkbook;
import lib.zj.office.fc.ss.usermodel.Workbook;

/* loaded from: classes3.dex */
public final class ForkedEvaluator {
    private WorkbookEvaluator _evaluator;
    private ForkedEvaluationWorkbook _sewb;

    private ForkedEvaluator(EvaluationWorkbook evaluationWorkbook, IStabilityClassifier iStabilityClassifier, UDFFinder uDFFinder) {
        ForkedEvaluationWorkbook forkedEvaluationWorkbook = new ForkedEvaluationWorkbook(evaluationWorkbook);
        this._sewb = forkedEvaluationWorkbook;
        this._evaluator = new WorkbookEvaluator(forkedEvaluationWorkbook, iStabilityClassifier, uDFFinder);
    }

    public static ForkedEvaluator create(Workbook workbook, IStabilityClassifier iStabilityClassifier) {
        return create(workbook, iStabilityClassifier, null);
    }

    private static EvaluationWorkbook createEvaluationWorkbook(Workbook workbook) {
        if (workbook instanceof e) {
            return HSSFEvaluationWorkbook.create((e) workbook);
        }
        throw new IllegalArgumentException("Unexpected workbook type (" + workbook.getClass().getName() + ")");
    }

    public static void setupEnvironment(String[] strArr, ForkedEvaluator[] forkedEvaluatorArr) {
        int length = forkedEvaluatorArr.length;
        WorkbookEvaluator[] workbookEvaluatorArr = new WorkbookEvaluator[length];
        for (int i10 = 0; i10 < length; i10++) {
            workbookEvaluatorArr[i10] = forkedEvaluatorArr[i10]._evaluator;
        }
        CollaboratingWorkbooksEnvironment.setup(strArr, workbookEvaluatorArr);
    }

    public void copyUpdatedCells(Workbook workbook) {
        this._sewb.copyUpdatedCells(workbook);
    }

    public ValueEval evaluate(String str, int i10, int i11) {
        EvaluationCell evaluationCell = this._sewb.getEvaluationCell(str, i10, i11);
        int cellType = evaluationCell.getCellType();
        if (cellType != 0) {
            if (cellType != 1) {
                if (cellType != 2) {
                    if (cellType != 3) {
                        if (cellType != 4) {
                            if (cellType == 5) {
                                return ErrorEval.valueOf(evaluationCell.getErrorCellValue());
                            }
                            throw new IllegalStateException("Bad cell type (" + evaluationCell.getCellType() + ")");
                        }
                        return BoolEval.valueOf(evaluationCell.getBooleanCellValue());
                    }
                    return null;
                }
                return this._evaluator.evaluate(evaluationCell);
            }
            return new StringEval(evaluationCell.getStringCellValue());
        }
        return new NumberEval(evaluationCell.getNumericCellValue());
    }

    public void updateCell(String str, int i10, int i11, ValueEval valueEval) {
        ForkedEvaluationCell orCreateUpdatableCell = this._sewb.getOrCreateUpdatableCell(str, i10, i11);
        orCreateUpdatableCell.setValue(valueEval);
        this._evaluator.notifyUpdateCell(orCreateUpdatableCell);
    }

    public static ForkedEvaluator create(Workbook workbook, IStabilityClassifier iStabilityClassifier, UDFFinder uDFFinder) {
        return new ForkedEvaluator(createEvaluationWorkbook(workbook), iStabilityClassifier, uDFFinder);
    }
}
