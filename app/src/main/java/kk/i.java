package kk;

/* compiled from: ForwardingSink.kt */
/* loaded from: classes3.dex */
public abstract class i implements w {

    /* renamed from: a  reason: collision with root package name */
    public final w f19827a;

    public i(w delegate) {
        kotlin.jvm.internal.g.e(delegate, "delegate");
        this.f19827a = delegate;
    }

    @Override // kk.w
    public void D(f source, long j10) {
        kotlin.jvm.internal.g.e(source, "source");
        this.f19827a.D(source, j10);
    }

    @Override // kk.w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f19827a.close();
    }

    @Override // kk.w, java.io.Flushable
    public void flush() {
        this.f19827a.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f19827a + ')';
    }

    @Override // kk.w
    public final z z() {
        return this.f19827a.z();
    }
}
