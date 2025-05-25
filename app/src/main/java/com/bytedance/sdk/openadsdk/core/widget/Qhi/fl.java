package com.bytedance.sdk.openadsdk.core.widget.Qhi;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.cJ.zc;
import com.bytedance.sdk.openadsdk.core.NFd;
import com.bytedance.sdk.openadsdk.core.iMK;
import com.bytedance.sdk.openadsdk.utils.HzH;

/* compiled from: TTWebChromeClient.java */
/* loaded from: classes.dex */
public class fl extends WebChromeClient {
    private static final String Qhi = WebChromeClient.class.getSimpleName();
    private com.bytedance.sdk.openadsdk.common.cJ CJ;

    /* renamed from: ac  reason: collision with root package name */
    private zc f9276ac;
    private final NFd cJ;

    public fl(NFd nFd, zc zcVar, com.bytedance.sdk.openadsdk.common.cJ cJVar) {
        this(nFd, zcVar);
        this.CJ = cJVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i10, String str2) {
        if (!TextUtils.isEmpty(str)) {
            Qhi(str);
        }
        super.onConsoleMessage(str, i10, str2);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        zc zcVar = this.f9276ac;
        if (zcVar != null) {
            zcVar.Qhi(webView, i10);
        }
        com.bytedance.sdk.openadsdk.common.cJ cJVar = this.CJ;
        if (cJVar != null) {
            cJVar.Qhi(webView, i10);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }

    private boolean Qhi(final String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (str.regionMatches(true, 0, "bytedance:", 0, 10)) {
                iMK.ac().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.widget.Qhi.fl.1
                    @Override // java.lang.Runnable
                    public void run() {
                        HzH.Qhi(Uri.parse(str), fl.this.cJ);
                    }
                });
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public fl(NFd nFd, zc zcVar) {
        this.cJ = nFd;
        this.f9276ac = zcVar;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || TextUtils.isEmpty(consoleMessage.message()) || !Qhi(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }
}
