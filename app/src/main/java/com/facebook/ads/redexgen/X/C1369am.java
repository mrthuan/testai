package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.am  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1369am implements InterfaceC05424i {
    public final /* synthetic */ FL A00;

    public C1369am(FL fl2) {
        this.A00 = fl2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05424i
    public final void AB9(AnonymousClass56 anonymousClass56) {
        boolean A0A;
        anonymousClass56.A0X(true);
        if (anonymousClass56.A06 != null && anonymousClass56.A07 == null) {
            anonymousClass56.A06 = null;
        }
        anonymousClass56.A07 = null;
        A0A = anonymousClass56.A0A();
        if (!A0A && !this.A00.A1v(anonymousClass56.A0H) && anonymousClass56.A0c()) {
            this.A00.removeDetachedView(anonymousClass56.A0H, false);
        }
    }
}
