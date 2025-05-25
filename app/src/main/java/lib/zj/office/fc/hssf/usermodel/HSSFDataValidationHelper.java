package lib.zj.office.fc.hssf.usermodel;

import lib.zj.office.fc.ss.usermodel.DataValidation;
import lib.zj.office.fc.ss.usermodel.DataValidationConstraint;
import lib.zj.office.fc.ss.usermodel.DataValidationHelper;
import lib.zj.office.fc.ss.util.CellRangeAddressList;

/* loaded from: classes3.dex */
public class HSSFDataValidationHelper implements DataValidationHelper {
    private HSSFSheet sheet;

    public HSSFDataValidationHelper(HSSFSheet hSSFSheet) {
        this.sheet = hSSFSheet;
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidationHelper
    public DataValidationConstraint createCustomConstraint(String str) {
        return DVConstraint.createCustomFormulaConstraint(str);
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidationHelper
    public DataValidationConstraint createDateConstraint(int i10, String str, String str2, String str3) {
        return DVConstraint.createDateConstraint(i10, str, str2, str3);
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidationHelper
    public DataValidationConstraint createDecimalConstraint(int i10, String str, String str2) {
        return DVConstraint.createNumericConstraint(2, i10, str, str2);
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidationHelper
    public DataValidationConstraint createExplicitListConstraint(String[] strArr) {
        return DVConstraint.createExplicitListConstraint(strArr);
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidationHelper
    public DataValidationConstraint createFormulaListConstraint(String str) {
        return DVConstraint.createFormulaListConstraint(str);
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidationHelper
    public DataValidationConstraint createIntegerConstraint(int i10, String str, String str2) {
        return DVConstraint.createNumericConstraint(1, i10, str, str2);
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidationHelper
    public DataValidationConstraint createNumericConstraint(int i10, int i11, String str, String str2) {
        return DVConstraint.createNumericConstraint(i10, i11, str, str2);
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidationHelper
    public DataValidationConstraint createTextLengthConstraint(int i10, String str, String str2) {
        return DVConstraint.createNumericConstraint(6, i10, str, str2);
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidationHelper
    public DataValidationConstraint createTimeConstraint(int i10, String str, String str2) {
        return DVConstraint.createTimeConstraint(i10, str, str2);
    }

    @Override // lib.zj.office.fc.ss.usermodel.DataValidationHelper
    public DataValidation createValidation(DataValidationConstraint dataValidationConstraint, CellRangeAddressList cellRangeAddressList) {
        return new HSSFDataValidation(cellRangeAddressList, dataValidationConstraint);
    }
}
