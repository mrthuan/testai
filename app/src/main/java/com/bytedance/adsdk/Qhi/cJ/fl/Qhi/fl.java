package com.bytedance.adsdk.Qhi.cJ.fl.Qhi;

import androidx.activity.r;

/* compiled from: LtUtil.java */
/* loaded from: classes.dex */
public class fl {
    private static Object Qhi(int i10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(i10 < number.intValue());
        } else if (number instanceof Long) {
            return Boolean.valueOf(((long) i10) < number.longValue());
        } else if (number instanceof Float) {
            return Boolean.valueOf(((float) i10) < number.floatValue());
        } else if (number instanceof Double) {
            return Boolean.valueOf(((double) i10) < number.doubleValue());
        } else {
            throw new UnsupportedOperationException(r.d(number, "This type of addition operation is not supported"));
        }
    }

    private static Object Qhi(long j10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(j10 < ((long) number.intValue()));
        } else if (number instanceof Long) {
            return Boolean.valueOf(j10 < number.longValue());
        } else if (number instanceof Float) {
            return Boolean.valueOf(((float) j10) < number.floatValue());
        } else if (number instanceof Double) {
            return Boolean.valueOf(((double) j10) < number.doubleValue());
        } else {
            throw new UnsupportedOperationException(r.d(number, "This type of addition operation is not supported"));
        }
    }

    private static Object Qhi(float f10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(f10 < ((float) number.intValue()));
        } else if (number instanceof Long) {
            return Boolean.valueOf(f10 < ((float) number.longValue()));
        } else if (number instanceof Float) {
            return Boolean.valueOf(f10 < number.floatValue());
        } else if (number instanceof Double) {
            return Boolean.valueOf(((double) f10) < number.doubleValue());
        } else {
            throw new UnsupportedOperationException(r.d(number, "This type of addition operation is not supported"));
        }
    }

    private static Object Qhi(double d10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(d10 < ((double) number.intValue()));
        } else if (number instanceof Long) {
            return Boolean.valueOf(d10 < ((double) number.longValue()));
        } else if (number instanceof Float) {
            return Boolean.valueOf(d10 < ((double) number.floatValue()));
        } else if (number instanceof Double) {
            return Boolean.valueOf(d10 < number.doubleValue());
        } else {
            throw new UnsupportedOperationException(r.d(number, "This type of addition operation is not supported"));
        }
    }

    public static Object Qhi(Object obj, Number number) {
        if (!(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Byte)) {
            if (obj instanceof Long) {
                return Qhi(((Long) obj).longValue(), number);
            }
            if (obj instanceof Float) {
                return Qhi(((Float) obj).floatValue(), number);
            }
            if (obj instanceof Double) {
                return Qhi(((Double) obj).doubleValue(), number);
            }
            if (obj instanceof String) {
                try {
                    return Qhi(Float.parseFloat((String) obj), number);
                } catch (NumberFormatException unused) {
                    throw new UnsupportedOperationException(obj.getClass().getName().concat("This type of addition operation is not supported"));
                }
            }
            throw new UnsupportedOperationException(obj.getClass().getName().concat("This type of addition operation is not supported"));
        }
        return Qhi(((Number) obj).intValue(), number);
    }
}
