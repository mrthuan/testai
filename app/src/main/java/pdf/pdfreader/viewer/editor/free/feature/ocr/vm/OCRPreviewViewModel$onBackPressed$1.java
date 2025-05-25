package pdf.pdfreader.viewer.editor.free.feature.ocr.vm;

import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.w;
import tf.d;
import wf.c;

/* compiled from: OCRPreviewViewModel.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRPreviewViewModel$onBackPressed$1", f = "OCRPreviewViewModel.kt", l = {16}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class OCRPreviewViewModel$onBackPressed$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    int label;
    final /* synthetic */ OCRPreviewViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCRPreviewViewModel$onBackPressed$1(OCRPreviewViewModel oCRPreviewViewModel, kotlin.coroutines.c<? super OCRPreviewViewModel$onBackPressed$1> cVar) {
        super(2, cVar);
        this.this$0 = oCRPreviewViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OCRPreviewViewModel$onBackPressed$1(this.this$0, cVar);
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
            v vVar = this.this$0.f25232d;
            Boolean bool = Boolean.TRUE;
            this.label = 1;
            if (vVar.emit(bool, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((OCRPreviewViewModel$onBackPressed$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
