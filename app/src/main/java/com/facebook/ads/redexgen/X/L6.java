package com.facebook.ads.redexgen.X;

import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.RewardedVideoAd;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class L6 {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-92, -90, -103, -102, -77, -94, -87, -95, -77, -107, -104, -89, -77, -94, -93, -77, -105, -100, -107, -99, -94, -115, -117, -99, -115, -117, -114, -113, -114, -119, -117, -114, -68, -49, -53, -55, -72, -74, -69, -72, -53, -72, -15, -14, -9, -3, -4, -60, -59, -60, -71, -66, -73, -65, -60, -69, -70, -75, -73, -70, -55, -8, -6};
    }

    public static int A00(C1314Zs c1314Zs, int i10) {
        return KJ.A00(c1314Zs).getInt(A01(0, 21, 52), i10);
    }

    public static String A02(C1314Zs c1314Zs, String str) {
        int A002 = A00(c1314Zs, -1);
        if (A002 == -1) {
            return null;
        }
        try {
            return new ExtraHints.Builder().extraData(A03(str, A01(47, 14, 54), Integer.valueOf(A002))).build().getHints();
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String A03(String str, String str2, Object obj) throws JSONException {
        String A01 = A01(61, 2, 93);
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            String extraData = A01(42, 5, 105);
            JSONObject jSONObject2 = jSONObject.getJSONObject(extraData);
            String extraData2 = A01(32, 10, 55);
            A01 = jSONObject2.optString(extraData2, A01);
        }
        JSONObject jSONObject3 = new JSONObject(A01);
        jSONObject3.put(str2, obj);
        String extraData3 = jSONObject3.toString();
        return extraData3;
    }

    public static boolean A05(String str) throws JSONException {
        return str != null && new JSONObject(new JSONObject(str).getJSONObject(A01(42, 5, 105)).optString(A01(32, 10, 55), A01(61, 2, 93))).optBoolean(A01(21, 11, 10), false);
    }

    public final InterstitialAd A06(C1314Zs c1314Zs, String str, String str2) {
        if (c1314Zs == null) {
            return null;
        }
        try {
            InterstitialAd interstitialAd = new InterstitialAd(c1314Zs, str);
            interstitialAd.setExtraHints(new ExtraHints.Builder().extraData(A03(str2, A01(21, 11, 10), true)).build());
            return interstitialAd;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final RewardedVideoAd A07(C1314Zs c1314Zs, String str, String str2) {
        if (c1314Zs == null) {
            return null;
        }
        try {
            RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(c1314Zs, str);
            rewardedVideoAd.setExtraHints(new ExtraHints.Builder().extraData(A03(str2, A01(21, 11, 10), true)).build());
            return rewardedVideoAd;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void A08(C1314Zs c1314Zs, boolean z10) {
        int i10 = 0;
        String A01 = A01(0, 21, 52);
        if (!z10) {
            int lastNonChainedAds = KJ.A00(c1314Zs).getInt(A01, 0);
            i10 = lastNonChainedAds + 1;
        }
        KJ.A00(c1314Zs).edit().putInt(A01, i10).apply();
    }

    public final boolean A09(C1314Zs c1314Zs, String str, int i10) {
        if (i10 <= 0) {
            return false;
        }
        try {
            if (!A05(str)) {
                int lastNonChainedAds = A00(c1314Zs, i10 - 1);
                return lastNonChainedAds >= i10 + (-1);
            }
        } catch (JSONException unused) {
        }
        return false;
    }
}
