package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.cK  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1463cK extends AbstractC04480r {
    public static byte[] A02;
    public final C1461cI A00;
    public final J7 A01;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 26);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{Field.FORMTEXT, Field.FILESIZE, 74, 74, Field.SECTION, 86};
    }

    public C1463cK(C1314Zs c1314Zs, AbstractC04490s abstractC04490s, C1102Rk c1102Rk, J7 j72, C1461cI c1461cI) {
        super(c1314Zs, abstractC04490s, c1102Rk);
        this.A01 = j72;
        this.A00 = c1461cI;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04480r
    public final void A06(Map<String, String> map) {
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A6r())) {
            this.A02.A0E().A36();
            C2M.A02(this.A00.A0X(), AbstractC0940Le.A00(A01(0, 6, 62)));
            this.A01.AA6(this.A00.A6r(), map);
            if (C0877Im.A14(this.A02)) {
                String adPlacementType = AdPlacementType.MEDIUM_RECTANGLE.toString();
                C0920Kh A00 = C0920Kh.A00(this.A02);
                String placementType = this.A00.A6r();
                A00.A0E(adPlacementType, placementType);
            }
        }
    }
}
