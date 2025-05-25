package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Tb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1145Tb extends KY {
    public static byte[] A01;
    public final /* synthetic */ C06519a A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 16);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{11, Field.AUTONUMOUT, Field.SYMBOL, 56, Field.GOTOBUTTON, 125, Field.MACROBUTTON, 56, 43, 56, Field.GLOSSARY, 125, Field.DDEAUTO, 41, 60, Field.GLOSSARY, 41, 56, Field.SYMBOL, 125, Field.DDE, Field.EQ, 60, 36, Field.AUTONUMOUT, Field.MACROBUTTON, 58};
    }

    public C1145Tb(C06519a c06519a) {
        this.A00 = c06519a;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        boolean z10;
        z10 = this.A00.A0E;
        if (!z10) {
            this.A00.A0M(A00(0, 27, 77));
        }
    }
}
