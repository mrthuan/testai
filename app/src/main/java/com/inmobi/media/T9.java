package com.inmobi.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class T9 extends C1 {

    /* renamed from: f  reason: collision with root package name */
    public final Z9 f14716f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14717g;

    /* renamed from: h  reason: collision with root package name */
    public final String f14718h;

    public T9(A4 a42, Z9 z92) {
        super(a42);
        this.f14716f = z92;
        this.f14718h = "redirect";
    }

    public final boolean a(WebView webView, String str) {
        A4 a42 = this.f14154a;
        if (a42 != null) {
            ((B4) a42).a("RenderViewClient", a0.a.h("onShouldOverrideUrlLoading  - url - ", str));
        }
        boolean z10 = false;
        if (webView instanceof S9) {
            S9 s92 = (S9) webView;
            s92.getLandingPageHandler().a("clickStartCalled", new HashMap());
            if (s92.f14689v) {
                webView.loadUrl(str);
                s92.getLandingPageHandler().a("landingsStartFailed", kotlin.collections.q.B0(new Pair("errorCode", 10)));
                return true;
            } else if (!s92.k()) {
                s92.a(this.f14718h);
                s92.getLandingPageHandler().a("landingsStartFailed", kotlin.collections.q.B0(new Pair("errorCode", 8)));
                return true;
            } else {
                A4 a43 = this.f14154a;
                if (a43 != null) {
                    ((B4) a43).a("RenderViewClient", "Placement type:  " + ((int) s92.getPlacementType()) + "  url:" + str);
                }
                A4 a44 = this.f14154a;
                if (a44 != null) {
                    ((B4) a44).a("RenderViewClient", a0.a.h("Override URL loading :", str));
                }
                s92.i();
                C5 a10 = s92.getLandingPageHandler().a(this.f14718h, (String) null, str, true);
                A4 a45 = this.f14154a;
                if (a45 != null) {
                    ((B4) a45).a("RenderViewClient", "Current Index :" + s92.copyBackForwardList().getCurrentIndex() + " Original Url :" + s92.getOriginalUrl() + " URL: " + str);
                }
                A4 a46 = this.f14154a;
                if (a46 != null) {
                    ((B4) a46).c("RenderViewClient", "landingPage process result - " + a10.f14160a);
                }
                z10 = true;
            }
        }
        A4 a47 = this.f14154a;
        if (a47 != null) {
            ((B4) a47).a("RenderViewClient", "Override URL loading :" + str + " returned " + z10);
        }
        return z10;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        A4 a42 = this.f14154a;
        if (a42 != null) {
            ((B4) a42).a("RenderViewClient", a0.a.h("Resource loading:", str));
        }
        if (webView instanceof S9) {
            S9 s92 = (S9) webView;
            String url = s92.getUrl();
            if (str != null && url != null && !kotlin.text.j.M(url, "file:", false)) {
                a(s92);
            }
        }
    }

    @Override // com.inmobi.media.C1, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        String str2;
        Z9 z92 = this.f14716f;
        if (z92 != null) {
            Map a10 = z92.a();
            long j10 = z92.f14922b;
            ScheduledExecutorService scheduledExecutorService = Vb.f14759a;
            a10.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
            C1616eb c1616eb = C1616eb.f15034a;
            C1616eb.b("WebViewLoadFinished", a10, EnumC1686jb.f15238a);
        }
        A4 a42 = this.f14154a;
        if (a42 != null) {
            ((B4) a42).a("RenderViewClient", a0.a.h("Page load finished:", str));
        }
        if (webView instanceof S9) {
            S9 s92 = (S9) webView;
            a(s92);
            if (kotlin.jvm.internal.g.a("Loading", s92.getViewState())) {
                s92.getListener().f(s92);
                s92.b("window.imaiview.broadcastEvent('ready');");
                s92.b("window.mraidview.broadcastEvent('ready');");
                if (s92.getImpressionType() == 2) {
                    s92.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    s92.layout(0, 0, s92.getMeasuredWidth(), s92.getMeasuredHeight());
                    s92.setDrawingCacheEnabled(true);
                    s92.buildDrawingCache();
                }
                if (s92.getOriginalRenderView() == null) {
                    str2 = "Default";
                } else {
                    str2 = "Expanded";
                }
                s92.setAndUpdateViewState(str2);
            }
        }
        A4 a43 = this.f14154a;
        if (a43 != null) {
            ((B4) a43).a("RenderViewClient", "==== CHECKPOINT REACHED - PAGE FINISHED ====");
        }
        A4 a44 = this.f14154a;
        if (a44 != null) {
            ((B4) a44).b();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Z9 z92 = this.f14716f;
        if (z92 != null) {
            Map a10 = z92.a();
            long j10 = z92.f14922b;
            ScheduledExecutorService scheduledExecutorService = Vb.f14759a;
            a10.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
            C1616eb c1616eb = C1616eb.f15034a;
            C1616eb.b("PageStarted", a10, EnumC1686jb.f15238a);
        }
        A4 a42 = this.f14154a;
        if (a42 != null) {
            ((B4) a42).a("RenderViewClient", a0.a.h("Page load started:", str));
        }
        if (webView instanceof S9) {
            A4 a43 = this.f14154a;
            if (a43 != null) {
                ((B4) a43).a("RenderViewClient", "Page load started renderview: " + ((S9) webView).getMarkupType());
            }
            S9 s92 = (S9) webView;
            a(s92);
            s92.setAndUpdateViewState("Loading");
        }
        A4 a44 = this.f14154a;
        if (a44 != null) {
            ((B4) a44).a("RenderViewClient", "==== CHECKPOINT REACHED - PAGE STARTED ====");
        }
        A4 a45 = this.f14154a;
        if (a45 != null) {
            ((B4) a45).b();
        }
    }

    @Override // com.inmobi.media.C1, android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i10, String description, String failingUrl) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(description, "description");
        kotlin.jvm.internal.g.e(failingUrl, "failingUrl");
        A4 a42 = this.f14154a;
        if (a42 != null) {
            ((B4) a42).b("RenderViewClient", "OnReceivedError - errorCode - " + i10 + ", description - " + description + ", url - " + failingUrl);
        }
        super.onReceivedError(view, i10, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String str;
        Integer num;
        Uri uri;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        A4 a42 = this.f14154a;
        if (a42 != null) {
            StringBuilder sb2 = new StringBuilder("ReceivedHttpError - error - ");
            Boolean bool = null;
            if (webResourceResponse != null) {
                str = webResourceResponse.getReasonPhrase();
            } else {
                str = null;
            }
            sb2.append(str);
            sb2.append(", statusCode - ");
            if (webResourceResponse != null) {
                num = Integer.valueOf(webResourceResponse.getStatusCode());
            } else {
                num = null;
            }
            sb2.append(num);
            sb2.append(" url - ");
            if (webResourceRequest != null) {
                uri = webResourceRequest.getUrl();
            } else {
                uri = null;
            }
            sb2.append(uri);
            sb2.append(" isMainFrame - ");
            if (webResourceRequest != null) {
                bool = Boolean.valueOf(webResourceRequest.isForMainFrame());
            }
            sb2.append(bool);
            ((B4) a42).b("RenderViewClient", sb2.toString());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Integer num;
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        A4 a42 = this.f14154a;
        if (a42 != null) {
            StringBuilder sb2 = new StringBuilder("onReceivedSSLError - error - ");
            String str = null;
            if (sslError != null) {
                num = Integer.valueOf(sslError.getPrimaryError());
            } else {
                num = null;
            }
            sb2.append(num);
            sb2.append(" - url - ");
            if (sslError != null) {
                str = sslError.getUrl();
            }
            sb2.append(str);
            ((B4) a42).b("RenderViewClient", sb2.toString());
        }
    }

    @Override // com.inmobi.media.C1, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        boolean didCrash;
        boolean didCrash2;
        int rendererPriorityAtExit;
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(detail, "detail");
        if (Build.VERSION.SDK_INT >= 26) {
            A4 a42 = this.f14154a;
            if (a42 != null) {
                StringBuilder sb2 = new StringBuilder("onRenderProcessGone detail did crash- ");
                didCrash2 = detail.didCrash();
                sb2.append(didCrash2);
                sb2.append(" priority - ");
                rendererPriorityAtExit = detail.rendererPriorityAtExit();
                sb2.append(rendererPriorityAtExit);
                ((B4) a42).c("RenderViewClient", sb2.toString());
            }
            Z9 z92 = this.f14716f;
            if (z92 != null) {
                didCrash = detail.didCrash();
                LinkedHashMap B0 = kotlin.collections.q.B0(new Pair("source", "render_view_" + z92.f14921a.f14749a.b()), new Pair("isCrashed", Boolean.valueOf(didCrash)), new Pair("creativeId", z92.f14921a.f14753f));
                C1616eb c1616eb = C1616eb.f15034a;
                C1616eb.b("WebViewRenderProcessGoneEvent", B0, EnumC1686jb.f15238a);
            }
        } else {
            A4 a43 = this.f14154a;
            if (a43 != null) {
                ((B4) a43).c("RenderViewClient", "onRenderProcessGone");
            }
        }
        return super.onRenderProcessGone(view, detail);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(request, "request");
        A4 a42 = this.f14154a;
        if (a42 != null) {
            ((B4) a42).a("RenderViewClient", "shouldOverrideUrlLoading Called");
        }
        if (C1566b3.y()) {
            String uri = request.getUrl().toString();
            kotlin.jvm.internal.g.d(uri, "toString(...)");
            return a(view, uri);
        }
        return false;
    }

    @Override // com.inmobi.media.C1, android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(request, "request");
        kotlin.jvm.internal.g.e(error, "error");
        super.onReceivedError(view, request, error);
        if (Build.VERSION.SDK_INT >= 24) {
            A4 a42 = this.f14154a;
            if (a42 != null) {
                ((B4) a42).b("RenderViewClient", "OnReceivedError - errorCode - " + error.getErrorCode() + ", description - " + ((Object) error.getDescription()) + ", url - " + request.getUrl() + ", method - " + request.getMethod() + ", isMainFrame - " + request.isForMainFrame());
                return;
            }
            return;
        }
        A4 a43 = this.f14154a;
        if (a43 != null) {
            ((B4) a43).b("RenderViewClient", "OnReceivedError ");
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String url) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(url, "url");
        A4 a42 = this.f14154a;
        if (a42 != null) {
            ((B4) a42).a("RenderViewClient", "shouldOverrideUrlLoading Called ".concat(url));
        }
        return a(view, url);
    }

    public final void a(S9 s92) {
        if (this.f14717g || s92.f14655e) {
            return;
        }
        this.f14717g = true;
        A4 a42 = this.f14154a;
        if (a42 != null) {
            ((B4) a42).a("RenderViewClient", "Injecting MRAID javascript for two piece creatives.");
        }
        s92.b(s92.getMraidJsString());
    }
}
