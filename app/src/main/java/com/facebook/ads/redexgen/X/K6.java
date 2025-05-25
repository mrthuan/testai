package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public final class K6 {
    public static byte[] A0C;
    public static String[] A0D = {"u7auSF2QbA7keT455OtLfVATNnMuonV2", "9Ni6xyVwZaeKacoBimRjslH6Dei", "NGE2fLmKrMN6Gw2Fz9z7jAXvyfAydpGl", "srT3S5MN", "jMoNZ8Vk", "oZZQeSbHWWSZcPAQallJMC7N5h2", "GNfhbJ55AYf3nQ2lY9fIFOrmofPjrLRg", "qccEv4BxkjzqCatZiOtTgryF8DF84JXr"};
    public int A00;
    public C7j A01;
    public EnumC0898Jl A02;
    public C0941Lf A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public final InterfaceC06288d A09;
    public final AdPlacementType A0A;
    public final C0903Jq A0B;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0C = new byte[]{-34, -95, -105, -102, -75, -101, -82, -90, -101, -88, -97, -101, -92, -103, -101, -75, -86, -81, -90, -101, -52, -49, -22, -35, -48, -37, -38, -35, -33, -44, -39, -46, -22, -50, -38, -39, -47, -44, -46, -22, -41, -52, -34, -33, -22, -32, -37, -49, -52, -33, -48, -22, -33, -44, -40, -48, 11, 18, 13, Field.DATA, 18, 13, -29, -22, -27, 0, -11, -22, -18, -26, 0, -11, -16, -20, -26, -17, -105, -96, -99, -103, -94, -88, -77, -90, -103, -91, -87, -103, -89, -88, -77, -99, -104, -109, -97, -96, -96, -111, -59, -58, -50, -48, -32, -62, -59, -32, -54, -59, -74, -55, -59, -61, -78, -48, -71, -70, -65, -59, -60, -9, -12, -8, -10, -9, 3, -74, -79, -77, -82, -54, -59, -57, -62, -32, -57, -51, -62, -56, -92, -82, -70, -88, -80, -89, -81, -92, -70, -100, -97, -70, -96, -77, -85, -96, -83, -92, -96, -87, -98, -96, 4, 0, 24, 11, -2, 12, 13, 11, 2, -4, 13, -2, -3, -34, -45, -27, -26, -15, -27, -45, -24, -41, -42, -15, -34, -31, -43, -45, -34, -41, -28, -21, -29, -11, -41, -38, -23, -11, -24, -37, -25, -21, -37, -23, -22, -37, -38, -77, -81, -92, -90, -88, -80, -88, -79, -73, -62, -84, -89, -50, -54, -65, -63, -61, -53, -61, -52, -46, -35, -46, -41, -50, -61, 21, 8, 20, 24, 8, 22, 23, 34, 23, 12, 16, 8, -4, -3, -22, -20, -12, 8, -3, -5, -22, -20, -18, -7, -22, -14, -11, -15, -26, -7, -22, 4, -18, -23, -58, -73, -59, -58, -47, -65, -63, -74, -73, -13, -27, -32, -16, -28};
    }

    static {
        A02();
    }

    public K6(C7j c7j, String str, C0941Lf c0941Lf, EnumC0898Jl enumC0898Jl, int i10, C0903Jq c0903Jq, String str2, String str3, String str4, InterfaceC06288d interfaceC06288d) {
        this.A01 = c7j;
        this.A06 = str;
        this.A03 = c0941Lf;
        this.A02 = enumC0898Jl;
        this.A00 = i10;
        this.A0B = c0903Jq;
        this.A0A = enumC0898Jl.A05(this.A01);
        this.A07 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A09 = interfaceC06288d;
    }

    private long A00() {
        SharedPreferences A00 = KJ.A00(this.A01);
        String A01 = A01(0, 0, 79);
        String A012 = A01(ShapeTypes.GEAR_6, 17, 68);
        String lastSavedLocale = A00.getString(A012, A01);
        if (lastSavedLocale == null) {
            return 0L;
        }
        if (lastSavedLocale.equals(Locale.getDefault().toString())) {
            return C2T.A00(this.A01.A01()).A09();
        }
        A00.edit().putString(A012, Locale.getDefault().toString()).apply();
        return 0L;
    }

    private void A03(Map<String, String> params, String str, String str2) {
        params.put(str, str2);
    }

    public final int A04() {
        return this.A00;
    }

    public final InterfaceC06288d A05() {
        return this.A09;
    }

    public final AdPlacementType A06() {
        return this.A0A;
    }

    public final EnumC0898Jl A07() {
        return this.A02;
    }

    public final C0941Lf A08() {
        return this.A03;
    }

    public final String A09() {
        return this.A06;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0155, code lost:
        if (r4.A8V() != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0157, code lost:
        A03(r3, A01(98, 10, 51), r8.A09.A8V());
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x016c, code lost:
        if (r8.A00 == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x016e, code lost:
        A03(r3, A01(190, 17, 72), java.lang.String.valueOf(r8.A00));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0181, code lost:
        r4 = r8.A08;
        r2 = com.facebook.ads.redexgen.X.K6.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0193, code lost:
        if (r2[1].length() == r2[5].length()) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0195, code lost:
        if (r4 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0197, code lost:
        A03(r3, A01(lib.zj.office.fc.ss.usermodel.ShapeTypes.FLOW_CHART_MULTIDOCUMENT, 22, 13), java.lang.String.valueOf(r8.A08));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01aa, code lost:
        A03(r3, A01(160, 13, 107), java.lang.String.valueOf(com.facebook.ads.redexgen.X.M4.A02(r8.A01)));
        A03(r3, A01(lib.zj.office.fc.hssf.record.UnknownRecord.BITMAP_00E9, 12, 117), com.facebook.ads.redexgen.X.C0956Lu.A05(java.lang.System.currentTimeMillis()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01dc, code lost:
        if (r8.A0B.A06() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01e4, code lost:
        if (r8.A0B.A04() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01e6, code lost:
        A03(r3, A01(56, 6, 123), r8.A0B.A04());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01f8, code lost:
        r4 = r8.A0B.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0202, code lost:
        if (android.text.TextUtils.isEmpty(r4) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0204, code lost:
        A03(r3, A01(62, 14, 83), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0213, code lost:
        if (r8.A07 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0215, code lost:
        A03(r3, A01(245, 11, 91), r8.A07);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0224, code lost:
        A03(r3, A01(76, 17, 6), java.util.UUID.randomUUID().toString());
        r4 = com.facebook.ads.redexgen.X.C0956Lu.A06(A00());
        r2 = com.facebook.ads.redexgen.X.K6.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0250, code lost:
        if (r2[3].length() == r2[4].length()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0257, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0258, code lost:
        r2 = com.facebook.ads.redexgen.X.K6.A0D;
        r2[2] = "uWxLBVxijt65dRlk9T2Hn2WYlcbw5EIA";
        r2[6] = "gJEIMXTCWTN9wPxeCuHJDhMtmXZzR3hI";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0264, code lost:
        if (r4 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x026c, code lost:
        if (r4.A8V() != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0270, code lost:
        r2 = com.facebook.ads.redexgen.X.K6.A0D;
        r2[2] = "NkXVy20xQPZxPDFffPbPKKxnGzq6Q1tn";
        r2[6] = "9D5jR9gI4cGNuuYNFYJ1hn06wNsfKLn7";
        A03(r3, A01(20, 36, 61), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x028b, code lost:
        if (r8.A05 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x028d, code lost:
        A03(r3, A01(108, 11, 35), r8.A05);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029e, code lost:
        if (r8.A04 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02a0, code lost:
        A03(r3, A01(2, 18, 8), r8.A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02ae, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.String> A0A(java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.K6.A0A(java.util.Map):java.util.Map");
    }
}
