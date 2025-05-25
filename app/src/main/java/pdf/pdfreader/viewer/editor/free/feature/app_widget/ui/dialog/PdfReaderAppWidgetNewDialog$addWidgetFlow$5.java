package pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog;

import androidx.activity.s;
import cg.q;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* compiled from: PdfReaderAppWidgetNewDialog.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.PdfReaderAppWidgetNewDialog$addWidgetFlow$5", f = "PdfReaderAppWidgetNewDialog.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PdfReaderAppWidgetNewDialog$addWidgetFlow$5 extends SuspendLambda implements q<d<? super pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.c>, Throwable, kotlin.coroutines.c<? super tf.d>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public PdfReaderAppWidgetNewDialog$addWidgetFlow$5(kotlin.coroutines.c<? super PdfReaderAppWidgetNewDialog$addWidgetFlow$5> cVar) {
        super(3, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            Objects.toString((Throwable) this.L$0);
            return tf.d.f30009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.q
    public final Object invoke(d<? super pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.c> dVar, Throwable th2, kotlin.coroutines.c<? super tf.d> cVar) {
        PdfReaderAppWidgetNewDialog$addWidgetFlow$5 pdfReaderAppWidgetNewDialog$addWidgetFlow$5 = new PdfReaderAppWidgetNewDialog$addWidgetFlow$5(cVar);
        pdfReaderAppWidgetNewDialog$addWidgetFlow$5.L$0 = th2;
        return pdfReaderAppWidgetNewDialog$addWidgetFlow$5.invokeSuspend(tf.d.f30009a);
    }
}
