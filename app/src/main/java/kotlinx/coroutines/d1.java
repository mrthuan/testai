package kotlinx.coroutines;

import kotlin.Result;
import kotlin.coroutines.CoroutineContext;

/* compiled from: Builders.common.kt */
/* loaded from: classes.dex */
public final class d1<T> extends c0<T> {

    /* renamed from: d  reason: collision with root package name */
    public final kotlin.coroutines.c<tf.d> f20046d;

    public d1(CoroutineContext coroutineContext, cg.p<? super w, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar) {
        super(coroutineContext, false);
        this.f20046d = com.google.android.play.core.assetpacks.b1.t(pVar, this, this);
    }

    @Override // kotlinx.coroutines.c1
    public final void e0() {
        try {
            ge.a.O(com.google.android.play.core.assetpacks.b1.L(this.f20046d), Result.m13constructorimpl(tf.d.f30009a), null);
        } catch (Throwable th2) {
            resumeWith(Result.m13constructorimpl(androidx.activity.s.v(th2)));
            throw th2;
        }
    }
}
