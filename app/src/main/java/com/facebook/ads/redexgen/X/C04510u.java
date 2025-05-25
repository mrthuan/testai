package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.0u  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04510u {
    public static InterfaceC04460p A00;

    public final InterfaceC04460p A00(C1314Zs c1314Zs, AdPlacementType adPlacementType) {
        if (A00 != null) {
            return A00;
        }
        switch (C04500t.A00[adPlacementType.ordinal()]) {
            case 1:
                return new GL();
            case 2:
                if (C0877Im.A1H(c1314Zs)) {
                    return new GK();
                }
                return new GL();
            case 3:
                return new C1478cZ();
            case 4:
                return new C1473cU(c1314Zs);
            case 5:
                return new GJ(c1314Zs);
            case 6:
                return new C0806Fq();
            default:
                return null;
        }
    }
}
