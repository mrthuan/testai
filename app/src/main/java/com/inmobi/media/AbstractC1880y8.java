package com.inmobi.media;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;

/* renamed from: com.inmobi.media.y8  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1880y8 {
    public static String a(String valueTypeString) {
        int i10;
        boolean z10;
        kotlin.jvm.internal.g.e(valueTypeString, "valueTypeString");
        int length = valueTypeString.length() - 1;
        int i11 = 0;
        boolean z11 = false;
        while (i11 <= length) {
            if (!z11) {
                i10 = i11;
            } else {
                i10 = length;
            }
            if (kotlin.jvm.internal.g.f(valueTypeString.charAt(i10), 32) <= 0) {
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
        String a10 = C6.a(length, 1, valueTypeString, i11);
        int hashCode = a10.hashCode();
        if (hashCode != -1900324833) {
            if (hashCode != -835221992) {
                if (hashCode != 116079) {
                    if (hashCode == 3213227 && a10.equals("html")) {
                        return "HTML";
                    }
                } else if (a10.equals(InMobiNetworkValues.URL)) {
                    return "URL";
                }
            } else if (a10.equals("reference_iframe")) {
                return "REF_IFRAME";
            }
        } else if (a10.equals("reference_html")) {
            return "REF_HTML";
        }
        return "UNKNOWN";
    }
}
