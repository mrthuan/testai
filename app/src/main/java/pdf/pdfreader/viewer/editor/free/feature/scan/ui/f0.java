package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustPayload;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;

/* compiled from: ImageAdjustActivity.kt */
/* loaded from: classes3.dex */
public final class f0 implements ImageAdjustFiltersAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ImageAdjustActivity f25806a;

    public f0(ImageAdjustActivity imageAdjustActivity) {
        this.f25806a = imageAdjustActivity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter.a
    public final ul.b a() {
        ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
        return this.f25806a.C2().i();
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter.a
    @SuppressLint({"NotifyDataSetChanged"})
    public final void b(ho.b bVar) {
        int i10;
        ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
        ImageAdjustActivity imageAdjustActivity = this.f25806a;
        boolean z10 = imageAdjustActivity.C2().f23514g;
        tf.c cVar = imageAdjustActivity.N;
        if (z10) {
            imageAdjustActivity.C2().d(bVar);
            imageAdjustActivity.B2().notifyItemRangeChanged(0, imageAdjustActivity.B2().getItemCount(), ImageAdjustPayload.FILTER);
            ImageAdjustFiltersAdapter imageAdjustFiltersAdapter = imageAdjustActivity.f25743b0;
            if (imageAdjustFiltersAdapter != null) {
                imageAdjustFiltersAdapter.notifyItemRangeChanged(0, imageAdjustFiltersAdapter.getItemCount(), (ArrayList) cVar.getValue());
                return;
            }
            return;
        }
        on.b C2 = imageAdjustActivity.C2();
        ul.c k10 = C2.k();
        if (k10 == null) {
            i10 = -1;
        } else {
            k10.c = bVar.d();
            i10 = C2.f23518k;
        }
        if (i10 >= 0) {
            imageAdjustActivity.B2().notifyItemChanged(i10, ImageAdjustPayload.FILTER);
            ImageAdjustFiltersAdapter imageAdjustFiltersAdapter2 = imageAdjustActivity.f25743b0;
            if (imageAdjustFiltersAdapter2 != null) {
                imageAdjustFiltersAdapter2.notifyItemRangeChanged(0, imageAdjustFiltersAdapter2.getItemCount(), (ArrayList) cVar.getValue());
            }
        }
    }
}
