package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.facebook.ads.redexgen.X.2U  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2U {
    public static byte[] A01;
    public static String[] A02 = {"VujXzvSFrlMAu4R1I5vUAWLnq57AsPWM", "eCB4AeZNNUxNJOW0xCQdVSKErAFKyRUE", "SxM7TzuiGj5mLkDPau1usW4gOWoxs80M", "JPSotx28OKEE72Qpgvn7eDCIGwp5uNVo", "DEnf6Zvbz7peiDJpz513nqQn8JHSiM1H", "gOyBV6cEPVg9ZlKZ082v3gM", "JzQKQqAcA3MWJuXBOCM1CdL45YEfwdQ5", "kFuiftK6CrUjCipoQAB5otHUPyyIQR1T"};
    public static final /* synthetic */ C2U[] A03;
    public static final C2U A04;
    public static final C2U A05;
    public static final C2U A06;
    public final String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 62);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{124, 125, 112, 113, Field.FORMTEXT, Field.FORMCHECKBOX, Field.FORMTEXT, 77, 82, Field.FILESIZE, 80, Field.AUTOTEXT, 82, Field.ADVANCE, 74, Field.MERGESEQ, Field.FORMTEXT, Field.FORMCHECKBOX, 101, 100, 101, 110, 44, 59, Field.DDEAUTO, Field.EQ, 44, 42};
    }

    static {
        A01();
        A06 = new C2U(A00(8, 6, 62), 0, A00(22, 6, 96));
        A04 = new C2U(A00(0, 4, 10), 1, A00(14, 4, 28));
        A05 = new C2U(A00(4, 4, 54), 2, A00(18, 4, 53));
        A03 = A02();
    }

    public C2U(String str, int i10, String str2) {
        this.A00 = str2;
    }

    public static /* synthetic */ C2U[] A02() {
        C2U[] c2uArr = new C2U[3];
        c2uArr[0] = A06;
        C2U c2u = A04;
        String[] strArr = A02;
        if (strArr[0].charAt(31) != strArr[2].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "cigJDFmR8APB9TZFazKvkLU6eV5xdG1z";
        strArr2[7] = "bxChofFJf2xaRn9PIbRGfpqcGnLInP10";
        c2uArr[1] = c2u;
        c2uArr[2] = A05;
        return c2uArr;
    }

    public final String A03() {
        return this.A00;
    }

    public static C2U valueOf(String str) {
        return (C2U) Enum.valueOf(C2U.class, str);
    }

    public static C2U[] values() {
        return (C2U[]) A03.clone();
    }
}
