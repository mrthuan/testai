package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Tg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1150Tg extends KY {
    public static byte[] A01;
    public final /* synthetic */ C06519a A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{103, Field.HYPERLINK, Field.DOCPROPERTY, Field.ADVANCE, Field.GREETINGLINE, 17, Field.FORMTEXT, 80, Field.SECTIONPAGES, 17, Field.SHAPE, Field.ADVANCE, Field.FORMCHECKBOX, Field.ADVANCE, Field.INCLUDEPICTURE, 17, Field.SECTION, Field.INCLUDEPICTURE, Field.ADVANCE, Field.SECTION, 80, Field.INCLUDEPICTURE, Field.ADVANCE, Field.DOCPROPERTY};
    }

    public C1150Tg(C06519a c06519a) {
        this.A00 = c06519a;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        boolean z10;
        z10 = this.A00.A0D;
        if (!z10) {
            this.A00.A0M(A00(0, 24, 24));
        }
    }
}
