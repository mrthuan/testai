package lib.zj.office.ss.util;

import a0.d;
import a6.h;
import b.a;
import ii.e;
import ii.f;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;
import lib.zj.office.fc.ss.usermodel.ICell;

/* loaded from: classes3.dex */
public class DateUtil {
    private static final int BAD_DATE = -1;
    private static final long DAY_MILLISECONDS = 86400000;
    private static final int HOURS_PER_DAY = 24;
    private static final int MINUTES_PER_HOUR = 60;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final Pattern TIME_SEPARATOR_PATTERN = Pattern.compile(":");
    private static final Pattern date_ptrn1 = Pattern.compile("^\\[\\$\\-.*?\\]");
    private static final Pattern date_ptrn2 = Pattern.compile("^\\[[a-zA-Z]+\\]");
    private static final Pattern date_ptrn3 = Pattern.compile("^[\\[\\]yYmMdDhHsS\\-/,. :\"\\\\]+0*[ampAMP/]*$");
    private static final Pattern date_ptrn4 = Pattern.compile("^\\[([hH]+|[mM]+|[sS]+)\\]");

    /* loaded from: classes3.dex */
    public static final class FormatException extends Exception {
        public FormatException(String str) {
            super(str);
        }
    }

    public static int absoluteDay(Calendar calendar, boolean z10) {
        return calendar.get(6) + daysInPriorYears(calendar.get(1), z10);
    }

    public static double convertTime(String str) {
        try {
            return convertTimeInternal(str);
        } catch (FormatException e10) {
            StringBuilder g10 = a.g("Bad time format '", str, "' expected 'HH:MM' or 'HH:MM:SS' - ");
            g10.append(e10.getMessage());
            throw new IllegalArgumentException(g10.toString());
        }
    }

    private static double convertTimeInternal(String str) {
        String str2;
        int length = str.length();
        if (length >= 4 && length <= 8) {
            String[] split = TIME_SEPARATOR_PATTERN.split(str);
            int length2 = split.length;
            if (length2 != 2) {
                if (length2 == 3) {
                    str2 = split[2];
                } else {
                    throw new FormatException(h.g(new StringBuilder("Expected 2 or 3 fields but got ("), split.length, ")"));
                }
            } else {
                str2 = "00";
            }
            String str3 = split[0];
            String str4 = split[1];
            int parseInt = parseInt(str3, "hour", 24);
            return ((((parseInt * 60) + parseInt(str4, "minute", 60)) * 60) + parseInt(str2, "second", 60)) / 86400.0d;
        }
        throw new FormatException("Bad length");
    }

    private static Calendar dayStart(Calendar calendar) {
        calendar.get(11);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.get(11);
        return calendar;
    }

    private static int daysInPriorYears(int i10, boolean z10) {
        int i11 = 1900;
        if ((!z10 && i10 < 1900) || (z10 && i10 < 1900)) {
            throw new IllegalArgumentException("'year' must be 1900 or greater");
        }
        int i12 = i10 - 1;
        int i13 = ((i12 / 400) + ((i12 / 4) - (i12 / 100))) - 460;
        if (z10) {
            i11 = 1904;
        }
        return ((i10 - i11) * 365) + i13;
    }

    public static double getExcelDate(Date date) {
        return getExcelDate(date, false);
    }

    public static Date getJavaDate(double d10) {
        return getJavaDate(d10, false);
    }

    private static double internalGetExcelDate(Calendar calendar, boolean z10) {
        if (z10 || calendar.get(1) >= 1900) {
            if (z10 && calendar.get(1) < 1904) {
                return -1.0d;
            }
            int i10 = calendar.get(12);
            int i11 = calendar.get(13);
            double absoluteDay = ((calendar.get(14) + ((i11 + ((i10 + (calendar.get(11) * 60)) * 60)) * 1000)) / 8.64E7d) + absoluteDay(dayStart(calendar), z10);
            if (!z10 && absoluteDay >= 60.0d) {
                return absoluteDay + 1.0d;
            }
            if (z10) {
                return absoluteDay - 1.0d;
            }
            return absoluteDay;
        }
        return -1.0d;
    }

