package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Tz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1169Tz implements InterfaceC1006Ns {
    public static byte[] A01;
    public static String[] A02 = {"BeK4HZWWIRhrC207wWuIOn", "ZxUaKMHZMCvHIxTDkc1UvZSYXikI2iYM", "xy0Ab8m7NOX4ZRxTfyGPwRY1TRrgVPC4", "ij8auLNb9rfA8yI55JUjNirWgnYpCp0M", "e9T4yeifuMgQg3dKDn6E2LsVBs4fgiHR", "ibrxpSG6qut0wBAmR6wSiB8exNotCqiu", "LMYPYXdb4SaVI93FsN1uYFih9", "8N3vGs6nddgUWUG"};
    public final /* synthetic */ A6 A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[6].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A02[2] = "F3dYTVgRpzEGoEWMN2T8FFCtbrhRHRBi";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 99);
            i13++;
        }
    }

    public static void A01() {
        A01 = new byte[]{21, 19, 5, 18, Field.BARCODE, 14, 1, 22, 9, 7, 1, 20, 9, 15, 14, Field.BARCODE, 9, 1, 2};
    }

    static {
        A01();
    }

    public C1169Tz(A6 a62) {
        this.A00 = a62;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1006Ns
    public final void ACw(String str) {
        C0998Nk c0998Nk;
        C0998Nk c0998Nk2;
        this.A00.A0Q = false;
        c0998Nk = this.A00.A0F;
        c0998Nk.setProgress(100);
        c0998Nk2 = this.A00.A0F;
        M3.A0N(c0998Nk2, 8);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1006Ns
    public final void ACy(String str) {
        C0998Nk c0998Nk;
        C0997Nj c0997Nj;
        boolean z10;
        int i10;
        this.A00.A0Q = true;
        c0998Nk = this.A00.A0F;
        M3.A0N(c0998Nk, 0);
        c0997Nj = this.A00.A0E;
        c0997Nj.setUrl(str);
        z10 = this.A00.A0P;
        if (!z10) {
            A6 a62 = this.A00;
            if (A02[5].charAt(30) != 'i') {
                throw new RuntimeException();
            }
            A02[7] = "LFtEVX0D7i5Pos5vlgnVVb1H7Q5y";
            i10 = a62.A02;
            if (i10 > 1) {
                this.A00.A0P = true;
                this.A00.A0g(A00(0, 19, 3));
            }
        }
        A6.A05(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1006Ns
    public final void ADG(int i10) {
        boolean z10;
        C0998Nk c0998Nk;
        z10 = this.A00.A0Q;
        if (z10) {
            c0998Nk = this.A00.A0F;
            c0998Nk.setProgress(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1006Ns
    public final void ADJ(String str) {
        C0997Nj c0997Nj;
        c0997Nj = this.A00.A0E;
        c0997Nj.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1006Ns
    public final void ADL() {
        ((U6) this.A00).A0A.ABR(14);
    }
}
