package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Zip.kt */
@wf.c(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {33, 33}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FlowKt__ZipKt$combine$1$1 extends SuspendLambda implements cg.q<d<Object>, Object[], kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ cg.q<Object, Object, kotlin.coroutines.c<Object>, Object> $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combine$1$1(cg.q<Object, Object, ? super kotlin.coroutines.c<Object>, ? extends Object> qVar, kotlin.coroutines.c<? super FlowKt__ZipKt$combine$1$1> cVar) {
        super(3, cVar);
        this.$transform = qVar;
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
            Object[] objArr = (Object[]) this.L$1;
            cg.q<Object, Object, kotlin.coroutines.c<Object>, Object> qVar = this.$transform;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            this.L$0 = dVar;
            this.label = 1;
            obj = qVar.invoke(obj2, obj3, this);
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
    public final Object invoke(d<Object> dVar, Object[] objArr, kotlin.coroutines.c<? super tf.d> cVar) {
        FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1(this.$transform, cVar);
        flowKt__ZipKt$combine$1$1.L$0 = dVar;
        flowKt__ZipKt$combine$1$1.L$1 = objArr;
        return flowKt__ZipKt$combine$1$1.invokeSuspend(tf.d.f30009a);
    }
}
