package com.inmobi.media;

import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class S1 extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f14623a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public boolean f14624b;
    public final /* synthetic */ N1 c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Handler f14625d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ T1 f14626e;

    public S1(N1 n12, T1 t12, Handler handler) {
        this.c = n12;
        this.f14625d = handler;
        this.f14626e = t12;
    }

    public static final void a(S1 this$0, N1 click, Handler handler, T1 this$1, WebView webView) {
        AdConfig.ImaiConfig imaiConfig;
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(click, "$click");
        kotlin.jvm.internal.g.e(handler, "$handler");
        kotlin.jvm.internal.g.e(this$1, "this$1");
        try {
            imaiConfig = Y1.f14865g;
            Thread.sleep((imaiConfig != null ? imaiConfig.getPingInterval() : 0) * 1000);
        } catch (InterruptedException unused) {
        }
        if (this$0.f14623a.get()) {
            return;
        }
        kotlin.jvm.internal.g.d(Y1.f(), "access$getTAG$p(...)");
        click.f14513i.set(true);
        handler.post(new androidx.activity.i(webView, 9));
        this$1.f14705a.a(click, EnumC1849w3.f15554e);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.f14623a.set(true);
        if (!this.f14624b && !this.c.f14513i.get()) {
            this.f14626e.f14705a.a(this.c);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f14624b = false;
        ((ScheduledThreadPoolExecutor) G3.f14268b.getValue()).submit(new qb.w(0, this, this.c, this.f14625d, this.f14626e, webView));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i10, String description, String failingUrl) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(description, "description");
        kotlin.jvm.internal.g.e(failingUrl, "failingUrl");
        this.f14624b = true;
        this.f14626e.f14705a.a(this.c, EnumC1849w3.f15554e);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(request, "request");
        kotlin.jvm.internal.g.e(errorResponse, "errorResponse");
        this.f14624b = true;
        this.f14626e.f14705a.a(this.c, EnumC1849w3.f15554e);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(detail, "detail");
        return Hc.a(view, detail, "click_mgr");
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(request, "request");
        return (this.c.f14508d || kotlin.jvm.internal.g.a(request.getUrl().toString(), this.c.f14507b)) ? false : true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(request, "request");
        kotlin.jvm.internal.g.e(error, "error");
        this.f14624b = true;
        this.f14626e.f14705a.a(this.c, EnumC1849w3.f15554e);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String url) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(url, "url");
        N1 n12 = this.c;
        return (n12.f14508d || kotlin.jvm.internal.g.a(url, n12.f14507b)) ? false : true;
    }

    public static final void a(WebView webView) {
        try {
            Ec ec2 = webView instanceof Ec ? (Ec) webView : null;
            if (ec2 == null || ec2.f14239a) {
                return;
            }
            ((Ec) webView).stopLoading();
        } catch (Throwable th2) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(new J1(th2));
        }
    }
}
