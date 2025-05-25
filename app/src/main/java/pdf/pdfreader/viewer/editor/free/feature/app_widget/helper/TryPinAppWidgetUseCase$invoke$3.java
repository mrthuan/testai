package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import androidx.activity.s;
import cg.q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TryPinAppWidgetUseCase.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCase$invoke$3", f = "TryPinAppWidgetUseCase.kt", l = {153}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TryPinAppWidgetUseCase$invoke$3 extends SuspendLambda implements q<kotlinx.coroutines.flow.d<? super c>, Throwable, kotlin.coroutines.c<? super tf.d>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public TryPinAppWidgetUseCase$invoke$3(kotlin.coroutines.c<? super TryPinAppWidgetUseCase$invoke$3> cVar) {
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
            Throwable th2 = (Throwable) this.L$1;
            c.a aVar = new c.a(a0.a.h("Pin widget failed: ", th2.getMessage()), th2);
            this.L$0 = null;
            this.label = 1;
            if (((kotlinx.coroutines.flow.d) this.L$0).emit(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.q
    public final Object invoke(kotlinx.coroutines.flow.d<? super c> dVar, Throwable th2, kotlin.coroutines.c<? super tf.d> cVar) {
        TryPinAppWidgetUseCase$invoke$3 tryPinAppWidgetUseCase$invoke$3 = new TryPinAppWidgetUseCase$invoke$3(cVar);
        tryPinAppWidgetUseCase$invoke$3.L$0 = dVar;
        tryPinAppWidgetUseCase$invoke$3.L$1 = th2;
        return tryPinAppWidgetUseCase$invoke$3.invokeSuspend(tf.d.f30009a);
    }
}
