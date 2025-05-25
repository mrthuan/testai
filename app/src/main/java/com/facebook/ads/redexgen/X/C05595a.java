package com.facebook.ads.redexgen.X;

import android.content.Intent;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.5a  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05595a {
    public static byte[] A07;
    public static String[] A08 = {"WrVVpIlV0mVOOesXyJjac9RJgGDEsYiy", "55KqVxwk4ItPenJ0PbzoYHpl7VLiDDoF", "", "85Uc86a0UVsoWW8LIwye7frNycSrKuPv", "TRaam", "0wWSnm1p2XMm3vcxH", "", "BPzoua9RAnM56oYN7Gpf0cmvKga9OU"};
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final AudienceNetworkActivity A04;
    public final AudienceNetworkActivityApi A05;
    public final C1314Zs A06;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 82);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-78, -19, -7, -9, -72, -16, -21, -19, -17, -20, -7, -7, -11, -72, -21, -18, -3, -72, -21, -18, -4, -17, -6, -7, -4, -2, -13, -8, -15, -72, -48, -45, -40, -45, -35, -46, -23, -53, -50, -23, -36, -49, -38, -39, -36, -34, -45, -40, -47, -23, -48, -42, -39, -31, Field.NUMCHARS, Field.DATA, Field.ASK, -25, 31, 26, Field.NUMCHARS, 30, Field.NUMWORDS, Field.DATA, Field.DATA, 36, -25, 26, 29, 44, -25, 34, Field.FILLIN, Field.DDE, 30, 43, 44, Field.DDE, 34, Field.DDE, 34, 26, Field.PAGEREF, -25, 26, Field.NUMCHARS, Field.DDE, 34, Field.GLOSSARY, 34, Field.DDE, Field.GOTOBUTTON, 24, 29, 30, 44, Field.DDE, 43, Field.DATA, Field.GOTOBUTTON, 30, 29, 16, Field.NUMCHARS, 26, -37, 19, 14, 16, 18, 15, Field.NUMCHARS, Field.NUMCHARS, 24, -37, 14, 17, 32, -37, 22, Field.NUMWORDS, 33, 18, 31, 32, 33, 22, 33, 22, 14, 25, -37, 17, 22, 32, 26, 22, 32, 32, 18, 17, Field.DDEAUTO, 58, 56, -7, Field.EQ, 44, Field.DDEAUTO, 48, Field.DDE, 58, 58, Field.AUTONUM, -7, 44, Field.GLOSSARY, Field.USERADDRESS, -7, Field.AUTONUMOUT, Field.SYMBOL, Field.BARCODE, 48, 61, Field.USERADDRESS, Field.BARCODE, Field.AUTONUMOUT, Field.BARCODE, Field.AUTONUMOUT, 44, Field.IMPORT, -7, 48, 61, 61, 58, 61, -39, -27, -29, -92, -36, -41, -39, -37, -40, -27, -27, -31, -92, -41, -38, -23, -92, -33, -28, -22, -37, -24, -23, -22, -33, -22, -33, -41, -30, -92, -36, -33, -28, -33, -23, -34, -43, -41, -39, -22, -33, -20, -33, -22, -17, -4, 8, 6, -57, -1, -6, -4, -2, -5, 8, 8, 4, -57, -6, -3, 12, -57, 2, 7, 13, -2, 11, 12, 13, 2, 13, 2, -6, 5, -57, 2, 6, 9, 11, -2, 12, 12, 2, 8, 7, -57, 5, 8, 0, 0, -2, -3, 14, 31, 14, 23, 29};
    }

    static {
        A01();
    }

    public C05595a(AudienceNetworkActivityApi audienceNetworkActivityApi, C1314Zs c1314Zs, AudienceNetworkActivity audienceNetworkActivity) {
        this.A05 = audienceNetworkActivityApi;
        this.A06 = c1314Zs;
        this.A04 = audienceNetworkActivity;
    }

    private final void A02(boolean z10) {
        this.A03 = z10;
    }

    private final boolean A03(KG kg2) {
        if (kg2 != KG.A0H && kg2 != KG.A0G) {
            KG kg3 = KG.A08;
            String[] strArr = A08;
            if (strArr[3].charAt(18) == strArr[0].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[4] = "QK9lt";
            strArr2[5] = "71ldustRCfnIbk6ZF";
            if (kg2 != kg3 && kg2 != KG.A05 && kg2 != KG.A0F) {
                return false;
            }
        }
        return true;
    }

    public final void A04(KG kg2, String str) {
        boolean z10 = !this.A03 || C0877Im.A1t(this.A06);
        boolean shouldCallOnDestroy = this.A02;
        if (!shouldCallOnDestroy && z10) {
            boolean shouldCallOnDestroy2 = A03(kg2);
            if (shouldCallOnDestroy2) {
                A09(EnumC1087Qv.A03.A03(), str);
            } else {
                A09(A00(54, 48, 103), str);
            }
            this.A02 = true;
        }
    }

    public final void A05(KG kg2, String str) {
        if (A03(kg2)) {
            A09(EnumC1087Qv.A09.A03(), str);
        } else {
            A09(A00(ShapeTypes.FLOW_CHART_MANUAL_INPUT, 35, 121), str);
        }
    }

    public final void A06(KG kg2, String str) {
        if (A03(kg2)) {
            A09(EnumC1087Qv.A05.A03(), str);
        } else {
            A09(A00(102, 39, 91), str);
        }
        A02(true);
        A04(kg2, str);
    }

    public final void A07(KG kg2, String str) {
        if (C0877Im.A1n(this.A06) && !this.A01 && !this.A00) {
            C0S A0E = this.A06.A0E();
            String[] strArr = A08;
            if (strArr[3].charAt(18) == strArr[0].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "ERQ6CJuvlb3tCwq1OYCzpUpdhNPz9IsE";
            strArr2[0] = "fdli8mgwNbZyMwMFsZ54k8DyiigEG2Sx";
            A0E.AAx();
            A05(kg2, str);
        }
    }

    public final void A08(String str, C06468v c06468v, String str2) {
        Intent intent = new Intent(str + A00(0, 1, 38) + str2);
        if (c06468v != null) {
            intent.putExtra(A00(268, 5, 87), c06468v);
        }
        C04972o.A00(this.A04).A07(intent);
    }

    public final void A09(String str, String str2) {
        if (A00(221, 47, 71).equals(str) || EnumC1087Qv.A0A.A03().equals(str)) {
            this.A01 = true;
        }
        boolean equals = A00(ShapeTypes.FLOW_CHART_MANUAL_INPUT, 35, 121).equals(str);
        if (A08[7].length() == 29) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[3] = "q8Yu3i76ZTlYqxP4qtQeXX4gnui9AJbb";
        strArr[0] = "UYbwc2QJiguNdyXAgiRTefqPyIZvniQg";
        if (equals || EnumC1087Qv.A09.A03().equals(str)) {
            this.A00 = true;
        }
        if (A00(1, 53, 56).equals(str)) {
            this.A05.finish(9);
        } else if (A00(ShapeTypes.MATH_PLUS, 45, 36).equals(str)) {
            this.A05.finish(10);
        } else {
            A08(str, null, str2);
        }
    }
}
