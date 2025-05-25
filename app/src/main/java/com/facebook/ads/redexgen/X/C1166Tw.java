package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Tw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1166Tw extends KY {
    public static byte[] A02;
    public final /* synthetic */ A6 A00;
    public final /* synthetic */ C9O A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{98, Field.DOCPROPERTY, Field.FORMTEXT, Field.FORMTEXT, Field.FILESIZE, 82, Field.TOA, 78, Field.FORMCHECKBOX, 0, Field.TOA, 78, Field.INCLUDETEXT, Field.FILESIZE, Field.FORMTEXT, Field.TOA, 78, Field.TOA, Field.ADVANCE, Field.FILESIZE, 76, Field.AUTOTEXTLIST};
    }

    public C1166Tw(A6 a62, C9O c9o) {
        this.A00 = a62;
        this.A01 = c9o;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        T7 t72;
        T7 t73;
        Q4 q42;
        t72 = this.A00.A0Z;
        if (t72.getState() == EnumC1099Rh.A02) {
            t73 = this.A00.A0Z;
            if (t73.getCurrentPositionInMillis() == A00()) {
                q42 = this.A00.A0X;
                q42.AE0(A00(0, 22, 86));
            }
        }
    }
}
