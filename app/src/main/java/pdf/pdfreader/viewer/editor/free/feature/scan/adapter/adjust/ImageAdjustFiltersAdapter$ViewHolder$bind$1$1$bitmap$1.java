package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.activity.s;
import cg.p;
import java.lang.ref.WeakReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import tf.d;
import wf.c;

/* compiled from: ImageAdjustFiltersAdapter.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter$ViewHolder$bind$1$1$bitmap$1", f = "ImageAdjustFiltersAdapter.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ImageAdjustFiltersAdapter$ViewHolder$bind$1$1$bitmap$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super Bitmap>, Object> {
    final /* synthetic */ ho.b $aiFilter;
    final /* synthetic */ Context $context;
    final /* synthetic */ Bitmap $it;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ImageAdjustFiltersAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAdjustFiltersAdapter$ViewHolder$bind$1$1$bitmap$1(ho.b bVar, Context context, ImageAdjustFiltersAdapter imageAdjustFiltersAdapter, Bitmap bitmap, kotlin.coroutines.c<? super ImageAdjustFiltersAdapter$ViewHolder$bind$1$1$bitmap$1> cVar) {
        super(2, cVar);
        this.$aiFilter = bVar;
        this.$context = context;
        this.this$0 = imageAdjustFiltersAdapter;
        this.$it = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ImageAdjustFiltersAdapter$ViewHolder$bind$1$1$bitmap$1(this.$aiFilter, this.$context, this.this$0, this.$it, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        Context context;
        ho.b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                context = (Context) this.L$1;
                bVar = (ho.b) this.L$0;
                s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            s.u0(obj);
            WeakReference<Bitmap> weakReference = this.$aiFilter.f18386e;
            if (weakReference != null) {
                bitmap = weakReference.get();
            } else {
                bitmap = null;
            }
            if (bitmap == null || !(!bitmap.isRecycled())) {
                bitmap = null;
            }
            if (bitmap == null) {
                ho.b bVar2 = this.$aiFilter;
                Context context2 = this.$context;
                g.d(context2, "context");
                ImageAdjustFiltersAdapter imageAdjustFiltersAdapter = this.this$0;
                Bitmap bitmap2 = this.$it;
                this.L$0 = bVar2;
                this.L$1 = context2;
                this.label = 1;
                imageAdjustFiltersAdapter.getClass();
                Object w02 = t0.w0(j0.f20206a, new ImageAdjustFiltersAdapter$copyBitmap$2(bitmap2, null), this);
                if (w02 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                context = context2;
                bVar = bVar2;
                obj = w02;
            } else {
                return bitmap;
            }
        }
        return bVar.a(context, (Bitmap) obj);
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super Bitmap> cVar) {
        return ((ImageAdjustFiltersAdapter$ViewHolder$bind$1$1$bitmap$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
