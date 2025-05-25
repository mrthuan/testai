package com.bytedance.sdk.component.Sf.ac;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ABk;
import com.google.android.gms.common.api.Api;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PagThreadPoolExecutor.java */
/* loaded from: classes.dex */
public class ROR extends ThreadPoolExecutor {
    private int CJ;
    private final String Qhi;
    private boolean ROR;
    private LinkedHashMap<String, com.bytedance.sdk.component.Sf.ac.Qhi.Qhi> Sf;
    private int Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private int f8036ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private int f8037fl;

    /* compiled from: PagThreadPoolExecutor.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        private String Qhi = "cache";
        private int cJ = 4;

        /* renamed from: ac  reason: collision with root package name */
        private int f8038ac = 100;
        private int CJ = 0;

        /* renamed from: fl  reason: collision with root package name */
        private long f8039fl = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        private boolean Tgh = false;
        private TimeUnit ROR = TimeUnit.MILLISECONDS;
        private int Sf = -1;

        /* renamed from: hm  reason: collision with root package name */
        private int f8040hm = 20;
        private boolean WAv = false;
        private BlockingQueue<Runnable> Gm = new PriorityBlockingQueue();

        /* renamed from: zc  reason: collision with root package name */
        private ThreadFactory f8041zc = null;

        public Qhi CJ(int i10) {
            this.f8040hm = i10;
            return this;
        }

        public Qhi Qhi(String str) {
            this.Qhi = str;
            return this;
        }

        public Qhi ac(int i10) {
            this.CJ = i10;
            return this;
        }

        public Qhi cJ(int i10) {
            this.f8038ac = i10;
            return this;
        }

        public Qhi fl(int i10) {
            this.Sf = i10;
            return this;
        }

        public Qhi Qhi(int i10) {
            this.cJ = i10;
            return this;
        }

        public Qhi cJ(boolean z10) {
            this.WAv = z10;
            return this;
        }

        public Qhi Qhi(long j10) {
            this.f8039fl = j10;
            return this;
        }

        public Qhi Qhi(boolean z10) {
            this.Tgh = z10;
            return this;
        }

