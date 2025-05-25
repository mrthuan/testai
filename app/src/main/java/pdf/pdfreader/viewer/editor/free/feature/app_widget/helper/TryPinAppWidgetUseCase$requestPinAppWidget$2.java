package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import android.content.ComponentName;
import android.os.Build;
import androidx.activity.s;
import cg.p;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TryPinAppWidgetUseCase.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCase$requestPinAppWidget$2", f = "TryPinAppWidgetUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TryPinAppWidgetUseCase$requestPinAppWidget$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super Boolean>, Object> {
    final /* synthetic */ ComponentName $widgetProvider;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TryPinAppWidgetUseCase$requestPinAppWidget$2(g gVar, ComponentName componentName, kotlin.coroutines.c<? super TryPinAppWidgetUseCase$requestPinAppWidget$2> cVar) {
        super(2, cVar);
        this.this$0 = gVar;
        this.$widgetProvider = componentName;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        TryPinAppWidgetUseCase$requestPinAppWidget$2 tryPinAppWidgetUseCase$requestPinAppWidget$2 = new TryPinAppWidgetUseCase$requestPinAppWidget$2(this.this$0, this.$widgetProvider, cVar);
        tryPinAppWidgetUseCase$requestPinAppWidget$2.L$0 = obj;
        return tryPinAppWidgetUseCase$requestPinAppWidget$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m13constructorimpl;
        boolean z10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            w wVar = (w) this.L$0;
            g gVar = this.this$0;
            ComponentName componentName = this.$widgetProvider;
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    z10 = gVar.c.requestPinAppWidget(componentName, null, null);
                } else {
                    z10 = false;
                }
                m13constructorimpl = Result.m13constructorimpl(Boolean.valueOf(z10));
            } catch (Throwable th2) {
                m13constructorimpl = Result.m13constructorimpl(s.v(th2));
            }
            return Boolean.valueOf(Result.m19isSuccessimpl(m13constructorimpl));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super Boolean> cVar) {
        return ((TryPinAppWidgetUseCase$requestPinAppWidget$2) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
