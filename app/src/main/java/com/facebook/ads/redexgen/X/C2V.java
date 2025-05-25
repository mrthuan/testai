package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONArray;

/* renamed from: com.facebook.ads.redexgen.X.2V  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2V {
    public static byte[] A03;
    public JF A00;
    public final List<String> A02 = new ArrayList();
    public final List<String> A01 = new ArrayList();

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 90);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-53, -45, -39, -30, -40, Field.NUMWORDS, 15, Field.NUMCHARS, 15, 21, 19, 13, 15, 18, 13, 30, 32, 19, 20, 19, 32, 19, Field.NUMCHARS, 17, 19, 33, -7, -6, -2, -13, -7, -8, -3, -23, -3, -17, -10, -17, -19, -2, -17, -18, Field.SECTIONPAGES, Field.INCLUDEPICTURE, 48, Field.SECTION, Field.INCLUDEPICTURE, 0, -2, -16, -3, -22, -11, -6, 0, -3, -7, -16, 4, -36, -51, -34, -60, -58, -46, -60, -50, -60, -40, -54, -54, -50, -45, -52, -60, -39, -51, -50, -40};
    }

    public C2V() {
    }

    public C2V(JF jf2) {
        this.A00 = jf2;
    }

    public final Map<String, String> A02() {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(47, 12, 49), new JSONArray((Collection) this.A02).toString());
        hashMap.put(A00(26, 16, 48), new JSONArray((Collection) this.A01).toString());
        return hashMap;
    }

    public final void A03() {
        this.A02.clear();
        this.A01.clear();
    }

    public final void A04() {
        this.A02.add(A00(5, 21, 84));
        if (this.A00 != null) {
            this.A00.A04(JE.A0B, null);
        }
    }

    public final void A05() {
        this.A02.add(A00(42, 5, 117));
    }

    public final void A06() {
        this.A02.add(A00(59, 20, 11));
        if (this.A00 != null) {
            this.A00.A04(JE.A0C, null);
        }
    }

    public final void A07(int i10) {
        this.A01.add(String.valueOf(i10));
    }

    public final void A08(C2U c2u) {
        this.A02.add(c2u.A03() + A00(1, 4, 26));
        if (this.A00 != null) {
            this.A00.A04(JE.A09, null);
        }
    }

    public final void A09(C2U c2u, int i10) {
        this.A02.add(c2u.A03() + A00(0, 1, 18) + i10);
    }

    public final boolean A0A() {
        return (this.A02.isEmpty() && this.A01.isEmpty()) ? false : true;
    }
}
