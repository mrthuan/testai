package lib.zj.office.fc.hssf.usermodel;

import a0.a;
import a6.h;
import androidx.activity.f;
import androidx.appcompat.view.menu.d;
import java.util.Iterator;
import java.util.NoSuchElementException;
import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.hssf.record.CellValueRecordInterface;
import lib.zj.office.fc.hssf.record.RowRecord;
import lib.zj.office.fc.ss.SpreadsheetVersion;
import lib.zj.office.fc.ss.usermodel.ICell;
import lib.zj.office.fc.ss.usermodel.ICellStyle;
import lib.zj.office.fc.ss.usermodel.IFont;
import lib.zj.office.fc.ss.usermodel.IRow;

/* loaded from: classes3.dex */
public final class HSSFRow implements IRow {
    public static final int INITIAL_CAPACITY = 5;
    private HSSFWorkbook book;
    private HSSFCell[] cells;
    private RowRecord row;
    private int rowNum;
    private int rowPixelHeight;
    private HSSFSheet sheet;

    /* loaded from: classes3.dex */
    public class CellIterator implements Iterator<ICell> {
        int thisId = -1;
        int nextId = -1;

        public CellIterator() {
            findNext();
        }

        private void findNext() {
            int i10 = this.nextId;
            do {
                i10++;
                if (i10 >= HSSFRow.this.cells.length) {
                    break;
                }
            } while (HSSFRow.this.cells[i10] == null);
            this.nextId = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextId < HSSFRow.this.cells.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.thisId != -1) {
                HSSFRow.this.cells[this.thisId] = null;
                return;
            }
            throw new IllegalStateException("remove() called before next()");
        }

