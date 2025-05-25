package pdf.pdfreader.viewer.editor.free.billing;

import androidx.activity.s;
import cg.p;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.billing.exception.BillingException;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;

/* compiled from: BillingRepository.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.billing.BillingRepository$checkSubscribeStateSafely$2", f = "BillingRepository.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BillingRepository$checkSubscribeStateSafely$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super Result<? extends tf.d>>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    public BillingRepository$checkSubscribeStateSafely$2(kotlin.coroutines.c<? super BillingRepository$checkSubscribeStateSafely$2> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        BillingRepository$checkSubscribeStateSafely$2 billingRepository$checkSubscribeStateSafely$2 = new BillingRepository$checkSubscribeStateSafely$2(cVar);
        billingRepository$checkSubscribeStateSafely$2.L$0 = obj;
        return billingRepository$checkSubscribeStateSafely$2;
    }

    @Override // cg.p
    public /* bridge */ /* synthetic */ Object invoke(w wVar, kotlin.coroutines.c<? super Result<? extends tf.d>> cVar) {
        return invoke2(wVar, (kotlin.coroutines.c<? super Result<tf.d>>) cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m13constructorimpl;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    s.u0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                s.u0(obj);
                w wVar = (w) this.L$0;
                BillingRepository billingRepository = BillingRepository.f24041a;
                this.label = 1;
                if (BillingRepository.a(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            m13constructorimpl = Result.m13constructorimpl(tf.d.f30009a);
        } catch (Throwable th2) {
            m13constructorimpl = Result.m13constructorimpl(s.v(th2));
        }
        Throwable m16exceptionOrNullimpl = Result.m16exceptionOrNullimpl(m13constructorimpl);
        if (m16exceptionOrNullimpl != null) {
            BillingRepository billingRepository2 = BillingRepository.f24041a;
            BillingRepository.f("checkSubscribeState failed " + m16exceptionOrNullimpl);
            if ((m16exceptionOrNullimpl instanceof BillingException) && ((BillingException) m16exceptionOrNullimpl).getErrorCode() == 2007) {
                i iVar = BillingRepository.f24042b;
                if (iVar != null) {
                    ((BillingConfigImpl) iVar).D(false);
                } else {
                    kotlin.jvm.internal.g.i("billingConfig");
                    throw null;
                }
            }
        }
        return Result.m12boximpl(m13constructorimpl);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(w wVar, kotlin.coroutines.c<? super Result<tf.d>> cVar) {
        return ((BillingRepository$checkSubscribeStateSafely$2) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
