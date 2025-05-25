package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import androidx.activity.s;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;

/* compiled from: BaseSubscriptionActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$startPurchaseProduction$2", f = "BaseSubscriptionActivity.kt", l = {554}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseSubscriptionActivity$startPurchaseProduction$2 extends SuspendLambda implements cg.p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ String $offerToken;
    int label;
    final /* synthetic */ BaseSubscriptionActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSubscriptionActivity$startPurchaseProduction$2(BaseSubscriptionActivity baseSubscriptionActivity, String str, kotlin.coroutines.c<? super BaseSubscriptionActivity$startPurchaseProduction$2> cVar) {
        super(2, cVar);
        this.this$0 = baseSubscriptionActivity;
        this.$offerToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BaseSubscriptionActivity$startPurchaseProduction$2(this.this$0, this.$offerToken, cVar);
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
            BaseSubscriptionActivity baseSubscriptionActivity = this.this$0;
            String str = this.$offerToken;
            this.label = 1;
            if (BaseSubscriptionActivity.c2(baseSubscriptionActivity, str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((BaseSubscriptionActivity$startPurchaseProduction$2) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
