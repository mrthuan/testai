package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public final class LH {
    public float A00;
    public float A01;
    public long A02;
    public boolean A03;
    public boolean A04;
    public final Handler A05;
    public final LG A06;

    public LH(int i10, float f10, long j10, Handler handler, LG lg2) {
        this(i10, lg2, handler);
        this.A02 = j10;
        this.A01 = f10;
    }

    public LH(int i10, LG lg2) {
        this(i10, lg2, new Handler());
    }

    public LH(int i10, LG lg2, Handler handler) {
        this.A04 = false;
        this.A00 = i10;
        this.A06 = lg2;
        this.A05 = handler;
        this.A02 = 250L;
        this.A01 = 0.25f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        this.A00 -= this.A01;
        this.A06.ADF(this.A00);
        if (this.A00 <= 0.0f && !this.A03) {
            this.A03 = true;
            this.A06.ABb();
            this.A04 = false;
        }
    }

    public final boolean A04() {
        return this.A00 <= 0.0f;
    }

    public final boolean A05() {
        return this.A04;
    }

    public final boolean A06() {
        if (A05()) {
            this.A04 = false;
            return true;
        }
        return false;
    }

    public final boolean A07() {
        if (A04() && !this.A03) {
            this.A03 = true;
            this.A06.ABb();
        }
        if (A04() || A05()) {
            return false;
        }
        this.A04 = true;
        this.A06.ADF(this.A00);
        this.A05.postDelayed(new C1210Vo(this), this.A02);
        return true;
    }
}
