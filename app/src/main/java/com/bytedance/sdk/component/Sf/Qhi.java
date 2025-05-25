package com.bytedance.sdk.component.Sf;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ABk;
import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ADThreadPoolExecutor.java */
/* loaded from: classes.dex */
public class Qhi extends ThreadPoolExecutor {
    private String Qhi;

    /* compiled from: ADThreadPoolExecutor.java */
    /* renamed from: com.bytedance.sdk.component.Sf.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0079Qhi {
        private RejectedExecutionHandler Sf;
        private String Qhi = "io";
        private int cJ = 1;

        /* renamed from: ac  reason: collision with root package name */
        private long f8026ac = 30;
        private TimeUnit CJ = TimeUnit.SECONDS;

        /* renamed from: fl  reason: collision with root package name */
        private int f8027fl = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        private BlockingQueue<Runnable> Tgh = null;
        private ThreadFactory ROR = null;

        /* renamed from: hm  reason: collision with root package name */
        private int f8028hm = 5;

        public C0079Qhi Qhi(String str) {
            this.Qhi = str;
            return this;
        }

        public C0079Qhi cJ(int i10) {
            this.f8028hm = i10;
            return this;
        }

        public C0079Qhi Qhi(int i10) {
            this.cJ = i10;
            return this;
        }

        public C0079Qhi Qhi(long j10) {
            this.f8026ac = j10;
            return this;
        }

        public C0079Qhi Qhi(TimeUnit timeUnit) {
            this.CJ = timeUnit;
            return this;
        }

        public C0079Qhi Qhi(BlockingQueue<Runnable> blockingQueue) {
            this.Tgh = blockingQueue;
            return this;
        }

        public C0079Qhi Qhi(ThreadFactory threadFactory) {
            this.ROR = threadFactory;
            return this;
        }

        public C0079Qhi Qhi(RejectedExecutionHandler rejectedExecutionHandler) {
            this.Sf = rejectedExecutionHandler;
            return this;
        }

        public Qhi Qhi() {
            if (this.ROR == null) {
                this.ROR = Tgh.Qhi().createThreadFactory(this.f8028hm, this.Qhi);
            }
            if (this.Sf == null) {
                this.Sf = ROR.Sf();
            }
            if (this.Tgh == null) {
                this.Tgh = new LinkedBlockingQueue();
            }
            return new Qhi(this.Qhi, this.cJ, this.f8027fl, this.f8026ac, this.CJ, this.Tgh, this.ROR, this.Sf);
        }
    }

    public Qhi(String str, int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i10, i11, j10, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.Qhi = str;
    }

    private void Qhi(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError e10) {
            Qhi(runnable, e10);
        } catch (Throwable th2) {
            Qhi(runnable, th2);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th2) {
        BlockingQueue<Runnable> queue;
        super.afterExecute(runnable, th2);
        if (ROR.ROR() && !TextUtils.isEmpty(this.Qhi) && (queue = getQueue()) != null) {
            String str = this.Qhi;
            str.getClass();
            char c = 65535;
            switch (str.hashCode()) {
                case 3366:
                    if (str.equals("io")) {
                        c = 0;
                        break;
                    }
                    break;
                case 107332:
                    if (str.equals("log")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2993840:
                    if (str.equals("aidl")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    Qhi(queue, 2);
                    return;
                case 1:
                    Qhi(queue, 4);
                    return;
                case 2:
                    Qhi(queue, 2);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        BlockingQueue<Runnable> queue;
        if (runnable instanceof hm) {
            Qhi(new cJ((hm) runnable, this));
        } else {
            Qhi(new cJ(new hm("unknown") { // from class: com.bytedance.sdk.component.Sf.Qhi.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                }
            }, this));
        }
        if (ROR.ROR() && !TextUtils.isEmpty(this.Qhi) && (queue = getQueue()) != null) {
            String str = this.Qhi;
            str.getClass();
            char c = 65535;
            switch (str.hashCode()) {
                case 3366:
                    if (str.equals("io")) {
                        c = 0;
                        break;
                    }
                    break;
                case 107332:
                    if (str.equals("log")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2993840:
                    if (str.equals("aidl")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    Qhi(queue, ROR.Qhi + 2, getCorePoolSize() * 2);
                    return;
                case 1:
                    Qhi(queue, 8, 8);
                    return;
                case 2:
                    Qhi(queue, 5, 5);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if (!"io".equals(this.Qhi) && !"aidl".equals(this.Qhi)) {
            super.shutdown();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        if (!"io".equals(this.Qhi) && !"aidl".equals(this.Qhi)) {
            return super.shutdownNow();
        }
        return Collections.emptyList();
    }

    private void Qhi(Runnable runnable, OutOfMemoryError outOfMemoryError) {
        Qhi(runnable, (Throwable) outOfMemoryError);
    }

    private void Qhi(Runnable runnable, Throwable th2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                runnable.run();
            } catch (Throwable th3) {
                ABk.Qhi("", "try exc failed", th3);
            }
        }
    }

    private void Qhi(BlockingQueue<Runnable> blockingQueue, int i10) {
        if (getCorePoolSize() == i10 || blockingQueue == null || blockingQueue.size() > 0) {
            return;
        }
        try {
            setCorePoolSize(i10);
            getCorePoolSize();
            getMaximumPoolSize();
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    private void Qhi(BlockingQueue<Runnable> blockingQueue, int i10, int i11) {
        if (getCorePoolSize() == i10 || blockingQueue == null || blockingQueue.size() < i11) {
            return;
        }
        try {
            setCorePoolSize(i10);
            getCorePoolSize();
            getMaximumPoolSize();
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    public String Qhi() {
        return this.Qhi;
    }
}
