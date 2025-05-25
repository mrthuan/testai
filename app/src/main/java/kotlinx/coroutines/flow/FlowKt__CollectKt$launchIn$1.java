package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Collect.kt */
@wf.c(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FlowKt__CollectKt$launchIn$1 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ c<Object> $this_launchIn;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__CollectKt$launchIn$1(c<Object> cVar, kotlin.coroutines.c<? super FlowKt__CollectKt$launchIn$1> cVar2) {
        super(2, cVar2);
        this.$this_launchIn = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new FlowKt__CollectKt$launchIn$1(this.$this_launchIn, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                androidx.activity.s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            androidx.activity.s.u0(obj);
            c<Object> cVar = this.$this_launchIn;
            this.label = 1;
            Object a10 = cVar.a(kotlinx.coroutines.flow.internal.l.f20124a, this);
            if (a10 != obj2) {
                a10 = tf.d.f30009a;
            }
            if (a10 == obj2) {
                return obj2;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(kotlinx.coroutines.w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((FlowKt__CollectKt$launchIn$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
