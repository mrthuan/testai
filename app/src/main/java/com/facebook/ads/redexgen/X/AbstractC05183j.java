package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.3j  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC05183j {
    public static byte[] A00;
    public static String[] A01 = {"ZL1anCMt3BLp6QH6mLG", "eYchmtpQAx9MOQATO8FYbbZn0Imopvp", "womqJE18VUE38xqqJT9WKISB68M5cIbo", "Ts37DulPc8QB3fV2ykqejrUSGmoT8jSS", "b7DBuf20fhmi4MvO4gTJDnUAFhtFn7QS", "riPo3ZmcE", "zdrgnlBB6epFGiAXytvDtgh2fpyUYHeQ", "pMT1BFzteNKtMElnfmBSO9c56WwnbBlh"};
    public static final C05173i A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[7].charAt(24) != strArr[2].charAt(24)) {
                throw new RuntimeException();
            }
            A01[1] = "rrZUd7Y7OcpInh9wY";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 74);
            i13++;
        }
    }

    public static void A01() {
        A00 = new byte[]{13, 12, -20, 3, 17, 18, 3, 2, -18, 16, 3, -15, 1, 16, 13, 10, 10, -56, -57, -89, -66, -52, -51, -66, -67, -84, -68, -53, -56, -59, -59, Field.AUTONUMOUT, Field.MACROBUTTON, 19, 42, 56, Field.SYMBOL, 42, 41, 24, Field.DATA, Field.IMPORT, Field.AUTONUMOUT, Field.EQ, Field.EQ, 6, Field.DATA, Field.DATA, 42, Field.AUTONUMLGL, Field.SYMBOL, 42, 41, -55, -56, -83, -50, -69, -52, -50, -88, -65, -51, -50, -65, -66, -83, -67, -52, -55, -58, -58, 41, Field.DATA, 13, Field.DDEAUTO, 41, 42, 8, 31, Field.DDE, Field.DDEAUTO, 31, 30, 13, 29, 44, 41, Field.ASK, Field.ASK};
    }

    static {
        A01();
        if (Build.VERSION.SDK_INT >= 21) {
            A02 = new FZ();
        } else if (Build.VERSION.SDK_INT >= 19) {
            A02 = new C1385b2();
        } else {
            A02 = new C05173i();
        }
    }

    public static void A02(ViewParent viewParent, View view, int i10) {
        if (0 != 0) {
            throw new NullPointerException(A00(72, 18, 112));
        }
        if (i10 == 0) {
            A02.A03(viewParent, view);
        }
    }

    public static void A03(ViewParent viewParent, View view, int i10, int i11, int i12, int i13, int i14) {
        if (0 != 0) {
            throw new NullPointerException(A00(17, 14, 15));
        }
        if (i14 == 0) {
            A02.A04(viewParent, view, i10, i11, i12, i13);
        }
    }

    public static void A04(ViewParent viewParent, View view, int i10, int i11, int[] iArr, int i12) {
        if (0 != 0) {
            throw new NullPointerException(A00(0, 17, 84));
        }
        if (i12 == 0) {
            A02.A05(viewParent, view, i10, i11, iArr);
        }
    }

    public static void A05(ViewParent viewParent, View view, View view2, int i10, int i11) {
        if (0 != 0) {
            throw new NullPointerException(A00(31, 22, 123));
        }
        if (i11 == 0) {
            C05173i c05173i = A02;
            if (A01[1].length() != 12) {
                A01[6] = "zGz2rBeihUtTfGY2pcVtSmEx1y47z9aS";
                c05173i.A06(viewParent, view, view2, i10);
                return;
            }
            throw new RuntimeException();
        }
    }

    public static boolean A06(ViewParent viewParent, View view, float f10, float f11) {
        return A02.A07(viewParent, view, f10, f11);
    }

    public static boolean A07(ViewParent viewParent, View view, float f10, float f11, boolean z10) {
        return A02.A08(viewParent, view, f10, f11, z10);
    }

    public static boolean A08(ViewParent viewParent, View view, View view2, int i10, int i11) {
        if (0 != 0) {
            throw new NullPointerException(A00(53, 19, 16));
        }
        if (i11 == 0) {
            boolean A09 = A02.A09(viewParent, view, view2, i10);
            if (A01[1].length() != 12) {
                A01[6] = "znJUBPw3pDumoyQGyqs8HDKa96hSudPo";
                return A09;
            }
            throw new RuntimeException();
        }
        return false;
    }
}
