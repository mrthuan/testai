package lib.zj.office.fc.hssf.usermodel;

import lib.zj.office.fc.hssf.record.DVRecord;
import lib.zj.office.fc.hssf.usermodel.DVConstraint;
import lib.zj.office.fc.ss.usermodel.DataValidation;
import lib.zj.office.fc.ss.usermodel.DataValidationConstraint;
import lib.zj.office.fc.ss.util.CellRangeAddressList;

/* loaded from: classes3.dex */
public final class HSSFDataValidation implements DataValidation {
    private DVConstraint _constraint;
    private String _error_text;
    private String _error_title;
    private String _prompt_text;
    private String _prompt_title;
    private CellRangeAddressList _regions;
    private int _errorStyle = 0;
    private boolean _emptyCellAllowed = true;
    private boolean _suppress_dropdown_arrow = false;
    private boolean _showPromptBox = true;
    private boolean _showErrorBox = true;

    public HSSFDataValidation(CellRangeAddressList cellRangeAddressList, DataValidationConstraint dataValidationConstraint) {
        this._regions = cellRangeAddressList;
        this._constraint = (DVConstraint) dataValidationConstraint;
    }

    public DVRecord createDVRecord(HSSFSheet hSSFSheet) {
        boolean z10;
        DVConstraint.FormulaPair createFormulas = this._constraint.createFormulas(hSSFSheet);
        int validationType = this._constraint.getValidationType();
        int operator = this._constraint.getOperator();
        int i10 = this._errorStyle;
        boolean z11 = this._emptyCellAllowed;
        boolean suppressDropDownArrow = getSuppressDropDownArrow();
        if (this._constraint.getValidationType() == 3 && this._constraint.getExplicitListValues() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new DVRecord(validationType, operator, i10, z11, suppressDropDownArrow, z10, this._showPromptBox, this._prompt_title, this._prompt_text, this._showErrorBox, this._error_title, this._error_text, createFormulas.getFormula1(), createFormulas.getFormula2(), this._regions);
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidation
    public void createErrorBox(String str, String str2) {
        this._error_title = str;
        this._error_text = str2;
        setShowErrorBox(true);
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidation
    public void createPromptBox(String str, String str2) {
        this._prompt_title = str;
        this._prompt_text = str2;
        setShowPromptBox(true);
    }

    public DVConstraint getConstraint() {
        return this._constraint;
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidation
    public boolean getEmptyCellAllowed() {
        return this._emptyCellAllowed;
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidation
    public String getErrorBoxText() {
        return this._error_text;
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidation
    public String getErrorBoxTitle() {
        return this._error_title;
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidation
    public int getErrorStyle() {
        return this._errorStyle;
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidation
    public String getPromptBoxText() {
        return this._prompt_text;
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidation
    public String getPromptBoxTitle() {
        return this._prompt_title;
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidation
    public CellRangeAddressList getRegions() {
        return this._regions;
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidation
    public boolean getShowErrorBox() {
        return this._showErrorBox;
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidation
    public boolean getShowPromptBox() {
        return this._showPromptBox;
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidation
    public boolean getSuppressDropDownArrow() {
        if (this._constraint.getValidationType() == 3) {
            return this._suppress_dropdown_arrow;
        }
        return false;
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidation
    public DataValidationConstraint getValidationConstraint() {
        return this._constraint;
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidation
    public void setEmptyCellAllowed(boolean z10) {
        this._emptyCellAllowed = z10;
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidation
    public void setErrorStyle(int i10) {
        this._errorStyle = i10;
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidation
    public void setShowErrorBox(boolean z10) {
        this._showErrorBox = z10;
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidation
    public void setShowPromptBox(boolean z10) {
        this._showPromptBox = z10;
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidation
    public void setSuppressDropDownArrow(boolean z10) {
        this._suppress_dropdown_arrow = z10;
    }
}
