package com.bytedance.sdk.component.utils;

import android.annotation.TargetApi;
import android.webkit.WebView;

/* compiled from: LoadUrlUtils.java */
/* loaded from: classes.dex */
public class zc {
    private static final Qhi Qhi = new cJ();

    /* compiled from: LoadUrlUtils.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        private Qhi() {
        }

        public void Qhi(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: LoadUrlUtils.java */
    @TargetApi(19)
    /* loaded from: classes.dex */
    public static class cJ extends Qhi {
        private cJ() {
            super();
        }

        @Override // com.bytedance.sdk.component.utils.zc.Qhi
        public void Qhi(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            boolean z10 = false;
            if (str != null && str.startsWith("javascript:")) {
                try {
                    webView.evaluateJavascript(str, null);
                    z10 = true;
                } catch (Throwable th2) {
                    boolean z11 = th2 instanceof IllegalStateException;
                }
            }
            if (!z10) {
                try {
                    webView.loadUrl(str);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static void Qhi(WebView webView, String str) {
        Qhi.Qhi(webView, str);
    }
}
