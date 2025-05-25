package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bE  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1395bE implements InterfaceC04892g {
    private C04902h A00(InterfaceC04882f interfaceC04882f) {
        return (C04902h) interfaceC04882f.A6h();
    }

    public final void A01(InterfaceC04882f interfaceC04882f) {
        if (!interfaceC04882f.A8e()) {
            interfaceC04882f.AGe(0, 0, 0, 0);
            return;
        }
        float A7k = A7k(interfaceC04882f);
        float A8A = A8A(interfaceC04882f);
        float elevation = C04922j.A00(A7k, A8A, interfaceC04882f.A89());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = C04922j.A01(A7k, A8A, interfaceC04882f.A89());
        int ceil = (int) Math.ceil(elevation2);
        interfaceC04882f.AGe(vPadding, ceil, vPadding, ceil);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final ColorStateList A6U(InterfaceC04882f interfaceC04882f) {
        return A00(interfaceC04882f).A05();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final float A7H(InterfaceC04882f interfaceC04882f) {
        return interfaceC04882f.A6i().getElevation();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final float A7k(InterfaceC04882f interfaceC04882f) {
        return A00(interfaceC04882f).A03();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final float A7p(InterfaceC04882f interfaceC04882f) {
        return A8A(interfaceC04882f) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final float A7q(InterfaceC04882f interfaceC04882f) {
        return A8A(interfaceC04882f) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final float A8A(InterfaceC04882f interfaceC04882f) {
        return A00(interfaceC04882f).A04();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final void A9G() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final void A9H(InterfaceC04882f interfaceC04882f, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        C04902h background = new C04902h(colorStateList, f10);
        interfaceC04882f.AGK(background);
        View view = interfaceC04882f.A6i();
        view.setClipToOutline(true);
        view.setElevation(f11);
        AGW(interfaceC04882f, f12);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final void ABY(InterfaceC04882f interfaceC04882f) {
        AGW(interfaceC04882f, A7k(interfaceC04882f));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final void ADD(InterfaceC04882f interfaceC04882f) {
        AGW(interfaceC04882f, A7k(interfaceC04882f));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final void AGJ(InterfaceC04882f interfaceC04882f, ColorStateList colorStateList) {
        A00(interfaceC04882f).A08(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final void AGP(InterfaceC04882f interfaceC04882f, float f10) {
        interfaceC04882f.A6i().setElevation(f10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final void AGW(InterfaceC04882f interfaceC04882f, float f10) {
        A00(interfaceC04882f).A07(f10, interfaceC04882f.A8e(), interfaceC04882f.A89());
        A01(interfaceC04882f);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04892g
    public final void AGc(InterfaceC04882f interfaceC04882f, float f10) {
        A00(interfaceC04882f).A06(f10);
    }
}