        public ROR Qhi() {
            if (this.f8041zc == null) {
                this.f8041zc = new fl(this.Qhi);
            }
            if (this.cJ < 0) {
                this.cJ = 8;
            }
            if (this.cJ == 0) {
                this.Gm = new SynchronousQueue();
            }
            if (this.Gm == null) {
                this.Gm = new LinkedBlockingQueue();
            }
            if (this.f8038ac > 100) {
                this.f8038ac = 100;
            }
            int i10 = this.f8038ac;
            int i11 = this.cJ;
            if (i10 < i11) {
                this.f8038ac = i11;
            }
            if (this.f8040hm < 0) {
                this.f8040hm = 20;
            }
            if (this.f8040hm > 100) {
                this.f8040hm = 100;
            }
            return new ROR(this);
        }
    }

    private void CJ() {
        try {
            if (this.CJ != 0 && getCorePoolSize() < this.f8037fl) {
                int size = getQueue().size();
                if (getActiveCount() >= this.CJ && size >= this.Tgh) {
                    setCorePoolSize(this.f8037fl);
                }
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    private boolean ROR() {
        if (this.cJ > 0) {
            return true;
        }
        return false;
    }

    private void Tgh() {
        if (getCompletedTaskCount() > this.cJ) {
            Tgh Qhi2 = ac.Qhi();
            if (Qhi2 != null) {
                Qhi2.Qhi(this);
            }
            this.cJ = -1;
        }
    }

    private void fl() {
        try {
            if (this.CJ != 0 && getCorePoolSize() > this.CJ && getQueue().size() == 0) {
                setCorePoolSize(this.CJ);
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    public void Qhi(Qhi qhi) {
        try {
            if (qhi.cJ >= 0 && this.CJ != qhi.cJ) {
                int i10 = qhi.cJ;
                this.CJ = i10;
                setCorePoolSize(i10);
            }
            this.f8037fl = qhi.f8038ac;
            this.Tgh = qhi.CJ;
            allowCoreThreadTimeOut(qhi.Tgh);
            this.cJ = qhi.Sf;
            this.f8036ac = qhi.f8040hm;
            this.ROR = qhi.WAv;
        } catch (Throwable th2) {
            ABk.Qhi("PAGThreadPoolExecutor", th2.getMessage());
        }
        String unused = qhi.Qhi;
        int unused2 = qhi.cJ;
        int unused3 = qhi.f8038ac;
        long unused4 = qhi.f8039fl;
        int unused5 = qhi.CJ;
        int unused6 = qhi.f8040hm;
        boolean unused7 = qhi.WAv;
        BlockingQueue unused8 = qhi.Gm;
    }

    public boolean ac() {
        return this.ROR;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th2) {
        boolean z10 = runnable instanceof cJ;
        if (z10) {
            ((cJ) runnable).ac(SystemClock.elapsedRealtime());
            try {
                if (ROR() && this.Sf != null) {
                    Qhi((cJ) runnable);
                    Tgh();
                }
            } catch (Exception e10) {
                ABk.Qhi("PAGThreadPoolExecutor", e10.getMessage());
            }
        }
        super.afterExecute(runnable, th2);
        if (z10) {
            cJ cJVar = (cJ) runnable;
            cJVar.cJ();
            cJVar.Qhi();
            cJVar.ac();
            cJVar.CJ();
            cJVar.fl();
        }
        fl();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof cJ) {
            ((cJ) runnable).cJ(SystemClock.elapsedRealtime());
        }
        super.beforeExecute(thread, runnable);
    }

    public String cJ() {
        return this.Qhi;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bytedance.sdk.component.Sf.ac.Qhi cJ;
        if (!(runnable instanceof cJ)) {
            runnable = new cJ("unknown", runnable) { // from class: com.bytedance.sdk.component.Sf.ac.ROR.3
                @Override // java.lang.Runnable
                public void run() {
                    Runnable Sf = Sf();
                    if (Sf != null) {
                        Sf.run();
                    }
                }
            };
        }
        if (!"cache".equals(this.Qhi)) {
            String name = Thread.currentThread().getName();
            if (!TextUtils.isEmpty(name) && name.startsWith(fl.Qhi(this.Qhi)) && (cJ = ac.cJ()) != null) {
                cJ.Qhi(this, (cJ) runnable);
            }
        }
        ((cJ) runnable).Qhi(SystemClock.elapsedRealtime());
        try {
            super.execute(runnable);
            CJ();
        } catch (Throwable th2) {
            Qhi(runnable, th2);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("aidl".equals(this.Qhi)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        if ("aidl".equals(this.Qhi)) {
            return Collections.emptyList();
        }
        return super.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        int i10;
        String str;
        runnable.getClass();
        final RunnableFuture newTaskFor = newTaskFor(runnable, null);
        if (runnable instanceof cJ) {
            cJ cJVar = (cJ) runnable;
            i10 = cJVar.Qhi();
            str = cJVar.cJ();
        } else {
            i10 = 6;
            str = "";
        }
        if (i10 == 0 || TextUtils.isEmpty(str)) {
            new RuntimeException();
        }
        execute(new cJ(i10, str) { // from class: com.bytedance.sdk.component.Sf.ac.ROR.2
            @Override // java.lang.Runnable
            public void run() {
                newTaskFor.run();
            }
        });
        return newTaskFor;
    }

    private ROR(Qhi qhi) {
        super(qhi.cJ, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER, qhi.f8039fl, qhi.ROR, qhi.Gm, qhi.f8041zc);
        this.ROR = false;
        String unused = qhi.Qhi;
        int unused2 = qhi.cJ;
        int unused3 = qhi.f8038ac;
        long unused4 = qhi.f8039fl;
        int unused5 = qhi.CJ;
        int unused6 = qhi.f8040hm;
        boolean unused7 = qhi.WAv;
        BlockingQueue unused8 = qhi.Gm;
        this.Qhi = qhi.Qhi;
        this.CJ = qhi.cJ;
        this.f8037fl = qhi.f8038ac;
        this.Tgh = qhi.CJ;
        allowCoreThreadTimeOut(qhi.Tgh);
        this.cJ = qhi.Sf;
        this.f8036ac = qhi.f8040hm;
        this.ROR = qhi.WAv;
        if (ROR()) {
            final int i10 = this.f8036ac + 4;
            this.Sf = new LinkedHashMap<String, com.bytedance.sdk.component.Sf.ac.Qhi.Qhi>(i10, 0.75f, true) { // from class: com.bytedance.sdk.component.Sf.ac.ROR.1
                @Override // java.util.LinkedHashMap
                public boolean removeEldestEntry(Map.Entry<String, com.bytedance.sdk.component.Sf.ac.Qhi.Qhi> entry) {
                    if (size() > i10) {
                        return true;
                    }
                    return false;
                }
            };
        }
    }

    private void Qhi(Runnable runnable, Throwable th2) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Handler ac2 = ac.ac();
                if (ac2 != null) {
                    ac2.post(runnable);
                    return;
                }
                return;
            }
            runnable.run();
        } catch (Throwable th3) {
            ABk.Qhi("PAGThreadPoolExecutor", "try exc failed", th3);
        }
    }

    private void Qhi(cJ cJVar) {
        LinkedHashMap<String, com.bytedance.sdk.component.Sf.ac.Qhi.Qhi> linkedHashMap = this.Sf;
        if (linkedHashMap != null) {
            com.bytedance.sdk.component.Sf.ac.Qhi.Qhi qhi = linkedHashMap.get(cJVar.cJ());
            if (qhi == null) {
                synchronized (linkedHashMap) {
                    qhi = linkedHashMap.get(cJVar.cJ());
                    if (qhi == null) {
                        qhi = new com.bytedance.sdk.component.Sf.ac.Qhi.Qhi();
                        linkedHashMap.put(cJVar.cJ(), qhi);
                    }
                }
            }
            qhi.Qhi(cJVar);
        }
    }

    public LinkedHashMap<String, com.bytedance.sdk.component.Sf.ac.Qhi.Qhi> Qhi() {
        return this.Sf;
    }
}
