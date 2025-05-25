package lib.zj.office.fc.hssf.formula.atp;

import androidx.activity.r;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.ss.util.DateUtil;

/* loaded from: classes3.dex */
final class YearFracCalculator {
    private static final int DAYS_PER_LEAP_YEAR = 366;
    private static final int DAYS_PER_NORMAL_YEAR = 365;
    private static final int LONG_FEB_LEN = 29;
    private static final int LONG_MONTH_LEN = 31;
    private static final int MS_PER_DAY = 86400000;
    private static final int MS_PER_HOUR = 3600000;
    private static final int SHORT_FEB_LEN = 28;
    private static final int SHORT_MONTH_LEN = 30;
    private static final TimeZone UTC_TIME_ZONE = TimeZone.getTimeZone("UTC");

    /* loaded from: classes3.dex */
    public static final class SimpleDate {
        public static final int FEBRUARY = 2;
        public static final int JANUARY = 1;
        public final int day;
        public final int month;
        public long tsMilliseconds;
        public final int year;

        public SimpleDate(Calendar calendar) {
            this.year = calendar.get(1);
            this.month = calendar.get(2) + 1;
            this.day = calendar.get(5);
            this.tsMilliseconds = calendar.getTimeInMillis();
        }
    }

    private YearFracCalculator() {
    }

