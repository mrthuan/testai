package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh;

import am.k1;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustPayload;
import pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.widget.progress.ImageProgressView;
import tf.d;
import ul.b;
import ul.c;

/* compiled from: ImageAdjustFilterViewHolder.kt */
/* loaded from: classes3.dex */
public final class ImageAdjustFilterViewHolder extends RecyclerView.b0 implements BaseImageAdjustViewHolder {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f25658f = 0;

    /* renamed from: b  reason: collision with root package name */
    public final w f25659b;
    public final k1 c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f25660d;

    /* renamed from: e  reason: collision with root package name */
    public final a f25661e;

    /* compiled from: ImageAdjustFilterViewHolder.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void a(b bVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAdjustFilterViewHolder(w wVar, k1 k1Var, boolean z10, a aVar) {
        super(k1Var.f1031b);
        ea.a.p("RWkudyBjDXBl", "i5LVoV35");
        ea.a.p("LWlfZBBuZw==", "rQBorCxb");
        ea.a.p("I2lCdBxuUnI=", "Rx661BdL");
        this.f25659b = wVar;
        this.c = k1Var;
        this.f25660d = z10;
        this.f25661e = aVar;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
    public final void a(b image) {
        g.e(image, "image");
        k1 k1Var = this.c;
        Context context = k1Var.f1031b.getContext();
        View view = k1Var.c;
        ((CropImageView) view).setOnCloseIconClickListener(new androidx.privacysandbox.ads.adservices.java.internal.a(this, image));
        ((CropImageView) view).setCloseIconVisible(false);
        String p10 = ea.a.p("Wm0qZxYuA2QYdUd0IG03ZyFDXW4gaWc=", "0nJ8vyAg");
        c cVar = image.f30420r;
        g.d(cVar, p10);
        Bitmap d10 = BaseImageAdjustViewHolder.DefaultImpls.d(image, cVar);
        if (d10 != null) {
            l(d10);
            return;
        }
        ((ImageProgressView) k1Var.f1032d).setVisibility(0);
        ((CropImageView) view).setVisibility(4);
        ((CropImageView) view).setTag(Long.valueOf(image.f30405b));
        t0.d0(this.f25659b, null, null, new ImageAdjustFilterViewHolder$onBinding$2(this, context, image, null), 3);
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
        Bitmap bitmap;
        if (imageAdjustPayload == ImageAdjustPayload.FILTER) {
            WeakReference<Bitmap> weakReference = bVar.f30415m;
            if (weakReference != null) {
                bitmap = weakReference.get();
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                t0.d0(this.f25659b, null, null, new ImageAdjustFilterViewHolder$onBinding$3(this, this.c.f1031b.getContext(), bVar, bitmap, null), 3);
                return;
            }
            bVar.f30413k = null;
            bVar.f30414l = null;
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

    public final void l(Bitmap bitmap) {
        Integer num;
        k1 k1Var = this.c;
        ((CropImageView) k1Var.c).setVisibility(0);
        ((CropImageView) k1Var.c).setImageBitmap(bitmap);
        Object tag = k1Var.a().getTag();
        if (tag instanceof Integer) {
            num = (Integer) tag;
        } else {
            num = null;
        }
        int layoutPosition = getLayoutPosition();
        if (num != null && num.intValue() == layoutPosition) {
            if (this.f25660d) {
                ((CropImageView) k1Var.c).setCloseIconVisible(false);
            } else {
                ((CropImageView) k1Var.c).setCloseIconVisible(true);
            }
        }
        ((ImageProgressView) k1Var.f1032d).setVisibility(8);
    }
}
