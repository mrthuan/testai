package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.activity.s;
import cg.p;
import java.lang.ref.WeakReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.b;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: OCRResultBigImageAdapter.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.OCRResultBigImageAdapter$OCRResultBigImageViewHolder$bind$1", f = "OCRResultBigImageAdapter.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class OCRResultBigImageAdapter$OCRResultBigImageViewHolder$bind$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ um.a $image;
    final /* synthetic */ int $position;
    int label;
    final /* synthetic */ b.a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCRResultBigImageAdapter$OCRResultBigImageViewHolder$bind$1(b.a aVar, int i10, um.a aVar2, kotlin.coroutines.c<? super OCRResultBigImageAdapter$OCRResultBigImageViewHolder$bind$1> cVar) {
        super(2, cVar);
        this.this$0 = aVar;
        this.$position = i10;
        this.$image = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OCRResultBigImageAdapter$OCRResultBigImageViewHolder$bind$1(this.this$0, this.$position, this.$image, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        WeakReference<Bitmap> weakReference = null;
        if (i10 != 0) {
            if (i10 == 1) {
                s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            s.u0(obj);
            this.this$0.f25139b.f1417b.setTag(new Integer(this.$position));
            Context context = this.this$0.f25139b.f1416a.getContext();
            kotlin.jvm.internal.g.d(context, "binding.root.context");
            um.a aVar = this.$image;
            this.label = 1;
            obj = t0.w0(j0.f20207b, new OCRResultPreviewAdapter$Companion$makeCropBitmap$2(aVar, context, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        um.a aVar2 = this.$image;
        if (bitmap != null) {
            weakReference = new WeakReference<>(bitmap);
        }
        aVar2.f30436e = weakReference;
        if (kotlin.jvm.internal.g.a(this.this$0.f25139b.f1417b.getTag(), new Integer(this.$position))) {
            this.this$0.f25139b.f1417b.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.this$0.f25139b.f1417b.setImageBitmap(bitmap);
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((OCRResultBigImageAdapter$OCRResultBigImageViewHolder$bind$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
