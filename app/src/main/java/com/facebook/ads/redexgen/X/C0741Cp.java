package com.facebook.ads.redexgen.X;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Cp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0741Cp {
    public static byte[] A0B;
    public static String[] A0C = {"M4x7QQAOQI6QpLL27N40r77s8H3llNt7", "VbZ8gbE", "3mu4QP6lx6JwSRsSGHM9", "iNtvqmskXB4EiLFcreKpIjIsuOWl8BZN", "UGy7XP0WguBLL8fH3nmB9M42lC44", "4IqsIePyereERaJF3xBx8LZ4CJfzZOfk", "eqBm2QP", "urYUV7oulzGfvchXsojW"};
    public static final int A0D;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public final int[] A09 = new int[FunctionEval.FunctionID.EXTERNAL_FUNC];
    public final I4 A0A = new I4((int) FunctionEval.FunctionID.EXTERNAL_FUNC);

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 95);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0B = new byte[]{24, 48, 48, 4, 11, 22, 30, 11, 13, 26, 11, 10, 78, 33, 9, 9, 61, 78, 13, 15, 30, 26, Field.NUMWORDS, Field.NUMCHARS, 11, 78, 30, 15, 26, 26, 11, Field.NUMCHARS, 0, 78, 15, 26, 78, 12, 11, 9, 7, 0, 78, 1, 8, 78, 30, 15, 9, 11, 44, Field.IMPORT, 42, 44, 41, 41, Field.AUTONUM, 43, Field.DDE, 60, 61, 121, 59, 48, Field.DDE, 121, 42, Field.DDE, 43, 60, 56, Field.AUTONUMOUT, 121, 43, 60, Field.GLOSSARY, 48, 42, 48, Field.AUTONUM, Field.IMPORT};
    }

    static {
        A01();
        A0D = IK.A08(A00(0, 4, 8));
    }

    public final void A02() {
        this.A03 = 0;
        this.A04 = 0;
        this.A05 = 0L;
        this.A08 = 0L;
        this.A07 = 0L;
        this.A06 = 0L;
        this.A02 = 0;
        this.A01 = 0;
        this.A00 = 0;
    }

    public final boolean A03(InterfaceC0724By interfaceC0724By, boolean z10) throws IOException, InterruptedException {
        this.A0A.A0V();
        A02();
        boolean hasEnoughBytes = interfaceC0724By.A7g() == -1 || interfaceC0724By.A7g() - interfaceC0724By.A81() >= 27;
        if (hasEnoughBytes) {
            boolean hasEnoughBytes2 = interfaceC0724By.AEP(this.A0A.A00, 0, 27, true);
            if (hasEnoughBytes2) {
                if (this.A0A.A0M() != A0D) {
                    if (z10) {
                        return false;
                    }
                    throw new A0(A00(4, 46, 49));
                }
                this.A03 = this.A0A.A0E();
                if (A0C[4].length() != 23) {
                    String[] strArr = A0C;
                    strArr[2] = "QaTpKwTFDbpFrUb1B9Gy";
                    strArr[7] = "wbjClO29YNoAV26336Re";
                    if (this.A03 != 0) {
                        if (z10) {
                            return false;
                        }
                        throw new A0(A00(50, 31, 6));
                    }
                    this.A04 = this.A0A.A0E();
                    this.A05 = this.A0A.A0J();
                    this.A08 = this.A0A.A0K();
                    this.A07 = this.A0A.A0K();
                    this.A06 = this.A0A.A0K();
                    this.A02 = this.A0A.A0E();
                    this.A01 = this.A02 + 27;
                    this.A0A.A0V();
                    interfaceC0724By.AEO(this.A0A.A00, 0, this.A02);
                    for (int i10 = 0; i10 < this.A02; i10++) {
                        this.A09[i10] = this.A0A.A0E();
                        int i11 = this.A00;
                        this.A00 = i11 + this.A09[i10];
                    }
                    return true;
                }
                throw new RuntimeException();
            }
        }
        if (z10) {
            return false;
        }
        throw new EOFException();
    }
}
