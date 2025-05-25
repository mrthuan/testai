package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: WeakHandler.java */
/* loaded from: classes.dex */
public class CQU extends Handler {
    protected WeakReference<Qhi> Qhi;

    /* compiled from: WeakHandler.java */
    /* loaded from: classes.dex */
    public interface Qhi {
        void Qhi(Message message);
    }

    public CQU(Qhi qhi) {
        if (qhi != null) {
            this.Qhi = new WeakReference<>(qhi);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Qhi qhi;
        WeakReference<Qhi> weakReference = this.Qhi;
        if (weakReference != null && (qhi = weakReference.get()) != null && message != null) {
            qhi.Qhi(message);
        }
    }

    public CQU(Looper looper, Qhi qhi) {
        super(looper);
        if (qhi != null) {
            this.Qhi = new WeakReference<>(qhi);
        }
    }
}
