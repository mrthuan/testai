package kotlinx.coroutines.flow.internal;

import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChannelFlow.kt */
@wf.c(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ChannelFlow$collectToFun$1 extends SuspendLambda implements p<kotlinx.coroutines.channels.j<Object>, kotlin.coroutines.c<? super tf.d>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collectToFun$1(c<Object> cVar, kotlin.coroutines.c<? super ChannelFlow$collectToFun$1> cVar2) {
        super(2, cVar2);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this.this$0, cVar);
        channelFlow$collectToFun$1.L$0 = obj;
        return channelFlow$collectToFun$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            s.u0(obj);
            c<Object> cVar = this.this$0;
            this.label = 1;
            if (cVar.i((kotlinx.coroutines.channels.j) this.L$0, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(kotlinx.coroutines.channels.j<Object> jVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((ChannelFlow$collectToFun$1) create(jVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
