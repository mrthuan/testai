package e3;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* compiled from: LottieTask.java */
/* loaded from: classes.dex */
public final class r<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final ExecutorService f16442e = Executors.newCachedThreadPool();

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f16443a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet f16444b;
    public final Handler c;

    /* renamed from: d  reason: collision with root package name */
    public volatile p<T> f16445d;

    /* compiled from: LottieTask.java */
    /* loaded from: classes.dex */
    public class a extends FutureTask<p<T>> {
        public a(Callable<p<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            r rVar = r.this;
            if (isCancelled()) {
                return;
            }
            try {
                rVar.d(get());
            } catch (InterruptedException | ExecutionException e10) {
                rVar.d(new p<>(e10));
            }
        }
    }

    public r() {
        throw null;
    }

    public r(Callable<p<T>> callable, boolean z10) {
        this.f16443a = new LinkedHashSet(1);
        this.f16444b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.f16445d = null;
        if (z10) {
            try {
                d(callable.call());
                return;
            } catch (Throwable th2) {
                d(new p<>(th2));
                return;
            }
        }
        f16442e.execute(new a(callable));
    }

    public static void a(r rVar, Object obj) {
        synchronized (rVar) {
            Iterator it = new ArrayList(rVar.f16443a).iterator();
            while (it.hasNext()) {
                ((m) it.next()).onResult(obj);
            }
        }
    }

    public final synchronized void b(m mVar) {
        if (this.f16445d != null && this.f16445d.f16440b != null) {
            mVar.onResult(this.f16445d.f16440b);
        }
        this.f16444b.add(mVar);
    }

    public final synchronized void c(m mVar) {
        this.f16444b.remove(mVar);
    }

    public final void d(p<T> pVar) {
        if (this.f16445d == null) {
            this.f16445d = pVar;
            this.c.post(new q(this));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }
}
