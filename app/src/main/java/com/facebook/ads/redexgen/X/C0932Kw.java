package com.facebook.ads.redexgen.X;

import android.app.Activity;

/* renamed from: com.facebook.ads.redexgen.X.Kw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0932Kw {
    public static final C0932Kw A04 = new C0932Kw(new C1213Vr(), new C1212Vq());
    public final InterfaceC0931Kv A02;
    public final InterfaceC0955Lt A03;
    public boolean A01 = true;
    public long A00 = -1;

    public C0932Kw(InterfaceC0955Lt interfaceC0955Lt, InterfaceC0931Kv interfaceC0931Kv) {
        this.A03 = interfaceC0955Lt;
        this.A02 = interfaceC0931Kv;
    }

    public static C0932Kw A00() {
        return A04;
    }

    public final synchronized void A01() {
        this.A01 = false;
        this.A00 = this.A03.A5M();
    }

    public final synchronized void A02() {
        this.A00 = -1L;
    }

    public final boolean A03() {
        Activity lastResumedActivity = this.A02.A7e();
        boolean z10 = true;
        if (lastResumedActivity != null) {
            return true;
        }
        synchronized (C0932Kw.class) {
            if (this.A01) {
                return true;
            }
            if (this.A00 >= 0 && this.A03.A5M() - this.A00 >= 1000) {
                z10 = false;
            }
            return z10;
        }
    }
}
