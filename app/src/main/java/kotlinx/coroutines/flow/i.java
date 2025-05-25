package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes.dex */
public final class i implements c<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f20096a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ cg.p f20097b;

    public i(cg.p pVar, FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1) {
        this.f20096a = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
        this.f20097b = pVar;
    }

    @Override // kotlinx.coroutines.flow.c
    public final Object a(d<? super Object> dVar, kotlin.coroutines.c<? super tf.d> cVar) {
        Object a10 = this.f20096a.a(new FlowKt__LimitKt$dropWhile$1$1(new Ref$BooleanRef(), dVar, this.f20097b), cVar);
        if (a10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a10;
        }
        return tf.d.f30009a;
    }
}
