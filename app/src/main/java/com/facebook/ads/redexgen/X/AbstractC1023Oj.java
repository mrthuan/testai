package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.Oj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1023Oj {
    public static byte[] A00;
    public static String[] A01 = {"e7juOHCMVCS96MucXvvyM5upzpE0CxcL", "6Axk6XM18YFtFlcC0tEdKqjogVlmemrm", "CHYE97fUe", "94l1C", "pvrd7E3JtMrEOvPAC3lcGaqqDdvc2Rnk", "mswd2ljSuB4EOxjza27Iz7krcpdQKmDN", "x2gmwPWroRNX0socjzMaFBH0Y3mBhUE3", "1dJrelJWCcDuEHtNsp3IaM8Oqex3ZZ7a"};

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-73, -32, 10, -73, -32, 5, 10, 11, -8, 5, 11, -73, -2, -8, 4, -4, 10, -73, -8, 3, 3, 6, 14, -4, -5, -47, -73, -121, -80, -38, -121, -80, -43, -38, -37, -56, -43, -37, -121, -50, -56, -44, -52, -38, -95, -121, -57, 14, 22, 22, 14, 19, 12, -57, 13, 8, 19, 19, 9, 8, 10, 18, -57, Field.NUMCHARS, 25, 19, -57, 8, 29, 8, 16, 19, 8, 9, 19, 12, -31, -57, Field.AUTOTEXT, -104, -94, -126, -93, -98, -95, -108, 105, Field.AUTOTEXT, Field.LISTNUM, -95, -9, -22, -27, -26, -16, -95, -10, -13, -19, -95, -22, -12, -95, -17, -10, -19, -19, -69, -95, 4, 16, 14, -49, 7, 2, 4, 6, 3, 16, 16, 12, -49, 12, 2, 21, 2, 15, 2, -42, -41, -46, -43, -56, -35, -34, -39, -36, -49, -55, -33, -36, -42, -55, -31, -49, -52, -55, -48, -53, -42, -42, -52, -53, -51, -43, -30, -43, -48, -47, -37, -53, -31, -34, -40};
        String[] strArr = A01;
        if (strArr[5].charAt(19) != strArr[7].charAt(19)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "ump74";
        strArr2[2] = "QJx5Vwz5z";
    }

    static {
        A02();
    }

    public static AbstractC1022Oi A00(C1026Om c1026Om, Bundle bundle, boolean z10) {
        AbstractC1022Oi uz;
        c1026Om.A05().A0G().A00(false);
        C1F A1P = c1026Om.A04().A1P();
        double A002 = AbstractC1019Of.A00(A1P);
        boolean isWatchAndBrowse = c1026Om.A04().A1P().A0P();
        boolean A06 = AbstractC1019Of.A06(c1026Om.A00(), c1026Om.A01(), A002);
        AbstractC04390h A003 = C04400i.A00(c1026Om.A05(), c1026Om.A06(), A01(0, 0, 8), L5.A00(c1026Om.A04().A1P().A0G().A05()), new HashMap(), c1026Om.A04().A1Q());
        boolean z11 = !TextUtils.isEmpty(A1P.A0E().A08());
        if (C0877Im.A1p(c1026Om.A05())) {
            C1314Zs A05 = c1026Om.A05();
            String[] strArr = A01;
            if (strArr[4].charAt(27) == strArr[6].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "oHCvC4ERmXYMU8sW9KKIPv7pnY2wXb01";
            strArr2[7] = "G3HUaMks2xBdg2z9mSbIts1gYwx1OgmU";
            A05.A0A().AHO(c1026Om.A02(), c1026Om.A04().A1U(), z11);
        }
        boolean A03 = A03(c1026Om, z11);
        if ((isWatchAndBrowse && (A003 instanceof GQ)) || A03) {
            uz = new UQ(c1026Om, A03);
        } else if (z11) {
            uz = new BX(c1026Om);
        } else if (!z11 && C0877Im.A2V(c1026Om.A05())) {
            uz = new BY(c1026Om, A06);
        } else if (A06) {
            uz = new C1172Uc(c1026Om, c1026Om.A00() == 2);
        } else {
            uz = new UZ(c1026Om, AbstractC1019Of.A04(A002));
        }
        if (z10) {
            uz.A10(A1P, c1026Om.A04().A1U(), A002, bundle);
        }
        return uz;
    }

    public static boolean A03(C1026Om c1026Om, boolean z10) {
        boolean z11 = false;
        if (c1026Om.A04().A1H() && z10) {
            Uri A002 = L5.A00(c1026Om.A04().A1P().A0G().A05());
            String authority = A002.getAuthority();
            if (TextUtils.isEmpty(authority)) {
                c1026Om.A05().A0E().AAf();
                return false;
            }
            boolean isInstantGamesEnabled = authority.equals(A01(128, 5, 58));
            boolean isInstantGames = A002.getQueryParameter(A01(ShapeTypes.FLOW_CHART_MAGNETIC_DISK, 9, 67)) == null;
            String queryParameter = A002.getQueryParameter(A01(ShapeTypes.FLOW_CHART_DECISION, 22, 65));
            boolean isGoogleFallBackUrlAvailable = !TextUtils.isEmpty(queryParameter) && queryParameter.contains(c1026Om.A04().A0d());
            boolean equals = c1026Om.A05().getPackageName().equals(A01(109, 19, 120));
            boolean A1I = c1026Om.A04().A1I();
            if (isInstantGamesEnabled && isInstantGames && isGoogleFallBackUrlAvailable && (!equals || A1I)) {
                z11 = true;
            }
            if (!z11 && Build.VERSION.SDK_INT >= 24) {
                c1026Om.A05().A0E().AAe(A01(78, 11, 6) + isInstantGamesEnabled + A01(89, 20, 88) + isInstantGames + A01(46, 32, 126) + isGoogleFallBackUrlAvailable + A01(27, 19, 62) + equals + A01(0, 27, 110) + A1I);
            }
            return z11;
        }
        return false;
    }
}
