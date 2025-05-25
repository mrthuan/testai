package com.bytedance.sdk.component.Qhi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

/* compiled from: WebViewBridge.java */
/* loaded from: classes.dex */
public class pM extends Qhi {
    static final /* synthetic */ boolean WAv = true;
    protected String Sf;

    /* renamed from: hm  reason: collision with root package name */
    protected WebView f7995hm;

    public void CJ() {
        this.f7995hm.removeJavascriptInterface(this.Sf);
    }

    @Override // com.bytedance.sdk.component.Qhi.Qhi
    public Context Qhi(Gm gm2) {
        Context context = gm2.f7977fl;
        if (context != null) {
            return context;
        }
        WebView webView = gm2.Qhi;
        if (webView != null) {
            return webView.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void ac() {
        if (!WAv && this.f7995hm == null) {
            throw new AssertionError();
        }
        this.f7995hm.addJavascriptInterface(this, this.Sf);
    }

    @Override // com.bytedance.sdk.component.Qhi.Qhi
    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
    public void cJ(Gm gm2) {
        this.f7995hm = gm2.Qhi;
        this.Sf = gm2.f7976ac;
        if (gm2.iMK) {
            return;
        }
        ac();
    }

    @Override // com.bytedance.sdk.component.Qhi.Qhi
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    @Override // com.bytedance.sdk.component.Qhi.Qhi
    public String Qhi() {
        return this.f7995hm.getUrl();
    }

    @Override // com.bytedance.sdk.component.Qhi.Qhi
    public void cJ() {
        super.cJ();
        CJ();
    }

    @Override // com.bytedance.sdk.component.Qhi.Qhi
    public void Qhi(String str, HzH hzH) {
        if (hzH != null && !TextUtils.isEmpty(hzH.Sf)) {
            String str2 = hzH.Sf;
            Qhi(str, String.format("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", Base64.encodeToString(String.format("iframe[src=\"%s\"", str2).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)));
            return;
        }
        super.Qhi(str, hzH);
    }

    @Override // com.bytedance.sdk.component.Qhi.Qhi
    public void Qhi(String str) {
        Qhi(str, "javascript:" + this.Sf + "._handleMessageFromToutiao(" + str + ")");
    }

    private void Qhi(String str, final String str2) {
        if (this.Tgh || TextUtils.isEmpty(str2)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.Qhi.pM.1
            @Override // java.lang.Runnable
            public void run() {
                if (pM.this.Tgh) {
                    return;
                }
                try {
                    pM.this.f7995hm.evaluateJavascript(str2, null);
                } catch (Throwable unused) {
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.CJ.post(runnable);
        } else {
            runnable.run();
        }
    }
}
