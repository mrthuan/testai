package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.activity.s;
import cg.p;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.w;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder;
import tf.d;
import ul.b;
import wf.c;

/* compiled from: ImageAdjustCropViewHolder.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustCropViewHolder$onImageBitmapReady$2$1", f = "ImageAdjustCropViewHolder.kt", l = {ShapeTypes.ACTION_BUTTON_BACK_PREVIOUS}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ImageAdjustCropViewHolder$onImageBitmapReady$2$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ Context $context;
    final /* synthetic */ b $image;
    final /* synthetic */ ImageAdjustCropViewHolder $this_run;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAdjustCropViewHolder$onImageBitmapReady$2$1(ImageAdjustCropViewHolder imageAdjustCropViewHolder, Context context, b bVar, Bitmap bitmap, kotlin.coroutines.c<? super ImageAdjustCropViewHolder$onImageBitmapReady$2$1> cVar) {
        super(2, cVar);
        this.$this_run = imageAdjustCropViewHolder;
        this.$context = context;
        this.$image = bVar;
        this.$bitmap = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ImageAdjustCropViewHolder$onImageBitmapReady$2$1 imageAdjustCropViewHolder$onImageBitmapReady$2$1 = new ImageAdjustCropViewHolder$onImageBitmapReady$2$1(this.$this_run, this.$context, this.$image, this.$bitmap, cVar);
        imageAdjustCropViewHolder$onImageBitmapReady$2$1.L$0 = obj;
        return imageAdjustCropViewHolder$onImageBitmapReady$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                w wVar = (w) this.L$0;
                s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            s.u0(obj);
            ImageAdjustCropViewHolder imageAdjustCropViewHolder = this.$this_run;
            Context context = this.$context;
            b bVar = this.$image;
            String str = bVar.f30404a;
            ul.c cVar = bVar.f30419q;
            g.d(cVar, "image.imageConfig");
            ul.c cVar2 = this.$image.f30420r;
            g.d(cVar2, "image.adjustImageConfig");
            this.L$0 = (w) this.L$0;
            this.label = 1;
            imageAdjustCropViewHolder.getClass();
            if (BaseImageAdjustViewHolder.DefaultImpls.c(context, str, cVar, cVar2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        ul.c cVar3 = this.$image.f30420r;
        List<Float> list = cVar3.f30431h;
        if (list != null) {
            cVar3.f30430g = list;
            cVar3.f30429f = true;
            dVar = d.f30009a;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            List<Float> DEFAULT_CROP_AREA = b.f30403w;
            g.d(DEFAULT_CROP_AREA, "DEFAULT_CROP_AREA");
            cVar3.getClass();
            cVar3.f30430g = DEFAULT_CROP_AREA;
        }
        this.$this_run.c.f1004b.setCropPointsOnPercent(this.$image.f30420r.f30430g);
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((ImageAdjustCropViewHolder$onImageBitmapReady$2$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
