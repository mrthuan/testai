package com.inmobi.media;

import java.util.Locale;

/* renamed from: com.inmobi.media.g7  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1640g7 {
    public static byte a(String referencedCreativeString) {
        int i10;
        boolean z10;
        kotlin.jvm.internal.g.e(referencedCreativeString, "referencedCreativeString");
        Locale locale = Locale.US;
        String e10 = a0.d.e(locale, "US", referencedCreativeString, locale, "this as java.lang.String).toLowerCase(locale)");
        int length = e10.length() - 1;
        int i11 = 0;
        boolean z11 = false;
        while (i11 <= length) {
            if (!z11) {
                i10 = i11;
            } else {
                i10 = length;
            }
            if (kotlin.jvm.internal.g.f(e10.charAt(i10), 32) <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z11) {
                if (!z10) {
                    z11 = true;
                } else {
                    i11++;
                }
            } else if (!z10) {
                break;
            } else {
                length--;
            }
        }
        String a10 = C6.a(length, 1, e10, i11);
        int hashCode = a10.hashCode();
        if (hashCode != -1412832500) {
            if (hashCode != 0) {
                if (hashCode == 112202875 && a10.equals("video")) {
                    return (byte) 1;
                }
            } else if (a10.equals("")) {
                return (byte) 1;
            }
        } else if (a10.equals("companion")) {
            return (byte) 2;
        }
        return (byte) 0;
    }
}
