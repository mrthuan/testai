package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.activity.s;
import cg.p;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView;
import tf.d;

/* compiled from: OCRAdjustViewHolder.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh.OCRAdjustViewHolder$onBinding$4", f = "OCRAdjustViewHolder.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class OCRAdjustViewHolder$onBinding$4 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ um.a $image;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OCRAdjustViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCRAdjustViewHolder$onBinding$4(OCRAdjustViewHolder oCRAdjustViewHolder, um.a aVar, Context context, kotlin.coroutines.c<? super OCRAdjustViewHolder$onBinding$4> cVar) {
        super(2, cVar);
        this.this$0 = oCRAdjustViewHolder;
        this.$image = aVar;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        OCRAdjustViewHolder$onBinding$4 oCRAdjustViewHolder$onBinding$4 = new OCRAdjustViewHolder$onBinding$4(this.this$0, this.$image, this.$context, cVar);
        oCRAdjustViewHolder$onBinding$4.L$0 = obj;
        return oCRAdjustViewHolder$onBinding$4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d dVar;
        um.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        d dVar2 = null;
        if (i10 != 0) {
            if (i10 == 1) {
                w wVar = (w) this.L$1;
                aVar = (um.a) this.L$0;
                s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            s.u0(obj);
            w wVar2 = (w) this.L$0;
            Bitmap bitmap = ((CropImageView) this.this$0.c.c).getBitmap();
            if (bitmap == null) {
                WeakReference<Bitmap> weakReference = this.$image.f30435d;
                if (weakReference != null) {
                    bitmap = weakReference.get();
                } else {
                    bitmap = null;
                }
            }
            if (bitmap != null) {
                um.a aVar2 = this.$image;
                ul.c cVar = aVar2.f30437f;
                if (cVar.f30428e) {
                    List<Float> list = cVar.f30431h;
                    if (list != null) {
                        cVar.getClass();
                        cVar.f30430g = list;
                        aVar2.f30437f.f30429f = true;
                        dVar = d.f30009a;
                    } else {
                        dVar = null;
                    }
                    if (dVar == null) {
                        OCRAdjustViewHolder oCRAdjustViewHolder = this.this$0;
                        Context context = this.$context;
                        um.a aVar3 = this.$image;
                        g.d(context, "context");
                        String str = aVar3.f30434b;
                        this.L$0 = aVar3;
                        this.L$1 = wVar2;
                        this.label = 1;
                        if (OCRAdjustViewHolder.l(oCRAdjustViewHolder, context, str, aVar3.f30437f, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        aVar = aVar3;
                    }
                } else {
                    List<Float> DEFAULT_CROP_AREA = ul.b.f30403w;
                    g.d(DEFAULT_CROP_AREA, "DEFAULT_CROP_AREA");
                    cVar.getClass();
                    cVar.f30430g = DEFAULT_CROP_AREA;
                }
                ((CropImageView) this.this$0.c.c).setCropPointsOnPercent(this.$image.f30437f.f30430g);
                ((CropImageView) this.this$0.c.c).invalidate();
                return d.f30009a;
            }
            this.this$0.m(this.$image);
            return d.f30009a;
        }
        ul.c cVar2 = aVar.f30437f;
        List<Float> list2 = cVar2.f30431h;
        if (list2 != null) {
            cVar2.getClass();
            cVar2.f30430g = list2;
            dVar2 = d.f30009a;
        }
        if (dVar2 == null) {
            List<Float> DEFAULT_CROP_AREA2 = ul.b.f30403w;
            g.d(DEFAULT_CROP_AREA2, "DEFAULT_CROP_AREA");
            ul.c cVar3 = aVar.f30437f;
            cVar3.getClass();
            cVar3.f30430g = DEFAULT_CROP_AREA2;
        }
        ((CropImageView) this.this$0.c.c).setCropPointsOnPercent(this.$image.f30437f.f30430g);
        ((CropImageView) this.this$0.c.c).invalidate();
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((OCRAdjustViewHolder$onBinding$4) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
