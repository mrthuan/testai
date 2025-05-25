package kotlinx.coroutines;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<n0> f20224a = new ThreadLocal<>();

    public static n0 a() {
        ThreadLocal<n0> threadLocal = f20224a;
        n0 n0Var = threadLocal.get();
        if (n0Var == null) {
            c cVar = new c(Thread.currentThread());
            threadLocal.set(cVar);
            return cVar;
        }
        return n0Var;
    }
}
