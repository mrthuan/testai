package lg;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.s;
import kotlinx.coroutines.q0;

/* compiled from: Dispatcher.kt */
/* loaded from: classes.dex */
public final class a extends q0 implements Executor {
    public static final a c = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final CoroutineDispatcher f20583d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlinx.coroutines.internal.g] */
    static {
        k kVar = k.c;
        int i10 = s.f20199a;
        if (64 >= i10) {
            i10 = 64;
        }
        int c02 = b.b.c0("kotlinx.coroutines.io.parallelism", i10, 0, 0, 12);
        kVar.getClass();
        b.b.m(c02);
        if (c02 < j.f20591d) {
            b.b.m(c02);
            kVar = new kotlinx.coroutines.internal.g(kVar, c02);
        }
        f20583d = kVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        n(EmptyCoroutineContext.INSTANCE, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void n(CoroutineContext coroutineContext, Runnable runnable) {
        f20583d.n(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void o(CoroutineContext coroutineContext, Runnable runnable) {
        f20583d.o(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.IO";
    }
}
