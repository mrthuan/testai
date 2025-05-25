package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public class VE implements LG {
    public static byte[] A01;
    public final /* synthetic */ VA A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Field.FILESIZE, Field.ADDIN, 80, Field.MERGESEQ, Field.FORMCHECKBOX, Field.NOTEREF, 77, Field.FORMCHECKBOX, Field.AUTOTEXT};
    }

    public VE(VA va2) {
        this.A00 = va2;
    }

    @Override // com.facebook.ads.redexgen.X.LG
    public final void ABb() {
        boolean z10;
        boolean z11;
        z10 = this.A00.A0C;
        if (!z10) {
            z11 = this.A00.A0B;
            if (!z11) {
                this.A00.A0U(false, A00(0, 9, 80));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.LG
    public final void ADF(float f10) {
    }
}
