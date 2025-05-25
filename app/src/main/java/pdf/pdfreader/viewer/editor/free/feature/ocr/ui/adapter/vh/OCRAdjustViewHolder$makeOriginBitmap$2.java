package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh;

import android.content.Context;
import android.graphics.Bitmap;
import cg.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import tf.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OCRAdjustViewHolder.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh.OCRAdjustViewHolder$makeOriginBitmap$2", f = "OCRAdjustViewHolder.kt", l = {ShapeTypes.MATH_MINUS, ShapeTypes.MATH_EQUAL, ShapeTypes.SQUARE_TABS}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class OCRAdjustViewHolder$makeOriginBitmap$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super Bitmap>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ int $height;
    final /* synthetic */ um.a $image;
    final /* synthetic */ ul.c $imageConfig;
    final /* synthetic */ int $width;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ OCRAdjustViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCRAdjustViewHolder$makeOriginBitmap$2(um.a aVar, Context context, int i10, int i11, OCRAdjustViewHolder oCRAdjustViewHolder, ul.c cVar, kotlin.coroutines.c<? super OCRAdjustViewHolder$makeOriginBitmap$2> cVar2) {
        super(2, cVar2);
        this.$image = aVar;
        this.$context = context;
        this.$width = i10;
        this.$height = i11;
        this.this$0 = oCRAdjustViewHolder;
        this.$imageConfig = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        OCRAdjustViewHolder$makeOriginBitmap$2 oCRAdjustViewHolder$makeOriginBitmap$2 = new OCRAdjustViewHolder$makeOriginBitmap$2(this.$image, this.$context, this.$width, this.$height, this.this$0, this.$imageConfig, cVar);
        oCRAdjustViewHolder$makeOriginBitmap$2.L$0 = obj;
        return oCRAdjustViewHolder$makeOriginBitmap$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7 A[Catch: all -> 0x00f9, TryCatch #2 {all -> 0x00f9, blocks: (B:9:0x0018, B:38:0x00bc, B:40:0x00c0, B:41:0x00c6, B:47:0x00f4, B:44:0x00ec, B:46:0x00f1, B:14:0x0035, B:31:0x009c, B:33:0x00a7, B:17:0x004c, B:30:0x009a, B:20:0x0063, B:26:0x0071), top: B:52:0x0007, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0 A[Catch: all -> 0x00f9, TRY_LEAVE, TryCatch #2 {all -> 0x00f9, blocks: (B:9:0x0018, B:38:0x00bc, B:40:0x00c0, B:41:0x00c6, B:47:0x00f4, B:44:0x00ec, B:46:0x00f1, B:14:0x0035, B:31:0x009c, B:33:0x00a7, B:17:0x004c, B:30:0x009a, B:20:0x0063, B:26:0x0071), top: B:52:0x0007, inners: #3 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh.OCRAdjustViewHolder$makeOriginBitmap$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super Bitmap> cVar) {
        return ((OCRAdjustViewHolder$makeOriginBitmap$2) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
