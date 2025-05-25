package ao;

import android.view.View;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class e2 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5034b;

    public e2(ReaderPreviewActivity readerPreviewActivity) {
        this.f5034b = readerPreviewActivity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        ExecutorService executorService = ReaderPreviewActivity.U5;
        ReaderPreviewActivity readerPreviewActivity = this.f5034b;
        readerPreviewActivity.T2();
        tn.a.b(ReaderPdfApplication.m(), ea.a.p("Pmkcdw==", "Y6HymZI3"), ea.a.p("RWkudyxwDXAHcGthDWQiZTx0bWMqaSBr", "ZP5G6Trv"));
        readerPreviewActivity.D.postDelayed(new l1.a(21, this, view), 100L);
    }
}
