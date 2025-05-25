package com.inmobi.media;

import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class A8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f14130a;

    public A8(WebView webView) {
        kotlin.jvm.internal.g.e(webView, "webView");
        this.f14130a = new WeakReference(webView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebSettings webSettings;
        WebView webView = (WebView) this.f14130a.get();
        if (webView != null) {
            webSettings = webView.getSettings();
        } else {
            webSettings = null;
        }
        if (webSettings != null) {
            webSettings.setBlockNetworkLoads(true);
        }
    }
}
