package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class D4 {
    public static String[] A04 = {"2QTGoYMpfKLSzpVAlAXt3wO29bqk4RAA", "gIVLvkl7NjInzfAn9w", "LtzZXv6bjFNgAMVtXqfV0PMfXX50BMJx", "cWJguejgjTPrXLbmw", "RAr", "xZz", "IB4Qfid", "bOBzxUCB3cvUoI573SXQe51BlLqC0MhI"};
    public static final byte[] A05 = {0, 0, 1};
    public int A00;
    public int A01;
    public byte[] A02;
    public boolean A03;

    public D4(int i10) {
        this.A02 = new byte[i10];
    }

    public final void A00() {
        this.A03 = false;
        this.A00 = 0;
        this.A01 = 0;
    }

    public final void A01(byte[] bArr, int i10, int i11) {
        if (!this.A03) {
            return;
        }
        int i12 = i11 - i10;
        int length = this.A02.length;
        int readLength = this.A00;
        if (length < readLength + i12) {
            byte[] bArr2 = this.A02;
            int readLength2 = this.A00;
            byte[] copyOf = Arrays.copyOf(bArr2, (readLength2 + i12) * 2);
            if (A04[4].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[0] = "23XjLY44GlUE0KmRGTXDOChbYzVQi08X";
            strArr[7] = "Ggy0EBkUq5vQG10YsWXxjCC7KKoqUJqT";
            this.A02 = copyOf;
        }
        byte[] bArr3 = this.A02;
        int readLength3 = this.A00;
        System.arraycopy(bArr, i10, bArr3, readLength3, i12);
        int readLength4 = this.A00;
        this.A00 = readLength4 + i12;
    }

    public final boolean A02(int i10, int i11) {
        if (this.A03) {
            this.A00 -= i11;
            if (this.A01 == 0 && i10 == 181) {
                this.A01 = this.A00;
            } else {
                this.A03 = false;
                return true;
            }
        } else if (i10 == 179) {
            this.A03 = true;
        }
        A01(A05, 0, A05.length);
        return false;
    }
}
