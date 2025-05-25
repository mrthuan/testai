package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh;

import android.content.Context;
import cg.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import tf.d;
import ul.b;
import wf.c;

/* compiled from: ImageAdjustPreviewViewHolder.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustPreviewViewHolder$onBinding$2", f = "ImageAdjustPreviewViewHolder.kt", l = {44, 53}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ImageAdjustPreviewViewHolder$onBinding$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ b $image;
    int label;
    final /* synthetic */ ImageAdjustPreviewViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAdjustPreviewViewHolder$onBinding$2(ImageAdjustPreviewViewHolder imageAdjustPreviewViewHolder, Context context, b bVar, kotlin.coroutines.c<? super ImageAdjustPreviewViewHolder$onBinding$2> cVar) {
        super(2, cVar);
        this.this$0 = imageAdjustPreviewViewHolder;
        this.$context = context;
        this.$image = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ImageAdjustPreviewViewHolder$onBinding$2(this.this$0, this.$context, this.$image, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            java.lang.String r2 = "context"
            r3 = 2
            java.lang.String r4 = "image.imageConfig"
            r5 = 1
            if (r1 == 0) goto L20
            if (r1 == r5) goto L1c
            if (r1 != r3) goto L14
            androidx.activity.s.u0(r9)
            goto L72
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            androidx.activity.s.u0(r9)
            goto L3a
        L20:
            androidx.activity.s.u0(r9)
            pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustPreviewViewHolder r9 = r8.this$0
            android.content.Context r1 = r8.$context
            kotlin.jvm.internal.g.d(r1, r2)
            ul.b r6 = r8.$image
            ul.c r7 = r6.f30419q
            kotlin.jvm.internal.g.d(r7, r4)
            r8.label = r5
            java.lang.Object r9 = pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder.DefaultImpls.i(r9, r1, r6, r7, r8)
            if (r9 != r0) goto L3a
            return r0
        L3a:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            if (r9 == 0) goto Lbf
            ul.b r1 = r8.$image
            ul.c r6 = r1.f30419q
            java.util.List<java.lang.Float> r7 = r6.f30431h
            if (r7 != 0) goto L50
            ul.c r1 = r1.f30420r
            java.util.List<java.lang.Float> r1 = r1.f30431h
            if (r1 == 0) goto L50
            r6.f30431h = r1
            r6.f30429f = r5
        L50:
            boolean r1 = r6.a()
            if (r1 == 0) goto L74
            pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustPreviewViewHolder r1 = r8.this$0
            android.content.Context r5 = r8.$context
            kotlin.jvm.internal.g.d(r5, r2)
            ul.b r2 = r8.$image
            java.lang.String r6 = r2.f30404a
            ul.c r2 = r2.f30419q
            kotlin.jvm.internal.g.d(r2, r4)
            r8.label = r3
            r1.getClass()
            java.lang.Object r9 = pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder.DefaultImpls.b(r5, r6, r2, r9, r8)
            if (r9 != r0) goto L72
            return r0
        L72:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
        L74:
            pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustPreviewViewHolder r0 = r8.this$0
            am.m1 r0 = r0.c
            pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView r0 = r0.c
            java.lang.Object r0 = r0.getTag()
            ul.b r1 = r8.$image
            long r1 = r1.f30405b
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r1)
            boolean r0 = kotlin.jvm.internal.g.a(r0, r3)
            if (r0 == 0) goto La1
            pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustPreviewViewHolder r0 = r8.this$0
            r0.l(r9)
            pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustPreviewViewHolder r0 = r8.this$0
            am.m1 r0 = r0.c
            pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView r0 = r0.c
            ul.b r1 = r8.$image
            ul.c r1 = r1.f30419q
            java.util.List<java.lang.Float> r1 = r1.f30430g
            r0.setCropPointsOnPercent(r1)
        La1:
            pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustPreviewViewHolder r0 = r8.this$0
            ul.b r1 = r8.$image
            ul.c r2 = r1.f30419q
            kotlin.jvm.internal.g.d(r2, r4)
            r0.getClass()
            pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder.DefaultImpls.m(r1, r2, r9)
            pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustPreviewViewHolder r9 = r8.this$0
            int r9 = r9.getBindingAdapterPosition()
            if (r9 != 0) goto Lbf
            pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustPreviewViewHolder r9 = r8.this$0
            pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustPreviewViewHolder$b r9 = r9.f25665e
            r9.b()
        Lbf:
            tf.d r9 = tf.d.f30009a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustPreviewViewHolder$onBinding$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((ImageAdjustPreviewViewHolder$onBinding$2) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
