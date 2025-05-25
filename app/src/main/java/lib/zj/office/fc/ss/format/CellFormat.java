package lib.zj.office.fc.ss.format;

import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lib.zj.office.fc.ss.usermodel.ICell;

/* loaded from: classes3.dex */
public class CellFormat {
    private final String format;
    private final CellFormatPart negNumFmt;
    private final CellFormatPart posNumFmt;
    private final CellFormatPart textFmt;
    private final CellFormatPart zeroNumFmt;
    private static final Pattern ONE_PART = Pattern.compile(CellFormatPart.FORMAT_PAT.pattern() + "(;|$)", 6);
    private static final CellFormatPart DEFAULT_TEXT_FORMAT = new CellFormatPart("@");
    public static final CellFormat GENERAL_FORMAT = new CellFormat("General") { // from class: lib.zj.office.fc.ss.format.CellFormat.1
        @Override // lib.zj.office.fc.ss.format.CellFormat
        public CellFormatResult apply(Object obj) {
            String obj2;
            if (obj == null) {
                obj2 = "";
            } else if (obj instanceof Number) {
                obj2 = CellNumberFormatter.SIMPLE_NUMBER.format(obj);
            } else {
                obj2 = obj.toString();
            }
            return new CellFormatResult(true, obj2, -1);
        }
    };
    private static final Map<String, CellFormat> formatCache = new WeakHashMap();

    public /* synthetic */ CellFormat(String str, int i10) {
        this(str);
    }

    public static CellFormat getInstance(String str) {
        Map<String, CellFormat> map = formatCache;
        CellFormat cellFormat = map.get(str);
        if (cellFormat == null) {
            if (str.equals("General")) {
                cellFormat = GENERAL_FORMAT;
            } else {
                cellFormat = new CellFormat(str);
            }
            map.put(str, cellFormat);
        }
        return cellFormat;
    }

    public static int ultimateType(ICell iCell) {
        int cellType = iCell.getCellType();
        if (cellType == 2) {
            return iCell.getCachedFormulaResultType();
        }
        return cellType;
    }

    public CellFormatResult apply(Object obj) {
        if (obj instanceof Number) {
            double doubleValue = ((Number) obj).doubleValue();
            if (doubleValue > 0.0d) {
                return this.posNumFmt.apply(obj);
            }
            if (doubleValue < 0.0d) {
                return this.negNumFmt.apply(Double.valueOf(-doubleValue));
            }
            return this.zeroNumFmt.apply(obj);
        }
        return this.textFmt.apply(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CellFormat) {
            return this.format.equals(((CellFormat) obj).format);
        }
        return false;
    }

    public int hashCode() {
        return this.format.hashCode();
    }

    private CellFormat(String str) {
        this.format = str;
        Matcher matcher = ONE_PART.matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            try {
                String group = matcher.group();
                arrayList.add(new CellFormatPart(group.endsWith(";") ? group.substring(0, group.length() - 1) : group));
            } catch (RuntimeException e10) {
                Logger logger = CellFormatter.logger;
                Level level = Level.WARNING;
                logger.log(level, "Invalid format: " + CellFormatter.quote(matcher.group()), (Throwable) e10);
                arrayList.add(null);
            }
        }
        int size = arrayList.size();
        if (size == 1) {
            CellFormatPart cellFormatPart = (CellFormatPart) arrayList.get(0);
            this.negNumFmt = cellFormatPart;
            this.zeroNumFmt = cellFormatPart;
            this.posNumFmt = cellFormatPart;
            this.textFmt = DEFAULT_TEXT_FORMAT;
        } else if (size == 2) {
            CellFormatPart cellFormatPart2 = (CellFormatPart) arrayList.get(0);
            this.zeroNumFmt = cellFormatPart2;
            this.posNumFmt = cellFormatPart2;
            this.negNumFmt = (CellFormatPart) arrayList.get(1);
            this.textFmt = DEFAULT_TEXT_FORMAT;
        } else if (size != 3) {
            this.posNumFmt = (CellFormatPart) arrayList.get(0);
            this.zeroNumFmt = (CellFormatPart) arrayList.get(1);
            this.negNumFmt = (CellFormatPart) arrayList.get(2);
            this.textFmt = (CellFormatPart) arrayList.get(3);
        } else {
            this.posNumFmt = (CellFormatPart) arrayList.get(0);
            this.zeroNumFmt = (CellFormatPart) arrayList.get(1);
            this.negNumFmt = (CellFormatPart) arrayList.get(2);
            this.textFmt = DEFAULT_TEXT_FORMAT;
        }
    }

    public CellFormatResult apply(ICell iCell) {
        int ultimateType = ultimateType(iCell);
        if (ultimateType != 0) {
            if (ultimateType != 1) {
                if (ultimateType != 3) {
                    if (ultimateType != 4) {
                        return apply("?");
                    }
                    return apply(Boolean.toString(iCell.getBooleanCellValue()));
                }
                return apply("");
            }
            return apply(iCell.getStringCellValue());
        }
        return apply(Double.valueOf(iCell.getNumericCellValue()));
    }
}
