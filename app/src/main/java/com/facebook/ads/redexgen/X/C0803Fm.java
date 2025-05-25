package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Fm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0803Fm extends AbstractC1456cD implements Serializable {
    public static byte[] A00 = null;
    public static String[] A01 = {"", "DwBpRdjhynFrlzLsBFrR", "QSeBoONoLaQYOKTzvkglRPiKzJDmlw8V", "7gQnCJoaPerIMpa6ilCeIjK7d9DzDLkx", "0G82UgBGsFbmab2LaOSe1R1N", "BET7yFkEMT8u6XlB2K", "", "QGCw11GNV2Lw2F7bA4MSMYlzIGOyIq"};
    public static final long serialVersionUID = 5751287062553772011L;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = (byte) ((copyOfRange[i13] ^ i12) ^ 54);
            if (A01[5].length() != 18) {
                throw new RuntimeException();
            }
            A01[4] = "xBe8M";
            copyOfRange[i13] = b10;
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{86, Field.ADDIN, Field.MERGESEQ, Field.LISTNUM, 77, 76, Field.MERGESEQ, 86, Field.MERGESEQ, 86, Field.GREETINGLINE, Field.FORMDROPDOWN};
    }

    static {
        A04();
    }

    public C0803Fm(List<C1F> list) {
        super(list);
    }

    public static C0803Fm A02(JSONObject jSONObject, C1314Zs c1314Zs) {
        C0803Fm c0803Fm = new C0803Fm(AbstractC1456cD.A08(jSONObject, c1314Zs, new C1453cA()));
        c0803Fm.A1Y(jSONObject);
        c0803Fm.A0u(A03(0, 12, 9));
        return c0803Fm;
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
