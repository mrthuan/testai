package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* loaded from: assets/audience_network.dex */
public class B0 extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ Z3 A01;

    public B0(Z3 z32, AudioTrack audioTrack) {
        this.A01 = z32;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.flush();
            this.A00.release();
            conditionVariable = this.A01.A0f;
            conditionVariable.open();
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
