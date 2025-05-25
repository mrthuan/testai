package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import androidx.activity.s;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: BaseSubscriptionActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$restoreSubscribe$1", f = "BaseSubscriptionActivity.kt", l = {234}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseSubscriptionActivity$restoreSubscribe$1 extends SuspendLambda implements cg.p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ BaseSubscriptionActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSubscriptionActivity$restoreSubscribe$1(BaseSubscriptionActivity baseSubscriptionActivity, kotlin.coroutines.c<? super BaseSubscriptionActivity$restoreSubscribe$1> cVar) {
        super(2, cVar);
        this.this$0 = baseSubscriptionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BaseSubscriptionActivity$restoreSubscribe$1(this.this$0, cVar);
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
            String string = baseSubscriptionActivity.getString(R.string.arg_res_0x7f130425);
            kotlin.jvm.internal.g.d(string, "getString(R.string.restored_successfully)");
            baseSubscriptionActivity.z2(string, true);
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
        return ((BaseSubscriptionActivity$restoreSubscribe$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
