package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class IM {
    public static byte[] A05;
    public static String[] A06 = {"CKr41w14t1O2cryEh3ikvT7i7pEP9", "bEGBJQHGeZKUb4WdZIGxqLwvmRBgZ", "WJDScLHbi8oxsdfQony1oDJlSLfJGxpw", "pOlO7zhgFKlhBGXLhLjwOcF", "rLNLh63NT4PjFgFvGilm0aaXO1", "ZBDxHqybdlnYnJoT5A", "oQHJZTGiGZIE4PPH2KMpxcomJFI3fhl6", "Q2Q9yYe5Vhv4fwSqVMC8JpXgrnkYYd7U"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final List<byte[]> A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static IM A00(I4 i42) throws A0 {
        try {
            i42.A0Z(4);
            int A0E = (i42.A0E() & 3) + 1;
            if (A0E != 3) {
                ArrayList arrayList = new ArrayList();
                int A0E2 = i42.A0E() & 31;
                for (int i10 = 0; i10 < A0E2; i10++) {
                    arrayList.add(A03(i42));
                }
                int A0E3 = i42.A0E();
                for (int i11 = 0; i11 < A0E3; i11++) {
                    arrayList.add(A03(i42));
                }
                int i12 = -1;
                int i13 = -1;
                float f10 = 1.0f;
                if (A0E2 > 0) {
                    C0864Hz A062 = I0.A06((byte[]) arrayList.get(0), A0E, ((byte[]) arrayList.get(0)).length);
                    i12 = A062.A06;
                    i13 = A062.A02;
                    f10 = A062.A00;
                    String[] strArr = A06;
                    if (strArr[0].length() != strArr[1].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A06;
                    strArr2[0] = "iF8GnQ9Q0rYocX5fL90VsceL3jxlg";
                    strArr2[1] = "Hokd8PUOGTr7ZNbLj7TXmfqAgif2w";
                }
                return new IM(arrayList, A0E, i12, i13, f10);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new A0(A01(0, 24, 113), e10);
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 16);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{36, 19, 19, 14, 19, Field.SECTION, 17, 0, 19, 18, 8, 15, 6, Field.SECTION, 32, Field.IMPORT, 34, Field.SECTION, 2, 14, 15, 7, 8, 6};
    }

    static {
        A02();
    }

    public IM(List<byte[]> initializationData, int i10, int i11, int i12, float f10) {
        this.A04 = initializationData;
        this.A02 = i10;
        this.A03 = i11;
        this.A01 = i12;
        this.A00 = f10;
    }

    public static byte[] A03(I4 i42) {
        int A0I = i42.A0I();
        int offset = i42.A06();
        i42.A0Z(A0I);
        return AbstractC0848Hj.A08(i42.A00, offset, A0I);
    }
}
