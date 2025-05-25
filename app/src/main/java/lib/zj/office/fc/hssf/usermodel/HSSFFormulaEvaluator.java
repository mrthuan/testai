package lib.zj.office.fc.hssf.usermodel;

import a0.a;
import di.c;
import di.e;
import lib.zj.office.fc.hssf.formula.CollaboratingWorkbooksEnvironment;
import lib.zj.office.fc.hssf.formula.IStabilityClassifier;
import lib.zj.office.fc.hssf.formula.WorkbookEvaluator;
import lib.zj.office.fc.hssf.formula.eval.BoolEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.StringEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.fc.hssf.formula.udf.UDFFinder;
import lib.zj.office.fc.ss.usermodel.CellValue;
import lib.zj.office.fc.ss.usermodel.FormulaEvaluator;
import lib.zj.office.fc.ss.usermodel.ICell;
import lib.zj.office.fc.ss.usermodel.Workbook;

/* loaded from: classes3.dex */
public class HSSFFormulaEvaluator implements FormulaEvaluator {
    private e _book;
    private WorkbookEvaluator _bookEvaluator;
    private HSSFEvaluationCell hssfEvaluationCell;

    public HSSFFormulaEvaluator(c cVar, e eVar) {
        this(eVar);
        this._book = eVar;
    }

    public static HSSFFormulaEvaluator create(e eVar, IStabilityClassifier iStabilityClassifier, UDFFinder uDFFinder) {
        return new HSSFFormulaEvaluator(eVar, iStabilityClassifier, uDFFinder);
    }

    public static void evaluateAllFormulaCells(Workbook workbook) {
    }

    private static void setCellType(ICell iCell, CellValue cellValue) {
        int cellType = cellValue.getCellType();
        if (cellType != 0 && cellType != 1 && cellType != 4 && cellType != 5) {
            throw new IllegalStateException(a.g("Unexpected cell value type (", cellType, ")"));
        }
        iCell.setCellType(cellType);
    }

    private static void setCellValue(ICell iCell, CellValue cellValue) {
        int cellType = cellValue.getCellType();
        if (cellType != 0) {
            if (cellType != 1) {
                if (cellType != 4) {
                    if (cellType == 5) {
                        iCell.setCellErrorValue(cellValue.getErrorValue());
                        return;
                    }
                    throw new IllegalStateException(a.g("Unexpected cell value type (", cellType, ")"));
                }
                iCell.setCellValue(cellValue.getBooleanValue());
                return;
            }
            iCell.setCellValue(new HSSFRichTextString(cellValue.getStringValue()));
            return;
        }
        iCell.setCellValue(cellValue.getNumberValue());
    }

    public static void setupEnvironment(String[] strArr, HSSFFormulaEvaluator[] hSSFFormulaEvaluatorArr) {
        int length = hSSFFormulaEvaluatorArr.length;
        WorkbookEvaluator[] workbookEvaluatorArr = new WorkbookEvaluator[length];
        for (int i10 = 0; i10 < length; i10++) {
            workbookEvaluatorArr[i10] = hSSFFormulaEvaluatorArr[i10]._bookEvaluator;
        }
        CollaboratingWorkbooksEnvironment.setup(strArr, workbookEvaluatorArr);
    }

    @Override // lib.zj.office.fc.ss.usermodel.FormulaEvaluator
    public void clearAllCachedResultValues() {
        this._bookEvaluator.clearAllCachedResultValues();
    }

    @Override // lib.zj.office.fc.ss.usermodel.FormulaEvaluator
    public CellValue evaluate(ICell iCell) {
        if (iCell == null) {
            return null;
        }
        int cellType = iCell.getCellType();
        if (cellType != 0) {
            if (cellType != 1) {
                if (cellType != 2) {
                    if (cellType == 3) {
                        return null;
                    }
                    if (cellType != 4) {
                        if (cellType == 5) {
                            return CellValue.getError(iCell.getErrorCellValue());
                        }
                        throw new IllegalStateException("Bad cell type (" + iCell.getCellType() + ")");
                    }
                    return CellValue.valueOf(iCell.getBooleanCellValue());
                }
                return evaluateFormulaCellValue(iCell);
            }
            return new CellValue(iCell.getRichStringCellValue().getString());
        }
        return new CellValue(iCell.getNumericCellValue());
    }

    @Override // lib.zj.office.fc.ss.usermodel.FormulaEvaluator
    public void evaluateAll() {
        evaluateAllFormulaCells(this._book, this);
    }

    @Override // lib.zj.office.fc.ss.usermodel.FormulaEvaluator
    public int evaluateFormulaCell(ICell iCell) {
        if (iCell != null && iCell.getCellType() == 2) {
            CellValue evaluateFormulaCellValue = evaluateFormulaCellValue(iCell);
            setCellValue(iCell, evaluateFormulaCellValue);
            return evaluateFormulaCellValue.getCellType();
        }
        return -1;
    }

