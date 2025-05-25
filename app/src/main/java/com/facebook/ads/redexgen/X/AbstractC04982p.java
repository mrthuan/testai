package com.facebook.ads.redexgen.X;

import android.graphics.Color;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.2p  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC04982p {
    public static byte[] A00;
    public static String[] A01 = {"OxqqmxACKcMb9rgd4flgeoqO4FLkDXK8", "hO921EE08Z5YovLaOXzv", "4KPhJxryuqZouci8ltOnoaa6GepMOFR6", "Qaf3Cf9SMgDDqCFg3avrhgzCiMtnLJnE", "vZFktEahG3bWOXRkYAMaCi8nGdaO1v3Q", "tZHqmUfqpLYo8cwpqndw", "zlaA7TXYCJ", "adeIrckSIlUrZ7yW4ZooAIUWBthMSkAF"};
    public static final ThreadLocal<double[]> A02;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{26, 23, 11, 19, 26, Field.HTMLCONTROL, 22, 14, 8, 15, Field.HTMLCONTROL, 25, 30, Field.HTMLCONTROL, 25, 30, 15, 12, 30, 30, 21, Field.HTMLCONTROL, Field.MERGESEQ, Field.HTMLCONTROL, 26, 21, 31, Field.HTMLCONTROL, Field.TOA, 78, 78, Field.DOCPROPERTY, Field.AUTONUM, 44, Field.DDE, 1, 32, Field.QUOTE, 121, Field.AUTONUMOUT, 44, 42, Field.DDE, 121, Field.EQ, 56, Field.GLOSSARY, 60, 121, 56, 121, Field.AUTONUMLGL, 60, Field.IMPORT, Field.USERADDRESS, Field.DDE, Field.EQ, 121, Field.AUTONUM, Field.BARCODE, 121, 106, 119};
    }

    static {
        A04();
        A02 = new ThreadLocal<>();
    }

    public static double A00(int i10) {
        double[] A07 = A07();
        A06(i10, A07);
        return A07[1] / 100.0d;
    }

    public static int A01(int i10, int i11) {
        if (i11 < 0 || i11 > 255) {
            throw new IllegalArgumentException(A03(0, 32, 67));
        }
        String[] strArr = A01;
        if (strArr[5].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A01[0] = "DAqAm14HDJv7tSHiVIRuluRO44d0lStM";
        return (16777215 & i10) | (i11 << 24);
    }

    public static int A02(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        float inverseRatio = Color.alpha(i11);
        float g10 = (Color.alpha(i10) * f11) + (inverseRatio * f10);
        float inverseRatio2 = Color.red(i11);
        float r4 = (Color.red(i10) * f11) + (inverseRatio2 * f10);
        float a10 = Color.green(i10);
        float inverseRatio3 = Color.green(i11);
        float a11 = (a10 * f11) + (inverseRatio3 * f10);
        float inverseRatio4 = Color.blue(i11);
        float b10 = (Color.blue(i10) * f11) + (inverseRatio4 * f10);
        return Color.argb((int) g10, (int) r4, (int) a11, (int) b10);
    }

    public static void A05(int i10, int i11, int i12, double[] dArr) {
        double sb2;
        double sr;
        double sb3;
        if (dArr.length == 3) {
            double sb4 = i10 / 255.0d;
            if (sb4 < 0.04045d) {
                sb2 = sb4 / 12.92d;
            } else {
                sb2 = Math.pow((sb4 + 0.055d) / 1.055d, 2.4d);
            }
            double sr2 = i11 / 255.0d;
            if (sr2 < 0.04045d) {
                sr = sr2 / 12.92d;
            } else {
                double sr3 = sr2 + 0.055d;
                if (A01[2].charAt(0) != 'Y') {
                    String[] strArr = A01;
                    strArr[3] = "aAOO9yx7jRsDtZ33Oh1YUTlwgCOJU7qQ";
                    strArr[4] = "tiIjGPCneBcQleUKUeg5FNX5aBHKyIuK";
                    sr = Math.pow(sr3 / 1.055d, 2.4d);
                }
                throw new RuntimeException();
            }
            double sb5 = i12 / 255.0d;
            if (sb5 >= 0.04045d) {
                String[] strArr2 = A01;
                if (strArr2[5].length() == strArr2[1].length()) {
                    String[] strArr3 = A01;
                    strArr3[5] = "axgx58ekBr3JsKBSYEIr";
                    strArr3[1] = "AyWuGeE7FNinezs3svxh";
                    double sg2 = 0.055d + sb5;
                    sb3 = Math.pow(sg2 / 1.055d, 2.4d);
                }
                throw new RuntimeException();
            }
            sb3 = sb5 / 12.92d;
            double sg3 = 0.4124d * sb2;
            dArr[0] = (sg3 + (0.3576d * sr) + (0.1805d * sb3)) * 100.0d;
            double sg4 = 0.2126d * sb2;
            dArr[1] = (sg4 + (0.7152d * sr) + (0.0722d * sb3)) * 100.0d;
            double sg5 = 0.0193d * sb2;
            dArr[2] = (sg5 + (0.1192d * sr) + (0.9505d * sb3)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException(A03(32, 31, 97));
    }

    public static void A06(int i10, double[] dArr) {
        A05(Color.red(i10), Color.green(i10), Color.blue(i10), dArr);
    }

    public static double[] A07() {
        double[] dArr = A02.get();
        if (dArr == null) {
            double[] dArr2 = new double[3];
            A02.set(dArr2);
            return dArr2;
        }
        return dArr;
    }
}
