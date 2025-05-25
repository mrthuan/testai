package lib.zj.pdfeditor;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public abstract class AsyncTask<Params, Progress, Result> {

    /* renamed from: f  reason: collision with root package name */
    public static final ThreadPoolExecutor f21138f;

    /* renamed from: g  reason: collision with root package name */
    public static final f f21139g;

    /* renamed from: h  reason: collision with root package name */
    public static volatile g f21140h;

    /* renamed from: a  reason: collision with root package name */
    public final b f21141a;

    /* renamed from: b  reason: collision with root package name */
    public final c f21142b;
    public volatile Status c = Status.PENDING;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f21143d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f21144e = new AtomicBoolean();

    /* loaded from: classes3.dex */
    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* loaded from: classes3.dex */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f21146a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "AsyncTask #" + this.f21146a.getAndIncrement());
        }
    }

    /* loaded from: classes3.dex */
    public class b extends h<Params, Result> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        public final Result call() {
            AsyncTask asyncTask = AsyncTask.this;
            asyncTask.f21144e.set(true);
            Process.setThreadPriority(10);
            Result result = (Result) asyncTask.b(this.f21156a);
            AsyncTask.f21139g.obtainMessage(1, new e(asyncTask, result)).sendToTarget();
            return result;
        }
    }

    /* loaded from: classes3.dex */
    public class c extends FutureTask<Result> {
        public c(b bVar) {
            super(bVar);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            AsyncTask asyncTask = AsyncTask.this;
            try {
                Result result = get();
                if (!asyncTask.f21144e.get()) {
                    AsyncTask.f21139g.obtainMessage(1, new e(asyncTask, result)).sendToTarget();
                }
            } catch (InterruptedException unused) {
            } catch (CancellationException unused2) {
                if (!asyncTask.f21144e.get()) {
                    AsyncTask.f21139g.obtainMessage(1, new e(asyncTask, null)).sendToTarget();
                }
            } catch (ExecutionException e10) {
                throw new RuntimeException("An error occured while executing doInBackground()", e10.getCause());
            }
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21149a;

        static {
            int[] iArr = new int[Status.values().length];
            f21149a = iArr;
            try {
                iArr[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21149a[Status.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class e<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final AsyncTask f21150a;

        /* renamed from: b  reason: collision with root package name */
        public final Data[] f21151b;

        public e(AsyncTask asyncTask, Data... dataArr) {
            this.f21150a = asyncTask;
            this.f21151b = dataArr;
        }
    }

    /* loaded from: classes3.dex */
    public static class f extends Handler {
        public f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 == 2) {
                    eVar.f21150a.getClass();
                    return;
                }
                return;
            }
            AsyncTask asyncTask = eVar.f21150a;
            Object obj = eVar.f21151b[0];
            if (asyncTask.f21143d.get()) {
                asyncTask.e(obj);
            } else {
                asyncTask.f(obj);
            }
            asyncTask.c = Status.FINISHED;
        }
    }

    /* loaded from: classes3.dex */
    public static class g implements Executor {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayDeque<Runnable> f21152a = new ArrayDeque<>();

        /* renamed from: b  reason: collision with root package name */
        public Runnable f21153b;

        /* loaded from: classes3.dex */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Runnable f21154a;

            public a(Runnable runnable) {
                this.f21154a = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                g gVar = g.this;
                try {
                    this.f21154a.run();
                } finally {
                    gVar.a();
                }
            }
        }

        public final synchronized void a() {
            Runnable poll = this.f21152a.poll();
            this.f21153b = poll;
            if (poll != null) {
                AsyncTask.f21138f.execute(poll);
            }
        }

        @Override // java.util.concurrent.Executor
        public final synchronized void execute(Runnable runnable) {
            this.f21152a.offer(new a(runnable));
            if (this.f21153b == null) {
                a();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class h<Params, Result> implements Callable<Result> {

        /* renamed from: a  reason: collision with root package name */
        public Params[] f21156a;
    }

    static {
        a aVar = new a();
        f21138f = new ThreadPoolExecutor(2, 2, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), aVar);
        g gVar = new g();
        f21139g = new f();
        f21140h = gVar;
    }

    public AsyncTask() {
        b bVar = new b();
        this.f21141a = bVar;
        this.f21142b = new c(bVar);
    }

    public final void a() {
        this.f21143d.set(true);
        this.f21142b.cancel(true);
    }

    public abstract Result b(Params... paramsArr);

    public final void c(Object... objArr) {
        d(f21140h, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(Executor executor, Object... objArr) {
        if (this.c != Status.PENDING) {
            int i10 = d.f21149a[this.c.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
            } else {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
        }
        this.c = Status.RUNNING;
        g();
        this.f21141a.f21156a = objArr;
        executor.execute(this.f21142b);
    }

    public abstract void f(Result result);

    public void g() {
    }

    public void e(Result result) {
    }
}
