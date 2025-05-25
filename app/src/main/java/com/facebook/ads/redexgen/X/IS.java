package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class IS {
    public static byte[] A02;
    public final int A00;
    public final List<byte[]> A01;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 112);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{44, Field.AUTOTEXTLIST, Field.AUTOTEXTLIST, 86, Field.AUTOTEXTLIST, 7, Field.CONTROL, Field.NOTEREF, Field.AUTOTEXTLIST, Field.LISTNUM, 80, Field.DOCPROPERTY, 78, 7, Field.GLOSSARY, 44, 61, 42, 7, 74, 86, Field.DOCPROPERTY, 77, 80, 78};
    }

    public IS(List<byte[]> initializationData, int i10) {
        this.A01 = initializationData;
        this.A00 = i10;
    }

    public static IS A00(I4 i42) throws A0 {
        try {
            i42.A0Z(21);
            int A0E = i42.A0E() & 3;
            int A0E2 = i42.A0E();
            int i10 = 0;
            int A06 = i42.A06();
            for (int i11 = 0; i11 < A0E2; i11++) {
                i42.A0Z(1);
                int csdStartPosition = i42.A0I();
                for (int csdLength = 0; csdLength < csdStartPosition; csdLength++) {
                    int numberOfArrays = i42.A0I();
                    int lengthSizeMinusOne = numberOfArrays + 4;
                    i10 += lengthSizeMinusOne;
                    i42.A0Z(numberOfArrays);
                }
            }
            i42.A0Y(A06);
            byte[] bArr = new byte[i10];
            int bufferPosition = 0;
            for (int i12 = 0; i12 < A0E2; i12++) {
                i42.A0Z(1);
                int A0I = i42.A0I();
                for (int csdStartPosition2 = 0; csdStartPosition2 < A0I; csdStartPosition2++) {
                    int csdLength2 = i42.A0I();
                    byte[] bArr2 = I0.A03;
                    int numberOfArrays2 = I0.A03.length;
                    System.arraycopy(bArr2, 0, bArr, bufferPosition, numberOfArrays2);
                    int lengthSizeMinusOne2 = I0.A03.length;
                    int bufferPosition2 = bufferPosition + lengthSizeMinusOne2;
                    byte[] bArr3 = i42.A00;
                    int lengthSizeMinusOne3 = i42.A06();
                    System.arraycopy(bArr3, lengthSizeMinusOne3, bArr, bufferPosition2, csdLength2);
                    bufferPosition = bufferPosition2 + csdLength2;
                    i42.A0Z(csdLength2);
                }
            }
            int numberOfArrays3 = A0E + 1;
            return new IS(i10 == 0 ? null : Collections.singletonList(bArr), numberOfArrays3);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new A0(A01(0, 25, 119), e10);
        }
    }
}
