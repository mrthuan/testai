package com.inmobi.media;

import android.webkit.WebResourceResponse;
import java.net.URLDecoder;

/* loaded from: classes2.dex */
public abstract class Bc {
    public static WebResourceResponse a(String urlRaw, A4 a42) {
        String str;
        kotlin.jvm.internal.g.e(urlRaw, "urlRaw");
        if (a42 != null) {
            ((B4) a42).c("IMResourceCacheManager", "shouldInterceptRequest ".concat(urlRaw));
        }
        try {
            str = URLDecoder.decode(kotlin.text.k.n0(urlRaw).toString(), "UTF-8");
        } catch (Exception unused) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        if (!kotlin.text.k.O(str, "inmobicache=true", false)) {
            if (a42 != null) {
                ((B4) a42).a("IMResourceCacheManager", "Cache is not enabled for URL: ".concat(str));
            }
            return null;
        }
        return Dc.f14205a.a(str, a42);
    }
}
