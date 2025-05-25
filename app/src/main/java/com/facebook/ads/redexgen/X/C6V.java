package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.6V  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6V {
    public static byte[] A00;
    public static String[] A01 = {"OKQe8hXRO9IjIcE", "fZKFXGCnlijKRnd4C4GIjN8U9jomZ", "zd2g3FUlSdy4niS", "DQ1eYrU0vgUbRV2buV2T3UhVrDT8jNOj", "Q6rIf3Izbhrm2WD", "9gkLXGbOvBYKsW5YBwzKkub2Nn3K8ZPa", "2O7yMssiHcBFdM45gqp1TjJS", "Fkq1E5"};

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[3].charAt(10) == 'G') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "GMwx2CjIRojg5Fd";
            strArr[4] = "kdR397QSXvrHcnb";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 100);
            i13++;
        }
    }

    public static void A02() {
        A00 = new byte[]{74, Field.BIDIOUTLINE, 119, 77, 80, Field.BIDIOUTLINE, Field.LISTNUM, Field.TOA, Field.HTMLCONTROL, 24, 20, 22, Field.DOCPROPERTY, 29, 26, 24, 30, 25, 20, 20, 16, Field.DOCPROPERTY, 26, 31, 8, Field.DOCPROPERTY, 18, 21, 15, 30, 9, 21, 26, 23, Field.DOCPROPERTY, 25, 15, 30, 3, 15, 9, 26, 8};
    }

    static {
        A02();
    }

    public static SharedPreferences A00(C7j c7j) {
        return c7j.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(9, 34, 31), c7j), 0);
    }

    public final String A03(C7j c7j) {
        return A00(c7j).getString(A01(0, 9, 76), null);
    }

    public final void A04(C7j c7j, String str) {
        SharedPreferences btSP = A00(c7j);
        btSP.edit().putString(A01(0, 9, 76), str).apply();
    }
}
