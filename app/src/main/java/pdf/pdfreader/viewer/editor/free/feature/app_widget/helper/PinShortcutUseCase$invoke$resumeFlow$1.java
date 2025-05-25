package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import cg.p;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import pdf.pdfreader.viewer.editor.free.utils.n0;

/* compiled from: PinShortcutUseCase.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.PinShortcutUseCase$invoke$resumeFlow$1", f = "PinShortcutUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PinShortcutUseCase$invoke$resumeFlow$1 extends SuspendLambda implements p<Lifecycle.Event, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ ArrayList<Lifecycle.Event> $activityLifecycleEvents;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinShortcutUseCase$invoke$resumeFlow$1(ArrayList<Lifecycle.Event> arrayList, kotlin.coroutines.c<? super PinShortcutUseCase$invoke$resumeFlow$1> cVar) {
        super(2, cVar);
        this.$activityLifecycleEvents = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        PinShortcutUseCase$invoke$resumeFlow$1 pinShortcutUseCase$invoke$resumeFlow$1 = new PinShortcutUseCase$invoke$resumeFlow$1(this.$activityLifecycleEvents, cVar);
        pinShortcutUseCase$invoke$resumeFlow$1.L$0 = obj;
        return pinShortcutUseCase$invoke$resumeFlow$1;
    }

    @Override // cg.p
    public final Object invoke(Lifecycle.Event event, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((PinShortcutUseCase$invoke$resumeFlow$1) create(event, cVar)).invokeSuspend(tf.d.f30009a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            Lifecycle.Event event = (Lifecycle.Event) this.L$0;
            Objects.toString(event);
            String str = n0.f28727a;
            this.$activityLifecycleEvents.add(event);
            return tf.d.f30009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
