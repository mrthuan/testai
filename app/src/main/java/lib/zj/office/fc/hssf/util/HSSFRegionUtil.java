package lib.zj.office.fc.hssf.util;

import lib.zj.office.fc.hssf.usermodel.HSSFSheet;
import lib.zj.office.fc.hssf.usermodel.HSSFWorkbook;
import lib.zj.office.fc.ss.util.HSSFCellRangeAddress;
import lib.zj.office.fc.ss.util.RegionUtil;

/* loaded from: classes3.dex */
public final class HSSFRegionUtil {
    private HSSFRegionUtil() {
    }

    public static void setBorderBottom(short s4, lib.zj.office.fc.ss.util.Region region, HSSFSheet hSSFSheet, HSSFWorkbook hSSFWorkbook) {
        setBorderBottom(s4, toCRA(region), hSSFSheet, hSSFWorkbook);
    }

    public static void setBorderLeft(short s4, lib.zj.office.fc.ss.util.Region region, HSSFSheet hSSFSheet, HSSFWorkbook hSSFWorkbook) {
        setBorderLeft(s4, toCRA(region), hSSFSheet, hSSFWorkbook);
    }

    public static void setBorderRight(short s4, lib.zj.office.fc.ss.util.Region region, HSSFSheet hSSFSheet, HSSFWorkbook hSSFWorkbook) {
        setBorderRight(s4, toCRA(region), hSSFSheet, hSSFWorkbook);
    }

    public static void setBorderTop(short s4, lib.zj.office.fc.ss.util.Region region, HSSFSheet hSSFSheet, HSSFWorkbook hSSFWorkbook) {
        setBorderTop(s4, toCRA(region), hSSFSheet, hSSFWorkbook);
    }

    public static void setBottomBorderColor(short s4, lib.zj.office.fc.ss.util.Region region, HSSFSheet hSSFSheet, HSSFWorkbook hSSFWorkbook) {
        setBottomBorderColor(s4, toCRA(region), hSSFSheet, hSSFWorkbook);
    }

    public static void setLeftBorderColor(short s4, lib.zj.office.fc.ss.util.Region region, HSSFSheet hSSFSheet, HSSFWorkbook hSSFWorkbook) {
        setLeftBorderColor(s4, toCRA(region), hSSFSheet, hSSFWorkbook);
    }

    public static void setRightBorderColor(short s4, lib.zj.office.fc.ss.util.Region region, HSSFSheet hSSFSheet, HSSFWorkbook hSSFWorkbook) {
        setRightBorderColor(s4, toCRA(region), hSSFSheet, hSSFWorkbook);
    }

    public static void setTopBorderColor(short s4, lib.zj.office.fc.ss.util.Region region, HSSFSheet hSSFSheet, HSSFWorkbook hSSFWorkbook) {
        setTopBorderColor(s4, toCRA(region), hSSFSheet, hSSFWorkbook);
    }

    private static HSSFCellRangeAddress toCRA(lib.zj.office.fc.ss.util.Region region) {
        return lib.zj.office.fc.ss.util.Region.convertToCellRangeAddress(region);
    }

    public static void setBorderBottom(int i10, HSSFCellRangeAddress hSSFCellRangeAddress, HSSFSheet hSSFSheet, HSSFWorkbook hSSFWorkbook) {
        RegionUtil.setBorderBottom(i10, hSSFCellRangeAddress, hSSFSheet, hSSFWorkbook);
    }

    public static void setBorderLeft(int i10, HSSFCellRangeAddress hSSFCellRangeAddress, HSSFSheet hSSFSheet, HSSFWorkbook hSSFWorkbook) {
        RegionUtil.setBorderLeft(i10, hSSFCellRangeAddress, hSSFSheet, hSSFWorkbook);
    }

    public static void setBorderRight(int i10, HSSFCellRangeAddress hSSFCellRangeAddress, HSSFSheet hSSFSheet, HSSFWorkbook hSSFWorkbook) {
        RegionUtil.setBorderRight(i10, hSSFCellRangeAddress, hSSFSheet, hSSFWorkbook);
    }

    public static void setBorderTop(int i10, HSSFCellRangeAddress hSSFCellRangeAddress, HSSFSheet hSSFSheet, HSSFWorkbook hSSFWorkbook) {
        RegionUtil.setBorderTop(i10, hSSFCellRangeAddress, hSSFSheet, hSSFWorkbook);
    }

    public static void setBottomBorderColor(int i10, HSSFCellRangeAddress hSSFCellRangeAddress, HSSFSheet hSSFSheet, HSSFWorkbook hSSFWorkbook) {
        RegionUtil.setBottomBorderColor(i10, hSSFCellRangeAddress, hSSFSheet, hSSFWorkbook);
    }

    public static void setLeftBorderColor(int i10, HSSFCellRangeAddress hSSFCellRangeAddress, HSSFSheet hSSFSheet, HSSFWorkbook hSSFWorkbook) {
        RegionUtil.setLeftBorderColor(i10, hSSFCellRangeAddress, hSSFSheet, hSSFWorkbook);
    }

    public static void setRightBorderColor(int i10, HSSFCellRangeAddress hSSFCellRangeAddress, HSSFSheet hSSFSheet, HSSFWorkbook hSSFWorkbook) {
        RegionUtil.setRightBorderColor(i10, hSSFCellRangeAddress, hSSFSheet, hSSFWorkbook);
    }

    public static void setTopBorderColor(int i10, HSSFCellRangeAddress hSSFCellRangeAddress, HSSFSheet hSSFSheet, HSSFWorkbook hSSFWorkbook) {
        RegionUtil.setTopBorderColor(i10, hSSFCellRangeAddress, hSSFSheet, hSSFWorkbook);
    }
}
