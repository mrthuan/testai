package com.facebook.ads.redexgen.X;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Js  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0905Js implements SX {
    public final SP A00;
    public final AnonymousClass79 A01;

    public AbstractC0905Js(AnonymousClass79 anonymousClass79, SP sp2) {
        this.A01 = anonymousClass79;
        this.A00 = sp2;
    }

    @Override // com.facebook.ads.redexgen.X.SX
    public void A3v(Map<SF, EnumC1120Sc> map, Map<SyncModifiableBundle, SP> map2) {
        map2.put(null, this.A00);
    }
}