    public static boolean isADateFormat(int i10, String str) {
        if (isInternalDateFormat(i10)) {
            return true;
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        int i11 = 0;
        while (i11 < str.length()) {
            char charAt = str.charAt(i11);
            if (i11 < str.length() - 1) {
                int i12 = i11 + 1;
                char charAt2 = str.charAt(i12);
                if (charAt == '\\') {
                    if (charAt2 != ' ' && charAt2 != '\\') {
                        switch (charAt2) {
                        }
                    }
                } else if (charAt == ';' && charAt2 == '@') {
                    i11 = i12;
                }
                i11++;
            }
            sb2.append(charAt);
            i11++;
        }
        String sb3 = sb2.toString();
        if (date_ptrn4.matcher(sb3).matches()) {
            return true;
        }
        String replaceAll = date_ptrn2.matcher(date_ptrn1.matcher(sb3).replaceAll("")).replaceAll("");
        if (replaceAll.indexOf(59) > 0 && replaceAll.indexOf(59) < replaceAll.length() - 1) {
            replaceAll = replaceAll.substring(0, replaceAll.indexOf(59));
        }
        return date_ptrn3.matcher(replaceAll).matches();
    }

    public static boolean isCellDateFormatted(ei.a aVar) {
        e b10;
        if (aVar == null || !isValidExcelDate(aVar.f()) || (b10 = aVar.b()) == null) {
            return false;
        }
        if (b10.f18502a == null) {
            b10.f18502a = new f();
        }
        f fVar = b10.f18502a;
        short s4 = fVar.f18506a;
        if (fVar == null) {
            b10.f18502a = new f();
        }
        return isADateFormat(s4, b10.f18502a.f18507b);
    }

    public static boolean isCellInternalDateFormatted(ICell iCell) {
        if (iCell == null || !isValidExcelDate(iCell.getNumericCellValue())) {
            return false;
        }
        return isInternalDateFormat(iCell.getCellStyle().getDataFormat());
    }

    public static boolean isInternalDateFormat(int i10) {
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                return true;
            default:
                switch (i10) {
                    case 45:
                    case 46:
                    case 47:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public static boolean isValidExcelDate(double d10) {
        if (d10 > -4.9E-324d) {
            return true;
        }
        return false;
    }

    private static int parseInt(String str, String str2, int i10) {
        return parseInt(str, str2, 0, i10 - 1);
    }

    public static Date parseYYYYMMDDDate(String str) {
        try {
            return parseYYYYMMDDDateInternal(str);
        } catch (FormatException e10) {
            StringBuilder g10 = a.g("Bad time format ", str, " expected 'YYYY/MM/DD' - ");
            g10.append(e10.getMessage());
            throw new IllegalArgumentException(g10.toString());
        }
    }

    private static Date parseYYYYMMDDDateInternal(String str) {
        if (str.length() == 10) {
            String substring = str.substring(0, 4);
            String substring2 = str.substring(5, 7);
            String substring3 = str.substring(8, 10);
            GregorianCalendar gregorianCalendar = new GregorianCalendar(parseInt(substring, "year", -32768, 32767), parseInt(substring2, "month", 1, 12) - 1, parseInt(substring3, "day", 1, 31), 0, 0, 0);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTime();
        }
        throw new FormatException("Bad length");
    }

    public static void setCalendar(Calendar calendar, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        int i14;
        if (z10) {
            i14 = 1;
            i13 = 1904;
        } else {
            if (i10 < 61) {
                i12 = 0;
            } else {
                i12 = -1;
            }
            i13 = 1900;
            i14 = i12;
        }
        calendar.set(i13, 0, i10 + i14, 0, 0, 0);
        calendar.set(14, i11);
    }

    public static double getExcelDate(Date date, boolean z10) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        return internalGetExcelDate(gregorianCalendar, z10);
    }

    public static Date getJavaDate(double d10, boolean z10) {
        if (isValidExcelDate(d10)) {
            int floor = (int) Math.floor(d10);
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            setCalendar(gregorianCalendar, floor, (int) androidx.activity.f.e(d10, floor, 8.64E7d, 0.5d), z10);
            return gregorianCalendar.getTime();
        }
        return null;
    }

    private static int parseInt(String str, String str2, int i10, int i11) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt < i10 || parseInt > i11) {
                throw new FormatException(str2 + " value (" + parseInt + ") is outside the allowable range(0.." + i11 + ")");
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            throw new FormatException(d.d("Bad int format '", str, "' for ", str2, " field"));
        }
    }

    public static double getExcelDate(Calendar calendar, boolean z10) {
        return internalGetExcelDate((Calendar) calendar.clone(), z10);
    }
}
