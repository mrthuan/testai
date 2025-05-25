package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.aE  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1336aE implements InterfaceC05755q {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C05775s A01;
    public final /* synthetic */ W7 A02;

    public C1336aE(C05775s c05775s, ImageView imageView, W7 w7) {
        this.A01 = c05775s;
        this.A00 = imageView;
        this.A02 = w7;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05755q
    public final void AC9(Drawable drawable) {
        W7.A0e(drawable, this.A00);
        this.A02.A1J(drawable);
    }
}
