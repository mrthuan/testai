package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;

/* renamed from: com.facebook.ads.redexgen.X.Fc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0793Fc extends AbstractC1425bi {
    public static String[] A02 = {"eAQfPHHoyWilLfBxOFaJj1G06pGOxPq", "94FVrmFRVghPmyms9ar5cFWRdDurlkVe", "0NqQX4CUu3LD8PHaDMvmRAbh4clEtoM7", "DpSRaNejvtQ52XA7I6oeLqqk6ldlwRKU", "AVeirdKHq7BiC91JmOFjEM59wAwHTkmS", "1THCMBeh6DIPctxeAaB65wntvUu4aFha", "yEsJBiLTEnojRHdtAiiv5fZXbmAhiMSc", "YuG6RWvr5fcVmyx3SnaQUPOafyGz2fG"};
    public C1415bY A00;
    public final C1405bO A01;

    public C0793Fc(C1405bO c1405bO, String str) {
        super(c1405bO.A0B, str, A00(c1405bO));
        this.A01 = c1405bO;
    }

    public static C1404bN A00(C1405bO c1405bO) {
        return new C1404bN(c1405bO);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1425bi
    public final void A08() {
        if (super.A01.A01) {
            this.A05.A5S();
        }
        if (this.A00 != null) {
            this.A00.destroy();
        }
        super.A00.AGM(EnumC04821z.A03);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1425bi
    public final void A09() {
        this.A00 = new C1415bY(this.A01, this, A04());
        this.A00.A0J(this.A01.A05, this.A01.A02, this.A01.A08);
    }

    public final void A0D(com.facebook.ads.Ad ad2, String str, AdExperienceType adExperienceType, boolean z10) {
        if (super.A00.A5z()) {
            return;
        }
        this.A01.A02(ad2);
        if (this.A00 != null) {
            this.A00.A0J(str, adExperienceType, z10);
            return;
        }
        this.A01.A05 = str;
        this.A01.A02 = adExperienceType;
        this.A01.A08 = z10;
        if (AbstractC0879Ip.A07(this.A02) && AbstractC0879Ip.A09(this.A02)) {
            A05();
        } else {
            A09();
        }
    }

    public final void A0E(RewardData rewardData) {
        this.A01.A03 = rewardData;
        if (super.A01.A01) {
            super.A01.A0F(AdError.INTERNAL_ERROR_2003, C2K.A00(new Bundle(), rewardData));
        } else if (this.A00 != null) {
            this.A00.A0I(rewardData);
        }
    }

    public final boolean A0F() {
        if (this.A00 != null) {
            return this.A00.A0K();
        }
        return this.A01.A01 > 0 && C0956Lu.A00() > this.A01.A01;
    }

    public final boolean A0G() {
        if (this.A00 != null) {
            return this.A00.A0L();
        }
        return super.A00.A6J() == EnumC04821z.A05;
    }

    public final boolean A0H(com.facebook.ads.Ad ad2, RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        int A00 = ((AnonymousClass61) rewardedVideoShowAdConfig).A00();
        long A01 = ((AnonymousClass61) rewardedVideoShowAdConfig).A01();
        if (super.A00.A60()) {
            return false;
        }
        this.A01.A02(ad2);
        String[] strArr = A02;
        String str = strArr[7];
        String str2 = strArr[0];
        int length = str.length();
        int appOrientation = str2.length();
        if (length == appOrientation) {
            String[] strArr2 = A02;
            strArr2[5] = "m9KaRECdYgffkM0tCirP5ynC5R03VfN7";
            strArr2[6] = "WVyWW47u948M29zNqYDy5rdzHxlGG88k";
            if (super.A01.A01) {
                A0A(A00);
                return true;
            }
            C1415bY c1415bY = this.A00;
            String[] strArr3 = A02;
            String str3 = strArr3[2];
            String str4 = strArr3[1];
            int charAt = str3.charAt(27);
            int appOrientation2 = str4.charAt(27);
            if (charAt != appOrientation2) {
                String[] strArr4 = A02;
                strArr4[7] = "SVQKcBS7FHKRAHC3EplGepZBNeGcwFJ";
                strArr4[0] = "IfCkczTPSOxE6DmqSLPQVuiWAstWVdL";
                if (c1415bY != null) {
                    return this.A00.A0M(A00, A01);
                }
                this.A00 = new C1415bY(this.A01, this, A04());
                this.A00.A0M(A00, A01);
                return false;
            }
        }
        throw new RuntimeException();
    }
}
