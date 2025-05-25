package ao;

import android.view.View;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.utils.event.ConvertEventCenter;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class x0 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5148b;

    public x0(ReaderPreviewActivity readerPreviewActivity) {
        this.f5148b = readerPreviewActivity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        String p10 = ea.a.p("RWkudw==", "7IS9pkNx");
        String p11 = ea.a.p("RWkudyxjDW4EZUZiCG44ZTZfUWwpc2U=", "Gwl5rnL6");
        String str = ConvertEventCenter.f28653a;
        String str2 = ConvertEventCenter.f28654b;
        ReaderPreviewActivity readerPreviewActivity = this.f5148b;
        tn.a.d(readerPreviewActivity, p10, p11, str2, false);
        ExecutorService executorService = ReaderPreviewActivity.U5;
        readerPreviewActivity.t4(false);
    }
}
