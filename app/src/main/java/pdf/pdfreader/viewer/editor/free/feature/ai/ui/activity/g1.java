package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.content.DialogInterface;
import lib.zj.pdfeditor.PDFAlert;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity;

/* compiled from: ReaderAIPreviewActivity.java */
/* loaded from: classes3.dex */
public final class g1 implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PDFAlert f24588a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderAIPreviewActivity.s f24589b;

    public g1(ReaderAIPreviewActivity.s sVar, PDFAlert pDFAlert) {
        this.f24589b = sVar;
        this.f24588a = pDFAlert;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ReaderAIPreviewActivity.s sVar = this.f24589b;
        ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
        readerAIPreviewActivity.f24498o0 = null;
        if (readerAIPreviewActivity.f24494m0) {
            PDFAlert.ButtonPressed buttonPressed = PDFAlert.ButtonPressed.None;
            PDFAlert pDFAlert = this.f24588a;
            pDFAlert.f21162e = buttonPressed;
            readerAIPreviewActivity.f24479c0.replyToAlert(pDFAlert);
            ReaderAIPreviewActivity.this.r2();
        }
    }
}
