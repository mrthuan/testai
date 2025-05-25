package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.facebook.ads.redexgen.X.7M  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7M {
    public static byte[] A00;
    public static String[] A01 = {"DEtwtGzSxOHfmsYE0nJutNtLbuPgZxnp", "HEN1zAi3Yn4iHVof3jMUFUQ", "m8f1TG9WFPBUvQLDx3K0MLj2Za0d4Euo", "A4PZagHoSRM8cM4mqm2KVFoT1GUYa0fw", "0QxzD8ZSXkCRRI3ROeoKuabFTd70p3Eq", "xILcHU0IM590zH2kPS2o7", "opJvnU19Lwme99brEfR2F", "9Gp2VR68AX"};
    public static final /* synthetic */ C7M[] A02;
    public static final C7M A03;
    public static final C7M A04;
    public static final C7M A05;
    public static final C7M A06;
    public static final C7M A07;
    public static final C7M A08;
    public static final C7M A09;
    public static final C7M A0A;
    public static final C7M A0B;
    public static final C7M A0C;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 123);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-37, -26, -26, -21, -8, -8, -11, -18, -22, -9, -66, -61, -68, -51, -63, -52, -46, -65, -55, -62, -17, -11, -8, -22, -3, 29, 34, Field.DATA, -29, -26, -27, -34, Field.DDE, Field.AUTONUMOUT, 43, 43, 24, 26, 17, 21, 17, Field.NUMCHARS, 17, 30, 13, -23, -22, -24, -33, -28, -35};
        if (A01[2].charAt(8) != 'F') {
            throw new RuntimeException();
        }
        A01[2] = "JRHKMDEWFLpt4s2hfuCsUWWHTwNaAfzC";
        A00 = bArr;
    }

    static {
        A01();
        A0A = new C7M(A00(32, 4, 100), 0);
        A08 = new C7M(A00(25, 3, 89), 1);
        A09 = new C7M(A00(28, 4, 28), 2);
        A07 = new C7M(A00(20, 5, 46), 3);
        A06 = new C7M(A00(14, 6, 2), 4);
        A04 = new C7M(A00(3, 7, 46), 5);
        A05 = new C7M(A00(10, 4, 0), 6);
        A0C = new C7M(A00(45, 6, 27), 7);
        A03 = new C7M(A00(0, 3, 31), 8);
        A0B = new C7M(A00(36, 9, 77), 9);
        A02 = A02();
    }

    public C7M(String str, int i10) {
    }

    public static /* synthetic */ C7M[] A02() {
        C7M[] c7mArr = new C7M[10];
        c7mArr[0] = A0A;
        c7mArr[1] = A08;
        c7mArr[2] = A09;
        c7mArr[3] = A07;
        c7mArr[4] = A06;
        c7mArr[5] = A04;
        c7mArr[6] = A05;
        c7mArr[7] = A0C;
        if (A01[1].length() != 27) {
            A01[1] = "WetVKWfSjesX";
            c7mArr[8] = A03;
            c7mArr[9] = A0B;
            return c7mArr;
        }
        throw new RuntimeException();
    }

    public static C7M valueOf(String str) {
        return (C7M) Enum.valueOf(C7M.class, str);
    }

    public static C7M[] values() {
        return (C7M[]) A02.clone();
    }
}
