package com.bytedance.sdk.component.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.widget.SSWebView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class PangleWebView extends WebView {
    private boolean CJ;
    public long Qhi;
    private Qhi Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f8432ac;
    private final HashSet<String> cJ;

    /* renamed from: fl  reason: collision with root package name */
    private boolean f8433fl;

    public PangleWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.cJ = new HashSet<>();
        this.Qhi = System.currentTimeMillis();
        Qhi();
    }

    private void Qhi() {
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(false);
        settings.setSupportMultipleWindows(false);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        setWebViewClient(new SSWebView.Qhi());
    }

    private void cJ() {
        if (this.f8432ac) {
            return;
        }
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        setOnClickListener(null);
        setOnTouchListener(null);
        Iterator<String> it = this.cJ.iterator();
        while (it.hasNext()) {
            super.removeJavascriptInterface(it.next());
        }
    }

    @Override // android.webkit.WebView
    public void addJavascriptInterface(Object obj, String str) {
        toString();
        if (!this.f8432ac && !this.f8433fl) {
            super.addJavascriptInterface(obj, str);
            this.cJ.add(str);
            return;
        }
        ABk.Qhi("TTAD.PangleWebView", "addJavascriptInterface: has destroyed or has recycler");
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z10) {
        if (!this.f8432ac && !this.f8433fl) {
            super.clearCache(z10);
        } else {
            ABk.Qhi("TTAD.PangleWebView", "clearCache: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void destroy() {
        toString();
        if (this.f8432ac) {
            return;
        }
        this.f8432ac = true;
        cJ();
        super.destroy();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!this.f8432ac && !this.f8433fl) {
            super.evaluateJavascript(str, valueCallback);
        } else if (valueCallback != null) {
            ABk.Qhi("TTAD.PangleWebView", "evaluateJavascript: has destroyed or recycler, ".concat(String.valueOf(str)));
            valueCallback.onReceiveValue("");
        }
    }

    @Override // android.webkit.WebView
    public void goBack() {
        if (!this.f8432ac && !this.f8433fl) {
            super.goBack();
        } else {
            ABk.Qhi("TTAD.PangleWebView", "goBack: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void goBackOrForward(int i10) {
        if (!this.f8432ac && !this.f8433fl) {
            super.goBackOrForward(i10);
        } else {
            ABk.Qhi("TTAD.PangleWebView", "goBackOrForward: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void goForward() {
        if (!this.f8432ac && !this.f8433fl) {
            super.goForward();
        } else {
            ABk.Qhi("TTAD.PangleWebView", "goForward: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!this.f8432ac && !this.f8433fl) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            ABk.Qhi("TTAD.PangleWebView", "loadDataWithBaseURL: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (!this.f8432ac && !this.f8433fl) {
            try {
                super.loadUrl(str);
                return;
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e10) {
                ABk.Qhi("TTAD.PangleWebView", "loadUrl: ", e10);
                return;
            }
        }
        ABk.Qhi("TTAD.PangleWebView", "loadUrl: has destroyed or recycler");
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        toString();
        if (this.CJ) {
            destroy();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.f8432ac && !this.f8433fl) {
            super.onDraw(canvas);
        }
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.f8432ac && !this.f8433fl) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // android.webkit.WebView
    public void onPause() {
        if (!this.f8432ac && !this.f8433fl) {
            try {
                super.onPause();
                return;
            } catch (Exception e10) {
                ABk.Qhi("TTAD.PangleWebView", "onPause: ", e10);
                return;
            }
        }
        ABk.Qhi("TTAD.PangleWebView", "onPause: has destroyed or recycler");
    }

    @Override // android.webkit.WebView
    public void onResume() {
        if (!this.f8432ac && !this.f8433fl) {
            try {
                super.onResume();
                return;
            } catch (Exception e10) {
                ABk.Qhi("TTAD.PangleWebView", "onResume: ", e10);
                return;
            }
        }
        ABk.Qhi("TTAD.PangleWebView", "onResume: has destroyed or recycler");
    }

    @Override // android.webkit.WebView
    public void pauseTimers() {
        if (!this.f8432ac && !this.f8433fl) {
            super.pauseTimers();
        }
    }

    @Override // android.webkit.WebView
    public void reload() {
        if (!this.f8432ac && !this.f8433fl) {
            super.reload();
        } else {
            ABk.Qhi("TTAD.PangleWebView", "reload: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void removeJavascriptInterface(String str) {
        if (!this.f8432ac && !this.f8433fl) {
            super.removeJavascriptInterface(str);
            this.cJ.remove(str);
        }
    }

    @Override // android.webkit.WebView
    public void resumeTimers() {
        if (!this.f8432ac && !this.f8433fl) {
            super.resumeTimers();
        }
    }

    public void setArbitrageTouchListener(Qhi qhi) {
        this.Tgh = qhi;
    }

    public void setDestroyOnDetached(boolean z10) {
        this.CJ = z10;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        Qhi qhi = this.Tgh;
        if (qhi == null) {
            super.setOnTouchListener(onTouchListener);
            return;
        }
        qhi.Qhi(onTouchListener);
        super.setOnTouchListener(this.Tgh);
    }

    public void setRecycler(boolean z10) {
        this.f8433fl = z10;
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (!this.f8432ac && !this.f8433fl) {
            try {
                super.stopLoading();
                return;
            } catch (Exception e10) {
                ABk.Qhi("TTAD.PangleWebView", "stopLoading: ", e10);
                return;
            }
        }
        ABk.Qhi("TTAD.PangleWebView", "stopLoading: has destroyed or recycler");
    }

    public PangleWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.cJ = new HashSet<>();
        this.Qhi = System.currentTimeMillis();
        Qhi();
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (!this.f8432ac && !this.f8433fl) {
            try {
                super.loadUrl(str, map);
                return;
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e10) {
                ABk.Qhi("TTAD.PangleWebView", "loadUrl: ", e10);
                return;
            }
        }
        ABk.Qhi("TTAD.PangleWebView", "loadUrl: has destroyed or recycler");
    }
}
