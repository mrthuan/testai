package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.billing.SubscriptionType;

/* compiled from: AISimpleSubscriptionActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity$startPurchase$2", f = "AISimpleSubscriptionActivity.kt", l = {ShapeTypes.ACTION_BUTTON_HELP}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AISimpleSubscriptionActivity$startPurchase$2 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ SubscriptionType $freeTrialType;
    final /* synthetic */ String $page;
    int label;
    final /* synthetic */ AISimpleSubscriptionActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AISimpleSubscriptionActivity$startPurchase$2(AISimpleSubscriptionActivity aISimpleSubscriptionActivity, SubscriptionType subscriptionType, String str, kotlin.coroutines.c<? super AISimpleSubscriptionActivity$startPurchase$2> cVar) {
        super(2, cVar);
        this.this$0 = aISimpleSubscriptionActivity;
        this.$freeTrialType = subscriptionType;
        this.$page = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AISimpleSubscriptionActivity$startPurchase$2(this.this$0, this.$freeTrialType, this.$page, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                androidx.activity.s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            androidx.activity.s.u0(obj);
            AISimpleSubscriptionActivity aISimpleSubscriptionActivity = this.this$0;
            SubscriptionType subscriptionType = this.$freeTrialType;
            String str = this.$page;
            this.label = 1;
            if (AISimpleSubscriptionActivity.b2(aISimpleSubscriptionActivity, subscriptionType, str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(kotlinx.coroutines.w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((AISimpleSubscriptionActivity$startPurchase$2) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
