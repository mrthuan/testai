package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class Fr extends AbstractC1441by {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0806Fq A01;
    public final /* synthetic */ C1454cB A02;
    public final /* synthetic */ C0801Fk A03;
    public final /* synthetic */ C1314Zs A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fr(C0806Fq c0806Fq, boolean z10, C1314Zs c1314Zs, C0801Fk c0801Fk, C1454cB c1454cB, int i10) {
        super(z10);
        this.A01 = c0806Fq;
        this.A04 = c1314Zs;
        this.A03 = c0801Fk;
        this.A02 = c1454cB;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1441by
    public final void A00() {
        AnonymousClass17 anonymousClass17;
        anonymousClass17 = this.A01.A01;
        anonymousClass17.ADU(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1441by
    public final void A01(boolean z10) {
        AtomicBoolean atomicBoolean;
        AnonymousClass17 anonymousClass17;
        C0806Fq.A0D = null;
        if (z10) {
            this.A04.A00().AGG(this.A03.A1U(), this.A02.A1O());
        }
        if (this.A00 == 0) {
            atomicBoolean = this.A01.A0C;
            atomicBoolean.set(true);
            anonymousClass17 = this.A01.A01;
            anonymousClass17.ADR(this.A01);
        }
        this.A01.A0B(this.A04, this.A02, this.A00 + 1);
    }
}
