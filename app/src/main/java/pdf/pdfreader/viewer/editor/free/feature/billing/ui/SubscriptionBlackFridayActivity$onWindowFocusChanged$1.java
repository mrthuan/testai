package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import am.t1;
import androidx.activity.s;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.w;

/* compiled from: SubscriptionBlackFridayActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionBlackFridayActivity$onWindowFocusChanged$1", f = "SubscriptionBlackFridayActivity.kt", l = {268}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SubscriptionBlackFridayActivity$onWindowFocusChanged$1 extends SuspendLambda implements cg.p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ SubscriptionBlackFridayActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionBlackFridayActivity$onWindowFocusChanged$1(SubscriptionBlackFridayActivity subscriptionBlackFridayActivity, kotlin.coroutines.c<? super SubscriptionBlackFridayActivity$onWindowFocusChanged$1> cVar) {
        super(2, cVar);
        this.this$0 = subscriptionBlackFridayActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SubscriptionBlackFridayActivity$onWindowFocusChanged$1(this.this$0, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ConstraintLayout constraintLayout;
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
            this.label = 1;
            if (e0.a(2000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        SubscriptionBlackFridayActivity subscriptionBlackFridayActivity = this.this$0;
        subscriptionBlackFridayActivity.W = false;
        t1 t1Var = subscriptionBlackFridayActivity.T;
        if (t1Var != null) {
            constraintLayout = t1Var.c();
        } else {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        this.this$0.B2();
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((SubscriptionBlackFridayActivity$onWindowFocusChanged$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
