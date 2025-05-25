package lib.zj.office.fc.hssf.util;

import lib.zj.office.fc.hssf.usermodel.HSSFCell;
import lib.zj.office.fc.hssf.usermodel.HSSFCellStyle;
import lib.zj.office.fc.hssf.usermodel.HSSFFont;
import lib.zj.office.fc.hssf.usermodel.HSSFRow;
import lib.zj.office.fc.hssf.usermodel.HSSFSheet;
import lib.zj.office.fc.hssf.usermodel.HSSFWorkbook;
import lib.zj.office.fc.ss.util.CellUtil;

/* loaded from: classes3.dex */
public final class HSSFCellUtil {
    private HSSFCellUtil() {
    }

    public static HSSFCell createCell(HSSFRow hSSFRow, int i10, String str, HSSFCellStyle hSSFCellStyle) {
        return (HSSFCell) CellUtil.createCell(hSSFRow, i10, str, hSSFCellStyle);
    }

    public static HSSFCell getCell(HSSFRow hSSFRow, int i10) {
        return (HSSFCell) CellUtil.getCell(hSSFRow, i10);
    }

    public static HSSFRow getRow(int i10, HSSFSheet hSSFSheet) {
        return (HSSFRow) CellUtil.getRow(i10, hSSFSheet);
    }

    public static void setAlignment(HSSFCell hSSFCell, HSSFWorkbook hSSFWorkbook, short s4) {
        CellUtil.setAlignment(hSSFCell, hSSFWorkbook, s4);
    }

    public static void setCellStyleProperty(HSSFCell hSSFCell, HSSFWorkbook hSSFWorkbook, String str, Object obj) {
        CellUtil.setCellStyleProperty(hSSFCell, hSSFWorkbook, str, obj);
    }

    public static void setFont(HSSFCell hSSFCell, HSSFWorkbook hSSFWorkbook, HSSFFont hSSFFont) {
        CellUtil.setFont(hSSFCell, hSSFWorkbook, hSSFFont);
    }

    public static HSSFCell translateUnicodeValues(HSSFCell hSSFCell) {
        CellUtil.translateUnicodeValues(hSSFCell);
        return hSSFCell;
    }

    public static HSSFCell createCell(HSSFRow hSSFRow, int i10, String str) {
        return createCell(hSSFRow, i10, str, null);
    }
}
