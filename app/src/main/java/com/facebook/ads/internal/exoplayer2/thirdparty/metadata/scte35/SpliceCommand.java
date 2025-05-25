package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class SpliceCommand implements Metadata.Entry {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 35);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-77, -93, -76, -91, -115, -109, -107, Byte.MIN_VALUE, -45, -48, -52, -55, -61, -59, Byte.MIN_VALUE, -61, -49, -51, -51, -63, -50, -60, -102, Byte.MIN_VALUE, -44, -39, -48, -59, -99};
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return A02(0, 29, 61) + getClass().getSimpleName();
    }
}
