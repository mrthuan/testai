package lib.zj.office.fc.hssf.formula.eval;

import a6.h;
import lib.zj.office.fc.hssf.formula.EvaluationCell;
import lib.zj.office.fc.hssf.formula.EvaluationSheet;
import lib.zj.office.fc.ss.usermodel.ICell;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ForkedEvaluationCell implements EvaluationCell {
    private boolean _booleanValue;
    private int _cellType;
    private int _errorValue;
    private final EvaluationCell _masterCell;
    private double _numberValue;
    private final EvaluationSheet _sheet;
    private String _stringValue;

    public ForkedEvaluationCell(ForkedEvaluationSheet forkedEvaluationSheet, EvaluationCell evaluationCell) {
        this._sheet = forkedEvaluationSheet;
        this._masterCell = evaluationCell;
        setValue(BlankEval.instance);
    }

    private void checkCellType(int i10) {
        if (this._cellType == i10) {
            return;
        }
        throw new RuntimeException(h.g(new StringBuilder("Wrong data type ("), this._cellType, ")"));
    }

    public void copyValue(ICell iCell) {
        int i10 = this._cellType;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            iCell.setCellErrorValue((byte) this._errorValue);
                            return;
                        }
                        throw new IllegalStateException(h.g(new StringBuilder("Unexpected data type ("), this._cellType, ")"));
                    }
                    iCell.setCellValue(this._booleanValue);
                    return;
                }
                iCell.setCellType(3);
                return;
            }
            iCell.setCellValue(this._stringValue);
            return;
        }
        iCell.setCellValue(this._numberValue);
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationCell
    public boolean getBooleanCellValue() {
        checkCellType(4);
        return this._booleanValue;
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationCell
    public int getCellType() {
        return this._cellType;
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationCell
    public int getColumnIndex() {
        return this._masterCell.getColumnIndex();
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationCell
    public int getErrorCellValue() {
        checkCellType(5);
        return this._errorValue;
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationCell
    public Object getIdentityKey() {
        return this._masterCell.getIdentityKey();
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationCell
    public double getNumericCellValue() {
        checkCellType(0);
        return this._numberValue;
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationCell
    public int getRowIndex() {
        return this._masterCell.getRowIndex();
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationCell
    public EvaluationSheet getSheet() {
        return this._sheet;
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationCell
    public String getStringCellValue() {
        checkCellType(1);
        return this._stringValue;
    }

    public void setValue(ValueEval valueEval) {
        Class<?> cls = valueEval.getClass();
        if (cls == NumberEval.class) {
            this._cellType = 0;
            this._numberValue = ((NumberEval) valueEval).getNumberValue();
        } else if (cls == StringEval.class) {
            this._cellType = 1;
            this._stringValue = ((StringEval) valueEval).getStringValue();
        } else if (cls == BoolEval.class) {
            this._cellType = 4;
            this._booleanValue = ((BoolEval) valueEval).getBooleanValue();
        } else if (cls == ErrorEval.class) {
            this._cellType = 5;
            this._errorValue = ((ErrorEval) valueEval).getErrorCode();
        } else if (cls == BlankEval.class) {
            this._cellType = 3;
        } else {
            throw new IllegalArgumentException("Unexpected value class (" + cls.getName() + ")");
        }
    }
}
