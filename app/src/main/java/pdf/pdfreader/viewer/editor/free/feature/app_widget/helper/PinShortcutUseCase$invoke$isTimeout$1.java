package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import cg.q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PinShortcutUseCase.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.PinShortcutUseCase$invoke$isTimeout$1", f = "PinShortcutUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PinShortcutUseCase$invoke$isTimeout$1 extends SuspendLambda implements q<Lifecycle.Event, Boolean, kotlin.coroutines.c<? super Boolean>, Object> {
    /* synthetic */ boolean Z$0;
    int label;

    public PinShortcutUseCase$invoke$isTimeout$1(kotlin.coroutines.c<? super PinShortcutUseCase$invoke$isTimeout$1> cVar) {
        super(3, cVar);
    }

    public final Object invoke(Lifecycle.Event event, boolean z10, kotlin.coroutines.c<? super Boolean> cVar) {
        PinShortcutUseCase$invoke$isTimeout$1 pinShortcutUseCase$invoke$isTimeout$1 = new PinShortcutUseCase$invoke$isTimeout$1(cVar);
        pinShortcutUseCase$invoke$isTimeout$1.Z$0 = z10;
        return pinShortcutUseCase$invoke$isTimeout$1.invokeSuspend(tf.d.f30009a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            return Boolean.valueOf(this.Z$0);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.q
    public /* bridge */ /* synthetic */ Object invoke(Lifecycle.Event event, Boolean bool, kotlin.coroutines.c<? super Boolean> cVar) {
        return invoke(event, bool.booleanValue(), cVar);
    }
}
