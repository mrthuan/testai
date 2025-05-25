package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.activity.s;
import cg.p;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder;
import tf.d;
import ul.b;
import wf.c;

/* compiled from: ImageAdjustCropViewHolder.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustCropViewHolder$onBinding$4", f = "ImageAdjustCropViewHolder.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ImageAdjustCropViewHolder$onBinding$4 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ b $image;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ImageAdjustCropViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAdjustCropViewHolder$onBinding$4(ImageAdjustCropViewHolder imageAdjustCropViewHolder, b bVar, Context context, kotlin.coroutines.c<? super ImageAdjustCropViewHolder$onBinding$4> cVar) {
        super(2, cVar);
        this.this$0 = imageAdjustCropViewHolder;
        this.$image = bVar;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ImageAdjustCropViewHolder$onBinding$4(this.this$0, this.$image, this.$context, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        b bVar;
        List<Float> list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                bVar = (b) this.L$1;
                bitmap = (Bitmap) this.L$0;
                s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            s.u0(obj);
            bitmap = this.this$0.c.f1004b.getBitmap();
            if (bitmap != null) {
                b bVar2 = this.$image;
                ul.c cVar = bVar2.f30420r;
                if (cVar.f30431h == null && (list = bVar2.f30419q.f30431h) != null) {
                    cVar.f30431h = list;
                    cVar.f30429f = true;
                }
                if (cVar.a()) {
                    b bVar3 = this.$image;
                    ImageAdjustCropViewHolder imageAdjustCropViewHolder = this.this$0;
                    Context context = this.$context;
                    g.d(context, "context");
                    b bVar4 = this.$image;
                    String str = bVar4.f30404a;
                    ul.c cVar2 = bVar4.f30420r;
                    g.d(cVar2, "image.adjustImageConfig");
                    this.L$0 = bitmap;
                    this.L$1 = bVar3;
                    this.label = 1;
                    imageAdjustCropViewHolder.getClass();
                    Object b10 = BaseImageAdjustViewHolder.DefaultImpls.b(context, str, cVar2, bitmap, this);
                    if (b10 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bVar = bVar3;
                    obj = b10;
                }
                this.$image.f30414l = new WeakReference<>(bitmap);
                this.$image.f30415m = null;
            }
            return d.f30009a;
        }
        bVar.f30413k = new WeakReference<>(obj);
        this.$image.f30414l = new WeakReference<>(bitmap);
        this.$image.f30415m = null;
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((ImageAdjustCropViewHolder$onBinding$4) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
