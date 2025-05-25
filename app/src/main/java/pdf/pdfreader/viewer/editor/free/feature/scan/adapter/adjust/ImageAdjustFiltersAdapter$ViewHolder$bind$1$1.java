package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import tf.d;
import wf.c;

/* compiled from: ImageAdjustFiltersAdapter.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter$ViewHolder$bind$1$1", f = "ImageAdjustFiltersAdapter.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ImageAdjustFiltersAdapter$ViewHolder$bind$1$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ ho.b $aiFilter;
    final /* synthetic */ Context $context;
    final /* synthetic */ ul.b $currentImage;
    final /* synthetic */ Bitmap $it;
    int label;
    final /* synthetic */ ImageAdjustFiltersAdapter.ViewHolder this$0;
    final /* synthetic */ ImageAdjustFiltersAdapter this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAdjustFiltersAdapter$ViewHolder$bind$1$1(ImageAdjustFiltersAdapter.ViewHolder viewHolder, ul.b bVar, ho.b bVar2, Context context, ImageAdjustFiltersAdapter imageAdjustFiltersAdapter, Bitmap bitmap, kotlin.coroutines.c<? super ImageAdjustFiltersAdapter$ViewHolder$bind$1$1> cVar) {
        super(2, cVar);
        this.this$0 = viewHolder;
        this.$currentImage = bVar;
        this.$aiFilter = bVar2;
        this.$context = context;
        this.this$1 = imageAdjustFiltersAdapter;
        this.$it = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ImageAdjustFiltersAdapter$ViewHolder$bind$1$1(this.this$0, this.$currentImage, this.$aiFilter, this.$context, this.this$1, this.$it, cVar);
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
            lg.b bVar = j0.f20206a;
            ImageAdjustFiltersAdapter$ViewHolder$bind$1$1$bitmap$1 imageAdjustFiltersAdapter$ViewHolder$bind$1$1$bitmap$1 = new ImageAdjustFiltersAdapter$ViewHolder$bind$1$1$bitmap$1(this.$aiFilter, this.$context, this.this$1, this.$it, null);
            this.label = 1;
            obj = t0.w0(bVar, imageAdjustFiltersAdapter$ViewHolder$bind$1$1$bitmap$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        if (g.a(this.this$0.f25644b.f1069e.getTag(), new Long(this.$currentImage.f30405b))) {
            this.this$0.f25644b.f1069e.setImageBitmap(bitmap);
        }
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((ImageAdjustFiltersAdapter$ViewHolder$bind$1$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
