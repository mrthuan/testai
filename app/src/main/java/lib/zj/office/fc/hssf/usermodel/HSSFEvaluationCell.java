package lib.zj.office.fc.hssf.usermodel;

import di.a;
import di.c;
import lib.zj.office.fc.hssf.formula.EvaluationCell;
import lib.zj.office.fc.hssf.formula.EvaluationSheet;
import lib.zj.office.fc.hssf.record.CellValueRecordInterface;
import lib.zj.office.fc.hssf.record.LabelSSTRecord;
import lib.zj.office.fc.hssf.record.aggregates.FormulaRecordAggregate;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class HSSFEvaluationCell implements EvaluationCell {
    private a _cell;
    private EvaluationSheet _evalSheet;

    public HSSFEvaluationCell(a aVar, EvaluationSheet evaluationSheet) {
        this._cell = aVar;
        this._evalSheet = evaluationSheet;
    }

    public a getACell() {
        return this._cell;
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationCell
    public boolean getBooleanCellValue() {
        return this._cell.m();
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationCell
    public int getCellType() {
        return this._cell.f16589b;
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationCell
    public int getColumnIndex() {
        return this._cell.f16590d;
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationCell
    public int getErrorCellValue() {
        return this._cell.o();
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationCell
    public Object getIdentityKey() {
        return this._cell;
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationCell
    public double getNumericCellValue() {
        return this._cell.p();
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationCell
    public int getRowIndex() {
        return this._cell.c;
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationCell
    public EvaluationSheet getSheet() {
        return this._evalSheet;
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationCell
    public String getStringCellValue() {
        a aVar = this._cell;
        short s4 = aVar.f16589b;
        if (s4 != 1) {
            if (s4 != 2) {
                if (s4 == 3) {
                    return "";
                }
                throw a.s(1, s4, false);
            }
        } else {
            CellValueRecordInterface cellValueRecordInterface = aVar.f16202i;
            if (cellValueRecordInterface instanceof LabelSSTRecord) {
                return aVar.f16588a.f16601a.n(((LabelSSTRecord) cellValueRecordInterface).getSSTIndex());
            }
        }
        FormulaRecordAggregate formulaRecordAggregate = (FormulaRecordAggregate) aVar.f16202i;
        a.k(1, formulaRecordAggregate.getFormulaRecord());
        return formulaRecordAggregate.getStringValue();
    }

    public void setHSSFCell(a aVar) {
        this._cell = aVar;
        EvaluationSheet evaluationSheet = this._evalSheet;
        if (evaluationSheet != null) {
            ((HSSFEvaluationSheet) evaluationSheet).setASheet((c) aVar.f16588a);
        } else {
            this._evalSheet = new HSSFEvaluationSheet((c) aVar.f16588a);
        }
    }

    public HSSFEvaluationCell(a aVar) {
        this(aVar, new HSSFEvaluationSheet((c) aVar.f16588a));
    }
}
