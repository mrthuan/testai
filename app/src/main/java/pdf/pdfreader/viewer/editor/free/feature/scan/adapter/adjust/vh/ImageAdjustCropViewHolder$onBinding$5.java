package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh;

import android.content.Context;
import cg.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustPayload;
import tf.d;
import ul.b;
import wf.c;

/* compiled from: ImageAdjustCropViewHolder.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustCropViewHolder$onBinding$5", f = "ImageAdjustCropViewHolder.kt", l = {122}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ImageAdjustCropViewHolder$onBinding$5 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ b $image;
    final /* synthetic */ ImageAdjustPayload $payload;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ImageAdjustCropViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAdjustCropViewHolder$onBinding$5(ImageAdjustCropViewHolder imageAdjustCropViewHolder, b bVar, ImageAdjustPayload imageAdjustPayload, Context context, kotlin.coroutines.c<? super ImageAdjustCropViewHolder$onBinding$5> cVar) {
        super(2, cVar);
        this.this$0 = imageAdjustCropViewHolder;
        this.$image = bVar;
        this.$payload = imageAdjustPayload;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ImageAdjustCropViewHolder$onBinding$5 imageAdjustCropViewHolder$onBinding$5 = new ImageAdjustCropViewHolder$onBinding$5(this.this$0, this.$image, this.$payload, this.$context, cVar);
        imageAdjustCropViewHolder$onBinding$5.L$0 = obj;
        return imageAdjustCropViewHolder$onBinding$5;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustCropViewHolder$onBinding$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((ImageAdjustCropViewHolder$onBinding$5) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
