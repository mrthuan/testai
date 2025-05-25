package com.bytedance.sdk.openadsdk.cJ;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: OpenAppSuccEvent.java */
/* loaded from: classes.dex */
public class ABk {
    private static volatile ABk Qhi;
    private Map<String, Object> Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private final Handler f8612ac;
    private HandlerThread cJ;
    private final Executor CJ = Executors.newCachedThreadPool();

    /* renamed from: fl  reason: collision with root package name */
    private cJ f8613fl = cJ.Qhi();

    /* compiled from: OpenAppSuccEvent.java */
    /* loaded from: classes.dex */
    public static class Qhi implements Serializable, Runnable {
        public String CJ;

        /* renamed from: ac  reason: collision with root package name */
        public tP f8614ac;

        /* renamed from: fl  reason: collision with root package name */
        public Map<String, Object> f8615fl;
        public final AtomicInteger Qhi = new AtomicInteger(0);
        public final AtomicBoolean cJ = new AtomicBoolean(false);

        public Qhi(tP tPVar, String str, Map<String, Object> map) {
            this.f8614ac = tPVar;
            this.CJ = str;
            this.f8615fl = map;
        }

        public static Qhi Qhi(tP tPVar, String str, Map<String, Object> map) {
            return new Qhi(tPVar, str, map);
        }

        public void cJ() {
            this.Qhi.incrementAndGet();
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            boolean z10;
            if (this.f8614ac != null && !TextUtils.isEmpty(this.CJ)) {
                if (this.cJ.get()) {
                    str = "dpl_success";
                } else {
                    str = "dpl_failed";
                }
                if (this.f8615fl == null) {
                    this.f8615fl = new HashMap();
                }
                tP tPVar = this.f8614ac;
                if (tPVar != null && tPVar.nR() == 0) {
                    Map<String, Object> map = this.f8615fl;
                    tP tPVar2 = this.f8614ac;
                    if (tPVar2 != null && !tPVar2.CJ()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    map.put("auto_click", Boolean.valueOf(z10));
                }
                this.f8615fl.put("lifeCycleInit", Boolean.valueOf(com.bytedance.sdk.openadsdk.core.pA.Qhi().ac()));
                ac.Qhi(this.f8614ac, this.CJ, str, this.f8615fl);
            }
        }

        public Qhi Qhi(boolean z10) {
            this.cJ.set(z10);
            return this;
        }

        public int Qhi() {
            return this.Qhi.get();
        }
    }

    /* compiled from: OpenAppSuccEvent.java */
    /* loaded from: classes.dex */
    public static class cJ {
        public int Qhi = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;
        public int cJ = 6000;

        private cJ() {
        }

        public static cJ Qhi() {
            return new cJ();
        }
    }

    private ABk() {
        if (this.cJ == null) {
            HandlerThread handlerThread = new HandlerThread("OpenAppSuccEvent_HandlerThread", 10);
            this.cJ = handlerThread;
            handlerThread.start();
        }
        this.f8612ac = new Handler(this.cJ.getLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.cJ.ABk.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                Qhi qhi;
                if (message.what == 100) {
                    Object obj = message.obj;
                    if (obj != null && (obj instanceof Qhi)) {
                        qhi = (Qhi) obj;
                    } else {
                        qhi = null;
                    }
                    if (qhi != null) {
                        ABk.this.cJ(qhi);
                        return true;
                    }
                    return true;
                }
                return true;
            }
        });
    }

    private void ac(Qhi qhi) {
        if (qhi == null) {
            return;
        }
        this.CJ.execute(qhi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(Qhi qhi) {
        if (qhi == null) {
            return;
        }
        boolean CJ = com.bytedance.sdk.openadsdk.core.pA.Qhi().CJ();
        boolean Qhi2 = com.bytedance.sdk.openadsdk.core.pA.Qhi().Qhi(true);
        if (!CJ && Qhi2) {
            Qhi(qhi);
            return;
        }
        if (qhi.f8615fl == null) {
            qhi.f8615fl = new HashMap();
        }
        qhi.f8615fl.put("is_background", Boolean.valueOf(CJ));
        qhi.f8615fl.put("has_focus", Boolean.valueOf(Qhi2));
        ac(qhi.Qhi(true));
    }

    public static ABk Qhi() {
        if (Qhi == null) {
            synchronized (ABk.class) {
                if (Qhi == null) {
                    Qhi = new ABk();
                }
            }
        }
        return Qhi;
    }

    public ABk Qhi(Map<String, Object> map) {
        this.Tgh = map;
        return Qhi();
    }

    public void Qhi(tP tPVar, String str) {
        Message obtainMessage = this.f8612ac.obtainMessage();
        obtainMessage.what = 100;
        obtainMessage.obj = Qhi.Qhi(tPVar, str, this.Tgh);
        obtainMessage.sendToTarget();
    }

    private void Qhi(Qhi qhi) {
        if (qhi == null) {
            return;
        }
        qhi.cJ();
        int Qhi2 = qhi.Qhi();
        cJ cJVar = this.f8613fl;
        if (Qhi2 * cJVar.Qhi > cJVar.cJ) {
            ac(qhi.Qhi(false));
            return;
        }
        Message obtainMessage = this.f8612ac.obtainMessage();
        obtainMessage.what = 100;
        obtainMessage.obj = qhi;
        this.f8612ac.sendMessageDelayed(obtainMessage, this.f8613fl.Qhi);
    }
}
