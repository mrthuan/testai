package kk;

/* compiled from: ForwardingSource.kt */
/* loaded from: classes3.dex */
public abstract class j implements y {

    /* renamed from: a  reason: collision with root package name */
    public final y f19828a;

    public j(y delegate) {
        kotlin.jvm.internal.g.e(delegate, "delegate");
        this.f19828a = delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f19828a.close();
    }

    @Override // kk.y
    public long g(f sink, long j10) {
        kotlin.jvm.internal.g.e(sink, "sink");
        return this.f19828a.g(sink, 8192L);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f19828a + ')';
    }

    @Override // kk.y
    public final z z() {
        return this.f19828a.z();
    }
}
