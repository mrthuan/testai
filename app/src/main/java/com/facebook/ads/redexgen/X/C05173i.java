package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewParent;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.3i  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C05173i {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 114);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{Field.ADDIN, 80, 48, Field.FORMCHECKBOX, Field.DOCPROPERTY, 86, Field.FORMCHECKBOX, Field.FORMTEXT, Field.DATA, 78, Field.MERGESEQ, 80, Field.TOA, 31, 30, -2, 21, Field.QUOTE, 36, 21, 20, 0, 34, 21, -10, Field.NUMCHARS, 25, 30, 23, 2, 1, -31, -8, 6, 7, -8, -9, -29, 5, -8, -26, -10, 5, 2, -1, -1, 16, 15, -17, 6, 20, 21, 6, 5, -12, 4, 19, 16, 13, 13, 36, Field.QUOTE, 3, 26, Field.DATA, 41, 26, 25, 8, 24, Field.FILLIN, 36, 33, 33, -10, 24, 24, 26, Field.PAGEREF, 41, 26, 25, 30, 29, 2, Field.QUOTE, 16, 33, Field.QUOTE, -3, 20, 34, Field.QUOTE, 20, 19, 2, 18, 33, 30, Field.NUMWORDS, Field.NUMWORDS, 9, 8, -19, 14, 9, 10, -24, -1, 13, 14, -1, -2, -19, -3, 12, 9, 6, 6};
    }

    public void A03(ViewParent viewParent, View view) {
        if (0 != 0) {
            throw new NullPointerException(A00(101, 18, 40));
        }
    }

    public void A04(ViewParent viewParent, View view, int i10, int i11, int i12, int i13) {
        if (0 != 0) {
            throw new NullPointerException(A00(46, 14, 47));
        }
    }

    public void A05(ViewParent viewParent, View view, int i10, int i11, int[] iArr) {
        if (0 != 0) {
            throw new NullPointerException(A00(29, 17, 33));
        }
    }

    public void A06(ViewParent viewParent, View view, View view2, int i10) {
        if (0 != 0) {
            throw new NullPointerException(A00(60, 22, 67));
        }
    }

    public boolean A07(ViewParent viewParent, View view, float f10, float f11) {
        if (0 != 0) {
            throw new NullPointerException(A00(13, 16, 62));
        }
        return false;
    }

    public boolean A08(ViewParent viewParent, View view, float f10, float f11, boolean z10) {
        if (0 != 0) {
            throw new NullPointerException(A00(0, 13, 112));
        }
        return false;
    }

    public boolean A09(ViewParent viewParent, View view, View view2, int i10) {
        if (0 != 0) {
            throw new NullPointerException(A00(82, 19, 61));
        }
        return false;
    }
}
