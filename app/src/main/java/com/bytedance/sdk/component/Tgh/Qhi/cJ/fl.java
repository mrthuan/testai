package com.bytedance.sdk.component.Tgh.Qhi.cJ;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh;
import com.bytedance.sdk.component.Tgh.Qhi.hm;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: LogThreadCenter.java */
/* loaded from: classes.dex */
public class fl {
    private final Comparator<Tgh> Gm;
    private volatile Handler WAv;

    /* renamed from: hm  reason: collision with root package name */
    private volatile com.bytedance.sdk.component.Tgh.Qhi.cJ.ac.ac f8103hm;

    /* renamed from: zc  reason: collision with root package name */
    private final PriorityBlockingQueue<Tgh> f8104zc;
    public static final fl Qhi = new fl();
    public static final com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Qhi CJ = new com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Qhi();

    /* renamed from: fl  reason: collision with root package name */
    public static final AtomicLong f8101fl = new AtomicLong(0);
    public static final AtomicLong Tgh = new AtomicLong(0);
    public static final long ROR = System.currentTimeMillis();
    public static long Sf = 0;
    public volatile boolean cJ = false;

    /* renamed from: ac  reason: collision with root package name */
    public volatile boolean f8102ac = false;

    private fl() {
        Comparator<Tgh> comparator = new Comparator<Tgh>() { // from class: com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.1
            @Override // java.util.Comparator
            /* renamed from: Qhi */
            public int compare(Tgh tgh, Tgh tgh2) {
                return fl.this.Qhi(tgh, tgh2);
            }
        };
        this.Gm = comparator;
        this.f8104zc = new PriorityBlockingQueue<>(8, comparator);
    }

    public boolean CJ() {
        try {
            if (this.f8103hm == null && !com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ()) {
                synchronized (this) {
                    if (this.f8103hm == null) {
                        this.f8103hm = new com.bytedance.sdk.component.Tgh.Qhi.cJ.ac.ac(this.f8104zc);
                        this.f8103hm.start();
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th2) {
            th2.getMessage();
            return false;
        }
    }

    public void ac() {
        if (this.f8103hm != null && this.f8103hm.isAlive()) {
            synchronized (this) {
                if (this.f8103hm != null && this.f8103hm.isAlive()) {
                    if (this.WAv != null) {
                        this.WAv.removeCallbacksAndMessages(null);
                    }
                    this.f8103hm.Qhi(false);
                    this.f8103hm.quitSafely();
                    this.f8103hm = null;
                }
            }
        }
    }

    public void cJ() {
        CJ();
        fl();
    }

    public void fl() {
        com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(CJ.js(), 1);
        final com.bytedance.sdk.component.Tgh.Qhi.cJ.ac.ac acVar = this.f8103hm;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            com.bytedance.sdk.component.Tgh.Qhi.Tgh hpZ = hm.ROR().hpZ();
            if (hpZ != null) {
                Executor CJ2 = hpZ.CJ();
                if (CJ2 == null) {
                    CJ2 = hpZ.fl();
                }
                if (CJ2 != null) {
                    CJ2.execute(new com.bytedance.sdk.component.Tgh.Qhi.fl.Tgh("flush") { // from class: com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.3
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.Tgh.Qhi.cJ.ac.ac acVar2 = acVar;
                            if (acVar2 != null) {
                                acVar2.ac(2);
                            }
                        }
                    });
                }
            }
        } else if (acVar != null) {
            acVar.ac(2);
        }
    }

    public PriorityBlockingQueue<Tgh> Qhi() {
        return this.f8104zc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int Qhi(Tgh tgh, Tgh tgh2) {
        long j10;
        long j11;
        long j12;
        long j13;
        if (tgh == null) {
            return tgh2 == null ? 0 : -1;
        } else if (tgh2 == null) {
            return 1;
        } else {
            if (tgh.fl() == tgh2.fl()) {
                if (tgh.Qhi() != null) {
                    j10 = tgh.Qhi().Qhi();
                    j11 = tgh.Qhi().cJ();
                } else {
                    j10 = 0;
                    j11 = 0;
                }
                if (tgh2.Qhi() != null) {
                    j13 = tgh2.Qhi().Qhi();
                    j12 = tgh2.Qhi().cJ();
                } else {
                    j12 = 0;
                    j13 = 0;
                }
                if (j10 == 0 || j13 == 0) {
                    return 0;
                }
                long j14 = j10 - j13;
                if (Math.abs(j14) > 2147483647L) {
                    return 0;
                }
                if (j14 == 0) {
                    if (j11 == 0 || j12 == 0) {
                        return 0;
                    }
                    return (int) (j11 - j12);
                }
                return (int) j14;
            }
            return tgh.fl() - tgh2.fl();
        }
    }

    public void Qhi(Handler handler) {
        this.WAv = handler;
    }

    public void Qhi(Tgh tgh, int i10) {
        CJ();
        com.bytedance.sdk.component.Tgh.Qhi.Tgh hpZ = hm.ROR().hpZ();
        com.bytedance.sdk.component.Tgh.Qhi.cJ.ac.ac acVar = this.f8103hm;
        if (acVar != null) {
            Qhi(hpZ, tgh);
            acVar.Qhi(tgh, tgh.fl() == 4);
        }
    }

    private void Qhi(final com.bytedance.sdk.component.Tgh.Qhi.Tgh tgh, Tgh tgh2) {
        if (tgh != null) {
            try {
                if (tgh.ROR()) {
                    final long cJ = (tgh2 == null || tgh2.Qhi() == null) ? 0L : tgh2.Qhi().cJ();
                    if (cJ == 1) {
                        Sf = System.currentTimeMillis();
                    }
                    AtomicLong zjb = CJ.zjb();
                    com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(zjb, 1);
                    if (zjb.get() == 200) {
                        if (Looper.getMainLooper() == Looper.myLooper()) {
                            Executor CJ2 = tgh.CJ();
                            if (CJ2 == null) {
                                CJ2 = tgh.fl();
                            }
                            if (CJ2 != null) {
                                CJ2.execute(new com.bytedance.sdk.component.Tgh.Qhi.fl.Tgh("report") { // from class: com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.2
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        fl.this.Qhi(tgh, cJ);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        Qhi(tgh, cJ);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(com.bytedance.sdk.component.Tgh.Qhi.Tgh tgh, long j10) {
        com.bytedance.sdk.component.Tgh.Qhi.cJ.ac.ac acVar = this.f8103hm;
        if (tgh == null || acVar == null) {
            return;
        }
        com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Qhi qhi = CJ;
        acVar.Qhi(tgh.Qhi(qhi.cJ(j10)), true);
        qhi.jPH();
    }
}
