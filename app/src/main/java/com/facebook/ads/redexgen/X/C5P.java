package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.5P  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5P implements AdViewApi {
    public static byte[] A0D;
    public static String[] A0E = {"8ZsaPqFHBksSubEDxj161z8v83o0PIqL", "1NWTdVv6N7aOqefGpQ3nVAkwh7f4QYaR", "Q4l1tys1ZSMgMj214694goNihNba6PJ2", "j8ts1um9VlgNYzePKTTbdrZm7P7LEYQS", "t56Pwr0qdwmiw03ThNEKvYWwkytCRLDg", "RREINDdqXCKFIVRasebbhTe", "edGRVZA6FwzGspMgtzkdHpprfoIdLjRD", "fNcadsm2hMDvYVzuw1qW3xw"};
    public long A00;
    public View A01;
    public AdListener A02;
    public C0800Fj A03;
    public O6 A04;
    public String A05;
    public String A06;
    public final DisplayMetrics A07;
    public final AdView A08;
    public final AdViewParentApi A09;
    public final C0783Ei A0A;
    public final EnumC0896Jj A0B;
    public final String A0C;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0D = new byte[]{-112, -110, -115, -61, -61, -109, -115, -66, -107, -58, -106, -110, -110, -102, -101, -103, 98, -109, -114, 97, -113, 100, 100, 101, -83, -52, -39, -39, -48, -35, -117, -52, -49, -117, -49, -48, -34, -33, -35, -38, -28, -48, -49, -35, -4, 9, 9, 0, 13, -69, -4, -1, -69, 7, 10, -4, -1, -69, 13, 0, 12, 16, 0, 14, 15, 0, -1, -35, -5, 8, 8, 9, 14, -70, 0, 3, 8, -2, -70, -5, -70, 14, -1, 7, 10, 6, -5, 14, -1, -70, 14, 2, -5, 14, -70, 6, 9, -5, -2, -70, -4, 3, -2, -70, -63, -65, 13, -63, -83, -80, -97, -75, -58, -79, -72, -71, -57, -56, -58, -61, -51, -62, -59, -73, -70, -105, -70};
    }

    static {
        A02();
    }

    public C5P(Context context, String str, AdSize adSize, AdViewParentApi adViewParentApi, AdView adView) {
        this.A00 = -1L;
        if (adSize != null && adSize != AdSize.INTERSTITIAL) {
            this.A07 = adView.getContext().getResources().getDisplayMetrics();
            this.A0B = LA.A04(adSize);
            this.A0C = str;
            this.A09 = adViewParentApi;
            this.A08 = adView;
            this.A0A = C05605b.A08(context);
            this.A0A.A0E().A3E(AdPlacementType.BANNER.toString(), str);
            C04761t c04761t = new C04761t(str, LA.A05(this.A0B), AdPlacementType.BANNER, LA.A04(adSize), 1, new C1424bh());
            c04761t.A06(this.A05);
            c04761t.A07(this.A06);
            this.A03 = new C0800Fj(this.A0A, c04761t);
            this.A03.A0R(new C1353aV(this));
            return;
        }
        throw new IllegalArgumentException(A01(108, 6, 37));
    }

    public C5P(Context context, String str, String str2, AdViewParentApi adViewParentApi, AdView adView) throws C0895Jh {
        this(context, str, A00(str2), adViewParentApi, adView);
        this.A0A.A0E().A49();
    }

    public static AdSize A00(String str) throws C0895Jh {
        EnumC0898Jl template = C0903Jq.A00(str);
        if (template != null) {
            C0903Jq.A03(template);
            return LA.A01(template);
        }
        throw new C0895Jh(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A01(67, 41, 115), str));
    }

    private void A03(String str) {
        this.A00 = System.currentTimeMillis();
        if (str == null) {
            this.A0A.A0E().A3B();
        } else {
            C0783Ei c0783Ei = this.A0A;
            if (A0E[1].charAt(22) == 'v') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[5] = "M5Y3D3mNGdfLR2WDul4k9MR";
            strArr[7] = "fol70tWokzFUGtpcuxJkkr6";
            c0783Ei.A0E().A3A();
        }
        C0800Fj c0800Fj = this.A03;
        String[] strArr2 = A0E;
        if (strArr2[2].charAt(21) == strArr2[3].charAt(21)) {
            throw new RuntimeException();
        }
        A0E[1] = "pe4oZgDQ3sTDNo8k5JxuPcj1mqE4f2TD";
        if (c0800Fj != null) {
            this.A03.A0V(str);
        }
        this.A0A.A0E().A39();
        if (A0E[1].charAt(22) != 'v') {
            A0E[1] = "D8Oc2vjooMbkdhwRsJFg2j6kNTTlIbDv";
        }
    }

    public final long A04() {
        return this.A00;
    }

    public final DisplayMetrics A05() {
        return this.A07;
    }

    public final AdListener A06() {
        return this.A02;
    }

    public final AdView A07() {
        return this.A08;
    }

    public final C0800Fj A08() {
        return this.A03;
    }

    public final C0783Ei A09() {
        return this.A0A;
    }

    public final EnumC0896Jj A0A() {
        return this.A0B;
    }

    public final void A0B(RelativeLayout relativeLayout, View view) {
        QS A01;
        this.A0A.A0E().A4M(this.A06 != null);
        if (this.A06 != null && (A01 = QR.A01(this.A0A, this.A06)) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            relativeLayout.addView(A01, new RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height));
        }
    }

    public final void A0C(AdListener adListener) {
        this.A0A.A0E().A37(adListener != null);
        this.A02 = adListener;
    }

    public final void A0D(O6 o62) {
        this.A04 = o62;
    }

    @Override // com.facebook.ads.internal.api.AdViewApi
    public final AdView.AdViewLoadConfigBuilder buildLoadAdConfig() {
        return new JL(this);
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        AbstractC0907Ju.A05(A01(114, 7, 45), A01(24, 19, 68), A01(16, 8, 6));
        this.A0A.A0E().A3F();
        if (this.A03 != null) {
            this.A03.A0X(true);
            this.A03.A0J();
            this.A03 = null;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            O6 o62 = this.A04;
            if (A0E[6].charAt(11) == 'y') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[2] = "TN5XSHsAoZcgZfma8JU5HEv6EkUhgjUJ";
            strArr[3] = "0EGaYiN0xr4bPRWWNOnd4RhBajl5vHs2";
            if (o62 != null) {
                AdView adView = this.A08;
                String[] strArr2 = A0E;
                if (strArr2[5].length() != strArr2[7].length()) {
                    throw new RuntimeException();
                }
                A0E[1] = "TnNHs1kiAbubcu5fNfkZcHChaOM3HmV2";
                if (C0877Im.A16(adView.getContext())) {
                    this.A04.A07();
                    if (this.A01 != null) {
                        this.A01.getOverlay().remove(this.A04);
                    }
                }
            }
        }
        this.A08.removeAllViews();
        this.A01 = null;
        this.A02 = null;
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A0C;
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean z10 = this.A03 == null || this.A03.A0Y();
        this.A0A.A0E().A5E(z10);
        return z10;
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        AbstractC0907Ju.A05(A01(121, 6, 47), A01(43, 24, 116), A01(0, 8, 54));
        A03(null);
    }

    @Override // com.facebook.ads.internal.api.AdViewApi
    public final void loadAd(AdView.AdViewLoadConfig adViewLoadConfig) {
        AbstractC0907Ju.A05(A01(121, 6, 47), A01(43, 24, 116), A01(8, 8, 59));
        A03(((JL) adViewLoadConfig).A00());
    }

    @Override // com.facebook.ads.internal.api.AdViewApi, com.facebook.ads.internal.api.AdViewParentApi
    public final void onConfigurationChanged(Configuration configuration) {
        this.A09.onConfigurationChanged(configuration);
        if (this.A01 != null) {
            AbstractC0900Jn.A01(this.A07, this.A01, this.A0B);
        }
    }

    @Override // com.facebook.ads.internal.api.AdViewApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A05 = extraHints.getHints();
        this.A06 = extraHints.getMediationData();
        if (C0877Im.A0i(this.A0A) && this.A03 != null) {
            this.A03.A08.A06(this.A05);
            this.A03.A08.A07(this.A06);
        }
    }
}
