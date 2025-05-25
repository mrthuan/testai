package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.RewardData;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.Fd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0794Fd extends AbstractC1425bi {
    public static final AnonymousClass25 A02 = new C1412bV();
    public C1418bb A00;
    public final C1414bX A01;

    public C0794Fd(C1414bX c1414bX, String str) {
        super(c1414bX.A05(), str, A02.A53(c1414bX));
        this.A01 = c1414bX;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1425bi
    public final void A08() {
        if (this.A00 != null) {
            this.A00.destroy();
        }
        super.A00.AGM(EnumC04821z.A03);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1425bi
    public final void A09() {
        this.A00 = new C1418bb(this.A01, this, A04());
        this.A00.A0G(this.A01.A0B(), this.A01.A07());
    }

    public final void A0D(InterstitialAd interstitialAd, EnumSet<CacheFlag> cacheFlags, String str) {
        if (super.A00.A5z()) {
            return;
        }
        this.A01.A0D(interstitialAd);
        if (this.A00 != null) {
            this.A00.A0G(cacheFlags, str);
            return;
        }
        this.A01.A0K(cacheFlags);
        this.A01.A0H(str);
        if (AbstractC0879Ip.A07(this.A02) && AbstractC0879Ip.A08(this.A02)) {
            A05();
        } else {
            A09();
        }
    }

    public final void A0E(RewardData rewardData) {
        this.A01.A0F(rewardData);
        if (super.A01.A01) {
            super.A01.A0F(1013, C2K.A00(new Bundle(), rewardData));
        }
    }

    public final boolean A0F() {
        if (this.A00 != null) {
            return this.A00.A0H();
        }
        return this.A01.A00() > 0 && C0956Lu.A00() > this.A01.A00();
    }

    public final boolean A0G() {
        if (this.A00 != null) {
            return this.A00.A0I();
        }
        return super.A00.A6J() == EnumC04821z.A05;
    }

    public final boolean A0H(InterstitialAd interstitialAd, InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        if (super.A00.A60()) {
            return false;
        }
        this.A01.A0D(interstitialAd);
        if (super.A01.A01) {
            A0A(-1);
            return true;
        } else if (this.A00 != null) {
            return this.A00.A0J();
        } else {
            this.A00 = new C1418bb(this.A01, this, A04());
            this.A00.A0J();
            return false;
        }
    }
}
