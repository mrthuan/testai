package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust;

import am.j1;
import am.k1;
import am.z;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.activity.f;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustCropViewHolder;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustFilterViewHolder;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustPreviewViewHolder;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustToolsViewHolder;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$pageAdapter$2;
import pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView;
import pdf.pdfreader.viewer.editor.free.widget.progress.ImageProgressView;
import tf.c;

/* compiled from: ImageAdjustPagerAdapter.kt */
/* loaded from: classes3.dex */
public final class b extends RecyclerView.Adapter<RecyclerView.b0> {

    /* renamed from: d  reason: collision with root package name */
    public final w f25649d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f25650e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageAdjustPreviewViewHolder.b f25651f;

    /* renamed from: g  reason: collision with root package name */
    public final ImageAdjustToolsViewHolder.a f25652g;

    /* renamed from: h  reason: collision with root package name */
    public final ImageAdjustFilterViewHolder.a f25653h;

    /* renamed from: i  reason: collision with root package name */
    public final c f25654i;

    /* renamed from: j  reason: collision with root package name */
    public final c f25655j;

    public b(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, boolean z10, ImageAdjustActivity$pageAdapter$2.a aVar, ImageAdjustActivity$pageAdapter$2.b bVar, ImageAdjustActivity$pageAdapter$2.c cVar) {
        ea.a.p("RWkudyBjDXBl", "WrT0yWUA");
        ea.a.p("Q3IudhplFUwbc0BlB2Vy", "QCqjHy5F");
        ea.a.p("R28kbABMC3MGZVplcg==", "Cn4V7ax2");
        ea.a.p("VWkndBZyLmkBdFFuDHI=", "H5VY1y7O");
        this.f25649d = lifecycleCoroutineScopeImpl;
        this.f25650e = z10;
        this.f25651f = aVar;
        this.f25652g = bVar;
        this.f25653h = cVar;
        this.f25654i = kotlin.a.a(new cg.a<kn.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustPagerAdapter$diffCallback$2
            @Override // cg.a
            public final kn.a invoke() {
                return new kn.a();
            }
        });
        this.f25655j = kotlin.a.a(new cg.a<e<ul.b>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustPagerAdapter$differ$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final e<ul.b> invoke() {
                b bVar2 = b.this;
                return new e<>(bVar2, (kn.a) bVar2.f25654i.getValue());
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return h().f4412f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i10) {
        return h().f4412f.get(i10).f30418p.ordinal();
    }

    public final e<ul.b> h() {
        return (e) this.f25655j.getValue();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void i(List<? extends ul.b> images, boolean z10) {
        g.e(images, "images");
        ArrayList F0 = m.F0(images);
        if (z10) {
            ul.b bVar = new ul.b();
            bVar.f30418p = ImageAdjustType.TOOLS;
            F0.add(bVar);
        }
        h().b(F0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.b0 holder, int i10) {
        g.e(holder, "holder");
        BaseImageAdjustViewHolder baseImageAdjustViewHolder = holder instanceof BaseImageAdjustViewHolder ? (BaseImageAdjustViewHolder) holder : null;
        if (baseImageAdjustViewHolder != null) {
            ul.b bVar = h().f4412f.get(i10);
            g.d(bVar, ea.a.p("XWkeZlNyXmM9chRlWnQbaUt0CXAmc190HW8fXQ==", "M29x6pgJ"));
            baseImageAdjustViewHolder.a(bVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.b0 onCreateViewHolder(ViewGroup parent, int i10) {
        RecyclerView.b0 imageAdjustFilterViewHolder;
        g.e(parent, "parent");
        int ordinal = ImageAdjustType.PREVIEW.ordinal();
        ImageAdjustPreviewViewHolder.b bVar = this.f25651f;
        boolean z10 = this.f25650e;
        w viewScope = this.f25649d;
        if (i10 == ordinal) {
            int i11 = ImageAdjustPreviewViewHolder.f25662f;
            return ImageAdjustPreviewViewHolder.a.a(viewScope, parent, z10, bVar);
        }
        if (i10 == ImageAdjustType.TOOLS.ordinal()) {
            int i12 = ImageAdjustToolsViewHolder.f25666d;
            ImageAdjustToolsViewHolder.a listener = this.f25652g;
            g.e(listener, "listener");
            View i13 = f.i(parent, R.layout.item_image_adjust_tools, parent, false);
            int i14 = R.id.import_photo_layout;
            LinearLayout linearLayout = (LinearLayout) com.google.android.play.core.assetpacks.c.u(i13, R.id.import_photo_layout);
            if (linearLayout != null) {
                i14 = R.id.take_photo_layout;
                LinearLayout linearLayout2 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(i13, R.id.take_photo_layout);
                if (linearLayout2 != null) {
                    z zVar = new z((ConstraintLayout) i13, linearLayout, linearLayout2);
                    ea.a.p("Jm5XbBh0UigWYTNvAHQhblNsD3QgcktmoIDoLhlvWHQqeEUpVSBHYShlJHRZIA5hWXMLKQ==", "kOyyBNz6");
                    imageAdjustFilterViewHolder = new ImageAdjustToolsViewHolder(zVar, listener);
                }
            }
            throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpAWhPSS06IA==", "xUNmuoiF").concat(i13.getResources().getResourceName(i14)));
        }
        int ordinal2 = ImageAdjustType.CROP.ordinal();
        int i15 = R.id.preview_pb;
        if (i10 == ordinal2) {
            int i16 = ImageAdjustCropViewHolder.f25656d;
            g.e(viewScope, "viewScope");
            View i17 = f.i(parent, R.layout.item_image_adjust_crop, parent, false);
            CropImageView cropImageView = (CropImageView) com.google.android.play.core.assetpacks.c.u(i17, R.id.crop_iv);
            if (cropImageView != null) {
                ProgressBar progressBar = (ProgressBar) com.google.android.play.core.assetpacks.c.u(i17, R.id.preview_pb);
                if (progressBar != null) {
                    j1 j1Var = new j1((ConstraintLayout) i17, cropImageView, progressBar);
                    ea.a.p("Jm5XbBh0UigWYTNvAHQhblNsD3Qgcktmu4DxLlBvFnQqeEUpVSBHYShlJHRZIA5hWXMLKQ==", "34zrYW3x");
                    return new ImageAdjustCropViewHolder(viewScope, j1Var);
                }
            } else {
                i15 = R.id.crop_iv;
            }
            throw new NullPointerException(ea.a.p("CWkVcwNuViA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "oyDfj1qB").concat(i17.getResources().getResourceName(i15)));
        } else if (i10 == ImageAdjustType.FILTER.ordinal()) {
            int i18 = ImageAdjustFilterViewHolder.f25658f;
            g.e(viewScope, "viewScope");
            ImageAdjustFilterViewHolder.a listener2 = this.f25653h;
            g.e(listener2, "listener");
            View i19 = f.i(parent, R.layout.item_image_adjust_filter, parent, false);
            CropImageView cropImageView2 = (CropImageView) com.google.android.play.core.assetpacks.c.u(i19, R.id.filter_iv);
            if (cropImageView2 != null) {
                ImageProgressView imageProgressView = (ImageProgressView) com.google.android.play.core.assetpacks.c.u(i19, R.id.preview_pb);
                if (imageProgressView != null) {
                    k1 k1Var = new k1((ConstraintLayout) i19, cropImageView2, imageProgressView, 0);
                    ea.a.p("Wm4tbBJ0Byg-YU1vHHQfbiJsU3Qjcm1mm4DALi5vA3RWeD8pXyASYQBlWnRFIDBhKHNXKQ==", "yfMmgl0Z");
                    imageAdjustFilterViewHolder = new ImageAdjustFilterViewHolder(viewScope, k1Var, z10, listener2);
                }
            } else {
                i15 = R.id.filter_iv;
            }
            throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpPWhySSs6IA==", "IRoaAxGx").concat(i19.getResources().getResourceName(i15)));
        } else {
            int i20 = ImageAdjustPreviewViewHolder.f25662f;
            return ImageAdjustPreviewViewHolder.a.a(viewScope, parent, z10, bVar);
        }
        return imageAdjustFilterViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.b0 holder, int i10, List<Object> payloads) {
        g.e(holder, "holder");
        g.e(payloads, "payloads");
        if (!payloads.isEmpty()) {
            Object obj = payloads.get(0);
            ImageAdjustPayload imageAdjustPayload = obj instanceof ImageAdjustPayload ? (ImageAdjustPayload) obj : null;
            if (imageAdjustPayload != null) {
                BaseImageAdjustViewHolder baseImageAdjustViewHolder = holder instanceof BaseImageAdjustViewHolder ? (BaseImageAdjustViewHolder) holder : null;
                if (baseImageAdjustViewHolder != null) {
                    ul.b bVar = h().f4412f.get(i10);
                    g.d(bVar, ea.a.p("K2lXZhxyGWMvcjhlG3QkaUZ0NXAqcwx0Lm9cXQ==", "xlNpG2Gr"));
                    baseImageAdjustViewHolder.h(bVar, imageAdjustPayload);
                    return;
                }
                return;
            }
        }
        super.onBindViewHolder(holder, i10, payloads);
    }
}
