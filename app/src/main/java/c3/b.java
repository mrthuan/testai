package c3;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.afollestad.materialdialogs.internal.MDRootLayout;

/* compiled from: MDRootLayout.java */
/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f5511a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f5512b;
    public final /* synthetic */ boolean c = true;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ MDRootLayout f5513d;

    public b(MDRootLayout mDRootLayout, View view, boolean z10) {
        this.f5513d = mDRootLayout;
        this.f5511a = view;
        this.f5512b = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean z10;
        View view = this.f5511a;
        if (view.getMeasuredHeight() != 0) {
            WebView webView = (WebView) view;
            int i10 = MDRootLayout.f5986u;
            if (webView.getMeasuredHeight() < webView.getScale() * webView.getContentHeight()) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = this.c;
            boolean z12 = this.f5512b;
            MDRootLayout mDRootLayout = this.f5513d;
            if (!z10) {
                if (z12) {
                    mDRootLayout.f5990e = false;
                }
                if (z11) {
                    mDRootLayout.f5991f = false;
                }
            } else {
                mDRootLayout.b((ViewGroup) view, z12, z11);
            }
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        return true;
    }
}
