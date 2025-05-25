package com.facebook.ads.redexgen.X;

import android.view.View;
import android.webkit.WebView;

/* renamed from: com.facebook.ads.redexgen.X.Ng  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0994Ng implements View.OnClickListener {
    public final /* synthetic */ C0997Nj A00;

    public View$OnClickListenerC0994Ng(C0997Nj c0997Nj) {
        this.A00 = c0997Nj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView;
        WebView webView2;
        if (KQ.A02(this)) {
            return;
        }
        try {
            webView = this.A00.A0A;
            if (!webView.canGoForward()) {
                return;
            }
            webView2 = this.A00.A0A;
            webView2.goForward();
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
