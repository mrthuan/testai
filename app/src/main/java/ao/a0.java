package ao;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignColorBottomSheetView;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignatureImageView;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class a0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5011a;

    public a0(ReaderPreviewActivity readerPreviewActivity) {
        this.f5011a = readerPreviewActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String p10 = ea.a.p("QGksbg==", "mSZ32jRf");
        String p11 = ea.a.p("QGksbixsC24XX1dsAGNr", "GYK5sF97");
        ReaderPreviewActivity readerPreviewActivity = this.f5011a;
        tn.a.b(readerPreviewActivity, p10, p11);
        if (readerPreviewActivity.f26268v0.H()) {
            readerPreviewActivity.f26268v0.C();
        } else {
            tn.a.b(readerPreviewActivity, ea.a.p("QGksbg==", "VIpYrx5C"), ea.a.p("I2kEbixhB2o9cxJfWGk5ZWdsM3kscmlzHG93", "DTPcscH7"));
            readerPreviewActivity.f26268v0.I();
        }
        SignColorBottomSheetView signColorBottomSheetView = readerPreviewActivity.f26275w0;
        if (signColorBottomSheetView != null) {
            signColorBottomSheetView.C();
        }
        SignatureImageView signatureImageView = readerPreviewActivity.f26209k5;
        if (signatureImageView != null) {
            readerPreviewActivity.f26268v0.setSize(signatureImageView.getCurrentPathSignSize());
        }
    }
}
