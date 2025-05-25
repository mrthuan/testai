package com.bytedance.adsdk.ugeno.cJ;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: WeakHandler.java */
/* loaded from: classes.dex */
public class WAv extends Handler {
    private final WeakReference<Qhi> Qhi;

    /* compiled from: WeakHandler.java */
    /* loaded from: classes.dex */
    public interface Qhi {
        void Qhi(Message message);
    }

    public WAv(Looper looper, Qhi qhi) {
        super(looper);
        this.Qhi = new WeakReference<>(qhi);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Qhi qhi = this.Qhi.get();
        if (qhi != null && message != null) {
            qhi.Qhi(message);
        }
    }
}
