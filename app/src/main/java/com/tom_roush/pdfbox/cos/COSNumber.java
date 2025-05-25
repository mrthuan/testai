package com.tom_roush.pdfbox.cos;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class COSNumber extends COSBase {
    @Deprecated
    public static final COSInteger ZERO = COSInteger.ZERO;
    @Deprecated
    public static final COSInteger ONE = COSInteger.ONE;

    public static COSNumber get(String str) {
        String substring;
        if (str.length() == 1) {
            char charAt = str.charAt(0);
            if ('0' <= charAt && charAt <= '9') {
                return COSInteger.get(charAt - 48);
            }
            if (charAt != '-' && charAt != '.') {
                throw new IOException("Not a number: ".concat(str));
            }
            return COSInteger.ZERO;
        } else if (isFloat(str)) {
            return new COSFloat(str);
        } else {
            try {
                if (str.charAt(0) == '+') {
                    return COSInteger.get(Long.parseLong(str.substring(1)));
                }
                return COSInteger.get(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                if (!str.startsWith("+") && !str.startsWith("-")) {
                    substring = str;
                } else {
                    substring = str.substring(1);
                }
                if (substring.matches("[0-9]*")) {
                    if (str.startsWith("-")) {
                        return COSInteger.OUT_OF_RANGE_MIN;
                    }
                    return COSInteger.OUT_OF_RANGE_MAX;
                }
                throw new IOException("Not a number: ".concat(str));
            }
        }
    }

    private static boolean isFloat(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '.' || charAt == 'e') {
                return true;
            }
        }
        return false;
    }

    public abstract double doubleValue();

    public abstract float floatValue();

    public abstract int intValue();

    public abstract long longValue();
}
