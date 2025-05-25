package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.AdSettings;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.2J  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C2J {
    public static byte[] A00;
    public static String[] A01 = {"alBbxktHBjENZciLxR6rw2zD", "0bEVAsoxw6W3iWGX6BxBwig2lvfARzA8", "5kBw8VexBy79GKA0j07dIkKJ", "062DxPuwmCK6gWRcItF5YTW3Hm4KDyy6", "ouexH0ba", "qAJVUQLE", "GBKgEyO20ouPxSasMb", "BGZyEH20hLZ9tDha5NwFDNnmUBWPcH0M"};

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[3].charAt(0) != strArr[1].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "tBRy7z9w";
            strArr2[4] = "5uJXeywj";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 69);
            i13++;
        }
    }

    public static void A07() {
        A00 = new byte[]{-32, -40, -37, -30, -40, -38, -2, 11, 11, 8, Field.NUMWORDS, 1, 20, 12, 8, 5, -1, 5, 16, Field.NUMWORDS, 16, 1, 15, 16, Field.NUMWORDS, 9, 11, 0, 1, Field.NUMWORDS, 7, 1, 21, -66, -53, -53, -56, -37, -59, -49, -37, -62, -47, -54, -54, -63, -56, -37, -56, -53, -61, -61, -63, -64, -119, -106, -106, -109, -90, -112, -102, -90, -100, -107, -112, -101, -96, -56, -43, -43, -46, -27, -45, -49, -34, -53, -54, -27, -57, -37, -54, -49, -53, -44, -55, -53, -27, -47, -53, -33, -94, -81, -81, -84, -65, -78, -74, -65, -90, -95, -87, -84, -65, -81, -82, -65, -93, -95, -93, -88, -91, -65, -90, -95, -87, -84, -75, -78, -91, -65, -85, -91, -71, -40, -21, -28, -38, -30, -37, -11, -23, -37, -22, -22, -33, -28, -35, -23, -11, -31, -37, -17, -40, -43, -24, -43, -13, -28, -26, -29, -41, -39, -25, -25, -35, -30, -37, -13, -29, -28, -24, -35, -29, -30, -25, -13, -41, -29, -23, -30, -24, -26, -19, -13, -33, -39, -19, -64, -67, -48, -67, -37, -52, -50, -53, -65, -63, -49, -49, -59, -54, -61, -37, -53, -52, -48, -59, -53, -54, -49, -37, -57, -63, -43, -7, -10, 9, -10, 20, 5, 7, 4, -8, -6, 8, 8, -2, 3, -4, 20, 4, 5, 9, -2, 4, 3, 8, 20, 8, 9, -10, 9, -6, 20, 0, -6, 14, -80, -79, -81, -68, -98, -95, -68, -94, -75, -83, -94, -81, -90, -94, -85, -96, -94, -68, -79, -74, -83, -94, -28, -27, -29, -16, -46, -43, -16, -38, -43, -16, -36, -42, -22, 16, 17, 15, Field.NUMCHARS, -2, 1, Field.NUMCHARS, 17, 2, 16, 17, Field.NUMCHARS, 17, 22, 13, 2, Field.NUMCHARS, 8, 2, 22, -86, -85, -87, -74, -103, -96, -101, -74, -89, -104, -80, -93, -90, -104, -101, -74, -94, -100, -80, -53, -52, -54, -41, -70, -52, -41, -52, -57, -61, -67, -58, -41, -67, -48, -52, -54, -71, -53, -74, -73, -75, -62, -90, -81, -84, -88, -79, -73, -62, -74, -89, -82, -62, -71, -88, -75, -74, -84, -78, -79, -8, -7, -9, 4, -22, -3, -7, -9, -26, 4, -19, -18, -13, -7, -8, 4, -16, -22, -2, -104, -103, -105, -92, -114, -109, -103, -92, -120, -122, -120, -115, -118, -92, -117, -111, -122, -116, -104, -8, -7, -9, 4, -14, -22, -23, -18, -26, -7, -18, -12, -13, 4, -23, -26, -7, -26, 4, -16, -22, -2, -6, -5, -7, 6, -12, -20, -21, -16, -24, -5, -16, -10, -11, 6, -6, -20, -7, -3, -16, -22, -20, 6, -14, -20, 0, -39, -38, -40, -27, -42, -46, -57, -55, -53, -45, -53, -44, -38, -27, -47, -53, -33};
    }

    static {
        A07();
    }

    public static Bundle A00(C7j c7j) {
        Bundle bundle = new Bundle();
        A08(bundle, c7j);
        String A06 = A06(123, 19, 81);
        Bundle data = A01(c7j);
        bundle.putBundle(A06, data);
        return bundle;
    }

    public static Bundle A01(C7j c7j) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(A06(67, 23, 65), AdSettings.isMixedAudience());
        bundle.putBoolean(A06(6, 27, 119), AdInternalSettings.isExplicitTestMode());
        String adTypeString = AdSettings.getTestAdType().getAdTypeString();
        if (adTypeString != null) {
            bundle.putString(A06(272, 20, 120), adTypeString);
        }
        MultithreadedBundleWrapper multithreadedBundleWrapper = AdInternalSettings.sSettingsBundle;
        String adTypeString2 = A06(ShapeTypes.MATH_MINUS, 27, 55);
        String[] stringArray = multithreadedBundleWrapper.getStringArray(adTypeString2);
        if (stringArray != null) {
            bundle.putStringArray(adTypeString2, stringArray);
        }
        MultithreadedBundleWrapper multithreadedBundleWrapper2 = AdInternalSettings.sSettingsBundle;
        String adTypeString3 = A06(ShapeTypes.FLOW_CHART_MANUAL_OPERATION, 35, 79);
        Integer integer = multithreadedBundleWrapper2.getInteger(adTypeString3);
        if (integer != null) {
            bundle.putInt(adTypeString3, integer.intValue());
        }
        MultithreadedBundleWrapper multithreadedBundleWrapper3 = AdInternalSettings.sSettingsBundle;
        String adTypeString4 = A06(204, 33, 112);
        Integer integer2 = multithreadedBundleWrapper3.getInteger(adTypeString4);
        if (integer2 != null) {
            bundle.putInt(adTypeString4, integer2.intValue());
        }
        MultithreadedBundleWrapper multithreadedBundleWrapper4 = AdInternalSettings.sSettingsBundle;
        String adTypeString5 = A06(TTAdConstant.IMAGE_URL_CODE, 25, 98);
        String string = multithreadedBundleWrapper4.getString(adTypeString5, null);
        if (string != null) {
            bundle.putString(adTypeString5, string);
        }
        bundle.putBoolean(A06(54, 13, 2), LQ.A05(c7j));
        return bundle;
    }

    public static Bundle A02(String str, C1414bX c1414bX) {
        Bundle bundle = new Bundle();
        A08(bundle, c1414bX.A05());
        bundle.putString(A06(437, 17, 65), c1414bX.A0A());
        bundle.putString(A06(259, 13, 76), str);
        bundle.putString(A06(292, 19, 18), c1414bX.A07());
        bundle.putString(A06(352, 19, 96), c1414bX.A08());
        bundle.putString(A06(390, 22, 96), c1414bX.A09());
        bundle.putString(A06(371, 19, 0), C2F.A01(c1414bX.A0B()));
        RewardData A03 = c1414bX.A03();
        if (A03 != null) {
            C2K.A00(bundle, A03);
        }
        C1314Zs A05 = c1414bX.A05();
        if (A01[7].charAt(1) != 'G') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "0oVBtG1RnxV7P3aL2rsTsgmpFLriyJEV";
        strArr[1] = "0Gc5rqVWsYOknMrZ8UJ0maJdrGSSYWXy";
        bundle.putBundle(A06(123, 19, 81), A01(A05));
        return bundle;
    }

    public static Bundle A03(String str, C1405bO c1405bO) {
        Bundle bundle = new Bundle();
        A08(bundle, c1405bO.A0B);
        bundle.putString(A06(437, 17, 65), c1405bO.A0D);
        bundle.putString(A06(259, 13, 76), str);
        bundle.putString(A06(292, 19, 18), c1405bO.A05);
        bundle.putString(A06(352, 19, 96), c1405bO.A06);
        bundle.putString(A06(390, 22, 96), c1405bO.A07);
        AdExperienceType adExperienceType = c1405bO.A02;
        if (adExperienceType != null) {
            bundle.putString(A06(237, 22, 24), C2E.A02(adExperienceType));
        }
        bundle.putBoolean(A06(90, 33, 27), c1405bO.A08);
        RewardData rewardData = c1405bO.A03;
        if (rewardData != null) {
            C2K.A00(bundle, rewardData);
        }
        bundle.putBundle(A06(123, 19, 81), A01(c1405bO.A0B));
        return bundle;
    }

    public static C1414bX A04(C1314Zs c1314Zs, Bundle bundle, String str) {
        String string = bundle.getString(A06(437, 17, 65));
        String placement = A06(292, 19, 18);
        String string2 = bundle.getString(placement);
        String placement2 = A06(352, 19, 96);
        String string3 = bundle.getString(placement2);
        String placement3 = A06(390, 22, 96);
        String sdkVersion = bundle.getString(placement3);
        String placement4 = A06(330, 22, 30);
        String string4 = bundle.getString(placement4);
        String placement5 = A06(123, 19, 81);
        Bundle bundle2 = bundle.getBundle(placement5);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (string == null) {
            string = A06(0, 0, 60);
        }
        C1414bX c1414bX = new C1414bX(c1314Zs, null, string, new C1409bS(str, string4, bundle2));
        c1414bX.A0I(string3);
        c1414bX.A0H(string2);
        c1414bX.A0J(sdkVersion);
        String placement6 = A06(371, 19, 0);
        c1414bX.A0K(C2F.A02(bundle.getString(placement6)));
        RewardData A012 = C2K.A01(bundle);
        if (A012 != null) {
            c1414bX.A0F(A012);
        }
        return c1414bX;
    }

    public static C1405bO A05(C1314Zs c1314Zs, Bundle bundle, String str) {
        String string = bundle.getString(A06(437, 17, 65));
        String rvPlacement = A06(292, 19, 18);
        String string2 = bundle.getString(rvPlacement);
        String rvPlacement2 = A06(90, 33, 27);
        boolean z10 = bundle.getBoolean(rvPlacement2);
        String rvPlacement3 = A06(352, 19, 96);
        String adExperienceType = bundle.getString(rvPlacement3);
        String rvPlacement4 = A06(390, 22, 96);
        String mediationData = bundle.getString(rvPlacement4);
        String rvPlacement5 = A06(237, 22, 24);
        String string3 = bundle.getString(rvPlacement5);
        String rvPlacement6 = A06(330, 22, 30);
        String string4 = bundle.getString(rvPlacement6);
        String rvPlacement7 = A06(123, 19, 81);
        Bundle bundle2 = bundle.getBundle(rvPlacement7);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (string == null) {
            string = A06(0, 0, 60);
        }
        C1405bO c1405bO = new C1405bO(c1314Zs, string, null, new C1409bS(str, string4, bundle2));
        c1405bO.A06 = adExperienceType;
        c1405bO.A05 = string2;
        c1405bO.A08 = z10;
        c1405bO.A02 = C2E.A00(string3);
        c1405bO.A07 = mediationData;
        RewardData A012 = C2K.A01(bundle);
        if (A012 != null) {
            c1405bO.A03 = A012;
        }
        return c1405bO;
    }

    public static void A08(Bundle bundle, C7j c7j) {
        bundle.putString(A06(330, 22, 30), A06(0, 6, 101));
        bundle.putBoolean(A06(33, 21, 55), AnonymousClass88.A0I(c7j));
        if (AbstractC0879Ip.A0C(c7j)) {
            String A03 = new C6V().A03(c7j);
            String bidderTokenExtras = A06(311, 19, 51);
            bundle.putString(bidderTokenExtras, A03);
        }
    }
}
