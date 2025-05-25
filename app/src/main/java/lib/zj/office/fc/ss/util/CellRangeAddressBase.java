package lib.zj.office.fc.ss.util;

import b.a;
import lib.zj.office.fc.ss.SpreadsheetVersion;

/* loaded from: classes3.dex */
public abstract class CellRangeAddressBase {
    private int _firstCol;
    private int _firstRow;
    private int _lastCol;
    private int _lastRow;

    public CellRangeAddressBase(int i10, int i11, int i12, int i13) {
        this._firstRow = i10;
        this._lastRow = i11;
        this._firstCol = i12;
        this._lastCol = i13;
    }

    private static void validateColumn(int i10, SpreadsheetVersion spreadsheetVersion) {
        int lastColumnIndex = spreadsheetVersion.getLastColumnIndex();
        if (i10 <= lastColumnIndex) {
            if (i10 >= 0) {
                return;
            }
            throw new IllegalArgumentException("Minimum column number is 0");
        }
        throw new IllegalArgumentException(a.c("Maximum column number is ", lastColumnIndex));
    }

    private static void validateRow(int i10, SpreadsheetVersion spreadsheetVersion) {
        int lastRowIndex = spreadsheetVersion.getLastRowIndex();
        if (i10 <= lastRowIndex) {
            if (i10 >= 0) {
                return;
            }
            throw new IllegalArgumentException("Minumum row number is 0");
        }
        throw new IllegalArgumentException(a.c("Maximum row number is ", lastRowIndex));
    }

    public final int getFirstColumn() {
        return this._firstCol;
    }

    public final int getFirstRow() {
        return this._firstRow;
    }

    public final int getLastColumn() {
        return this._lastCol;
    }

    public final int getLastRow() {
        return this._lastRow;
    }

    public int getNumberOfCells() {
        return ((this._lastCol - this._firstCol) + 1) * ((this._lastRow - this._firstRow) + 1);
    }

    public final boolean isFullColumnRange() {
        if (this._firstRow == 0 && this._lastRow == SpreadsheetVersion.EXCEL97.getLastRowIndex()) {
            return true;
        }
        return false;
    }

    public final boolean isFullRowRange() {
        if (this._firstCol == 0 && this._lastCol == SpreadsheetVersion.EXCEL97.getLastColumnIndex()) {
            return true;
        }
        return false;
    }

    public boolean isInRange(int i10, int i11) {
        if (this._firstRow <= i10 && i10 <= this._lastRow && this._firstCol <= i11 && i11 <= this._lastCol) {
            return true;
        }
        return false;
    }

    public final void setFirstColumn(int i10) {
        this._firstCol = i10;
    }

    public final void setFirstRow(int i10) {
        this._firstRow = i10;
    }

    public final void setLastColumn(int i10) {
        this._lastCol = i10;
    }

    public final void setLastRow(int i10) {
        this._lastRow = i10;
    }

    public final String toString() {
        CellReference cellReference = new CellReference(this._firstRow, this._firstCol);
        CellReference cellReference2 = new CellReference(this._lastRow, this._lastCol);
        return getClass().getName() + " [" + cellReference.formatAsString() + ":" + cellReference2.formatAsString() + "]";
    }

    public void validate(SpreadsheetVersion spreadsheetVersion) {
        validateRow(this._firstRow, spreadsheetVersion);
        validateRow(this._lastRow, spreadsheetVersion);
        validateColumn(this._firstCol, spreadsheetVersion);
        validateColumn(this._lastCol, spreadsheetVersion);
    }
}
