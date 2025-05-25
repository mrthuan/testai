package com.google.firebase.concurrent;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class SequentialExecutor implements Executor {

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f13497f = Logger.getLogger(SequentialExecutor.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final Executor f13498a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f13499b = new ArrayDeque();
    public WorkerRunningState c = WorkerRunningState.IDLE;

    /* renamed from: d  reason: collision with root package name */
    public long f13500d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final b f13501e = new b();

    /* loaded from: classes2.dex */
    public enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f13503a;

        public a(Runnable runnable) {
            this.f13503a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f13503a.run();
        }

        public final String toString() {
            return this.f13503a.toString();
        }
    }

    /* loaded from: classes2.dex */
    public final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public Runnable f13504a;

        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
            if (r1 == false) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
            r9.f13504a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
            com.google.firebase.concurrent.SequentialExecutor.f13497f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r9.f13504a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L2:
                com.google.firebase.concurrent.SequentialExecutor r2 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L78
                java.util.ArrayDeque r2 = r2.f13499b     // Catch: java.lang.Throwable -> L78
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L78
                if (r0 != 0) goto L26
                com.google.firebase.concurrent.SequentialExecutor r0 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L75
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r3 = r0.c     // Catch: java.lang.Throwable -> L75
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r4 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L75
                if (r3 != r4) goto L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L75
                if (r1 == 0) goto L1b
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1b:
                return
            L1c:
                long r5 = r0.f13500d     // Catch: java.lang.Throwable -> L75
                r7 = 1
                long r5 = r5 + r7
                r0.f13500d = r5     // Catch: java.lang.Throwable -> L75
                r0.c = r4     // Catch: java.lang.Throwable -> L75
                r0 = 1
            L26:
                com.google.firebase.concurrent.SequentialExecutor r3 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L75
                java.util.ArrayDeque r3 = r3.f13499b     // Catch: java.lang.Throwable -> L75
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L75
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L75
                r9.f13504a = r3     // Catch: java.lang.Throwable -> L75
                if (r3 != 0) goto L45
                com.google.firebase.concurrent.SequentialExecutor r0 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L75
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L75
                r0.c = r3     // Catch: java.lang.Throwable -> L75
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L75
                if (r1 == 0) goto L44
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L44:
                return
            L45:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L75
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L78
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r9.f13504a     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
                r3.run()     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
                goto L6f
            L52:
                r0 = move-exception
                goto L72
            L54:
                r3 = move-exception
                java.util.logging.Logger r4 = com.google.firebase.concurrent.SequentialExecutor.f13497f     // Catch: java.lang.Throwable -> L52
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L52
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
                r6.<init>()     // Catch: java.lang.Throwable -> L52
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L52
                java.lang.Runnable r7 = r9.f13504a     // Catch: java.lang.Throwable -> L52
                r6.append(r7)     // Catch: java.lang.Throwable -> L52
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L52
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L52
            L6f:
                r9.f13504a = r2     // Catch: java.lang.Throwable -> L78
                goto L2
            L72:
                r9.f13504a = r2     // Catch: java.lang.Throwable -> L78
                throw r0     // Catch: java.lang.Throwable -> L78
            L75:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L75
                throw r0     // Catch: java.lang.Throwable -> L78
            L78:
                r0 = move-exception
                if (r1 == 0) goto L82
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L82:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.SequentialExecutor.b.a():void");
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (SequentialExecutor.this.f13499b) {
                    SequentialExecutor.this.c = WorkerRunningState.IDLE;
                    throw e10;
                }
            }
        }

        public final String toString() {
            Runnable runnable = this.f13504a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + SequentialExecutor.this.c + "}";
        }
    }

    public SequentialExecutor(Executor executor) {
        Preconditions.j(executor);
        this.f13498a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        WorkerRunningState workerRunningState;
        Preconditions.j(runnable);
        synchronized (this.f13499b) {
            WorkerRunningState workerRunningState2 = this.c;
            if (workerRunningState2 != WorkerRunningState.RUNNING && workerRunningState2 != (workerRunningState = WorkerRunningState.QUEUED)) {
                long j10 = this.f13500d;
                a aVar = new a(runnable);
                this.f13499b.add(aVar);
                WorkerRunningState workerRunningState3 = WorkerRunningState.QUEUING;
                this.c = workerRunningState3;
                boolean z10 = true;
                try {
                    this.f13498a.execute(this.f13501e);
                    if (this.c == workerRunningState3) {
                        z10 = false;
                    }
                    if (z10) {
                        return;
                    }
                    synchronized (this.f13499b) {
                        if (this.f13500d == j10 && this.c == workerRunningState3) {
                            this.c = workerRunningState;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f13499b) {
                        WorkerRunningState workerRunningState4 = this.c;
                        if ((workerRunningState4 != WorkerRunningState.IDLE && workerRunningState4 != WorkerRunningState.QUEUING) || !this.f13499b.removeLastOccurrence(aVar)) {
                            z10 = false;
                        }
                        if (!(e10 instanceof RejectedExecutionException) || z10) {
                            throw e10;
                        }
                    }
                    return;
                }
            }
            this.f13499b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f13498a + "}";
    }
}
