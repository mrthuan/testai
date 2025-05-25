package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.al  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1368al implements AnonymousClass59 {
    public final /* synthetic */ AbstractC05484o A00;

    public C1368al(AbstractC05484o abstractC05484o) {
        this.A00 = abstractC05484o;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass59
    public final View A6k(int i10) {
        return this.A00.A0t(i10);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass59
    public final int A6m(View view) {
        return this.A00.A0n(view) + ((C05494p) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass59
    public final int A6n(View view) {
        return this.A00.A0k(view) - ((C05494p) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass59
    public final int A7y() {
        return this.A00.A0h() - this.A00.A0f();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass59
    public final int A7z() {
        return this.A00.A0e();
    }
}
