package kk;

import java.util.concurrent.TimeUnit;

/* compiled from: ForwardingTimeout.kt */
/* loaded from: classes3.dex */
public final class k extends z {

    /* renamed from: e  reason: collision with root package name */
    public z f19829e;

    public k(z delegate) {
        kotlin.jvm.internal.g.e(delegate, "delegate");
        this.f19829e = delegate;
    }

    @Override // kk.z
    public final z a() {
        return this.f19829e.a();
    }

    @Override // kk.z
    public final z b() {
        return this.f19829e.b();
    }

    @Override // kk.z
    public final long c() {
        return this.f19829e.c();
    }

    @Override // kk.z
    public final z d(long j10) {
        return this.f19829e.d(j10);
    }

    @Override // kk.z
    public final boolean e() {
        return this.f19829e.e();
    }

    @Override // kk.z
    public final void f() {
        this.f19829e.f();
    }

    @Override // kk.z
    public final z g(long j10, TimeUnit unit) {
        kotlin.jvm.internal.g.e(unit, "unit");
        return this.f19829e.g(j10, unit);
    }
}
