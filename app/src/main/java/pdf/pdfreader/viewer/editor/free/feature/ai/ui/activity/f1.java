package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.content.DialogInterface;
import lib.zj.pdfeditor.PDFAlert;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity;

/* compiled from: ReaderAIPreviewActivity.java */
/* loaded from: classes3.dex */
public final class f1 implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PDFAlert f24582a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PDFAlert.ButtonPressed[] f24583b;
    public final /* synthetic */ ReaderAIPreviewActivity.s c;

    public f1(ReaderAIPreviewActivity.s sVar, PDFAlert pDFAlert, PDFAlert.ButtonPressed[] buttonPressedArr) {
        this.c = sVar;
        this.f24582a = pDFAlert;
        this.f24583b = buttonPressedArr;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        char c;
        ReaderAIPreviewActivity.s sVar = this.c;
        ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
        readerAIPreviewActivity.f24498o0 = null;
        if (readerAIPreviewActivity.f24494m0) {
            if (i10 != -3) {
                if (i10 != -2) {
                    c = 0;
                } else {
                    c = 1;
                }
            } else {
                c = 2;
            }
            PDFAlert.ButtonPressed buttonPressed = this.f24583b[c];
            PDFAlert pDFAlert = this.f24582a;
            pDFAlert.f21162e = buttonPressed;
            readerAIPreviewActivity.f24479c0.replyToAlert(pDFAlert);
            ReaderAIPreviewActivity.this.r2();
        }
    }
}
