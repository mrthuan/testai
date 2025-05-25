package ao;

import fn.c;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf_editor.ui.dialog.EditorFreeSaveDialog;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class c1 implements fn.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5023a;

    public c1(ReaderPreviewActivity readerPreviewActivity) {
        this.f5023a = readerPreviewActivity;
    }

    @Override // fn.a
    public final void a(c.a.C0222a c0222a) {
        ReaderPreviewActivity readerPreviewActivity = this.f5023a;
        if (readerPreviewActivity.S5 == null) {
            readerPreviewActivity.S5 = new EditorFreeSaveDialog(readerPreviewActivity);
        }
        readerPreviewActivity.S5.I(true);
        EditorFreeSaveDialog editorFreeSaveDialog = readerPreviewActivity.S5;
        editorFreeSaveDialog.f25616y = new b1(this, c0222a);
        editorFreeSaveDialog.show();
    }

    @Override // fn.a
    public final void b() {
        ReaderPreviewActivity readerPreviewActivity = this.f5023a;
        readerPreviewActivity.f26179f3 = true;
        BaseSubscriptionActivity.a aVar = BaseSubscriptionActivity.L;
        String p10 = ea.a.p("VmQidA==", "ujPqaASe");
        aVar.getClass();
        BaseSubscriptionActivity.a.a(readerPreviewActivity, p10);
    }
}
