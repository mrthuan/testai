package com.bytedance.sdk.component;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: TTQueuedWork.java */
/* loaded from: classes.dex */
public class ac {
    private static volatile Handler cJ;
    private static final Object Qhi = new Object();

    /* renamed from: ac  reason: collision with root package name */
    private static final LinkedList<Runnable> f8115ac = new LinkedList<>();
    private static Object CJ = new Object();

    /* compiled from: TTQueuedWork.java */
    /* loaded from: classes.dex */
    public static class Qhi extends Handler {
        public Qhi(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    ac.ac();
                } catch (OutOfMemoryError unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ac() {
        LinkedList linkedList;
        synchronized (CJ) {
            synchronized (Qhi) {
                LinkedList<Runnable> linkedList2 = f8115ac;
                linkedList = (LinkedList) linkedList2.clone();
                linkedList2.clear();
                cJ().removeMessages(1);
            }
            if (linkedList.size() > 0) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }
    }

    private static Handler cJ() {
        Handler handler;
        if (cJ == null) {
            synchronized (Qhi) {
                if (cJ == null) {
                    HandlerThread handlerThread = new HandlerThread("queued-work-looper", -2);
                    handlerThread.start();
                    cJ = new Qhi(handlerThread.getLooper());
                }
                handler = cJ;
            }
            return handler;
        }
        return cJ;
    }

    public static void Qhi(Runnable runnable, boolean z10) {
        try {
            Handler cJ2 = cJ();
            synchronized (Qhi) {
                f8115ac.add(runnable);
                if (z10) {
                    cJ2.sendEmptyMessageDelayed(1, 100L);
                } else {
                    cJ2.sendEmptyMessage(1);
                }
            }
        } catch (OutOfMemoryError unused) {
        }
    }
}