    private static double averageYearLength(int i10, int i11) {
        int i12 = 0;
        for (int i13 = i10; i13 <= i11; i13++) {
            i12 += DAYS_PER_NORMAL_YEAR;
            if (isLeapYear(i13)) {
                i12++;
            }
        }
        return i12 / ((i11 - i10) + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (isLastDayOfMonth(r6) != false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static double basis0(int r5, int r6) {
        /*
            lib.zj.office.fc.hssf.formula.atp.YearFracCalculator$SimpleDate r5 = createDate(r5)
            lib.zj.office.fc.hssf.formula.atp.YearFracCalculator$SimpleDate r6 = createDate(r6)
            int r0 = r5.day
            int r1 = r6.day
            r2 = 30
            r3 = 31
            if (r0 != r3) goto L17
            if (r1 != r3) goto L17
        L14:
            r0 = r2
            r1 = r0
            goto L37
        L17:
            if (r0 != r3) goto L1b
        L19:
            r0 = r2
            goto L37
        L1b:
            if (r0 != r2) goto L21
            if (r1 != r3) goto L21
            r1 = r2
            goto L37
        L21:
            int r3 = r5.month
            r4 = 2
            if (r3 != r4) goto L37
            boolean r3 = isLastDayOfMonth(r5)
            if (r3 == 0) goto L37
            int r0 = r6.month
            if (r0 != r4) goto L19
            boolean r0 = isLastDayOfMonth(r6)
            if (r0 == 0) goto L19
            goto L14
        L37:
            double r5 = calculateAdjusted(r5, r6, r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.hssf.formula.atp.YearFracCalculator.basis0(int, int):double");
    }

    public static double basis1(int i10, int i11) {
        double d10;
        SimpleDate createDate = createDate(i10);
        SimpleDate createDate2 = createDate(i11);
        if (isGreaterThanOneYear(createDate, createDate2)) {
            d10 = averageYearLength(createDate.year, createDate2.year);
        } else if (shouldCountFeb29(createDate, createDate2)) {
            d10 = 366.0d;
        } else {
            d10 = 365.0d;
        }
        return dateDiff(createDate.tsMilliseconds, createDate2.tsMilliseconds) / d10;
    }

    public static double basis2(int i10, int i11) {
        return (i11 - i10) / 360.0d;
    }

    public static double basis3(double d10, double d11) {
        return (d11 - d10) / 365.0d;
    }

    public static double basis4(int i10, int i11) {
        SimpleDate createDate = createDate(i10);
        SimpleDate createDate2 = createDate(i11);
        int i12 = createDate.day;
        int i13 = createDate2.day;
        if (i12 == 31) {
            i12 = 30;
        }
        if (i13 == 31) {
            i13 = 30;
        }
        return calculateAdjusted(createDate, createDate2, i12, i13);
    }

    public static double calculate(double d10, double d11, int i10) {
        if (i10 >= 0 && i10 < 5) {
            int floor = (int) Math.floor(d10);
            int floor2 = (int) Math.floor(d11);
            if (floor == floor2) {
                return 0.0d;
            }
            if (floor > floor2) {
                floor2 = floor;
                floor = floor2;
            }
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                return basis4(floor, floor2);
                            }
                            throw new IllegalStateException("cannot happen");
                        }
                        return basis3(floor, floor2);
                    }
                    return basis2(floor, floor2);
                }
                return basis1(floor, floor2);
            }
            return basis0(floor, floor2);
        }
        throw new EvaluationException(ErrorEval.NUM_ERROR);
    }

    private static double calculateAdjusted(SimpleDate simpleDate, SimpleDate simpleDate2, int i10, int i11) {
        return (((i11 - i10) * 1) + (((simpleDate2.month - simpleDate.month) * 30) + ((simpleDate2.year - simpleDate.year) * 360))) / 360.0d;
    }

    private static SimpleDate createDate(int i10) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(UTC_TIME_ZONE);
        DateUtil.setCalendar(gregorianCalendar, i10, 0, false);
        return new SimpleDate(gregorianCalendar);
    }

    private static int dateDiff(long j10, long j11) {
        long j12 = j11 - j10;
        if (((int) ((j12 % 86400000) / 3600000)) == 0) {
            return (int) ((j12 / 8.64E7d) + 0.5d);
        }
        StringBuilder h10 = r.h("Unexpected date diff between ", j10, " and ");
        h10.append(j11);
        throw new RuntimeException(h10.toString());
    }

    private static int getLastDayOfMonth(SimpleDate simpleDate) {
        switch (simpleDate.month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
            default:
                if (isLeapYear(simpleDate.year)) {
                    return 29;
                }
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
        }
    }

    private static boolean isGreaterThanOneYear(SimpleDate simpleDate, SimpleDate simpleDate2) {
        int i10 = simpleDate.year;
        int i11 = simpleDate2.year;
        if (i10 == i11) {
            return false;
        }
        if (i10 + 1 != i11) {
            return true;
        }
        int i12 = simpleDate.month;
        int i13 = simpleDate2.month;
        if (i12 > i13) {
            return false;
        }
        if (i12 >= i13 && simpleDate.day >= simpleDate2.day) {
            return false;
        }
        return true;
    }

    private static boolean isLastDayOfMonth(SimpleDate simpleDate) {
        int i10 = simpleDate.day;
        if (i10 < 28 || i10 != getLastDayOfMonth(simpleDate)) {
            return false;
        }
        return true;
    }

    private static boolean isLeapYear(int i10) {
        if (i10 % 4 != 0) {
            return false;
        }
        if (i10 % 400 != 0 && i10 % 100 == 0) {
            return false;
        }
        return true;
    }

    private static boolean shouldCountFeb29(SimpleDate simpleDate, SimpleDate simpleDate2) {
        int i10;
        boolean isLeapYear = isLeapYear(simpleDate.year);
        if (isLeapYear && simpleDate.year == simpleDate2.year) {
            return true;
        }
        boolean isLeapYear2 = isLeapYear(simpleDate2.year);
        if (!isLeapYear && !isLeapYear2) {
            return false;
        }
        if (isLeapYear) {
            int i11 = simpleDate.month;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
            return false;
        } else if (!isLeapYear2 || (i10 = simpleDate2.month) == 1) {
            return false;
        } else {
            if (i10 != 2 || simpleDate2.day == 29) {
                return true;
            }
            return false;
        }
    }
}
