package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.internal.api.NativeAdsManagerApi;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.5o  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05735o implements NativeAdsManagerApi {
    public static String[] A0A = {"gDYqLx0JK9708AoJnxJgyKqjnvDR", "XqufOA6aif4bGdY", "Su6jQEbJiG4f8aKvZwQ5GnKoGxisXaGJ", "amq5QC2giq7rrMPed26NLD1vQWHXorDG", "da4TAb4G8iALXV3W79mvavYrQ", "laLk", "uFxB7CH2AwGOjVY1RRN9", "Lrv7"};
    public static final String A0B = NativeAdsManager.class.getSimpleName();
    public NativeAdsManager.Listener A01;
    public C1431bo A02;
    public String A03;
    public final int A06;
    public final C1314Zs A07;
    public final String A08;
    public final List<NativeAd> A09;
    public int A00 = -1;
    public boolean A04 = false;
    public boolean A05 = false;

    public C05735o(Context context, String str, int i10) {
        this.A07 = C05605b.A03(context);
        this.A08 = str;
        this.A06 = Math.max(i10, 0);
        this.A09 = new ArrayList(i10);
    }

    public final NativeAdsManager.Listener A00() {
        return this.A01;
    }

    public final C1431bo A01() {
        return this.A02;
    }

    public final void A02() {
        this.A09.clear();
    }

    public final void A03(int i10) {
        this.A00 = i10;
    }

    public final void A04(NativeAd nativeAd) {
        this.A09.add(nativeAd);
    }

    public final void A05(boolean z10) {
        this.A04 = z10;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void disableAutoRefresh() {
        this.A05 = true;
        if (this.A02 != null) {
            this.A02.A06();
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final int getUniqueNativeAdCount() {
        return this.A09.size();
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final boolean isLoaded() {
        return this.A04;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void loadAds() {
        loadAds(NativeAdBase.MediaCacheFlag.ALL);
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void loadAds(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        EnumC0898Jl enumC0898Jl = EnumC0898Jl.A06;
        int i10 = this.A06;
        C1431bo c1431bo = this.A02;
        this.A02 = new C1431bo(this.A07, this.A08, enumC0898Jl, null, i10);
        if (this.A05) {
            this.A02.A06();
        }
        this.A02.A09(this.A03);
        this.A02.A08(new C1337aF(this, this.A07, mediaCacheFlag));
        this.A02.A07();
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final NativeAd nextNativeAd() {
        return nextNativeAd(null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final NativeAd nextNativeAd(NativeAdListener nativeAdListener) {
        if (this.A09.size() == 0) {
            if (A0A[0].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[6] = "mJMTRUXqz4crzwTyllZM";
            strArr[4] = "KHUxr2V0BkfXxoUOzUh0cEJhB";
            return null;
        }
        int i10 = this.A00;
        this.A00 = i10 + 1;
        List<NativeAd> list = this.A09;
        int pos = this.A09.size();
        NativeAd nativeAd = list.get(i10 % pos);
        if (nativeAdListener != null) {
            ((W7) nativeAd.getInternalNativeAd()).A1T(nativeAd, nativeAdListener);
        }
        int pos2 = this.A09.size();
        if (i10 >= pos2) {
            return new NativeAd(this.A07, nativeAd);
        }
        return nativeAd;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void setExtraHints(String str) {
        this.A03 = str;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void setListener(NativeAdsManager.Listener listener) {
        this.A01 = listener;
    }
}
