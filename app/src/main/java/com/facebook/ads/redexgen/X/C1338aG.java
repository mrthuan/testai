package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.aG  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1338aG implements C6X {
    public static String[] A02 = {"XqTxzibSN1zAjaiM9LtVSqsxSG", "xqN5bEwB0Nihon7KSuA", "FVkOY26I4teb9ftOLmk9A45ZS3TS2DIY", "wzTDEcMKt7VvW9W8eKeIWksTnJ0tE", "iGRCr9OHUARnshCNCmKS3XNzEIA09VDm", "MJLgHxMJm3Fw", "S", "m77T1m6dtAhGTcgbhkAg"};
    public final List<C1473cU> A00;
    public final /* synthetic */ C1337aF A01;

    public C1338aG(C1337aF c1337aF, List<C1473cU> list) {
        this.A01 = c1337aF;
        this.A00 = list;
    }

    private void A00() {
        C05735o c05735o;
        C05735o c05735o2;
        C05735o c05735o3;
        C1314Zs c1314Zs;
        C05735o c05735o4;
        C05735o c05735o5;
        C1314Zs c1314Zs2;
        c05735o = this.A01.A00;
        c05735o.A05(true);
        c05735o2 = this.A01.A00;
        c05735o2.A02();
        c05735o3 = this.A01.A00;
        c05735o3.A03(0);
        Iterator<C1473cU> it = this.A00.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A02[4].charAt(3) == 'E') {
                throw new RuntimeException();
            }
            A02[0] = "GKxyFdZ7ADxfGJ";
            if (hasNext) {
                c1314Zs = this.A01.A01;
                WA A0K = W7.A0K();
                c05735o4 = this.A01.A00;
                W7 w7 = new W7(c1314Zs, it.next(), null, A0K, c05735o4.A01());
                if (w7.A0y() != null && w7.A0y().A0F() != null) {
                    ((AbstractC1432bp) w7.A0y().A0F()).A00(w7);
                }
                c05735o5 = this.A01.A00;
                c1314Zs2 = this.A01.A01;
                c05735o5.A04(new NativeAd(c1314Zs2, w7));
            } else {
                KP.A00(new C1339aH(this));
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C6X
    public final void ABT() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.X.C6X
    public final void ABc() {
        A00();
    }
}
