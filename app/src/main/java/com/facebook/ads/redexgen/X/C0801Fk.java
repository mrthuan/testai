package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Fk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0801Fk extends AbstractC1456cD implements Serializable {
    public static byte[] A00 = null;
    public static String[] A01 = {"r6wxjppTPk8qqzLRyjcbdQcA77ZMVo55", "Rh6olI4hONJ8yannxuNSF0WPku4wNPsq", "dN5FaQTClehdtxF9CoF19H85hY8wkvGi", "rjB6kg9SBUGr2KH1eIh2YUrCeaZ2IjVH", "uwE4iuczSrXuOAqhix1jvRvaNYVxSPYl", "nB4f3mkqn6tAKhT6MHcT9FS4Qvlri7ut", "bNzGTI7RRMeGoANXUPkwX9ogVwA9ri6n", "cACVCPwRSeRCIlqlGfLHSAYd9Lc4yhZp"};
    public static final long serialVersionUID = 2751287062553772011L;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 87);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        String[] strArr = A01;
        if (strArr[2].charAt(16) == strArr[1].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[2] = "vDQKNoss9qiPXd8S2Aus0c1HGbd5gMQl";
        strArr2[1] = "nSwGzQN60p1E6knkFapFA8fuyb3FeF6N";
        A00 = new byte[]{Field.MACROBUTTON, Field.ASK, 56, 34, Field.MACROBUTTON, Field.PAGEREF, Field.ASK, Field.PAGEREF, 32, Field.IMPORT, 42, Field.PAGEREF, Field.ASK, 48};
    }

    static {
        A04();
    }

    public C0801Fk(List<C1F> list) {
        super(list);
    }

    public static C0801Fk A02(JSONObject jSONObject, C1314Zs c1314Zs) {
        C0801Fk c0801Fk = new C0801Fk(AbstractC1456cD.A08(jSONObject, c1314Zs, new C1451c8()));
        c0801Fk.A1Y(jSONObject);
        c0801Fk.A0u(A03(0, 14, 106));
        return c0801Fk;
    }

    @Override // com.facebook.ads.redexgen.X.C1E
    public final int A0R() {
        if (A14()) {
            return 3;
        }
        C04581b A06 = A1P().A0E().A06();
        String[] strArr = A01;
        if (strArr[2].charAt(16) != strArr[1].charAt(16)) {
            A01[7] = "ezJ8b8PzsS2LRx1DwJprOyWzSGtMGS3H";
            if (A06 != null) {
                C1F A1P = A1P();
                String[] strArr2 = A01;
                if (strArr2[5].charAt(18) != strArr2[3].charAt(18)) {
                    A01[7] = "ok7knfjrqIuTR3wAzxIRCawOj6kVTRCj";
                    if (A1P.A0E().A06().A0O()) {
                        return 4;
                    }
                    return 1;
                }
                throw new RuntimeException();
            }
            return 0;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.C1E
    public final int A0S() {
        return A1P().A0E().A04();
    }
}
