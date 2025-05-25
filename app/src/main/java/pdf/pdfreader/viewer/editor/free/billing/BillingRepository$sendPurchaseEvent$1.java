package pdf.pdfreader.viewer.editor.free.billing;

import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.w;

/* compiled from: BillingRepository.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.billing.BillingRepository$sendPurchaseEvent$1", f = "BillingRepository.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BillingRepository$sendPurchaseEvent$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ ol.f $event;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingRepository$sendPurchaseEvent$1(ol.f fVar, kotlin.coroutines.c<? super BillingRepository$sendPurchaseEvent$1> cVar) {
        super(2, cVar);
        this.$event = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BillingRepository$sendPurchaseEvent$1(this.$event, cVar);
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
            v vVar = BillingRepository.f24046g;
            ol.f fVar = this.$event;
            this.label = 1;
            if (vVar.emit(fVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((BillingRepository$sendPurchaseEvent$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
