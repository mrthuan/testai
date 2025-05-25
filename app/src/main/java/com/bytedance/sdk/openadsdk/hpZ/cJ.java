package com.bytedance.sdk.openadsdk.hpZ;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: CrashMonitor.java */
/* loaded from: classes.dex */
public class cJ {
    private int CJ;
    private ScheduledExecutorService Qhi = null;

    /* renamed from: ac  reason: collision with root package name */
    private long f9318ac = 0;
    private hm cJ;

    /* renamed from: fl  reason: collision with root package name */
    private Qhi f9319fl;

    /* compiled from: CrashMonitor.java */
    /* loaded from: classes.dex */
    public interface Qhi {
    }

    public cJ(hm hmVar, int i10) {
        this.cJ = hmVar;
        this.CJ = i10;
    }

    public void Qhi(long j10) {
        this.f9318ac = j10;
    }

    public boolean cJ() {
        ScheduledExecutorService scheduledExecutorService = this.Qhi;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }

    public void Qhi(int i10) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.Qhi = newScheduledThreadPool;
        newScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hpZ.cJ.1
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                long unused = cJ.this.f9318ac;
                if (System.currentTimeMillis() - cJ.this.f9318ac > cJ.this.CJ) {
                    cJ.this.Qhi.shutdown();
                    if (cJ.this.cJ != null) {
                        cJ.this.cJ.cJ(0, "Automatic detection of stuck");
                    }
                    if (cJ.this.f9319fl != null) {
                        Qhi unused2 = cJ.this.f9319fl;
                    }
                }
            }
        }, 0L, i10, TimeUnit.MILLISECONDS);
    }

    public void Qhi() {
        ScheduledExecutorService scheduledExecutorService = this.Qhi;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }
}
