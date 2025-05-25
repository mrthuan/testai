package pdf.pdfreader.viewer.editor.free.pdfview;

import android.content.DialogInterface;
import lib.zj.pdfeditor.PDFAlert;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class i implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PDFAlert f26434a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity.t0 f26435b;

    public i(ReaderPreviewActivity.t0 t0Var, PDFAlert pDFAlert) {
        this.f26435b = t0Var;
        this.f26434a = pDFAlert;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ReaderPreviewActivity.t0 t0Var = this.f26435b;
        ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
        readerPreviewActivity.L1 = null;
        if (readerPreviewActivity.I1) {
            PDFAlert.ButtonPressed buttonPressed = PDFAlert.ButtonPressed.None;
            PDFAlert pDFAlert = this.f26434a;
            pDFAlert.f21162e = buttonPressed;
            ReaderPDFCore readerPDFCore = readerPreviewActivity.f26256t1;
            if (readerPDFCore != null) {
                readerPDFCore.replyToAlert(pDFAlert);
            }
            ReaderPreviewActivity.this.R2();
        }
    }
}
