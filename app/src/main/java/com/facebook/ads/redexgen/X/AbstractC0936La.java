package com.facebook.ads.redexgen.X;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.La  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0936La {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{Field.USERADDRESS, Field.GOTOBUTTON, 48, 115, 59, 60, Field.USERADDRESS, 56, Field.BARCODE, Field.GOTOBUTTON, Field.GOTOBUTTON, Field.AUTONUM, 115, Field.AUTONUM, 60, 41, 60, Field.MACROBUTTON, 60};
    }

    public static PackageInfo A00(C7j c7j) {
        return A01(c7j, A02(0, 19, 49));
    }

    public static PackageInfo A01(C7j c7j, String str) {
        PackageManager packageManager;
        if (TextUtils.isEmpty(str) || (packageManager = c7j.getPackageManager()) == null) {
            return null;
        }
        try {
            return packageManager.getPackageInfo(str, 1);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        } catch (RuntimeException unused2) {
            return null;
        }
    }

    public static boolean A04(C7j c7j, String str) {
        PackageInfo packageInfo = A01(c7j, str);
        return packageInfo != null;
    }
}
