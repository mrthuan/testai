package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public class UV implements InterfaceC1006Ns {
    public static byte[] A01;
    public final /* synthetic */ UQ A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 104);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Field.TOA, Field.FORMCHECKBOX, Field.SYMBOL, Field.FORMTEXT, Field.MACROBUTTON, Field.SECTIONPAGES, Field.AUTONUMLGL, 74, 61, 59, Field.AUTONUMLGL, Field.NOTEREF, 61, Field.INCLUDEPICTURE, Field.SECTIONPAGES, Field.MACROBUTTON, 61, Field.AUTONUMLGL, Field.AUTONUM};
    }

    public UV(UQ uq) {
        this.A00 = uq;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1006Ns
    public final void ACw(String str) {
        C0998Nk c0998Nk;
        C0998Nk c0998Nk2;
        AbstractC1456cD abstractC1456cD;
        C1194Uy c1194Uy;
        AbstractC1456cD abstractC1456cD2;
        C1194Uy c1194Uy2;
        this.A00.A0U = false;
        c0998Nk = this.A00.A0I;
        c0998Nk.setProgress(100);
        c0998Nk2 = this.A00.A0I;
        M3.A0N(c0998Nk2, 8);
        abstractC1456cD = this.A00.A0G;
        if (abstractC1456cD.A1B()) {
            c1194Uy = this.A00.A0J;
            if (c1194Uy != null) {
                abstractC1456cD2 = this.A00.A0G;
                String A0f = abstractC1456cD2.A0f();
                if (!TextUtils.isEmpty(A0f)) {
                    c1194Uy2 = this.A00.A0J;
                    c1194Uy2.loadUrl(A0f);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1006Ns
    public final void ACy(String str) {
        C0998Nk c0998Nk;
        C0997Nj c0997Nj;
        boolean z10;
        int i10;
        this.A00.A0U = true;
        c0998Nk = this.A00.A0I;
        M3.A0N(c0998Nk, 0);
        c0997Nj = this.A00.A0H;
        c0997Nj.setUrl(str);
        z10 = this.A00.A0T;
        if (!z10) {
            i10 = this.A00.A01;
            if (i10 > 1) {
                this.A00.A0T = true;
                this.A00.A0f(A00(0, 19, 108));
            }
        }
        UQ.A03(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1006Ns
    public final void ADG(int i10) {
        boolean z10;
        C0998Nk c0998Nk;
        z10 = this.A00.A0U;
        if (z10) {
            c0998Nk = this.A00.A0I;
            c0998Nk.setProgress(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1006Ns
    public final void ADJ(String str) {
        C0997Nj c0997Nj;
        c0997Nj = this.A00.A0H;
        c0997Nj.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1006Ns
    public final void ADL() {
        C1026Om c1026Om;
        c1026Om = this.A00.A0L;
        c1026Om.A0A().ABR(14);
    }
}
