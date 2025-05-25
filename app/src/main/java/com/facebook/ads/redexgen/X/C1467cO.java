package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.cO  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1467cO implements InterfaceC04721p {
    public final /* synthetic */ C0806Fq A00;

    public C1467cO(C0806Fq c0806Fq) {
        this.A00 = c0806Fq;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04721p
    public final void AD2(AdError adError) {
        AnonymousClass17 anonymousClass17;
        anonymousClass17 = this.A00.A01;
        anonymousClass17.ADU(this.A00, adError);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04721p
    public final void AD3() {
        AtomicBoolean atomicBoolean;
        AnonymousClass17 anonymousClass17;
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        anonymousClass17 = this.A00.A01;
        anonymousClass17.ADR(this.A00);
    }
}
