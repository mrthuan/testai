package ao;

import android.view.View;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class f2 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f5041b;
    public final /* synthetic */ ReaderPreviewActivity c;

    public f2(ReaderPreviewActivity readerPreviewActivity, View view) {
        this.c = readerPreviewActivity;
        this.f5041b = view;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        this.f5041b.setVisibility(8);
        ExecutorService executorService = ReaderPreviewActivity.U5;
        ReaderPreviewActivity readerPreviewActivity = this.c;
        readerPreviewActivity.T2();
        tn.a.b(ReaderPdfApplication.m(), ea.a.p("RWkudw==", "7hja6bj9"), ea.a.p("RWkudyxwDXAHcGtzAGc4XydsW2Nr", "n9aRzswu"));
        if (readerPreviewActivity.I5) {
            readerPreviewActivity.h(view.getResources().getString(R.string.arg_res_0x7f1300d4));
            return;
        }
        readerPreviewActivity.K = 4;
        readerPreviewActivity.f26174e3 = ea.a.p("P29BdXA=", "tUWWcwUb");
        readerPreviewActivity.v2();
    }
}
