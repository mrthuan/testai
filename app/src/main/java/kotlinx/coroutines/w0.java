package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: JobSupport.kt */
/* loaded from: classes.dex */
public final class w0 extends z0 {

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20272f = AtomicIntegerFieldUpdater.newUpdater(w0.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: e  reason: collision with root package name */
    public final cg.l<Throwable, tf.d> f20273e;

    /* JADX WARN: Multi-variable type inference failed */
    public w0(cg.l<? super Throwable, tf.d> lVar) {
        this.f20273e = lVar;
    }

    @Override // cg.l
    public final /* bridge */ /* synthetic */ tf.d invoke(Throwable th2) {
        j(th2);
        return tf.d.f30009a;
    }

    @Override // kotlinx.coroutines.r
    public final void j(Throwable th2) {
        if (f20272f.compareAndSet(this, 0, 1)) {
            this.f20273e.invoke(th2);
        }
    }
}
