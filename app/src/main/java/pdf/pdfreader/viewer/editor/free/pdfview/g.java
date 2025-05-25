package pdf.pdfreader.viewer.editor.free.pdfview;

import fn.c;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class g implements cg.l<Boolean, tf.d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ fn.b f26430a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity.q f26431b;

    public g(ReaderPreviewActivity.q qVar, c.a.C0222a c0222a) {
        this.f26431b = qVar;
        this.f26430a = c0222a;
    }

    @Override // cg.l
    public final tf.d invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        ReaderPreviewActivity.q qVar = this.f26431b;
        if (booleanValue) {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            ExecutorService executorService = ReaderPreviewActivity.U5;
            readerPreviewActivity.c4(3, this.f26430a);
        } else {
            ReaderPreviewActivity readerPreviewActivity2 = ReaderPreviewActivity.this;
            ExecutorService executorService2 = ReaderPreviewActivity.U5;
            readerPreviewActivity2.M2();
        }
        ReaderPreviewActivity.this.O3(qVar.f26373a);
        return null;
    }
}
