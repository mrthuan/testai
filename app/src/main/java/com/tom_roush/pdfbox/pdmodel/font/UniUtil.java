package com.tom_roush.pdfbox.pdmodel.font;

import java.util.Locale;

/* loaded from: classes2.dex */
final class UniUtil {
    private UniUtil() {
    }

    public static String getUniNameOfCodePoint(int i10) {
        String upperCase = Integer.toString(i10, 16).toUpperCase(Locale.US);
        int length = upperCase.length();
        if (length != 1) {
            if (length != 2) {
                if (length != 3) {
                    return "uni".concat(upperCase);
                }
                return "uni0".concat(upperCase);
            }
            return "uni00".concat(upperCase);
        }
        return "uni000".concat(upperCase);
    }
}
