package pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog;

import androidx.activity.s;
import cg.p;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tf.d;

/* compiled from: PdfReaderAppWidgetNewDialog.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.PdfReaderAppWidgetNewDialog$addWidgetFlow$3", f = "PdfReaderAppWidgetNewDialog.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PdfReaderAppWidgetNewDialog$addWidgetFlow$3 extends SuspendLambda implements p<pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.c, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ cg.a<d> $callback;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfReaderAppWidgetNewDialog$addWidgetFlow$3(cg.a<d> aVar, kotlin.coroutines.c<? super PdfReaderAppWidgetNewDialog$addWidgetFlow$3> cVar) {
        super(2, cVar);
        this.$callback = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        PdfReaderAppWidgetNewDialog$addWidgetFlow$3 pdfReaderAppWidgetNewDialog$addWidgetFlow$3 = new PdfReaderAppWidgetNewDialog$addWidgetFlow$3(this.$callback, cVar);
        pdfReaderAppWidgetNewDialog$addWidgetFlow$3.L$0 = obj;
        return pdfReaderAppWidgetNewDialog$addWidgetFlow$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            Objects.toString((pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.c) this.L$0);
            this.$callback.invoke();
            return d.f30009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.p
    public final Object invoke(pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.c cVar, kotlin.coroutines.c<? super d> cVar2) {
        return ((PdfReaderAppWidgetNewDialog$addWidgetFlow$3) create(cVar, cVar2)).invokeSuspend(d.f30009a);
    }
}
