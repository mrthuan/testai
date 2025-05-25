package com.bytedance.adsdk.Qhi.cJ.fl.Qhi;

import androidx.activity.r;

/* compiled from: ModUtil.java */
/* loaded from: classes.dex */
public class ROR {
    private static Object Qhi(int i10, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Long.valueOf(i10 % number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(i10 % number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(i10 % number.doubleValue());
            }
            throw new UnsupportedOperationException(r.d(number, "This type of addition operation is not supported"));
        }
        return Integer.valueOf(i10 % number.intValue());
    }

    private static Object Qhi(long j10, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Long.valueOf(j10 % number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(((float) j10) % number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(j10 % number.doubleValue());
            }
            throw new UnsupportedOperationException(r.d(number, "This type of addition operation is not supported"));
        }
        return Long.valueOf(j10 % number.intValue());
    }

    private static Object Qhi(float f10, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Float.valueOf(f10 % ((float) number.longValue()));
            }
            if (number instanceof Float) {
                return Float.valueOf(f10 % number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(f10 % number.doubleValue());
            }
            throw new UnsupportedOperationException(r.d(number, "This type of addition operation is not supported"));
        }
        return Float.valueOf(f10 % number.intValue());
    }

    private static Object Qhi(double d10, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Double.valueOf(d10 % number.longValue());
            }
            if (number instanceof Float) {
                return Double.valueOf(d10 % number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(d10 % number.doubleValue());
            }
            throw new UnsupportedOperationException(r.d(number, "This type of addition operation is not supported"));
        }
        return Double.valueOf(d10 % number.intValue());
    }

    public static Object Qhi(Number number, Number number2) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Qhi(number.longValue(), number2);
            }
            if (number instanceof Float) {
                return Qhi(number.floatValue(), number2);
            }
            if (number instanceof Double) {
                return Qhi(number.doubleValue(), number2);
            }
            throw new UnsupportedOperationException(r.d(number, "This type of addition operation is not supported"));
        }
        return Qhi(number.intValue(), number2);
    }
}
