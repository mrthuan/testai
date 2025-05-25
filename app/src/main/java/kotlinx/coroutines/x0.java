package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
/* loaded from: classes.dex */
public final class x0 extends b1 {

    /* renamed from: e  reason: collision with root package name */
    public final cg.l<Throwable, tf.d> f20274e;

    /* JADX WARN: Multi-variable type inference failed */
    public x0(cg.l<? super Throwable, tf.d> lVar) {
        this.f20274e = lVar;
    }

    @Override // cg.l
    public final /* bridge */ /* synthetic */ tf.d invoke(Throwable th2) {
        j(th2);
        return tf.d.f30009a;
    }

    @Override // kotlinx.coroutines.r
    public final void j(Throwable th2) {
        this.f20274e.invoke(th2);
    }
}
