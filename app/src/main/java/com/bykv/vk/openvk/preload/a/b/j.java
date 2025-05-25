package com.bykv.vk.openvk.preload.a.b;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: PreJava9DateFormatProvider.java */
/* loaded from: classes.dex */
public final class j {
    public static DateFormat a(int i10, int i11) {
        return new SimpleDateFormat(a(i10) + " " + b(i11), Locale.US);
    }

    private static String b(int i10) {
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return "h:mm a";
                }
                throw new IllegalArgumentException("Unknown DateFormat style: ".concat(String.valueOf(i10)));
            }
            return "h:mm:ss a";
        }
        return "h:mm:ss a z";
    }

    private static String a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return "M/d/yy";
                    }
                    throw new IllegalArgumentException("Unknown DateFormat style: ".concat(String.valueOf(i10)));
                }
                return "MMM d, yyyy";
            }
            return "MMMM d, yyyy";
        }
        return "EEEE, MMMM d, yyyy";
    }
}
