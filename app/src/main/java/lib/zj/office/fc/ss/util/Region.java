package lib.zj.office.fc.ss.util;

/* loaded from: classes3.dex */
public class Region implements Comparable<Region> {
    private short _colFrom;
    private short _colTo;
    private int _rowFrom;
    private int _rowTo;

    public Region() {
    }

    public static Region[] convertCellRangesToRegions(HSSFCellRangeAddress[] hSSFCellRangeAddressArr) {
        int length = hSSFCellRangeAddressArr.length;
        if (length < 1) {
            return new Region[0];
        }
        Region[] regionArr = new Region[length];
        for (int i10 = 0; i10 != length; i10++) {
            regionArr[i10] = convertToRegion(hSSFCellRangeAddressArr[i10]);
        }
        return regionArr;
    }

    public static HSSFCellRangeAddress[] convertRegionsToCellRanges(Region[] regionArr) {
        int length = regionArr.length;
        if (length < 1) {
            return new HSSFCellRangeAddress[0];
        }
        HSSFCellRangeAddress[] hSSFCellRangeAddressArr = new HSSFCellRangeAddress[length];
        for (int i10 = 0; i10 != length; i10++) {
            hSSFCellRangeAddressArr[i10] = convertToCellRangeAddress(regionArr[i10]);
        }
        return hSSFCellRangeAddressArr;
    }

    public static HSSFCellRangeAddress convertToCellRangeAddress(Region region) {
        return new HSSFCellRangeAddress(region.getRowFrom(), region.getRowTo(), region.getColumnFrom(), region.getColumnTo());
    }

    private static Region convertToRegion(HSSFCellRangeAddress hSSFCellRangeAddress) {
        return new Region(hSSFCellRangeAddress.getFirstRow(), (short) hSSFCellRangeAddress.getFirstColumn(), hSSFCellRangeAddress.getLastRow(), (short) hSSFCellRangeAddress.getLastColumn());
    }

    public boolean contains(int i10, short s4) {
        if (this._rowFrom <= i10 && this._rowTo >= i10 && this._colFrom <= s4 && this._colTo >= s4) {
            return true;
        }
        return false;
    }

    public boolean equals(Region region) {
        if (compareTo(region) == 0) {
            return true;
        }
        return false;
    }

    public int getArea() {
        return ((this._colTo - this._colFrom) + 1) * ((this._rowTo - this._rowFrom) + 1);
    }

    public short getColumnFrom() {
        return this._colFrom;
    }

    public short getColumnTo() {
        return this._colTo;
    }

    public String getRegionRef() {
        CellReference cellReference = new CellReference(this._rowFrom, this._colFrom);
        CellReference cellReference2 = new CellReference(this._rowTo, this._colTo);
        return cellReference.formatAsString() + ":" + cellReference2.formatAsString();
    }

    public int getRowFrom() {
        return this._rowFrom;
    }

    public int getRowTo() {
        return this._rowTo;
    }

    public void setColumnFrom(short s4) {
        this._colFrom = s4;
    }

    public void setColumnTo(short s4) {
        this._colTo = s4;
    }

    public void setRowFrom(int i10) {
        this._rowFrom = i10;
    }

    public void setRowTo(int i10) {
        this._rowTo = i10;
    }

    public Region(int i10, short s4, int i11, short s10) {
        this._rowFrom = i10;
        this._rowTo = i11;
        this._colFrom = s4;
        this._colTo = s10;
    }

    @Override // java.lang.Comparable
    public int compareTo(Region region) {
        if (getRowFrom() == region.getRowFrom() && getColumnFrom() == region.getColumnFrom() && getRowTo() == region.getRowTo() && getColumnTo() == region.getColumnTo()) {
            return 0;
        }
        return (getRowFrom() < region.getRowFrom() || getColumnFrom() < region.getColumnFrom() || getRowTo() < region.getRowTo() || getColumnTo() < region.getColumnTo()) ? 1 : -1;
    }

    public Region(String str) {
        CellReference cellReference = new CellReference(str.substring(0, str.indexOf(":")));
        CellReference cellReference2 = new CellReference(str.substring(str.indexOf(":") + 1));
        this._rowFrom = cellReference.getRow();
        this._colFrom = cellReference.getCol();
        this._rowTo = cellReference2.getRow();
        this._colTo = cellReference2.getCol();
    }
}
