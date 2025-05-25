package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Za  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1296Za implements InterfaceC1106Ro {
    public static byte[] A01;
    public final C1313Zr A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{82, Field.FILLIN, 76, Field.NOTEREF, Field.FILLIN, Field.LISTNUM, 101, 101, 102, Field.FILLIN, Field.HYPERLINK, 101, Byte.MAX_VALUE, 126, 99, 100, 109, Field.FILLIN, Field.GREETINGLINE, 101, 97, 111, 100, 12, 10, Field.NUMCHARS, 11, Field.ADVANCE, 24, 30, Field.NUMCHARS, 23, 13};
    }

    public C1296Za(C1313Zr c1313Zr) {
        this.A00 = c1313Zr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1106Ro
    public final Map<String, String> A6A(boolean z10) {
        HashMap hashMap = new HashMap();
        if (!C6H.A00().A04()) {
            hashMap.put(A00(0, 23, 64), C06418q.A00().A01(this.A00, true).A03());
        }
        hashMap.put(A00(23, 10, 51), AbstractC06448t.A06(new C8O(this.A00), this.A00, z10));
        return hashMap;
    }
}
