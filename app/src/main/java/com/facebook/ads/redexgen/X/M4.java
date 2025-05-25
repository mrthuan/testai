package com.facebook.ads.redexgen.X;

import android.app.KeyguardManager;
import android.content.Context;
import java.util.Arrays;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class M4 {
    public static byte[] A00;
    public static final String A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 102);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{18, Field.DATA, Field.ASK, 58, 36, Field.AUTONUM, 34, Field.EQ, Field.FILLIN, 17, 29, 8, Field.TOA, Field.AUTOTEXT, Field.NOTEREF, Field.HYPERLINK, Field.HTMLCONTROL, 74, Field.NOTEREF, Field.FORMCHECKBOX, Field.MERGESEQ, Field.FILESIZE, Field.ADVANCE, Field.SECTION, Field.FILESIZE, Field.GREETINGLINE};
    }

    static {
        A01();
        A01 = M4.class.getSimpleName();
    }

    public static boolean A02(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService(A00(1, 8, 37));
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }

    public static boolean A03(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return false;
        }
        String str = map.get(A00(16, 5, 74));
        String str2 = map.get(A00(21, 5, 84));
        String keyguardRestrictedInputMode = map.get(A00(9, 3, 28));
        if (str != null) {
            String flagDismissKeyguard = A00(0, 1, 69);
            if (str.equals(flagDismissKeyguard) && str2 != null && str2.equals(flagDismissKeyguard) && keyguardRestrictedInputMode != null && keyguardRestrictedInputMode.equals(A00(12, 4, 91))) {
                return true;
            }
        }
        return false;
    }

    public static boolean A04(Map<String, String> map) {
        String keyguardRestrictedInputMode;
        if (map == null || map.isEmpty()) {
            return false;
        }
        String str = map.get(A00(16, 5, 74));
        String str2 = map.get(A00(21, 5, 84));
        String flagDismissKeyguard = A00(0, 1, 69);
        return (str == null || !str.equals(flagDismissKeyguard)) && (str2 == null || !str2.equals(flagDismissKeyguard)) && (keyguardRestrictedInputMode = map.get(A00(9, 3, 28))) != null && keyguardRestrictedInputMode.equals(A00(12, 4, 91));
    }
}
