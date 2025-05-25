package kotlinx.coroutines;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes.dex */
public final class v0 extends e {

    /* renamed from: a  reason: collision with root package name */
    public final cg.l<Throwable, tf.d> f20271a;

    /* JADX WARN: Multi-variable type inference failed */
    public v0(cg.l<? super Throwable, tf.d> lVar) {
        this.f20271a = lVar;
    }

    @Override // kotlinx.coroutines.f
    public final void c(Throwable th2) {
        this.f20271a.invoke(th2);
    }

    @Override // cg.l
    public final /* bridge */ /* synthetic */ tf.d invoke(Throwable th2) {
        c(th2);
        return tf.d.f30009a;
    }

    public final String toString() {
        return "InvokeOnCancel[" + this.f20271a.getClass().getSimpleName() + '@' + y.b(this) + ']';
    }
}
