package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Zx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1319Zx extends KY {
    public static String[] A05 = {"peP5GJDM9me8QDpiMTE0HYbhk5UQvsuj", "UmJsGkUZcFFvxG21gGzKuNxtLbnsNH0B", "InCZKAYVJ2xyVT3RLHGk", "cxu83bHx4KSubY78z6WW", "55WyHuuOCemh1dLUozRA9kNqY", "hUMsj3tCoCX6inz1bILbzXUTN", "Ib1pT8H4oQaxudtz", "STVRCs5pIYaR1pHj"};
    public final /* synthetic */ C6X A00;
    public final /* synthetic */ C6Y A01;
    public final /* synthetic */ C05906f A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C1319Zx(C05906f c05906f, ArrayList arrayList, C6Y c6y, C6X c6x, ArrayList arrayList2) {
        this.A02 = c05906f;
        this.A03 = arrayList;
        this.A01 = c6y;
        this.A00 = c6x;
        this.A04 = arrayList2;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        AtomicBoolean A0D;
        C7j c7j;
        Handler handler;
        C7j c7j2;
        long j10;
        long j11;
        long j12;
        long j13;
        A0D = C05906f.A0D(this.A03);
        c7j = this.A02.A04;
        if (c7j instanceof C1314Zs) {
            c7j2 = this.A02.A04;
            C1314Zs c1314Zs = (C1314Zs) c7j2;
            if (this.A01.A00 == -1) {
                boolean z10 = A0D.get();
                String[] strArr = A05;
                if (strArr[6].length() == strArr[7].length()) {
                    String[] strArr2 = A05;
                    strArr2[3] = "VVOoEaVD2AhQqE2eihnl";
                    strArr2[2] = "7KTPepw5ZZxiUEMCto3C";
                    if (z10) {
                        C0S A0E = c1314Zs.A0E();
                        j13 = this.A02.A00;
                        A0E.A4U(C0956Lu.A01(j13));
                    } else {
                        C0S A0E2 = c1314Zs.A0E();
                        j12 = this.A02.A00;
                        A0E2.A4S(C0956Lu.A01(j12));
                    }
                }
                throw new RuntimeException();
            } else if (A0D.get()) {
                C0S A0E3 = c1314Zs.A0E();
                j11 = this.A02.A00;
                long A01 = C0956Lu.A01(j11);
                C6Y c6y = this.A01;
                String[] strArr3 = A05;
                if (strArr3[4].length() == strArr3[5].length()) {
                    String[] strArr4 = A05;
                    strArr4[4] = "xsAs6ZK2AKeTr6tr707KlGvOM";
                    strArr4[5] = "GxI5mwrGpMJ9ldsuxbhmmAcT7";
                    A0E3.A4V(A01, c6y.A00);
                }
                throw new RuntimeException();
            } else {
                C0S A0E4 = c1314Zs.A0E();
                j10 = this.A02.A00;
                A0E4.A4T(C0956Lu.A01(j10), this.A01.A00);
            }
        }
        handler = this.A02.A02;
        handler.post(new C1320Zy(this, A0D));
        C05906f.A0D(this.A04);
    }
}
