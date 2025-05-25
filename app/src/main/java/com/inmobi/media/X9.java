package com.inmobi.media;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.Map;

/* loaded from: classes2.dex */
public final class X9 extends WebViewRenderProcessClient {

    /* renamed from: a  reason: collision with root package name */
    public final A4 f14856a;

    /* renamed from: b  reason: collision with root package name */
    public final Z9 f14857b;

    public X9(A4 a42, Z9 z92) {
        this.f14856a = a42;
        this.f14857b = z92;
    }

    public final void onRenderProcessResponsive(WebView view, WebViewRenderProcess webViewRenderProcess) {
        kotlin.jvm.internal.g.e(view, "view");
        A4 a42 = this.f14856a;
        if (a42 != null) {
            ((B4) a42).a("RenderViewRenderProcessClient", "onRenderProcessResponsive " + view + ' ' + webViewRenderProcess);
        }
        Z9 z92 = this.f14857b;
        if (z92 != null) {
            Map a10 = z92.a();
            a10.put("creativeId", z92.f14921a.f14753f);
            int i10 = z92.f14923d + 1;
            z92.f14923d = i10;
            a10.put("count", Integer.valueOf(i10));
            C1616eb c1616eb = C1616eb.f15034a;
            C1616eb.b("RenderProcessResponsive", a10, EnumC1686jb.f15238a);
        }
    }

    public final void onRenderProcessUnresponsive(WebView view, WebViewRenderProcess webViewRenderProcess) {
        kotlin.jvm.internal.g.e(view, "view");
        A4 a42 = this.f14856a;
        if (a42 != null) {
            ((B4) a42).a("RenderViewRenderProcessClient", "onRenderProcessUnresponsive " + view + ' ' + webViewRenderProcess);
        }
        Z9 z92 = this.f14857b;
        if (z92 != null) {
            Map a10 = z92.a();
            a10.put("creativeId", z92.f14921a.f14753f);
            int i10 = z92.c + 1;
            z92.c = i10;
            a10.put("count", Integer.valueOf(i10));
            C1616eb c1616eb = C1616eb.f15034a;
            C1616eb.b("RenderProcessUnResponsive", a10, EnumC1686jb.f15238a);
        }
    }
}
