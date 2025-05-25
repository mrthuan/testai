package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter;

import am.r1;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.github.chrisbanes.photoview.OCRPhotoView;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: OCRResultBigImageAdapter.kt */
/* loaded from: classes3.dex */
public final class b extends RecyclerView.Adapter<a> {

    /* renamed from: d  reason: collision with root package name */
    public final w f25137d;

    /* renamed from: e  reason: collision with root package name */
    public final List<um.a> f25138e;

    /* compiled from: OCRResultBigImageAdapter.kt */
    /* loaded from: classes3.dex */
    public final class a extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final r1 f25139b;
        public final /* synthetic */ b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, r1 r1Var) {
            super(r1Var.f1416a);
            ea.a.p("LWlfZBBuZw==", "VVYR36wU");
            this.c = bVar;
            this.f25139b = r1Var;
        }
    }

    public b(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, List list) {
        ea.a.p("OWlUdypjWHBl", "ZlQOODhW");
        kotlin.jvm.internal.g.e(list, ea.a.p("IGNDUhxzQmwucw==", "3dnKLmr1"));
        this.f25137d = lifecycleCoroutineScopeImpl;
        this.f25138e = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f25138e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i10) {
        Bitmap bitmap;
        a holder = aVar;
        kotlin.jvm.internal.g.e(holder, "holder");
        um.a image = this.f25138e.get(i10);
        kotlin.jvm.internal.g.e(image, "image");
        WeakReference<Bitmap> weakReference = image.f30436e;
        if (weakReference != null) {
            bitmap = weakReference.get();
        } else {
            bitmap = null;
        }
        r1 r1Var = holder.f25139b;
        r1Var.f1417b.setMaximumScale(6.0f);
        OCRPhotoView oCRPhotoView = r1Var.f1417b;
        oCRPhotoView.setMediumScale(3.0f);
        if (bitmap == null) {
            t0.d0(holder.c.f25137d, null, null, new OCRResultBigImageAdapter$OCRResultBigImageViewHolder$bind$1(holder, i10, image, null), 3);
            return;
        }
        oCRPhotoView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        oCRPhotoView.setImageBitmap(bitmap);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View i11 = androidx.activity.f.i(parent, R.layout.item_ocr_big_image_preview, parent, false);
        if (i11 != null) {
            OCRPhotoView oCRPhotoView = (OCRPhotoView) i11;
            r1 r1Var = new r1(oCRPhotoView, oCRPhotoView);
            ea.a.p("Jm5XbBh0UigWYTNvAHQhblNsD3Qgcktmh4CeLjlvNHQqeEUpVSBHYShlJHRZIA5hWXMLKQ==", "URd2e8ZZ");
            return new a(this, r1Var);
        }
        throw new NullPointerException(ea.a.p("QW8kdCVpB3c=", "GvpHwLSw"));
    }
}
