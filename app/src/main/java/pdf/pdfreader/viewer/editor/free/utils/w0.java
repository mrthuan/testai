package pdf.pdfreader.viewer.editor.free.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;

/* compiled from: ProcessingDataExecutors.java */
/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: d  reason: collision with root package name */
    public static final Object f28788d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static w0 f28789e;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f28790a;

    /* renamed from: b  reason: collision with root package name */
    public final c f28791b;
    public final ExecutorService c;

    /* compiled from: ProcessingDataExecutors.java */
    /* loaded from: classes3.dex */
    public class a implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            threadPoolExecutor.execute(runnable);
        }
    }

    /* compiled from: ProcessingDataExecutors.java */
    /* loaded from: classes3.dex */
    public class b implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            threadPoolExecutor.execute(runnable);
        }
    }

    /* compiled from: ProcessingDataExecutors.java */
    /* loaded from: classes3.dex */
    public static class c implements Executor {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f28792a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f28792a.post(runnable);
        }
    }

    public w0(ThreadPoolExecutor threadPoolExecutor, ThreadPoolExecutor threadPoolExecutor2, c cVar) {
        this.f28790a = threadPoolExecutor;
        this.c = threadPoolExecutor2;
        this.f28791b = cVar;
    }

    public static w0 a() {
        if (f28789e == null) {
            synchronized (f28788d) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue());
                threadPoolExecutor.setRejectedExecutionHandler(new a());
                int[] iArr = {1, 1};
                if (ReaderPdfApplication.l() != null) {
                    ge.a z10 = ge.a.z();
                    Activity l10 = ReaderPdfApplication.l();
                    z10.getClass();
                    iArr = ge.a.B(l10);
                }
                ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(iArr[0], iArr[1], 0L, timeUnit, new LinkedBlockingQueue());
                threadPoolExecutor2.setRejectedExecutionHandler(new b());
                f28789e = new w0(threadPoolExecutor, threadPoolExecutor2, new c());
            }
        }
        return f28789e;
    }

    public final void b() {
        ExecutorService executorService = this.c;
        if (executorService != null) {
            executorService.shutdownNow();
        }
    }
}
