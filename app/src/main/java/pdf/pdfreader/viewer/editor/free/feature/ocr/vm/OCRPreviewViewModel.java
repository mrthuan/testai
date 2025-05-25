package pdf.pdfreader.viewer.editor.free.feature.ocr.vm;

import androidx.lifecycle.j0;
import ea.a;
import kotlinx.coroutines.flow.v;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: OCRPreviewViewModel.kt */
/* loaded from: classes3.dex */
public final class OCRPreviewViewModel extends j0 {

    /* renamed from: d  reason: collision with root package name */
    public final v f25232d;

    /* renamed from: e  reason: collision with root package name */
    public final v f25233e;

    public OCRPreviewViewModel() {
        v d10 = a.d(0, 7);
        this.f25232d = d10;
        this.f25233e = d10;
    }

    public final void d() {
        t0.d0(t0.X(this), null, null, new OCRPreviewViewModel$onBackPressed$1(this, null), 3);
    }
}
