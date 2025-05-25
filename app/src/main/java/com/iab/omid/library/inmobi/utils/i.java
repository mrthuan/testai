package com.iab.omid.library.inmobi.utils;

import android.webkit.WebView;
import java.util.Set;
import m2.d;
import n2.j;
import n2.k;

/* loaded from: classes2.dex */
public class i {
    public void a(WebView webView, String str, Set<String> set, d.a aVar) {
        m2.d.a(webView, str, set, aVar);
    }

    public void a(WebView webView, String str) {
        int i10 = m2.d.f21795a;
        if (j.c.d()) {
            k.a.f22330a.createWebView(webView).removeWebMessageListener(str);
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
