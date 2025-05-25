package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* loaded from: assets/audience_network.dex */
public class R2 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C8T A00;

    public R2(C8T c8t) {
        this.A00 = c8t;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        new Handler(Looper.getMainLooper()).post(new QF(this, i10));
    }
}
