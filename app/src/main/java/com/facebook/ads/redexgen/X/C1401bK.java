package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bK  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1401bK {
    public static byte[] A03;
    public final C2R A00;
    public final InterfaceC1082Qq A01;
    public final List<C1400bJ> A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 36);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-11, -10, -29, -10, -21, -11, -10, -21, -27, -11, -60, -75, -61, -60, -61};
    }

    public C1401bK(List<C2P> list, Bundle bundle, InterfaceC1082Qq interfaceC1082Qq) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC1082Qq;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A00(10, 5, 76));
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.A02.add(new C1400bJ(list.get(i10), (Bundle) parcelableArrayList.get(i10)));
        }
        this.A00 = (C2R) AbstractC0942Lg.A00(bundle.getByteArray(A00(0, 10, 126)));
    }

    public C1401bK(List<C2P> list, InterfaceC1082Qq interfaceC1082Qq) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC1082Qq;
        for (C2P c2p : list) {
            this.A02.add(new C1400bJ(c2p));
        }
        this.A00 = new C2R();
    }

    public final Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(A00(0, 10, 126), AbstractC0942Lg.A01(this.A00));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.A02.size());
        for (C1400bJ c1400bJ : this.A02) {
            Bundle bundle2 = c1400bJ.A05();
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(A00(10, 5, 76), arrayList);
        return bundle;
    }

    public final C2R A03() {
        return this.A00;
    }

    public final void A04() {
        this.A00.A03();
        for (C1400bJ c1400bJ : this.A02) {
            c1400bJ.A06();
        }
    }

    public final void A05() {
        this.A00.A02();
    }

    public final void A06(double d10, double d11) {
        if (d11 >= 0.0d) {
            this.A00.A05(d10, d11);
        }
        double A8i = this.A01.A8i();
        this.A00.A04(d10, A8i);
        for (C1400bJ c1400bJ : this.A02) {
            c1400bJ.A07(d10, A8i);
        }
    }
}
