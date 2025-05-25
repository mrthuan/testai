package pdf.pdfreader.viewer.editor.free.feature.guide.vm;

import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.w;
import tf.d;
import tm.a;
import wf.c;

/* compiled from: InquiryAfterGuideViewModel.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.guide.vm.InquiryAfterGuideViewModel$sendPreviousEvent$1", f = "InquiryAfterGuideViewModel.kt", l = {124}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class InquiryAfterGuideViewModel$sendPreviousEvent$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    int label;
    final /* synthetic */ InquiryAfterGuideViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InquiryAfterGuideViewModel$sendPreviousEvent$1(InquiryAfterGuideViewModel inquiryAfterGuideViewModel, kotlin.coroutines.c<? super InquiryAfterGuideViewModel$sendPreviousEvent$1> cVar) {
        super(2, cVar);
        this.this$0 = inquiryAfterGuideViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new InquiryAfterGuideViewModel$sendPreviousEvent$1(this.this$0, cVar);
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
            v vVar = this.this$0.f25041e;
            a.C0378a c0378a = a.C0378a.f30061a;
            this.label = 1;
            if (vVar.emit(c0378a, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((InquiryAfterGuideViewModel$sendPreviousEvent$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
