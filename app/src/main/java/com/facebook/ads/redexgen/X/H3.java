package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class H3 {
    public static byte[] A07;
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Uri A04;
    public final String A05;
    public final byte[] A06;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 105);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{111, 99, 110, Field.MERGESEQ, Field.GREETINGLINE, Field.MERGESEQ, 121, Field.LISTNUM, Field.AUTOTEXT, Field.TOA, 113, Field.FORMCHECKBOX};
    }

    public H3(Uri uri, long j10, long j11, long j12, String str, int i10) {
        this(uri, null, j10, j11, j12, str, i10);
    }

    public H3(Uri uri, long j10, long j11, String str) {
        this(uri, j10, j10, j11, str, 0);
    }

    public H3(Uri uri, long j10, long j11, String str, int i10) {
        this(uri, j10, j10, j11, str, i10);
    }

    public H3(Uri uri, byte[] bArr, long j10, long j11, long j12, String str, int i10) {
        boolean z10 = true;
        AbstractC0844Hf.A03(j10 >= 0);
        AbstractC0844Hf.A03(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        AbstractC0844Hf.A03(z10);
        this.A04 = uri;
        this.A06 = bArr;
        this.A01 = j10;
        this.A03 = j11;
        this.A02 = j12;
        this.A05 = str;
        this.A00 = i10;
    }

    public final boolean A02(int i10) {
        return (this.A00 & i10) == i10;
    }

    public final String toString() {
        StringBuilder append = new StringBuilder().append(A00(2, 9, 67)).append(this.A04);
        String A00 = A00(0, 2, 42);
        return append.append(A00).append(Arrays.toString(this.A06)).append(A00).append(this.A01).append(A00).append(this.A03).append(A00).append(this.A02).append(A00).append(this.A05).append(A00).append(this.A00).append(A00(11, 1, 115)).toString();
    }
}
