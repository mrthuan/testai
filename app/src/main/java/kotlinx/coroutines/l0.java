package kotlinx.coroutines;

/* compiled from: CancellableContinuation.kt */
/* loaded from: classes.dex */
public final class l0 extends e {

    /* renamed from: a  reason: collision with root package name */
    public final k0 f20210a;

    public l0(k0 k0Var) {
        this.f20210a = k0Var;
    }

    @Override // kotlinx.coroutines.f
    public final void c(Throwable th2) {
        this.f20210a.dispose();
    }

    @Override // cg.l
    public final /* bridge */ /* synthetic */ tf.d invoke(Throwable th2) {
        c(th2);
        return tf.d.f30009a;
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.f20210a + ']';
    }
}
