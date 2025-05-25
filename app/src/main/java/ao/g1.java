package ao;

import java.util.concurrent.ExecutorService;
import lib.zj.pdfeditor.PageView;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class g1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5045a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5046b;

    public g1(ReaderPreviewActivity readerPreviewActivity, int i10) {
        this.f5046b = readerPreviewActivity;
        this.f5045a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        ExecutorService executorService = ReaderPreviewActivity.U5;
        ReaderPreviewActivity readerPreviewActivity = this.f5046b;
        PageView f32 = readerPreviewActivity.f3();
        if (f32 != null && (i10 = this.f5045a) >= 0) {
            ea.a.p("PHRQcg1FT3QoYSl0IXgcIEVvHXQBZQlhAWUUIBdvMiAhdV1sIA==", "dX2CxpyF");
            readerPreviewActivity.getClass();
            f32.i1(readerPreviewActivity, i10);
            return;
        }
        ea.a.p("PHRQcg1FT3QoYSl0IXgcIEVvHXQBZQlhOGUpIDd1O2wg", "egOsAMYW");
        readerPreviewActivity.getClass();
    }
}
