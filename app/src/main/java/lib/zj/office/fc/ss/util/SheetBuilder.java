package lib.zj.office.fc.ss.util;

import java.util.Calendar;
import java.util.Date;
import lib.zj.office.fc.ss.usermodel.ICell;
import lib.zj.office.fc.ss.usermodel.Sheet;
import lib.zj.office.fc.ss.usermodel.Workbook;

/* loaded from: classes3.dex */
public class SheetBuilder {
    private Object[][] cells;
    private boolean shouldCreateEmptyCells = false;
    private Workbook workbook;

    public SheetBuilder(Workbook workbook, Object[][] objArr) {
        this.workbook = workbook;
        this.cells = objArr;
    }

    private String getFormula(Object obj) {
        return ((String) obj).substring(1);
    }

    private boolean isFormulaDefinition(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        if (str.length() < 2 || str.charAt(0) != '=') {
            return false;
        }
        return true;
    }

    public Sheet build() {
        return null;
    }

    public boolean getCreateEmptyCells() {
        return this.shouldCreateEmptyCells;
    }

    public void setCellValue(ICell iCell, Object obj) {
        if (obj != null && iCell != null) {
            if (obj instanceof Number) {
                iCell.setCellValue(((Number) obj).doubleValue());
            } else if (obj instanceof Date) {
                iCell.setCellValue((Date) obj);
            } else if (obj instanceof Calendar) {
                iCell.setCellValue((Calendar) obj);
            } else if (isFormulaDefinition(obj)) {
                iCell.setCellFormula(getFormula(obj));
            } else {
                iCell.setCellValue(obj.toString());
            }
        }
    }

    public SheetBuilder setCreateEmptyCells(boolean z10) {
        this.shouldCreateEmptyCells = z10;
        return this;
    }
}
