package lib.zj.office.fc.hssf.formula;

import lib.zj.office.fc.hssf.formula.ptg.NamePtg;
import lib.zj.office.fc.hssf.formula.ptg.NameXPtg;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.formula.udf.UDFFinder;

/* loaded from: classes3.dex */
public interface EvaluationWorkbook {

    /* loaded from: classes3.dex */
    public static class ExternalName {
        private final int _ix;
        private final String _nameName;
        private final int _nameNumber;

        public ExternalName(String str, int i10, int i11) {
            this._nameName = str;
            this._nameNumber = i10;
            this._ix = i11;
        }

        public int getIx() {
            return this._ix;
        }

        public String getName() {
            return this._nameName;
        }

        public int getNumber() {
            return this._nameNumber;
        }
    }

    /* loaded from: classes3.dex */
    public static class ExternalSheet {
        private final String _sheetName;
        private final String _workbookName;

        public ExternalSheet(String str, String str2) {
            this._workbookName = str;
            this._sheetName = str2;
        }

        public String getSheetName() {
            return this._sheetName;
        }

        public String getWorkbookName() {
            return this._workbookName;
        }
    }

    int convertFromExternSheetIndex(int i10);

    ExternalName getExternalName(int i10, int i11);

    ExternalSheet getExternalSheet(int i10);

    Ptg[] getFormulaTokens(EvaluationCell evaluationCell);

    EvaluationName getName(String str, int i10);

    EvaluationName getName(NamePtg namePtg);

    EvaluationSheet getSheet(int i10);

    int getSheetIndex(String str);

    int getSheetIndex(EvaluationSheet evaluationSheet);

    String getSheetName(int i10);

    UDFFinder getUDFFinder();

    String resolveNameXText(NameXPtg nameXPtg);
}
