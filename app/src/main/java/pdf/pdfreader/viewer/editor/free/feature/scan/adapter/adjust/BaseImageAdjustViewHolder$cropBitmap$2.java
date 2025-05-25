package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.activity.s;
import cg.p;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.w;
import lib.zj.office.java.util.Arrays;
import pdf.pdfreader.viewer.editor.free.utils.d0;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import tf.d;
import wf.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseImageAdjustViewHolder.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder$cropBitmap$2", f = "BaseImageAdjustViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseImageAdjustViewHolder$cropBitmap$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super Bitmap>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ Context $context;
    final /* synthetic */ ul.c $imageConfig;
    final /* synthetic */ String $path;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseImageAdjustViewHolder$cropBitmap$2(Bitmap bitmap, ul.c cVar, Context context, String str, kotlin.coroutines.c<? super BaseImageAdjustViewHolder$cropBitmap$2> cVar2) {
        super(2, cVar2);
        this.$bitmap = bitmap;
        this.$imageConfig = cVar;
        this.$context = context;
        this.$path = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        BaseImageAdjustViewHolder$cropBitmap$2 baseImageAdjustViewHolder$cropBitmap$2 = new BaseImageAdjustViewHolder$cropBitmap$2(this.$bitmap, this.$imageConfig, this.$context, this.$path, cVar);
        baseImageAdjustViewHolder$cropBitmap$2.L$0 = obj;
        return baseImageAdjustViewHolder$cropBitmap$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            w wVar = (w) this.L$0;
            ul.c cVar = this.$imageConfig;
            Context context = this.$context;
            String str = this.$path;
            Bitmap bitmap = this.$bitmap;
            try {
                if (cVar.f30428e && !cVar.f30429f && !cVar.f30427d && cVar.f30431h == null) {
                    xl.a aVar = new xl.a(context);
                    try {
                        List<Float> c = aVar.c(context, str);
                        if (cVar.f30431h == null) {
                            cVar.f30431h = Arrays.a(c.get(0), c.get(1), c.get(2), c.get(3), c.get(4), c.get(5), c.get(6), c.get(7));
                        }
                        cVar.f30429f = true;
                    } catch (Throwable unused) {
                        int i10 = d0.f28617a;
                        ea.a.p("I29WRQFjUnAuaSVuTyA=", "1dz1nGIW");
                    }
                    aVar.a();
                }
            } catch (Throwable th2) {
                Result.m13constructorimpl(s.v(th2));
            }
            if (cVar.a()) {
                if (cVar.f30428e && !cVar.f30427d) {
                    List<Float> list = cVar.f30431h;
                    if (list != null) {
                        cVar.f30430g = list;
                        dVar = d.f30009a;
                    } else {
                        dVar = null;
                    }
                    if (dVar == null) {
                        List<Float> DEFAULT_CROP_AREA = ul.b.f30403w;
                        g.d(DEFAULT_CROP_AREA, "DEFAULT_CROP_AREA");
                        cVar.f30430g = DEFAULT_CROP_AREA;
                    }
                }
                return pdf.pdfreader.viewer.editor.free.pic.utils.a.b(t0.P(cVar, bitmap.getWidth(), bitmap.getHeight()), bitmap);
            }
            Result.m13constructorimpl(d.f30009a);
            return this.$bitmap;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super Bitmap> cVar) {
        return ((BaseImageAdjustViewHolder$cropBitmap$2) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
