package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.cT  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1472cT implements C6X {
    public final /* synthetic */ C0806Fq A00;

    public C1472cT(C0806Fq c0806Fq) {
        this.A00 = c0806Fq;
    }

    private void A00(boolean z10) {
        AnonymousClass17 anonymousClass17;
        AtomicBoolean atomicBoolean;
        AnonymousClass17 anonymousClass172;
        if (!z10) {
            anonymousClass17 = this.A00.A01;
            anonymousClass17.ADU(this.A00, AdError.CACHE_ERROR);
            return;
        }
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        anonymousClass172 = this.A00.A01;
        anonymousClass172.ADR(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.C6X
    public final void ABT() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.X.C6X
    public final void ABc() {
        A00(true);
    }
}
