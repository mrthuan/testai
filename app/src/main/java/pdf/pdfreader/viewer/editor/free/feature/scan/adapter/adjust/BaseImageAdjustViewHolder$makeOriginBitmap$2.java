package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import tf.d;
import wf.c;

/* compiled from: BaseImageAdjustViewHolder.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder$makeOriginBitmap$2", f = "BaseImageAdjustViewHolder.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseImageAdjustViewHolder$makeOriginBitmap$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super Bitmap>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ul.b $image;
    final /* synthetic */ ul.c $imageConfig;
    final /* synthetic */ boolean $withFilter;
    int label;
    final /* synthetic */ BaseImageAdjustViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseImageAdjustViewHolder$makeOriginBitmap$2(BaseImageAdjustViewHolder baseImageAdjustViewHolder, Context context, ul.b bVar, ul.c cVar, boolean z10, kotlin.coroutines.c<? super BaseImageAdjustViewHolder$makeOriginBitmap$2> cVar2) {
        super(2, cVar2);
        this.this$0 = baseImageAdjustViewHolder;
        this.$context = context;
        this.$image = bVar;
        this.$imageConfig = cVar;
        this.$withFilter = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BaseImageAdjustViewHolder$makeOriginBitmap$2(this.this$0, this.$context, this.$image, this.$imageConfig, this.$withFilter, cVar);
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
            BaseImageAdjustViewHolder baseImageAdjustViewHolder = this.this$0;
            Context context = this.$context;
            ul.b bVar = this.$image;
            pdf.pdfreader.viewer.editor.free.utils.d.a(context);
            int i11 = pdf.pdfreader.viewer.editor.free.utils.d.f28615a;
            pdf.pdfreader.viewer.editor.free.utils.d.a(this.$context);
            int i12 = pdf.pdfreader.viewer.editor.free.utils.d.f28616b;
            ul.c cVar = this.$imageConfig;
            boolean z10 = this.$withFilter;
            this.label = 1;
            obj = baseImageAdjustViewHolder.i(context, bVar, i11, i12, cVar, z10, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super Bitmap> cVar) {
        return ((BaseImageAdjustViewHolder$makeOriginBitmap$2) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
