package pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog;

import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCaseKt;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.g;
import tf.d;

/* compiled from: PdfReaderAppWidgetNewDialog.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.PdfReaderAppWidgetNewDialog$addWidgetFlow$2", f = "PdfReaderAppWidgetNewDialog.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PdfReaderAppWidgetNewDialog$addWidgetFlow$2 extends SuspendLambda implements p<d, kotlin.coroutines.c<? super kotlinx.coroutines.flow.c<? extends pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.c>>, Object> {
    final /* synthetic */ androidx.appcompat.app.c $activity;
    final /* synthetic */ boolean $pinToLauncher;
    int label;
    final /* synthetic */ PdfReaderAppWidgetNewDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfReaderAppWidgetNewDialog$addWidgetFlow$2(PdfReaderAppWidgetNewDialog pdfReaderAppWidgetNewDialog, androidx.appcompat.app.c cVar, boolean z10, kotlin.coroutines.c<? super PdfReaderAppWidgetNewDialog$addWidgetFlow$2> cVar2) {
        super(2, cVar2);
        this.this$0 = pdfReaderAppWidgetNewDialog;
        this.$activity = cVar;
        this.$pinToLauncher = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PdfReaderAppWidgetNewDialog$addWidgetFlow$2(this.this$0, this.$activity, this.$pinToLauncher, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            g gVar = this.this$0.N;
            if (gVar != null) {
                androidx.appcompat.app.c cVar = this.$activity;
                boolean z10 = this.$pinToLauncher;
                Lifecycle lifecycle = cVar.getLifecycle();
                kotlin.jvm.internal.g.d(lifecycle, "activity.lifecycle");
                return g.b(gVar, cVar, z10, TryPinAppWidgetUseCaseKt.a(lifecycle));
            }
            kotlin.jvm.internal.g.i("tryPinAppWidgetUseCase");
            throw null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.p
    public final Object invoke(d dVar, kotlin.coroutines.c<? super kotlinx.coroutines.flow.c<? extends pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.c>> cVar) {
        return ((PdfReaderAppWidgetNewDialog$addWidgetFlow$2) create(dVar, cVar)).invokeSuspend(d.f30009a);
    }
}
