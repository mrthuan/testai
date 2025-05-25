package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public final class AD {
    public int A00;
    public int A01;
    public Handler A03;
    public Object A04;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final AB A0A;
    public final AC A0B;
    public final AM A0C;
    public long A02 = -9223372036854775807L;
    public boolean A05 = true;

    public AD(AB ab2, AC ac2, AM am2, int i10, Handler handler) {
        this.A0A = ab2;
        this.A0B = ac2;
        this.A0C = am2;
        this.A03 = handler;
        this.A01 = i10;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final long A02() {
        return this.A02;
    }

    public final Handler A03() {
        return this.A03;
    }

    public final AC A04() {
        return this.A0B;
    }

    public final AD A05() {
        AbstractC0844Hf.A04(!this.A09);
        if (this.A02 == -9223372036854775807L) {
            AbstractC0844Hf.A03(this.A05);
        }
        this.A09 = true;
        this.A0A.AGF(this);
        return this;
    }

    public final AD A06(int i10) {
        AbstractC0844Hf.A04(!this.A09);
        this.A00 = i10;
        return this;
    }

    public final AD A07(Object obj) {
        AbstractC0844Hf.A04(!this.A09);
        this.A04 = obj;
        return this;
    }

    public final AM A08() {
        return this.A0C;
    }

    public final Object A09() {
        return this.A04;
    }

    public final synchronized void A0A(boolean z10) {
        this.A07 |= z10;
        this.A08 = true;
        notifyAll();
    }

    public final boolean A0B() {
        return this.A05;
    }

    public final synchronized boolean A0C() throws InterruptedException {
        AbstractC0844Hf.A04(this.A09);
        AbstractC0844Hf.A04(this.A03.getLooper().getThread() != Thread.currentThread());
        while (!this.A08) {
            wait();
        }
        return this.A07;
    }

    public final synchronized boolean A0D() {
        return this.A06;
    }
}
