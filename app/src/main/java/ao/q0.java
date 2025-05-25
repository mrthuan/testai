package ao;

import android.view.View;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class q0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5124a;

    public q0(ReaderPreviewActivity readerPreviewActivity) {
        this.f5124a = readerPreviewActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        tn.a.b(ReaderPdfApplication.m(), ea.a.p("UmQvXwdlGnQ=", "u6r7855d"), ea.a.p("O2VJdCZhU2oFcyN6EF8LbFxjaw==", "tuW3sF1N"));
        ExecutorService executorService = ReaderPreviewActivity.U5;
        ReaderPreviewActivity readerPreviewActivity = this.f5124a;
        readerPreviewActivity.r3(false, true);
        readerPreviewActivity.r4(readerPreviewActivity.f26240q0);
    }
}
