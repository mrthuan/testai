package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.ba  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1417ba extends AbstractC04470q {
    public static byte[] A01;
    public final /* synthetic */ C1415bY A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 43);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{9, 24, 1, 36, Field.DATA, 41, Field.MACROBUTTON, Field.AUTONUMLGL, Field.DATA, 43, 43, 34, Field.AUTONUMLGL, 103, Field.DDEAUTO, Field.AUTONUMOUT, 103, 41, Field.GOTOBUTTON, 43, 43};
    }

    public C1417ba(C1415bY c1415bY) {
        this.A00 = c1415bY;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A06() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onRewardServerFailed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A07() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onRewardServerSuccess();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A08() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A08;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoCompleted();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A09() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A08;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A0A() {
        RewardedVideoAd rewardedVideoAd;
        RewardedVideoAd rewardedVideoAd2;
        long j10;
        RewardedVideoAd rewardedVideoAd3;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd != null) {
            rewardedVideoAd2 = this.A00.A03;
            AnonymousClass61 anonymousClass61 = (AnonymousClass61) rewardedVideoAd2.buildShowAdConfig();
            long currentTimeMillis = System.currentTimeMillis();
            j10 = this.A00.A02;
            anonymousClass61.A02(currentTimeMillis - j10);
            rewardedVideoAd3 = this.A00.A03;
            rewardedVideoAd3.show(anonymousClass61.build());
            return;
        }
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoClosed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A0C() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1405bO c1405bO;
        this.A00.A07.A0E().A35();
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        c1405bO = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onAdClicked(c1405bO.A6E());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A0D() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1405bO c1405bO;
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        c1405bO = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onLoggingImpression(c1405bO.A6E());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A0F(InterfaceC04460p interfaceC04460p) {
        C0795Fe c0795Fe;
        C1405bO c1405bO;
        C1405bO c1405bO2;
        C0795Fe c0795Fe2;
        C1E c1e;
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1405bO c1405bO3;
        C1E c1e2;
        RewardedVideoAd rewardedVideoAd2;
        C1E c1e3;
        C1405bO c1405bO4;
        RewardedVideoAd rewardedVideoAd3;
        C1E c1e4;
        C1405bO c1405bO5;
        C1405bO c1405bO6;
        C1405bO c1405bO7;
        C1E c1e5;
        C1405bO c1405bO8;
        c0795Fe = this.A00.A05;
        if (c0795Fe == null) {
            this.A00.A07.A07().AA0(A00(0, 3, 67), C8E.A0N, new C8F(A00(3, 18, 108)));
            return;
        }
        AbstractC1460cH abstractC1460cH = (AbstractC1460cH) interfaceC04460p;
        c1405bO = this.A00.A09;
        if (c1405bO.A03 != null) {
            c1405bO8 = this.A00.A09;
            abstractC1460cH.A02(c1405bO8.A03);
        }
        c1405bO2 = this.A00.A09;
        c1405bO2.A00 = abstractC1460cH.A0G();
        this.A00.A06 = true;
        C1415bY c1415bY = this.A00;
        c0795Fe2 = this.A00.A05;
        c1415bY.A04 = c0795Fe2.A0H();
        c1e = this.A00.A04;
        if (c1e != null) {
            int i10 = 0;
            c1e4 = this.A00.A04;
            if (!c1e4.A15()) {
                c1e5 = this.A00.A04;
                i10 = ((AbstractC1456cD) c1e5).A1N();
            }
            if (i10 > 0) {
                L6 l62 = new L6();
                C1314Zs c1314Zs = this.A00.A07;
                c1405bO5 = this.A00.A09;
                if (l62.A09(c1314Zs, c1405bO5.A06, i10)) {
                    l62.A08(this.A00.A07, true);
                    C1415bY c1415bY2 = this.A00;
                    C1314Zs c1314Zs2 = this.A00.A07;
                    c1405bO6 = this.A00.A09;
                    String str = c1405bO6.A0D;
                    c1405bO7 = this.A00.A09;
                    c1415bY2.A03 = l62.A07(c1314Zs2, str, c1405bO7.A06);
                } else {
                    l62.A08(this.A00.A07, false);
                }
            }
        }
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A08;
            c1405bO3 = this.A00.A09;
            s2SRewardedVideoAdExtendedListener.onAdLoaded(c1405bO3.A6E());
            return;
        }
        c1e2 = this.A00.A04;
        ((AbstractC1456cD) c1e2).A1Z(true);
        rewardedVideoAd2 = this.A00.A03;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled = rewardedVideoAd2.buildLoadAdConfig().withFailOnCacheFailureEnabled(true);
        c1e3 = this.A00.A04;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withRewardData = withFailOnCacheFailureEnabled.withRewardData(c1e3.A0W());
        c1405bO4 = this.A00.A09;
        RewardedVideoAd.RewardedVideoLoadAdConfig loadAdConfig = withRewardData.withAdExperience(c1405bO4.A02).withAdListener(new RewardedVideoAdListener() { // from class: com.facebook.ads.redexgen.X.24
            @Override // com.facebook.ads.AdListener
            public final void onAdClicked(com.facebook.ads.Ad ad2) {
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdLoaded(com.facebook.ads.Ad ad2) {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                C1405bO c1405bO9;
                s2SRewardedVideoAdExtendedListener2 = C1417ba.this.A00.A08;
                c1405bO9 = C1417ba.this.A00.A09;
                s2SRewardedVideoAdExtendedListener2.onAdLoaded(c1405bO9.A6E());
            }

            @Override // com.facebook.ads.AdListener
            public final void onError(com.facebook.ads.Ad ad2, AdError adError) {
                C1E c1e6;
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                C1405bO c1405bO9;
                C1417ba.this.A00.A03 = null;
                c1e6 = C1417ba.this.A00.A04;
                ((AbstractC1456cD) c1e6).A1Z(false);
                s2SRewardedVideoAdExtendedListener2 = C1417ba.this.A00.A08;
                c1405bO9 = C1417ba.this.A00.A09;
                s2SRewardedVideoAdExtendedListener2.onAdLoaded(c1405bO9.A6E());
            }

            @Override // com.facebook.ads.AdListener
            public final void onLoggingImpression(com.facebook.ads.Ad ad2) {
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoClosed() {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                s2SRewardedVideoAdExtendedListener2 = C1417ba.this.A00.A08;
                s2SRewardedVideoAdExtendedListener2.onRewardedVideoClosed();
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoCompleted() {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                s2SRewardedVideoAdExtendedListener2 = C1417ba.this.A00.A08;
                s2SRewardedVideoAdExtendedListener2.onRewardedVideoCompleted();
            }
        }).build();
        rewardedVideoAd3 = this.A00.A03;
        rewardedVideoAd3.loadAd(loadAdConfig);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A0G(C0894Jg c0894Jg) {
        C1405bO c1405bO;
        long j10;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1405bO c1405bO2;
        this.A00.A0D(true);
        c1405bO = this.A00.A09;
        C0S A0E = c1405bO.A0B.A0E();
        j10 = this.A00.A01;
        A0E.A38(C0956Lu.A01(j10), c0894Jg.A03().getErrorCode(), c0894Jg.A04());
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        c1405bO2 = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onError(c1405bO2.A6E(), L8.A00(c0894Jg));
    }
}
