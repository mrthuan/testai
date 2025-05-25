package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.c5  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1448c5 implements AnonymousClass64 {
    public final /* synthetic */ AbstractC1456cD A00;
    public final /* synthetic */ InterfaceC04631g A01;
    public final /* synthetic */ C04641h A02;
    public final /* synthetic */ C1314Zs A03;
    public final /* synthetic */ boolean A04;

    public C1448c5(C04641h c04641h, C1314Zs c1314Zs, boolean z10, AbstractC1456cD abstractC1456cD, InterfaceC04631g interfaceC04631g) {
        this.A02 = c04641h;
        this.A03 = c1314Zs;
        this.A04 = z10;
        this.A00 = abstractC1456cD;
        this.A01 = interfaceC04631g;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass64
    public final void ABB() {
        ArrayList arrayList;
        if (C0877Im.A1g(this.A03) && this.A04) {
            arrayList = this.A02.A02;
            arrayList.add(AbstractC1042Pc.A01(this.A03, this.A00, 1, new C1449c6(this)));
            return;
        }
        this.A01.AB5();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass64
    public final void ABC() {
        this.A01.AB4(AdError.CACHE_ERROR);
    }
}
