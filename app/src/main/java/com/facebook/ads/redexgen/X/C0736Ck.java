package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Ck  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0736Ck {
    public static byte[] A05;
    public static String[] A06 = {"mFOOXeT", "LexbahN", "kVTxxC3LTF0fLMRDW8jGaPZPlig8JQO1", "0AoiW04D4LYaxFko3LbiIyYKfV5E85gy", "aSBFun93hJrKs5fmh7DDxXeNBftzg4Tu", "XwteBG2Aw0OJWJhPb8yklLP0HTcb60fQ", "dNH0H93SgKuqiJfOfkHJjHC2B9TjjrRJ", "a4Tt0YroJWfViDs7yV1XUKalqcZLTf7A"};
    public final int A00;
    public final C8 A01;
    public final String A02;
    public final boolean A03;
    public final byte[] A04;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] - i12;
            String[] strArr = A06;
            if (strArr[7].charAt(14) == strArr[2].charAt(14)) {
                throw new RuntimeException();
            }
            A06[5] = "YmrJEBKdiRZ1L6ltRDAiNut0MqgfCokc";
            copyOfRange[i13] = (byte) (i14 - 119);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-7, 0, -14, 19, Field.FILESIZE, Field.FILESIZE, Field.FORMCHECKBOX, Field.BARCODE, 59, 64, Field.SYMBOL, -14, 19, 23, Field.PAGEREF, -1, 21, Field.ASK, 36, -14, Field.AUTONUMLGL, Field.INCLUDETEXT, Field.MERGESEQ, Field.SECTIONPAGES, Field.FORMTEXT, Field.SECTION, -14, Field.BARCODE, Field.SECTION, Field.AUTONUM, Field.IMPORT, 0, -18, 12, -5, -3, 5, -33, 8, -3, 12, 19, 10, 14, 3, 9, 8, -36, 9, 18, 22, Field.GLOSSARY, Field.AUTONUMOUT, Field.AUTONUM, Field.EQ, Field.EQ, 48, Field.MACROBUTTON, Field.AUTONUMLGL, Field.ASK, Field.PAGEREF, -31, Field.EQ, Field.MACROBUTTON, 48, Field.AUTONUMLGL, Field.ASK, 36, Field.AUTONUMLGL, 42, 48, Field.GLOSSARY, -31, Field.AUTONUMOUT, 36, 41, Field.ASK, Field.DDEAUTO, Field.ASK, -31, Field.AUTONUMLGL, 58, Field.EQ, Field.ASK, -31, -24, 33, 32, 33, -17, 11, 10, 11, Field.NUMWORDS, -31, -29, -20, -31, 24, 26, Field.QUOTE, Field.DATA};
    }

    static {
        A02();
    }

    public C0736Ck(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        AbstractC0844Hf.A03((bArr2 == null) ^ (i10 == 0));
        this.A03 = z10;
        this.A02 = str;
        this.A00 = i10;
        this.A04 = bArr2;
        this.A01 = new C8(A00(str), bArr, i11, i12);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A00(String str) {
        char c;
        if (str == null) {
            return 1;
        }
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(A01(86, 4, 71))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3046671:
                if (str.equals(A01(90, 4, 49))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3049879:
                if (str.equals(A01(94, 4, 7))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3049895:
                if (str.equals(A01(98, 4, 62))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 1;
            case 2:
            case 3:
                return 2;
            default:
                Log.w(A01(32, 18, 35), A01(50, 36, 74) + str + A01(0, 32, 91));
                return 1;
        }
    }
}
