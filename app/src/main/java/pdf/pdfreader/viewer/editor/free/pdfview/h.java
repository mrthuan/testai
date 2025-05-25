package pdf.pdfreader.viewer.editor.free.pdfview;

import android.content.DialogInterface;
import lib.zj.pdfeditor.PDFAlert;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class h implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PDFAlert f26432a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PDFAlert.ButtonPressed[] f26433b;
    public final /* synthetic */ ReaderPreviewActivity.t0 c;

    public h(ReaderPreviewActivity.t0 t0Var, PDFAlert pDFAlert, PDFAlert.ButtonPressed[] buttonPressedArr) {
        this.c = t0Var;
        this.f26432a = pDFAlert;
        this.f26433b = buttonPressedArr;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        char c;
        ReaderPreviewActivity.t0 t0Var = this.c;
        ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
        readerPreviewActivity.L1 = null;
        if (readerPreviewActivity.I1) {
            if (i10 != -3) {
                if (i10 != -2) {
                    c = 0;
                } else {
                    c = 1;
                }
            } else {
                c = 2;
            }
            PDFAlert.ButtonPressed buttonPressed = this.f26433b[c];
            PDFAlert pDFAlert = this.f26432a;
            pDFAlert.f21162e = buttonPressed;
            ReaderPDFCore readerPDFCore = readerPreviewActivity.f26256t1;
            if (readerPDFCore != null) {
                readerPDFCore.replyToAlert(pDFAlert);
            }
            ReaderPreviewActivity.this.R2();
        }
    }
}
