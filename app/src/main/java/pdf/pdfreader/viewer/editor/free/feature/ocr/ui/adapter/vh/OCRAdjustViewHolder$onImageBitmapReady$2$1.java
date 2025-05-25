package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh;

import android.content.Context;
import androidx.activity.s;
import cg.p;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView;
import tf.d;

/* compiled from: OCRAdjustViewHolder.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh.OCRAdjustViewHolder$onImageBitmapReady$2$1", f = "OCRAdjustViewHolder.kt", l = {129}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class OCRAdjustViewHolder$onImageBitmapReady$2$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ul.c $imageConfig;
    final /* synthetic */ String $imagePath;
    final /* synthetic */ OCRAdjustViewHolder $this_run;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCRAdjustViewHolder$onImageBitmapReady$2$1(OCRAdjustViewHolder oCRAdjustViewHolder, Context context, String str, ul.c cVar, kotlin.coroutines.c<? super OCRAdjustViewHolder$onImageBitmapReady$2$1> cVar2) {
        super(2, cVar2);
        this.$this_run = oCRAdjustViewHolder;
        this.$context = context;
        this.$imagePath = str;
        this.$imageConfig = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        OCRAdjustViewHolder$onImageBitmapReady$2$1 oCRAdjustViewHolder$onImageBitmapReady$2$1 = new OCRAdjustViewHolder$onImageBitmapReady$2$1(this.$this_run, this.$context, this.$imagePath, this.$imageConfig, cVar);
        oCRAdjustViewHolder$onImageBitmapReady$2$1.L$0 = obj;
        return oCRAdjustViewHolder$onImageBitmapReady$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                w wVar = (w) this.L$0;
                s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            s.u0(obj);
            OCRAdjustViewHolder oCRAdjustViewHolder = this.$this_run;
            Context context = this.$context;
            String str = this.$imagePath;
            ul.c cVar = this.$imageConfig;
            this.L$0 = (w) this.L$0;
            this.label = 1;
            if (OCRAdjustViewHolder.l(oCRAdjustViewHolder, context, str, cVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        ul.c cVar2 = this.$imageConfig;
        List<Float> list = cVar2.f30431h;
        if (list != null) {
            cVar2.getClass();
            cVar2.f30430g = list;
            cVar2.f30429f = true;
            dVar = d.f30009a;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            ul.c cVar3 = this.$imageConfig;
            List<Float> DEFAULT_CROP_AREA = ul.b.f30403w;
            g.d(DEFAULT_CROP_AREA, "DEFAULT_CROP_AREA");
            cVar3.getClass();
            cVar3.f30430g = DEFAULT_CROP_AREA;
        }
        ((CropImageView) this.$this_run.c.c).setCropPointsOnPercent(this.$imageConfig.f30430g);
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((OCRAdjustViewHolder$onImageBitmapReady$2$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
