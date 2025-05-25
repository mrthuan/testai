package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.Size;
import androidx.activity.s;
import cg.p;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.s0;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import tf.d;
import wf.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImageAdjustFiltersAdapter.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter$makeBitmap$2", f = "ImageAdjustFiltersAdapter.kt", l = {94}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ImageAdjustFiltersAdapter$makeBitmap$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super Result<? extends d>>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ul.b $image;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ImageAdjustFiltersAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAdjustFiltersAdapter$makeBitmap$2(ul.b bVar, Context context, ImageAdjustFiltersAdapter imageAdjustFiltersAdapter, kotlin.coroutines.c<? super ImageAdjustFiltersAdapter$makeBitmap$2> cVar) {
        super(2, cVar);
        this.$image = bVar;
        this.$context = context;
        this.this$0 = imageAdjustFiltersAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ImageAdjustFiltersAdapter$makeBitmap$2 imageAdjustFiltersAdapter$makeBitmap$2 = new ImageAdjustFiltersAdapter$makeBitmap$2(this.$image, this.$context, this.this$0, cVar);
        imageAdjustFiltersAdapter$makeBitmap$2.L$0 = obj;
        return imageAdjustFiltersAdapter$makeBitmap$2;
    }

    @Override // cg.p
    public /* bridge */ /* synthetic */ Object invoke(w wVar, kotlin.coroutines.c<? super Result<? extends d>> cVar) {
        return invoke2(wVar, (kotlin.coroutines.c<? super Result<d>>) cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m13constructorimpl;
        int dimensionPixelSize;
        ul.b bVar;
        ImageAdjustFiltersAdapter imageAdjustFiltersAdapter;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    imageAdjustFiltersAdapter = (ImageAdjustFiltersAdapter) this.L$1;
                    bVar = (ul.b) this.L$0;
                    s.u0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                s.u0(obj);
                w wVar = (w) this.L$0;
                ul.b bVar2 = this.$image;
                Context context = this.$context;
                ImageAdjustFiltersAdapter imageAdjustFiltersAdapter2 = this.this$0;
                String str = bVar2.f30404a;
                g.d(str, "image.filePath");
                Size a10 = s0.a(str);
                if (a10.getHeight() / a10.getWidth() > 2) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dp_30);
                } else {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dp_60);
                }
                String str2 = bVar2.f30404a;
                g.d(str2, "image.filePath");
                Integer num = new Integer(dimensionPixelSize);
                Integer num2 = new Integer(0);
                this.L$0 = bVar2;
                this.L$1 = imageAdjustFiltersAdapter2;
                this.label = 1;
                Object c = pdf.pdfreader.viewer.editor.free.pic.utils.a.c(str2, context, num, num2, this, 24);
                if (c == coroutineSingletons) {
                    return coroutineSingletons;
                }
                bVar = bVar2;
                obj = c;
                imageAdjustFiltersAdapter = imageAdjustFiltersAdapter2;
            }
            Bitmap bitmap = (Bitmap) obj;
            ul.c cVar = bVar.f30420r;
            int i11 = cVar.f30425a;
            if (i11 != 0) {
                float f10 = i11;
                g.e(bitmap, "bitmap");
                try {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(f10);
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    g.d(createBitmap, ea.a.p("UHIuYQdlIGkGbVVwQWI_dClhQixmMG8g1oDTbQ1wZmhWaSxoByxCbRN0RmkRLHZ0NnVXKQ==", "4ulHbfh5"));
                    bitmap = createBitmap;
                } catch (Exception e10) {
                    e10.printStackTrace();
                } catch (OutOfMemoryError e11) {
                    e11.printStackTrace();
                }
                cVar.f30426b = cVar.f30425a;
            }
            g.d(cVar, "image.adjustImageConfig");
            imageAdjustFiltersAdapter.f25643h = pdf.pdfreader.viewer.editor.free.pic.utils.a.b(t0.P(cVar, bitmap.getWidth(), bitmap.getHeight()), bitmap);
            m13constructorimpl = Result.m13constructorimpl(d.f30009a);
        } catch (Throwable th2) {
            m13constructorimpl = Result.m13constructorimpl(s.v(th2));
        }
        return Result.m12boximpl(m13constructorimpl);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(w wVar, kotlin.coroutines.c<? super Result<d>> cVar) {
        return ((ImageAdjustFiltersAdapter$makeBitmap$2) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
