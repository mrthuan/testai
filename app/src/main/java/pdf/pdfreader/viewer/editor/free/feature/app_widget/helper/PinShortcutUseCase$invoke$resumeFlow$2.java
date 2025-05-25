package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PinShortcutUseCase.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.PinShortcutUseCase$invoke$resumeFlow$2", f = "PinShortcutUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PinShortcutUseCase$invoke$resumeFlow$2 extends SuspendLambda implements p<Lifecycle.Event, kotlin.coroutines.c<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public PinShortcutUseCase$invoke$resumeFlow$2(kotlin.coroutines.c<? super PinShortcutUseCase$invoke$resumeFlow$2> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        PinShortcutUseCase$invoke$resumeFlow$2 pinShortcutUseCase$invoke$resumeFlow$2 = new PinShortcutUseCase$invoke$resumeFlow$2(cVar);
        pinShortcutUseCase$invoke$resumeFlow$2.L$0 = obj;
        return pinShortcutUseCase$invoke$resumeFlow$2;
    }

    @Override // cg.p
    public final Object invoke(Lifecycle.Event event, kotlin.coroutines.c<? super Boolean> cVar) {
        return ((PinShortcutUseCase$invoke$resumeFlow$2) create(event, cVar)).invokeSuspend(tf.d.f30009a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            if (((Lifecycle.Event) this.L$0) != Lifecycle.Event.ON_PAUSE) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
