package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import cg.p;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import pdf.pdfreader.viewer.editor.free.utils.n0;

/* compiled from: PinShortcutUseCase.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.PinShortcutUseCase$invoke$resumeFlow$3", f = "PinShortcutUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PinShortcutUseCase$invoke$resumeFlow$3 extends SuspendLambda implements p<Lifecycle.Event, kotlin.coroutines.c<? super tf.d>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public PinShortcutUseCase$invoke$resumeFlow$3(kotlin.coroutines.c<? super PinShortcutUseCase$invoke$resumeFlow$3> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        PinShortcutUseCase$invoke$resumeFlow$3 pinShortcutUseCase$invoke$resumeFlow$3 = new PinShortcutUseCase$invoke$resumeFlow$3(cVar);
        pinShortcutUseCase$invoke$resumeFlow$3.L$0 = obj;
        return pinShortcutUseCase$invoke$resumeFlow$3;
    }

    @Override // cg.p
    public final Object invoke(Lifecycle.Event event, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((PinShortcutUseCase$invoke$resumeFlow$3) create(event, cVar)).invokeSuspend(tf.d.f30009a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            Objects.toString((Lifecycle.Event) this.L$0);
            String str = n0.f28727a;
            return tf.d.f30009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
