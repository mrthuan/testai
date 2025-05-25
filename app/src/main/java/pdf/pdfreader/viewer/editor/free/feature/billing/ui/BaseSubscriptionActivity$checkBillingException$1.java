package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import androidx.activity.s;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseSubscriptionActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$checkBillingException$1", f = "BaseSubscriptionActivity.kt", l = {305}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseSubscriptionActivity$checkBillingException$1 extends SuspendLambda implements cg.p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ BaseSubscriptionActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSubscriptionActivity$checkBillingException$1(BaseSubscriptionActivity baseSubscriptionActivity, kotlin.coroutines.c<? super BaseSubscriptionActivity$checkBillingException$1> cVar) {
        super(2, cVar);
        this.this$0 = baseSubscriptionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BaseSubscriptionActivity$checkBillingException$1(this.this$0, cVar);
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
            BillingConfigImpl.c.D(true);
            BaseSubscriptionActivity baseSubscriptionActivity = this.this$0;
            String string = baseSubscriptionActivity.getString(R.string.arg_res_0x7f130057);
            kotlin.jvm.internal.g.d(string, "getString(R.string.already_sbuscribed)");
            baseSubscriptionActivity.z2(string, false);
            this.label = 1;
            if (e0.a(1000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.this$0.finish();
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((BaseSubscriptionActivity$checkBillingException$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
