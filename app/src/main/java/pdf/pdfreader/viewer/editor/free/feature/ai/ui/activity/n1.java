package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import java.util.concurrent.Executor;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderAIPreviewActivity.java */
/* loaded from: classes3.dex */
public final class n1 implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24630a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f24630a) {
            case 0:
                ReaderAIPreviewActivity.f24476z1.execute(runnable);
                return;
            default:
                ReaderPreviewActivity.U5.execute(runnable);
                return;
        }
    }
}
