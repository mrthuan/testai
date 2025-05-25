package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.InterstitialAdListener;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.bd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1420bd extends AbstractC04470q {
    public static byte[] A01;
    public static String[] A02 = {"swComlxz6aoGHqKS8LOj1g5iAOstdInC", "iLoXwxITRpbgZFbT1koR1uJW4vvDXY2W", "MpkXHfR6HdYIg9t449R", "HQI6v11U6roDlbOuDHGyMjhCWVrAbgmk", "qsbQ14vrFuO8q1N0nwgFIOsRNgh3HWyt", "NXqrvE65RyYHWICx", "E9yzS8MfEszoKvwo", "osh9YHk0bwFUuMRHqHbnPk"};
    public final /* synthetic */ C1418bb A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 112, 105, Field.GLOSSARY, Field.QUOTE, 34, 56, Field.USERADDRESS, Field.QUOTE, 32, 32, 41, Field.USERADDRESS, 108, Field.PAGEREF, Field.BARCODE, 108, 34, Field.SYMBOL, 32, 32};
    }

    static {
        A01();
    }

    public C1420bd(C1418bb c1418bb) {
        this.A00 = c1418bb;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A02() {
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAd = this.A00.A01;
        if (interstitialAd == null) {
            this.A00.A04 = false;
            interstitialAdExtendedListener = this.A00.A07;
            interstitialAdExtendedListener.onInterstitialActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A04() {
        InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2;
        C0799Fi c0799Fi;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1414bX c1414bX;
        C0799Fi c0799Fi2;
        C0799Fi c0799Fi3;
        C0799Fi c0799Fi4;
        interstitialAd = this.A00.A01;
        if (interstitialAd != null) {
            interstitialAd2 = this.A00.A01;
            interstitialAd2.show();
            return;
        }
        this.A00.A04 = false;
        c0799Fi = this.A00.A03;
        if (c0799Fi != null && C0877Im.A22(this.A00.A06)) {
            c0799Fi2 = this.A00.A03;
            c0799Fi2.A0R(new C1421be(this));
            c0799Fi3 = this.A00.A03;
            c0799Fi3.A0M();
            c0799Fi4 = this.A00.A03;
            c0799Fi4.A0J();
            this.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A00.A07;
        c1414bX = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c1414bX.A6E());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A05() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1414bX c1414bX;
        interstitialAdExtendedListener = this.A00.A07;
        c1414bX = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDisplayed(c1414bX.A6E());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A06() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerFailed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A07() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerSucceeded();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A08() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdCompleted();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A0C() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1414bX c1414bX;
        this.A00.A06.A0E().A35();
        interstitialAdExtendedListener = this.A00.A07;
        c1414bX = this.A00.A08;
        interstitialAdExtendedListener.onAdClicked(c1414bX.A6E());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A0D() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1414bX c1414bX;
        interstitialAdExtendedListener = this.A00.A07;
        c1414bX = this.A00.A08;
        interstitialAdExtendedListener.onLoggingImpression(c1414bX.A6E());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A0E(View view) {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A0F(InterfaceC04460p interfaceC04460p) {
        C0799Fi c0799Fi;
        C0799Fi c0799Fi2;
        C1E c1e;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1414bX c1414bX;
        C1E c1e2;
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener2;
        C1414bX c1414bX2;
        InterstitialAdExtendedListener interstitialAdExtendedListener3;
        C1414bX c1414bX3;
        InterstitialAd interstitialAd2;
        C1414bX c1414bX4;
        C1414bX c1414bX5;
        InterstitialAd interstitialAd3;
        C1414bX c1414bX6;
        C1414bX c1414bX7;
        C1414bX c1414bX8;
        c0799Fi = this.A00.A03;
        if (c0799Fi != null) {
            this.A00.A05 = true;
            C1418bb c1418bb = this.A00;
            c0799Fi2 = this.A00.A03;
            c1418bb.A02 = c0799Fi2.A0H();
            c1e = this.A00.A02;
            if (!(c1e instanceof AbstractC1456cD)) {
                interstitialAdExtendedListener = this.A00.A07;
                String[] strArr = A02;
                if (strArr[0].charAt(8) == strArr[3].charAt(8)) {
                    String[] strArr2 = A02;
                    strArr2[6] = "JHAXxmwzHKs3NajX";
                    strArr2[5] = "FHZeNyejFCAXh3Vz";
                    c1414bX = this.A00.A08;
                    interstitialAdExtendedListener.onAdLoaded(c1414bX.A6E());
                    return;
                }
            } else {
                c1e2 = this.A00.A02;
                final AbstractC1456cD abstractC1456cD = (AbstractC1456cD) c1e2;
                if (abstractC1456cD.A1N() > 0) {
                    L6 l62 = new L6();
                    C1314Zs c1314Zs = this.A00.A06;
                    c1414bX6 = this.A00.A08;
                    if (l62.A09(c1314Zs, c1414bX6.A08(), abstractC1456cD.A1N())) {
                        l62.A08(this.A00.A06, true);
                        C1418bb c1418bb2 = this.A00;
                        C1314Zs c1314Zs2 = this.A00.A06;
                        c1414bX7 = this.A00.A08;
                        String A0A = c1414bX7.A0A();
                        c1414bX8 = this.A00.A08;
                        c1418bb2.A01 = l62.A06(c1314Zs2, A0A, c1414bX8.A08());
                    } else {
                        C1418bb c1418bb3 = this.A00;
                        if (A02[1].charAt(2) != 'w') {
                            A02[7] = "alFbtn3b1";
                            l62.A08(c1418bb3.A06, false);
                        } else {
                            String[] strArr3 = A02;
                            strArr3[6] = "OkLAbmcEeyte5Vfo";
                            strArr3[5] = "zgaU15rF2mVDrexS";
                            l62.A08(c1418bb3.A06, false);
                        }
                    }
                }
                C1418bb c1418bb4 = this.A00;
                if (A02[1].charAt(2) != 'w') {
                    A02[1] = "23I4hcZMgJ395X2lYna8PMjzW0ozt3hz";
                    interstitialAd = c1418bb4.A01;
                    if (interstitialAd != null) {
                        abstractC1456cD.A1Z(true);
                        interstitialAd2 = this.A00.A01;
                        InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener = interstitialAd2.buildLoadAdConfig().withAdListener(new InterstitialAdListener() { // from class: com.facebook.ads.redexgen.X.23
                            @Override // com.facebook.ads.AdListener
                            public final void onAdClicked(com.facebook.ads.Ad ad2) {
                            }

                            @Override // com.facebook.ads.AdListener
                            public final void onAdLoaded(com.facebook.ads.Ad ad2) {
                                InterstitialAdExtendedListener interstitialAdExtendedListener4;
                                C1414bX c1414bX9;
                                interstitialAdExtendedListener4 = C1420bd.this.A00.A07;
                                c1414bX9 = C1420bd.this.A00.A08;
                                interstitialAdExtendedListener4.onAdLoaded(c1414bX9.A6E());
                            }

                            @Override // com.facebook.ads.AdListener
                            public final void onError(com.facebook.ads.Ad ad2, AdError adError) {
                                InterstitialAdExtendedListener interstitialAdExtendedListener4;
                                C1414bX c1414bX9;
                                C1420bd.this.A00.A01 = null;
                                abstractC1456cD.A1Z(false);
                                interstitialAdExtendedListener4 = C1420bd.this.A00.A07;
                                c1414bX9 = C1420bd.this.A00.A08;
                                interstitialAdExtendedListener4.onAdLoaded(c1414bX9.A6E());
                            }

                            @Override // com.facebook.ads.InterstitialAdListener
                            public final void onInterstitialDismissed(com.facebook.ads.Ad ad2) {
                                C0799Fi c0799Fi3;
                                InterstitialAdExtendedListener interstitialAdExtendedListener4;
                                C1414bX c1414bX9;
                                C0799Fi c0799Fi4;
                                C0799Fi c0799Fi5;
                                C0799Fi c0799Fi6;
                                C1420bd.this.A00.A04 = false;
                                c0799Fi3 = C1420bd.this.A00.A03;
                                if (c0799Fi3 != null) {
                                    c0799Fi4 = C1420bd.this.A00.A03;
                                    c0799Fi4.A0R(new C1422bf(this));
                                    c0799Fi5 = C1420bd.this.A00.A03;
                                    c0799Fi5.A0M();
                                    c0799Fi6 = C1420bd.this.A00.A03;
                                    c0799Fi6.A0J();
                                    C1420bd.this.A00.A03 = null;
                                }
                                interstitialAdExtendedListener4 = C1420bd.this.A00.A07;
                                c1414bX9 = C1420bd.this.A00.A08;
                                interstitialAdExtendedListener4.onInterstitialDismissed(c1414bX9.A6E());
                            }

                            @Override // com.facebook.ads.InterstitialAdListener
                            public final void onInterstitialDisplayed(com.facebook.ads.Ad ad2) {
                            }

                            @Override // com.facebook.ads.AdListener
                            public final void onLoggingImpression(com.facebook.ads.Ad ad2) {
                            }
                        });
                        c1414bX4 = this.A00.A08;
                        InterstitialAd.InterstitialAdLoadConfigBuilder withCacheFlags = withAdListener.withCacheFlags(c1414bX4.A0B());
                        c1414bX5 = this.A00.A08;
                        InterstitialAd.InterstitialLoadAdConfig loadAdConfig = withCacheFlags.withRewardData(c1414bX5.A03()).build();
                        interstitialAd3 = this.A00.A01;
                        interstitialAd3.loadAd(loadAdConfig);
                        return;
                    }
                    C1418bb c1418bb5 = this.A00;
                    String[] strArr4 = A02;
                    if (strArr4[0].charAt(8) != strArr4[3].charAt(8)) {
                        interstitialAdExtendedListener3 = c1418bb5.A07;
                        c1414bX3 = this.A00.A08;
                        interstitialAdExtendedListener3.onAdLoaded(c1414bX3.A6E());
                        return;
                    }
                    A02[2] = "joZPUUFug9Ts";
                    interstitialAdExtendedListener2 = c1418bb5.A07;
                    c1414bX2 = this.A00.A08;
                    interstitialAdExtendedListener2.onAdLoaded(c1414bX2.A6E());
                    return;
                }
            }
            throw new RuntimeException();
        }
        this.A00.A06.A07().AA0(A00(0, 3, 98), C8E.A0N, new C8F(A00(3, 18, 46)));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04470q
    public final void A0G(C0894Jg c0894Jg) {
        long j10;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1414bX c1414bX;
        C0S A0E = this.A00.A06.A0E();
        j10 = this.A00.A00;
        A0E.A38(C0956Lu.A01(j10), c0894Jg.A03().getErrorCode(), c0894Jg.A04());
        interstitialAdExtendedListener = this.A00.A07;
        c1414bX = this.A00.A08;
        interstitialAdExtendedListener.onError(c1414bX.A6E(), L8.A00(c0894Jg));
    }
}
