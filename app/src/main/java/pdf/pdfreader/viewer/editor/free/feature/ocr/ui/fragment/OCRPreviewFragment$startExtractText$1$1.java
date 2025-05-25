package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment;

import android.content.Context;
import cg.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import tf.d;

/* compiled from: OCRPreviewFragment.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$startExtractText$1$1", f = "OCRPreviewFragment.kt", l = {245}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class OCRPreviewFragment$startExtractText$1$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ int $currentIndex;
    final /* synthetic */ Context $localContext;
    final /* synthetic */ um.a $ocrImage;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OCRPreviewFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCRPreviewFragment$startExtractText$1$1(um.a aVar, OCRPreviewFragment oCRPreviewFragment, Context context, int i10, kotlin.coroutines.c<? super OCRPreviewFragment$startExtractText$1$1> cVar) {
        super(2, cVar);
        this.$ocrImage = aVar;
        this.this$0 = oCRPreviewFragment;
        this.$localContext = context;
        this.$currentIndex = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        OCRPreviewFragment$startExtractText$1$1 oCRPreviewFragment$startExtractText$1$1 = new OCRPreviewFragment$startExtractText$1$1(this.$ocrImage, this.this$0, this.$localContext, this.$currentIndex, cVar);
        oCRPreviewFragment$startExtractText$1$1.L$0 = obj;
        return oCRPreviewFragment$startExtractText$1$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$startExtractText$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((OCRPreviewFragment$startExtractText$1$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
