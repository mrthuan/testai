package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import java.util.concurrent.ExecutorService;
import lib.zj.pdfeditor.PageView;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity;

/* compiled from: ReaderAIPreviewActivity.java */
/* loaded from: classes3.dex */
public final class h1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24593a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderAIPreviewActivity f24594b;

    public h1(ReaderAIPreviewActivity readerAIPreviewActivity, int i10) {
        this.f24594b = readerAIPreviewActivity;
        this.f24593a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PageView pageView;
        int i10;
        ExecutorService executorService = ReaderAIPreviewActivity.f24476z1;
        ReaderAIPreviewActivity readerAIPreviewActivity = this.f24594b;
        ReaderAIPreviewActivity.b bVar = readerAIPreviewActivity.f24483f0;
        if (bVar == null) {
            pageView = null;
        } else {
            pageView = (PageView) bVar.getDisplayedView();
        }
        if (pageView != null && (i10 = this.f24593a) >= 0) {
            ea.a.p("PHRQcg1FT3QoYSl0IXgcIEVvHXQBZQlhP2UnID9vBiAhdV1sIA==", "neQ6FCQr");
            pageView.i1(readerAIPreviewActivity, i10);
            return;
        }
        ea.a.p("QHQqcgdFGnQAYVd0PXgiIDRvQXQCZS9hPWUhIBZ1IGwg", "DExLPVSU");
    }
}
