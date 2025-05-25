package com.bytedance.sdk.component.Sf.Qhi;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.CQU;

/* compiled from: HandlerPool.java */
/* loaded from: classes.dex */
public class Qhi {
    private final fl<cJ> Qhi;
    private Handler cJ;

    /* compiled from: HandlerPool.java */
    /* renamed from: com.bytedance.sdk.component.Sf.Qhi.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0080Qhi {
        private static final Qhi Qhi = new Qhi();
    }

    public Handler cJ() {
        if (this.cJ == null) {
            synchronized (Qhi.class) {
                if (this.cJ == null) {
                    this.cJ = Qhi("csj_io_handler");
                }
            }
        }
        return this.cJ;
    }

    private Qhi() {
        this.Qhi = fl.Qhi(2);
    }

    public static Qhi Qhi() {
        return C0080Qhi.Qhi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(final Handler handler, final Handler handler2) {
        if (handler.getLooper().getQueue().isIdle()) {
            handler.removeCallbacksAndMessages(null);
            handler.getLooper().quit();
            return;
        }
        handler2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.Sf.Qhi.Qhi.1
            @Override // java.lang.Runnable
            public void run() {
                Qhi.this.Qhi(handler, handler2);
            }
        }, 1000L);
    }

    private cJ cJ(CQU.Qhi qhi, String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return new cJ(handlerThread, qhi);
    }

    public CQU Qhi(CQU.Qhi qhi, final String str) {
        cJ Qhi = this.Qhi.Qhi();
        if (Qhi != null) {
            Qhi.Qhi(qhi);
            Qhi.post(new Runnable() { // from class: com.bytedance.sdk.component.Sf.Qhi.Qhi.2
                @Override // java.lang.Runnable
                public void run() {
                    Thread.currentThread().setName(str);
                }
            });
            return Qhi;
        }
        return cJ(qhi, str);
    }

    public CQU Qhi(String str) {
        return Qhi((CQU.Qhi) null, str);
    }

    public boolean Qhi(CQU cqu) {
        if (cqu instanceof cJ) {
            cJ cJVar = (cJ) cqu;
            if (this.Qhi.Qhi((fl<cJ>) cJVar)) {
                return true;
            }
            cJVar.cJ();
            return true;
        }
        return false;
    }
}
