package com.bytedance.adsdk.Qhi.cJ.fl.Qhi;

import androidx.activity.r;

/* compiled from: EqUtil.java */
/* loaded from: classes.dex */
public class cJ {
    private static boolean Qhi(int i10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return i10 == number.intValue();
        } else if (number instanceof Long) {
            return ((long) i10) == number.longValue();
        } else if (number instanceof Float) {
            return ((float) i10) == number.floatValue();
        } else if (number instanceof Double) {
            return ((double) i10) == number.doubleValue();
        } else {
            throw new UnsupportedOperationException(r.d(number, "This type of addition operation is not supported"));
        }
    }

    private static boolean Qhi(long j10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return j10 == ((long) number.intValue());
        } else if (number instanceof Long) {
            return j10 == number.longValue();
        } else if (number instanceof Float) {
            return ((float) j10) == number.floatValue();
        } else if (number instanceof Double) {
            return ((double) j10) == number.doubleValue();
        } else {
            throw new UnsupportedOperationException(r.d(number, "This type of addition operation is not supported"));
        }
    }

    private static boolean Qhi(float f10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return f10 == ((float) number.intValue());
        } else if (number instanceof Long) {
            return f10 == ((float) number.longValue());
        } else if (number instanceof Float) {
            return f10 == number.floatValue();
        } else if (number instanceof Double) {
            return ((double) f10) == number.doubleValue();
        } else {
            throw new UnsupportedOperationException(r.d(number, "This type of addition operation is not supported"));
        }
    }

    private static boolean Qhi(double d10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return d10 == ((double) number.intValue());
        } else if (number instanceof Long) {
            return d10 == ((double) number.longValue());
        } else if (number instanceof Float) {
            return d10 == ((double) number.floatValue());
        } else if (number instanceof Double) {
            return d10 == number.doubleValue();
        } else {
            throw new UnsupportedOperationException(r.d(number, "This type of addition operation is not supported"));
        }
    }

    public static boolean Qhi(Number number, Number number2) {
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
