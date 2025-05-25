package lib.zj.office.fc.ss.util;

import a6.h;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.ss.usermodel.ICell;
import lib.zj.office.fc.ss.usermodel.ICellStyle;
import lib.zj.office.fc.ss.usermodel.IFont;
import lib.zj.office.fc.ss.usermodel.IRow;
import lib.zj.office.fc.ss.usermodel.Sheet;
import lib.zj.office.fc.ss.usermodel.Workbook;

/* loaded from: classes3.dex */
public final class CellUtil {
    public static final String ALIGNMENT = "alignment";
    public static final String BORDER_BOTTOM = "borderBottom";
    public static final String BORDER_LEFT = "borderLeft";
    public static final String BORDER_RIGHT = "borderRight";
    public static final String BORDER_TOP = "borderTop";
    public static final String BOTTOM_BORDER_COLOR = "bottomBorderColor";
    public static final String DATA_FORMAT = "dataFormat";
    public static final String FILL_BACKGROUND_COLOR = "fillBackgroundColor";
    public static final String FILL_FOREGROUND_COLOR = "fillForegroundColor";
    public static final String FILL_PATTERN = "fillPattern";
    public static final String FONT = "font";
    public static final String HIDDEN = "hidden";
    public static final String INDENTION = "indention";
    public static final String LEFT_BORDER_COLOR = "leftBorderColor";
    public static final String LOCKED = "locked";
    public static final String RIGHT_BORDER_COLOR = "rightBorderColor";
    public static final String ROTATION = "rotation";
    public static final String TOP_BORDER_COLOR = "topBorderColor";
    public static final String VERTICAL_ALIGNMENT = "verticalAlignment";
    public static final String WRAP_TEXT = "wrapText";
    private static UnicodeMapping[] unicodeMappings = {um("alpha", "α"), um("beta", "β"), um("gamma", "γ"), um("delta", "δ"), um("epsilon", "ε"), um("zeta", "ζ"), um("eta", "η"), um("theta", "θ"), um("iota", "ι"), um("kappa", "κ"), um("lambda", "λ"), um("mu", "μ"), um("nu", "ν"), um("xi", "ξ"), um("omicron", "ο")};

    /* loaded from: classes3.dex */
    public static final class UnicodeMapping {
        public final String entityName;
        public final String resolvedValue;

        public UnicodeMapping(String str, String str2) {
            this.entityName = h.d("&", str, ";");
            this.resolvedValue = str2;
        }
    }

    private CellUtil() {
    }

    public static ICell createCell(IRow iRow, int i10, String str, ICellStyle iCellStyle) {
        return null;
    }

    private static boolean getBoolean(Map<String, Object> map, String str) {
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public static ICell getCell(IRow iRow, int i10) {
        ICell cell = iRow.getCell(i10);
        if (cell == null) {
            return iRow.createCell(i10);
        }
        return cell;
    }

    private static Map<String, Object> getFormatProperties(ICellStyle iCellStyle) {
        HashMap hashMap = new HashMap();
        putShort(hashMap, ALIGNMENT, iCellStyle.getAlignment());
        putShort(hashMap, BORDER_BOTTOM, iCellStyle.getBorderBottom());
        putShort(hashMap, BORDER_LEFT, iCellStyle.getBorderLeft());
        putShort(hashMap, BORDER_RIGHT, iCellStyle.getBorderRight());
        putShort(hashMap, BORDER_TOP, iCellStyle.getBorderTop());
        putShort(hashMap, BOTTOM_BORDER_COLOR, iCellStyle.getBottomBorderColor());
        putShort(hashMap, DATA_FORMAT, iCellStyle.getDataFormat());
        putShort(hashMap, FILL_BACKGROUND_COLOR, iCellStyle.getFillBackgroundColor());
        putShort(hashMap, FILL_FOREGROUND_COLOR, iCellStyle.getFillForegroundColor());
        putShort(hashMap, FILL_PATTERN, iCellStyle.getFillPattern());
        putShort(hashMap, FONT, iCellStyle.getFontIndex());
        putBoolean(hashMap, HIDDEN, iCellStyle.getHidden());
        putShort(hashMap, INDENTION, iCellStyle.getIndention());
        putShort(hashMap, LEFT_BORDER_COLOR, iCellStyle.getLeftBorderColor());
        putBoolean(hashMap, LOCKED, iCellStyle.getLocked());
        putShort(hashMap, RIGHT_BORDER_COLOR, iCellStyle.getRightBorderColor());
        putShort(hashMap, ROTATION, iCellStyle.getRotation());
        putShort(hashMap, TOP_BORDER_COLOR, iCellStyle.getTopBorderColor());
        putShort(hashMap, VERTICAL_ALIGNMENT, iCellStyle.getVerticalAlignment());
        putBoolean(hashMap, WRAP_TEXT, iCellStyle.getWrapText());
        return hashMap;
    }

    public static IRow getRow(int i10, Sheet sheet) {
        return null;
    }

    private static short getShort(Map<String, Object> map, String str) {
        Object obj = map.get(str);
        if (obj instanceof Short) {
            return ((Short) obj).shortValue();
        }
        return (short) 0;
    }

    private static void putBoolean(Map<String, Object> map, String str, boolean z10) {
        map.put(str, Boolean.valueOf(z10));
    }

    private static void putShort(Map<String, Object> map, String str, short s4) {
        map.put(str, Short.valueOf(s4));
    }

    public static void setAlignment(ICell iCell, Workbook workbook, short s4) {
        setCellStyleProperty(iCell, workbook, ALIGNMENT, Short.valueOf(s4));
    }

    public static void setFont(ICell iCell, Workbook workbook, IFont iFont) {
        setCellStyleProperty(iCell, workbook, FONT, Short.valueOf(iFont.getIndex()));
    }

    public static ICell translateUnicodeValues(ICell iCell) {
        String string = iCell.getRichStringCellValue().getString();
        String lowerCase = string.toLowerCase();
        int i10 = 0;
        while (true) {
            UnicodeMapping[] unicodeMappingArr = unicodeMappings;
            if (i10 < unicodeMappingArr.length) {
                UnicodeMapping unicodeMapping = unicodeMappingArr[i10];
                String str = unicodeMapping.entityName;
                if (lowerCase.indexOf(str) != -1) {
                    string = string.replaceAll(str, unicodeMapping.resolvedValue);
                }
                i10++;
            } else {
                return iCell;
            }
        }
    }

    private static UnicodeMapping um(String str, String str2) {
        return new UnicodeMapping(str, str2);
    }

    public static ICell createCell(IRow iRow, int i10, String str) {
        return createCell(iRow, i10, str, null);
    }

    private static void setFormatProperties(ICellStyle iCellStyle, Workbook workbook, Map<String, Object> map) {
    }

    public static void setCellStyleProperty(ICell iCell, Workbook workbook, String str, Object obj) {
    }
}
