package ao;

import fn.c;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.feature.pdf_editor.ui.dialog.EditorFreeSaveDialog;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class e1 implements fn.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5033a;

    public e1(ReaderPreviewActivity readerPreviewActivity) {
        this.f5033a = readerPreviewActivity;
    }

    @Override // fn.a
    public final void a(c.a.C0222a c0222a) {
        ReaderPreviewActivity readerPreviewActivity = this.f5033a;
        if (readerPreviewActivity.S5 == null) {
            readerPreviewActivity.S5 = new EditorFreeSaveDialog(readerPreviewActivity);
        }
        readerPreviewActivity.S5.I(false);
        EditorFreeSaveDialog editorFreeSaveDialog = readerPreviewActivity.S5;
        editorFreeSaveDialog.f25616y = new d1(this, c0222a);
        editorFreeSaveDialog.show();
    }

    @Override // fn.a
    public final void b() {
        ExecutorService executorService = ReaderPreviewActivity.U5;
        this.f5033a.z4(true);
    }
}
