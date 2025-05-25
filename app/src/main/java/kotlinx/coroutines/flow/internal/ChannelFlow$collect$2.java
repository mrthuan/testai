package kotlinx.coroutines.flow.internal;

import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ChannelsKt;
import kotlinx.coroutines.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChannelFlow.kt */
@wf.c(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ChannelFlow$collect$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ kotlinx.coroutines.flow.d<Object> $collector;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collect$2(kotlinx.coroutines.flow.d<Object> dVar, c<Object> cVar, kotlin.coroutines.c<? super ChannelFlow$collect$2> cVar2) {
        super(2, cVar2);
        this.$collector = dVar;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ChannelFlow$collect$2 channelFlow$collect$2 = new ChannelFlow$collect$2(this.$collector, this.this$0, cVar);
        channelFlow$collect$2.L$0 = obj;
        return channelFlow$collect$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            s.u0(obj);
            kotlinx.coroutines.flow.d<Object> dVar = this.$collector;
            kotlinx.coroutines.channels.l<Object> l10 = this.this$0.l((w) this.L$0);
            this.label = 1;
            Object a10 = FlowKt__ChannelsKt.a(dVar, l10, true, this);
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
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((ChannelFlow$collect$2) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
