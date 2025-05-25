package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ak  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1367ak implements AnonymousClass59 {
    public final /* synthetic */ AbstractC05484o A00;

    public C1367ak(AbstractC05484o abstractC05484o) {
        this.A00 = abstractC05484o;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass59
    public final View A6k(int i10) {
        return this.A00.A0t(i10);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass59
    public final int A6m(View view) {
        return this.A00.A0j(view) + ((C05494p) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass59
    public final int A6n(View view) {
        return this.A00.A0o(view) - ((C05494p) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass59
    public final int A7y() {
        return this.A00.A0X() - this.A00.A0d();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass59
    public final int A7z() {
        return this.A00.A0g();
    }
}
