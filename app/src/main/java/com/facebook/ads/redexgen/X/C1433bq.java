package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.bq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1433bq implements AnonymousClass14 {
    public static byte[] A07;
    public static String[] A08 = {"HqViDmZKE9gqowyTLi9oGTmraxBLxdfb", "ZDhLRf5Uu21mhR1h1Q7a0O5z7jEhSu9k", "2GbaqYyT8OuzZpNttfxCN9qv1cIIYzBc", "fbbf2hOViPWoQMO0MuifN9tE3LO9hSeI", "DwEg34XuIOHddfNq0Duo86gfWbmgRcX4", "GcZc2s8wIoPvhyGTdTaWZVIVIYLPtEuL", "AIVK7lVsrhvQj", "0MZsasdmKrVN6CPRKwrl3lR9QzLAtIP"};
    public final /* synthetic */ long A03;
    public final /* synthetic */ C0798Fh A04;
    public final /* synthetic */ C8U A05;
    public final /* synthetic */ Runnable A06;
    public boolean A02 = false;
    public boolean A01 = false;
    public boolean A00 = false;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 16);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-125, -112, -112, -115, -112, -59, -53, -65};
    }

    static {
        A01();
    }

    public C1433bq(C0798Fh c0798Fh, Runnable runnable, long j10, C8U c8u) {
        this.A04 = c0798Fh;
        this.A06 = runnable;
        this.A03 = j10;
        this.A05 = c8u;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass14
    public final void ACn(C1473cU c1473cU) {
        if (!this.A00) {
            this.A00 = true;
            String[] strArr = A08;
            if (strArr[1].charAt(12) != strArr[5].charAt(12)) {
                throw new RuntimeException();
            }
            A08[0] = "A302cEzPVYQXumyZNbB7zeSxM9mEDz6J";
            this.A04.A05(this.A05.A03(C8Y.A02), null);
        }
        if (this.A04.A07 != null) {
            this.A04.A07.A0C();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass14
    public final void ACo(C1473cU c1473cU) {
        Map A01;
        if (c1473cU != this.A04.A00) {
            return;
        }
        Handler A0G = this.A04.A0G();
        Runnable runnable = this.A06;
        if (A08[7].length() != 31) {
            throw new RuntimeException();
        }
        A08[0] = "XfIEhebH8X778eyni9LsSDQR6QKL4f9o";
        A0G.removeCallbacks(runnable);
        this.A04.A01 = c1473cU;
        this.A04.A07.A0F(c1473cU);
        if (!this.A02) {
            this.A02 = true;
            A01 = this.A04.A01(this.A03);
            if (A08[3].charAt(7) == 'h') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[1] = "6CdPuG9VNNO8hZ7pQWbBuknU9qSrspmw";
            strArr[5] = "JYrF77GwPBrAhOPn8MtwFVV4pu279MHz";
            this.A04.A05(this.A05.A03(C8Y.A04), A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass14
    public final void ACp(C1473cU c1473cU) {
        if (!this.A01) {
            this.A01 = true;
            this.A04.A05(this.A05.A03(C8Y.A03), null);
        }
        this.A04.A0N();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass14
    public final void ACr(C1473cU c1473cU, C0894Jg c0894Jg) {
        Map A01;
        if (c1473cU != this.A04.A00) {
            return;
        }
        this.A04.A0G().removeCallbacks(this.A06);
        this.A04.A0P(c1473cU);
        if (!this.A02) {
            this.A02 = true;
            A01 = this.A04.A01(this.A03);
            A01.put(A00(0, 5, 14), String.valueOf(c0894Jg.A03().getErrorCode()));
            A01.put(A00(5, 3, 72), String.valueOf(c0894Jg.A04()));
            this.A04.A05(this.A05.A03(C8Y.A04), A01);
        }
        this.A04.ABs(c0894Jg);
    }
}
