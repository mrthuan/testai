package pdf.pdfreader.viewer.editor.free.billing;

import androidx.activity.s;
import cg.p;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.billing.exception.BillingException;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;

/* compiled from: BillingRepository.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.billing.BillingRepository$fetchSubscribeInfoSync$1", f = "BillingRepository.kt", l = {77}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BillingRepository$fetchSubscribeInfoSync$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    public BillingRepository$fetchSubscribeInfoSync$1(kotlin.coroutines.c<? super BillingRepository$fetchSubscribeInfoSync$1> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        BillingRepository$fetchSubscribeInfoSync$1 billingRepository$fetchSubscribeInfoSync$1 = new BillingRepository$fetchSubscribeInfoSync$1(cVar);
        billingRepository$fetchSubscribeInfoSync$1.L$0 = obj;
        return billingRepository$fetchSubscribeInfoSync$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m13constructorimpl;
        i iVar;
        ol.d b10;
        ol.d dVar;
        ol.d b11;
        ol.d dVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    w wVar = (w) this.L$0;
                    s.u0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                s.u0(obj);
                w wVar2 = (w) this.L$0;
                BillingRepository billingRepository = BillingRepository.f24041a;
                this.L$0 = wVar2;
                this.label = 1;
                if (BillingRepository.c(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            m13constructorimpl = Result.m13constructorimpl(tf.d.f30009a);
        } catch (Throwable th2) {
            m13constructorimpl = Result.m13constructorimpl(s.v(th2));
        }
        Throwable m16exceptionOrNullimpl = Result.m16exceptionOrNullimpl(m13constructorimpl);
        if (m16exceptionOrNullimpl != null) {
            try {
                iVar = BillingRepository.f24042b;
            } catch (Throwable th3) {
                Result.m13constructorimpl(s.v(th3));
            }
            if (iVar != null) {
                r<ol.d> k10 = ((BillingConfigImpl) iVar).k();
                do {
                    b10 = k10.b();
                    ol.d dVar3 = b10;
                    i iVar2 = BillingRepository.f24042b;
                    if (iVar2 != null) {
                        if (((BillingConfigImpl) iVar2).q()) {
                            dVar = ol.e.f23480d;
                        } else {
                            dVar = ol.e.c;
                        }
                    } else {
                        kotlin.jvm.internal.g.i("billingConfig");
                        throw null;
                    }
                } while (!k10.c(b10, dVar));
                i iVar3 = BillingRepository.f24042b;
                if (iVar3 != null) {
                    r<ol.d> m10 = ((BillingConfigImpl) iVar3).m();
                    do {
                        b11 = m10.b();
                        ol.d dVar4 = b11;
                        i iVar4 = BillingRepository.f24042b;
                        if (iVar4 != null) {
                            if (((BillingConfigImpl) iVar4).q()) {
                                dVar2 = ol.e.f23480d;
                            } else {
                                dVar2 = ol.e.c;
                            }
                        } else {
                            kotlin.jvm.internal.g.i("billingConfig");
                            throw null;
                        }
                    } while (!m10.c(b11, dVar2));
                    Result.m13constructorimpl(tf.d.f30009a);
                    BillingRepository billingRepository2 = BillingRepository.f24041a;
                    BillingRepository.f("fetchSubscribeInfo failed " + m16exceptionOrNullimpl);
                    if ((m16exceptionOrNullimpl instanceof BillingException) && ((BillingException) m16exceptionOrNullimpl).getErrorCode() == 2007) {
                        i iVar5 = BillingRepository.f24042b;
                        if (iVar5 != null) {
                            ((BillingConfigImpl) iVar5).D(false);
                        } else {
                            kotlin.jvm.internal.g.i("billingConfig");
                            throw null;
                        }
                    }
                } else {
                    kotlin.jvm.internal.g.i("billingConfig");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.g.i("billingConfig");
                throw null;
            }
        }
        BillingRepository.f24044e = null;
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((BillingRepository$fetchSubscribeInfoSync$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
