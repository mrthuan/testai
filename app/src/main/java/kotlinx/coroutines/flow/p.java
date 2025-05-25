package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes.dex */
public final class p implements c<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f20131a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f20132b;
    public final /* synthetic */ cg.q c;

    public p(c cVar, c cVar2, cg.q qVar) {
        this.f20131a = cVar;
        this.f20132b = cVar2;
        this.c = qVar;
    }

    @Override // kotlinx.coroutines.flow.c
    public final Object a(d<? super Object> dVar, kotlin.coroutines.c<? super tf.d> cVar) {
        Object a10 = kotlinx.coroutines.flow.internal.g.a(new c[]{this.f20131a, this.f20132b}, FlowKt__ZipKt$nullArrayFactory$1.INSTANCE, new FlowKt__ZipKt$combine$1$1(this.c, null), dVar, cVar);
        if (a10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a10;
        }
        return tf.d.f30009a;
    }
}
