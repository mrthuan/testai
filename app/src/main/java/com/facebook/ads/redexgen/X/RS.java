package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class RS {
    public static byte[] A02;
    public final C0777Eb A00;
    public final X6 A01 = new X6();

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 50);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-64, -54, -66, -64, 1, -1, 19, 17, 3, -64, -66, -40, -66, -64, -74, -64, -76, -74, 6, -7, 2, -8, -7, 6, -7, 6, -35, 2, -8, -7, 12, -74, -76, -50, -76, -74, -54, Field.PAGEREF, -9, -6, 9, 16, -73, 9, 14, 5, -6, -73, -75, -49, -75, -73};
    }

    public RS(C1314Zs c1314Zs) {
        InterfaceC0823Gk trackSelectionFactory = new XD(this.A01);
        this.A00 = AbstractC06609j.A00(new ZC(c1314Zs), new D1(trackSelectionFactory), new ZE());
    }

    public static String A01(C06589h c06589h) {
        return A00(41, 11, 99) + c06589h.A01 + A00(14, 22, 98) + c06589h.A00 + A00(0, 14, 108) + c06589h.getCause() + A00(36, 2, 118);
    }

    public static boolean A03() {
        return true;
    }

    public final int A04() {
        return this.A00.A0J();
    }

    public final int A05() {
        return this.A00.A6Z();
    }

    public final long A06() {
        return this.A00.A71();
    }

    public final long A07() {
        return this.A00.A7E();
    }

    public final RQ A08() {
        Format vf2 = this.A00.A0L();
        if (vf2 == null) {
            return null;
        }
        return new RQ(vf2.A0F, vf2.A08);
    }

    public final void A09() {
        this.A00.AEy();
    }

    public final void A0A() {
        this.A00.AGA();
    }

    public final void A0B() {
        this.A00.A0M();
    }

    public final void A0C(float f10) {
        this.A00.A0N(f10);
    }

    public final void A0D(long j10) {
        this.A00.AG9(j10);
    }

    public final void A0E(Surface surface) {
        this.A00.A0O(surface);
    }

    public final void A0F(C1313Zr c1313Zr, Uri uri) {
        if (C0877Im.A2m(c1313Zr, A03())) {
            RW cacheManager = RW.A05(c1313Zr);
            XW xw = new XW(cacheManager.A0F(c1313Zr));
            String A08 = RW.A08(c1313Zr, uri);
            if (A08 != null) {
                xw.A00(A08);
            }
            this.A00.A0P(xw.A01(uri));
            return;
        }
        Ev mediaSource = new XW(new X4(c1313Zr, IK.A0K(c1313Zr, A00(38, 3, 100)), this.A01)).A01(uri);
        this.A00.A0P(mediaSource);
    }

    public final void A0G(RP rp2) {
        this.A00.A3m(new C0958Lw(this, rp2));
    }

    public final void A0H(RR rr) {
        this.A00.A0Q(new M1(this, rr));
    }

    public final void A0I(boolean z10) {
        this.A00.AGZ(z10);
    }

    public final boolean A0J() {
        return this.A00.A84();
    }

    public final boolean A0K() {
        return this.A00.A0K() != null;
    }
}
