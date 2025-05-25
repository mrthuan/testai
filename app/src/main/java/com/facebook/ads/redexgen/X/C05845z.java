package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.UUID;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.5z  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05845z implements RewardedVideoAdApi, Repairable {
    public static byte[] A04;
    public static String[] A05 = {"k8yEFjaDDmJNEMKVrce3vEWkKDhb9GrD", "5HJZEEaowyWiZ6x5JcW91LnqKILZK9iv", "JCdbC5zohUOjfclxz", "cbOkRGwJ0he66t85Zev39Ck1DLyP", "QnWh1EoQaEskbAIVlUx7Y0ywxM6b", "GMmjAnpO", "8CCIVLGxcMAoQXrfALv1hDyohO9DfryR", "UYxyoZ6BjjTfNK3ar4eEie7WMpDsFwCV"};
    public final com.facebook.ads.Ad A00;
    public final C1405bO A01;
    public final C0793Fc A02;
    public final C1314Zs A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 9);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{120, 124, 121, 122, Field.DDE, 122, 123, Field.NUMCHARS, 22, 30, 25, 76, Field.TOA, Field.TOA, Field.MERGESEQ, 101, 102, 48, Field.AUTONUMLGL, 96, 103, Field.IMPORT, 102, Field.GREETINGLINE, 121, 99, 114, 101, 121, 118, 123, Field.IMPORT, 114, 101, 101, 120, 101, Field.SYMBOL, 29, Field.GLOSSARY, 24, 10, Field.NUMCHARS, 15, 25, 24, 25, Field.ADDRESSBLOCK, 11, 20, 25, 24, 18, Field.ADDRESSBLOCK, Field.NUMCHARS, 25, Field.ADDRESSBLOCK, 25, 24, 14, 9, 15, 18, 4, 24, 25, 105, Field.GREETINGLINE, 76, Field.LISTNUM, Field.TOA, Field.SHAPE, Field.GREETINGLINE, Field.SHAPE, Field.NUMWORDS, 77, 82, Field.SHAPE, Field.GREETINGLINE, Field.ADVANCE, Field.NUMWORDS, Field.LISTNUM, Field.SHAPE, Field.NUMWORDS, Field.CONTROL, Field.ADVANCE, Field.LISTNUM, Field.SHAPE, Field.NUMWORDS, Field.TOA, Field.GREETINGLINE, 74, 78, Field.GREETINGLINE, Field.NOTEREF, Field.AUTOTEXT, Field.GREETINGLINE, Field.SHAPE, 59, 12, 30, 8, Field.NUMWORDS, 13, 12, 13, Field.TOA, 31, 0, 13, 12, 6, Field.TOA, 8, 13, Field.TOA, 26, 1, 6, 30, Field.TOA, 10, 8, 5, 5, 12, 13, 16, 64, 22, 16, Field.FORMCHECKBOX, 22, Field.INCLUDETEXT, Field.SECTIONPAGES, Field.INCLUDEPICTURE, Field.DOCPROPERTY, 82, Field.ADVANCE, Field.TOA, Field.SHAPE, Field.TOA, 74, Field.INCLUDETEXT, Field.SECTION, 100, Field.SECTION, 22, 13, 10, 18};
    }

    static {
        A01();
    }

    public C05845z(Context context, String str, com.facebook.ads.Ad ad2) {
        this.A00 = ad2;
        String uuid = UUID.randomUUID().toString();
        this.A03 = C05605b.A07(context, uuid);
        C0S A0E = this.A03.A0E();
        String adId = AdPlacementType.REWARDED_VIDEO.toString();
        A0E.A3E(adId, str);
        this.A01 = new C1405bO(this.A03, str, this.A00, new C1424bh());
        this.A03.A0N(this);
        this.A02 = new C0793Fc(this.A01, uuid);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    /* renamed from: A02 */
    public final AnonymousClass60 buildLoadAdConfig() {
        return new AnonymousClass60(this);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    /* renamed from: A03 */
    public final AnonymousClass61 buildShowAdConfig() {
        return new AnonymousClass61();
    }

    public final void A04() {
        if (C0877Im.A2B(this.A03)) {
            return;
        }
        this.A02.A08();
        this.A03.A0E().A3F();
    }

    public final void A05(RewardData rewardData) {
        this.A02.A0E(rewardData);
    }

    public final void A06(RewardedVideoAdListener rewardedVideoAdListener) {
        this.A01.A04 = rewardedVideoAdListener;
        this.A03.A0E().A37(rewardedVideoAdListener != null);
        String[] strArr = A05;
        if (strArr[1].charAt(24) != strArr[0].charAt(24)) {
            throw new RuntimeException();
        }
        A05[6] = "1SRpemADNZd8xb9i9fuLSYNF0AwY2Tu2";
    }

    public final void A07(String str, AdExperienceType adExperienceType, boolean z10) {
        if (str == null) {
            this.A03.A0E().A3B();
        } else {
            C1314Zs c1314Zs = this.A03;
            if (A05[6].charAt(25) == 'H') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[3] = "67CWYk6q7caxeYWX3cgidRuGJDEH";
            strArr[4] = "JzT9b8y5FiDfchRrDecE58hhFV9F";
            c1314Zs.A0E().A3A();
        }
        this.A02.A0D(this.A00, str, adExperienceType, z10);
        this.A03.A0E().A39();
    }

    public final boolean A08(RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        this.A03.A0E().A3K();
        boolean A0H = this.A02.A0H(this.A00, rewardedVideoShowAdConfig);
        this.A03.A0E().A3J(A0H);
        return A0H;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final void destroy() {
        AbstractC0907Ju.A05(A00(ShapeTypes.FLOW_CHART_INPUT_OUTPUT, 7, 47), A00(39, 27, 116), A00(ShapeTypes.VERTICAL_SCROLL, 7, 122));
        A04();
    }

    public final void finalize() {
        this.A02.A07();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A01.A0D;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final int getVideoDuration() {
        return this.A01.A00;
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean A0F = this.A02.A0F();
        this.A03.A0E().A5E(A0F);
        return A0F;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean isAdLoaded() {
        return this.A02.A0G();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final void loadAd() {
        AbstractC0907Ju.A05(A00(ShapeTypes.FLOW_CHART_MANUAL_INPUT, 6, 44), A00(66, 32, 50), A00(7, 8, 38));
        A07(null, null, true);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final void loadAd(RewardedVideoAd.RewardedVideoLoadAdConfig rewardedVideoLoadAdConfig) {
        ((AnonymousClass60) rewardedVideoLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th2) {
        if (this.A01.A04 != null) {
            this.A01.A04.onError(this.A00, new AdError(AdError.INTERNAL_ERROR_CODE, A00(23, 16, 30) + AbstractC0947Ll.A03(this.A01.A0B, th2)));
        }
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A01.A06 = extraHints.getHints();
        this.A01.A07 = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        AbstractC0907Ju.A05(A00(ShapeTypes.FLOW_CHART_OR, 4, 108), A00(98, 29, 96), A00(0, 7, 64));
        return A08(new AnonymousClass61().withAppOrientation(-1).build());
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean show(RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        AbstractC0907Ju.A05(A00(ShapeTypes.FLOW_CHART_OR, 4, 108), A00(98, 29, 96), A00(15, 8, 88));
        return A08(rewardedVideoShowAdConfig);
    }
}
