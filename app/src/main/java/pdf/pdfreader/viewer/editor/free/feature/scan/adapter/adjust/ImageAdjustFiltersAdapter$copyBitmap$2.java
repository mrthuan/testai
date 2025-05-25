package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust;

import android.graphics.Bitmap;
import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.w;
import tf.d;
import wf.c;

/* compiled from: ImageAdjustFiltersAdapter.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter$copyBitmap$2", f = "ImageAdjustFiltersAdapter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ImageAdjustFiltersAdapter$copyBitmap$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super Bitmap>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAdjustFiltersAdapter$copyBitmap$2(Bitmap bitmap, kotlin.coroutines.c<? super ImageAdjustFiltersAdapter$copyBitmap$2> cVar) {
        super(2, cVar);
        this.$bitmap = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ImageAdjustFiltersAdapter$copyBitmap$2(this.$bitmap, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            Bitmap createBitmap = Bitmap.createBitmap(this.$bitmap);
            g.d(createBitmap, "createBitmap(bitmap)");
            return createBitmap;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super Bitmap> cVar) {
        return ((ImageAdjustFiltersAdapter$copyBitmap$2) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