    public CellValue evaluateFormulaCellValue(ICell iCell) {
        HSSFEvaluationCell hSSFEvaluationCell = this.hssfEvaluationCell;
        if (hSSFEvaluationCell != null) {
            hSSFEvaluationCell.setHSSFCell((di.a) iCell);
        } else {
            this.hssfEvaluationCell = new HSSFEvaluationCell((di.a) iCell);
        }
        this._bookEvaluator.clearAllCachedResultValues();
        ValueEval evaluate = this._bookEvaluator.evaluate(this.hssfEvaluationCell);
        if (evaluate instanceof NumberEval) {
            return new CellValue(((NumberEval) evaluate).getNumberValue());
        }
        if (evaluate instanceof BoolEval) {
            return CellValue.valueOf(((BoolEval) evaluate).getBooleanValue());
        }
        if (evaluate instanceof StringEval) {
            return new CellValue(((StringEval) evaluate).getStringValue());
        }
        if (evaluate instanceof ErrorEval) {
            return CellValue.getError(((ErrorEval) evaluate).getErrorCode());
        }
        if (evaluate == null) {
            return null;
        }
        throw new RuntimeException(b.a.e(evaluate, new StringBuilder("Unexpected eval class ("), ")"));
    }

    public ValueEval evaluateFormulaValueEval(HSSFName hSSFName) {
        return null;
    }

    public void notifyDeleteCell(di.a aVar) {
        this._bookEvaluator.notifyDeleteCell(new HSSFEvaluationCell(aVar));
    }

    @Override // lib.zj.office.fc.ss.usermodel.FormulaEvaluator
    public void notifySetFormula(ICell iCell) {
        this._bookEvaluator.notifyUpdateCell(new HSSFEvaluationCell((di.a) iCell));
    }

    public void notifyUpdateCell(di.a aVar) {
        this._bookEvaluator.notifyUpdateCell(new HSSFEvaluationCell(aVar));
    }

    private static void evaluateAllFormulaCells(Workbook workbook, FormulaEvaluator formulaEvaluator) {
    }

    public ValueEval evaluateFormulaValueEval(di.a aVar) {
        HSSFEvaluationCell hSSFEvaluationCell = this.hssfEvaluationCell;
        if (hSSFEvaluationCell != null) {
            hSSFEvaluationCell.setHSSFCell(aVar);
        } else {
            this.hssfEvaluationCell = new HSSFEvaluationCell(aVar);
        }
        this._bookEvaluator.clearAllCachedResultValues();
        return this._bookEvaluator.evaluate(this.hssfEvaluationCell);
    }

    @Override // lib.zj.office.fc.ss.usermodel.FormulaEvaluator
    public HSSFCell evaluateInCell(ICell iCell) {
        if (iCell == null) {
            return null;
        }
        HSSFCell hSSFCell = (HSSFCell) iCell;
        if (iCell.getCellType() == 2) {
            CellValue evaluateFormulaCellValue = evaluateFormulaCellValue(iCell);
            setCellValue(iCell, evaluateFormulaCellValue);
            setCellType(iCell, evaluateFormulaCellValue);
        }
        return hSSFCell;
    }

    @Override // lib.zj.office.fc.ss.usermodel.FormulaEvaluator
    public void notifyDeleteCell(ICell iCell) {
        this._bookEvaluator.notifyDeleteCell(new HSSFEvaluationCell((di.a) iCell));
    }

    @Override // lib.zj.office.fc.ss.usermodel.FormulaEvaluator
    public void notifyUpdateCell(ICell iCell) {
        this._bookEvaluator.notifyUpdateCell(new HSSFEvaluationCell((di.a) iCell));
    }

    public HSSFFormulaEvaluator(e eVar) {
        this(eVar, (IStabilityClassifier) null);
        this._book = eVar;
    }

    public static void evaluateAllFormulaCells(e eVar) {
        evaluateAllFormulaCells(eVar, new HSSFFormulaEvaluator(eVar));
    }

    public HSSFFormulaEvaluator(e eVar, IStabilityClassifier iStabilityClassifier) {
        this(eVar, iStabilityClassifier, null);
    }

    private HSSFFormulaEvaluator(e eVar, IStabilityClassifier iStabilityClassifier, UDFFinder uDFFinder) {
        this.hssfEvaluationCell = null;
        this._bookEvaluator = new WorkbookEvaluator(HSSFEvaluationWorkbook.create(eVar), iStabilityClassifier, uDFFinder);
    }

    public void setCurrentRow(HSSFRow hSSFRow) {
    }
}
