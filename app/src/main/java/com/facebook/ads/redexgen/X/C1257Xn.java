package com.facebook.ads.redexgen.X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Xn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1257Xn implements DV {
    public static byte[] A02;
    public MediaCodecInfo[] A00;
    public final int A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 13);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{33, Field.IMPORT, Field.EQ, Field.FILLIN, 32, Field.IMPORT, Byte.MAX_VALUE, 34, Field.USERADDRESS, Field.MACROBUTTON, 43, 48, Field.MACROBUTTON, Field.EQ, Field.SYMBOL};
    }

    public C1257Xn(boolean z10) {
        this.A01 = z10 ? 1 : 0;
    }

    private void A01() {
        if (this.A00 == null) {
            this.A00 = new MediaCodecList(this.A01).getCodecInfos();
        }
    }

    @Override // com.facebook.ads.redexgen.X.DV
    public final int A6s() {
        A01();
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.X.DV
    public final MediaCodecInfo A6t(int i10) {
        A01();
        return this.A00[i10];
    }

    @Override // com.facebook.ads.redexgen.X.DV
    public final boolean A9g(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A00(0, 15, 95));
    }

    @Override // com.facebook.ads.redexgen.X.DV
    public final boolean AG5() {
        return true;
    }
}
