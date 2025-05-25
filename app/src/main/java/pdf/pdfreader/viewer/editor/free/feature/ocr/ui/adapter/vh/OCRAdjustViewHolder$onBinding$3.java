package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh;

import android.graphics.Bitmap;
import androidx.activity.s;
import cg.p;
import java.lang.ref.WeakReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView;
import tf.d;

/* compiled from: OCRAdjustViewHolder.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh.OCRAdjustViewHolder$onBinding$3", f = "OCRAdjustViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class OCRAdjustViewHolder$onBinding$3 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ um.a $image;
    int label;
    final /* synthetic */ OCRAdjustViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCRAdjustViewHolder$onBinding$3(OCRAdjustViewHolder oCRAdjustViewHolder, um.a aVar, kotlin.coroutines.c<? super OCRAdjustViewHolder$onBinding$3> cVar) {
        super(2, cVar);
        this.this$0 = oCRAdjustViewHolder;
        this.$image = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OCRAdjustViewHolder$onBinding$3(this.this$0, this.$image, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            Bitmap bitmap = ((CropImageView) this.this$0.c.c).getBitmap();
            if (bitmap != null) {
                this.$image.f30435d = new WeakReference<>(bitmap);
            }
            return d.f30009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((OCRAdjustViewHolder$onBinding$3) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
