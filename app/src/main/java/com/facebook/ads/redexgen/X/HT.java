package com.facebook.ads.redexgen.X;

import java.io.File;

/* loaded from: assets/audience_network.dex */
public class HT implements Comparable<HT> {
    public static String[] A06 = {"YtTqrr36IpTZEk4bgIvsBXk24JcVhmoU", "o2fs6uJN4rTaL", "Db4XzOO9iMDbC", "Saxp3y0", "OLcmUi74zHQznPcwd2HExE6T020fWxqu", "tCQEbNaJVz0PlCRSNnPyqV4UH5k0cfLN", "F2yQzLJFEjO2XmqsM0eh8XOkYGMJUBuc", "2g54UXZJjIjL6gHQKj3sjrDPLMAzDLyJ"};
    public final long A00;
    public final long A01;
    public final long A02;
    public final File A03;
    public final String A04;
    public final boolean A05;

    public HT(String str, long j10, long j11, long j12, File file) {
        this.A04 = str;
        this.A02 = j10;
        this.A01 = j11;
        this.A05 = file != null;
        this.A03 = file;
        this.A00 = j12;
    }

    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(HT ht) {
        if (!this.A04.equals(ht.A04)) {
            String str = this.A04;
            String str2 = ht.A04;
            String[] strArr = A06;
            if (strArr[5].charAt(7) != strArr[7].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[3] = "aYZMBjJ";
            strArr2[6] = "1NklUZMMo7CoWmkhhyfBrWe0DhkXD4Fk";
            return str.compareTo(str2);
        }
        long j10 = this.A02 - ht.A02;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public final boolean A01() {
        return !this.A05;
    }

    public final boolean A02() {
        return this.A01 == -1;
    }
}
