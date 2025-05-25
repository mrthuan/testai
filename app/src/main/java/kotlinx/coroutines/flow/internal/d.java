package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.ThreadContextKt;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: ChannelFlow.kt */
/* loaded from: classes.dex */
public abstract class d<S, T> extends c<T> {

    /* renamed from: d  reason: collision with root package name */
    public final kotlinx.coroutines.flow.c<S> f20117d;

    public d(int i10, CoroutineContext coroutineContext, BufferOverflow bufferOverflow, kotlinx.coroutines.flow.c cVar) {
        super(coroutineContext, i10, bufferOverflow);
        this.f20117d = cVar;
    }

    @Override // kotlinx.coroutines.flow.internal.c, kotlinx.coroutines.flow.c
    public final Object a(kotlinx.coroutines.flow.d<? super T> dVar, kotlin.coroutines.c<? super tf.d> cVar) {
        boolean z10;
        if (this.f20116b == -3) {
            CoroutineContext context = cVar.getContext();
            CoroutineContext plus = context.plus(this.f20115a);
            if (kotlin.jvm.internal.g.a(plus, context)) {
                Object m10 = m(dVar, cVar);
                if (m10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return tf.d.f30009a;
                }
                return m10;
            }
            d.a aVar = d.a.f19936a;
            if (kotlin.jvm.internal.g.a(plus.get(aVar), context.get(aVar))) {
                CoroutineContext context2 = cVar.getContext();
                if (dVar instanceof m) {
                    z10 = true;
                } else {
                    z10 = dVar instanceof l;
                }
                if (!z10) {
                    dVar = new UndispatchedContextCollector(dVar, context2);
                }
                Object x02 = t0.x0(plus, dVar, ThreadContextKt.b(plus), new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), cVar);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (x02 != coroutineSingletons) {
                    x02 = tf.d.f30009a;
                }
                if (x02 != coroutineSingletons) {
                    return tf.d.f30009a;
                }
                return x02;
            }
        }
        Object a10 = super.a(dVar, cVar);
        if (a10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return tf.d.f30009a;
        }
        return a10;
    }

    @Override // kotlinx.coroutines.flow.internal.c
    public final Object i(kotlinx.coroutines.channels.j<? super T> jVar, kotlin.coroutines.c<? super tf.d> cVar) {
        Object m10 = m(new m(jVar), cVar);
        if (m10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return tf.d.f30009a;
        }
        return m10;
    }

    public abstract Object m(kotlinx.coroutines.flow.d<? super T> dVar, kotlin.coroutines.c<? super tf.d> cVar);

    @Override // kotlinx.coroutines.flow.internal.c
    public final String toString() {
        return this.f20117d + " -> " + super.toString();
    }
}
