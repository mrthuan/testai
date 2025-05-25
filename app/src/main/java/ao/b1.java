package ao;

import fn.c;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class b1 implements cg.l<Boolean, tf.d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ fn.b f5017a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c1 f5018b;

    public b1(c1 c1Var, c.a.C0222a c0222a) {
        this.f5018b = c1Var;
        this.f5017a = c0222a;
    }

    @Override // cg.l
    public final tf.d invoke(Boolean bool) {
        if (bool.booleanValue()) {
            c1 c1Var = this.f5018b;
            ReaderPreviewActivity readerPreviewActivity = c1Var.f5023a;
            ExecutorService executorService = ReaderPreviewActivity.U5;
            readerPreviewActivity.c4(2, this.f5017a);
            c1Var.f5023a.W3();
            return null;
        }
        return null;
    }
}
