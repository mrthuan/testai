package lib.zj.office.fc.hssf.formula;

/* loaded from: classes3.dex */
public interface EvaluationCell {
    boolean getBooleanCellValue();

    int getCellType();

    int getColumnIndex();

    int getErrorCellValue();

    Object getIdentityKey();

    double getNumericCellValue();

    int getRowIndex();

    EvaluationSheet getSheet();

    String getStringCellValue();
}
