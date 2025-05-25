package com.tom_roush.pdfbox.util;

import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: classes2.dex */
public class NumberFormatUtil {
    private static final int MAX_FRACTION_DIGITS = 5;
    private static final long[] POWER_OF_TENS;
    private static final int[] POWER_OF_TENS_INT;

    static {
        long[] jArr = new long[19];
        POWER_OF_TENS = jArr;
        jArr[0] = 1;
        int i10 = 1;
        int i11 = 1;
        while (true) {
            long[] jArr2 = POWER_OF_TENS;
            if (i11 >= jArr2.length) {
                break;
            }
            jArr2[i11] = jArr2[i11 - 1] * 10;
            i11++;
        }
        int[] iArr = new int[10];
        POWER_OF_TENS_INT = iArr;
        iArr[0] = 1;
        while (true) {
            int[] iArr2 = POWER_OF_TENS_INT;
            if (i10 < iArr2.length) {
                iArr2[i10] = iArr2[i10 - 1] * 10;
                i10++;
            } else {
                return;
            }
        }
    }

    private NumberFormatUtil() {
    }

    public static int formatFloatFast(float f10, int i10, byte[] bArr) {
        int i11;
        if (!Float.isNaN(f10) && !Float.isInfinite(f10) && f10 <= 9.223372E18f && f10 > -9.223372E18f && i10 <= 5) {
            long j10 = f10;
            if (f10 < 0.0f) {
                bArr[0] = Field.DDE;
                j10 = -j10;
                i11 = 1;
            } else {
                i11 = 0;
            }
            double abs = Math.abs(f10) - j10;
            long j11 = POWER_OF_TENS[i10];
            long j12 = (long) ((abs * j11) + 0.5d);
            if (j12 >= j11) {
                j10++;
                j12 -= j11;
            }
            long j13 = j12;
            int formatPositiveNumber = formatPositiveNumber(j10, getExponent(j10), false, bArr, i11);
            if (j13 > 0 && i10 > 0) {
                bArr[formatPositiveNumber] = Field.DDEAUTO;
                return formatPositiveNumber(j13, i10 - 1, true, bArr, formatPositiveNumber + 1);
            }
            return formatPositiveNumber;
        }
        return -1;
    }

    private static int formatPositiveNumber(long j10, int i10, boolean z10, byte[] bArr, int i11) {
        long j11;
        while (j10 > 2147483647L && (!z10 || j10 > 0)) {
            long j12 = POWER_OF_TENS[i10];
            j10 -= j12 * (j10 / j12);
            bArr[i11] = (byte) (j11 + 48);
            i10--;
            i11++;
        }
        int i12 = (int) j10;
        while (i10 >= 0 && (!z10 || i12 > 0)) {
            int i13 = POWER_OF_TENS_INT[i10];
            int i14 = i12 / i13;
            i12 -= i13 * i14;
            bArr[i11] = (byte) (i14 + 48);
            i10--;
            i11++;
        }
        return i11;
    }

    private static int getExponent(long j10) {
        int i10 = 0;
        while (true) {
            long[] jArr = POWER_OF_TENS;
            if (i10 < jArr.length - 1) {
                int i11 = i10 + 1;
                if (j10 < jArr[i11]) {
                    return i10;
                }
                i10 = i11;
            } else {
                return jArr.length - 1;
            }
        }
    }
}
