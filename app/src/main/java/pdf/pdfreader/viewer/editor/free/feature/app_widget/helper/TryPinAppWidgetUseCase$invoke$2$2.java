package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.activity.s;
import cg.p;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.c;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.n0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TryPinAppWidgetUseCase.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCase$invoke$2$2", f = "TryPinAppWidgetUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TryPinAppWidgetUseCase$invoke$2$2 extends SuspendLambda implements p<c, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ Activity $activity;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TryPinAppWidgetUseCase$invoke$2$2(g gVar, Activity activity, kotlin.coroutines.c<? super TryPinAppWidgetUseCase$invoke$2$2> cVar) {
        super(2, cVar);
        this.this$0 = gVar;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        TryPinAppWidgetUseCase$invoke$2$2 tryPinAppWidgetUseCase$invoke$2$2 = new TryPinAppWidgetUseCase$invoke$2$2(this.this$0, this.$activity, cVar);
        tryPinAppWidgetUseCase$invoke$2$2.L$0 = obj;
        return tryPinAppWidgetUseCase$invoke$2$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            c cVar = (c) this.L$0;
            Objects.toString(cVar);
            String str = n0.f28727a;
            if (cVar instanceof c.a) {
                g gVar = this.this$0;
                Activity activity = this.$activity;
                gVar.getClass();
                activity.runOnUiThread(new k0.a(activity, 1));
            } else if ((cVar instanceof c.b) && ((c.b) cVar).f24812b) {
                Drawable drawable = androidx.core.content.a.getDrawable(this.this$0.f24819a, R.drawable.ic_copy_success);
                Context context = this.this$0.f24819a;
                j1.d(context, context.getString(R.string.arg_res_0x7f130586), drawable);
            }
            return tf.d.f30009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.p
    public final Object invoke(c cVar, kotlin.coroutines.c<? super tf.d> cVar2) {
        return ((TryPinAppWidgetUseCase$invoke$2$2) create(cVar, cVar2)).invokeSuspend(tf.d.f30009a);
    }
}
