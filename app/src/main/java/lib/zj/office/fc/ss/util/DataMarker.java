package lib.zj.office.fc.ss.util;

import lib.zj.office.fc.ss.usermodel.Sheet;

/* loaded from: classes3.dex */
public class DataMarker {
    private HSSFCellRangeAddress range;
    private Sheet sheet;

    public DataMarker(Sheet sheet, HSSFCellRangeAddress hSSFCellRangeAddress) {
        this.sheet = sheet;
        this.range = hSSFCellRangeAddress;
    }

    public String formatAsString() {
        return null;
    }

    public HSSFCellRangeAddress getRange() {
        return this.range;
    }

    public Sheet getSheet() {
        return this.sheet;
    }

    public void setRange(HSSFCellRangeAddress hSSFCellRangeAddress) {
        this.range = hSSFCellRangeAddress;
    }

    public void setSheet(Sheet sheet) {
        this.sheet = sheet;
    }
}
