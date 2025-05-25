package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: SendingCollector.kt */
/* loaded from: classes.dex */
public final class m<T> implements kotlinx.coroutines.flow.d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final kotlinx.coroutines.channels.m<T> f20125a;

    /* JADX WARN: Multi-variable type inference failed */
    public m(kotlinx.coroutines.channels.m<? super T> mVar) {
        this.f20125a = mVar;
    }

    @Override // kotlinx.coroutines.flow.d
    public final Object emit(T t4, kotlin.coroutines.c<? super tf.d> cVar) {
        Object x4 = this.f20125a.x(t4, cVar);
        if (x4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return x4;
        }
        return tf.d.f30009a;
    }
}
