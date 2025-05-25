package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.aF  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1337aF implements InterfaceC04801x {
    public static byte[] A03;
    public static String[] A04 = {"2TNZv5rtJTplZyjTIrSAFwUR6QP", "UjegX20Mk8HUIHIT", "Ti96PrkTuXG6IMzmEs5GDJe0LgUxYJn1", "WKFIsio5", "sT4eIPa9", "0D70Whi8Ioa2N41OWBvmw3gUZoSjgMHO", "iH11Sl", "erLbaj7N4o7d5mJ3hEM6"};
    public C05735o A00;
    public C1314Zs A01;
    public final NativeAdBase.MediaCacheFlag A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A04[6].length() == 1) {
                throw new RuntimeException();
            }
            A04[0] = "MdmGKNh4C3mG92xgGyorPLR3SXO";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 88);
            i13++;
        }
    }

    public static void A03() {
        A03 = new byte[]{-26, -39, -20, -31, -18, -35, -28, -35, -38, -35, -34, -26, -35};
    }

    static {
        A03();
    }

    public C1337aF(C05735o c05735o, C1314Zs c1314Zs, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = c05735o;
        this.A01 = c1314Zs;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04801x
    public final void ABs(C0894Jg c0894Jg) {
        KP.A00(new C1340aI(this, c0894Jg));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04801x
    public final void ACq(List<C1473cU> list) {
        C05906f manager = new C05906f(this.A01);
        String firstRequestId = A02(6, 7, 23);
        for (C1473cU c1473cU : list) {
            if (A02(6, 7, 23).equals(firstRequestId)) {
                firstRequestId = c1473cU.A0G();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c1473cU.A0E().A0F() != null) {
                    manager.A0b(new C05886d(c1473cU.A0E().A0F().getUrl(), c1473cU.A0E().A0F().getHeight(), c1473cU.A0E().A0F().getWidth(), c1473cU.A0G(), A02(0, 6, 32)));
                }
                if (c1473cU.A0E().A0E() != null) {
                    manager.A0b(new C05886d(c1473cU.A0E().A0E().getUrl(), c1473cU.A0E().A0E().getHeight(), c1473cU.A0E().A0E().getWidth(), c1473cU.A0G(), A02(0, 6, 32)));
                }
                if (!TextUtils.isEmpty(c1473cU.A0E().A0b())) {
                    manager.A0a(new C05866b(c1473cU.A0E().A0b(), c1473cU.A0G(), A02(0, 6, 32), c1473cU.A0E().A0A()));
                }
            }
        }
        manager.A0W(new C1338aG(this, list), new C6Y(firstRequestId, A02(0, 6, 32)));
    }
}
