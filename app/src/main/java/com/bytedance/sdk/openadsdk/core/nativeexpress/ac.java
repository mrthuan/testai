package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BrandBannerWebViewPool.java */
/* loaded from: classes.dex */
public class ac {

    /* renamed from: ac  reason: collision with root package name */
    private static volatile ac f9139ac;
    private static int cJ;
    private final List<DspHtmlWebView> Qhi = new ArrayList();

    public static ac Qhi() {
        if (f9139ac == null) {
            synchronized (ac.class) {
                if (f9139ac == null) {
                    f9139ac = new ac();
                }
            }
        }
        return f9139ac;
    }

    public int ac() {
        return this.Qhi.size();
    }

    public DspHtmlWebView cJ() {
        DspHtmlWebView remove;
        if (ac() > 0 && (remove = this.Qhi.remove(0)) != null) {
            return remove;
        }
        return null;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void ac(DspHtmlWebView dspHtmlWebView) {
        if (dspHtmlWebView == null || dspHtmlWebView.getWebView() == null) {
            return;
        }
        if (dspHtmlWebView.getParent() != null) {
            ((ViewGroup) dspHtmlWebView.getParent()).removeView(dspHtmlWebView);
        }
        try {
            dspHtmlWebView.removeAllViews();
            dspHtmlWebView.ac();
            dspHtmlWebView.setWebChromeClient(null);
            dspHtmlWebView.setWebViewClient(null);
            dspHtmlWebView.setDownloadListener(null);
            dspHtmlWebView.setDefaultTextEncodingName("UTF-8");
            dspHtmlWebView.setAllowFileAccess(false);
            dspHtmlWebView.setJavaScriptEnabled(true);
            dspHtmlWebView.setAppCacheEnabled(true);
            dspHtmlWebView.setDatabaseEnabled(true);
            dspHtmlWebView.setSupportZoom(false);
            dspHtmlWebView.getWebView().setLayerType(0, null);
            dspHtmlWebView.setBackgroundColor(0);
            dspHtmlWebView.getWebView().setHorizontalScrollBarEnabled(false);
            dspHtmlWebView.getWebView().setHorizontalScrollbarOverlay(false);
            dspHtmlWebView.getWebView().setVerticalScrollBarEnabled(false);
            dspHtmlWebView.getWebView().setVerticalScrollbarOverlay(false);
            dspHtmlWebView.Qhi(true);
            dspHtmlWebView.WAv();
            dspHtmlWebView.setMixedContentMode(0);
        } catch (Exception unused) {
        }
    }

    public void cJ(DspHtmlWebView dspHtmlWebView) {
        if (dspHtmlWebView != null) {
            if (this.Qhi.size() >= cJ) {
                dspHtmlWebView.zc();
            } else if (this.Qhi.contains(dspHtmlWebView)) {
            } else {
                ac(dspHtmlWebView);
                this.Qhi.add(dspHtmlWebView);
            }
        }
    }

    public void Qhi(DspHtmlWebView dspHtmlWebView) {
        if (dspHtmlWebView != null) {
            cJ(dspHtmlWebView);
        }
    }
}
