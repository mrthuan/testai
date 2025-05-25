package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.activity.s;
import cg.p;
import java.lang.ref.WeakReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import tf.d;

/* compiled from: OCRAdjustViewHolder.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh.OCRAdjustViewHolder$onBinding$1", f = "OCRAdjustViewHolder.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class OCRAdjustViewHolder$onBinding$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ um.a $image;
    int label;
    final /* synthetic */ OCRAdjustViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCRAdjustViewHolder$onBinding$1(OCRAdjustViewHolder oCRAdjustViewHolder, Context context, um.a aVar, kotlin.coroutines.c<? super OCRAdjustViewHolder$onBinding$1> cVar) {
        super(2, cVar);
        this.this$0 = oCRAdjustViewHolder;
        this.$context = context;
        this.$image = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OCRAdjustViewHolder$onBinding$1(this.this$0, this.$context, this.$image, cVar);
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
            OCRAdjustViewHolder oCRAdjustViewHolder = this.this$0;
            Context context = this.$context;
            g.d(context, "context");
            um.a aVar = this.$image;
            pdf.pdfreader.viewer.editor.free.utils.d.a(this.$context);
            int i11 = pdf.pdfreader.viewer.editor.free.utils.d.f28615a;
            pdf.pdfreader.viewer.editor.free.utils.d.a(this.$context);
            int i12 = pdf.pdfreader.viewer.editor.free.utils.d.f28616b;
            ul.c cVar = this.$image.f30437f;
            this.label = 1;
            int i13 = OCRAdjustViewHolder.f25160d;
            oCRAdjustViewHolder.getClass();
            obj = t0.w0(j0.f20207b, new OCRAdjustViewHolder$makeOriginBitmap$2(aVar, context, i11, i12, oCRAdjustViewHolder, cVar, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            if (g.a(((CropImageView) this.this$0.c.c).getTag(), new Long(this.$image.f30433a))) {
                OCRAdjustViewHolder oCRAdjustViewHolder2 = this.this$0;
                Context context2 = this.$context;
                g.d(context2, "context");
                um.a aVar2 = this.$image;
                oCRAdjustViewHolder2.o(context2, aVar2.f30434b, aVar2.f30437f, bitmap);
            }
            this.$image.f30435d = new WeakReference<>(bitmap);
        }
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((OCRAdjustViewHolder$onBinding$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
