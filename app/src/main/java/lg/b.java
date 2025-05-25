package lg;

/* compiled from: Dispatcher.kt */
/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: d  reason: collision with root package name */
    public static final b f20584d = new b();

    public b() {
        super(j.c, j.f20591d, j.f20592e, j.f20589a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.Default";
    }
}
