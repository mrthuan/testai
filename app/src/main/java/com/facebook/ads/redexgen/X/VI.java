package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class VI extends AbstractC1101Rj {
    public static String[] A01 = {"M3Te92XvVv4q3bfKEkaCq6oPQP87x4vv", "LzmiiHhJsyKuUkJv7K1Ir2o", "KopJ75", "b4r1pmUHtrvrrbICXjY", "ceBgm8EiRhrot5ffXZtZ35omPt2ZFFf0", "0EayevzsZQe4lRY4RLfa4MEWre", "N9h8Vj", "K1Ob6mZ8MwS9WZtXZ80XEzEALvtTcRJ2"};
    public final /* synthetic */ C0974Mm A00;

    public VI(C0974Mm c0974Mm) {
        this.A00 = c0974Mm;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1101Rj
    public final void A03() {
        AbstractC0968Mg abstractC0968Mg;
        C1102Rk c1102Rk;
        C0957Lv c0957Lv;
        WeakReference weakReference;
        C1102Rk c1102Rk2;
        C0957Lv c0957Lv2;
        AbstractC0968Mg abstractC0968Mg2;
        C1102Rk c1102Rk3;
        abstractC0968Mg = this.A00.A07;
        if (abstractC0968Mg != null) {
            abstractC0968Mg2 = this.A00.A07;
            if (!abstractC0968Mg2.A0D()) {
                c1102Rk3 = this.A00.A09;
                c1102Rk3.A0T();
                return;
            }
        }
        c1102Rk = this.A00.A09;
        c1102Rk.A0V();
        c0957Lv = this.A00.A05;
        if (!c0957Lv.A07()) {
            c0957Lv2 = this.A00.A05;
            c0957Lv2.A05();
        }
        weakReference = this.A00.A0B;
        InterfaceC0973Ml listener = (InterfaceC0973Ml) weakReference.get();
        if (listener != null) {
            listener.ACA();
        }
        C0974Mm c0974Mm = this.A00;
        String[] strArr = A01;
        if (strArr[1].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[1] = "2rS8p9kEkH8XxeBlGl7RSlB";
        strArr2[3] = "nqXy6qNf0NylKakjBUJ";
        c1102Rk2 = c0974Mm.A09;
        c1102Rk2.A0V();
    }
}
