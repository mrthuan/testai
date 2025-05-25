package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.KeyguardManager;
import android.util.Log;
import android.view.Window;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class ML {
    public static byte[] A00;
    public static String[] A01 = {"cuUzkH3QdbH3cJp2RF", "kphHRdIOrc0r15jsPfyG2Jy", "YnKzEWoXtdzuP95TROGjIP", "O6qhnuon9ci7avdCdn", "JszjlqJauoZ2AkEe", "2iwMqZkAQKEhQz1BEXGjAw", "tv2fwm9vcfvUl0RC5d9GYW3eB7CSJdU", "VWHYkG5jfvcYH9oXKfgyVS7MLxk2p9iO"};
    public static final String A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "jOZxNa7dXP1jVDPJoO";
            strArr2[0] = "z9aGKGtKVlVAFuhw7X";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 48);
            i13++;
        }
    }

    public static void A02() {
        A00 = new byte[]{Field.AUTOTEXT, 119, 122, Field.FORMCHECKBOX, Field.BIDIOUTLINE, Field.LISTNUM, Field.AUTOTEXT, Field.MERGESEQ, 86, 80, Field.ADDIN, 31, 86, Field.ADDIN, 31, Field.NOTEREF, 86, Field.ADDIN, Field.HTMLCONTROL, 80, Field.NOTEREF, 31, 86, Field.ADDIN, Field.AUTOTEXTLIST, 80, 31, Field.BIDIOUTLINE, Field.CONTROL, Field.LISTNUM, Field.BIDIOUTLINE, Field.ADVANCE, 98, 108, 112, 110, 124, 104, 123, 109, Field.HTMLCONTROL, Field.CONTROL, Field.SECTIONPAGES, 15, 20, 14, 22, 4, 96, 113, 115, 124, 112, 117, 100, 113, 117, 110, 96, 99};
    }

    static {
        A02();
        A02 = ML.class.getSimpleName();
    }

    public static Map<String, String> A01(C1314Zs c1314Zs) {
        Window window;
        HashMap hashMap = new HashMap();
        if (c1314Zs == null) {
            return hashMap;
        }
        try {
            hashMap.put(A00(40, 3, 0), String.valueOf(A04(c1314Zs)));
            Activity A0D = c1314Zs.A0D();
            if (A0D != null && (window = A0D.getWindow()) != null) {
                int i10 = window.getAttributes().flags;
                int flags = window.getAttributes().type;
                hashMap.put(A00(58, 2, 39), Integer.toString(flags));
                int type = 4194304 & i10;
                String A002 = A00(1, 1, 118);
                String flagDismissKeyguardEnabled = A00(0, 1, 79);
                hashMap.put(A00(48, 5, 39), type > 0 ? A002 : flagDismissKeyguardEnabled);
                int type2 = 524288 & i10;
                if (A01[6].length() == 6) {
                    throw new RuntimeException();
                }
                A01[7] = "5jjmsuOSeLdxH4ITovSaNkR7tPO8fpvx";
                if (type2 <= 0) {
                    A002 = flagDismissKeyguardEnabled;
                }
                hashMap.put(A00(53, 5, 50), A002);
            }
        } catch (Exception e10) {
            Log.e(A02, A00(2, 30, 15), e10);
            C8D A07 = c1314Zs.A07();
            int type3 = C8E.A2T;
            A07.AA0(A00(43, 5, 77), type3, new C8F(e10));
        }
        return hashMap;
    }

    public static boolean A03(C1314Zs c1314Zs) {
        return !M4.A04(A01(c1314Zs));
    }

    public static boolean A04(C1314Zs c1314Zs) {
        KeyguardManager keyguardManager = (KeyguardManager) c1314Zs.getSystemService(A00(32, 8, 57));
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }
}
