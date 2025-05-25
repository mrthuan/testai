package pdf.pdfreader.viewer.editor.free.ui.feature.debug;

import am.i;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask;
import pdf.pdfreader.viewer.editor.free.utils.e1;

/* compiled from: ReaderDebugActivity.kt */
/* loaded from: classes3.dex */
public final class b implements OperateExecuteTask.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderDebugActivity f27854a;

    public b(ReaderDebugActivity readerDebugActivity) {
        this.f27854a = readerDebugActivity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
    public final void c() {
        ReaderDebugActivity readerDebugActivity = this.f27854a;
        i iVar = readerDebugActivity.f27845a;
        if (iVar != null) {
            iVar.f965d.removeAllViews();
            i iVar2 = readerDebugActivity.f27845a;
            if (iVar2 != null) {
                iVar2.f965d.setVisibility(8);
                return;
            } else {
                g.i(ea.a.p("UWklZBpuZw==", "9a1VLLJt"));
                throw null;
            }
        }
        g.i(ea.a.p("UWklZBpuZw==", "8aWcNNxo"));
        throw null;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
    public final void f(PdfPreviewEntity pdfPreviewEntity) {
        e1.e(this.f27854a, pdfPreviewEntity);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
    public final void a() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
    public final void d() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
    public final void g() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
    public final void b(PdfPreviewEntity pdfPreviewEntity) {
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
    public final void e(PdfPreviewEntity pdfPreviewEntity) {
    }
}
