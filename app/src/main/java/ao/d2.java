package ao;

import android.view.View;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class d2 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5030b;

    public d2(ReaderPreviewActivity readerPreviewActivity) {
        this.f5030b = readerPreviewActivity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        ExecutorService executorService = ReaderPreviewActivity.U5;
        ReaderPreviewActivity readerPreviewActivity = this.f5030b;
        readerPreviewActivity.T2();
        tn.a.b(ReaderPdfApplication.m(), ea.a.p("NGkBdw==", "HNBd6QHH"), ea.a.p("T2kUdwhwN3A9cDlkW28zbF1fMWwgY2s=", "XU9qWXW9"));
        readerPreviewActivity.D.postDelayed(new androidx.fragment.app.g(23, this, view), 100L);
    }
}
