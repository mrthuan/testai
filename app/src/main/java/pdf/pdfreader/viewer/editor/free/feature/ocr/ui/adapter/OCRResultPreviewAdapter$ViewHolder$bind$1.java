package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.activity.s;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import cg.p;
import java.lang.ref.WeakReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.c;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: OCRResultPreviewAdapter.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.OCRResultPreviewAdapter$ViewHolder$bind$1", f = "OCRResultPreviewAdapter.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class OCRResultPreviewAdapter$ViewHolder$bind$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ um.a $ocrImage;
    int label;
    final /* synthetic */ c.a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCRResultPreviewAdapter$ViewHolder$bind$1(c.a aVar, um.a aVar2, kotlin.coroutines.c<? super OCRResultPreviewAdapter$ViewHolder$bind$1> cVar) {
        super(2, cVar);
        this.this$0 = aVar;
        this.$ocrImage = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OCRResultPreviewAdapter$ViewHolder$bind$1(this.this$0, this.$ocrImage, cVar);
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
            Context context = this.this$0.f25144b.f1467b.getContext();
            kotlin.jvm.internal.g.d(context, "binding.root.context");
            um.a aVar = this.$ocrImage;
            this.label = 1;
            obj = t0.w0(j0.f20207b, new OCRResultPreviewAdapter$Companion$makeCropBitmap$2(aVar, context, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.$ocrImage.f30436e = new WeakReference<>(bitmap);
            if (kotlin.jvm.internal.g.a(((ImageFilterView) this.this$0.f25144b.f1469e).getTag(), new Long(this.$ocrImage.f30433a))) {
                ((ImageFilterView) this.this$0.f25144b.f1469e).setImageBitmap(bitmap);
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((OCRResultPreviewAdapter$ViewHolder$bind$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
