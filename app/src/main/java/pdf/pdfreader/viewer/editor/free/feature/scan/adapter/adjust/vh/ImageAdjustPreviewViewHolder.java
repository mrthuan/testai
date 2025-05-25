package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh;

import am.m1;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.f;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.core.assetpacks.c;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustPayload;
import pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.widget.progress.ImageProgressView;
import tf.d;

/* compiled from: ImageAdjustPreviewViewHolder.kt */
/* loaded from: classes3.dex */
public final class ImageAdjustPreviewViewHolder extends RecyclerView.b0 implements BaseImageAdjustViewHolder {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f25662f = 0;

    /* renamed from: b  reason: collision with root package name */
    public final w f25663b;
    public final m1 c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f25664d;

    /* renamed from: e  reason: collision with root package name */
    public final b f25665e;

    /* compiled from: ImageAdjustPreviewViewHolder.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static ImageAdjustPreviewViewHolder a(w viewScope, ViewGroup parent, boolean z10, b listener) {
            g.e(viewScope, "viewScope");
            g.e(parent, "parent");
            g.e(listener, "listener");
            View i10 = f.i(parent, R.layout.item_image_adjust_preview, parent, false);
            int i11 = R.id.place_holder_iv;
            AppCompatImageView appCompatImageView = (AppCompatImageView) c.u(i10, R.id.place_holder_iv);
            if (appCompatImageView != null) {
                i11 = R.id.preview_iv;
                CropImageView cropImageView = (CropImageView) c.u(i10, R.id.preview_iv);
                if (cropImageView != null) {
                    i11 = R.id.preview_pb;
                    ImageProgressView imageProgressView = (ImageProgressView) c.u(i10, R.id.preview_pb);
                    if (imageProgressView != null) {
                        m1 m1Var = new m1((ConstraintLayout) i10, appCompatImageView, cropImageView, imageProgressView);
                        ea.a.p("Wm4sbCh0EygEYR9vQXQebl5sM3QschhmloDXLjJvLHRWeD4pZSAGYTplCHQYIDFhVHM3KQ==", "8v3JIv7c");
                        return new ImageAdjustPreviewViewHolder(viewScope, m1Var, z10, listener);
                    }
                }
            }
            throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpJWgWSQs6IA==", "Q6OXH5Se").concat(i10.getResources().getResourceName(i11)));
        }
    }

    /* compiled from: ImageAdjustPreviewViewHolder.kt */
    /* loaded from: classes3.dex */
    public interface b {
        void a(ul.b bVar);

