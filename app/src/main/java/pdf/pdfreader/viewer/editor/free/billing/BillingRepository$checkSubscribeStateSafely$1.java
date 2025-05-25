package pdf.pdfreader.viewer.editor.free.billing;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: BillingRepository.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.billing.BillingRepository", f = "BillingRepository.kt", l = {ShapeTypes.CHART_STAR}, m = "checkSubscribeStateSafely-IoAF18A")
/* loaded from: classes3.dex */
public final class BillingRepository$checkSubscribeStateSafely$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BillingRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingRepository$checkSubscribeStateSafely$1(BillingRepository billingRepository, kotlin.coroutines.c<? super BillingRepository$checkSubscribeStateSafely$1> cVar) {
        super(cVar);
        this.this$0 = billingRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= SlideAtom.USES_MASTER_SLIDE_ID;
        Object b10 = this.this$0.b(this);
        if (b10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return b10;
        }
        return Result.m12boximpl(b10);
    }
}
