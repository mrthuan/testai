package com.bytedance.adsdk.Qhi.cJ.fl.Qhi;

import androidx.activity.r;

/* compiled from: PlusUtil.java */
/* loaded from: classes.dex */
public class hm {
    private static Object Qhi(int i10, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Long.valueOf(number.longValue() + i10);
            } else if (number instanceof Float) {
                return Float.valueOf(number.floatValue() + i10);
            } else if (number instanceof Double) {
                return Double.valueOf(number.doubleValue() + i10);
            } else {
                throw new UnsupportedOperationException(r.d(number, "This type of addition operation is not supported"));
            }
        }
        return Integer.valueOf(number.intValue() + i10);
    }

    private static Object Qhi(long j10, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Long.valueOf(number.longValue() + j10);
            }
            if (number instanceof Float) {
                return Float.valueOf(number.floatValue() + ((float) j10));
            } else if (number instanceof Double) {
                return Double.valueOf(number.doubleValue() + j10);
            } else {
                throw new UnsupportedOperationException(r.d(number, "This type of addition operation is not supported"));
            }
        }
        return Long.valueOf(j10 + number.intValue());
    }

    private static Object Qhi(float f10, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Float.valueOf(f10 + ((float) number.longValue()));
            }
            if (number instanceof Float) {
                return Float.valueOf(number.floatValue() + f10);
            }
            if (number instanceof Double) {
                return Double.valueOf(number.doubleValue() + f10);
            }
            throw new UnsupportedOperationException(r.d(number, "This type of addition operation is not supported"));
        }
        return Float.valueOf(f10 + number.intValue());
    }

    private static Object Qhi(double d10, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Double.valueOf(d10 + number.longValue());
            }
            if (number instanceof Float) {
                return Double.valueOf(d10 + number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(number.doubleValue() + d10);
            }
            throw new UnsupportedOperationException(r.d(number, "This type of addition operation is not supported"));
        }
        return Double.valueOf(d10 + number.intValue());
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
