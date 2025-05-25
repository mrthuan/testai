package com.bytedance.sdk.openadsdk.core.widget.Qhi;

import android.content.MutableContextWrapper;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.NFd;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PreLoadWebView.java */
/* loaded from: classes.dex */
public class cJ implements Qhi {
    NFd Qhi;
    private SSWebView cJ;

    /* renamed from: ac  reason: collision with root package name */
    private AtomicInteger f9275ac = null;
    private boolean CJ = false;

    public void Qhi(boolean z10) {
        this.CJ = z10;
        if (z10) {
            this.f9275ac = new AtomicInteger(HzH.CJ().ots());
        } else {
            this.f9275ac = new AtomicInteger(HzH.CJ().zjb());
        }
    }

    public void cJ() {
        AtomicInteger atomicInteger = this.f9275ac;
        if (atomicInteger != null && atomicInteger.get() <= 0) {
            return;
        }
        try {
            this.f9275ac.get();
        } catch (Exception unused) {
        }
        String CJ = com.bytedance.sdk.component.adexpress.Qhi.cJ.cJ.CJ(null);
        if (this.CJ) {
            String CJ2 = com.bytedance.sdk.component.adexpress.Qhi.cJ.cJ.CJ("v3");
            if (CJ != null && CJ.equals(CJ2)) {
                return;
            }
            CJ = CJ2;
        }
        if (TextUtils.isEmpty(CJ)) {
            return;
        }
        try {
            SSWebView sSWebView = new SSWebView(new MutableContextWrapper(HzH.Qhi()));
            this.cJ = sSWebView;
            if (sSWebView.getWebView() == null) {
                return;
            }
            this.cJ.setWebViewClient(new WebViewClient() { // from class: com.bytedance.sdk.openadsdk.core.widget.Qhi.cJ.1
                @Override // android.webkit.WebViewClient
                public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    return true;
                }
            });
            Qhi(this.cJ);
            Uri build = Uri.parse(CJ).buildUpon().appendQueryParameter("isPreLoad", "1").build();
            NFd nFd = new NFd(this.cJ.getContext());
            this.Qhi = nFd;
            nFd.cJ(this.cJ).Qhi(this).Qhi(this.cJ);
            com.bytedance.sdk.component.adexpress.fl.Tgh.Qhi().Qhi(this.cJ, this.Qhi);
            this.cJ.a_(build.toString());
        } catch (Exception unused2) {
        }
    }

    private void Qhi(SSWebView sSWebView) {
        if (sSWebView == null || sSWebView.getWebView() == null) {
            return;
        }
        try {
            ac.Qhi(HzH.Qhi()).Qhi(false).Qhi(sSWebView.getWebView());
            sSWebView.setVerticalScrollBarEnabled(false);
            sSWebView.setHorizontalScrollBarEnabled(false);
            sSWebView.Qhi(true);
            sSWebView.WAv();
            sSWebView.setUserAgentString(com.bytedance.sdk.openadsdk.utils.HzH.Qhi(sSWebView.getWebView(), (int) BuildConfig.VERSION_CODE));
            sSWebView.setMixedContentMode(0);
            sSWebView.setJavaScriptEnabled(true);
            sSWebView.setJavaScriptCanOpenWindowsAutomatically(true);
            sSWebView.setDomStorageEnabled(true);
            sSWebView.setDatabaseEnabled(true);
            sSWebView.setAppCacheEnabled(true);
            sSWebView.setAllowFileAccess(false);
            sSWebView.setSupportZoom(true);
            sSWebView.setBuiltInZoomControls(true);
            sSWebView.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            sSWebView.setUseWideViewPort(true);
        } catch (Exception e10) {
            ABk.Qhi("WebViewPool", e10.toString());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Qhi
    public void Qhi() {
        if (this.CJ) {
            com.bytedance.sdk.component.adexpress.fl.Tgh.Qhi().cJ(this.cJ);
        } else {
            com.bytedance.sdk.component.adexpress.fl.Tgh.Qhi().ac(this.cJ);
        }
        AtomicInteger atomicInteger = this.f9275ac;
        if (atomicInteger != null) {
            atomicInteger.get();
            this.f9275ac.decrementAndGet();
            if (this.f9275ac.get() > 0) {
                cJ();
            }
        }
    }
}
