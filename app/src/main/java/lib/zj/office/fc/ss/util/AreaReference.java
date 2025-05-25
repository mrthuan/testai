package lib.zj.office.fc.ss.util;

import a0.a;
import a6.h;
import androidx.appcompat.view.menu.d;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.StringTokenizer;
import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.ss.SpreadsheetVersion;

/* loaded from: classes3.dex */
public class AreaReference {
    private static final char CELL_DELIMITER = ':';
    private static final char SHEET_NAME_DELIMITER = '!';
    private static final char SPECIAL_NAME_DELIMITER = '\'';
    private final CellReference _firstCell;
    private final boolean _isSingleCell;
    private final CellReference _lastCell;

    public AreaReference(String str) {
        if (isContiguous(str)) {
            String[] separateAreaRefs = separateAreaRefs(str);
            String str2 = separateAreaRefs[0];
            if (separateAreaRefs.length == 1) {
                CellReference cellReference = new CellReference(str2);
                this._firstCell = cellReference;
                this._lastCell = cellReference;
                this._isSingleCell = true;
                return;
            } else if (separateAreaRefs.length == 2) {
                String str3 = separateAreaRefs[1];
                if (isPlainColumn(str2)) {
                    if (isPlainColumn(str3)) {
                        boolean isPartAbsolute = CellReference.isPartAbsolute(str2);
                        boolean isPartAbsolute2 = CellReference.isPartAbsolute(str3);
                        int convertColStringToIndex = CellReference.convertColStringToIndex(str2);
                        int convertColStringToIndex2 = CellReference.convertColStringToIndex(str3);
                        this._firstCell = new CellReference(0, convertColStringToIndex, true, isPartAbsolute);
                        this._lastCell = new CellReference(Variant.VT_ILLEGAL, convertColStringToIndex2, true, isPartAbsolute2);
                        this._isSingleCell = false;
                        return;
                    }
                    throw new RuntimeException(h.d("Bad area ref '", str, OperatorName.SHOW_TEXT_LINE));
                }
                this._firstCell = new CellReference(str2);
                this._lastCell = new CellReference(str3);
                this._isSingleCell = str2.equals(str3);
                return;
            } else {
                throw new IllegalArgumentException(h.d("Bad area ref '", str, OperatorName.SHOW_TEXT_LINE));
            }
        }
        throw new IllegalArgumentException("References passed to the AreaReference must be contiguous, use generateContiguous(ref) if you have non-contiguous references");
    }