        @Override // java.util.Iterator
        public ICell next() {
            if (hasNext()) {
                HSSFCell[] hSSFCellArr = HSSFRow.this.cells;
                int i10 = this.nextId;
                HSSFCell hSSFCell = hSSFCellArr[i10];
                this.thisId = i10;
                findNext();
                return hSSFCell;
            }
            throw new NoSuchElementException("At last element");
        }
    }

    public HSSFRow(HSSFWorkbook hSSFWorkbook, HSSFSheet hSSFSheet, int i10) {
        this(hSSFWorkbook, hSSFSheet, new RowRecord(i10));
    }

    private void addCell(HSSFCell hSSFCell) {
        int columnIndex = hSSFCell.getColumnIndex();
        HSSFCell[] hSSFCellArr = this.cells;
        if (columnIndex >= hSSFCellArr.length) {
            int a10 = d.a(hSSFCellArr.length, 3, 2, 1);
            if (a10 < columnIndex + 1) {
                a10 = columnIndex + 5;
            }
            HSSFCell[] hSSFCellArr2 = new HSSFCell[a10];
            this.cells = hSSFCellArr2;
            System.arraycopy(hSSFCellArr, 0, hSSFCellArr2, 0, hSSFCellArr.length);
        }
        this.cells[columnIndex] = hSSFCell;
        if (this.row.isEmpty() || columnIndex < this.row.getFirstCol()) {
            this.row.setFirstCol((short) columnIndex);
        }
        if (this.row.isEmpty() || columnIndex >= this.row.getLastCol()) {
            this.row.setLastCol((short) (columnIndex + 1));
        }
    }

    private int calculateNewFirstCell(int i10) {
        int i11 = i10 + 1;
        HSSFCell retrieveCell = retrieveCell(i11);
        while (retrieveCell == null) {
            if (i11 <= this.cells.length) {
                return 0;
            }
            i11++;
            retrieveCell = retrieveCell(i11);
        }
        return i11;
    }

    private int calculateNewLastCellPlusOne(int i10) {
        int i11 = i10 - 1;
        HSSFCell retrieveCell = retrieveCell(i11);
        while (retrieveCell == null) {
            if (i11 < 0) {
                return 0;
            }
            i11--;
            retrieveCell = retrieveCell(i11);
        }
        return i11 + 1;
    }

    private HSSFCell retrieveCell(int i10) {
        if (i10 >= 0) {
            HSSFCell[] hSSFCellArr = this.cells;
            if (i10 < hSSFCellArr.length) {
                return hSSFCellArr[i10];
            }
            return null;
        }
        return null;
    }

    @Override // lib.zj.office.fc.ss.usermodel.IRow
    public Iterator<ICell> cellIterator() {
        return new CellIterator();
    }

    public int compareTo(Object obj) {
        HSSFRow hSSFRow = (HSSFRow) obj;
        if (getRowNum() == hSSFRow.getRowNum()) {
            return 0;
        }
        if (getRowNum() < hSSFRow.getRowNum() || getRowNum() <= hSSFRow.getRowNum()) {
            return -1;
        }
        return 1;
    }

    public HSSFCell createCellFromRecord(CellValueRecordInterface cellValueRecordInterface) {
        HSSFCell hSSFCell = new HSSFCell(this.book, this.sheet, cellValueRecordInterface);
        addCell(hSSFCell);
        short column = cellValueRecordInterface.getColumn();
        if (this.row.isEmpty()) {
            this.row.setFirstCol(column);
            this.row.setLastCol(column + 1);
        } else if (column < this.row.getFirstCol()) {
            this.row.setFirstCol(column);
        } else if (column > this.row.getLastCol()) {
            this.row.setLastCol(column + 1);
        }
        return hSSFCell;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HSSFRow) || getRowNum() != ((HSSFRow) obj).getRowNum()) {
            return false;
        }
        return true;
    }

    @Override // lib.zj.office.fc.ss.usermodel.IRow
    public short getFirstCellNum() {
        if (this.row.isEmpty()) {
            return (short) -1;
        }
        return (short) this.row.getFirstCol();
    }

    @Override // lib.zj.office.fc.ss.usermodel.IRow
    public short getHeight() {
        short height = this.row.getHeight();
        if ((32768 & height) != 0) {
            return this.sheet.getSheet().getDefaultRowHeight();
        }
        return (short) (height & IFont.COLOR_NORMAL);
    }

    @Override // lib.zj.office.fc.ss.usermodel.IRow
    public float getHeightInPoints() {
        return getHeight() / 20.0f;
    }

    @Override // lib.zj.office.fc.ss.usermodel.IRow
    public short getLastCellNum() {
        if (this.row.isEmpty()) {
            return (short) -1;
        }
        return (short) this.row.getLastCol();
    }

    public int getOutlineLevel() {
        return this.row.getOutlineLevel();
    }

    @Override // lib.zj.office.fc.ss.usermodel.IRow
    public int getPhysicalNumberOfCells() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            HSSFCell[] hSSFCellArr = this.cells;
            if (i10 < hSSFCellArr.length) {
                if (hSSFCellArr[i10] != null) {
                    i11++;
                }
                i10++;
            } else {
                return i11;
            }
        }
    }

    @Override // lib.zj.office.fc.ss.usermodel.IRow
    public int getRowNum() {
        return this.rowNum;
    }

    public int getRowPixelHeight() {
        return this.rowPixelHeight;
    }

    public RowRecord getRowRecord() {
        return this.row;
    }

    public int getRowStyleIndex() {
        if (!isFormatted()) {
            return 0;
        }
        return this.row.getXFIndex();
    }

    @Override // lib.zj.office.fc.ss.usermodel.IRow
    public boolean getZeroHeight() {
        return this.row.getZeroHeight();
    }

    public boolean isEmpty() {
        return this.row.isEmpty();
    }

    @Override // lib.zj.office.fc.ss.usermodel.IRow
    public boolean isFormatted() {
        return this.row.getFormatted();
    }

    @Override // java.lang.Iterable
    public Iterator<ICell> iterator() {
        return cellIterator();
    }

    public void moveCell(HSSFCell hSSFCell, short s4) {
        HSSFCell[] hSSFCellArr = this.cells;
        if (hSSFCellArr.length > s4 && hSSFCellArr[s4] != null) {
            throw new IllegalArgumentException(a.g("Asked to move cell to column ", s4, " but there's already a cell there"));
        }
        if (hSSFCellArr[hSSFCell.getColumnIndex()].equals(hSSFCell)) {
            removeCell(hSSFCell, false);
            hSSFCell.updateCellNum(s4);
            addCell(hSSFCell);
            return;
        }
        throw new IllegalArgumentException("Asked to move a cell, but it didn't belong to our row");
    }

    public void removeAllCells() {
        int i10 = 0;
        while (true) {
            HSSFCell[] hSSFCellArr = this.cells;
            if (i10 < hSSFCellArr.length) {
                HSSFCell hSSFCell = hSSFCellArr[i10];
                if (hSSFCell != null) {
                    removeCell(hSSFCell, true);
                }
                i10++;
            } else {
                this.cells = new HSSFCell[5];
                return;
            }
        }
    }

    @Override // lib.zj.office.fc.ss.usermodel.IRow
    public void removeCell(ICell iCell) {
        if (iCell != null) {
            removeCell((HSSFCell) iCell, true);
            return;
        }
        throw new IllegalArgumentException("cell must not be null");
    }

    @Override // lib.zj.office.fc.ss.usermodel.IRow
    public void setHeight(short s4) {
        if (s4 == -1) {
            this.row.setHeight((short) -32513);
            return;
        }
        this.row.setBadFontHeight(true);
        this.row.setHeight(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.IRow
    public void setHeightInPoints(float f10) {
        if (f10 == -1.0f) {
            this.row.setHeight((short) -32513);
            return;
        }
        this.row.setBadFontHeight(true);
        this.row.setHeight((short) (f10 * 20.0f));
    }

    @Override // lib.zj.office.fc.ss.usermodel.IRow
    public void setRowNum(int i10) {
        int lastRowIndex = SpreadsheetVersion.EXCEL97.getLastRowIndex();
        if (i10 >= 0 && i10 <= lastRowIndex) {
            this.rowNum = i10;
            RowRecord rowRecord = this.row;
            if (rowRecord != null) {
                rowRecord.setRowNumber(i10);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(f.k("Invalid row number (", i10, ") outside allowable range (0..", lastRowIndex, ")"));
    }

    public void setRowPixelHeight(int i10) {
        this.rowPixelHeight = i10;
    }

    public void setRowStyle(HSSFCellStyle hSSFCellStyle) {
        this.row.setFormatted(true);
        this.row.setXFIndex(hSSFCellStyle.getIndex());
    }

    @Override // lib.zj.office.fc.ss.usermodel.IRow
    public void setZeroHeight(boolean z10) {
        this.row.setZeroHeight(z10);
    }

    public HSSFRow(HSSFWorkbook hSSFWorkbook, HSSFSheet hSSFSheet, RowRecord rowRecord) {
        this.rowPixelHeight = 18;
        this.book = hSSFWorkbook;
        this.sheet = hSSFSheet;
        this.row = rowRecord;
        setRowNum(rowRecord.getRowNumber());
        this.cells = new HSSFCell[rowRecord.getLastCol() + 5];
        rowRecord.setEmpty();
    }

    @Override // lib.zj.office.fc.ss.usermodel.IRow
    public HSSFCellStyle getRowStyle() {
        if (isFormatted()) {
            short xFIndex = this.row.getXFIndex();
            return new HSSFCellStyle(xFIndex, this.book.getWorkbook().getExFormatAt(xFIndex), this.book);
        }
        return null;
    }

    @Override // lib.zj.office.fc.ss.usermodel.IRow
    public HSSFSheet getSheet() {
        return this.sheet;
    }

    private void removeCell(HSSFCell hSSFCell, boolean z10) {
        int columnIndex = hSSFCell.getColumnIndex();
        if (columnIndex >= 0) {
            HSSFCell[] hSSFCellArr = this.cells;
            if (columnIndex < hSSFCellArr.length && hSSFCell == hSSFCellArr[columnIndex]) {
                if (hSSFCell.isPartOfArrayFormulaGroup()) {
                    hSSFCell.notifyArrayFormulaChanging();
                }
                this.cells[columnIndex] = null;
                if (z10) {
                    this.sheet.getSheet().removeValueRecord(getRowNum(), hSSFCell.getCellValueRecord());
                }
                if (hSSFCell.getColumnIndex() + 1 == this.row.getLastCol()) {
                    RowRecord rowRecord = this.row;
                    rowRecord.setLastCol(calculateNewLastCellPlusOne(rowRecord.getLastCol()));
                }
                if (hSSFCell.getColumnIndex() == this.row.getFirstCol()) {
                    RowRecord rowRecord2 = this.row;
                    rowRecord2.setFirstCol(calculateNewFirstCell(rowRecord2.getFirstCol()));
                    return;
                }
                return;
            }
            throw new RuntimeException("Specified cell is not from this row");
        }
        throw new RuntimeException("Negative cell indexes not allowed");
    }

    public HSSFCell createCell(short s4) {
        return createCell((int) s4);
    }

    public HSSFCell getCell(short s4) {
        return getCell(s4 & 65535);
    }

    @Override // lib.zj.office.fc.ss.usermodel.IRow
    public void setRowStyle(ICellStyle iCellStyle) {
        setRowStyle((HSSFCellStyle) iCellStyle);
    }

    public HSSFCell createCell(short s4, int i10) {
        return createCell((int) s4, i10);
    }

    @Override // lib.zj.office.fc.ss.usermodel.IRow
    public HSSFCell getCell(int i10) {
        return getCell(i10, this.book.getMissingCellPolicy());
    }

    @Override // lib.zj.office.fc.ss.usermodel.IRow
    public HSSFCell createCell(int i10) {
        return createCell(i10, 3);
    }

    @Override // lib.zj.office.fc.ss.usermodel.IRow
    public HSSFCell getCell(int i10, IRow.MissingCellPolicy missingCellPolicy) {
        HSSFCell retrieveCell = retrieveCell(i10);
        if (missingCellPolicy == IRow.RETURN_NULL_AND_BLANK) {
            return retrieveCell;
        }
        if (missingCellPolicy == IRow.RETURN_BLANK_AS_NULL) {
            if (retrieveCell != null && retrieveCell.getCellType() == 3) {
                return null;
            }
            return retrieveCell;
        } else if (missingCellPolicy == IRow.CREATE_NULL_AS_BLANK) {
            return retrieveCell == null ? createCell(i10, 3) : retrieveCell;
        } else {
            StringBuilder sb2 = new StringBuilder("Illegal policy ");
            sb2.append(missingCellPolicy);
            sb2.append(" (");
            throw new IllegalArgumentException(h.g(sb2, missingCellPolicy.f20687id, ")"));
        }
    }

    @Override // lib.zj.office.fc.ss.usermodel.IRow
    public HSSFCell createCell(int i10, int i11) {
        short s4 = (short) i10;
        if (i10 > 32767) {
            s4 = (short) (Variant.VT_ILLEGAL - i10);
        }
        HSSFCell hSSFCell = new HSSFCell(this.book, this.sheet, getRowNum(), s4, i11);
        addCell(hSSFCell);
        this.sheet.getSheet().addValueRecord(getRowNum(), hSSFCell.getCellValueRecord());
        return hSSFCell;
    }
}
