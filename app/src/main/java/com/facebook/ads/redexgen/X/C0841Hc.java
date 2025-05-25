package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;

/* renamed from: com.facebook.ads.redexgen.X.Hc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0841Hc extends Thread {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C1232Wl A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0841Hc(C1232Wl c1232Wl, String str, ConditionVariable conditionVariable) {
        super(str);
        this.A01 = c1232Wl;
        this.A00 = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            synchronized (this.A01) {
                this.A00.open();
                this.A01.A04();
            }
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
