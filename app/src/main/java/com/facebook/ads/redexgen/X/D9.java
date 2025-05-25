package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class D9 {
    public static String[] A05 = {"CI0RkYQ6Qrjuno4ZZrcsG8RAmoqr1Epb", "1TJpWQCADONb1iXZmn7rufjXIDpseMAW", "DbKE5eQ0SztvRB9F1cupaqpSmaw49ca0", "9uEWAfEbnoLYv0261NprGfBMsVVIAkoY", "YPS6JDYnd0jYtAwF41CrybPwMQyQCZ6b", "T1QHzlAro5gEiHcOkZamY04XD", "Tont9t0l5jTu", "TXkXlHjq7z0lWluALjQuLTxPcFeYRmgl"};
    public int A00;
    public byte[] A01;
    public boolean A02;
    public boolean A03;
    public final int A04;

    public D9(int i10, int i11) {
        this.A04 = i10;
        this.A01 = new byte[i11 + 3];
        this.A01[2] = 1;
    }

    public final void A00() {
        this.A03 = false;
        this.A02 = false;
    }

    public final void A01(int i10) {
        AbstractC0844Hf.A04(!this.A03);
        this.A03 = i10 == this.A04;
        if (this.A03) {
            this.A00 = 3;
            this.A02 = false;
        }
    }

    public final void A02(byte[] bArr, int i10, int i11) {
        if (!this.A03) {
            return;
        }
        int i12 = i11 - i10;
        int length = this.A01.length;
        int readLength = this.A00;
        if (length < readLength + i12) {
            byte[] bArr2 = this.A01;
            int readLength2 = this.A00;
            this.A01 = Arrays.copyOf(bArr2, (readLength2 + i12) * 2);
        }
        byte[] bArr3 = this.A01;
        int readLength3 = this.A00;
        System.arraycopy(bArr, i10, bArr3, readLength3, i12);
        int readLength4 = this.A00;
        this.A00 = readLength4 + i12;
    }

    public final boolean A03() {
        return this.A02;
    }

    public final boolean A04(int i10) {
        if (this.A03) {
            this.A00 -= i10;
            String[] strArr = A05;
            if (strArr[6].length() != strArr[5].length()) {
                A05[0] = "gbkiAVIrvIsexfHubLTCZsCFQN6TUjvY";
                this.A03 = false;
                this.A02 = true;
                return true;
            }
            throw new RuntimeException();
        }
        return false;
    }
}
