package ao;

import android.view.View;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class c2 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5024b;

    public c2(ReaderPreviewActivity readerPreviewActivity) {
        this.f5024b = readerPreviewActivity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        ExecutorService executorService = ReaderPreviewActivity.U5;
        ReaderPreviewActivity readerPreviewActivity = this.f5024b;
        readerPreviewActivity.T2();
        tn.a.b(ReaderPdfApplication.m(), ea.a.p("OWlUdw==", "KwBIyW26"), ea.a.p("RWkudyxwDXAHcGthB245dCV0V18lbCpjaw==", "0GXbu8hm"));
        readerPreviewActivity.D.postDelayed(new pdf.pdfreader.viewer.editor.free.office.l0(1, this, view), 100L);
    }
}
