package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.util.process.ProcessUtils;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.2T  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C2T {
    public static C2S A00;
    public static byte[] A01;
    public static String[] A02 = {OperatorName.NON_STROKING_GRAY, OperatorName.SET_LINE_JOINSTYLE, "XC0Rp", "xmnbF", "ZVN1dtOIFAKzm8JTATZerxuQP9zv55g", "kSPLn3WG70", "", ""};

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] ^ i12;
            String[] strArr = A02;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = OperatorName.SET_LINE_WIDTH;
            strArr2[0] = "P";
            copyOfRange[i13] = (byte) (i14 ^ 92);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{86, Field.LISTNUM, Field.HYPERLINK, Field.NUMWORDS, Field.FORMDROPDOWN, Field.ADVANCE, 86, 80, Field.CONTROL, Field.LISTNUM, Field.LISTNUM, Field.GREETINGLINE, Field.NUMWORDS, Field.ADVANCE, Field.ADDIN, Field.FORMTEXT, Field.NUMWORDS, 116, 113, 106, 103, 112, 101, 122, 103, 97, 124, 123, 114, 106, 118, 122, 123, 115, 124, 114};
    }

    static {
        A02();
    }

    public static C2S A00(C1313Zr c1313Zr) {
        if (A00 == null) {
            synchronized (C2S.class) {
                if (A00 == null) {
                    A00 = new C2S(new C1398bH(c1313Zr.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 36, 105), c1313Zr), 0)));
                }
            }
        }
        return A00;
    }
}
