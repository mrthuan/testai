package p4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: Executors.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f23694a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f23695b = new b();

    /* compiled from: Executors.java */
    /* loaded from: classes.dex */
    public class a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f23696a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f23696a.post(runnable);
        }
    }

    /* compiled from: Executors.java */
    /* loaded from: classes.dex */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
