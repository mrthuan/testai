package com.facebook.ads.redexgen.X;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class HM extends AbstractC1504cz {
    public static byte[] A01;
    public final long A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 38);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-31, -11, 12, -76, 7, -3, 14, -7, -76, 1, 9, 7, 8, -76, -10, -7, -76, 4, 3, 7, -3, 8, -3, 10, -7, -76, 2, 9, 1, -10, -7, 6, -75};
    }

    public HM(long j10) {
        if (j10 > 0) {
            this.A00 = j10;
            return;
        }
        throw new IllegalArgumentException(A00(0, 33, 110));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1504cz
    public final boolean A08(File file, long j10, int i10) {
        return j10 <= this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1504cz, com.facebook.ads.redexgen.X.C0B
    public final /* bridge */ /* synthetic */ void AH9(File file) throws IOException {
        super.AH9(file);
    }
}
