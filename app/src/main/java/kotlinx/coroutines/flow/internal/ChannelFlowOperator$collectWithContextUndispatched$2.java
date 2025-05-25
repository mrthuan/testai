package kotlinx.coroutines.flow.internal;

import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: ChannelFlow.kt */
@wf.c(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {ShapeTypes.FLOW_CHART_OFFLINE_STORAGE}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ChannelFlowOperator$collectWithContextUndispatched$2 extends SuspendLambda implements p<kotlinx.coroutines.flow.d<Object>, kotlin.coroutines.c<? super tf.d>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d<Object, Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowOperator$collectWithContextUndispatched$2(d<Object, Object> dVar, kotlin.coroutines.c<? super ChannelFlowOperator$collectWithContextUndispatched$2> cVar) {
        super(2, cVar);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ChannelFlowOperator$collectWithContextUndispatched$2 channelFlowOperator$collectWithContextUndispatched$2 = new ChannelFlowOperator$collectWithContextUndispatched$2(this.this$0, cVar);
        channelFlowOperator$collectWithContextUndispatched$2.L$0 = obj;
        return channelFlowOperator$collectWithContextUndispatched$2;
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
            d<Object, Object> dVar = this.this$0;
            this.label = 1;
            if (dVar.m((kotlinx.coroutines.flow.d) this.L$0, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(kotlinx.coroutines.flow.d<Object> dVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((ChannelFlowOperator$collectWithContextUndispatched$2) create(dVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