    public static AreaReference[] generateContiguous(String str) {
        ArrayList arrayList = new ArrayList();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreTokens()) {
            arrayList.add(new AreaReference(stringTokenizer.nextToken()));
        }
        return (AreaReference[]) arrayList.toArray(new AreaReference[arrayList.size()]);
    }

    public static AreaReference getWholeColumn(String str, String str2) {
        return new AreaReference(a.j(str, "$1:", str2, "$65536"));
    }

    public static AreaReference getWholeRow(String str, String str2) {
        return new AreaReference(d.d("$A", str, ":$IV", str2));
    }

    public static boolean isContiguous(String str) {
        if (str.indexOf(44) == -1) {
            return true;
        }
        return false;
    }

    private boolean isPlainColumn(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            char charAt = str.charAt(length);
            if ((charAt != '$' || length != 0) && (charAt < 'A' || charAt > 'Z')) {
                return false;
            }
        }
        return true;
    }

    public static boolean isWholeColumnReference(CellReference cellReference, CellReference cellReference2) {
        return cellReference.getRow() == 0 && cellReference.isRowAbsolute() && cellReference2.getRow() == SpreadsheetVersion.EXCEL97.getLastRowIndex() && cellReference2.isRowAbsolute();
    }

    private static String[] separateAreaRefs(String str) {
        int length = str.length();
        int i10 = -1;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < length) {
            char charAt = str.charAt(i11);
            if (charAt != '\'') {
                if (charAt == ':' && !z10) {
                    if (i10 < 0) {
                        i10 = i11;
                    } else {
                        throw new IllegalArgumentException(h.d("More than one cell delimiter ':' appears in area reference '", str, OperatorName.SHOW_TEXT_LINE));
                    }
                }
            } else if (!z10) {
                z10 = true;
            } else if (i11 < length - 1) {
                int i12 = i11 + 1;
                if (str.charAt(i12) == '\'') {
                    i11 = i12;
                } else {
                    z10 = false;
                }
            } else {
                throw new IllegalArgumentException(h.d("Area reference '", str, "' ends with special name delimiter '''"));
            }
            i11++;
        }
        if (i10 < 0) {
            return new String[]{str};
        }
        String substring = str.substring(0, i10);
        String substring2 = str.substring(i10 + 1);
        if (substring2.indexOf(33) < 0) {
            int lastIndexOf = substring.lastIndexOf(33);
            if (lastIndexOf < 0) {
                return new String[]{substring, substring2};
            }
            return new String[]{substring, h.c(substring.substring(0, lastIndexOf + 1), substring2)};
        }
        throw new RuntimeException(h.d("Unexpected ! in second cell reference of '", str, OperatorName.SHOW_TEXT_LINE));
    }

    public String formatAsString() {
        if (isWholeColumnReference()) {
            return CellReference.convertNumToColString(this._firstCell.getCol()) + ":" + CellReference.convertNumToColString(this._lastCell.getCol());
        }
        StringBuffer stringBuffer = new StringBuffer(32);
        stringBuffer.append(this._firstCell.formatAsString());
        if (!this._isSingleCell) {
            stringBuffer.append(CELL_DELIMITER);
            if (this._lastCell.getSheetName() == null) {
                stringBuffer.append(this._lastCell.formatAsString());
            } else {
                this._lastCell.appendCellReference(stringBuffer);
            }
        }
        return stringBuffer.toString();
    }

    public CellReference[] getAllReferencedCells() {
        if (this._isSingleCell) {
            return new CellReference[]{this._firstCell};
        }
        int max = Math.max(this._firstCell.getRow(), this._lastCell.getRow());
        int min = Math.min((int) this._firstCell.getCol(), (int) this._lastCell.getCol());
        int max2 = Math.max((int) this._firstCell.getCol(), (int) this._lastCell.getCol());
        String sheetName = this._firstCell.getSheetName();
        ArrayList arrayList = new ArrayList();
        for (int min2 = Math.min(this._firstCell.getRow(), this._lastCell.getRow()); min2 <= max; min2++) {
            for (int i10 = min; i10 <= max2; i10++) {
                arrayList.add(new CellReference(sheetName, min2, i10, this._firstCell.isRowAbsolute(), this._firstCell.isColAbsolute()));
            }
        }
        return (CellReference[]) arrayList.toArray(new CellReference[arrayList.size()]);
    }

    public CellReference getFirstCell() {
        return this._firstCell;
    }

    public CellReference getLastCell() {
        return this._lastCell;
    }

    public boolean isSingleCell() {
        return this._isSingleCell;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(64);
        stringBuffer.append(getClass().getName());
        stringBuffer.append(" [");
        stringBuffer.append(formatAsString());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public boolean isWholeColumnReference() {
        return isWholeColumnReference(this._firstCell, this._lastCell);
    }

    public AreaReference(CellReference cellReference, CellReference cellReference2) {
        int row;
        boolean isRowAbsolute;
        int row2;
        boolean isRowAbsolute2;
        short col;
        short col2;
        boolean z10;
        boolean z11;
        boolean z12 = cellReference.getRow() > cellReference2.getRow();
        boolean z13 = cellReference.getCol() > cellReference2.getCol();
        if (!z12 && !z13) {
            this._firstCell = cellReference;
            this._lastCell = cellReference2;
        } else {
            if (z12) {
                row = cellReference2.getRow();
                isRowAbsolute = cellReference2.isRowAbsolute();
                row2 = cellReference.getRow();
                isRowAbsolute2 = cellReference.isRowAbsolute();
            } else {
                row = cellReference.getRow();
                isRowAbsolute = cellReference.isRowAbsolute();
                row2 = cellReference2.getRow();
                isRowAbsolute2 = cellReference2.isRowAbsolute();
            }
            if (z13) {
                col = cellReference2.getCol();
                z10 = cellReference2.isColAbsolute();
                col2 = cellReference.getCol();
                z11 = cellReference.isColAbsolute();
            } else {
                col = cellReference.getCol();
                boolean isColAbsolute = cellReference.isColAbsolute();
                col2 = cellReference2.getCol();
                boolean isColAbsolute2 = cellReference2.isColAbsolute();
                z10 = isColAbsolute;
                z11 = isColAbsolute2;
            }
            this._firstCell = new CellReference(row, col, isRowAbsolute, z10);
            this._lastCell = new CellReference(row2, col2, isRowAbsolute2, z11);
        }
        this._isSingleCell = false;
    }
}
