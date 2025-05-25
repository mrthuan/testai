package ao;

import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.DrawSignView;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignCreateView;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class i1 implements DrawSignView.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5073a;

    public i1(ReaderPreviewActivity readerPreviewActivity) {
        this.f5073a = readerPreviewActivity;
    }

    public final void a() {
        ReaderPreviewActivity readerPreviewActivity = this.f5073a;
        DrawSignView drawSignView = readerPreviewActivity.f26244r0;
        if (drawSignView != null) {
            drawSignView.setVisibility(8);
        }
        SignCreateView signCreateView = readerPreviewActivity.f26249s0;
        if (signCreateView != null) {
            signCreateView.setVisibility(0);
        }
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.i(readerPreviewActivity)) {
            hp.e eVar = readerPreviewActivity.Z;
            if (eVar != null) {
                eVar.f18399e = false;
            }
        } else {
            hp.e eVar2 = readerPreviewActivity.Z;
            if (eVar2 != null) {
                eVar2.f18399e = true;
            }
            readerPreviewActivity.setRequestedOrientation(1);
        }
        readerPreviewActivity.P4(readerPreviewActivity.f26209k5);
        readerPreviewActivity.B2();
    }
}
