package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardedInterstitialAd;
import com.facebook.ads.internal.api.RewardedInterstitialAdApi;
import com.facebook.ads.internal.context.Repairable;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.5v  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05805v implements RewardedInterstitialAdApi, Repairable {
    public static byte[] A01;
    public final C05845z A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{82, Field.DOCPROPERTY, Field.CONTROL, Field.ADVANCE, 86, 5, 5, Field.ADDIN, 48, Field.AUTONUM, Field.EQ, Field.IMPORT, 58, 58, Field.IMPORT, Field.MACROBUTTON, 106, 59, 109, 111, 108, 108, 109, 59, 12, 15, Field.HYPERLINK, 8, 14, Field.LISTNUM, 2, Field.ADDRESSBLOCK, 64, 119, 101, 115, 96, 118, 119, 118, Field.GOTOBUTTON, 123, 124, 102, 119, 96, 97, 102, 123, 102, 123, 115, 126, Field.GOTOBUTTON, 115, 118, Field.GOTOBUTTON, 118, 119, 97, 102, 96, 125, 107, 119, 118, 30, 41, 59, Field.DDE, Field.USERADDRESS, Field.DATA, 41, Field.DATA, 108, Field.PAGEREF, 34, 56, 41, Field.USERADDRESS, Field.BARCODE, 56, Field.PAGEREF, 56, Field.PAGEREF, Field.DDE, 32, 108, Field.DDE, Field.DATA, 108, 32, Field.QUOTE, Field.DDE, Field.DATA, 108, Field.USERADDRESS, 41, 61, Field.SYMBOL, 41, Field.BARCODE, 56, 41, Field.DATA, 122, 77, Field.SHAPE, Field.TOA, Field.LISTNUM, 76, 77, 76, 8, Field.SECTION, Field.FORMTEXT, Field.BIDIOUTLINE, 77, Field.LISTNUM, Field.HTMLCONTROL, Field.BIDIOUTLINE, Field.SECTION, Field.BIDIOUTLINE, Field.SECTION, Field.TOA, Field.INCLUDETEXT, 8, Field.TOA, 76, 8, Field.HTMLCONTROL, 64, Field.FORMCHECKBOX, Field.SHAPE, 8, Field.MERGESEQ, Field.TOA, Field.INCLUDETEXT, Field.INCLUDETEXT, 77, 76, 126, Byte.MAX_VALUE, 105, 110, 104, 117, 99, 31, Field.NUMCHARS, 18, 23, Field.GOTOBUTTON, 23, 41, Field.GOTOBUTTON, Field.AUTONUMLGL, Field.DDE};
    }

    public C05805v(Context context, String str, RewardedInterstitialAd rewardedInterstitialAd) {
        this.A00 = new C05845z(context, str, rewardedInterstitialAd);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.FullScreenAd
    public final RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return new C05825x(this.A00.buildLoadAdConfig());
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.FullScreenAd
    public final RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder buildShowAdConfig() {
        return new C05835y(this.A00.buildShowAdConfig());
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    public final void destroy() {
        AbstractC0907Ju.A05(A00(ShapeTypes.FLOW_CHART_MANUAL_INPUT, 7, 88), A00(32, 34, 80), A00(24, 8, 121));
        this.A00.A04();
    }

    public final void finalize() {
        this.A00.finalize();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A00.getPlacementId();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final int getVideoDuration() {
        return this.A00.getVideoDuration();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        return this.A00.isAdInvalidated();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final boolean isAdLoaded() {
        return this.A00.isAdLoaded();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    public final void loadAd() {
        AbstractC0907Ju.A05(A00(148, 6, 49), A00(66, 39, 14), A00(0, 8, 33));
        this.A00.A07(null, AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL, true);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final void loadAd(RewardedInterstitialAd.RewardedInterstitialLoadAdConfig rewardedInterstitialLoadAdConfig) {
        ((C05825x) rewardedInterstitialLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th2) {
        this.A00.repair(th2);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A00.setExtraHints(extraHints);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        AbstractC0907Ju.A05(A00(ShapeTypes.FLOW_CHART_MAGNETIC_TAPE, 4, 24), A00(105, 36, 106), A00(16, 8, 27));
        return this.A00.A08(new AnonymousClass61().withAppOrientation(-1).build());
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final boolean show(RewardedInterstitialAd.RewardedInterstitialShowAdConfig rewardedInterstitialShowAdConfig) {
        AbstractC0907Ju.A05(A00(ShapeTypes.FLOW_CHART_MAGNETIC_TAPE, 4, 24), A00(105, 36, 106), A00(8, 8, 64));
        return this.A00.A08(((C05835y) rewardedInterstitialShowAdConfig).A00());
    }
}
