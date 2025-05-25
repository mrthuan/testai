package l4;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m4.g;
import p4.j;

/* compiled from: RequestFutureTarget.java */
/* loaded from: classes.dex */
public final class c<R> implements Future, g, d<R> {

    /* renamed from: a  reason: collision with root package name */
    public final int f20504a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20505b;
    public R c;

    /* renamed from: d  reason: collision with root package name */
    public b f20506d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f20507e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f20508f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f20509g;

    /* renamed from: h  reason: collision with root package name */
    public GlideException f20510h;

    /* compiled from: RequestFutureTarget.java */
    /* loaded from: classes.dex */
    public static class a {
    }

    static {
        new a();
    }

    public c(int i10, int i11) {
        this.f20504a = i10;
        this.f20505b = i11;
    }

    @Override // l4.d
    public final synchronized void a(GlideException glideException) {
        this.f20509g = true;
        this.f20510h = glideException;
        notifyAll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l4.d
    public final synchronized void b(Object obj, DataSource dataSource) {
        this.f20508f = true;
        this.c = obj;
        notifyAll();
    }

    @Override // m4.g
    public final synchronized void c(R r4, n4.d<? super R> dVar) {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.f20507e = true;
            notifyAll();
            b bVar = null;
            if (z10) {
                b bVar2 = this.f20506d;
                this.f20506d = null;
                bVar = bVar2;
            }
            if (bVar != null) {
                bVar.clear();
            }
            return true;
        }
    }

    @Override // m4.g
    public final synchronized void e(b bVar) {
        this.f20506d = bVar;
    }

    @Override // m4.g
    public final synchronized void f(Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        try {
            return k(null);
        } catch (TimeoutException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // m4.g
    public final synchronized b h() {
        return this.f20506d;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.f20507e;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        boolean z10;
        if (!this.f20507e && !this.f20508f) {
            if (!this.f20509g) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    @Override // m4.g
    public final void j(m4.f fVar) {
        fVar.b(this.f20504a, this.f20505b);
    }

    public final synchronized R k(Long l10) {
        if (!isDone() && !j.f()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
        if (!this.f20507e) {
            if (!this.f20509g) {
                if (this.f20508f) {
                    return this.c;
                }
                if (l10 == null) {
                    wait(0L);
                } else if (l10.longValue() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long longValue = l10.longValue() + currentTimeMillis;
                    while (!isDone() && currentTimeMillis < longValue) {
                        wait(longValue - currentTimeMillis);
                        currentTimeMillis = System.currentTimeMillis();
                    }
                }
                if (!Thread.interrupted()) {
                    if (!this.f20509g) {
                        if (!this.f20507e) {
                            if (this.f20508f) {
                                return this.c;
                            }
                            throw new TimeoutException();
                        }
                        throw new CancellationException();
                    }
                    throw new ExecutionException(this.f20510h);
                }
                throw new InterruptedException();
            }
            throw new ExecutionException(this.f20510h);
        }
        throw new CancellationException();
    }

    @Override // java.util.concurrent.Future
    public final R get(long j10, TimeUnit timeUnit) {
        return k(Long.valueOf(timeUnit.toMillis(j10)));
    }

    @Override // i4.g
    public final void onDestroy() {
    }

    @Override // i4.g
    public final void onStart() {
    }

    @Override // i4.g
    public final void onStop() {
    }

    @Override // m4.g
    public final void d(m4.f fVar) {
    }

    @Override // m4.g
    public final void g(Drawable drawable) {
    }

    @Override // m4.g
    public final void i(Drawable drawable) {
    }
}
