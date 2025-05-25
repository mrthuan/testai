package ao;

import fn.c;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class d1 implements cg.l<Boolean, tf.d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ fn.b f5028a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e1 f5029b;

    public d1(e1 e1Var, c.a.C0222a c0222a) {
        this.f5029b = e1Var;
        this.f5028a = c0222a;
    }

    @Override // cg.l
    public final tf.d invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        e1 e1Var = this.f5029b;
        if (booleanValue) {
            ReaderPreviewActivity readerPreviewActivity = e1Var.f5033a;
            ExecutorService executorService = ReaderPreviewActivity.U5;
            readerPreviewActivity.c4(1, this.f5028a);
            return null;
        }
        ReaderPreviewActivity readerPreviewActivity2 = e1Var.f5033a;
        ExecutorService executorService2 = ReaderPreviewActivity.U5;
        readerPreviewActivity2.M2();
        ReaderPreviewActivity readerPreviewActivity3 = e1Var.f5033a;
        readerPreviewActivity3.W3();
        readerPreviewActivity3.H2();
        return null;
    }
}
