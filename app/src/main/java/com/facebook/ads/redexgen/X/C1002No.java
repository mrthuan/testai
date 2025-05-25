package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.No  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1002No {
    public static byte[] A02;
    public boolean A00 = true;
    public final C1194Uy A01;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 85);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{13, 26, 26, Field.DDE, Field.SECTIONPAGES, 16, 59, Field.SYMBOL, 15, 59, 58, 64, Field.EQ, 58, 64, 24, 59, Field.DDE, 48, Field.EQ, 48, 6, 20, 33, 33, Field.AUTONUMOUT, Field.TOA, 31, Field.SECTIONPAGES, Field.AUTONUMOUT, Field.IMPORT, 24, Field.TOA, 56, Field.SECTION, Field.FORMCHECKBOX, 24, Field.SECTION, Field.IMPORT, 13, -52, -39, -39, -20, 1, -35, -16, -2, -5, -6, -7, -2, -16, -48, -7, -17, -59, 34, Field.NUMWORDS, 21, 16, -44, -44, 18, 33, 26, 15, 32, 21, Field.NUMWORDS, 26, -44, -43, -52, Field.FILLIN, 32, 30, Field.PAGEREF, -52, Field.FILLIN, -52, -52, 21, 18, -52, -44, -51, Field.QUOTE, 21, 26, 16, Field.NUMWORDS, Field.QUOTE, -38, Field.NUMCHARS, 17, 30, 18, Field.NUMWORDS, 30, 25, 13, 26, 15, 17, -52, Field.DATA, Field.DATA, -52, -51, Field.QUOTE, 21, 26, 16, Field.NUMWORDS, Field.QUOTE, -38, Field.NUMCHARS, 17, 30, 18, Field.NUMWORDS, 30, 25, 13, 26, 15, 17, -38, 32, 21, 25, 21, 26, 19, -52, Field.DATA, Field.DATA, -52, -51, 16, Field.NUMWORDS, 15, 33, 25, 17, 26, 32, -52, -52, -52, -52, -52, -52, -52, Field.DATA, Field.DATA, -52, -51, 16, Field.NUMWORDS, 15, 33, 25, 17, 26, 32, -38, 14, Field.NUMWORDS, 16, Field.PAGEREF, -52, Field.DATA, Field.DATA, -52, -51, 16, Field.NUMWORDS, 15, 33, 25, 17, 26, 32, -38, 14, Field.NUMWORDS, 16, Field.PAGEREF, -38, 15, 20, 21, 24, 16, 30, 17, 26, -52, -52, -52, -52, -52, -52, -52, Field.DATA, Field.DATA, -52, 16, Field.NUMWORDS, 15, 33, 25, 17, 26, 32, -38, 14, Field.NUMWORDS, 16, Field.PAGEREF, -38, 15, 20, 21, 24, 16, 30, 17, 26, -38, 24, 17, 26, 19, 32, 20, -52, -24, -52, -35, -43, -52, Field.FILLIN, -52, -52, -52, -52, 30, 17, 32, 33, 30, 26, -25, -52, -52, 41, -52, -52, 34, 13, 30, -52, 26, 34, 32, 21, 25, 21, 26, 19, 11, 11, 13, 26, 11, 32, -52, -23, -52, Field.QUOTE, 21, 26, 16, Field.NUMWORDS, Field.QUOTE, -38, Field.NUMCHARS, 17, 30, 18, Field.NUMWORDS, 30, 25, 13, 26, 15, 17, -38, 32, 21, 25, 21, 26, 19, -25, -52, -52, 21, 18, -52, -44, 26, 34, 32, 21, 25, 21, 26, 19, 11, 11, 13, 26, 11, 32, -38, 30, 17, 31, Field.NUMCHARS, Field.NUMWORDS, 26, 31, 17, -15, 26, 16, -52, -22, -52, -36, -43, -52, Field.FILLIN, -52, -52, -52, -52, 15, Field.NUMWORDS, 26, 31, Field.NUMWORDS, 24, 17, -38, 24, Field.NUMWORDS, 19, -44, -45, -19, -6, -6, 13, 34, -2, 17, 31, Field.NUMCHARS, Field.NUMWORDS, 26, 31, 17, -15, 26, 16, -26, -45, -52, -41, -52, 26, 34, 32, 21, 25, 21, 26, 19, 11, 11, 13, 26, 11, 32, -38, 30, 17, 31, Field.NUMCHARS, Field.NUMWORDS, 26, 31, 17, -15, 26, 16, -43, -25, -52, -52, 41, -52, -52, 21, 18, -52, -44, 26, 34, 32, 21, 25, 21, 26, 19, 11, 11, 13, 26, 11, 32, -38, 16, Field.NUMWORDS, 25, -17, Field.NUMWORDS, 26, 32, 17, 26, 32, -8, Field.NUMWORDS, 13, 16, 17, 16, -15, 34, 17, 26, 32, -1, 32, 13, 30, 32, -52, -22, -52, -36, -43, -52, Field.FILLIN, -52, -52, -52, -52, 15, Field.NUMWORDS, 26, 31, Field.NUMWORDS, 24, 17, -38, 24, Field.NUMWORDS, 19, -44, -45, -19, -6, -6, 13, 34, -16, Field.NUMWORDS, 25, -17, Field.NUMWORDS, 26, 32, 17, 26, 32, -8, Field.NUMWORDS, 13, 16, 17, 16, -26, -45, -52, -41, -52, 26, 34, 32, 21, 25, 21, 26, 19, 11, 11, 13, 26, 11, 32, -38, 16, Field.NUMWORDS, 25, -17, Field.NUMWORDS, 26, 32, 17, 26, 32, -8, Field.NUMWORDS, 13, 16, 17, 16, -15, 34, 17, 26, 32, -1, 32, 13, 30, 32, -43, -25, -52, -52, 41, -52, -52, 21, 18, -52, -44, 26, 34, 32, 21, 25, 21, 26, 19, 11, 11, 13, 26, 11, 32, -38, 24, Field.NUMWORDS, 13, 16, -15, 34, 17, 26, 32, -15, 26, 16, -52, -22, -52, -36, -43, -52, Field.FILLIN, -52, -52, -52, -52, 15, Field.NUMWORDS, 26, 31, Field.NUMWORDS, 24, 17, -38, 24, Field.NUMWORDS, 19, -44, -45, -19, -6, -6, 13, 34, -8, Field.NUMWORDS, 13, 16, -15, 34, 17, 26, 32, -15, 26, 16, -26, -45, -52, -41, -52, 26, 34, 32, 21, 25, 21, 26, 19, 11, 11, 13, 26, 11, 32, -38, 24, Field.NUMWORDS, 13, 16, -15, 34, 17, 26, 32, -15, 26, 16, -43, -25, -52, -52, 41, 41, -52, 15, 13, 32, 15, 20, -44, 17, 30, 30, -43, -52, Field.FILLIN, -52, -52, 15, Field.NUMWORDS, 26, 31, Field.NUMWORDS, 24, 17, -38, 24, Field.NUMWORDS, 19, -44, -45, 13, 26, 11, 26, 13, 34, 21, 19, 13, 32, 21, Field.NUMWORDS, 26, 11, 32, 21, 25, 21, 26, 19, 11, 17, 30, 30, Field.NUMWORDS, 30, -26, -45, -52, -41, -52, 17, 30, 30, -38, 25, 17, 31, 31, 13, 19, 17, -43, -25, 41, 41, -43, -44, -43, -43, -25};
    }

    public C1002No(C1194Uy c1194Uy) {
        this.A01 = c1194Uy;
    }

    public static long A00(String str, String str2) {
        String substring = str.substring(str2.length());
        if (TextUtils.isEmpty(substring)) {
            return -1L;
        }
        try {
            long parseLong = Long.parseLong(substring);
            if (parseLong < 0) {
                return -1L;
            }
            return parseLong;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void A03() {
        if (!this.A00) {
            return;
        }
        if (this.A01.canGoBack() || this.A01.canGoForward()) {
            this.A00 = false;
        } else {
            this.A01.A05(A01(57, 693, 87));
        }
    }

    public final void A04(String str) {
        if (!this.A00) {
            return;
        }
        String A01 = A01(40, 17, 54);
        if (str.startsWith(A01)) {
            this.A01.A0H(A00(str, A01));
            return;
        }
        String A012 = A01(0, 22, 119);
        if (str.startsWith(A012)) {
            this.A01.A0F(A00(str, A012));
            return;
        }
        String A013 = A01(22, 18, 126);
        if (!str.startsWith(A013)) {
            return;
        }
        this.A01.A0G(A00(str, A013));
    }

    public final void A05(boolean z10) {
        this.A00 = z10;
    }
}
