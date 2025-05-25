package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.ads.redexgen.X.bG  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1397bG implements InterfaceC04882f {
    public Drawable A00;
    public final /* synthetic */ AbstractC04872e A01;

    public C1397bG(AbstractC04872e abstractC04872e) {
        this.A01 = abstractC04872e;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04882f
    public final Drawable A6h() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04882f
    public final AbstractC04872e A6i() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04882f
    public final boolean A89() {
        return this.A01.getPreventCornerOverlap();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04882f
    public final boolean A8e() {
        return this.A01.getUseCompatPadding();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04882f
    public final void AGK(Drawable drawable) {
        this.A00 = drawable;
        this.A01.setBackgroundDrawable(drawable);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04882f
    public final void AGX(int i10, int i11) {
        if (i10 > this.A01.A01) {
            super/*android.widget.FrameLayout*/.setMinimumWidth(i10);
        }
        if (i11 > this.A01.A00) {
            super/*android.widget.FrameLayout*/.setMinimumHeight(i11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04882f
    public final void AGe(int i10, int i11, int i12, int i13) {
        this.A01.A05.set(i10, i11, i12, i13);
        super/*android.widget.FrameLayout*/.setPadding(this.A01.A04.left + i10, this.A01.A04.top + i11, this.A01.A04.right + i12, this.A01.A04.bottom + i13);
    }
}
