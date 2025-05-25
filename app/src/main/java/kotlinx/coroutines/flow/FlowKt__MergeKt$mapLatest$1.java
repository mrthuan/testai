package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Merge.kt */
@wf.c(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {217, 217}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FlowKt__MergeKt$mapLatest$1 extends SuspendLambda implements cg.q<d<Object>, Object, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ cg.p<Object, kotlin.coroutines.c<Object>, Object> $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__MergeKt$mapLatest$1(cg.p<Object, ? super kotlin.coroutines.c<Object>, ? extends Object> pVar, kotlin.coroutines.c<? super FlowKt__MergeKt$mapLatest$1> cVar) {
        super(3, cVar);
        this.$transform = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    androidx.activity.s.u0(obj);
                    return tf.d.f30009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (d) this.L$0;
            androidx.activity.s.u0(obj);
        } else {
            androidx.activity.s.u0(obj);
            dVar = (d) this.L$0;
            Object obj2 = this.L$1;
            cg.p<Object, kotlin.coroutines.c<Object>, Object> pVar = this.$transform;
            this.L$0 = dVar;
            this.label = 1;
            obj = pVar.invoke(obj2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.L$0 = null;
        this.label = 2;
        if (dVar.emit(obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return tf.d.f30009a;
    }

    @Override // cg.q
    public final Object invoke(d<Object> dVar, Object obj, kotlin.coroutines.c<? super tf.d> cVar) {
        FlowKt__MergeKt$mapLatest$1 flowKt__MergeKt$mapLatest$1 = new FlowKt__MergeKt$mapLatest$1(this.$transform, cVar);
        flowKt__MergeKt$mapLatest$1.L$0 = dVar;
        flowKt__MergeKt$mapLatest$1.L$1 = obj;
        return flowKt__MergeKt$mapLatest$1.invokeSuspend(tf.d.f30009a);
    }
}
