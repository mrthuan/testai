package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Distinct.kt */
/* loaded from: classes.dex */
public final class DistinctFlowImpl<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final c<T> f20050a;

    /* renamed from: b  reason: collision with root package name */
    public final cg.l<T, Object> f20051b;
    public final cg.p<Object, Object, Boolean> c;

    public DistinctFlowImpl(c cVar) {
        cg.p<Object, Object, Boolean> pVar = FlowKt__DistinctKt.f20055b;
        this.f20050a = cVar;
        this.f20051b = (cg.l<T, Object>) FlowKt__DistinctKt.f20054a;
        this.c = pVar;
    }

    @Override // kotlinx.coroutines.flow.c
    public final Object a(d<? super T> dVar, kotlin.coroutines.c<? super tf.d> cVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = (T) ea.a.f16519d;
        Object a10 = this.f20050a.a(new DistinctFlowImpl$collect$2(this, ref$ObjectRef, dVar), cVar);
        if (a10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a10;
        }
        return tf.d.f30009a;
    }
}
