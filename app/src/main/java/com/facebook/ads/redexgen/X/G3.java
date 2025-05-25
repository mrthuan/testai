package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public abstract class G3 {
    public static byte[] A00;
    public static final int A01;
    public static final int A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 72);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{9, 43, Field.FILLIN, Field.NUMWORDS, 58, Field.GLOSSARY, Field.GOTOBUTTON, -8, 8, -5, -27, -5, -11, -19, -24, -29, -5, -7, 0, 0, -7, -2, -9, -80, 2, -11, -3, -15, -7, -2, -12, -11, 2, -80, -1, -10, -80, -3, -15, -4, -10, -1, 2, -3, -11, -12, -80, -29, -43, -39, -80, -34, -47, -36, -80, 5, -2, -7, 4, -66};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A03(long j10, I4 i42, C9[] c9Arr) {
        while (i42.A04() > 1) {
            int A002 = A00(i42);
            int A003 = A00(i42);
            int A06 = i42.A06() + A003;
            if (A003 == -1 || A003 > i42.A04()) {
                Log.w(A01(0, 7, 126), A01(15, 45, 72));
                A06 = i42.A07();
            } else if (A002 == 4 && A003 >= 8) {
                int A0E = i42.A0E();
                int A0I = i42.A0I();
                int A08 = A0I == 49 ? i42.A08() : 0;
                int A0E2 = i42.A0E();
                if (A0I == 47) {
                    i42.A0Z(1);
                }
                boolean z10 = A0E == 181 && (A0I == 49 || A0I == 47) && A0E2 == 3;
                if (A0I == 49) {
                    z10 &= A08 == A02 || A08 == A01;
                }
                if (z10) {
                    i42.A0Z(1);
                    int A0E3 = (i42.A0E() & 31) * 3;
                    int A062 = i42.A06();
                    for (C9 c92 : c9Arr) {
                        i42.A0Y(A062);
                        c92.AFv(i42, A0E3);
                        c92.AFw(j10, 1, A0E3, 0, null);
                    }
                }
            }
            i42.A0Y(A06);
        }
    }

    static {
        A02();
        A02 = IK.A08(A01(11, 4, 108));
        A01 = IK.A08(A01(7, 4, 108));
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(com.facebook.ads.redexgen.X.I4 r3) {
        /*
            r2 = 0
        L1:
            int r0 = r3.A04()
            if (r0 != 0) goto L9
            r0 = -1
            return r0
        L9:
            int r1 = r3.A0E()
            int r2 = r2 + r1
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.G3.A00(com.facebook.ads.redexgen.X.I4):int");
    }
}
