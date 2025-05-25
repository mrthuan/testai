package com.facebook.ads.redexgen.X;

import android.os.Handler;
import com.facebook.ads.AdError;

/* loaded from: assets/audience_network.dex */
public final class X6 implements InterfaceC0833Gu, HL<Object> {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public final Handler A06;
    public final InterfaceC0832Gt A07;
    public final InterfaceC0847Hi A08;
    public final IF A09;

    public X6() {
        this(null, null, 1000000L, AdError.SERVER_ERROR_CODE, InterfaceC0847Hi.A00);
    }

    public X6(Handler handler, InterfaceC0832Gt interfaceC0832Gt, long j10, int i10, InterfaceC0847Hi interfaceC0847Hi) {
        this.A06 = handler;
        this.A07 = interfaceC0832Gt;
        this.A09 = new IF(i10);
        this.A08 = interfaceC0847Hi;
        this.A01 = j10;
    }

    private void A01(int i10, long j10, long j11) {
        if (this.A06 != null && this.A07 != null) {
            this.A06.post(new H4(this, i10, j10, j11));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0833Gu
    public final synchronized long A6V() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.HL
    public final synchronized void ABS(Object obj, int i10) {
        this.A02 += i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
        if (r16.A04 >= 524288) goto L13;
     */
    @Override // com.facebook.ads.redexgen.X.HL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void ADr(java.lang.Object r17) {
        /*
            r16 = this;
            r4 = r16
            monitor-enter(r4)
            int r0 = r4.A00     // Catch: java.lang.Throwable -> L70
            r9 = 1
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.facebook.ads.redexgen.X.AbstractC0844Hf.A04(r0)     // Catch: java.lang.Throwable -> L70
            com.facebook.ads.redexgen.X.Hi r0 = r4.A08     // Catch: java.lang.Throwable -> L70
            long r2 = r0.A5p()     // Catch: java.lang.Throwable -> L70
            long r5 = r4.A03     // Catch: java.lang.Throwable -> L70
            long r0 = r2 - r5
            int r11 = (int) r0     // Catch: java.lang.Throwable -> L70
            long r5 = r4.A05     // Catch: java.lang.Throwable -> L70
            long r0 = (long) r11     // Catch: java.lang.Throwable -> L70
            long r5 = r5 + r0
            r4.A05 = r5     // Catch: java.lang.Throwable -> L70
            long r5 = r4.A04     // Catch: java.lang.Throwable -> L70
            long r0 = r4.A02     // Catch: java.lang.Throwable -> L70
            long r5 = r5 + r0
            r4.A04 = r5     // Catch: java.lang.Throwable -> L70
            if (r11 <= 0) goto L59
            long r5 = r4.A02     // Catch: java.lang.Throwable -> L70
            r0 = 8000(0x1f40, double:3.9525E-320)
            long r5 = r5 * r0
            long r0 = (long) r11     // Catch: java.lang.Throwable -> L70
            long r5 = r5 / r0
            float r8 = (float) r5     // Catch: java.lang.Throwable -> L70
            com.facebook.ads.redexgen.X.IF r7 = r4.A09     // Catch: java.lang.Throwable -> L70
            long r5 = r4.A02     // Catch: java.lang.Throwable -> L70
            double r0 = (double) r5     // Catch: java.lang.Throwable -> L70
            double r5 = java.lang.Math.sqrt(r0)     // Catch: java.lang.Throwable -> L70
            int r0 = (int) r5     // Catch: java.lang.Throwable -> L70
            r7.A03(r0, r8)     // Catch: java.lang.Throwable -> L70
            long r7 = r4.A05     // Catch: java.lang.Throwable -> L70
            r5 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L4e
            long r7 = r4.A04     // Catch: java.lang.Throwable -> L70
            r5 = 524288(0x80000, double:2.590327E-318)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L59
        L4e:
            com.facebook.ads.redexgen.X.IF r1 = r4.A09     // Catch: java.lang.Throwable -> L70
            r0 = 1056964608(0x3f000000, float:0.5)
            float r0 = r1.A02(r0)     // Catch: java.lang.Throwable -> L70
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L70
            r4.A01 = r0     // Catch: java.lang.Throwable -> L70
        L59:
            long r12 = r4.A02     // Catch: java.lang.Throwable -> L70
            long r14 = r4.A01     // Catch: java.lang.Throwable -> L70
            r10 = r4
            r10.A01(r11, r12, r14)     // Catch: java.lang.Throwable -> L70
            int r0 = r4.A00     // Catch: java.lang.Throwable -> L70
            int r0 = r0 - r9
            r4.A00 = r0     // Catch: java.lang.Throwable -> L70
            if (r0 <= 0) goto L6a
            r4.A03 = r2     // Catch: java.lang.Throwable -> L70
        L6a:
            r0 = 0
            r4.A02 = r0     // Catch: java.lang.Throwable -> L70
            monitor-exit(r4)
            return
        L70:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.X6.ADr(java.lang.Object):void");
    }

    @Override // com.facebook.ads.redexgen.X.HL
    public final synchronized void ADs(Object obj, H3 h32) {
        if (this.A00 == 0) {
            this.A03 = this.A08.A5p();
        }
        this.A00++;
    }
}
