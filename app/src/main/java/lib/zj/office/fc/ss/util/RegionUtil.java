package lib.zj.office.fc.ss.util;

import lib.zj.office.fc.ss.usermodel.IRow;
import lib.zj.office.fc.ss.usermodel.Sheet;
import lib.zj.office.fc.ss.usermodel.Workbook;

/* loaded from: classes3.dex */
public final class RegionUtil {

    /* loaded from: classes3.dex */
    public static final class CellPropertySetter {
        private final String _propertyName;
        private final Short _propertyValue;
        private final Workbook _workbook;

        public CellPropertySetter(Workbook workbook, String str, int i10) {
            this._workbook = workbook;
            this._propertyName = str;
            this._propertyValue = Short.valueOf((short) i10);
        }

        public void setProperty(IRow iRow, int i10) {
            CellUtil.setCellStyleProperty(CellUtil.getCell(iRow, i10), this._workbook, this._propertyName, this._propertyValue);
        }
    }

    private RegionUtil() {
    }

    public static void setBorderBottom(int i10, HSSFCellRangeAddress hSSFCellRangeAddress, Sheet sheet, Workbook workbook) {
        int lastColumn = hSSFCellRangeAddress.getLastColumn();
        int lastRow = hSSFCellRangeAddress.getLastRow();
        CellPropertySetter cellPropertySetter = new CellPropertySetter(workbook, CellUtil.BORDER_BOTTOM, i10);
        IRow row = CellUtil.getRow(lastRow, sheet);
        for (int firstColumn = hSSFCellRangeAddress.getFirstColumn(); firstColumn <= lastColumn; firstColumn++) {
            cellPropertySetter.setProperty(row, firstColumn);
        }
    }

    public static void setBorderLeft(int i10, HSSFCellRangeAddress hSSFCellRangeAddress, Sheet sheet, Workbook workbook) {
        int lastRow = hSSFCellRangeAddress.getLastRow();
        int firstColumn = hSSFCellRangeAddress.getFirstColumn();
        CellPropertySetter cellPropertySetter = new CellPropertySetter(workbook, CellUtil.BORDER_LEFT, i10);
        for (int firstRow = hSSFCellRangeAddress.getFirstRow(); firstRow <= lastRow; firstRow++) {
            cellPropertySetter.setProperty(CellUtil.getRow(firstRow, sheet), firstColumn);
        }
    }

    public static void setBorderRight(int i10, HSSFCellRangeAddress hSSFCellRangeAddress, Sheet sheet, Workbook workbook) {
        int lastRow = hSSFCellRangeAddress.getLastRow();
        int lastColumn = hSSFCellRangeAddress.getLastColumn();
        CellPropertySetter cellPropertySetter = new CellPropertySetter(workbook, CellUtil.BORDER_RIGHT, i10);
        for (int firstRow = hSSFCellRangeAddress.getFirstRow(); firstRow <= lastRow; firstRow++) {
            cellPropertySetter.setProperty(CellUtil.getRow(firstRow, sheet), lastColumn);
        }
    }

    public static void setBorderTop(int i10, HSSFCellRangeAddress hSSFCellRangeAddress, Sheet sheet, Workbook workbook) {
        int lastColumn = hSSFCellRangeAddress.getLastColumn();
        int firstRow = hSSFCellRangeAddress.getFirstRow();
        CellPropertySetter cellPropertySetter = new CellPropertySetter(workbook, CellUtil.BORDER_TOP, i10);
        IRow row = CellUtil.getRow(firstRow, sheet);
        for (int firstColumn = hSSFCellRangeAddress.getFirstColumn(); firstColumn <= lastColumn; firstColumn++) {
            cellPropertySetter.setProperty(row, firstColumn);
        }
    }

    public static void setBottomBorderColor(int i10, HSSFCellRangeAddress hSSFCellRangeAddress, Sheet sheet, Workbook workbook) {
        int lastColumn = hSSFCellRangeAddress.getLastColumn();
        int lastRow = hSSFCellRangeAddress.getLastRow();
        CellPropertySetter cellPropertySetter = new CellPropertySetter(workbook, CellUtil.BOTTOM_BORDER_COLOR, i10);
        IRow row = CellUtil.getRow(lastRow, sheet);
        for (int firstColumn = hSSFCellRangeAddress.getFirstColumn(); firstColumn <= lastColumn; firstColumn++) {
            cellPropertySetter.setProperty(row, firstColumn);
        }
    }

    public static void setLeftBorderColor(int i10, HSSFCellRangeAddress hSSFCellRangeAddress, Sheet sheet, Workbook workbook) {
        int lastRow = hSSFCellRangeAddress.getLastRow();
        int firstColumn = hSSFCellRangeAddress.getFirstColumn();
        CellPropertySetter cellPropertySetter = new CellPropertySetter(workbook, CellUtil.LEFT_BORDER_COLOR, i10);
        for (int firstRow = hSSFCellRangeAddress.getFirstRow(); firstRow <= lastRow; firstRow++) {
            cellPropertySetter.setProperty(CellUtil.getRow(firstRow, sheet), firstColumn);
        }
    }

    public static void setRightBorderColor(int i10, HSSFCellRangeAddress hSSFCellRangeAddress, Sheet sheet, Workbook workbook) {
        int lastRow = hSSFCellRangeAddress.getLastRow();
        int lastColumn = hSSFCellRangeAddress.getLastColumn();
        CellPropertySetter cellPropertySetter = new CellPropertySetter(workbook, CellUtil.RIGHT_BORDER_COLOR, i10);
        for (int firstRow = hSSFCellRangeAddress.getFirstRow(); firstRow <= lastRow; firstRow++) {
            cellPropertySetter.setProperty(CellUtil.getRow(firstRow, sheet), lastColumn);
        }
    }

    public static void setTopBorderColor(int i10, HSSFCellRangeAddress hSSFCellRangeAddress, Sheet sheet, Workbook workbook) {
        int lastColumn = hSSFCellRangeAddress.getLastColumn();
        int firstRow = hSSFCellRangeAddress.getFirstRow();
        CellPropertySetter cellPropertySetter = new CellPropertySetter(workbook, CellUtil.TOP_BORDER_COLOR, i10);
        IRow row = CellUtil.getRow(firstRow, sheet);
        for (int firstColumn = hSSFCellRangeAddress.getFirstColumn(); firstColumn <= lastColumn; firstColumn++) {
            cellPropertySetter.setProperty(row, firstColumn);
        }
    }
}
