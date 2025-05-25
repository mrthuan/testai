package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust;

import android.content.Context;
import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import tf.d;
import wf.c;

/* compiled from: BaseImageAdjustViewHolder.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder$justFilterBitmap$2", f = "BaseImageAdjustViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseImageAdjustViewHolder$justFilterBitmap$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ul.b $image;
    final /* synthetic */ ul.c $imageConfig;
    int label;
    final /* synthetic */ BaseImageAdjustViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseImageAdjustViewHolder$justFilterBitmap$2(BaseImageAdjustViewHolder baseImageAdjustViewHolder, Context context, ul.b bVar, ul.c cVar, kotlin.coroutines.c<? super BaseImageAdjustViewHolder$justFilterBitmap$2> cVar2) {
        super(2, cVar2);
        this.this$0 = baseImageAdjustViewHolder;
        this.$context = context;
        this.$image = bVar;
        this.$imageConfig = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BaseImageAdjustViewHolder$justFilterBitmap$2(this.this$0, this.$context, this.$image, this.$imageConfig, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            this.this$0.k(this.$context, this.$image, this.$imageConfig);
            return d.f30009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((BaseImageAdjustViewHolder$justFilterBitmap$2) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
