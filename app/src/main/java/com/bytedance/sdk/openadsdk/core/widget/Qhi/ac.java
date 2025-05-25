package com.bytedance.sdk.openadsdk.core.widget.Qhi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.ABk;
import java.lang.ref.WeakReference;

/* compiled from: SSWebSettings.java */
/* loaded from: classes.dex */
public class ac {
    private final WeakReference<Context> Qhi;
    private boolean cJ = true;

    /* renamed from: ac  reason: collision with root package name */
    private final boolean f9273ac = true;
    private final boolean CJ = true;

    /* renamed from: fl  reason: collision with root package name */
    private final boolean f9274fl = false;
    private final boolean Tgh = true;
    private boolean ROR = true;

    private ac(Context context) {
        this.Qhi = new WeakReference<>(context);
    }

    public static ac Qhi(Context context) {
        return new ac(context);
    }

    public ac cJ(boolean z10) {
        this.cJ = z10;
        return this;
    }

    public static void cJ(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th2) {
            ABk.cJ(th2.toString());
        }
    }

    public ac Qhi(boolean z10) {
        this.ROR = z10;
        return this;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void Qhi(WebView webView) {
        if (webView == null || this.Qhi.get() == null) {
            return;
        }
        cJ(webView);
        WebSettings settings = webView.getSettings();
        Qhi(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Exception e10) {
            ABk.Qhi("SSWebSettings", e10.getMessage());
        }
        try {
            if (this.cJ) {
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
            } else {
                settings.setSupportZoom(false);
            }
        } catch (Throwable th2) {
            ABk.Qhi("SSWebSettings", th2.getMessage());
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setSavePassword(false);
        try {
            if (this.ROR) {
                webView.setLayerType(2, null);
            } else {
                webView.setLayerType(0, null);
            }
        } catch (Throwable th3) {
            ABk.Qhi("SSWebSettings", th3.getMessage());
        }
    }

    private void Qhi(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th2) {
            ABk.cJ(th2.toString());
        }
    }
}
