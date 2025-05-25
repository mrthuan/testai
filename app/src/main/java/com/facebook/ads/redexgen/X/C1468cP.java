package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.cP  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1468cP implements AnonymousClass64 {
    public final /* synthetic */ C0806Fq A00;

    public C1468cP(C0806Fq c0806Fq) {
        this.A00 = c0806Fq;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass64
    public final void ABB() {
        AtomicBoolean atomicBoolean;
        AnonymousClass17 anonymousClass17;
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        anonymousClass17 = this.A00.A01;
        anonymousClass17.ADR(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass64
    public final void ABC() {
        AnonymousClass17 anonymousClass17;
        anonymousClass17 = this.A00.A01;
        anonymousClass17.ADU(this.A00, AdError.CACHE_ERROR);
    }
}
