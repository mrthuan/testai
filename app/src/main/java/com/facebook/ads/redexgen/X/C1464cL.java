package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.cL  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1464cL extends AbstractC04480r {
    public static byte[] A06;
    public static final String A07;
    public C1466cN A00;
    public EnumC0896Jj A01;
    public boolean A02;
    public final C1314Zs A03;
    public final J7 A04;
    public final AbstractC1012Ny A05;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{-55, -56, -43, -43, -52, -39};
    }

    static {
        A05();
        A07 = C1464cL.class.getSimpleName();
    }

    public C1464cL(C1314Zs c1314Zs, J7 j72, AbstractC1012Ny abstractC1012Ny, C1102Rk c1102Rk, AbstractC04490s abstractC04490s, EnumC0896Jj enumC0896Jj) {
        super(c1314Zs, abstractC04490s, c1102Rk);
        this.A04 = j72;
        this.A05 = abstractC1012Ny;
        this.A03 = c1314Zs;
        this.A01 = enumC0896Jj;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04480r
    public final void A06(Map<String, String> map) {
        String adPlacementType;
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A6r())) {
            this.A03.A0E().A36();
            C2M.A02(this.A00.A05(), AbstractC0940Le.A00(A04(0, 6, 50)));
            this.A04.AA6(this.A00.A6r(), map);
            if (C0877Im.A14(this.A03)) {
                if (this.A01 == EnumC0896Jj.A09) {
                    adPlacementType = AdPlacementType.MEDIUM_RECTANGLE.toString();
                } else {
                    adPlacementType = AdPlacementType.BANNER.toString();
                }
                C0920Kh A00 = C0920Kh.A00(this.A03);
                String placementType = this.A00.A6r();
                A00.A0E(adPlacementType, placementType);
            }
        }
    }

    public final synchronized void A07() {
        if (!this.A02 && this.A00 != null) {
            this.A02 = true;
            if (!TextUtils.isEmpty(this.A00.A03())) {
                ExecutorC0959Lx.A00(new C1465cM(this));
            }
        }
    }

    public final void A08(C1466cN c1466cN) {
        this.A00 = c1466cN;
    }
}
