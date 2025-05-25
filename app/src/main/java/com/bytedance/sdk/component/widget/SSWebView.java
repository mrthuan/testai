package com.bytedance.sdk.component.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.qMt;
import com.bytedance.sdk.component.widget.Qhi;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SSWebView extends FrameLayout {
    private static ac aP;
    private Qhi.InterfaceC0099Qhi ABk;
    private boolean CJ;
    private AtomicBoolean CQU;
    private AtomicBoolean Dww;
    private AttributeSet EBS;
    private fl Eh;
    private volatile WebView Gm;
    private float HzH;
    private cJ MQ;
    private long NFd;
    private com.bytedance.sdk.component.widget.cJ.Qhi Qhi;
    private long ROR;
    private long Sf;
    private float Tgh;
    private boolean WAv;

    /* renamed from: ac  reason: collision with root package name */
    private JSONObject f8438ac;
    private Context bxS;
    private String cJ;

    /* renamed from: fl  reason: collision with root package name */
    private float f8439fl;

    /* renamed from: hm  reason: collision with root package name */
    private long f8440hm;
    private float hpZ;
    private com.bytedance.sdk.component.widget.Qhi iMK;
    private float kYc;
    private List<String> pA;
    private AtomicBoolean pM;
    private qMt qMt;
    private long sDy;
    private int tP;

    /* renamed from: zc  reason: collision with root package name */
    private View f8441zc;

    /* loaded from: classes.dex */
    public static class Qhi extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(final WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (webView != null) {
                webView.post(new Runnable() { // from class: com.bytedance.sdk.component.widget.SSWebView.Qhi.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            ViewGroup viewGroup = (ViewGroup) webView.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(webView);
                            }
                            webView.destroy();
                        } catch (Exception unused) {
                        }
                    }
                });
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface ac {
        WebView createWebView(Context context, AttributeSet attributeSet, int i10);
    }

    /* loaded from: classes.dex */
    public interface cJ {
    }

    /* loaded from: classes.dex */
    public interface fl {
    }

    public SSWebView(Context context) {
        this(Qhi(context), false);
    }

    private void HzH() {
        if (this.qMt == null) {
            this.pM.set(false);
            this.qMt = new qMt(getContext());
        }
        new Object() { // from class: com.bytedance.sdk.component.widget.SSWebView.1
        };
        this.pM.set(true);
    }

    private static Context Qhi(Context context) {
        return context;
    }

    private static void ac(Context context) {
    }

    private void hpZ() {
        try {
            WebSettings settings = this.Gm.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    private void pA() {
        if (this.Gm == null) {
            return;
        }
        try {
            this.Gm.removeJavascriptInterface("searchBoxJavaBridge_");
            this.Gm.removeJavascriptInterface("accessibility");
            this.Gm.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    public static void setWebViewProvider(ac acVar) {
        aP = acVar;
    }

    public void ABk() {
        try {
            this.Gm.clearView();
        } catch (Throwable unused) {
        }
    }

    public void CJ() {
        try {
            this.Gm.reload();
        } catch (Throwable unused) {
        }
    }

    public void Gm() {
        if (this.Gm == null) {
            return;
        }
        try {
            this.Gm.onPause();
        } catch (Throwable unused) {
        }
    }

    public boolean ROR() {
        if (this.Gm == null) {
            return false;
        }
        try {
            return this.Gm.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void Sf() {
        try {
            this.Gm.goForward();
        } catch (Throwable unused) {
        }
    }

    public void Tgh() {
        try {
            this.Gm.goBack();
        } catch (Throwable unused) {
        }
    }

    public void WAv() {
        try {
            this.Gm.clearHistory();
        } catch (Throwable unused) {
        }
    }

    public void a_(String str) {
        try {
            setJavaScriptEnabled(str);
            this.Gm.loadUrl(str);
        } catch (Throwable unused) {
        }
    }

    public void b_(String str) {
        try {
            this.Gm.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    public void cJ() {
        if (this.Gm != null) {
            removeAllViews();
            setBackground(null);
            try {
                this.Gm.setId(520093704);
            } catch (Throwable unused) {
            }
            addView(this.Gm, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.Gm == null) {
            return;
        }
        try {
            this.Gm.computeScroll();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean fl() {
        if (this.Gm == null) {
            return false;
        }
        try {
            return this.Gm.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void g_() {
        try {
            this.Gm = Qhi(this.EBS, 0);
            cJ();
            cJ(Qhi(this.bxS));
        } catch (Throwable th2) {
            ABk.Qhi("SSWebView.TAG", "initWebview: " + th2.getMessage());
        }
    }

    public View getArbitrageLoadingView() {
        return this.f8441zc;
    }

    public int getContentHeight() {
        if (this.Gm == null) {
            return 0;
        }
        try {
            return this.Gm.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public long getLandingPageClickBegin() {
        return this.NFd;
    }

    public long getLandingPageClickEnd() {
        return this.sDy;
    }

    public com.bytedance.sdk.component.widget.cJ.Qhi getMaterialMeta() {
        return this.Qhi;
    }

    public String getOriginalUrl() {
        String url;
        if (this.Gm == null) {
            return null;
        }
        try {
            String originalUrl = this.Gm.getOriginalUrl();
            if (originalUrl != null && originalUrl.startsWith("data:text/html") && (url = this.Gm.getUrl()) != null) {
                if (url.startsWith("file://")) {
                    return url;
                }
                return originalUrl;
            }
            return originalUrl;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getProgress() {
        if (this.Gm == null) {
            return 0;
        }
        try {
            return this.Gm.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    public String getUrl() {
        if (this.Gm == null) {
            return null;
        }
        try {
            return this.Gm.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getUserAgentString() {
        if (this.Gm == null) {
            return "";
        }
        try {
            return this.Gm.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.Gm;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void hm() {
        if (this.Gm != null) {
            this.Gm.onResume();
        }
    }

    public void iMK() {
        try {
            this.Gm.pauseTimers();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Dww.set(true);
        if (this.CQU.get() && !this.pM.get()) {
            HzH();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Dww.set(false);
    }

    @Override // android.view.ViewGroup
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent Qhi2;
        try {
            Qhi(motionEvent);
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.WAv && (Qhi2 = Qhi(this)) != null) {
                Qhi2.requestDisallowInterceptTouchEvent(true);
            }
            return onInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.Gm.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    public void setAllowFileAccess(boolean z10) {
        try {
            this.Gm.getSettings().setAllowFileAccess(z10);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        try {
            super.setAlpha(f10);
            this.Gm.setAlpha(f10);
        } catch (Throwable unused) {
        }
    }

    public void setAppCacheEnabled(boolean z10) {
        try {
            this.Gm.getSettings().setAppCacheEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        try {
            this.Gm.setBackgroundColor(i10);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z10) {
        try {
            this.Gm.getSettings().setBuiltInZoomControls(z10);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i10) {
        try {
            this.Gm.getSettings().setCacheMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setCalculationMethod(int i10) {
        this.tP = i10;
    }

    public void setDatabaseEnabled(boolean z10) {
        try {
            this.Gm.getSettings().setDatabaseEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDeepShakeValue(float f10) {
        this.HzH = f10;
    }

    public void setDefaultFontSize(int i10) {
        try {
            this.Gm.getSettings().setDefaultFontSize(i10);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.Gm.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z10) {
        try {
            this.Gm.getSettings().setDisplayZoomControls(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z10) {
        try {
            this.Gm.getSettings().setDomStorageEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.Gm.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setIsPreventTouchEvent(boolean z10) {
        this.WAv = z10;
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z10) {
        try {
            this.Gm.getSettings().setJavaScriptCanOpenWindowsAutomatically(z10);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptEnabled(boolean z10) {
        try {
            this.Gm.getSettings().setJavaScriptEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setLandingPage(boolean z10) {
        this.CJ = z10;
    }

    public void setLandingPageClickBegin(long j10) {
        this.NFd = j10;
    }

    public void setLandingPageClickEnd(long j10) {
        this.sDy = j10;
    }

    @Override // android.view.View
    public void setLayerType(int i10, Paint paint) {
        try {
            this.Gm.setLayerType(i10, paint);
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.Gm.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z10) {
        try {
            this.Gm.getSettings().setLoadWithOverviewMode(z10);
        } catch (Throwable unused) {
        }
    }

    public void setMaterialMeta(com.bytedance.sdk.component.widget.cJ.Qhi qhi) {
        this.Qhi = qhi;
    }

    public void setMixedContentMode(int i10) {
        try {
            this.Gm.getSettings().setMixedContentMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setNetworkAvailable(boolean z10) {
        try {
            this.Gm.setNetworkAvailable(z10);
        } catch (Throwable unused) {
        }
    }

    public void setOnShakeListener(cJ cJVar) {
        this.MQ = cJVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        try {
            this.Gm.setOverScrollMode(i10);
            super.setOverScrollMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setRecycler(boolean z10) {
        if (this.Gm != null && (this.Gm instanceof PangleWebView)) {
            ((PangleWebView) this.Gm).setRecycler(z10);
        }
    }

    public void setShakeValue(float f10) {
        this.hpZ = f10;
    }

    public void setSupportZoom(boolean z10) {
        try {
            this.Gm.getSettings().setSupportZoom(z10);
        } catch (Throwable unused) {
        }
    }

    public void setTag(String str) {
        this.cJ = str;
        com.bytedance.sdk.component.widget.Qhi qhi = this.iMK;
        if (qhi != null) {
            qhi.Qhi(str);
        }
    }

    public void setTouchStateListener(fl flVar) {
        this.Eh = flVar;
    }

    public void setUseWideViewPort(boolean z10) {
        try {
            this.Gm.getSettings().setUseWideViewPort(z10);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.Gm.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        try {
            super.setVisibility(i10);
            this.Gm.setVisibility(i10);
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.Gm.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof fl) {
                setTouchStateListener((fl) webViewClient);
            } else {
                setTouchStateListener(null);
            }
            if (webViewClient == null) {
                webViewClient = new Qhi();
            }
            this.Gm.setWebViewClient(new com.bytedance.sdk.component.widget.ac(this.ABk, webViewClient, this.pA));
        } catch (Throwable unused) {
        }
    }

    public void setWriggleValue(float f10) {
        this.kYc = f10;
    }

    public void zc() {
        if (this.Gm == null) {
            return;
        }
        try {
            this.Gm.destroy();
        } catch (Throwable unused) {
        }
    }

    public SSWebView(Context context, boolean z10) {
        super(Qhi(context));
        this.f8439fl = 0.0f;
        this.Tgh = 0.0f;
        this.ROR = 0L;
        this.Sf = 0L;
        this.f8440hm = 0L;
        this.WAv = false;
        this.hpZ = 20.0f;
        this.kYc = 50.0f;
        this.Dww = new AtomicBoolean();
        this.CQU = new AtomicBoolean();
        this.pM = new AtomicBoolean();
        this.bxS = context;
        if (z10) {
            return;
        }
        try {
            this.Gm = Qhi((AttributeSet) null, 0);
            cJ();
        } catch (Throwable unused) {
        }
        cJ(Qhi(context));
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (TextUtils.isEmpty(str) || (settings = this.Gm.getSettings()) == null) {
                return;
            }
            if (Uri.parse(str).getScheme().equals("file")) {
                settings.setJavaScriptEnabled(false);
            } else {
                settings.setJavaScriptEnabled(true);
            }
        } catch (Throwable unused) {
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void Qhi(boolean z10, int i10, int i11, List<Integer> list, int i12, List<String> list2) {
        if (z10 && this.Gm != null && (this.Gm instanceof PangleWebView)) {
            this.iMK = new com.bytedance.sdk.component.widget.Qhi(this.bxS, i10, i11, list, i12);
            this.pA = list2;
            if (!TextUtils.isEmpty(this.cJ)) {
                this.iMK.Qhi(this.cJ);
            }
            ((PangleWebView) this.Gm).setArbitrageTouchListener(this.iMK);
            this.ABk = this.iMK.Qhi();
        }
    }

    public void ac() {
        try {
            this.Gm.stopLoading();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public String getTag() {
        return this.cJ;
    }

    private static boolean ac(View view) {
        try {
            Class<?> loadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ScrollingView");
            if (loadClass != null) {
                if (loadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> loadClass2 = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            if (loadClass2 != null) {
                return loadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    private void cJ(Context context) {
        ac(context);
        hpZ();
        pA();
    }

    private static boolean cJ(View view) {
        try {
            Class<?> loadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ViewPager");
            if (loadClass != null) {
                if (loadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> loadClass2 = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            if (loadClass2 != null) {
                return loadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public void Qhi(boolean z10, View view) {
        if (z10) {
            this.f8441zc = view;
            if (view == null || view.getParent() != null) {
                return;
            }
            addView(this.f8441zc, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private WebView Qhi(AttributeSet attributeSet, int i10) {
        ac acVar = aP;
        if (acVar != null) {
            return acVar.createWebView(getContext(), attributeSet, i10);
        }
        if (attributeSet == null) {
            return new WebView(Qhi(this.bxS));
        }
        return new WebView(Qhi(this.bxS), attributeSet);
    }

    @TargetApi(19)
    public void Qhi(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            this.Gm.loadUrl(str, map);
        } catch (Throwable unused) {
        }
    }

    public void Qhi(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            this.Gm.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    public void Qhi(boolean z10) {
        try {
            this.Gm.clearCache(z10);
        } catch (Throwable unused) {
        }
    }

    public ViewParent Qhi(View view) {
        ViewParent parent = view.getParent();
        if ((parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || !(parent instanceof View)) {
            return parent;
        }
        View view2 = (View) parent;
        return (cJ(view2) || ac(view2)) ? parent : Qhi(view2);
    }

    @SuppressLint({"JavascriptInterface"})
    public void Qhi(Object obj, String str) {
        try {
            this.Gm.addJavascriptInterface(obj, str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
    }

    private void Qhi(MotionEvent motionEvent) {
        if (!this.CJ || this.Qhi == null) {
            return;
        }
        if ((this.cJ != null || this.f8438ac != null) && motionEvent != null) {
            try {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        this.f8438ac.put("start_x", String.valueOf(this.f8439fl));
                        this.f8438ac.put("start_y", String.valueOf(this.Tgh));
                        this.f8438ac.put("offset_x", String.valueOf(motionEvent.getRawX() - this.f8439fl));
                        this.f8438ac.put("offset_y", String.valueOf(motionEvent.getRawY() - this.Tgh));
                        this.f8438ac.put(InMobiNetworkValues.URL, String.valueOf(getUrl()));
                        this.f8438ac.put("tag", "");
                        this.Sf = System.currentTimeMillis();
                        if (this.Gm != null) {
                            this.sDy = this.Sf;
                        }
                        this.f8438ac.put("down_time", this.ROR);
                        this.f8438ac.put("up_time", this.Sf);
                        if (com.bytedance.sdk.component.widget.Qhi.Qhi.Qhi().cJ() != null) {
                            long j10 = this.f8440hm;
                            long j11 = this.ROR;
                            if (j10 != j11) {
                                this.f8440hm = j11;
                                com.bytedance.sdk.component.widget.Qhi.Qhi.Qhi().cJ().Qhi(this.Qhi, this.cJ, "in_web_click", this.f8438ac, this.Sf - this.ROR);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f8439fl = motionEvent.getRawX();
                this.Tgh = motionEvent.getRawY();
                this.ROR = System.currentTimeMillis();
                this.f8438ac = new JSONObject();
                if (this.Gm == null) {
                    return;
                }
                this.NFd = this.ROR;
            } catch (Throwable unused) {
            }
        }
    }
}
