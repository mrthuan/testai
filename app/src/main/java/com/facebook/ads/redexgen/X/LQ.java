package com.facebook.ads.redexgen.X;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class LQ {
    public static byte[] A00;
    public static String[] A01 = {"fKOq3CLbRisV2HCvxbP8DswDC3h61WtS", "qQcG8iivYcbnleQXnFNfPBjKpUSTKwt1", "90Y8NMpYXvys60lz4Y4AY7bkcR6rkmkz", "C2raqoqRf1xXuaxgLg", "Co6wMAKL4SYYucOnnpwSDFFGSy", "pPL6tu27HuVGqH4ILm", "ywYYaeUt5bOEJr09A3", "jMc4mNTDFQmf2DaMzWYBnxz0IZlySjfz"};
    public static final String A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{Field.NUMWORDS, Field.SYMBOL, Field.AUTONUM, Byte.MAX_VALUE, 44, 120, 60, 61, 44, 61, 42, Field.AUTONUMLGL, Field.EQ, Field.AUTONUM, 61, 120, Field.EQ, Field.USERADDRESS, 120, Field.SYMBOL, Field.DATA, Field.DATA, 120, Field.EQ, 43, 120, 13, Field.AUTONUM, Field.EQ, 44, 33, 118, Field.IMPORT, 13, Field.GREETINGLINE, 43, 16, 23, 10, 7, Field.GREETINGLINE, 31, 14, 14, Field.INCLUDETEXT, Field.GREETINGLINE, Field.HYPERLINK, Field.ADVANCE, 86, 21, Field.ADDRESSBLOCK, Field.LISTNUM, Field.HYPERLINK, Field.GREETINGLINE, Field.AUTOTEXTLIST, Field.ADVANCE, Field.ADVANCE, 80, 21, Field.TOA, Field.GREETINGLINE, Field.LISTNUM, Field.HYPERLINK, Field.AUTOTEXT, 21, 105, Field.GREETINGLINE, Field.LISTNUM, Field.HYPERLINK, Field.AUTOTEXT, 122, Field.HYPERLINK, Field.AUTOTEXT, 82, 77, 82, Field.AUTOTEXT, Field.SECTIONPAGES, 18, 30, Field.NUMCHARS, Field.SHAPE, 4, 31, 24, 5, 8, Field.SECTIONPAGES, 21, Field.SHAPE, 1, 29, 16, 8, 20, 3, Field.SHAPE, 36, 31, 24, 5, 8, 33, 29, 16, 8, 20, 3, 48, 18, 5, 24, 7, 24, 5, 8};
    }

    static {
        A01();
        A02 = LQ.class.getSimpleName();
    }

    public static boolean A02() {
        try {
            Class.forName(A00(46, 32, 44));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A03() {
        try {
            Class.forName(A00(78, 38, 102));
            if (A01[2].charAt(21) != '7') {
                throw new RuntimeException();
            }
            A01[2] = "fqSGPLRwldKX66WDmKKlg7YQ1V3cstss";
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A04(int i10, int i11) {
        return i10 >= 640 && i11 >= 640;
    }

    public static boolean A05(C7j c7j) {
        boolean z10 = false;
        try {
            PackageManager packageManager = c7j.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            boolean isUnity = true;
            ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(c7j.getPackageName(), 1).activities;
            if (activityInfoArr != null) {
                int length = activityInfoArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    boolean activityDeclared = A00(78, 38, 102).equals(activityInfoArr[i10].name);
                    if (!activityDeclared) {
                        i10++;
                    } else {
                        z10 = true;
                        break;
                    }
                }
            }
            if (!z10) {
                boolean activityDeclared2 = A03();
                if (!activityDeclared2) {
                    isUnity = false;
                }
            }
            boolean activityDeclared3 = c7j.A04().A9O();
            if (activityDeclared3) {
                String str = A00(32, 14, 105) + isUnity;
            }
            return isUnity;
        } catch (Throwable th2) {
            if (c7j.A04().A9O()) {
                Log.e(A02, A00(0, 32, 79), th2);
            }
            return false;
        }
    }
}
