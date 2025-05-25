package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.api.AdNativeComponentView;

/* renamed from: com.facebook.ads.redexgen.X.Mc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0964Mc extends AdNativeComponentView {
    public static final int A01 = (int) (LP.A02 * 1.0f);
    public final ImageView A00;

    public C0964Mc(C1314Zs c1314Zs) {
        super(c1314Zs);
        this.A00 = new C0987Mz(c1314Zs);
        this.A00.setScaleType(ImageView.ScaleType.CENTER_CROP);
        LU.A04(this.A00, LU.A0B);
        addView(this.A00, new ViewGroup.LayoutParams(-1, -1));
        M3.A0M(this.A00, -2130706433);
        setPadding(A01, A01, A01, A01);
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public View getAdContentsView() {
        return this.A00;
    }

    public ImageView getImageCardView() {
        return this.A00;
    }
}
