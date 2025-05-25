package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter;

import am.t1;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.recyclerview.widget.RecyclerView;
import cg.l;
import cg.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: OCRResultPreviewAdapter.kt */
/* loaded from: classes3.dex */
public final class c extends RecyclerView.Adapter<a> {

    /* renamed from: d  reason: collision with root package name */
    public final w f25140d;

    /* renamed from: e  reason: collision with root package name */
    public int f25141e;

    /* renamed from: f  reason: collision with root package name */
    public final p<Integer, um.a, tf.d> f25142f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f25143g;

    /* compiled from: OCRResultPreviewAdapter.kt */
    /* loaded from: classes3.dex */
    public final class a extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final t1 f25144b;
        public final /* synthetic */ c c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, t1 t1Var) {
            super(t1Var.f1467b);
            ea.a.p("Mmk8ZAFuZw==", "UFPRh7nm");
            this.c = cVar;
            this.f25144b = t1Var;
        }
    }

    public c(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, int i10, p pVar) {
        ea.a.p("EGlddwdjPnBl", "R9f8TQbc");
        ea.a.p("XG4CdBZtMWUeZVd0", "JrYk9daM");
        this.f25140d = lifecycleCoroutineScopeImpl;
        this.f25141e = i10;
        this.f25142f = pVar;
        this.f25143g = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f25143g.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, final int i10) {
        a holder = aVar;
        kotlin.jvm.internal.g.e(holder, "holder");
        final um.a ocrImage = (um.a) this.f25143g.get(i10);
        kotlin.jvm.internal.g.e(ocrImage, "ocrImage");
        final c cVar = holder.c;
        boolean z10 = i10 == cVar.f25141e;
        t1 t1Var = holder.f25144b;
        ((AppCompatImageView) t1Var.f1468d).setSelected(z10);
        t1Var.c.setVisibility(z10 ? 0 : 8);
        WeakReference<Bitmap> weakReference = ocrImage.f30436e;
        Bitmap bitmap = weakReference != null ? weakReference.get() : null;
        if (bitmap == null) {
            ((ImageFilterView) t1Var.f1469e).setTag(Long.valueOf(ocrImage.f30433a));
            t0.d0(cVar.f25140d, null, null, new OCRResultPreviewAdapter$ViewHolder$bind$1(holder, ocrImage, null), 3);
        } else {
            ((ImageFilterView) t1Var.f1469e).setImageBitmap(bitmap);
        }
        ConstraintLayout constraintLayout = t1Var.f1467b;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("LWlfZBBuUC4obyV0", "QEorTTYN"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(constraintLayout, new l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.OCRResultPreviewAdapter$ViewHolder$bind$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                c.this.f25142f.invoke(Integer.valueOf(i10), ocrImage);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ocr_preview_result, parent, false);
        int i11 = R.id.expandImg;
        AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.expandImg);
        if (appCompatImageView != null) {
            i11 = R.id.frameImage;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.frameImage);
            if (appCompatImageView2 != null) {
                i11 = R.id.thumbImg;
                ImageFilterView imageFilterView = (ImageFilterView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.thumbImg);
                if (imageFilterView != null) {
                    t1 t1Var = new t1((ConstraintLayout) inflate, appCompatImageView, appCompatImageView2, imageFilterView, 0);
                    ea.a.p("Jm5XbBh0UigWYTNvAHQhblNsD3Qgcktmi4DgLiJvAHQqeEUpVSBHYShlJHRZIA5hWXMLKQ==", "zUuKiFAn");
                    return new a(this, t1Var);
                }
            }
        }
        throw new NullPointerException(ea.a.p("AmkRcx9uAiA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "xqObve1Y").concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i10, List payloads) {
        a holder = aVar;
        kotlin.jvm.internal.g.e(holder, "holder");
        kotlin.jvm.internal.g.e(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i10, payloads);
            return;
        }
        boolean z10 = this.f25141e == i10;
        t1 t1Var = holder.f25144b;
        ((AppCompatImageView) t1Var.f1468d).setSelected(z10);
        t1Var.c.setVisibility(z10 ? 0 : 8);
    }
}
