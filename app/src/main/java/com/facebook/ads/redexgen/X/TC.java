package com.facebook.ads.redexgen.X;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class TC implements InterfaceC1077Ql {
    public final C1314Zs A00;
    public final J7 A01;
    public final C1074Qi A02;
    public final T7 A03;
    public final String A06;
    public final AbstractC1121Sd A05 = new AbstractC1121Sd() { // from class: com.facebook.ads.redexgen.X.9W
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.AbstractC06488x
        /* renamed from: A00 */
        public final void A03(C9P c9p) {
            C1314Zs c1314Zs;
            c1314Zs = TC.this.A00;
            c1314Zs.A0E().AG3();
            TC.this.A06();
        }
    };
    public final AbstractC1127Sj A04 = new AbstractC1127Sj() { // from class: com.facebook.ads.redexgen.X.9V
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.AbstractC06488x
        /* renamed from: A00 */
        public final void A03(C9R c9r) {
            C1314Zs c1314Zs;
            c1314Zs = TC.this.A00;
            c1314Zs.A0E().AG1();
            TC.this.A06();
        }
    };

    public TC(C1314Zs c1314Zs, J7 j72, T7 t72, String str, C1132So c1132So, Map<String, String> extraParams) {
        this.A00 = c1314Zs;
        this.A01 = j72;
        this.A06 = str;
        this.A03 = t72;
        this.A02 = new C1074Qi(t72, str, extraParams);
        if (C0877Im.A21(this.A00)) {
            this.A00.A0E().AFy();
            c1132So.A0l(this);
            return;
        }
        this.A00.A0E().AFz();
        this.A03.getEventBus().A03(this.A05, this.A04);
    }

    public final void A05() {
        TD td2 = new TD(this);
        if (this.A03.A0m()) {
            ExecutorC0959Lx.A00(td2);
        } else {
            this.A03.getStateHandler().post(td2);
        }
    }

    public final synchronized void A06() {
        this.A01.AAR(this.A06, this.A02.A05());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1077Ql
    public final void ACZ() {
        this.A00.A0E().AG2();
        A06();
    }
}
