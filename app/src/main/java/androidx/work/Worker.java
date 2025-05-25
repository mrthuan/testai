package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* renamed from: f  reason: collision with root package name */
    public androidx.work.impl.utils.futures.a<ListenableWorker.a> f4889f;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Worker worker = Worker.this;
            try {
                worker.f4889f.h(worker.doWork());
            } catch (Throwable th2) {
                worker.f4889f.i(th2);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.a doWork();

    @Override // androidx.work.ListenableWorker
    public final y9.a<ListenableWorker.a> startWork() {
        this.f4889f = new androidx.work.impl.utils.futures.a<>();
        getBackgroundExecutor().execute(new a());
        return this.f4889f;
    }
}
