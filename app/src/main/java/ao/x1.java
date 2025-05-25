package ao;

import android.text.InputFilter;
import android.view.View;
import android.view.ViewStub;
import lib.zj.pdfeditor.text.editor.EditorView;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class x1 implements ViewStub.OnInflateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5149a;

    public x1(ReaderPreviewActivity readerPreviewActivity) {
        this.f5149a = readerPreviewActivity;
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(ViewStub viewStub, View view) {
        EditorView editorView = (EditorView) view;
        ReaderPreviewActivity readerPreviewActivity = this.f5149a;
        readerPreviewActivity.f26230o2 = editorView;
        editorView.setFilters(new InputFilter[]{new ml.a()});
        ReaderPreviewActivity.b0 b0Var = readerPreviewActivity.f26276w1;
        if (b0Var != null) {
            EditorView editorView2 = readerPreviewActivity.f26230o2;
            b0Var.f21237l2 = editorView2;
            editorView2.setListener(b0Var);
        }
    }
}
