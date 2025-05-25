package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh;

import android.content.Context;
import cg.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import tf.d;
import ul.b;
import wf.c;

/* compiled from: ImageAdjustCropViewHolder.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustCropViewHolder$onBinding$2$1", f = "ImageAdjustCropViewHolder.kt", l = {53, 62}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ImageAdjustCropViewHolder$onBinding$2$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ b $image;
    int label;
    final /* synthetic */ ImageAdjustCropViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAdjustCropViewHolder$onBinding$2$1(ImageAdjustCropViewHolder imageAdjustCropViewHolder, Context context, b bVar, kotlin.coroutines.c<? super ImageAdjustCropViewHolder$onBinding$2$1> cVar) {
        super(2, cVar);
        this.this$0 = imageAdjustCropViewHolder;
        this.$context = context;
        this.$image = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ImageAdjustCropViewHolder$onBinding$2$1(this.this$0, this.$context, this.$image, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
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
            java.lang.String r2 = "image.adjustImageConfig"
            java.lang.String r3 = "context"
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L20
            if (r1 == r5) goto L1c
            if (r1 != r4) goto L14
            androidx.activity.s.u0(r9)
            goto L78
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            androidx.activity.s.u0(r9)
            goto L46
        L20:
            androidx.activity.s.u0(r9)
            pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustCropViewHolder r9 = r8.this$0
            am.j1 r9 = r9.c
            pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView r9 = r9.f1004b
            android.graphics.Bitmap r9 = r9.getBitmap()
            if (r9 != 0) goto L48
            pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustCropViewHolder r9 = r8.this$0
            android.content.Context r1 = r8.$context
            kotlin.jvm.internal.g.d(r1, r3)
            ul.b r6 = r8.$image
            ul.c r7 = r6.f30420r
            kotlin.jvm.internal.g.d(r7, r2)
            r8.label = r5
            java.lang.Object r9 = pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder.DefaultImpls.i(r9, r1, r6, r7, r8)
            if (r9 != r0) goto L46
            return r0
        L46:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
        L48:
            if (r9 == 0) goto L88
            ul.b r1 = r8.$image
            ul.c r6 = r1.f30420r
            java.util.List<java.lang.Float> r7 = r6.f30431h
            if (r7 != 0) goto L5c
            ul.c r1 = r1.f30419q
            java.util.List<java.lang.Float> r1 = r1.f30431h
            if (r1 == 0) goto L5c
            r6.f30431h = r1
            r6.f30429f = r5
        L5c:
            pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustCropViewHolder r1 = r8.this$0
            android.content.Context r5 = r8.$context
            kotlin.jvm.internal.g.d(r5, r3)
            ul.b r3 = r8.$image
            java.lang.String r6 = r3.f30404a
            ul.c r3 = r3.f30420r
            kotlin.jvm.internal.g.d(r3, r2)
            r8.label = r4
            r1.getClass()
            java.lang.Object r9 = pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder.DefaultImpls.b(r5, r6, r3, r9, r8)
            if (r9 != r0) goto L78
            return r0
        L78:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            ul.b r0 = r8.$image
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r9)
            r0.f30413k = r1
            ul.b r9 = r8.$image
            r0 = 0
            r9.f30415m = r0
        L88:
            tf.d r9 = tf.d.f30009a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustCropViewHolder$onBinding$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((ImageAdjustCropViewHolder$onBinding$2$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
