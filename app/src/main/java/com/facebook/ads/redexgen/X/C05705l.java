package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.internal.api.NativeAdScrollViewApi;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.5l  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05705l implements NativeAdScrollViewApi {
    public static byte[] A07;
    public static String[] A08 = {"nVlKDJKKuSIwTlTd16ukFrbX3MHjOHdA", "", "ICm0nIVybe3UlAuBnNKxRWg2mc3pSWnS", "", "SSXPkfr4Ttu5KI5IplEjDPNbu7CwAkh6", "a5Au6kTC9kTmWkoQnewo7jq8", "NRpBzWywFD0YlyTuhproyOYpEldGp2Hb", "m"};
    public final int A00;
    public final NativeAdScrollView.AdViewProvider A01;
    public final NativeAdView.Type A02;
    public final NativeAdViewAttributes A03;
    public final NativeAdsManager A04;
    public final C1341aJ A05;
    public final C1314Zs A06;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        byte[] bArr = {60, 4, 2, 5, Field.ADDIN, 1, 3, 30, 7, 24, 21, 20, Field.ADDIN, 16, Field.ADDIN, Field.BARCODE, 16, 5, 24, 7, 20, 48, 21, Field.FILLIN, 24, 20, 6, Field.SHAPE, Field.PAGEREF, 8, 1, 20, Field.ADDRESSBLOCK, Field.ADDIN, 48, 21, Field.FILLIN, 24, 20, 6, 33, 3, 30, 7, 24, 21, 20, 3, Field.ADDIN, 30, 3, Field.ADDIN, 16, Field.ADDIN, 31, 16, 5, 24, 7, 20, 48, 21, Field.FILLIN, 24, 20, 6, Field.SYMBOL, 20, 24, 22, 25, 5, Field.AUTONUMLGL, 1, Field.AUTONUMOUT, Field.NUMWORDS, 14, 19, 12, 31, 59, 30, 9, Field.IMPORT, Field.NUMWORDS, 20, Field.NUMWORDS, 29, 31, 8, Field.LISTNUM, 20, 21, 14, Field.LISTNUM, 22, 21, Field.NUMWORDS, 30, 31, 30};
        String[] strArr = A08;
        if (strArr[6].charAt(14) != strArr[0].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[2] = "Ml52sYoz4FZavAZNhfJ3fi3jnwDnZY4L";
        strArr2[4] = "tWqTcrLKFqppCUd7uCsjOJfAn0Jrdt0w";
        A07 = bArr;
    }

    static {
        A07();
    }

    public C05705l(NativeAdScrollView nativeAdScrollView, Context context, NativeAdsManager nativeAdsManager, NativeAdScrollView.AdViewProvider adViewProvider, int i10, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i11) {
        if (nativeAdsManager.isLoaded()) {
            if (type != null || adViewProvider != null || i10 > 0) {
                this.A06 = C05605b.A03(context);
                this.A04 = nativeAdsManager;
                this.A03 = nativeAdViewAttributes;
                this.A01 = adViewProvider;
                this.A02 = type;
                this.A00 = i11;
                C1342aK c1342aK = new C1342aK(this);
                this.A05 = new C1341aJ(context);
                if (this.A02 == null) {
                    if (i10 > 0) {
                        this.A05.A00(((int) LP.A02) * i10);
                    }
                } else {
                    this.A05.A00((int) (LP.A02 * this.A02.getHeight()));
                }
                this.A05.setAdapter(c1342aK);
                setInset(20);
                c1342aK.A09();
                nativeAdScrollView.addView(this.A05);
                return;
            }
            throw new IllegalArgumentException(A06(0, 74, 3));
        }
        throw new IllegalStateException(A06(74, 27, 8));
    }

    @Override // com.facebook.ads.internal.api.NativeAdScrollViewApi
    public final void setInset(int i10) {
        if (i10 > 0) {
            float f10 = LP.A02;
            float density = i10;
            int insetDp = Math.round(density * f10);
            this.A05.setPadding(insetDp, 0, insetDp, 0);
            float density2 = i10 / 2;
            this.A05.setPageMargin(Math.round(density2 * f10));
            this.A05.setClipToPadding(false);
        }
    }
}
