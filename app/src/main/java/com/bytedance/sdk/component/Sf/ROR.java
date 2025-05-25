package com.bytedance.sdk.component.Sf;

import com.bytedance.sdk.component.Sf.Qhi;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: TTExecutor.java */
/* loaded from: classes.dex */
public class ROR extends Tgh {
    private static volatile ScheduledExecutorService Gm;
    private static volatile ThreadPoolExecutor ROR;
    private static volatile ThreadPoolExecutor Sf;
    private static volatile ThreadPoolExecutor Tgh;
    private static volatile ThreadPoolExecutor WAv;
    public static ac cJ;

    /* renamed from: fl  reason: collision with root package name */
    private static volatile ThreadPoolExecutor f8031fl;

    /* renamed from: hm  reason: collision with root package name */
    private static volatile ThreadPoolExecutor f8032hm;
    public static final int Qhi = Runtime.getRuntime().availableProcessors();

    /* renamed from: ac  reason: collision with root package name */
    public static int f8030ac = 120;
    public static boolean CJ = true;

    public static ExecutorService CJ() {
        if (Sf == null) {
            synchronized (ROR.class) {
                if (Sf == null) {
                    Qhi Qhi2 = new Qhi.C0079Qhi().Qhi("log").cJ(10).Qhi(4).Qhi(20L).Qhi(TimeUnit.SECONDS).Qhi(new PriorityBlockingQueue()).Qhi(Sf()).Qhi(Tgh.Qhi().createThreadFactory(10, "log")).Qhi();
                    Sf = Qhi2;
                    Qhi2.allowCoreThreadTimeOut(true);
                }
            }
        }
        return Sf;
    }

    public static void Qhi(hm hmVar) {
        if (f8031fl == null) {
            cJ();
        }
        if (hmVar == null || f8031fl == null) {
            return;
        }
        f8031fl.execute(hmVar);
    }

    public static boolean ROR() {
        return CJ;
    }

    public static RejectedExecutionHandler Sf() {
        return new RejectedExecutionHandler() { // from class: com.bytedance.sdk.component.Sf.ROR.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        };
    }

    public static ScheduledExecutorService Tgh() {
        if (Gm == null) {
            synchronized (ROR.class) {
                if (Gm == null) {
                    Gm = Executors.newSingleThreadScheduledExecutor(Tgh.Qhi().createThreadFactory(5, "scheduled"));
                }
            }
        }
        return Gm;
    }

    public static ExecutorService WAv() {
        if (f8032hm == null) {
            synchronized (ROR.class) {
                if (f8032hm == null) {
                    Qhi Qhi2 = new Qhi.C0079Qhi().Qhi("computation").Qhi(3).cJ(10).Qhi(20L).Qhi(TimeUnit.SECONDS).Qhi(new PriorityBlockingQueue()).Qhi(Sf()).Qhi(Tgh.Qhi().createThreadFactory(10, "computation")).Qhi();
                    f8032hm = Qhi2;
                    Qhi2.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f8032hm;
    }

    public static ExecutorService ac() {
        return Qhi(10);
    }

    public static ExecutorService cJ() {
        if (f8031fl == null) {
            synchronized (ROR.class) {
                if (f8031fl == null) {
                    f8031fl = new Qhi.C0079Qhi().Qhi("init").Qhi(0).cJ(10).Qhi(5L).Qhi(TimeUnit.SECONDS).Qhi(new SynchronousQueue()).Qhi(Sf()).Qhi(Tgh.Qhi().createThreadFactory(10, "init")).Qhi();
                }
            }
        }
        return f8031fl;
    }

    public static ExecutorService fl() {
        if (WAv == null) {
            synchronized (ROR.class) {
                if (WAv == null) {
                    Qhi Qhi2 = new Qhi.C0079Qhi().Qhi("aidl").cJ(10).Qhi(2).Qhi(30L).Qhi(TimeUnit.SECONDS).Qhi(new PriorityBlockingQueue()).Qhi(Sf()).Qhi(Tgh.Qhi().createThreadFactory(10, "aidl")).Qhi();
                    WAv = Qhi2;
                    Qhi2.allowCoreThreadTimeOut(true);
                }
            }
        }
        return WAv;
    }

    public static ac hm() {
        return cJ;
    }

    public static void ac(hm hmVar) {
        if (Sf == null) {
            CJ();
        }
        if (hmVar == null || Sf == null) {
            return;
        }
        Sf.execute(hmVar);
    }

    public static ExecutorService Qhi(int i10) {
        if (Tgh == null) {
            synchronized (ROR.class) {
                if (Tgh == null) {
                    Qhi Qhi2 = new Qhi.C0079Qhi().Qhi("io").Qhi(2).cJ(i10).Qhi(20L).Qhi(TimeUnit.SECONDS).Qhi(new LinkedBlockingQueue()).Qhi(Sf()).Qhi(Tgh.Qhi().createThreadFactory(i10, "io")).Qhi();
                    Tgh = Qhi2;
                    Qhi2.allowCoreThreadTimeOut(true);
                }
            }
        }
        return Tgh;
    }

    public static void ac(hm hmVar, int i10) {
        if (hmVar != null) {
            hmVar.setPriority(i10);
        }
        CJ(hmVar);
    }

    public static void ac(int i10) {
        f8030ac = i10;
    }

    public static void cJ(hm hmVar) {
        if (Tgh == null) {
            ac();
        }
        if (Tgh != null) {
            Tgh.execute(hmVar);
        }
    }

    public static void CJ(hm hmVar) {
        if (WAv == null) {
            fl();
        }
        if (hmVar == null || WAv == null) {
            return;
        }
        WAv.execute(hmVar);
    }

    public static void fl(hm hmVar) {
        if (ROR == null) {
            cJ(5);
        }
        if (hmVar == null || ROR == null) {
            return;
        }
        ROR.execute(hmVar);
    }

    public static void cJ(hm hmVar, int i10) {
        if (hmVar != null) {
            hmVar.setPriority(i10);
        }
        ac(hmVar);
    }

    public static void Qhi(hm hmVar, int i10) {
        cJ(hmVar);
    }

    public static void Qhi(hm hmVar, int i10, int i11) {
        if (Tgh == null) {
            Qhi(i11);
        }
        if (hmVar == null || Tgh == null) {
            return;
        }
        hmVar.setPriority(i10);
        Tgh.execute(hmVar);
    }

    public static ExecutorService cJ(int i10) {
        if (ROR == null) {
            synchronized (ROR.class) {
                if (ROR == null) {
                    Qhi Qhi2 = new Qhi.C0079Qhi().Qhi("ad").Qhi(2).cJ(i10).Qhi(20L).Qhi(TimeUnit.SECONDS).Qhi(new LinkedBlockingQueue()).Qhi(Sf()).Qhi(Tgh.Qhi().createThreadFactory(i10, "ad")).Qhi();
                    ROR = Qhi2;
                    Qhi2.allowCoreThreadTimeOut(true);
                }
            }
        }
        return ROR;
    }

    public static void Qhi(boolean z10) {
        CJ = z10;
    }

    public static void Qhi(ac acVar) {
        cJ = acVar;
    }
}
