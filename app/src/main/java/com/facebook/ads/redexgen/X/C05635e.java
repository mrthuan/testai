package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedAdListener;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.UUID;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.5e  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05635e implements InterstitialAdApi, Repairable {
    public static byte[] A04;
    public final InterstitialAd A00;
    public final C1414bX A01;
    public final C0794Fd A02;
    public final C1314Zs A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 122);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-64, -65, -61, -15, -62, -12, -63, -58, -28, -22, 20, -27, -22, -27, -24, 21, -39, 9, 9, 6, -36, -40, -38, 10, 2, Field.FILLIN, Field.DDE, 30, 43, Field.FILLIN, 26, Field.PAGEREF, -39, 30, 43, 43, Field.DATA, 43, -25, -61, 44, Field.ADDIN, Field.CONTROL, Field.NOTEREF, Field.DOCPROPERTY, 86, Field.CONTROL, 76, Field.CONTROL, 76, Field.INCLUDETEXT, Field.AUTOTEXT, 3, Field.INCLUDETEXT, Field.FORMCHECKBOX, 3, Field.FORMCHECKBOX, Field.NOTEREF, 86, Field.CONTROL, Field.DOCPROPERTY, 82, Field.BIDIOUTLINE, Field.NOTEREF, Field.FORMCHECKBOX, Field.GOTOBUTTON, Field.CONTROL, Field.ADDRESSBLOCK, 78, Field.HTMLCONTROL, Field.BIDIOUTLINE, Field.ADDRESSBLOCK, 82, Field.ADDRESSBLOCK, 82, 74, Field.DOCPROPERTY, 9, 74, 77, 9, Field.DOCPROPERTY, Field.HYPERLINK, 74, 77, 9, Field.HTMLCONTROL, 78, Field.LISTNUM, Field.GREETINGLINE, 78, Field.BIDIOUTLINE, Field.ADDRESSBLOCK, 78, 77, Field.FILLIN, 76, 82, Field.INCLUDEPICTURE, 80, Field.ADDIN, 82, Field.FORMCHECKBOX, 82, Field.FORMCHECKBOX, Field.BARCODE, 74, -2, Field.BARCODE, Field.SECTIONPAGES, -2, Field.ADDIN, Field.FORMTEXT, 77, Field.DOCPROPERTY, -2, Field.SECTION, Field.BARCODE, 74, 74, Field.INCLUDEPICTURE, Field.SECTIONPAGES, -13, -12, 2, 3, 1, -2, 8, Field.HYPERLINK, 99, 64, 99, Field.DOCPROPERTY, Field.HYPERLINK, Field.AUTONUMLGL, Field.HYPERLINK, -8, -19, -12, -4};
    }

    public C05635e(Context context, String str, InterstitialAd interstitialAd) {
        this.A00 = interstitialAd;
        String uuid = UUID.randomUUID().toString();
        this.A03 = C05605b.A06(context, uuid);
        C0S A0E = this.A03.A0E();
        String adId = AdPlacementType.INTERSTITIAL.toString();
        A0E.A3E(adId, str);
        this.A01 = new C1414bX(this.A03, interstitialAd, str);
        this.A03.A0N(this);
        this.A02 = new C0794Fd(this.A01, uuid);
    }

    public final void A02(InterstitialAdListener interstitialAdListener) {
        this.A03.A0E().A37(interstitialAdListener != null);
        this.A01.A0E(interstitialAdListener);
    }

    public final void A03(RewardData rewardData) {
        this.A02.A0E(rewardData);
    }

    public final void A04(RewardedAdListener rewardedAdListener) {
        this.A01.A0G(rewardedAdListener);
    }

    public final void A05(EnumSet<CacheFlag> enumSet, String str) {
        AbstractC0907Ju.A05(A00(129, 8, 122), A00(65, 30, 111), A00(16, 8, 42));
        if (str == null) {
            this.A03.A0E().A3B();
        } else {
            this.A03.A0E().A3A();
        }
        this.A02.A0D(this.A00, enumSet, str);
        this.A03.A0E().A39();
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final InterstitialAd.InterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return new C05645f(this);
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final InterstitialAd.InterstitialAdShowConfigBuilder buildShowAdConfig() {
        return new C05655g();
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        AbstractC0907Ju.A05(A00(122, 7, 21), A00(40, 25, 105), A00(8, 8, 56));
        if (C0877Im.A2B(this.A03)) {
            return;
        }
        this.A02.A08();
        this.A03.A0E().A3F();
    }

    public final void finalize() {
        this.A02.A07();
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A01.A0A();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean A0F = this.A02.A0F();
        this.A03.A0E().A5E(A0F);
        return A0F;
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final boolean isAdLoaded() {
        return this.A02.A0G();
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        A05(CacheFlag.ALL, null);
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final void loadAd(InterstitialAd.InterstitialLoadAdConfig interstitialLoadAdConfig) {
        ((C05645f) interstitialLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th2) {
        if (this.A01.A6I() != null) {
            this.A01.A6I().onError(this.A00, new AdError(AdError.INTERNAL_ERROR_CODE, A00(24, 16, 63) + AbstractC0947Ll.A03(this.A03, th2)));
        }
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A01.A0I(extraHints.getHints());
        this.A01.A0J(extraHints.getMediationData());
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        AbstractC0907Ju.A05(A00(ShapeTypes.FLOW_CHART_DOCUMENT, 4, 11), A00(95, 27, 100), A00(0, 8, 21));
        this.A03.A0E().A3K();
        boolean A0H = this.A02.A0H(this.A00, new C05655g());
        this.A03.A0E().A3J(A0H);
        return A0H;
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final boolean show(InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        this.A03.A0E().A3K();
        boolean A0H = this.A02.A0H(this.A00, interstitialShowAdConfig);
        this.A03.A0E().A3J(A0H);
        return A0H;
    }
}
