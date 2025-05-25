package ma;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.assetpacks.b1;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: CrashlyticsBackgroundWorker.java */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f21901a;

    /* renamed from: b  reason: collision with root package name */
    public Task<Void> f21902b = Tasks.e(null);
    public final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final ThreadLocal<Boolean> f21903d = new ThreadLocal<>();

    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.f21903d.set(Boolean.TRUE);
        }
    }

    public g(Executor executor) {
        this.f21901a = executor;
        executor.execute(new a());
    }

    public final <T> Task<T> a(Callable<T> callable) {
        Task<T> task;
        synchronized (this.c) {
            task = (Task<T>) this.f21902b.g(this.f21901a, new i(callable));
            this.f21902b = task.g(this.f21901a, new b1());
        }
        return task;
    }

    public final <T> Task<T> b(Callable<Task<T>> callable) {
        Task<T> task;
        synchronized (this.c) {
            task = (Task<T>) this.f21902b.i(this.f21901a, new i(callable));
            this.f21902b = task.g(this.f21901a, new b1());
        }
        return task;
    }
}
