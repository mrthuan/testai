package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.Arrays;
import lib.zj.office.fc.hpsf.Variant;

/* renamed from: com.facebook.ads.redexgen.X.Xr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1261Xr implements InterfaceC0723Bx {
    public static byte[] A05;
    public static final C0 A06;
    public int A00;
    public int A01;
    public InterfaceC0725Bz A02;
    public C9 A03;
    public C1260Xq A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-97, -72, -67, -65, -70, -70, -71, -68, -66, -81, -82, 106, -71, -68, 106, -65, -72, -68, -81, -83, -71, -79, -72, -77, -60, -81, -82, 106, -63, -85, -64, 106, -78, -81, -85, -82, -81, -68, 120, -33, -13, -30, -25, -19, -83, -16, -33, -11};
    }

    static {
        A01();
        A06 = new C1262Xs();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final void A9D(InterfaceC0725Bz interfaceC0725Bz) {
        this.A02 = interfaceC0725Bz;
        this.A03 = interfaceC0725Bz.AHA(0, 1);
        this.A04 = null;
        interfaceC0725Bz.A5u();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final int AEk(InterfaceC0724By interfaceC0724By, C4 c42) throws IOException, InterruptedException {
        if (this.A04 == null) {
            this.A04 = DK.A00(interfaceC0724By);
            if (this.A04 != null) {
                this.A03.A69(Format.A06(null, A00(39, 9, 62), null, this.A04.A00(), Variant.VT_RESERVED, this.A04.A03(), this.A04.A04(), this.A04.A02(), null, null, 0, null));
                this.A00 = this.A04.A01();
            } else {
                throw new A0(A00(0, 39, 10));
            }
        }
        if (!this.A04.A07()) {
            DK.A03(interfaceC0724By, this.A04);
            this.A02.AG8(this.A04);
        }
        int AFu = this.A03.AFu(interfaceC0724By, Variant.VT_RESERVED - this.A01, true);
        if (AFu != -1) {
            this.A01 += AFu;
        }
        int i10 = this.A01 / this.A00;
        if (i10 > 0) {
            long A052 = this.A04.A05(interfaceC0724By.A86() - this.A01);
            int i11 = this.A00 * i10;
            this.A01 -= i11;
            this.A03.AFw(A052, 1, i11, this.A01, null);
        }
        return AFu == -1 ? -1 : 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final void AG7(long j10, long j11) {
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final boolean AGs(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        return DK.A00(interfaceC0724By) != null;
    }
}
