package pdf.pdfreader.viewer.editor.free.feature.billing.vm;

import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.w;
import pm.b;
import tf.d;
import wf.c;

/* compiled from: SubscriptionViewModel.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.billing.vm.SubscriptionViewModel$sendRestorePurchaseEvent$1", f = "SubscriptionViewModel.kt", l = {107}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SubscriptionViewModel$sendRestorePurchaseEvent$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    int label;
    final /* synthetic */ SubscriptionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionViewModel$sendRestorePurchaseEvent$1(SubscriptionViewModel subscriptionViewModel, kotlin.coroutines.c<? super SubscriptionViewModel$sendRestorePurchaseEvent$1> cVar) {
        super(2, cVar);
        this.this$0 = subscriptionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SubscriptionViewModel$sendRestorePurchaseEvent$1(this.this$0, cVar);
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
            v vVar = this.this$0.f24948d;
            b.d dVar = b.d.f28978a;
            this.label = 1;
            if (vVar.emit(dVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((SubscriptionViewModel$sendRestorePurchaseEvent$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
