package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: Builders.kt */
/* loaded from: classes.dex */
public class b<T> extends kotlinx.coroutines.flow.internal.c<T> {

    /* renamed from: d  reason: collision with root package name */
    public final cg.p<kotlinx.coroutines.channels.j<? super T>, kotlin.coroutines.c<? super tf.d>, Object> f20092d;

    /* JADX WARN: Multi-variable type inference failed */
    public b(cg.p<? super kotlinx.coroutines.channels.j<? super T>, ? super kotlin.coroutines.c<? super tf.d>, ? extends Object> pVar, CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        super(coroutineContext, i10, bufferOverflow);
        this.f20092d = pVar;
    }

    @Override // kotlinx.coroutines.flow.internal.c
    public final String toString() {
        return "block[" + this.f20092d + "] -> " + super.toString();
    }
}
