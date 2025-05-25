package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes.dex */
public final class k implements c<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f20128a;

    public k(FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1) {
        this.f20128a = flowKt__MergeKt$flatMapConcat$$inlined$map$1;
    }

    @Override // kotlinx.coroutines.flow.c
    public final Object a(d<? super Object> dVar, kotlin.coroutines.c<? super tf.d> cVar) {
        Object a10 = this.f20128a.a(new FlowKt__MergeKt$flattenConcat$1$1(dVar), cVar);
        if (a10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a10;
        }
        return tf.d.f30009a;
    }
}
