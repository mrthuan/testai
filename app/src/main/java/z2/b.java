package z2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import y2.j;

/* compiled from: WorkManagerTaskExecutor.java */
/* loaded from: classes.dex */
public final class b implements z2.a {

    /* renamed from: a  reason: collision with root package name */
    public final j f32218a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f32219b = new Handler(Looper.getMainLooper());
    public final a c = new a();

    /* compiled from: WorkManagerTaskExecutor.java */
    /* loaded from: classes.dex */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            b.this.f32219b.post(runnable);
        }
    }

    public b(ExecutorService executorService) {
        this.f32218a = new j(executorService);
    }

    public final void a(Runnable runnable) {
        this.f32218a.execute(runnable);
    }
}
