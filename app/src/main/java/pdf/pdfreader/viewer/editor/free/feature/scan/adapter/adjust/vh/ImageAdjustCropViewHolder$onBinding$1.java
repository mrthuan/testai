package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.activity.s;
import cg.p;
import java.lang.ref.WeakReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.w;
import tf.d;
import ul.b;
import wf.c;

/* compiled from: ImageAdjustCropViewHolder.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustCropViewHolder$onBinding$1", f = "ImageAdjustCropViewHolder.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ImageAdjustCropViewHolder$onBinding$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ b $image;
    int label;
    final /* synthetic */ ImageAdjustCropViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAdjustCropViewHolder$onBinding$1(ImageAdjustCropViewHolder imageAdjustCropViewHolder, Context context, b bVar, kotlin.coroutines.c<? super ImageAdjustCropViewHolder$onBinding$1> cVar) {
        super(2, cVar);
        this.this$0 = imageAdjustCropViewHolder;
        this.$context = context;
        this.$image = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ImageAdjustCropViewHolder$onBinding$1(this.this$0, this.$context, this.$image, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            s.u0(obj);
            ImageAdjustCropViewHolder imageAdjustCropViewHolder = this.this$0;
            Context context = this.$context;
            g.d(context, "context");
            b bVar = this.$image;
            ul.c cVar = bVar.f30420r;
            g.d(cVar, "image.adjustImageConfig");
            this.label = 1;
            obj = imageAdjustCropViewHolder.c(context, bVar, cVar, true, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            if (g.a(this.this$0.c.f1004b.getTag(), new Long(this.$image.f30405b))) {
                ImageAdjustCropViewHolder imageAdjustCropViewHolder2 = this.this$0;
                Context context2 = this.$context;
                g.d(context2, "context");
                imageAdjustCropViewHolder2.m(context2, this.$image, bitmap);
            }
            this.$image.f30414l = new WeakReference<>(bitmap);
        }
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((ImageAdjustCropViewHolder$onBinding$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
