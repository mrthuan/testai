package bm;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: DbExecutors.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final Object f5471d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static a f5472e;

    /* renamed from: a  reason: collision with root package name */
    public final Executor f5473a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f5474b;
    public final Executor c;

    /* compiled from: DbExecutors.java */
    /* renamed from: bm.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class ExecutorC0041a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f5475a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f5475a.post(runnable);
        }
    }

    public a(ExecutorService executorService, ExecutorService executorService2, ExecutorC0041a executorC0041a) {
        this.f5473a = executorService;
        this.c = executorService2;
        this.f5474b = executorC0041a;
    }
}
