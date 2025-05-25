package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TryPinAppWidgetUseCase.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCase$invoke$2$timeoutFlow$1", f = "TryPinAppWidgetUseCase.kt", l = {100, 101}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TryPinAppWidgetUseCase$invoke$2$timeoutFlow$1 extends SuspendLambda implements p<kotlinx.coroutines.flow.d<? super tf.d>, kotlin.coroutines.c<? super tf.d>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    public TryPinAppWidgetUseCase$invoke$2$timeoutFlow$1(kotlin.coroutines.c<? super TryPinAppWidgetUseCase$invoke$2$timeoutFlow$1> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        TryPinAppWidgetUseCase$invoke$2$timeoutFlow$1 tryPinAppWidgetUseCase$invoke$2$timeoutFlow$1 = new TryPinAppWidgetUseCase$invoke$2$timeoutFlow$1(cVar);
        tryPinAppWidgetUseCase$invoke$2$timeoutFlow$1.L$0 = obj;
        return tryPinAppWidgetUseCase$invoke$2$timeoutFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.flow.d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    s.u0(obj);
                    return tf.d.f30009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (kotlinx.coroutines.flow.d) this.L$0;
            s.u0(obj);
        } else {
            s.u0(obj);
            dVar = (kotlinx.coroutines.flow.d) this.L$0;
            this.L$0 = dVar;
            this.label = 1;
            if (e0.a(1000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        tf.d dVar2 = tf.d.f30009a;
        this.L$0 = null;
        this.label = 2;
        if (dVar.emit(dVar2, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(kotlinx.coroutines.flow.d<? super tf.d> dVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((TryPinAppWidgetUseCase$invoke$2$timeoutFlow$1) create(dVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
