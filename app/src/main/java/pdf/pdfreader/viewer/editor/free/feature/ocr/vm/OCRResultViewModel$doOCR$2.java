package pdf.pdfreader.viewer.editor.free.feature.ocr.vm;

import android.content.Context;
import cg.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import tf.d;
import um.a;
import wf.c;

/* compiled from: OCRResultViewModel.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRResultViewModel$doOCR$2", f = "OCRResultViewModel.kt", l = {98, 103}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class OCRResultViewModel$doOCR$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super a>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ a $image;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OCRResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCRResultViewModel$doOCR$2(OCRResultViewModel oCRResultViewModel, a aVar, Context context, kotlin.coroutines.c<? super OCRResultViewModel$doOCR$2> cVar) {
        super(2, cVar);
        this.this$0 = oCRResultViewModel;
        this.$image = aVar;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        OCRResultViewModel$doOCR$2 oCRResultViewModel$doOCR$2 = new OCRResultViewModel$doOCR$2(this.this$0, this.$image, this.$context, cVar);
        oCRResultViewModel$doOCR$2.L$0 = obj;
        return oCRResultViewModel$doOCR$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf A[Catch: Exception -> 0x00d8, TryCatch #0 {Exception -> 0x00d8, blocks: (B:6:0x000c, B:36:0x00bb, B:38:0x00bf, B:11:0x0021, B:20:0x0072, B:23:0x007c, B:28:0x0088, B:33:0x00a6, B:39:0x00c4, B:40:0x00c8, B:45:0x00da, B:46:0x00de, B:17:0x0049), top: B:54:0x0006 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRResultViewModel$doOCR$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super a> cVar) {
        return ((OCRResultViewModel$doOCR$2) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
