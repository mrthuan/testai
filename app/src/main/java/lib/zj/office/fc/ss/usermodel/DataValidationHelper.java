package lib.zj.office.fc.ss.usermodel;

import lib.zj.office.fc.ss.util.CellRangeAddressList;

/* loaded from: classes3.dex */
public interface DataValidationHelper {
    DataValidationConstraint createCustomConstraint(String str);

    DataValidationConstraint createDateConstraint(int i10, String str, String str2, String str3);

    DataValidationConstraint createDecimalConstraint(int i10, String str, String str2);

    DataValidationConstraint createExplicitListConstraint(String[] strArr);

    DataValidationConstraint createFormulaListConstraint(String str);

    DataValidationConstraint createIntegerConstraint(int i10, String str, String str2);

    DataValidationConstraint createNumericConstraint(int i10, int i11, String str, String str2);

    DataValidationConstraint createTextLengthConstraint(int i10, String str, String str2);

    DataValidationConstraint createTimeConstraint(int i10, String str, String str2);

    DataValidation createValidation(DataValidationConstraint dataValidationConstraint, CellRangeAddressList cellRangeAddressList);
}
