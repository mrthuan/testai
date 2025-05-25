package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import cg.q;
import java.util.NoSuchElementException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TryPinAppWidgetUseCase.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCase$invoke$2$1", f = "TryPinAppWidgetUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TryPinAppWidgetUseCase$invoke$2$1 extends SuspendLambda implements q<tf.d, Lifecycle.Event, kotlin.coroutines.c<? super c>, Object> {
    final /* synthetic */ int[] $appWidgetIdsBeforeRequestPin;
    final /* synthetic */ boolean $callInMyScreen;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TryPinAppWidgetUseCase$invoke$2$1(g gVar, int[] iArr, boolean z10, kotlin.coroutines.c<? super TryPinAppWidgetUseCase$invoke$2$1> cVar) {
        super(3, cVar);
        this.this$0 = gVar;
        this.$appWidgetIdsBeforeRequestPin = iArr;
        this.$callInMyScreen = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            g gVar = this.this$0;
            int[] appWidgetIds = gVar.c.getAppWidgetIds(gVar.f24821d);
            boolean z10 = false;
            if (appWidgetIds.length > this.$appWidgetIdsBeforeRequestPin.length) {
                if (appWidgetIds.length == 0) {
                    z10 = true;
                }
                if (!z10) {
                    return new c.b(appWidgetIds[appWidgetIds.length - 1]);
                }
                throw new NoSuchElementException("Array is empty.");
            } else if (this.$callInMyScreen) {
                return new c.a("", null);
            } else {
                return new c.b(0);
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.q
    public final Object invoke(tf.d dVar, Lifecycle.Event event, kotlin.coroutines.c<? super c> cVar) {
        return new TryPinAppWidgetUseCase$invoke$2$1(this.this$0, this.$appWidgetIdsBeforeRequestPin, this.$callInMyScreen, cVar).invokeSuspend(tf.d.f30009a);
    }
}
