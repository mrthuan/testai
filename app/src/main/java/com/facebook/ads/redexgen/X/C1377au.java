package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.au  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1377au implements InterfaceC05464m {
    public static byte[] A04;
    public int A00;
    public int A01;
    public int A02;
    public int[] A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 51);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-95, -74, -50, -60, -54, -55, 117, -59, -60, -56, -66, -55, -66, -60, -61, -56, 117, -62, -54, -56, -55, 117, -73, -70, 117, -61, -60, -61, -126, -61, -70, -68, -74, -55, -66, -53, -70, -117, -92, -77, -96, -89, Field.HTMLCONTROL, -97, -92, -82, -81, -100, -87, -98, -96, Field.HTMLCONTROL, -88, -80, -82, -81, Field.HTMLCONTROL, -99, -96, Field.HTMLCONTROL, -87, -86, -87, 104, -87, -96, -94, -100, -81, -92, -79, -96};
    }

    public final void A02() {
        if (this.A03 != null) {
            Arrays.fill(this.A03, -1);
        }
        this.A00 = 0;
    }

    public final void A03(int i10, int i11) {
        this.A01 = i10;
        this.A02 = i11;
    }

    public final void A04(FL fl2, boolean z10) {
        this.A00 = 0;
        if (this.A03 != null) {
            Arrays.fill(this.A03, -1);
        }
        AbstractC05484o abstractC05484o = fl2.A06;
        if (fl2.A04 != null && abstractC05484o != null && abstractC05484o.A1U()) {
            if (z10) {
                if (!fl2.A00.A0B()) {
                    abstractC05484o.A1r(fl2.A04.A0E(), this);
                }
            } else if (!fl2.A1p()) {
                abstractC05484o.A1q(this.A01, this.A02, fl2.A0s, this);
            }
            if (this.A00 > abstractC05484o.A00) {
                abstractC05484o.A00 = this.A00;
                abstractC05484o.A08 = z10;
                fl2.A0r.A0O();
            }
        }
    }

    public final boolean A05(int i10) {
        if (this.A03 != null) {
            int i11 = this.A00 * 2;
            for (int i12 = 0; i12 < i11; i12 += 2) {
                int count = this.A03[i12];
                if (count == i10) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05464m
    public final void A3o(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 >= 0) {
                int i12 = this.A00 * 2;
                if (this.A03 == null) {
                    this.A03 = new int[4];
                    Arrays.fill(this.A03, -1);
                } else {
                    int storagePosition = this.A03.length;
                    if (i12 >= storagePosition) {
                        int[] iArr = this.A03;
                        int storagePosition2 = i12 * 2;
                        this.A03 = new int[storagePosition2];
                        System.arraycopy(iArr, 0, this.A03, 0, iArr.length);
                    }
                }
                this.A03[i12] = i10;
                int storagePosition3 = i12 + 1;
                this.A03[storagePosition3] = i11;
                int storagePosition4 = this.A00;
                this.A00 = storagePosition4 + 1;
                return;
            }
            throw new IllegalArgumentException(A00(37, 35, 8));
        }
        throw new IllegalArgumentException(A00(0, 37, 34));
    }
}
