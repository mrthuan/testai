package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PinShortcutUseCase.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.PinShortcutUseCase$invoke$timeoutFlow$2", f = "PinShortcutUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PinShortcutUseCase$invoke$timeoutFlow$2 extends SuspendLambda implements p<Boolean, kotlin.coroutines.c<? super tf.d>, Object> {
    /* synthetic */ boolean Z$0;
    int label;

    public PinShortcutUseCase$invoke$timeoutFlow$2(kotlin.coroutines.c<? super PinShortcutUseCase$invoke$timeoutFlow$2> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        PinShortcutUseCase$invoke$timeoutFlow$2 pinShortcutUseCase$invoke$timeoutFlow$2 = new PinShortcutUseCase$invoke$timeoutFlow$2(cVar);
        pinShortcutUseCase$invoke$timeoutFlow$2.Z$0 = ((Boolean) obj).booleanValue();
        return pinShortcutUseCase$invoke$timeoutFlow$2;
    }

    @Override // cg.p
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, kotlin.coroutines.c<? super tf.d> cVar) {
        return invoke(bool.booleanValue(), cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            if (!this.Z$0) {
                return tf.d.f30009a;
            }
            throw new NoPauseException();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(boolean z10, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((PinShortcutUseCase$invoke$timeoutFlow$2) create(Boolean.valueOf(z10), cVar)).invokeSuspend(tf.d.f30009a);
    }
}
