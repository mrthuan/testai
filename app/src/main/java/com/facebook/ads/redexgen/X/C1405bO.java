package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAdListener;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.bO  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1405bO implements InterfaceC06107f {
    public int A00 = -1;
    public long A01 = -1;
    public AdExperienceType A02;
    public RewardData A03;
    public RewardedVideoAdListener A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public com.facebook.ads.Ad A09;
    public WeakReference<com.facebook.ads.Ad> A0A;
    public final C1314Zs A0B;
    public final InterfaceC06288d A0C;
    public final String A0D;

    public C1405bO(C1314Zs c1314Zs, String str, com.facebook.ads.Ad ad2, InterfaceC06288d interfaceC06288d) {
        this.A0B = c1314Zs;
        this.A0D = str;
        this.A09 = ad2;
        this.A0A = new WeakReference<>(ad2);
        this.A0C = interfaceC06288d;
        c1314Zs.A0M(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC06107f
    /* renamed from: A00 */
    public final RewardedVideoAdListener A6I() {
        return this.A04;
    }

    public final C1314Zs A01() {
        return this.A0B;
    }

    public final void A02(com.facebook.ads.Ad ad2) {
        if (ad2 == null && !C0877Im.A0r(this.A0B)) {
            return;
        }
        this.A09 = ad2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06107f
    public final com.facebook.ads.Ad A6E() {
        return this.A09 != null ? this.A09 : this.A0A.get();
    }
}
