package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder;
import pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView;
import tf.d;
import ul.b;
import wf.c;

/* compiled from: ImageAdjustFilterViewHolder.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustFilterViewHolder$onBinding$3", f = "ImageAdjustFilterViewHolder.kt", l = {73, 74}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ImageAdjustFilterViewHolder$onBinding$3 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ Bitmap $cacheOriginBitmap;
    final /* synthetic */ Context $context;
    final /* synthetic */ b $image;
    int label;
    final /* synthetic */ ImageAdjustFilterViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAdjustFilterViewHolder$onBinding$3(ImageAdjustFilterViewHolder imageAdjustFilterViewHolder, Context context, b bVar, Bitmap bitmap, kotlin.coroutines.c<? super ImageAdjustFilterViewHolder$onBinding$3> cVar) {
        super(2, cVar);
        this.this$0 = imageAdjustFilterViewHolder;
        this.$context = context;
        this.$image = bVar;
        this.$cacheOriginBitmap = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ImageAdjustFilterViewHolder$onBinding$3(this.this$0, this.$context, this.$image, this.$cacheOriginBitmap, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    s.u0(obj);
                    Bitmap bitmap = (Bitmap) obj;
                    ImageAdjustFilterViewHolder imageAdjustFilterViewHolder = this.this$0;
                    b bVar = this.$image;
                    ul.c cVar = bVar.f30420r;
                    g.d(cVar, "image.adjustImageConfig");
                    imageAdjustFilterViewHolder.getClass();
                    BaseImageAdjustViewHolder.DefaultImpls.m(bVar, cVar, bitmap);
                    ((CropImageView) this.this$0.c.c).setImageBitmap(bitmap);
                    return d.f30009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.u0(obj);
        } else {
            s.u0(obj);
            ImageAdjustFilterViewHolder imageAdjustFilterViewHolder2 = this.this$0;
            Context context = this.$context;
            g.d(context, "context");
            b bVar2 = this.$image;
            ul.c cVar2 = bVar2.f30420r;
            g.d(cVar2, "image.adjustImageConfig");
            this.label = 1;
            imageAdjustFilterViewHolder2.getClass();
            if (BaseImageAdjustViewHolder.DefaultImpls.e(imageAdjustFilterViewHolder2, context, bVar2, cVar2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        ImageAdjustFilterViewHolder imageAdjustFilterViewHolder3 = this.this$0;
        Context context2 = this.$context;
        g.d(context2, "context");
        Bitmap bitmap2 = this.$cacheOriginBitmap;
        ho.b bVar3 = this.$image.f30420r.c;
        this.label = 2;
        imageAdjustFilterViewHolder3.getClass();
        obj = BaseImageAdjustViewHolder.DefaultImpls.a(context2, bitmap2, bVar3, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        Bitmap bitmap3 = (Bitmap) obj;
        ImageAdjustFilterViewHolder imageAdjustFilterViewHolder4 = this.this$0;
        b bVar4 = this.$image;
        ul.c cVar3 = bVar4.f30420r;
        g.d(cVar3, "image.adjustImageConfig");
        imageAdjustFilterViewHolder4.getClass();
        BaseImageAdjustViewHolder.DefaultImpls.m(bVar4, cVar3, bitmap3);
        ((CropImageView) this.this$0.c.c).setImageBitmap(bitmap3);
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((ImageAdjustFilterViewHolder$onBinding$3) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
