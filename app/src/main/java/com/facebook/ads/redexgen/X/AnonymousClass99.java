package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.99  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass99 {
    public static byte[] A01;
    public static String[] A02 = {"bU9TaOq2H1BCoTTudHgTa6noiTEuLI16", "3dC6vQggwfY", "sSGIgptGmRpdYm1DWaL7pn14ju5", "", "MWUI4wrCJQVvfxcejCMbIiiXK3H", "jomkRAByJcuN5WcossiIAnU6", "EV4d58k22VMnbcsySNbmwKm2xbXDyfIQ", "0y1Y4yK8RTgYo"};
    public final File A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[7].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "66mt0TcJLXpax";
            strArr2[1] = "NTsH2gO48Ko";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 122);
            i13++;
        }
    }

    public static void A02() {
        byte[] bArr = {7, Field.PAGEREF, 42, 42, 43, 48, 100, 33, 42, Field.IMPORT, Field.EQ, Field.AUTONUM, 33, 100, 99, 97, Field.IMPORT, 99, 100, Field.DDE, Field.IMPORT, 100, Field.PAGEREF, 100, 32, Field.DDE, Field.AUTONUM, 33, Field.FILLIN, 48, 43, Field.AUTONUM, 61, 7, 32, Field.DATA, Field.DDE, 36, Field.PAGEREF, 97, Field.AUTONUMLGL, Field.DDEAUTO, 97, 34, Field.MACROBUTTON, 36, 32, Field.AUTONUMLGL, 36, 97, Field.PAGEREF, Field.DATA, Field.MACROBUTTON, 36, 34, Field.AUTONUMLGL, Field.DDEAUTO, Field.MACROBUTTON, 56, 97, 102, 100, Field.GOTOBUTTON, 102, 124, 120, 105, 126, 113, Field.FILESIZE, 118, 117, 125};
        String[] strArr = A02;
        if (strArr[3].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "";
        strArr2[5] = "lx0xFtkenAwJEtKSHitpjLSh";
        A01 = bArr;
    }

    static {
        A02();
    }

    public AnonymousClass99(File file) {
        this.A00 = file;
    }

    public static AnonymousClass99 A00(String str, Context context) throws IOException {
        File filesDir = new File(context.getFilesDir(), A01(64, 9, 96));
        A03(filesDir);
        File fbsdklogDir = new File(filesDir, str);
        A03(fbsdklogDir);
        return new AnonymousClass99(fbsdklogDir);
    }

    public static void A03(File file) throws IOException {
        if (file.exists() || file.mkdir()) {
            if (file.isDirectory()) {
                return;
            }
            final String format = String.format(Locale.US, A01(0, 33, 62), file.getCanonicalPath());
            throw new RuntimeException(format) { // from class: com.facebook.ads.redexgen.X.9A
            };
        }
        final String format2 = String.format(Locale.US, A01(33, 31, 59), file.getCanonicalPath());
        throw new RuntimeException(format2) { // from class: com.facebook.ads.redexgen.X.9A
        };
    }

    public final AnonymousClass99 A04(String str) throws IOException {
        File file = new File(this.A00, str);
        A03(file);
        return new AnonymousClass99(file);
    }

    public final File A05() {
        return this.A00;
    }
}
