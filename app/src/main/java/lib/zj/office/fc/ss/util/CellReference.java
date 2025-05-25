package lib.zj.office.fc.ss.util;

import a6.h;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lib.zj.office.fc.hssf.formula.SheetNameFormatter;
import lib.zj.office.fc.ss.SpreadsheetVersion;
import lib.zj.office.fc.ss.usermodel.ICell;

/* loaded from: classes3.dex */
public class CellReference {
    private static final char ABSOLUTE_REFERENCE_MARKER = '$';
    private static final char SHEET_NAME_DELIMITER = '!';
    private static final char SPECIAL_NAME_DELIMITER = '\'';
    private final int _colIndex;
    private final boolean _isColAbs;
    private final boolean _isRowAbs;
    private final int _rowIndex;
    private final String _sheetName;
    private static final Pattern CELL_REF_PATTERN = Pattern.compile("\\$?([A-Za-z]+)\\$?([0-9]+)");
    private static final Pattern COLUMN_REF_PATTERN = Pattern.compile("\\$?([A-Za-z]+)");
    private static final Pattern ROW_REF_PATTERN = Pattern.compile("\\$?([0-9]+)");
    private static final Pattern NAMED_RANGE_NAME_PATTERN = Pattern.compile("[_A-Za-z][_.A-Za-z0-9]*");

    /* loaded from: classes3.dex */
    public enum NameType {
        CELL,
        NAMED_RANGE,
        COLUMN,
        ROW,
        BAD_CELL_OR_NAMED_RANGE
    }

    public CellReference(String str) {
        if (!str.endsWith("#REF!")) {
            String[] separateRefParts = separateRefParts(str);
            this._sheetName = separateRefParts[0];
            String str2 = separateRefParts[1];
            if (str2.length() >= 1) {
                boolean z10 = str2.charAt(0) == '$';
                this._isColAbs = z10;
                this._colIndex = convertColStringToIndex(z10 ? str2.substring(1) : str2);
                String str3 = separateRefParts[2];
                if (str3.length() >= 1) {
                    boolean z11 = str3.charAt(0) == '$';
                    this._isRowAbs = z11;
                    this._rowIndex = Integer.parseInt(z11 ? str3.substring(1) : str3) - 1;
                    return;
                }
                throw new IllegalArgumentException(h.d("Invalid Formula cell reference: '", str, OperatorName.SHOW_TEXT_LINE));
            }
            throw new IllegalArgumentException(h.d("Invalid Formula cell reference: '", str, OperatorName.SHOW_TEXT_LINE));
        }
        throw new IllegalArgumentException("Cell reference invalid: ".concat(str));
    }

    public static boolean cellReferenceIsWithinRange(String str, String str2, SpreadsheetVersion spreadsheetVersion) {
        if (!isColumnWithnRange(str, spreadsheetVersion)) {
            return false;
        }
        return isRowWithnRange(str2, spreadsheetVersion);
    }

    public static NameType classifyCellReference(String str, SpreadsheetVersion spreadsheetVersion) {
        int length = str.length();
        if (length >= 1) {
            char charAt = str.charAt(0);
            if (charAt != '$' && charAt != '.' && charAt != '_' && !Character.isLetter(charAt) && !Character.isDigit(charAt)) {
                throw new IllegalArgumentException("Invalid first char (" + charAt + ") of cell reference or named range.  Letter expected");
            } else if (!Character.isDigit(str.charAt(length - 1))) {
                return validateNamedRangeName(str, spreadsheetVersion);
            } else {
                Matcher matcher = CELL_REF_PATTERN.matcher(str);
                if (!matcher.matches()) {
                    return validateNamedRangeName(str, spreadsheetVersion);
                }
                if (cellReferenceIsWithinRange(matcher.group(1), matcher.group(2), spreadsheetVersion)) {
                    return NameType.CELL;
                }
                if (str.indexOf(36) >= 0) {
                    return NameType.BAD_CELL_OR_NAMED_RANGE;
                }
                return NameType.NAMED_RANGE;
            }
        }
        throw new IllegalArgumentException("Empty string not allowed");
    }

