package com.facebook.ads.redexgen.X;

import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedAdListener;
import java.lang.ref.WeakReference;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.bX  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1414bX implements InterfaceC06107f {
    public long A00;
    public InterstitialAd A01;
    public InterstitialAdListener A02;
    public RewardData A03;
    public RewardedAdListener A04;
    public String A05;
    public String A06;
    public String A07;
    public EnumSet<CacheFlag> A08;
    public final InterfaceC06288d A09;
    public final C1314Zs A0A;
    public final String A0B;
    public final WeakReference<InterstitialAd> A0C;

    public C1414bX(C1314Zs c1314Zs, InterstitialAd interstitialAd, String str) {
        this(c1314Zs, interstitialAd, str, new C1424bh());
    }

    public C1414bX(C1314Zs c1314Zs, InterstitialAd interstitialAd, String str, InterfaceC06288d interfaceC06288d) {
        this.A0A = c1314Zs;
        this.A0B = str;
        this.A01 = interstitialAd;
        this.A0C = new WeakReference<>(interstitialAd);
        this.A00 = -1L;
        c1314Zs.A0M(this);
        this.A09 = interfaceC06288d;
    }

    public final long A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06107f
    /* renamed from: A01 */
    public final InterstitialAd A6E() {
        return this.A01 != null ? this.A01 : this.A0C.get();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06107f
    /* renamed from: A02 */
    public final InterstitialAdListener A6I() {
        return this.A02;
    }

    public final RewardData A03() {
        return this.A03;
    }

    public final RewardedAdListener A04() {
        return this.A04;
    }

    public final C1314Zs A05() {
        return this.A0A;
    }

    public final InterfaceC06288d A06() {
        return this.A09;
    }

    public final String A07() {
        return this.A05;
    }

    public final String A08() {
        return this.A06;
    }

    public final String A09() {
        return this.A07;
    }

    public final String A0A() {
        return this.A0B;
    }

    public final EnumSet<CacheFlag> A0B() {
        return this.A08;
    }

    public final void A0C(long j10) {
        this.A00 = j10;
    }

    public final void A0D(InterstitialAd interstitialAd) {
        if (interstitialAd == null && !C0877Im.A0r(this.A0A)) {
            return;
        }
        this.A01 = interstitialAd;
    }

    public final void A0E(InterstitialAdListener interstitialAdListener) {
        this.A02 = interstitialAdListener;
    }

    public final void A0F(RewardData rewardData) {
        this.A03 = rewardData;
    }

    public final void A0G(RewardedAdListener rewardedAdListener) {
        this.A04 = rewardedAdListener;
    }

    public final void A0H(String str) {
        this.A05 = str;
    }

    public final void A0I(String str) {
        this.A06 = str;
    }

    public final void A0J(String str) {
        this.A07 = str;
    }

    public final void A0K(EnumSet<CacheFlag> flags) {
        this.A08 = flags;
    }
}
