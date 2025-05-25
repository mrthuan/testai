package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import androidx.activity.s;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import kotlinx.coroutines.x;
import pdf.pdfreader.viewer.editor.free.billing.BillingRepository;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: BaseSubscriptionActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$restoreSubscribe$2", f = "BaseSubscriptionActivity.kt", l = {254}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseSubscriptionActivity$restoreSubscribe$2 extends SuspendLambda implements cg.p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;
    final /* synthetic */ BaseSubscriptionActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSubscriptionActivity$restoreSubscribe$2(BaseSubscriptionActivity baseSubscriptionActivity, kotlin.coroutines.c<? super BaseSubscriptionActivity$restoreSubscribe$2> cVar) {
        super(2, cVar);
        this.this$0 = baseSubscriptionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BaseSubscriptionActivity$restoreSubscribe$2(this.this$0, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$restoreSubscribe$2$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                s.u0(obj);
                ((Result) obj).m21unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            s.u0(obj);
            BillingRepository billingRepository = BillingRepository.f24041a;
            final BaseSubscriptionActivity baseSubscriptionActivity = this.this$0;
            ?? r32 = new pl.b() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$restoreSubscribe$2.1
                @Override // pl.b
                public final void a() {
                    BaseSubscriptionActivity baseSubscriptionActivity2 = BaseSubscriptionActivity.this;
                    if (x.d(b.b.x(baseSubscriptionActivity2))) {
                        t0.d0(b.b.x(baseSubscriptionActivity2), null, null, new BaseSubscriptionActivity$restoreSubscribe$2$1$onFailure$1(baseSubscriptionActivity2, null), 3);
                    }
                }

                @Override // pl.b
                public final void onSuccess() {
                    BaseSubscriptionActivity baseSubscriptionActivity2 = BaseSubscriptionActivity.this;
                    if (x.d(b.b.x(baseSubscriptionActivity2))) {
                        t0.d0(b.b.x(baseSubscriptionActivity2), null, null, new BaseSubscriptionActivity$restoreSubscribe$2$1$onSuccess$1(baseSubscriptionActivity2, null), 3);
                    }
                }
            };
            this.label = 1;
            if (billingRepository.g(baseSubscriptionActivity, r32, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((BaseSubscriptionActivity$restoreSubscribe$2) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
