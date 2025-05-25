package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import androidx.activity.s;
import cg.q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PinShortcutUseCase.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.PinShortcutUseCase$invoke$isTimeout$2", f = "PinShortcutUseCase.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PinShortcutUseCase$invoke$isTimeout$2 extends SuspendLambda implements q<kotlinx.coroutines.flow.d<? super Boolean>, Throwable, kotlin.coroutines.c<? super tf.d>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public PinShortcutUseCase$invoke$isTimeout$2(kotlin.coroutines.c<? super PinShortcutUseCase$invoke$isTimeout$2> cVar) {
        super(3, cVar);
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
            kotlinx.coroutines.flow.d dVar = (kotlinx.coroutines.flow.d) this.L$0;
            if (((Throwable) this.L$1) instanceof NoPauseException) {
                Boolean bool = Boolean.TRUE;
                this.L$0 = null;
                this.label = 1;
                if (dVar.emit(bool, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.q
    public final Object invoke(kotlinx.coroutines.flow.d<? super Boolean> dVar, Throwable th2, kotlin.coroutines.c<? super tf.d> cVar) {
        PinShortcutUseCase$invoke$isTimeout$2 pinShortcutUseCase$invoke$isTimeout$2 = new PinShortcutUseCase$invoke$isTimeout$2(cVar);
        pinShortcutUseCase$invoke$isTimeout$2.L$0 = dVar;
        pinShortcutUseCase$invoke$isTimeout$2.L$1 = th2;
        return pinShortcutUseCase$invoke$isTimeout$2.invokeSuspend(tf.d.f30009a);
    }
}
