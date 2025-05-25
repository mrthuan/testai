package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: com.facebook.ads.redexgen.X.bC  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1393bC implements InterfaceC04892g {
    public final RectF A00 = new RectF();

    private C04922j A00(Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        return new C04922j(context.getResources(), colorStateList, f10, f11, f12);
    }

    private C04922j A01(InterfaceC04882f interfaceC04882f) {
        return (C04922j) interfaceC04882f.A6h();
    }

    public final void A02(InterfaceC04882f interfaceC04882f) {
        Rect rect = new Rect();
        A01(interfaceC04882f).A0K(rect);
        interfaceC04882f.AGX((int) Math.ceil(A7q(interfaceC04882f)), (int) Math.ceil(A7p(interfaceC04882f)));
        interfaceC04882f.AGe(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final ColorStateList A6U(InterfaceC04882f interfaceC04882f) {
        return A01(interfaceC04882f).A0F();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final float A7H(InterfaceC04882f interfaceC04882f) {
        return A01(interfaceC04882f).A0E();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final float A7k(InterfaceC04882f interfaceC04882f) {
        return A01(interfaceC04882f).A0B();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final float A7p(InterfaceC04882f interfaceC04882f) {
        return A01(interfaceC04882f).A0C();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final float A7q(InterfaceC04882f interfaceC04882f) {
        return A01(interfaceC04882f).A0D();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final float A8A(InterfaceC04882f interfaceC04882f) {
        return A01(interfaceC04882f).A0A();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public void A9G() {
        C04922j.A0G = new C1394bD(this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final void A9H(InterfaceC04882f interfaceC04882f, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        C04922j A00 = A00(context, colorStateList, f10, f11, f12);
        A00.A0L(interfaceC04882f.A89());
        interfaceC04882f.AGK(A00);
        A02(interfaceC04882f);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final void ABY(InterfaceC04882f interfaceC04882f) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final void ADD(InterfaceC04882f interfaceC04882f) {
        A01(interfaceC04882f).A0L(interfaceC04882f.A89());
        A02(interfaceC04882f);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final void AGJ(InterfaceC04882f interfaceC04882f, ColorStateList colorStateList) {
        A01(interfaceC04882f).A0J(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final void AGP(InterfaceC04882f interfaceC04882f, float f10) {
        A01(interfaceC04882f).A0I(f10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final void AGW(InterfaceC04882f interfaceC04882f, float f10) {
        A01(interfaceC04882f).A0H(f10);
        A02(interfaceC04882f);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final void AGc(InterfaceC04882f interfaceC04882f, float f10) {
        A01(interfaceC04882f).A0G(f10);
        A02(interfaceC04882f);
    }
}
