package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment;

import android.content.Context;
import cg.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import tf.d;

/* compiled from: OCRResultFragment.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment$ocrAndFillEditText$1", f = "OCRResultFragment.kt", l = {385}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class OCRResultFragment$ocrAndFillEditText$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ Context $localContext;
    final /* synthetic */ um.a $ocrImage;
    int label;
    final /* synthetic */ OCRResultFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCRResultFragment$ocrAndFillEditText$1(um.a aVar, OCRResultFragment oCRResultFragment, Context context, kotlin.coroutines.c<? super OCRResultFragment$ocrAndFillEditText$1> cVar) {
        super(2, cVar);
        this.$ocrImage = aVar;
        this.this$0 = oCRResultFragment;
        this.$localContext = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OCRResultFragment$ocrAndFillEditText$1(this.$ocrImage, this.this$0, this.$localContext, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0112  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment$ocrAndFillEditText$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((OCRResultFragment$ocrAndFillEditText$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
