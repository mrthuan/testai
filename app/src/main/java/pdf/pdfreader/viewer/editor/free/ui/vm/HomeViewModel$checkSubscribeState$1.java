package pdf.pdfreader.viewer.editor.free.ui.vm;

import androidx.activity.s;
import cg.p;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.billing.BillingRepository;
import tf.d;
import wf.c;

/* compiled from: HomeViewModel.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.ui.vm.HomeViewModel$checkSubscribeState$1", f = "HomeViewModel.kt", l = {22}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class HomeViewModel$checkSubscribeState$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    int label;

    public HomeViewModel$checkSubscribeState$1(kotlin.coroutines.c<? super HomeViewModel$checkSubscribeState$1> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new HomeViewModel$checkSubscribeState$1(cVar);
    }

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
            this.label = 1;
            if (billingRepository.b(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((HomeViewModel$checkSubscribeState$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
