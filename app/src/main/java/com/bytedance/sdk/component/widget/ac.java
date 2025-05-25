package com.bytedance.sdk.component.widget;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.component.sdk.annotation.RequiresApi;
import com.bytedance.sdk.component.widget.Qhi;
import java.util.List;

/* compiled from: WebViewClientProxy.java */
/* loaded from: classes.dex */
public class ac extends WebViewClient {
    private final WebViewClient Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final List<String> f8442ac;
    private final Qhi.InterfaceC0099Qhi cJ;

    public ac(Qhi.InterfaceC0099Qhi interfaceC0099Qhi, WebViewClient webViewClient, List<String> list) {
        this.cJ = interfaceC0099Qhi;
        this.Qhi = webViewClient;
        this.f8442ac = list;
    }

    private int Qhi(WebView webView) {
        try {
            WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
            if (copyBackForwardList == null) {
                return -1;
            }
            return copyBackForwardList.getCurrentIndex() + 1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.Qhi.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Qhi.InterfaceC0099Qhi interfaceC0099Qhi = this.cJ;
        if (interfaceC0099Qhi != null) {
            interfaceC0099Qhi.Qhi(Qhi(webView));
        }
        this.Qhi.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.Qhi.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.Qhi.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.Qhi.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.Qhi.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.Qhi.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Qhi.InterfaceC0099Qhi interfaceC0099Qhi = this.cJ;
        if (interfaceC0099Qhi != null) {
            interfaceC0099Qhi.Qhi();
        }
        return this.Qhi.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.Qhi.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Qhi.InterfaceC0099Qhi interfaceC0099Qhi;
        if (cJ.Qhi(this.f8442ac, webResourceRequest.getUrl().toString()) && (interfaceC0099Qhi = this.cJ) != null) {
            interfaceC0099Qhi.Qhi();
        }
        return this.Qhi.shouldInterceptRequest(webView, webResourceRequest);
    }
}
