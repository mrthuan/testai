package ao;

import am.x2;
import android.view.ViewStub;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.widget.PreviewCreateEditGuideView;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5117a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5118b;

    public /* synthetic */ p(ReaderPreviewActivity readerPreviewActivity, int i10) {
        this.f5117a = i10;
        this.f5118b = readerPreviewActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f5117a;
        ReaderPreviewActivity readerPreviewActivity = this.f5118b;
        switch (i10) {
            case 0:
                ExecutorService executorService = ReaderPreviewActivity.U5;
                readerPreviewActivity.getClass();
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(readerPreviewActivity) && !readerPreviewActivity.J && !readerPreviewActivity.M) {
                    ViewStub viewStub = readerPreviewActivity.U1;
                    if (viewStub != null) {
                        kl.i.b(viewStub);
                    }
                    PreviewCreateEditGuideView previewCreateEditGuideView = readerPreviewActivity.Y4;
                    if (previewCreateEditGuideView != null && readerPreviewActivity.Z4 != null) {
                        x2 x2Var = previewCreateEditGuideView.f25426q;
                        if (x2Var != null) {
                            previewCreateEditGuideView.post(new qb.f0(false, previewCreateEditGuideView, x2Var));
                        }
                        readerPreviewActivity.W4.clear();
                        wm.a.c.getClass();
                        pdf.pdfreader.viewer.editor.free.utils.q0.w(readerPreviewActivity, ea.a.p("WnMUcxtvFV8CclF2AGUhXzRkVF8lciZhIGUuZVRpIV9UdSJkFl8Lbi0xAzM=", "Tq0U3tw8"), false);
                        readerPreviewActivity.Z4.setVisibility(0);
                        readerPreviewActivity.Z4.setOnClickListener(new d9.f(readerPreviewActivity, 13));
                        readerPreviewActivity.Y4.setOnCloseCallBack(new z1());
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ExecutorService executorService2 = ReaderPreviewActivity.U5;
                readerPreviewActivity.y2();
                return;
            default:
                ExecutorService executorService3 = ReaderPreviewActivity.U5;
                readerPreviewActivity.Z2();
                return;
        }
    }
}
