package com.tom_roush.pdfbox.util;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSString;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class DateConverter {
    private static final int DAY = 86400000;
    private static final int HALF_DAY = 43200000;
    private static final int MILLIS_PER_HOUR = 3600000;
    private static final int MILLIS_PER_MINUTE = 60000;
    private static final int MINUTES_PER_HOUR = 60;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final String[] ALPHA_START_FORMATS = {"EEEE, dd MMM yy hh:mm:ss a", "EEEE, MMM dd, yy hh:mm:ss a", "EEEE, MMM dd, yy 'at' hh:mma", "EEEE, MMM dd, yy", "EEEE MMM dd, yy HH:mm:ss", "EEEE MMM dd HH:mm:ss z yy", "EEEE MMM dd HH:mm:ss yy"};
    private static final String[] DIGIT_START_FORMATS = {"dd MMM yy HH:mm:ss", "dd MMM yy HH:mm", "yyyy MMM d", "yyyymmddhh:mm:ss", "H:m M/d/yy", "M/d/yy HH:mm:ss", "M/d/yy HH:mm", "M/d/yy"};

    private DateConverter() {
    }

    private static void adjustTimeZoneNicely(GregorianCalendar gregorianCalendar, TimeZone timeZone) {
        gregorianCalendar.setTimeZone(timeZone);
        gregorianCalendar.add(12, -((gregorianCalendar.get(16) + gregorianCalendar.get(15)) / 60000));
    }

    public static String formatTZoffset(long j10, String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("Z");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(restrainTZoffset(j10), "unknown"));
        String format = simpleDateFormat.format(new Date());
        return format.substring(0, 3) + str + format.substring(3);
    }

    public static GregorianCalendar newGreg() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(Locale.ENGLISH);
        gregorianCalendar.setTimeZone(new SimpleTimeZone(0, "UTC"));
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar;
    }

    private static GregorianCalendar parseBigEndianDate(String str, ParsePosition parsePosition) {
        ParsePosition parsePosition2 = new ParsePosition(parsePosition.getIndex());
        int parseTimeField = parseTimeField(str, parsePosition2, 4, 0);
        if (parsePosition2.getIndex() != parsePosition.getIndex() + 4) {
            return null;
        }
        skipOptionals(str, parsePosition2, "/- ");
        int parseTimeField2 = parseTimeField(str, parsePosition2, 2, 1) - 1;
        skipOptionals(str, parsePosition2, "/- ");
        int parseTimeField3 = parseTimeField(str, parsePosition2, 2, 1);
        skipOptionals(str, parsePosition2, " T");
        int parseTimeField4 = parseTimeField(str, parsePosition2, 2, 0);
        skipOptionals(str, parsePosition2, ": ");
        int parseTimeField5 = parseTimeField(str, parsePosition2, 2, 0);
        skipOptionals(str, parsePosition2, ": ");
        int parseTimeField6 = parseTimeField(str, parsePosition2, 2, 0);
        if (skipOptionals(str, parsePosition2, ".") == '.') {
            parseTimeField(str, parsePosition2, 19, 0);
        }
        GregorianCalendar newGreg = newGreg();
        try {
            newGreg.set(parseTimeField, parseTimeField2, parseTimeField3, parseTimeField4, parseTimeField5, parseTimeField6);
            newGreg.getTimeInMillis();
            parsePosition.setIndex(parsePosition2.getIndex());
            skipOptionals(str, parsePosition, " ");
            return newGreg;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static Calendar parseDate(String str, ParsePosition parsePosition) {
        int i10;
        String[] strArr;
        if (str == null || str.isEmpty() || "D:".equals(str.trim())) {
            return null;
        }
        ParsePosition parsePosition2 = new ParsePosition(parsePosition.getIndex());
        skipOptionals(str, parsePosition2, " ");
        int index = parsePosition2.getIndex();
        GregorianCalendar parseBigEndianDate = parseBigEndianDate(str, parsePosition2);
        if (parseBigEndianDate != null && (parsePosition2.getIndex() == str.length() || parseTZoffset(str, parseBigEndianDate, parsePosition2))) {
            i10 = parsePosition2.getIndex();
            if (i10 == str.length()) {
                parsePosition.setIndex(i10);
                return parseBigEndianDate;
            }
        } else {
            parseBigEndianDate = null;
            i10 = -999999;
        }
        parsePosition2.setIndex(index);
        if (Character.isDigit(str.charAt(index))) {
            strArr = DIGIT_START_FORMATS;
        } else {
            strArr = ALPHA_START_FORMATS;
        }
        GregorianCalendar parseSimpleDate = parseSimpleDate(str, strArr, parsePosition2);
        if (parseSimpleDate != null && (parsePosition2.getIndex() == str.length() || parseTZoffset(str, parseSimpleDate, parsePosition2))) {
            int index2 = parsePosition2.getIndex();
            if (index2 == str.length()) {
                parsePosition.setIndex(index2);
                return parseSimpleDate;
            } else if (index2 > i10) {
                i10 = index2;
                parseBigEndianDate = parseSimpleDate;
            }
        }
        if (parseBigEndianDate != null) {
            parsePosition.setIndex(i10);
            return parseBigEndianDate;
        }
        return parseSimpleDate;
    }

    private static GregorianCalendar parseSimpleDate(String str, String[] strArr, ParsePosition parsePosition) {
        for (String str2 : strArr) {
            ParsePosition parsePosition2 = new ParsePosition(parsePosition.getIndex());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.ENGLISH);
            GregorianCalendar newGreg = newGreg();
            simpleDateFormat.setCalendar(newGreg);
            if (simpleDateFormat.parse(str, parsePosition2) != null) {
                parsePosition.setIndex(parsePosition2.getIndex());
                skipOptionals(str, parsePosition, " ");
                return newGreg;
            }
        }
        return null;
    }

    public static boolean parseTZoffset(String str, GregorianCalendar gregorianCalendar, ParsePosition parsePosition) {
        boolean z10;
        int i10;
        ParsePosition parsePosition2 = new ParsePosition(parsePosition.getIndex());
        TimeZone simpleTimeZone = new SimpleTimeZone(0, "GMT");
        char skipOptionals = skipOptionals(str, parsePosition2, "Z+- ");
        if (skipOptionals != 'Z' && !skipString(str, "GMT", parsePosition2) && !skipString(str, "UTC", parsePosition2)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            skipOptionals = skipOptionals(str, parsePosition2, "+- ");
        }
        int parseTimeField = parseTimeField(str, parsePosition2, 2, -999);
        skipOptionals(str, parsePosition2, "': ");
        int parseTimeField2 = parseTimeField(str, parsePosition2, 2, 0);
        skipOptionals(str, parsePosition2, "' ");
        if (parseTimeField != -999) {
            if (skipOptionals == '-') {
                i10 = -1;
            } else {
                i10 = 1;
            }
            simpleTimeZone.setRawOffset(restrainTZoffset(((parseTimeField2 * 60000) + (parseTimeField * 3600000)) * i10));
            updateZoneId(simpleTimeZone);
        } else if (!z10) {
            simpleTimeZone = TimeZone.getTimeZone(str.substring(parsePosition.getIndex()).trim());
            if ("GMT".equals(simpleTimeZone.getID())) {
                return false;
            }
            parsePosition2.setIndex(str.length());
        }
        adjustTimeZoneNicely(gregorianCalendar, simpleTimeZone);
        parsePosition.setIndex(parsePosition2.getIndex());
        return true;
    }

    private static int parseTimeField(String str, ParsePosition parsePosition, int i10, int i11) {
        if (str == null) {
            return i11;
        }
        int index = parsePosition.getIndex();
        int min = Math.min(i10, str.length() - index) + index;
        int i12 = 0;
        while (index < min) {
            int charAt = str.charAt(index) - '0';
            if (charAt < 0 || charAt > 9) {
                break;
            }
            i12 = (i12 * 10) + charAt;
            index++;
        }
        if (index == parsePosition.getIndex()) {
            return i11;
        }
        parsePosition.setIndex(index);
        return i12;
    }

    private static int restrainTZoffset(long j10) {
        if (j10 <= 50400000 && j10 >= -50400000) {
            return (int) j10;
        }
        long j11 = (((j10 + 43200000) % 86400000) + 86400000) % 86400000;
        if (j11 == 0) {
            return HALF_DAY;
        }
        return (int) ((j11 - 43200000) % 43200000);
    }

    private static char skipOptionals(String str, ParsePosition parsePosition, String str2) {
        char c = ' ';
        while (parsePosition.getIndex() < str.length()) {
            char charAt = str.charAt(parsePosition.getIndex());
            if (str2.indexOf(charAt) < 0) {
                break;
            }
            if (charAt != ' ') {
                c = charAt;
            }
            parsePosition.setIndex(parsePosition.getIndex() + 1);
        }
        return c;
    }

    private static boolean skipString(String str, String str2, ParsePosition parsePosition) {
        if (str.startsWith(str2, parsePosition.getIndex())) {
            parsePosition.setIndex(str2.length() + parsePosition.getIndex());
            return true;
        }
        return false;
    }

    public static Calendar toCalendar(COSString cOSString) {
        if (cOSString == null) {
            return null;
        }
        return toCalendar(cOSString.getString());
    }

    public static String toISO8601(Calendar calendar) {
        return String.format(Locale.US, "%1$4tY-%1$2tm-%1$2tdT%1$2tH:%1$2tM:%1$2tS%2$s", calendar, formatTZoffset(calendar.get(16) + calendar.get(15), ":"));
    }

    public static String toString(Calendar calendar) {
        if (calendar == null) {
            return null;
        }
        return String.format(Locale.US, "D:%1$4tY%1$2tm%1$2td%1$2tH%1$2tM%1$2tS%2$s'", calendar, formatTZoffset(calendar.get(16) + calendar.get(15), OperatorName.SHOW_TEXT_LINE));
    }

    private static void updateZoneId(TimeZone timeZone) {
        boolean z10;
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            z10 = true;
        } else {
            z10 = true;
        }
        int i10 = rawOffset / 3600000;
        int i11 = (rawOffset % 3600000) / 60000;
        if (rawOffset == 0) {
            timeZone.setID("GMT");
        } else if (z10 && i10 <= 12) {
            timeZone.setID(String.format(Locale.US, "GMT+%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i11)));
        } else if (z10 && i10 <= 14) {
            timeZone.setID(String.format(Locale.US, "GMT-%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i11)));
        } else {
            timeZone.setID("unknown");
        }
    }

    public static Calendar toCalendar(String str) {
        if (str != null && !str.trim().isEmpty()) {
            ParsePosition parsePosition = new ParsePosition(0);
            skipOptionals(str, parsePosition, " ");
            skipString(str, "D:", parsePosition);
            Calendar parseDate = parseDate(str, parsePosition);
            if (parseDate != null && parsePosition.getIndex() == str.length()) {
                return parseDate;
            }
        }
        return null;
    }
}
