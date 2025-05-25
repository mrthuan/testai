package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.cR  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1470cR implements AnonymousClass64 {
    public final /* synthetic */ C0806Fq A00;
    public final /* synthetic */ boolean A01;

    public C1470cR(C0806Fq c0806Fq, boolean z10) {
        this.A00 = c0806Fq;
        this.A01 = z10;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass64
    public final void ABB() {
        C1314Zs c1314Zs;
        AtomicBoolean atomicBoolean;
        AnonymousClass17 anonymousClass17;
        C1314Zs c1314Zs2;
        C1E c1e;
        c1314Zs = this.A00.A04;
        if (!C0877Im.A1j(c1314Zs) || !this.A01) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            anonymousClass17 = this.A00.A01;
            anonymousClass17.ADR(this.A00);
            return;
        }
        C0806Fq c0806Fq = this.A00;
        c1314Zs2 = this.A00.A04;
        c1e = this.A00.A03;
        c0806Fq.A06 = AbstractC1042Pc.A01(c1314Zs2, (C0801Fk) c1e, 0, new C1471cS(this));
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass64
    public final void ABC() {
        AnonymousClass17 anonymousClass17;
        anonymousClass17 = this.A00.A01;
        anonymousClass17.ADU(this.A00, AdError.CACHE_ERROR);
    }
}
