package ao;

import pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class z0 implements oo.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5154a;

    public z0(ReaderPreviewActivity readerPreviewActivity) {
        this.f5154a = readerPreviewActivity;
    }

    @Override // oo.b
    public final void a() {
        ReaderPreviewActivity readerPreviewActivity = this.f5154a;
        try {
            try {
                PDF2WordHelper.f25574a.getClass();
                PDF2WordHelper.Companion.c(readerPreviewActivity);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            ReaderPreviewActivity.j2(readerPreviewActivity, false, true, -1);
            readerPreviewActivity.y4();
            readerPreviewActivity.I5 = false;
        } catch (Throwable th2) {
            ReaderPreviewActivity.j2(readerPreviewActivity, false, true, -1);
            readerPreviewActivity.y4();
            readerPreviewActivity.I5 = false;
            throw th2;
        }
    }

    @Override // oo.b
    public final void cancel() {
    }
}
