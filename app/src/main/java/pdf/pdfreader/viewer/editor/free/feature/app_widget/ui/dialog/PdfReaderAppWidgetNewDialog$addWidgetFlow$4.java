package pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog;

import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* compiled from: PdfReaderAppWidgetNewDialog.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.PdfReaderAppWidgetNewDialog$addWidgetFlow$4", f = "PdfReaderAppWidgetNewDialog.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PdfReaderAppWidgetNewDialog$addWidgetFlow$4 extends SuspendLambda implements p<d<? super pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.c>, kotlin.coroutines.c<? super tf.d>, Object> {
    int label;

    public PdfReaderAppWidgetNewDialog$addWidgetFlow$4(kotlin.coroutines.c<? super PdfReaderAppWidgetNewDialog$addWidgetFlow$4> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PdfReaderAppWidgetNewDialog$addWidgetFlow$4(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            return tf.d.f30009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.p
    public final Object invoke(d<? super pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.c> dVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((PdfReaderAppWidgetNewDialog$addWidgetFlow$4) create(dVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
