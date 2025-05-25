package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import cg.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OCRResultPreviewAdapter.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.OCRResultPreviewAdapter$Companion$makeCropBitmap$2", f = "OCRResultPreviewAdapter.kt", l = {97, 100}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class OCRResultPreviewAdapter$Companion$makeCropBitmap$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super Bitmap>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ um.a $image;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCRResultPreviewAdapter$Companion$makeCropBitmap$2(um.a aVar, Context context, kotlin.coroutines.c<? super OCRResultPreviewAdapter$Companion$makeCropBitmap$2> cVar) {
        super(2, cVar);
        this.$image = aVar;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        OCRResultPreviewAdapter$Companion$makeCropBitmap$2 oCRResultPreviewAdapter$Companion$makeCropBitmap$2 = new OCRResultPreviewAdapter$Companion$makeCropBitmap$2(this.$image, this.$context, cVar);
        oCRResultPreviewAdapter$Companion$makeCropBitmap$2.L$0 = obj;
        return oCRResultPreviewAdapter$Companion$makeCropBitmap$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0183 A[Catch: all -> 0x01b1, TryCatch #1 {all -> 0x01b1, blocks: (B:7:0x0020, B:26:0x009d, B:28:0x00a7, B:30:0x00ab, B:34:0x0139, B:38:0x0142, B:41:0x0147, B:47:0x0179, B:44:0x0171, B:46:0x0176, B:48:0x017d, B:50:0x0183, B:52:0x0187, B:54:0x018b, B:56:0x018f, B:59:0x0197, B:60:0x01a0, B:12:0x0042, B:25:0x009a, B:15:0x0054, B:21:0x0062, B:33:0x0130), top: B:67:0x000a, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b3 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.OCRResultPreviewAdapter$Companion$makeCropBitmap$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super Bitmap> cVar) {
        return ((OCRResultPreviewAdapter$Companion$makeCropBitmap$2) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