        void b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAdjustPreviewViewHolder(w wVar, m1 m1Var, boolean z10, b bVar) {
        super(m1Var.f1098a);
        g.e(wVar, ea.a.p("RWkudyBjDXBl", "ZadhKSDK"));
        ea.a.p("LWlfZBBuZw==", "wDRUUizF");
        g.e(bVar, ea.a.p("X2k4dBZuB3I=", "eHPVaC54"));
        this.f25663b = wVar;
        this.c = m1Var;
        this.f25664d = z10;
        this.f25665e = bVar;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
    public final void a(ul.b image) {
        boolean z10;
        g.e(image, "image");
        m1 m1Var = this.c;
        Context context = m1Var.f1098a.getContext();
        h5.f fVar = new h5.f(5, this, image);
        CropImageView cropImageView = m1Var.c;
        cropImageView.setOnCloseIconClickListener(fVar);
        if (this.f25664d) {
            cropImageView.setCloseIconVisible(false);
        } else {
            if (cropImageView.getBitmap() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            cropImageView.setCloseIconVisible(z10);
        }
        String p10 = ea.a.p("Wm0qZxYuC20TZ1FDBm4waWc=", "fjKSKoo3");
        ul.c cVar = image.f30419q;
        g.d(cVar, p10);
        Bitmap d10 = BaseImageAdjustViewHolder.DefaultImpls.d(image, cVar);
        if (d10 != null) {
            l(d10);
            cropImageView.setCropPointsOnPercent(cVar.f30430g);
            return;
        }
        m1Var.f1100d.setVisibility(0);
        cropImageView.setVisibility(4);
        cropImageView.setTag(Long.valueOf(image.f30405b));
        t0.d0(this.f25663b, null, null, new ImageAdjustPreviewViewHolder$onBinding$2(this, context, image, null), 3);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
    public final Object c(Context context, ul.b bVar, ul.c cVar, boolean z10, kotlin.coroutines.c<? super Bitmap> cVar2) {
        return BaseImageAdjustViewHolder.DefaultImpls.g(this, context, bVar, cVar, z10, cVar2);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
    public final Object e(Context context, ul.b bVar, ul.c cVar, kotlin.coroutines.c<? super d> cVar2) {
        return BaseImageAdjustViewHolder.DefaultImpls.e(this, context, bVar, cVar, cVar2);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
    public final Object f(Context context, String str, ul.c cVar, ul.c cVar2, Bitmap bitmap, kotlin.coroutines.c<? super d> cVar3) {
        return BaseImageAdjustViewHolder.DefaultImpls.c(context, str, cVar, cVar2, cVar3);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
    public final void h(ul.b bVar, ImageAdjustPayload imageAdjustPayload) {
        ul.c cVar;
        if (imageAdjustPayload == ImageAdjustPayload.ROTATE_ANTI_CLOCK_WISE) {
            m1 m1Var = this.c;
            if (m1Var.c.getBitmap() != null) {
                CropImageView cropImageView = m1Var.c;
                cropImageView.p(false);
                ul.c cVar2 = bVar.f30419q;
                if (cVar2.f30431h != null) {
                    cVar = cVar2;
                } else {
                    cVar = bVar.f30420r;
                }
                if (cVar != null) {
                    ge.a.Q(cVar, false);
                }
                cVar2.f30425a = cVar2.f30426b;
                List<Float> cropPointsOnPercent = cropImageView.getCropPointsOnPercent();
                g.d(cropPointsOnPercent, ea.a.p("B2kAZAZuNS44cgN2XWUgSU4uMXImcGZvHW4Fcx5uEmUXYwtudA==", "9menoR3n"));
                cVar2.f30430g = cropPointsOnPercent;
                bVar.f30415m = null;
                Bitmap bitmap = cropImageView.getBitmap();
                if (bitmap != null) {
                    ea.a.p("Wm0qZxYuC20TZ1FDBm4waWc=", "Sj6TE1Kc");
                    BaseImageAdjustViewHolder.DefaultImpls.m(bVar, cVar2, bitmap);
                    return;
                }
                return;
            }
            BaseImageAdjustViewHolder.DefaultImpls.l(this, bVar, imageAdjustPayload);
            return;
        }
        BaseImageAdjustViewHolder.DefaultImpls.l(this, bVar, imageAdjustPayload);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
    public final Object i(Context context, ul.b bVar, int i10, int i11, ul.c cVar, boolean z10, kotlin.coroutines.c<? super Bitmap> cVar2) {
        return BaseImageAdjustViewHolder.DefaultImpls.h(bVar, context, i10, i11, this, cVar, z10, cVar2);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
    public final Object j(Context context, ul.b bVar, int i10, int i11, ul.c cVar, boolean z10, kotlin.coroutines.c<? super Bitmap> cVar2) {
        return BaseImageAdjustViewHolder.DefaultImpls.k(bVar, context, i10, i11, this, cVar, cVar2);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder
    public final void k(Context context, ul.b bVar, ul.c cVar) {
        BaseImageAdjustViewHolder.DefaultImpls.f(context, bVar, cVar);
    }

    public final void l(Bitmap bitmap) {
        Integer num;
        m1 m1Var = this.c;
        m1Var.f1099b.setVisibility(8);
        m1Var.c.setVisibility(0);
        m1Var.c.setImageBitmap(bitmap);
        if (this.f25664d) {
            m1Var.c.setCloseIconVisible(false);
        } else {
            Object tag = m1Var.f1098a.getTag();
            if (tag instanceof Integer) {
                num = (Integer) tag;
            } else {
                num = null;
            }
            int layoutPosition = getLayoutPosition();
            if (num != null && num.intValue() == layoutPosition) {
                m1Var.c.setCloseIconVisible(true);
            }
        }
        m1Var.f1100d.setVisibility(8);
    }
}
