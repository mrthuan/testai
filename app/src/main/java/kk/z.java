package kk;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: Timeout.kt */
/* loaded from: classes3.dex */
public class z {

    /* renamed from: d  reason: collision with root package name */
    public static final a f19858d = new a();

    /* renamed from: a  reason: collision with root package name */
    public boolean f19859a;

    /* renamed from: b  reason: collision with root package name */
    public long f19860b;
    public long c;

    public z a() {
        this.f19859a = false;
        return this;
    }

    public z b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.f19859a) {
            return this.f19860b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public z d(long j10) {
        this.f19859a = true;
        this.f19860b = j10;
        return this;
    }

    public boolean e() {
        return this.f19859a;
    }

    public void f() {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.f19859a && this.f19860b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public z g(long j10, TimeUnit unit) {
        boolean z10;
        kotlin.jvm.internal.g.e(unit, "unit");
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.c = unit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(androidx.appcompat.view.menu.d.c("timeout < 0: ", j10).toString());
    }

    /* compiled from: Timeout.kt */
    /* loaded from: classes3.dex */
    public static final class a extends z {
        @Override // kk.z
        public final z g(long j10, TimeUnit unit) {
            kotlin.jvm.internal.g.e(unit, "unit");
            return this;
        }

        @Override // kk.z
        public final void f() {
        }

        @Override // kk.z
        public final z d(long j10) {
            return this;
        }
    }
}
