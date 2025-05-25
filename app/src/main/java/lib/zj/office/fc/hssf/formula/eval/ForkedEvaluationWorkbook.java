package lib.zj.office.fc.hssf.formula.eval;

import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.hssf.formula.EvaluationCell;
import lib.zj.office.fc.hssf.formula.EvaluationName;
import lib.zj.office.fc.hssf.formula.EvaluationSheet;
import lib.zj.office.fc.hssf.formula.EvaluationWorkbook;
import lib.zj.office.fc.hssf.formula.ptg.NamePtg;
import lib.zj.office.fc.hssf.formula.ptg.NameXPtg;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.formula.udf.UDFFinder;
import lib.zj.office.fc.ss.usermodel.Workbook;

/* loaded from: classes3.dex */
final class ForkedEvaluationWorkbook implements EvaluationWorkbook {
    private final EvaluationWorkbook _masterBook;
    private final Map<String, ForkedEvaluationSheet> _sharedSheetsByName = new HashMap();

    /* loaded from: classes3.dex */
    public static final class OrderedSheet implements Comparable<OrderedSheet> {
        private final int _index;
        private final String _sheetName;

        public OrderedSheet(String str, int i10) {
            this._sheetName = str;
            this._index = i10;
        }

        public String getSheetName() {
            return this._sheetName;
        }

        @Override // java.lang.Comparable
        public int compareTo(OrderedSheet orderedSheet) {
            return this._index - orderedSheet._index;
        }
    }

    public ForkedEvaluationWorkbook(EvaluationWorkbook evaluationWorkbook) {
        this._masterBook = evaluationWorkbook;
    }

    private ForkedEvaluationSheet getSharedSheet(String str) {
        ForkedEvaluationSheet forkedEvaluationSheet = this._sharedSheetsByName.get(str);
        if (forkedEvaluationSheet == null) {
            EvaluationWorkbook evaluationWorkbook = this._masterBook;
            ForkedEvaluationSheet forkedEvaluationSheet2 = new ForkedEvaluationSheet(evaluationWorkbook.getSheet(evaluationWorkbook.getSheetIndex(str)));
            this._sharedSheetsByName.put(str, forkedEvaluationSheet2);
            return forkedEvaluationSheet2;
        }
        return forkedEvaluationSheet;
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationWorkbook
    public int convertFromExternSheetIndex(int i10) {
        return this._masterBook.convertFromExternSheetIndex(i10);
    }

    public EvaluationCell getEvaluationCell(String str, int i10, int i11) {
        return getSharedSheet(str).getCell(i10, i11);
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationWorkbook
    public EvaluationWorkbook.ExternalName getExternalName(int i10, int i11) {
        return this._masterBook.getExternalName(i10, i11);
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationWorkbook
    public EvaluationWorkbook.ExternalSheet getExternalSheet(int i10) {
        return this._masterBook.getExternalSheet(i10);
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationWorkbook
    public Ptg[] getFormulaTokens(EvaluationCell evaluationCell) {
        if (!(evaluationCell instanceof ForkedEvaluationCell)) {
            return this._masterBook.getFormulaTokens(evaluationCell);
        }
        throw new RuntimeException("Updated formulas not supported yet");
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationWorkbook
    public EvaluationName getName(NamePtg namePtg) {
        return this._masterBook.getName(namePtg);
    }

    public ForkedEvaluationCell getOrCreateUpdatableCell(String str, int i10, int i11) {
        return getSharedSheet(str).getOrCreateUpdatableCell(i10, i11);
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationWorkbook
    public EvaluationSheet getSheet(int i10) {
        return getSharedSheet(getSheetName(i10));
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationWorkbook
    public int getSheetIndex(EvaluationSheet evaluationSheet) {
        if (evaluationSheet instanceof ForkedEvaluationSheet) {
            return ((ForkedEvaluationSheet) evaluationSheet).getSheetIndex(this._masterBook);
        }
        return this._masterBook.getSheetIndex(evaluationSheet);
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationWorkbook
    public String getSheetName(int i10) {
        return this._masterBook.getSheetName(i10);
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationWorkbook
    public UDFFinder getUDFFinder() {
        return this._masterBook.getUDFFinder();
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationWorkbook
    public String resolveNameXText(NameXPtg nameXPtg) {
        return this._masterBook.resolveNameXText(nameXPtg);
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationWorkbook
    public EvaluationName getName(String str, int i10) {
        return this._masterBook.getName(str, i10);
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationWorkbook
    public int getSheetIndex(String str) {
        return this._masterBook.getSheetIndex(str);
    }

    public void copyUpdatedCells(Workbook workbook) {
    }
}
