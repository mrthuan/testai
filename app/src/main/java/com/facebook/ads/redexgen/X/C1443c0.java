package com.facebook.ads.redexgen.X;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.c0  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1443c0 implements C6X {
    public final C04581b A00;
    public final InterfaceC04721p A01;
    public final C05906f A02;
    public final C1314Zs A03;
    public final boolean A04;

    public C1443c0(C1314Zs c1314Zs, InterfaceC04721p interfaceC04721p, C05906f c05906f, C04581b c04581b, boolean z10) {
        this.A03 = c1314Zs;
        this.A01 = interfaceC04721p;
        this.A02 = c05906f;
        this.A00 = c04581b;
        this.A04 = z10;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        C04731q playableWebViewClient = new C04731q(this.A00, this.A01, this.A04);
        webView.setWebViewClient(playableWebViewClient);
        webView.loadUrl(this.A00.A0F());
        playableWebViewClient.A03();
    }

    private void A01(boolean z10) {
        if (this.A00.A0A() == EnumC04591c.A05) {
            A00();
            return;
        }
        String A0F = this.A00.A0F();
        if (z10) {
            C05906f c05906f = this.A02;
            String markupUrlResult = this.A00.A0F();
            A0F = c05906f.A0R(markupUrlResult);
        }
        this.A00.A0K(A0F);
        this.A01.AD3();
    }

    @Override // com.facebook.ads.redexgen.X.C6X
    public final void ABT() {
        if (this.A04) {
            this.A01.AD2(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C6X
    public final void ABc() {
        A01(true);
    }
}
