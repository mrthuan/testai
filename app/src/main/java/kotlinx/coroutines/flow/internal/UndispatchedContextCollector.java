package kotlinx.coroutines.flow.internal;

import cg.p;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.internal.ThreadContextKt;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: ChannelFlow.kt */
/* loaded from: classes.dex */
public final class UndispatchedContextCollector<T> implements kotlinx.coroutines.flow.d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineContext f20110a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f20111b;
    public final p<T, kotlin.coroutines.c<? super tf.d>, Object> c;

    public UndispatchedContextCollector(kotlinx.coroutines.flow.d<? super T> dVar, CoroutineContext coroutineContext) {
        this.f20110a = coroutineContext;
        this.f20111b = ThreadContextKt.b(coroutineContext);
        this.c = new UndispatchedContextCollector$emitRef$1(dVar, null);
    }

    @Override // kotlinx.coroutines.flow.d
    public final Object emit(T t4, kotlin.coroutines.c<? super tf.d> cVar) {
        Object x02 = t0.x0(this.f20110a, t4, this.f20111b, this.c, cVar);
        if (x02 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return x02;
        }
        return tf.d.f30009a;
    }
}
