package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.n;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.j;

/* compiled from: TryPinAppWidgetUseCase.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCaseKt$eventFlow$1", f = "TryPinAppWidgetUseCase.kt", l = {196}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TryPinAppWidgetUseCaseKt$eventFlow$1 extends SuspendLambda implements p<j<? super Lifecycle.Event>, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ Lifecycle $this_eventFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TryPinAppWidgetUseCaseKt$eventFlow$1(Lifecycle lifecycle, kotlin.coroutines.c<? super TryPinAppWidgetUseCaseKt$eventFlow$1> cVar) {
        super(2, cVar);
        this.$this_eventFlow = lifecycle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        TryPinAppWidgetUseCaseKt$eventFlow$1 tryPinAppWidgetUseCaseKt$eventFlow$1 = new TryPinAppWidgetUseCaseKt$eventFlow$1(this.$this_eventFlow, cVar);
        tryPinAppWidgetUseCaseKt$eventFlow$1.L$0 = obj;
        return tryPinAppWidgetUseCaseKt$eventFlow$1;
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
            final j jVar = (j) this.L$0;
            final n nVar = new n() { // from class: pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.h
                @Override // androidx.lifecycle.n
                public final void d(androidx.lifecycle.p pVar, Lifecycle.Event event) {
                    j.this.v(event);
                }
            };
            this.$this_eventFlow.a(nVar);
            final Lifecycle lifecycle = this.$this_eventFlow;
            cg.a<tf.d> aVar = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCaseKt$eventFlow$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ tf.d invoke() {
                    invoke2();
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Lifecycle.this.c(nVar);
                }
            };
            this.label = 1;
            if (ProduceKt.a(jVar, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(j<? super Lifecycle.Event> jVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((TryPinAppWidgetUseCaseKt$eventFlow$1) create(jVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
