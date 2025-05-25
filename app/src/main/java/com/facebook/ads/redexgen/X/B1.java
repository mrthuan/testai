package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;

/* loaded from: assets/audience_network.dex */
public class B1 extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ Z3 A01;

    public B1(Z3 z32, AudioTrack audioTrack) {
        this.A01 = z32;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.release();
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
