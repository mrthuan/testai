package kotlinx.coroutines;

import kotlin.Result;

/* compiled from: JobSupport.kt */
/* loaded from: classes.dex */
public final class k1 extends b1 {

    /* renamed from: e  reason: collision with root package name */
    public final kotlin.coroutines.c<tf.d> f20208e;

    public k1(h hVar) {
        this.f20208e = hVar;
    }

    @Override // cg.l
    public final /* bridge */ /* synthetic */ tf.d invoke(Throwable th2) {
        j(th2);
        return tf.d.f30009a;
    }

    @Override // kotlinx.coroutines.r
    public final void j(Throwable th2) {
        this.f20208e.resumeWith(Result.m13constructorimpl(tf.d.f30009a));
    }
}
