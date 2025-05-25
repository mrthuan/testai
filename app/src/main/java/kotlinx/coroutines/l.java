package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
/* loaded from: classes.dex */
public final class l extends z0 implements k {

    /* renamed from: e  reason: collision with root package name */
    public final m f20209e;

    public l(c1 c1Var) {
        this.f20209e = c1Var;
    }

    @Override // kotlinx.coroutines.k
    public final boolean b(Throwable th2) {
        return k().I(th2);
    }

    @Override // cg.l
    public final /* bridge */ /* synthetic */ tf.d invoke(Throwable th2) {
        j(th2);
        return tf.d.f30009a;
    }

    @Override // kotlinx.coroutines.r
    public final void j(Throwable th2) {
        this.f20209e.w(k());
    }
}
