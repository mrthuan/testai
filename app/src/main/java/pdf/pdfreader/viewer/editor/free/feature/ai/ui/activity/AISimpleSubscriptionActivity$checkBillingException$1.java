package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;

/* compiled from: AISimpleSubscriptionActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity$checkBillingException$1", f = "AISimpleSubscriptionActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AISimpleSubscriptionActivity$checkBillingException$1 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ AISimpleSubscriptionActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AISimpleSubscriptionActivity$checkBillingException$1(AISimpleSubscriptionActivity aISimpleSubscriptionActivity, kotlin.coroutines.c<? super AISimpleSubscriptionActivity$checkBillingException$1> cVar) {
        super(2, cVar);
        this.this$0 = aISimpleSubscriptionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AISimpleSubscriptionActivity$checkBillingException$1(this.this$0, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            androidx.activity.s.u0(obj);
            BillingConfigImpl.c.D(true);
            AISimpleSubscriptionActivity aISimpleSubscriptionActivity = this.this$0;
            String string = aISimpleSubscriptionActivity.getString(R.string.arg_res_0x7f130057);
            kotlin.jvm.internal.g.d(string, "getString(R.string.already_sbuscribed)");
            aISimpleSubscriptionActivity.g2(string, false);
            return tf.d.f30009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.p
    public final Object invoke(kotlinx.coroutines.w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((AISimpleSubscriptionActivity$checkBillingException$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
