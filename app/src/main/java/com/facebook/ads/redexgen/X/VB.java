package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class VB implements QT {
    public static byte[] A01;
    public final /* synthetic */ VA A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{25, 23, 9, 22, 7, 16, 13, 7, 15};
    }

    public VB(VA va2) {
        this.A00 = va2;
    }

    public /* synthetic */ VB(VA va2, VH vh2) {
        this(va2);
    }

    @Override // com.facebook.ads.redexgen.X.QT
    public final void ABe() {
        this.A00.A0U(true, A00(0, 9, 106));
    }

    @Override // com.facebook.ads.redexgen.X.QT
    public final void ACA() {
        boolean z10;
        AbstractC1456cD abstractC1456cD;
        MR mr;
        N9 n92;
        J7 j72;
        AbstractC1456cD abstractC1456cD2;
        QV qv;
        QV qv2;
        C1314Zs c1314Zs;
        N9 n93;
        AbstractC1456cD abstractC1456cD3;
        AbstractC1456cD abstractC1456cD4;
        C1314Zs c1314Zs2;
        AbstractC1456cD abstractC1456cD5;
        AbstractC1456cD abstractC1456cD6;
        C1314Zs c1314Zs3;
        z10 = this.A00.A0Z;
        if (!z10) {
            abstractC1456cD = this.A00.A0I;
            if (!TextUtils.isEmpty(abstractC1456cD.A1U())) {
                j72 = this.A00.A0M;
                abstractC1456cD2 = this.A00.A0I;
                String A1U = abstractC1456cD2.A1U();
                O8 o82 = new O8();
                qv = this.A00.A07;
                O8 A03 = o82.A03(qv.getViewabilityChecker());
                qv2 = this.A00.A07;
                j72.AA6(A1U, A03.A02(qv2.getTouchDataRecorder()).A05());
                c1314Zs = this.A00.A0L;
                C0920Kh A00 = C0920Kh.A00(c1314Zs);
                n93 = this.A00.A0R;
                String A83 = n93.A83();
                abstractC1456cD3 = this.A00.A0I;
                A00.A0E(A83, abstractC1456cD3.A1U());
                abstractC1456cD4 = this.A00.A0I;
                C1T A1Q = abstractC1456cD4.A1Q();
                c1314Zs2 = this.A00.A0L;
                C1T.A07(A1Q, c1314Zs2);
                abstractC1456cD5 = this.A00.A0I;
                String A0a = abstractC1456cD5.A0a();
                abstractC1456cD6 = this.A00.A0I;
                C2M.A02(A0a, AbstractC0940Le.A00(abstractC1456cD6.A0c()));
                c1314Zs3 = this.A00.A0L;
                c1314Zs3.A0E().A36();
            }
            mr = this.A00.A0Q;
            n92 = this.A00.A0R;
            mr.A4P(n92.A7Z());
        }
    }

    @Override // com.facebook.ads.redexgen.X.QT
    public final void ACV() {
        MR mr;
        N9 n92;
        mr = this.A00.A0Q;
        n92 = this.A00.A0R;
        mr.A4P(n92.A7M());
    }

    @Override // com.facebook.ads.redexgen.X.QT
    public final void AEC() {
        MR mr;
        mr = this.A00.A0Q;
        mr.ABR(15);
    }
}
