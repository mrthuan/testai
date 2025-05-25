package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Window;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.inmobi.commons.core.configs.CrashConfig;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ActivityLifecycleListener.java */
/* loaded from: classes.dex */
public class Qhi implements Application.ActivityLifecycleCallbacks {
    public static boolean Qhi = false;

    /* renamed from: ac  reason: collision with root package name */
    public static long f9367ac;
    public static long cJ;
    private volatile WeakReference<Activity> ABk;
    private final AtomicBoolean CJ = new AtomicBoolean(false);

    /* renamed from: fl  reason: collision with root package name */
    private final RunnableC0138Qhi f9368fl = new RunnableC0138Qhi();
    private final fl Tgh = new fl();
    private final ac ROR = new ac();
    private final cJ Sf = new cJ();

    /* renamed from: hm  reason: collision with root package name */
    private int f9369hm = 0;
    private volatile CopyOnWriteArrayList<WeakReference<com.bytedance.sdk.component.adexpress.Qhi>> WAv = new CopyOnWriteArrayList<>();
    private HandlerThread Gm = null;

    /* renamed from: zc  reason: collision with root package name */
    private Handler f9370zc = null;
    private final LinkedList<Activity> iMK = new LinkedList<>();

    /* compiled from: ActivityLifecycleListener.java */
    /* renamed from: com.bytedance.sdk.openadsdk.utils.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0138Qhi implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            lG.ac(new com.bytedance.sdk.component.Sf.hm("reportPvFromBackGround") { // from class: com.bytedance.sdk.openadsdk.utils.Qhi.Qhi.1
                @Override // java.lang.Runnable
                public void run() {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    /* compiled from: ActivityLifecycleListener.java */
    /* loaded from: classes.dex */
    public class Tgh implements Runnable {
        private boolean CJ;

        /* renamed from: ac  reason: collision with root package name */
        private long f9371ac;
        private long cJ;

        public Tgh(long j10, long j11, boolean z10) {
            this.cJ = j10;
            this.f9371ac = j11;
            this.CJ = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.CJ) {
                com.bytedance.sdk.openadsdk.Gm.ac.Qhi().Qhi(this.cJ / 1000, this.f9371ac / 1000);
            }
            Qhi.this.CJ();
        }
    }

    /* compiled from: ActivityLifecycleListener.java */
    /* loaded from: classes.dex */
    public class ac implements Runnable {
        public ac() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ApmHelper.isIsInit()) {
                Handler cJ = com.bytedance.sdk.openadsdk.core.iMK.cJ();
                Message obtain = Message.obtain(cJ, Qhi.this.f9368fl);
                obtain.what = 1001;
                cJ.sendMessageDelayed(obtain, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
            }
        }
    }

    /* compiled from: ActivityLifecycleListener.java */
    /* loaded from: classes.dex */
    public static class cJ implements Runnable {
        private cJ() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.CJ.MQ.Qhi().cJ();
            if (!com.bytedance.sdk.openadsdk.core.settings.HzH.YD().HUk().Qhi() && com.bytedance.sdk.component.utils.hpZ.Sf(com.bytedance.sdk.openadsdk.core.HzH.Qhi())) {
                com.bytedance.sdk.openadsdk.cJ.Qhi.fl.Qhi(com.bytedance.sdk.openadsdk.core.zc.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi()));
            }
        }
    }

    /* compiled from: ActivityLifecycleListener.java */
    /* loaded from: classes.dex */
    public class fl implements Runnable {
        public fl() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.iMK.cJ().removeMessages(1001);
            if (com.bytedance.sdk.openadsdk.core.HzH.Qhi() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.Tgh.Qhi.cJ();
        }
    }

    public Qhi() {
        ac();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void CJ() {
        com.bytedance.sdk.openadsdk.cJ.Qhi.Qhi.Qhi();
    }

    private void ac() {
        HandlerThread handlerThread = new HandlerThread("lifecycle", 10);
        this.Gm = handlerThread;
        handlerThread.start();
        this.f9370zc = new Handler(this.Gm.getLooper());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.iMK.addFirst(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.WAv != null && this.WAv.size() > 0) {
            Iterator<WeakReference<com.bytedance.sdk.component.adexpress.Qhi>> it = this.WAv.iterator();
            while (it.hasNext()) {
                WeakReference<com.bytedance.sdk.component.adexpress.Qhi> next = it.next();
                if (next != null && next.get() != null) {
                    try {
                        next.get().Qhi(activity);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (this.ABk != null && this.ABk.get() == activity) {
            this.ABk = null;
        }
        this.iMK.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        int i10 = this.f9369hm - 1;
        this.f9369hm = i10;
        if (i10 < 0) {
            this.f9369hm = 0;
        }
        if (ApmHelper.isIsInit()) {
            Qhi(this.ROR);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Qhi(this.Tgh);
        if (!Qhi) {
            cJ = System.currentTimeMillis();
            Qhi = true;
        }
        this.ABk = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.f9369hm++;
        this.f9370zc.removeCallbacks(this.Sf);
        if (this.CJ.get()) {
            Qhi(this.Sf);
        }
        this.CJ.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.f9369hm <= 0) {
            this.CJ.set(true);
        }
        if (Qhi()) {
            Qhi = false;
            com.bytedance.sdk.openadsdk.core.iMK.cJ.set(false);
            f9367ac = System.currentTimeMillis();
            Qhi(this.Sf);
        }
        Qhi(new Tgh(cJ, f9367ac, Qhi()));
    }

    private void Qhi(Runnable runnable) {
        if (!this.Gm.isAlive()) {
            ac();
        }
        this.f9370zc.postDelayed(runnable, 1000L);
    }

    public boolean cJ(com.bytedance.sdk.component.adexpress.Qhi qhi) {
        return this.WAv.remove(new WeakReference(qhi));
    }

    public Activity cJ() {
        if (this.iMK.isEmpty()) {
            return null;
        }
        return this.iMK.getFirst();
    }

    public void Qhi(com.bytedance.sdk.component.adexpress.Qhi qhi) {
        this.WAv.add(new WeakReference<>(qhi));
    }

    public boolean Qhi() {
        return this.CJ.get();
    }

    public boolean Qhi(boolean z10) {
        Activity activity;
        Window window;
        return (this.ABk == null || (activity = this.ABk.get()) == null || (window = activity.getWindow()) == null) ? z10 : window.getDecorView().hasWindowFocus();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
