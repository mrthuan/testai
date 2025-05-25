package com.inmobi.media;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class C1 extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final A4 f14154a;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14156d;

    /* renamed from: b  reason: collision with root package name */
    public int f14155b = -1;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f14157e = new AtomicBoolean(false);

    public C1(A4 a42) {
        this.f14154a = a42;
    }

    public final void a(View view) {
        kotlin.jvm.internal.g.e(view, "view");
        this.f14157e.set(true);
        view.postDelayed(new b7.g(this, 4), 1000L);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (this.f14156d) {
            this.f14156d = false;
            if (webView != null) {
                webView.clearHistory();
            }
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, int i10, String description, String failingUrl) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(description, "description");
        kotlin.jvm.internal.g.e(failingUrl, "failingUrl");
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(detail, "detail");
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Z5.a((byte) 1, "BaseWebViewClient", "WebView crash detected, destroying ad");
        view.destroy();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(url, "url");
        WebResourceResponse a10 = Bc.a(url, this.f14154a);
        return a10 == null ? super.shouldInterceptRequest(view, url) : a10;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(request, "request");
        kotlin.jvm.internal.g.e(error, "error");
        error.getErrorCode();
        Objects.toString(error.getDescription());
        Objects.toString(request.getUrl());
    }

    public static final void a(C1 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        this$0.f14157e.set(false);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        WebResourceResponse a10;
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(request, "request");
        a(view);
        A4 a42 = this.f14154a;
        if (kotlin.text.j.G("GET", request.getMethod(), true)) {
            String uri = request.getUrl().toString();
            kotlin.jvm.internal.g.d(uri, "toString(...)");
            a10 = Bc.a(uri, a42);
        } else {
            a10 = null;
        }
        return a10 == null ? super.shouldInterceptRequest(view, request) : a10;
    }

    public final void a(WebView webView) {
        String str;
        J j10;
        String b10;
        String str2;
        String str3;
        J j11;
        String m10;
        C1859x0 c1859x0;
        int i10 = this.f14155b;
        if (-1 != i10) {
            if (i10 > 0) {
                this.f14155b = i10 - 1;
            } else if (this.c) {
            } else {
                new Handler(Looper.getMainLooper()).post(new A8(webView));
                this.c = true;
                if (webView instanceof S9) {
                    S9 s92 = (S9) webView;
                    A4 a42 = s92.f14665j;
                    if (a42 != null) {
                        String str4 = S9.O0;
                        ((B4) a42).a(str4, G9.a(s92, str4, "TAG", "sendTelemetryEventForNetworkLoad "));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String creativeId = s92.getCreativeId();
                    if (creativeId != null) {
                        linkedHashMap.put("creativeId", creativeId);
                    }
                    String impressionId = s92.getImpressionId();
                    if (impressionId != null) {
                        linkedHashMap.put("impressionId", impressionId);
                    }
                    linkedHashMap.put("errorCode", Short.valueOf(s92.f14678p0 ? (short) 2212 : (short) 2211));
                    V9 v92 = s92.f14661h;
                    if (v92 != null && (c1859x0 = v92.f14756i) != null) {
                        linkedHashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - c1859x0.f15617a.c));
                    }
                    V9 v93 = s92.f14661h;
                    if (v93 != null && (j11 = v93.f14749a) != null && (m10 = j11.m()) != null) {
                        linkedHashMap.put("plType", m10);
                    }
                    V9 v94 = s92.f14661h;
                    if (v94 != null && (str3 = v94.f14752e) != null) {
                        linkedHashMap.put("creativeType", str3);
                    }
                    V9 v95 = s92.f14661h;
                    if (v95 != null && (str2 = v95.f14750b) != null) {
                        linkedHashMap.put("markupType", str2);
                    }
                    V9 v96 = s92.f14661h;
                    if (v96 != null && (j10 = v96.f14749a) != null && (b10 = j10.b()) != null) {
                        linkedHashMap.put("adType", b10);
                    }
                    V9 v97 = s92.f14661h;
                    if (v97 != null && (str = v97.c) != null) {
                        linkedHashMap.put("metadataBlob", str);
                    }
                    V9 v98 = s92.f14661h;
                    if (v98 != null) {
                        linkedHashMap.put("isRewarded", Boolean.valueOf(v98.f14754g));
                    }
                    A4 a43 = s92.f14665j;
                    if (a43 != null) {
                        String str5 = S9.O0;
                        ((B4) a43).a(str5, G9.a(s92, str5, "TAG", "processTelemetryEvent "));
                    }
                    s92.getListener().a("NetworkLoadLimitExceeded", linkedHashMap);
                }
            }
        }
    }
}
