package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import cg.p;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.e0;

/* compiled from: PinShortcutUseCase.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.PinShortcutUseCase$invoke$timeoutFlow$1", f = "PinShortcutUseCase.kt", l = {92, 96}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PinShortcutUseCase$invoke$timeoutFlow$1 extends SuspendLambda implements p<kotlinx.coroutines.flow.d<? super Boolean>, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ ArrayList<Lifecycle.Event> $activityLifecycleEvents;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinShortcutUseCase$invoke$timeoutFlow$1(ArrayList<Lifecycle.Event> arrayList, kotlin.coroutines.c<? super PinShortcutUseCase$invoke$timeoutFlow$1> cVar) {
        super(2, cVar);
        this.$activityLifecycleEvents = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        PinShortcutUseCase$invoke$timeoutFlow$1 pinShortcutUseCase$invoke$timeoutFlow$1 = new PinShortcutUseCase$invoke$timeoutFlow$1(this.$activityLifecycleEvents, cVar);
        pinShortcutUseCase$invoke$timeoutFlow$1.L$0 = obj;
        return pinShortcutUseCase$invoke$timeoutFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.flow.d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        boolean z10 = true;
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
        if (this.$activityLifecycleEvents.indexOf(Lifecycle.Event.ON_PAUSE) >= 0) {
            z10 = false;
        }
        Boolean valueOf = Boolean.valueOf(z10);
        this.L$0 = null;
        this.label = 2;
        if (dVar.emit(valueOf, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(kotlinx.coroutines.flow.d<? super Boolean> dVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((PinShortcutUseCase$invoke$timeoutFlow$1) create(dVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
