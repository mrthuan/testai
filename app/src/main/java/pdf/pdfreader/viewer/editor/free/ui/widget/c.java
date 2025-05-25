package pdf.pdfreader.viewer.editor.free.ui.widget;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.ui.widget.PreviewAIGuideView;
import pdf.pdfreader.viewer.editor.free.utils.l0;

/* compiled from: PreviewAIGuideView.java */
/* loaded from: classes3.dex */
public final class c extends l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PreviewAIGuideView f28382b;

    public c(PreviewAIGuideView previewAIGuideView) {
        this.f28382b = previewAIGuideView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        PreviewAIGuideView previewAIGuideView = this.f28382b;
        PreviewAIGuideView.a aVar = previewAIGuideView.f28273r;
        if (aVar != null) {
            aVar.a();
        }
        previewAIGuideView.setVisibility(8);
    }
}
