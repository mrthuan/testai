package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class GP extends AbstractC1491cm {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{Field.ADDRESSBLOCK, 122, 114, 119, 126, Byte.MAX_VALUE, 59, 111, 116, 59, 116, 107, 126, 117, 59, 119, 114, 117, 112, 59, 110, 105, 119, 33, 59, Field.INCLUDEPICTURE, Field.FORMTEXT, Field.SECTION, Field.INCLUDETEXT};
    }

    static {
        A01();
        A03 = GP.class.getSimpleName();
    }

    public GP(C1314Zs c1314Zs, J7 j72, String str, Uri uri, Map<String, String> mExtraData, C04450o c04450o, boolean z10) {
        super(c1314Zs, j72, str, c04450o, z10);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1491cm
    public final EnumC04380g A0D() {
        EnumC04380g enumC04380g = EnumC04380g.A09;
        if (((AbstractC1491cm) this).A02) {
            enumC04380g = A0G();
        }
        A0E(this.A01, enumC04380g);
        return enumC04380g;
    }

    public final EnumC04380g A0G() {
        EnumC04380g enumC04380g = EnumC04380g.A09;
        try {
            L2.A0C(new L2(), ((AbstractC04390h) this).A00, L5.A00(this.A00.getQueryParameter(A00(25, 4, 67))), ((AbstractC04390h) this).A02);
            return enumC04380g;
        } catch (Exception unused) {
            String str = A00(0, 25, 119) + this.A00.toString();
            return EnumC04380g.A04;
        }
    }
}
