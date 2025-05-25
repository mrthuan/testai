package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public class H7 extends AbstractC1494cp<EnumC04360e> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 115);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{Field.FORMDROPDOWN, Field.LISTNUM, Field.ADDIN, Field.ADDIN};
    }

    public H7(String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1494cp
    /* renamed from: A05 */
    public final C0Y A04(EnumC04360e enumC04360e) {
        return new C0Y(this, enumC04360e == null ? A00(0, 4, 114) : enumC04360e.A03());
    }
}
