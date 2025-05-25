package com.facebook.ads.redexgen.X;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.Fi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0799Fi extends AbstractC1437bu {
    public C0799Fi(C1314Zs c1314Zs, C04761t c04761t) {
        super(c1314Zs, c04761t);
    }

    private C1435bs A00(Runnable runnable) {
        return new C1435bs(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1437bu
    public final C1E A0H() {
        C1478cZ successfullyLoadedAdapter = (C1478cZ) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1437bu
    public final void A0O() {
        C1478cZ interstitialAdapter = (C1478cZ) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1437bu
    public final void A0Q(InterfaceC04460p interfaceC04460p, C8W c8w, C8U c8u, C04771u c04771u) {
        C1478cZ c1478cZ = (C1478cZ) interfaceC04460p;
        C1436bt c1436bt = new C1436bt(this, c04771u, c1478cZ);
        A0G().postDelayed(c1436bt, c8w.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c1478cZ.A0A(this.A0B, A00(c1436bt), c04771u, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
