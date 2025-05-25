package com.facebook.ads.redexgen.X;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Jr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0904Jr implements SX {
    public final C0912Jz A00;
    public final EnumC1120Sc A01;

    public AbstractC0904Jr(C0912Jz c0912Jz, EnumC1120Sc enumC1120Sc) {
        this.A00 = c0912Jz;
        this.A01 = enumC1120Sc;
    }

    @Override // com.facebook.ads.redexgen.X.SX
    public void A3v(Map<SF, EnumC1120Sc> map, Map<SyncModifiableBundle, SP> map2) {
        map.put(this.A00, this.A01);
    }
}
