package kotlinx.coroutines;

/* compiled from: Job.kt */
/* loaded from: classes.dex */
public final class h1 implements k0, k {

    /* renamed from: a  reason: collision with root package name */
    public static final h1 f20160a = new h1();

    @Override // kotlinx.coroutines.k
    public final boolean b(Throwable th2) {
        return false;
    }

    @Override // kotlinx.coroutines.k
    public final y0 getParent() {
        return null;
    }

    public final String toString() {
        return "NonDisposableHandle";
    }

    @Override // kotlinx.coroutines.k0
    public final void dispose() {
    }
}
