package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh;

import am.q1;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustPayload;
import pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import tf.d;

/* compiled from: OCRAdjustViewHolder.kt */
/* loaded from: classes3.dex */
public final class OCRAdjustViewHolder extends RecyclerView.b0 {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f25160d = 0;

    /* renamed from: b  reason: collision with root package name */
    public final w f25161b;
    public final q1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCRAdjustViewHolder(w wVar, q1 q1Var) {
        super((ConstraintLayout) q1Var.f1347b);
        ea.a.p("OWlUdypjWHBl", "Rptn2DZU");
        ea.a.p("UWklZBpuZw==", "SMn2V2E8");
        this.f25161b = wVar;
        this.c = q1Var;
    }

    public static final Object l(OCRAdjustViewHolder oCRAdjustViewHolder, Context context, String str, ul.c cVar, kotlin.coroutines.c cVar2) {
        oCRAdjustViewHolder.getClass();
        Object w02 = t0.w0(j0.f20206a, new OCRAdjustViewHolder$getAutoCropArea$2(context, str, cVar, null), cVar2);
        if (w02 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return d.f30009a;
        }
        return w02;
    }

    public final void m(um.a image) {
        Bitmap bitmap;
        g.e(image, "image");
        q1 q1Var = this.c;
        Context context = ((ConstraintLayout) q1Var.f1347b).getContext();
        WeakReference<Bitmap> weakReference = image.f30435d;
        if (weakReference != null) {
            bitmap = weakReference.get();
        } else {
            bitmap = null;
        }
        View view = q1Var.c;
        if (bitmap != null) {
            g.d(context, ea.a.p("VW8hdAB4dA==", "pH6OerHM"));
            o(context, image.f30434b, image.f30437f, bitmap);
        } else {
            ((ProgressBar) q1Var.f1348d).setVisibility(0);
            ((CropImageView) view).setVisibility(4);
            ((CropImageView) view).setTag(Long.valueOf(image.f30433a));
            t0.d0(this.f25161b, null, null, new OCRAdjustViewHolder$onBinding$1(this, context, image, null), 3);
        }
        ((CropImageView) view).setOnCropPointChangeListener(new h5.a(image, 13));
    }

    public final void n(um.a image, ImageAdjustPayload imageAdjustPayload) {
        boolean z10;
        g.e(image, "image");
        q1 q1Var = this.c;
        Context context = ((ConstraintLayout) q1Var.f1347b).getContext();
        ImageAdjustPayload imageAdjustPayload2 = ImageAdjustPayload.ROTATE_ANTI_CLOCK_WISE;
        w wVar = this.f25161b;
        if (imageAdjustPayload != imageAdjustPayload2 && imageAdjustPayload != ImageAdjustPayload.ROTATE_CLOCK_WISE) {
            if (imageAdjustPayload == ImageAdjustPayload.CROP_STATE) {
                t0.d0(wVar, null, null, new OCRAdjustViewHolder$onBinding$4(this, image, context, null), 3);
                return;
            } else {
                m(image);
                return;
            }
        }
        View view = q1Var.c;
        if (((CropImageView) view).getBitmap() != null) {
            CropImageView cropImageView = (CropImageView) view;
            ImageAdjustPayload imageAdjustPayload3 = ImageAdjustPayload.ROTATE_CLOCK_WISE;
            boolean z11 = true;
            if (imageAdjustPayload == imageAdjustPayload3) {
                z10 = true;
            } else {
                z10 = false;
            }
            cropImageView.p(z10);
            if (imageAdjustPayload != imageAdjustPayload3) {
                z11 = false;
            }
            ul.c cVar = image.f30437f;
            ge.a.Q(cVar, z11);
            cVar.f30425a = cVar.f30426b;
            List<Float> cropPointsOnPercent = ((CropImageView) view).getCropPointsOnPercent();
            g.d(cropPointsOnPercent, ea.a.p("UWklZBpuBS4RcltwIHZ4YzZvQlApaS10JE8qUB9yJ2VddA==", "WDzDOAn5"));
            cVar.f30430g = cropPointsOnPercent;
            t0.d0(wVar, null, null, new OCRAdjustViewHolder$onBinding$3(this, image, null), 3);
            return;
        }
        m(image);
    }

    public final void o(Context context, String str, ul.c cVar, Bitmap bitmap) {
        q1 q1Var = this.c;
        ((CropImageView) q1Var.c).setVisibility(0);
        View view = q1Var.c;
        ((CropImageView) view).setImageBitmap(bitmap);
        ((ProgressBar) q1Var.f1348d).setVisibility(8);
        if (cVar.f30427d) {
            ((CropImageView) view).setCropPointsOnPercent(cVar.f30430g);
        } else if (cVar.f30428e) {
            d dVar = null;
            if (!cVar.f30429f) {
                List<Float> list = cVar.f30431h;
                if (list != null) {
                    cVar.f30430g = list;
                    cVar.f30429f = true;
                    ((CropImageView) view).setCropPointsOnPercent(list);
                    return;
                }
                t0.d0(this.f25161b, null, null, new OCRAdjustViewHolder$onImageBitmapReady$2$1(this, context, str, cVar, null), 3);
                return;
            }
            List<Float> list2 = cVar.f30431h;
            if (list2 != null) {
                cVar.f30430g = list2;
                dVar = d.f30009a;
            }
            if (dVar == null) {
                List<Float> list3 = ul.b.f30403w;
                g.d(list3, ea.a.p("d0UNQSZMNl8xUntQNkEERUE=", "SdEv1LXu"));
                cVar.f30430g = list3;
            }
            ((CropImageView) view).setCropPointsOnPercent(cVar.f30430g);
        } else {
            List<Float> list4 = ul.b.f30403w;
            g.d(list4, ea.a.p("C0V3QSxMY18ZUgVQKkE6RUE=", "VddYcLey"));
            cVar.f30430g = list4;
            ((CropImageView) view).setCropPointsOnPercent(list4);
        }
    }
}
