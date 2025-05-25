package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust;

import android.content.Context;
import androidx.activity.s;
import cg.p;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import lib.zj.office.java.util.Arrays;
import tf.d;
import wf.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseImageAdjustViewHolder.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder$getAutoCropArea$2", f = "BaseImageAdjustViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseImageAdjustViewHolder$getAutoCropArea$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ ul.c $adjustImageConfig;
    final /* synthetic */ Context $context;
    final /* synthetic */ ul.c $imageConfig;
    final /* synthetic */ String $path;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseImageAdjustViewHolder$getAutoCropArea$2(Context context, String str, ul.c cVar, ul.c cVar2, kotlin.coroutines.c<? super BaseImageAdjustViewHolder$getAutoCropArea$2> cVar3) {
        super(2, cVar3);
        this.$context = context;
        this.$path = str;
        this.$imageConfig = cVar;
        this.$adjustImageConfig = cVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        BaseImageAdjustViewHolder$getAutoCropArea$2 baseImageAdjustViewHolder$getAutoCropArea$2 = new BaseImageAdjustViewHolder$getAutoCropArea$2(this.$context, this.$path, this.$imageConfig, this.$adjustImageConfig, cVar);
        baseImageAdjustViewHolder$getAutoCropArea$2.L$0 = obj;
        return baseImageAdjustViewHolder$getAutoCropArea$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            w wVar = (w) this.L$0;
            Context context = this.$context;
            String str = this.$path;
            ul.c cVar = this.$imageConfig;
            ul.c cVar2 = this.$adjustImageConfig;
            try {
                xl.a aVar = new xl.a(context);
                List<Float> c = aVar.c(context, str);
                if (cVar.f30429f && cVar.f30431h != null && cVar2.f30429f && cVar2.f30431h != null) {
                    d dVar = d.f30009a;
                    aVar.a();
                    return dVar;
                }
                if (cVar.f30431h == null) {
                    cVar.f30431h = Arrays.a(c.get(0), c.get(1), c.get(2), c.get(3), c.get(4), c.get(5), c.get(6), c.get(7));
                }
                cVar.f30429f = true;
                if (cVar2.f30431h == null) {
                    cVar2.f30431h = cVar.f30431h;
                }
                cVar2.f30429f = true;
                d dVar2 = d.f30009a;
                aVar.a();
                return dVar2;
            } catch (Throwable th2) {
                Result.m13constructorimpl(s.v(th2));
                return d.f30009a;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((BaseImageAdjustViewHolder$getAutoCropArea$2) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
