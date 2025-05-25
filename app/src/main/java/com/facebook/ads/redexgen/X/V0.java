package com.facebook.ads.redexgen.X;

import android.widget.ImageView;

/* loaded from: assets/audience_network.dex */
public class V0 implements InterfaceC1007Nt {
    public final /* synthetic */ C0997Nj A00;

    public V0(C0997Nj c0997Nj) {
        this.A00 = c0997Nj;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1007Nt
    public final void ABL(boolean z10) {
        boolean z11;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        z11 = this.A00.A08;
        if (z11) {
            imageView = this.A00.A00;
            if (imageView != null) {
                imageView2 = this.A00.A00;
                imageView2.setEnabled(z10);
                imageView3 = this.A00.A00;
                imageView3.setAlpha(z10 ? 1.0f : 0.3f);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1007Nt
    public final void AC0(boolean z10) {
        boolean z11;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        z11 = this.A00.A08;
        if (z11) {
            imageView = this.A00.A02;
            if (imageView != null) {
                imageView2 = this.A00.A02;
                imageView2.setEnabled(z10);
                imageView3 = this.A00.A02;
                imageView3.setAlpha(z10 ? 1.0f : 0.3f);
            }
        }
    }
}
