package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Fx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0812Fx extends AbstractC1441by {
    public final /* synthetic */ C0806Fq A00;
    public final /* synthetic */ AbstractC1460cH A01;
    public final /* synthetic */ C0801Fk A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0812Fx(C0806Fq c0806Fq, boolean z10, boolean z11, C0801Fk c0801Fk, AbstractC1460cH abstractC1460cH) {
        super(z10);
        this.A00 = c0806Fq;
        this.A03 = z11;
        this.A02 = c0801Fk;
        this.A01 = abstractC1460cH;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1441by
    public final void A00() {
        AnonymousClass17 anonymousClass17;
        anonymousClass17 = this.A00.A01;
        anonymousClass17.ADU(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1441by
    public final void A01(boolean z10) {
        C1314Zs c1314Zs;
        AtomicBoolean atomicBoolean;
        AnonymousClass17 anonymousClass17;
        C1314Zs c1314Zs2;
        c1314Zs = this.A00.A04;
        if (!C0877Im.A1j(c1314Zs) || !this.A03) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            anonymousClass17 = this.A00.A01;
            anonymousClass17.ADR(this.A01);
            return;
        }
        C0806Fq c0806Fq = this.A00;
        c1314Zs2 = this.A00.A04;
        c0806Fq.A06 = AbstractC1042Pc.A01(c1314Zs2, this.A02, 0, new C1469cQ(this));
    }
}
