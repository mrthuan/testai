package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: ChannelFlow.kt */
/* loaded from: classes.dex */
public final class e<T> extends d<T, T> {
    public e(kotlinx.coroutines.flow.c cVar, CoroutineDispatcher coroutineDispatcher, int i10, BufferOverflow bufferOverflow, int i11) {
        super((i11 & 4) != 0 ? -3 : i10, (i11 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineDispatcher, (i11 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow, cVar);
    }

    @Override // kotlinx.coroutines.flow.internal.c
    public final c<T> j(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        return new e(i10, coroutineContext, bufferOverflow, this.f20117d);
    }

    @Override // kotlinx.coroutines.flow.internal.c
    public final kotlinx.coroutines.flow.c<T> k() {
        return (kotlinx.coroutines.flow.c<T>) this.f20117d;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    public final Object m(kotlinx.coroutines.flow.d<? super T> dVar, kotlin.coroutines.c<? super tf.d> cVar) {
        Object a10 = this.f20117d.a(dVar, cVar);
        if (a10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a10;
        }
        return tf.d.f30009a;
    }
}
