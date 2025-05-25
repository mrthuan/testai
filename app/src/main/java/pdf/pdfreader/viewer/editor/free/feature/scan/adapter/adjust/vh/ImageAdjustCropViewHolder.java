package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh;

import am.j1;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import ea.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustPayload;
import pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import tf.d;
import ul.b;
import ul.c;

/* compiled from: ImageAdjustCropViewHolder.kt */
/* loaded from: classes3.dex */
public final class ImageAdjustCropViewHolder extends RecyclerView.b0 implements BaseImageAdjustViewHolder {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f25656d = 0;

    /* renamed from: b  reason: collision with root package name */
    public final w f25657b;
    public final j1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAdjustCropViewHolder(w wVar, j1 j1Var) {
        super(j1Var.f1003a);
        a.p("RWkudyBjDXBl", "8S6V2TGS");
        a.p("UWklZBpuZw==", "z5c28L6p");
        this.f25657b = wVar;
        this.c = j1Var;
    }

    public static void l(b bVar, ImageAdjustCropViewHolder imageAdjustCropViewHolder, Context context, List list) {
        g.e(bVar, a.p("F2kmYRRl", "2FaRsLzv"));
        g.e(imageAdjustCropViewHolder, a.p("R2gic1cw", "5WNHASBJ"));
        c cVar = bVar.f30420r;
        cVar.f30427d = true;
        g.d(list, a.p("WnQ=", "qVnSKkfs"));
        cVar.f30430g = list;
        t0.d0(imageAdjustCropViewHolder.f25657b, null, null, new ImageAdjustCropViewHolder$onBinding$2$1(imageAdjustCropViewHolder, context, bVar, null), 3);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
    public final void a(b image) {
        Bitmap bitmap;
        g.e(image, "image");
        j1 j1Var = this.c;
        Context context = j1Var.f1003a.getContext();
        WeakReference<Bitmap> weakReference = image.f30414l;
        if (weakReference != null) {
            bitmap = weakReference.get();
        } else {
            bitmap = null;
        }
        CropImageView cropImageView = j1Var.f1004b;
        if (bitmap != null) {
            g.d(context, a.p("UG8ldBZ4dA==", "f4aMjvEf"));
            m(context, image, bitmap);
        } else {
            j1Var.c.setVisibility(0);
            cropImageView.setVisibility(4);
            cropImageView.setTag(Long.valueOf(image.f30405b));
            t0.d0(this.f25657b, null, null, new ImageAdjustCropViewHolder$onBinding$1(this, context, image, null), 3);
        }
        cropImageView.setOnCropPointChangeListener(new a7.b(image, this, context));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
    public final Object c(Context context, b bVar, c cVar, boolean z10, kotlin.coroutines.c<? super Bitmap> cVar2) {
        return BaseImageAdjustViewHolder.DefaultImpls.g(this, context, bVar, cVar, z10, cVar2);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
    public final Object e(Context context, b bVar, c cVar, kotlin.coroutines.c<? super d> cVar2) {
        return BaseImageAdjustViewHolder.DefaultImpls.e(this, context, bVar, cVar, cVar2);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
    public final Object f(Context context, String str, c cVar, c cVar2, Bitmap bitmap, kotlin.coroutines.c<? super d> cVar3) {
        return BaseImageAdjustViewHolder.DefaultImpls.c(context, str, cVar, cVar2, cVar3);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
    public final void h(b bVar, ImageAdjustPayload imageAdjustPayload) {
        boolean z10;
        c cVar;
        j1 j1Var = this.c;
        Context context = j1Var.f1003a.getContext();
        ImageAdjustPayload imageAdjustPayload2 = ImageAdjustPayload.ROTATE_ANTI_CLOCK_WISE;
        w wVar = this.f25657b;
        if (imageAdjustPayload != imageAdjustPayload2 && imageAdjustPayload != ImageAdjustPayload.ROTATE_CLOCK_WISE) {
            if (imageAdjustPayload == ImageAdjustPayload.CROP_STATE) {
                t0.d0(wVar, null, null, new ImageAdjustCropViewHolder$onBinding$5(this, bVar, imageAdjustPayload, context, null), 3);
                return;
            } else {
                BaseImageAdjustViewHolder.DefaultImpls.l(this, bVar, imageAdjustPayload);
                return;
            }
        }
        CropImageView cropImageView = j1Var.f1004b;
        if (cropImageView.getBitmap() != null) {
            ImageAdjustPayload imageAdjustPayload3 = ImageAdjustPayload.ROTATE_CLOCK_WISE;
            boolean z11 = true;
            if (imageAdjustPayload == imageAdjustPayload3) {
                z10 = true;
            } else {
                z10 = false;
            }
            cropImageView.p(z10);
            c cVar2 = bVar.f30419q;
            List<Float> list = cVar2.f30431h;
            c cVar3 = bVar.f30420r;
            if (list != null) {
                cVar = cVar2;
            } else {
                cVar = cVar3;
            }
            if (cVar != null) {
                List<Float> list2 = cVar.f30431h;
                if (list2 != null && cVar2.f30432i == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(list2);
                    cVar2.f30432i = arrayList;
                }
                if (imageAdjustPayload != imageAdjustPayload3) {
                    z11 = false;
                }
                ge.a.Q(cVar, z11);
            }
            cVar3.f30425a = cVar3.f30426b;
            List<Float> cropPointsOnPercent = cropImageView.getCropPointsOnPercent();
            g.d(cropPointsOnPercent, a.p("JWkeZAxuUC4rcglwfXZ5Y0pvIlAmaVh0B08fUDRyIWUpdA==", "VCGpe7Lk"));
            cVar3.f30430g = cropPointsOnPercent;
            t0.d0(wVar, null, null, new ImageAdjustCropViewHolder$onBinding$4(this, bVar, context, null), 3);
            return;
        }
        BaseImageAdjustViewHolder.DefaultImpls.l(this, bVar, imageAdjustPayload);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
    public final Object i(Context context, b bVar, int i10, int i11, c cVar, boolean z10, kotlin.coroutines.c<? super Bitmap> cVar2) {
        return BaseImageAdjustViewHolder.DefaultImpls.h(bVar, context, i10, i11, this, cVar, z10, cVar2);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
    public final Object j(Context context, b bVar, int i10, int i11, c cVar, boolean z10, kotlin.coroutines.c<? super Bitmap> cVar2) {
        return BaseImageAdjustViewHolder.DefaultImpls.k(bVar, context, i10, i11, this, cVar, cVar2);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
    public final void k(Context context, b bVar, c cVar) {
        BaseImageAdjustViewHolder.DefaultImpls.f(context, bVar, cVar);
    }

    public final void m(Context context, b bVar, Bitmap bitmap) {
        j1 j1Var = this.c;
        j1Var.f1004b.setVisibility(0);
        CropImageView cropImageView = j1Var.f1004b;
        cropImageView.setImageBitmap(bitmap);
        j1Var.c.setVisibility(8);
        c cVar = bVar.f30420r;
        if (cVar.f30427d) {
            cropImageView.setCropPointsOnPercent(cVar.f30430g);
        } else if (cVar.f30428e) {
            d dVar = null;
            if (!cVar.f30429f) {
                List<Float> list = cVar.f30431h;
                if (list != null) {
                    cVar.f30430g = list;
                    cVar.f30429f = true;
                    cropImageView.setCropPointsOnPercent(list);
                    return;
                }
                t0.d0(this.f25657b, null, null, new ImageAdjustCropViewHolder$onImageBitmapReady$2$1(this, context, bVar, bitmap, null), 3);
                return;
            }
            List<Float> list2 = cVar.f30431h;
            if (list2 != null) {
                cVar.f30430g = list2;
                cVar.f30429f = true;
                dVar = d.f30009a;
            }
            if (dVar == null) {
                List<Float> list3 = b.f30403w;
                g.d(list3, a.p("d0UNQSZMNl8xUntQNkEERUE=", "87KSoAz6"));
                cVar.getClass();
                cVar.f30430g = list3;
            }
            cropImageView.setCropPointsOnPercent(cVar.f30430g);
        } else {
            List<Float> list4 = b.f30403w;
            g.d(list4, a.p("C0V3QSxMY18ZUgVQKkE6RUE=", "LCAR8WZQ"));
            cVar.f30430g = list4;
            cropImageView.setCropPointsOnPercent(list4);
        }
    }
}
