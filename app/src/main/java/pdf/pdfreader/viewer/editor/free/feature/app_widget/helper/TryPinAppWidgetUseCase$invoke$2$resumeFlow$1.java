package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TryPinAppWidgetUseCase.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCase$invoke$2$resumeFlow$1", f = "TryPinAppWidgetUseCase.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TryPinAppWidgetUseCase$invoke$2$resumeFlow$1 extends SuspendLambda implements p<Lifecycle.Event, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;

    public TryPinAppWidgetUseCase$invoke$2$resumeFlow$1(kotlin.coroutines.c<? super TryPinAppWidgetUseCase$invoke$2$resumeFlow$1> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new TryPinAppWidgetUseCase$invoke$2$resumeFlow$1(cVar);
    }

    @Override // cg.p
    public final Object invoke(Lifecycle.Event event, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((TryPinAppWidgetUseCase$invoke$2$resumeFlow$1) create(event, cVar)).invokeSuspend(tf.d.f30009a);
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
            this.label = 1;
            if (e0.a(10L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }
}
