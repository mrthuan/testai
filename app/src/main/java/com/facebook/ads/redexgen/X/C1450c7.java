package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.c7  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1450c7 implements InterfaceC04631g {
    public static String[] A07 = {"LaTcnwnUfzgLTffZJQ1IPucRbglpEgMo", "12hOZJfgSqwHBnuTqXHxpHxEQ0NbZO7A", "Dr9pHE3G5odEHWCsCqxBSNpdFpwa86Mh", "MDWd5GjifHIGoqp8wS2KmhLcZ8", "Ozio236b3SA3ZtX", "C3UkekSSOdUqAnfYGByVev7l4a4YpLBv", "Q070rE4WAmrDPncHn0R1JG2tySYrh7TO", ""};
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1456cD A01;
    public final /* synthetic */ C1454cB A02;
    public final /* synthetic */ InterfaceC04631g A03;
    public final /* synthetic */ C04641h A04;
    public final /* synthetic */ C1314Zs A05;
    public final /* synthetic */ EnumSet A06;

    public C1450c7(C04641h c04641h, C1314Zs c1314Zs, AbstractC1456cD abstractC1456cD, C1454cB c1454cB, int i10, InterfaceC04631g interfaceC04631g, EnumSet enumSet) {
        this.A04 = c04641h;
        this.A05 = c1314Zs;
        this.A01 = abstractC1456cD;
        this.A02 = c1454cB;
        this.A00 = i10;
        this.A03 = interfaceC04631g;
        this.A06 = enumSet;
    }

    private final void A00() {
        if (this.A00 + 1 < this.A02.A1K()) {
            this.A04.A0A(this.A05, this.A06, this.A02, this.A02.A1N(this.A00 + 1), this.A00 + 1, this.A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04631g
    public final void AB4(AdError adError) {
        if (this.A00 == 0) {
            this.A03.AB4(adError);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04631g
    public final void AB5() {
        this.A05.A00().AGG(this.A01.A1U(), this.A02.A1O());
        if (this.A00 == 0) {
            InterfaceC04631g interfaceC04631g = this.A03;
            String[] strArr = A07;
            if (strArr[5].charAt(13) != strArr[6].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "Mfrds6r17BKRZSfVfcuH4MZ0YR";
            strArr2[4] = "cdrsota1fCopt7F";
            interfaceC04631g.AB5();
        }
        A00();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04631g
    public final void AEv() {
        if (this.A00 == 0) {
            this.A03.AEv();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04631g
    public final void AHE() {
        if (this.A00 == 0) {
            this.A03.AHE();
        }
    }
}
