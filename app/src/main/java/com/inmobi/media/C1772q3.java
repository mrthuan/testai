package com.inmobi.media;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Timer;
import kotlin.Pair;

/* renamed from: com.inmobi.media.q3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1772q3 extends C1 {

    /* renamed from: f  reason: collision with root package name */
    public final String f15387f;

    /* renamed from: g  reason: collision with root package name */
    public final J5 f15388g;

    /* renamed from: h  reason: collision with root package name */
    public D5 f15389h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1772q3(String api, A4 a42) {
        super(a42);
        kotlin.jvm.internal.g.e(api, "api");
        this.f15387f = api;
        this.f15388g = new J5(this);
    }

    public final boolean a(WebView webView, String url) {
        Integer num;
        int i10;
        InterfaceC1759p3 interfaceC1759p3;
        Tb userLeftApplicationListener;
        if (this.f15389h == null) {
            B1 b12 = webView instanceof B1 ? (B1) webView : null;
            this.f15389h = b12 != null ? b12.getLandingPageHandler() : null;
        }
        if (this.f14157e.get()) {
            return true;
        }
        A4 a42 = this.f14154a;
        if (a42 != null) {
            ((B4) a42).a("EmbeddedBrowserViewClient", a0.a.h("onShouldOverrideUrlLoading: ", url));
        }
        if (webView instanceof B1) {
            C5 a10 = ((B1) webView).getLandingPageHandler().a(this.f15387f, (String) null, url, false);
            num = a10.f14161b;
            i10 = a10.f14160a;
        } else {
            num = null;
            i10 = 0;
        }
        if (i10 == 1) {
            if (webView instanceof C1797s3) {
                ViewParent parent = ((C1797s3) webView).getParent();
                if ((parent instanceof C1720m3) && (userLeftApplicationListener = ((C1720m3) parent).getUserLeftApplicationListener()) != null) {
                    userLeftApplicationListener.a();
                }
            }
            a((View) webView);
            if (!AbstractC1551a2.a(url)) {
                if (webView.canGoBack()) {
                    webView.goBack();
                } else if (webView instanceof C1797s3) {
                    ViewParent parent2 = ((C1797s3) webView).getParent();
                    if ((parent2 instanceof C1720m3) && (interfaceC1759p3 = ((C1720m3) parent2).c) != null) {
                        C1707l4.a(((C1693k4) interfaceC1759p3).f15258a);
                    }
                }
            }
            J5 j52 = this.f15388g;
            if (j52 != null) {
                kotlin.jvm.internal.g.e(url, "url");
                if (j52.f14370e) {
                    return true;
                }
                j52.f14368b = url;
                j52.c = 2;
                j52.f14367a.a();
                j52.d();
                return true;
            }
            return true;
        } else if (i10 == 2 || i10 == 3) {
            J5 j53 = this.f15388g;
            if (j53 != null) {
                int intValue = num != null ? num.intValue() : 10;
                kotlin.jvm.internal.g.e(url, "url");
                if (j53.f14370e) {
                    return true;
                }
                j53.f14368b = url;
                j53.c = 3;
                j53.f14369d = intValue;
                j53.c();
                if (j53.f14373h) {
                    return true;
                }
                if (j53.c == 2) {
                    j53.f14367a.a();
                } else {
                    C1772q3 c1772q3 = j53.f14367a;
                    int i11 = j53.f14369d;
                    D5 d52 = c1772q3.f15389h;
                    if (d52 != null) {
                        J5 j54 = c1772q3.f15388g;
                        d52.a("landingsCompleteFailed", kotlin.collections.q.B0(new Pair("trigger", d52.a(j54 != null ? j54.f14368b : null)), new Pair("errorCode", Integer.valueOf(i11))));
                    }
                }
                j53.d();
                return true;
            }
            return true;
        } else {
            return false;
        }
    }

    @Override // com.inmobi.media.C1, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        J5 j52;
        String str2;
        super.onPageFinished(webView, str);
        if (str != null && (j52 = this.f15388g) != null && !j52.f14370e && kotlin.jvm.internal.g.a(str, j52.f14368b) && j52.c == 1) {
            j52.c = 2;
            if (!j52.f14371f) {
                j52.f14371f = true;
                try {
                    ((Timer) j52.f14374i.getValue()).schedule(new I5(j52), j52.f14376k);
                } catch (Exception e10) {
                    Q4 q42 = Q4.f14590a;
                    Q4.c.a(AbstractC1863x4.a(e10, "event"));
                }
                j52.f14373h = true;
            }
            if (!j52.f14373h) {
                if (j52.c == 2) {
                    j52.f14367a.a();
                } else {
                    C1772q3 c1772q3 = j52.f14367a;
                    int i10 = j52.f14369d;
                    D5 d52 = c1772q3.f15389h;
                    if (d52 != null) {
                        J5 j53 = c1772q3.f15388g;
                        if (j53 != null) {
                            str2 = j53.f14368b;
                        } else {
                            str2 = null;
                        }
                        d52.a("landingsCompleteFailed", kotlin.collections.q.B0(new Pair("trigger", d52.a(str2)), new Pair("errorCode", Integer.valueOf(i10))));
                    }
                }
                j52.d();
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        J5 j52;
        B1 b12;
        super.onPageStarted(webView, str, bitmap);
        if (this.f15389h == null) {
            D5 d52 = null;
            if (webView instanceof B1) {
                b12 = (B1) webView;
            } else {
                b12 = null;
            }
            if (b12 != null) {
                d52 = b12.getLandingPageHandler();
            }
            this.f15389h = d52;
        }
        if (str != null && (j52 = this.f15388g) != null && !j52.f14370e) {
            j52.f14368b = str;
            j52.c = 1;
        }
    }

    @Override // com.inmobi.media.C1, android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i10, String description, String failingUrl) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(description, "description");
        kotlin.jvm.internal.g.e(failingUrl, "failingUrl");
        super.onReceivedError(view, i10, description, failingUrl);
        J5 j52 = this.f15388g;
        if (j52 == null || j52.f14370e || !kotlin.jvm.internal.g.a(failingUrl, j52.f14368b)) {
            return;
        }
        j52.c = 3;
        j52.f14369d = i10;
        j52.c();
        if (j52.f14373h) {
            return;
        }
        if (j52.c == 2) {
            j52.f14367a.a();
        } else {
            C1772q3 c1772q3 = j52.f14367a;
            int i11 = j52.f14369d;
            D5 d52 = c1772q3.f15389h;
            if (d52 != null) {
                J5 j53 = c1772q3.f15388g;
                d52.a("landingsCompleteFailed", kotlin.collections.q.B0(new Pair("trigger", d52.a(j53 != null ? j53.f14368b : null)), new Pair("errorCode", Integer.valueOf(i11))));
            }
        }
        j52.d();
    }

    @Override // com.inmobi.media.C1, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        boolean didCrash;
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(detail, "detail");
        boolean onRenderProcessGone = super.onRenderProcessGone(view, detail);
        if (Build.VERSION.SDK_INT >= 26) {
            Pair pair = new Pair("source", "embedded_browser");
            didCrash = detail.didCrash();
            LinkedHashMap B0 = kotlin.collections.q.B0(pair, new Pair("isCrashed", Boolean.valueOf(didCrash)));
            C1616eb c1616eb = C1616eb.f15034a;
            C1616eb.b("WebViewRenderProcessGoneEvent", B0, EnumC1686jb.f15238a);
        }
        return onRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        A4 a42 = this.f14154a;
        if (a42 != null) {
            ((B4) a42).a("EmbeddedBrowserViewClient", "shouldOverrideUrlLoading Called");
        }
        if (C1566b3.y()) {
            String valueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            if (webView != null) {
                return a(webView, valueOf);
            }
            return false;
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        A4 a42 = this.f14154a;
        if (a42 != null) {
            ((B4) a42).a("EmbeddedBrowserViewClient", "shouldOverrideUrlLoading Called");
        }
        if (webView == null || str == null) {
            return false;
        }
        return a(webView, str);
    }

    @Override // com.inmobi.media.C1, android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(request, "request");
        kotlin.jvm.internal.g.e(error, "error");
        super.onReceivedError(view, request, error);
        J5 j52 = this.f15388g;
        if (j52 != null) {
            String uri = request.getUrl().toString();
            kotlin.jvm.internal.g.d(uri, "toString(...)");
            int errorCode = error.getErrorCode();
            if (!j52.f14370e && kotlin.jvm.internal.g.a(uri, j52.f14368b)) {
                j52.c = 3;
                j52.f14369d = errorCode;
                j52.c();
                if (!j52.f14373h) {
                    if (j52.c == 2) {
                        j52.f14367a.a();
                    } else {
                        C1772q3 c1772q3 = j52.f14367a;
                        int i10 = j52.f14369d;
                        D5 d52 = c1772q3.f15389h;
                        if (d52 != null) {
                            J5 j53 = c1772q3.f15388g;
                            d52.a("landingsCompleteFailed", kotlin.collections.q.B0(new Pair("trigger", d52.a(j53 != null ? j53.f14368b : null)), new Pair("errorCode", Integer.valueOf(i10))));
                        }
                    }
                    j52.d();
                }
            }
        }
        Objects.toString(request.getUrl());
    }

    public final void a() {
        D5 d52 = this.f15389h;
        if (d52 != null) {
            J5 j52 = this.f15388g;
            d52.a("landingsCompleteSuccess", kotlin.collections.q.B0(new Pair("trigger", d52.a(j52 != null ? j52.f14368b : null))));
        }
    }

    public final void a(String str) {
        J5 j52 = this.f15388g;
        if (j52 == null || j52.f14370e) {
            return;
        }
        D5 d52 = this.f15389h;
        if (d52 != null) {
            d52.a(str, kotlin.collections.q.B0(new Pair("trigger", d52.a(j52.f14368b))));
        }
        J5 j53 = this.f15388g;
        if (j53 != null) {
            j53.d();
        }
    }
}
