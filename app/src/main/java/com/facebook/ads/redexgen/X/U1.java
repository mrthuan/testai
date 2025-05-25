package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class U1 implements LG {
    public static String[] A01 = {"", "vSeS2rx23zUd4am5Wdo", "UtlZDzt7", "dNEruPHPdkyj182N7GwirLXq8Db2eecB", "b1VGcsOgsecYYY6uN1zNid8VodysKnsR", "yg", "RqC1uxvv784HDfNbZXUq5U9jCsQW0kUg", "5jFX4DLWV5nBObgEbVC73yk5ncCVY3Kv"};
    public final /* synthetic */ C0677Ab A00;

    public U1(C0677Ab c0677Ab) {
        this.A00 = c0677Ab;
    }

    @Override // com.facebook.ads.redexgen.X.LG
    public final void ABb() {
        Q4 q42;
        int i10;
        Q4 q43;
        q42 = this.A00.A0F;
        i10 = this.A00.A0A;
        q42.ABi(i10);
        q43 = this.A00.A0F;
        q43.ABK();
    }

    @Override // com.facebook.ads.redexgen.X.LG
    public final void ADF(float f10) {
        int i10;
        boolean z10;
        T7 t72;
        int duration;
        boolean z11;
        int i11;
        Q4 q42;
        i10 = this.A00.A0A;
        float f11 = i10 - f10;
        z10 = this.A00.A0V;
        if (z10) {
            duration = 0;
        } else {
            t72 = this.A00.A0I;
            duration = t72.getDuration();
        }
        float f12 = f11 + duration;
        C0677Ab c0677Ab = this.A00;
        if (A01[4].charAt(2) != 'V') {
            throw new RuntimeException();
        }
        A01[7] = "iUY2DHYRiluzyO05ci2O9gzQrrq6c2GK";
        z11 = c0677Ab.A0V;
        if (!z11) {
            i11 = this.A00.A09;
        } else {
            C0677Ab c0677Ab2 = this.A00;
            String[] strArr = A01;
            if (strArr[5].length() != strArr[1].length()) {
                A01[4] = "jZVNpY3PkhFJgbxs6TiKD4bRtw9FJmgD";
                i11 = c0677Ab2.A0A;
            } else {
                throw new RuntimeException();
            }
        }
        float seenTime = i11;
        float f13 = f12 / seenTime;
        q42 = this.A00.A0F;
        q42.AHJ(f13);
    }
}
