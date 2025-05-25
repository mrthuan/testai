package com.bytedance.sdk.openadsdk.MQ.Qhi;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.utils.ABk;

/* compiled from: PAGTimerManager.java */
/* loaded from: classes.dex */
public class Sf {
    private static Qhi Qhi;
    private static HandlerThread cJ;

    /* compiled from: PAGTimerManager.java */
    /* loaded from: classes.dex */
    public static class Qhi extends Handler {
        public Qhi(Looper looper) {
            super(looper);
        }

        public void Qhi(cJ cJVar) {
            if (cJVar == null) {
                return;
            }
            int intValue = cJVar.Gm().intValue();
            if (!hasMessages(intValue)) {
                Message obtain = Message.obtain();
                obtain.what = intValue;
                obtain.obj = cJVar;
                sendMessageDelayed(obtain, cJVar.Tgh());
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            cJ cJVar = (cJ) message.obj;
            if (cJVar == null) {
                return;
            }
            int cJ = cJVar.cJ();
            if (cJ == 1) {
                cJVar.ROR();
            } else if (cJ == 2) {
                cJVar.Sf();
            } else {
                Tgh.cJ(cJVar.Gm());
                return;
            }
            if (cJVar.hm()) {
                Tgh.cJ(cJVar.Gm());
            } else if (cJVar.zc()) {
                Qhi(cJVar);
            }
        }
    }

    public static void Qhi() {
    }

    public static void cJ(cJ cJVar) {
        if (cJVar == null || Qhi == null) {
            return;
        }
        try {
            int intValue = cJVar.Gm().intValue();
            if (Qhi.hasMessages(intValue)) {
                Qhi.removeMessages(intValue);
            }
        } catch (Exception unused) {
        }
    }

    public static void Qhi(cJ cJVar) {
        if (cJVar == null) {
            return;
        }
        cJ();
        Qhi qhi = Qhi;
        if (qhi != null) {
            qhi.Qhi(cJVar);
        }
    }

    public static void cJ() {
        if (Qhi != null) {
            return;
        }
        try {
            HandlerThread handlerThread = cJ;
            if (handlerThread != null && handlerThread.isAlive()) {
                return;
            }
            synchronized (Sf.class) {
                HandlerThread handlerThread2 = cJ;
                if (handlerThread2 == null || !handlerThread2.isAlive()) {
                    HandlerThread handlerThread3 = new HandlerThread("csj_MRC");
                    cJ = handlerThread3;
                    handlerThread3.start();
                    Qhi = new Qhi(cJ.getLooper());
                }
            }
        } catch (Throwable th2) {
            ABk.Qhi("MRC", th2.getMessage());
        }
    }
}
