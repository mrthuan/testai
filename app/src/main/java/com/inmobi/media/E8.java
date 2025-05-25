package com.inmobi.media;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class E8 {
    public static final boolean a(C1643ga c1643ga) {
        String str;
        kotlin.jvm.internal.g.e(c1643ga, "<this>");
        Map map = c1643ga.c;
        return (map == null || (str = (String) map.get("Content-Encoding")) == null || !kotlin.text.k.O(str, "gzip", false)) ? false : true;
    }

    public static final String a(String url, Map map) {
        kotlin.jvm.internal.g.e(url, "url");
        if (map == null) {
            return url;
        }
        K8.a(map);
        String a10 = K8.a("&", map);
        StringBuilder sb2 = new StringBuilder(url);
        int length = a10.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.g.f(a10.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        if (a10.subSequence(i10, length + 1).toString().length() > 0) {
            if (!kotlin.text.k.O(url, "?", false)) {
                sb2.append("?");
            }
            if (!kotlin.text.j.F(url, "&", false) && !kotlin.text.j.F(url, "?", false)) {
                sb2.append("&");
            }
            sb2.append(a10);
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g.d(sb3, "toString(...)");
        return sb3;
    }

    public static final String a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length != 0) {
                try {
                } catch (UnsupportedEncodingException | Exception unused) {
                    return "";
                }
            }
            return new String(bArr, kotlin.text.a.f19966b);
        }
        return "";
    }
}
