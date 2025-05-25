package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter;

import am.q1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh.OCRAdjustViewHolder;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustPayload;
import pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView;

/* compiled from: OCRAdjustAdapter.kt */
/* loaded from: classes3.dex */
public final class a extends RecyclerView.Adapter<OCRAdjustViewHolder> {

    /* renamed from: d  reason: collision with root package name */
    public final w f25135d;

    /* renamed from: e  reason: collision with root package name */
    public final tf.c f25136e;

    public a(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl) {
        ea.a.p("RWkudyBjDXBl", "p0ZS3uqp");
        this.f25135d = lifecycleCoroutineScopeImpl;
        this.f25136e = kotlin.a.a(new cg.a<List<um.a>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.OCRAdjustAdapter$items$2
            @Override // cg.a
            public final List<um.a> invoke() {
                return new ArrayList();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return h().size();
    }

    public final List<um.a> h() {
        return (List) this.f25136e.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(OCRAdjustViewHolder oCRAdjustViewHolder, int i10) {
        OCRAdjustViewHolder holder = oCRAdjustViewHolder;
        kotlin.jvm.internal.g.e(holder, "holder");
        holder.m(h().get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final OCRAdjustViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        int i11 = OCRAdjustViewHolder.f25160d;
        w viewScope = this.f25135d;
        kotlin.jvm.internal.g.e(viewScope, "viewScope");
        View i12 = androidx.activity.f.i(parent, R.layout.item_ocr_adjust_preview, parent, false);
        int i13 = R.id.crop_iv;
        CropImageView cropImageView = (CropImageView) com.google.android.play.core.assetpacks.c.u(i12, R.id.crop_iv);
        if (cropImageView != null) {
            i13 = R.id.preview_pb;
            ProgressBar progressBar = (ProgressBar) com.google.android.play.core.assetpacks.c.u(i12, R.id.preview_pb);
            if (progressBar != null) {
                q1 q1Var = new q1((ConstraintLayout) i12, cropImageView, progressBar, 0);
                ea.a.p("Jm5XbBh0UigWYTNvAHQhblNsD3Qgcktmt4DpLgFvDHQqeEUpVSBHYShlJHRZIA5hWXMLKQ==", "6t2GUObb");
                return new OCRAdjustViewHolder(viewScope, q1Var);
            }
        }
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpAWhESS86IA==", "M1iMudkV").concat(i12.getResources().getResourceName(i13)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(OCRAdjustViewHolder oCRAdjustViewHolder, int i10, List payloads) {
        OCRAdjustViewHolder holder = oCRAdjustViewHolder;
        kotlin.jvm.internal.g.e(holder, "holder");
        kotlin.jvm.internal.g.e(payloads, "payloads");
        if (!payloads.isEmpty()) {
            Object obj = payloads.get(0);
            ImageAdjustPayload imageAdjustPayload = obj instanceof ImageAdjustPayload ? (ImageAdjustPayload) obj : null;
            if (imageAdjustPayload != null) {
                holder.n(h().get(i10), imageAdjustPayload);
                return;
            }
        }
        super.onBindViewHolder(holder, i10, payloads);
    }
}
