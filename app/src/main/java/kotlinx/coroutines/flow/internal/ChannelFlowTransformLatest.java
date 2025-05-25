package kotlinx.coroutines.flow.internal;

import cg.q;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.x;

/* compiled from: Merge.kt */
/* loaded from: classes.dex */
public final class ChannelFlowTransformLatest<T, R> extends d<T, R> {

    /* renamed from: e  reason: collision with root package name */
    public final q<kotlinx.coroutines.flow.d<? super R>, T, kotlin.coroutines.c<? super tf.d>, Object> f20098e;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest(q<? super kotlinx.coroutines.flow.d<? super R>, ? super T, ? super kotlin.coroutines.c<? super tf.d>, ? extends Object> qVar, kotlinx.coroutines.flow.c<? extends T> cVar, CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        super(i10, coroutineContext, bufferOverflow, cVar);
        this.f20098e = qVar;
    }

    @Override // kotlinx.coroutines.flow.internal.c
    public final c<R> j(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        return new ChannelFlowTransformLatest(this.f20098e, this.f20117d, coroutineContext, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    public final Object m(kotlinx.coroutines.flow.d<? super R> dVar, kotlin.coroutines.c<? super tf.d> cVar) {
        Object c = x.c(new ChannelFlowTransformLatest$flowCollect$3(this, dVar, null), cVar);
        if (c == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return c;
        }
        return tf.d.f30009a;
    }
}
