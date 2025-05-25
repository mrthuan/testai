package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.activity.s;
import cg.p;
import ho.f;
import java.lang.ref.WeakReference;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import tf.d;
import wf.c;

/* compiled from: BaseImageAdjustViewHolder.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder$applyFilter$2", f = "BaseImageAdjustViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BaseImageAdjustViewHolder$applyFilter$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super Bitmap>, Object> {
    final /* synthetic */ ho.b $aiFilter;
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ Context $context;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseImageAdjustViewHolder$applyFilter$2(ho.b bVar, Bitmap bitmap, Context context, kotlin.coroutines.c<? super BaseImageAdjustViewHolder$applyFilter$2> cVar) {
        super(2, cVar);
        this.$aiFilter = bVar;
        this.$bitmap = bitmap;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        BaseImageAdjustViewHolder$applyFilter$2 baseImageAdjustViewHolder$applyFilter$2 = new BaseImageAdjustViewHolder$applyFilter$2(this.$aiFilter, this.$bitmap, this.$context, cVar);
        baseImageAdjustViewHolder$applyFilter$2.L$0 = obj;
        return baseImageAdjustViewHolder$applyFilter$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            w wVar = (w) this.L$0;
            ho.b bVar = this.$aiFilter;
            if (bVar == null) {
                return this.$bitmap;
            }
            if (bVar instanceof f) {
                return this.$bitmap;
            }
            Context context = this.$context;
            Bitmap bitmap2 = this.$bitmap;
            try {
                WeakReference<Bitmap> weakReference = bVar.f18386e;
                Bitmap bitmap3 = null;
                if (weakReference != null) {
                    bitmap = weakReference.get();
                } else {
                    bitmap = null;
                }
                if (bitmap != null && (!bitmap.isRecycled())) {
                    bitmap3 = bitmap;
                }
                if (bitmap3 == null) {
                    return bVar.a(context, bitmap2);
                }
                return bitmap3;
            } catch (Throwable th2) {
                Result.m13constructorimpl(s.v(th2));
                return this.$bitmap;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super Bitmap> cVar) {
        return ((BaseImageAdjustViewHolder$applyFilter$2) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
