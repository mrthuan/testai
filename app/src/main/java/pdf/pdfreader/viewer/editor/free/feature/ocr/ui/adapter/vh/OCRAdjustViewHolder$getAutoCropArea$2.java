package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh;

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

/* compiled from: OCRAdjustViewHolder.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh.OCRAdjustViewHolder$getAutoCropArea$2", f = "OCRAdjustViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class OCRAdjustViewHolder$getAutoCropArea$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ul.c $imageConfig;
    final /* synthetic */ String $path;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCRAdjustViewHolder$getAutoCropArea$2(Context context, String str, ul.c cVar, kotlin.coroutines.c<? super OCRAdjustViewHolder$getAutoCropArea$2> cVar2) {
        super(2, cVar2);
        this.$context = context;
        this.$path = str;
        this.$imageConfig = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        OCRAdjustViewHolder$getAutoCropArea$2 oCRAdjustViewHolder$getAutoCropArea$2 = new OCRAdjustViewHolder$getAutoCropArea$2(this.$context, this.$path, this.$imageConfig, cVar);
        oCRAdjustViewHolder$getAutoCropArea$2.L$0 = obj;
        return oCRAdjustViewHolder$getAutoCropArea$2;
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
            try {
                xl.a aVar = new xl.a(context);
                List<Float> c = aVar.c(context, str);
                cVar.f30431h = Arrays.a(c.get(0), c.get(1), c.get(2), c.get(3), c.get(4), c.get(5), c.get(6), c.get(7));
                cVar.f30429f = true;
                d dVar = d.f30009a;
                aVar.a();
                return dVar;
            } catch (Throwable th2) {
                Result.m13constructorimpl(s.v(th2));
                return d.f30009a;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((OCRAdjustViewHolder$getAutoCropArea$2) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
