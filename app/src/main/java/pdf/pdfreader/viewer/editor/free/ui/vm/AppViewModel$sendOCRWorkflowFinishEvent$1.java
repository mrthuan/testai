package pdf.pdfreader.viewer.editor.free.ui.vm;

import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OCRWorkFlow;
import tf.d;
import wf.c;

/* compiled from: AppViewModel.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.ui.vm.AppViewModel$sendOCRWorkflowFinishEvent$1", f = "AppViewModel.kt", l = {87}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AppViewModel$sendOCRWorkflowFinishEvent$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ OCRWorkFlow $workflow;
    int label;
    final /* synthetic */ AppViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppViewModel$sendOCRWorkflowFinishEvent$1(AppViewModel appViewModel, OCRWorkFlow oCRWorkFlow, kotlin.coroutines.c<? super AppViewModel$sendOCRWorkflowFinishEvent$1> cVar) {
        super(2, cVar);
        this.this$0 = appViewModel;
        this.$workflow = oCRWorkFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AppViewModel$sendOCRWorkflowFinishEvent$1(this.this$0, this.$workflow, cVar);
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
            StateFlowImpl stateFlowImpl = this.this$0.f28156m;
            OCRWorkFlow oCRWorkFlow = this.$workflow;
            this.label = 1;
            stateFlowImpl.setValue(oCRWorkFlow);
            if (d.f30009a == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((AppViewModel$sendOCRWorkflowFinishEvent$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
