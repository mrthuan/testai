package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.s;

/* compiled from: ReaderAIPreviewActivity.java */
/* loaded from: classes3.dex */
public final class i1 implements s.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f24602a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderAIPreviewActivity f24603b;

    public i1(ReaderAIPreviewActivity readerAIPreviewActivity) {
        this.f24603b = readerAIPreviewActivity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.s.a
    public final void a(int i10) {
        ReaderAIPreviewActivity readerAIPreviewActivity = this.f24603b;
        pdf.pdfreader.viewer.editor.free.utils.p.f(readerAIPreviewActivity, readerAIPreviewActivity.f24477a0, this.f24602a);
        ReaderAIPreviewActivity.b bVar = readerAIPreviewActivity.f24483f0;
        if (bVar != null) {
            bVar.setDisplayedViewIndex(i10 - 1);
        }
        readerAIPreviewActivity.B1(readerAIPreviewActivity.f24499o1);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.s.a
    public final void b() {
        ReaderAIPreviewActivity readerAIPreviewActivity = this.f24603b;
        pdf.pdfreader.viewer.editor.free.utils.p.g(readerAIPreviewActivity, readerAIPreviewActivity.f24477a0, this.f24602a);
    }
}
