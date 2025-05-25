package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Fn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0804Fn extends AbstractC1456cD {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{Field.BARCODE, 60, Field.MACROBUTTON, Field.MACROBUTTON, 56, Field.GLOSSARY};
    }

    public C0804Fn(List<C1F> list) {
        super(list);
    }

    public static C0804Fn A02(JSONObject jSONObject, C1314Zs c1314Zs) {
        C0804Fn c0804Fn = new C0804Fn(AbstractC1456cD.A08(jSONObject, c1314Zs, new C1455cC()));
        c0804Fn.A1Y(jSONObject);
        c0804Fn.A0u(A03(0, 6, 6));
        return c0804Fn;
    }

    @Override // com.facebook.ads.redexgen.X.C1E
    public final int A0R() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.C1E
    public final int A0S() {
        return 0;
    }
}
