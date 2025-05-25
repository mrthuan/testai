package lib.zj.office.fc.hssf.usermodel;

import di.e;
import lib.zj.office.fc.hssf.formula.EvaluationCell;
import lib.zj.office.fc.hssf.formula.EvaluationName;
import lib.zj.office.fc.hssf.formula.EvaluationSheet;
import lib.zj.office.fc.hssf.formula.EvaluationWorkbook;
import lib.zj.office.fc.hssf.formula.FormulaParsingWorkbook;
import lib.zj.office.fc.hssf.formula.FormulaRenderingWorkbook;
import lib.zj.office.fc.hssf.formula.ptg.NamePtg;
import lib.zj.office.fc.hssf.formula.ptg.NameXPtg;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.formula.udf.UDFFinder;
import lib.zj.office.fc.hssf.model.InternalWorkbook;
import lib.zj.office.fc.hssf.record.NameRecord;
import lib.zj.office.fc.hssf.record.aggregates.FormulaRecordAggregate;
import lib.zj.office.fc.ss.SpreadsheetVersion;

/* loaded from: classes3.dex */
public final class HSSFEvaluationWorkbook implements FormulaRenderingWorkbook, EvaluationWorkbook, FormulaParsingWorkbook {
    private final InternalWorkbook _iBook;
    private final e _uBook;

    /* loaded from: classes3.dex */
    public static final class Name implements EvaluationName {
        private final int _index;
        private final NameRecord _nameRecord;

        public Name(NameRecord nameRecord, int i10) {
            this._nameRecord = nameRecord;
            this._index = i10;
        }

        @Override // lib.zj.office.fc.hssf.formula.EvaluationName
        public NamePtg createPtg() {
            return new NamePtg(this._index);
        }

        @Override // lib.zj.office.fc.hssf.formula.EvaluationName
        public Ptg[] getNameDefinition() {
            return this._nameRecord.getNameDefinition();
        }

        @Override // lib.zj.office.fc.hssf.formula.EvaluationName
        public String getNameText() {
            return this._nameRecord.getNameText();
        }

        @Override // lib.zj.office.fc.hssf.formula.EvaluationName
        public boolean hasFormula() {
            return this._nameRecord.hasFormula();
        }

        @Override // lib.zj.office.fc.hssf.formula.EvaluationName
        public boolean isFunctionName() {
            return this._nameRecord.isFunctionName();
        }

        @Override // lib.zj.office.fc.hssf.formula.EvaluationName
        public boolean isRange() {
            return this._nameRecord.hasFormula();
        }
    }

    private HSSFEvaluationWorkbook(e eVar) {
        this._uBook = eVar;
        this._iBook = eVar.f16209m;
    }

    public static HSSFEvaluationWorkbook create(e eVar) {
        if (eVar == null) {
            return null;
        }
        return new HSSFEvaluationWorkbook(eVar);
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationWorkbook
    public int convertFromExternSheetIndex(int i10) {
        return this._iBook.getSheetIndexFromExternSheetIndex(i10);
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationWorkbook
    public EvaluationWorkbook.ExternalName getExternalName(int i10, int i11) {
        return this._iBook.getExternalName(i10, i11);
    }

    @Override // lib.zj.office.fc.hssf.formula.FormulaRenderingWorkbook, lib.zj.office.fc.hssf.formula.EvaluationWorkbook
    public EvaluationWorkbook.ExternalSheet getExternalSheet(int i10) {
        return this._iBook.getExternalSheet(i10);
    }

    @Override // lib.zj.office.fc.hssf.formula.FormulaParsingWorkbook
    public int getExternalSheetIndex(String str) {
        return this._iBook.checkExternSheet(this._uBook.f16209m.getSheetIndex(str));
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationWorkbook
    public Ptg[] getFormulaTokens(EvaluationCell evaluationCell) {
        return ((FormulaRecordAggregate) ((HSSFEvaluationCell) evaluationCell).getACell().f16202i).getFormulaTokens();
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationWorkbook
    public EvaluationName getName(String str, int i10) {
        for (int i11 = 0; i11 < this._iBook.getNumNames(); i11++) {
            NameRecord nameRecord = this._iBook.getNameRecord(i11);
            if (nameRecord.getSheetNumber() == i10 + 1 && str.equalsIgnoreCase(nameRecord.getNameText())) {
                return new Name(nameRecord, i11);
            }
        }
        if (i10 == -1) {
            return null;
        }
        return getName(str, -1);
    }

    @Override // lib.zj.office.fc.hssf.formula.FormulaRenderingWorkbook
    public String getNameText(NamePtg namePtg) {
        return this._iBook.getNameRecord(namePtg.getIndex()).getNameText();
    }

    @Override // lib.zj.office.fc.hssf.formula.FormulaParsingWorkbook
    public NameXPtg getNameXPtg(String str) {
        return this._iBook.getNameXPtg(str, this._uBook.f16208l);
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationWorkbook
    public EvaluationSheet getSheet(int i10) {
        return new HSSFEvaluationSheet(this._uBook.getSheetAt(i10));
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationWorkbook
    public int getSheetIndex(EvaluationSheet evaluationSheet) {
        return this._uBook.r(((HSSFEvaluationSheet) evaluationSheet).getASheet());
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationWorkbook
    public String getSheetName(int i10) {
        return this._uBook.o(i10).f16612m;
    }

    @Override // lib.zj.office.fc.hssf.formula.FormulaRenderingWorkbook
    public String getSheetNameByExternSheet(int i10) {
        return this._iBook.findSheetNameFromExternSheet(i10);
    }

    @Override // lib.zj.office.fc.hssf.formula.FormulaParsingWorkbook
    public SpreadsheetVersion getSpreadsheetVersion() {
        return SpreadsheetVersion.EXCEL97;
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationWorkbook
    public UDFFinder getUDFFinder() {
        return this._uBook.f16208l;
    }

    @Override // lib.zj.office.fc.hssf.formula.FormulaRenderingWorkbook, lib.zj.office.fc.hssf.formula.EvaluationWorkbook
    public String resolveNameXText(NameXPtg nameXPtg) {
        return this._iBook.resolveNameXText(nameXPtg.getSheetRefIndex(), nameXPtg.getNameIndex());
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationWorkbook
    public int getSheetIndex(String str) {
        return this._uBook.f16209m.getSheetIndex(str);
    }

    @Override // lib.zj.office.fc.hssf.formula.FormulaParsingWorkbook
    public int getExternalSheetIndex(String str, String str2) {
        return this._iBook.getExternalSheetIndex(str, str2);
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationWorkbook
    public EvaluationName getName(NamePtg namePtg) {
        int index = namePtg.getIndex();
        return new Name(this._iBook.getNameRecord(index), index);
    }

    public EvaluationName getName(NameXPtg nameXPtg) {
        int nameIndex = nameXPtg.getNameIndex();
        return new Name(this._iBook.getNameRecord(nameIndex), nameIndex);
    }
}
