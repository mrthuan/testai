package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;

/* loaded from: assets/audience_network.dex */
public class EA implements Runnable {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ EL A01;

    public EA(EL el2, ConditionVariable conditionVariable) {
        this.A01 = el2;
        this.A00 = conditionVariable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.open();
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
