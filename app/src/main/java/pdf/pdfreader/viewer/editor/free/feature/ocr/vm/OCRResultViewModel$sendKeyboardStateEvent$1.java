package pdf.pdfreader.viewer.editor.free.feature.ocr.vm;

import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.w;
import tf.d;
import wf.c;

/* compiled from: OCRResultViewModel.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRResultViewModel$sendKeyboardStateEvent$1", f = "OCRResultViewModel.kt", l = {86}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class OCRResultViewModel$sendKeyboardStateEvent$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ boolean $isShow;
    int label;
    final /* synthetic */ OCRResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCRResultViewModel$sendKeyboardStateEvent$1(OCRResultViewModel oCRResultViewModel, boolean z10, kotlin.coroutines.c<? super OCRResultViewModel$sendKeyboardStateEvent$1> cVar) {
        super(2, cVar);
        this.this$0 = oCRResultViewModel;
        this.$isShow = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OCRResultViewModel$sendKeyboardStateEvent$1(this.this$0, this.$isShow, cVar);
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
            v vVar = this.this$0.f25242l;
            Boolean valueOf = Boolean.valueOf(this.$isShow);
            this.label = 1;
            if (vVar.emit(valueOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((OCRResultViewModel$sendKeyboardStateEvent$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