    public static int convertColStringToIndex(String str) {
        char charAt;
        int length = str.length() - 1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (length < 0) {
                break;
            }
            if (str.charAt(length) == '$') {
                if (length != 0) {
                    throw new IllegalArgumentException(h.d("Bad col ref format '", str, OperatorName.SHOW_TEXT_LINE));
                }
            } else {
                i11 += (Character.getNumericValue(charAt) - 9) * ((int) Math.pow(26.0d, i10));
                i10++;
                length--;
            }
        }
        return i11 - 1;
    }

    public static String convertNumToColString(int i10) {
        int i11 = i10 + 1;
        String str = "";
        while (i11 > 0) {
            int i12 = i11 % 26;
            if (i12 == 0) {
                i12 = 26;
            }
            i11 = (i11 - i12) / 26;
            str = ((char) (i12 + 64)) + str;
        }
        return str;
    }

    public static boolean isColumnWithnRange(String str, SpreadsheetVersion spreadsheetVersion) {
        String lastColumnName = spreadsheetVersion.getLastColumnName();
        int length = lastColumnName.length();
        int length2 = str.length();
        if (length2 > length) {
            return false;
        }
        if (length2 == length && str.toUpperCase().compareTo(lastColumnName) > 0) {
            return false;
        }
        return true;
    }

    public static boolean isPartAbsolute(String str) {
        if (str.charAt(0) != '$') {
            return false;
        }
        return true;
    }

    public static boolean isRowWithnRange(String str, SpreadsheetVersion spreadsheetVersion) {
        int parseInt = Integer.parseInt(str);
        if (parseInt >= 0) {
            if (parseInt == 0 || parseInt > spreadsheetVersion.getMaxRows()) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException(h.d("Invalid rowStr '", str, "'."));
    }

    private static String parseSheetName(String str, int i10) {
        boolean z10;
        if (i10 < 0) {
            return null;
        }
        if (str.charAt(0) == '\'') {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return str.substring(0, i10);
        }
        int i11 = i10 - 1;
        if (str.charAt(i11) == '\'') {
            StringBuffer stringBuffer = new StringBuffer(i10);
            int i12 = 1;
            while (i12 < i11) {
                char charAt = str.charAt(i12);
                if (charAt != '\'') {
                    stringBuffer.append(charAt);
                } else {
                    if (i12 < i11) {
                        i12++;
                        if (str.charAt(i12) == '\'') {
                            stringBuffer.append(charAt);
                        }
                    }
                    throw new RuntimeException(h.d("Bad sheet name quote escaping: (", str, ")"));
                }
                i12++;
            }
            return stringBuffer.toString();
        }
        throw new RuntimeException(h.d("Mismatched quotes: (", str, ")"));
    }

    private static String[] separateRefParts(String str) {
        int i10;
        int lastIndexOf = str.lastIndexOf(33);
        String parseSheetName = parseSheetName(str, lastIndexOf);
        int i11 = lastIndexOf + 1;
        int length = str.length();
        if (str.charAt(i11) == '$') {
            i10 = i11 + 1;
        } else {
            i10 = i11;
        }
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (Character.isDigit(charAt) || charAt == '$') {
                break;
            }
            i10++;
        }
        return new String[]{parseSheetName, str.substring(i11, i10), str.substring(i10)};
    }

    private static NameType validateNamedRangeName(String str, SpreadsheetVersion spreadsheetVersion) {
        Matcher matcher = COLUMN_REF_PATTERN.matcher(str);
        if (matcher.matches() && isColumnWithnRange(matcher.group(1), spreadsheetVersion)) {
            return NameType.COLUMN;
        }
        Matcher matcher2 = ROW_REF_PATTERN.matcher(str);
        if (matcher2.matches() && isRowWithnRange(matcher2.group(1), spreadsheetVersion)) {
            return NameType.ROW;
        }
        if (!NAMED_RANGE_NAME_PATTERN.matcher(str).matches()) {
            return NameType.BAD_CELL_OR_NAMED_RANGE;
        }
        return NameType.NAMED_RANGE;
    }

    public void appendCellReference(StringBuffer stringBuffer) {
        if (this._isColAbs) {
            stringBuffer.append(ABSOLUTE_REFERENCE_MARKER);
        }
        stringBuffer.append(convertNumToColString(this._colIndex));
        if (this._isRowAbs) {
            stringBuffer.append(ABSOLUTE_REFERENCE_MARKER);
        }
        stringBuffer.append(this._rowIndex + 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CellReference)) {
            return false;
        }
        CellReference cellReference = (CellReference) obj;
        if (this._rowIndex != cellReference._rowIndex || this._colIndex != cellReference._colIndex) {
            return false;
        }
        boolean z10 = this._isRowAbs;
        boolean z11 = cellReference._isColAbs;
        if (z10 != z11 || this._isColAbs != z11) {
            return false;
        }
        return true;
    }

    public String formatAsString() {
        StringBuffer stringBuffer = new StringBuffer(32);
        String str = this._sheetName;
        if (str != null) {
            SheetNameFormatter.appendFormat(stringBuffer, str);
            stringBuffer.append(SHEET_NAME_DELIMITER);
        }
        appendCellReference(stringBuffer);
        return stringBuffer.toString();
    }

    public String[] getCellRefParts() {
        return new String[]{this._sheetName, Integer.toString(this._rowIndex + 1), convertNumToColString(this._colIndex)};
    }

    public short getCol() {
        return (short) this._colIndex;
    }

    public int getRow() {
        return this._rowIndex;
    }

    public String getSheetName() {
        return this._sheetName;
    }

    public boolean isColAbsolute() {
        return this._isColAbs;
    }

    public boolean isRowAbsolute() {
        return this._isRowAbs;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(64);
        stringBuffer.append(getClass().getName());
        stringBuffer.append(" [");
        stringBuffer.append(formatAsString());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public CellReference(int i10, int i11) {
        this(i10, i11, false, false);
    }

    public CellReference(int i10, short s4) {
        this(i10, s4 & 65535, false, false);
    }

    public CellReference(ICell iCell) {
        this(iCell.getRowIndex(), iCell.getColumnIndex(), false, false);
    }

    public CellReference(int i10, int i11, boolean z10, boolean z11) {
        this(null, i10, i11, z10, z11);
    }

    public CellReference(String str, int i10, int i11, boolean z10, boolean z11) {
        if (i10 < -1) {
            throw new IllegalArgumentException("row index may not be negative");
        }
        if (i11 >= -1) {
            this._sheetName = str;
            this._rowIndex = i10;
            this._colIndex = i11;
            this._isRowAbs = z10;
            this._isColAbs = z11;
            return;
        }
        throw new IllegalArgumentException("column index may not be negative");
    }
}
