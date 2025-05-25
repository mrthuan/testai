package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust;

import android.content.Context;
import androidx.activity.s;
import cg.p;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import tf.d;
import wf.c;

/* compiled from: ImageAdjustFiltersAdapter.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter$onImageChanged$2", f = "ImageAdjustFiltersAdapter.kt", l = {114}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ImageAdjustFiltersAdapter$onImageChanged$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ul.b $image;
    int label;
    final /* synthetic */ ImageAdjustFiltersAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAdjustFiltersAdapter$onImageChanged$2(ImageAdjustFiltersAdapter imageAdjustFiltersAdapter, Context context, ul.b bVar, kotlin.coroutines.c<? super ImageAdjustFiltersAdapter$onImageChanged$2> cVar) {
        super(2, cVar);
        this.this$0 = imageAdjustFiltersAdapter;
        this.$context = context;
        this.$image = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ImageAdjustFiltersAdapter$onImageChanged$2(this.this$0, this.$context, this.$image, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                s.u0(obj);
                ((Result) obj).m21unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            s.u0(obj);
            ImageAdjustFiltersAdapter imageAdjustFiltersAdapter = this.this$0;
            Context context = this.$context;
            ul.b bVar = this.$image;
            this.label = 1;
            if (ImageAdjustFiltersAdapter.h(imageAdjustFiltersAdapter, context, bVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.this$0.notifyDataSetChanged();
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((ImageAdjustFiltersAdapter$onImageChanged$2) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
