package ao;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignColorBottomSheetView;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignatureImageView;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class b0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5016a;

    public b0(ReaderPreviewActivity readerPreviewActivity) {
        this.f5016a = readerPreviewActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String p10 = ea.a.p("QGksbg==", "ZZMzj15I");
        String p11 = ea.a.p("AmlfbjJjGmwncjljWGk0aw==", "Adq8muxK");
        ReaderPreviewActivity readerPreviewActivity = this.f5016a;
        tn.a.b(readerPreviewActivity, p10, p11);
        SignColorBottomSheetView signColorBottomSheetView = readerPreviewActivity.f26275w0;
        if (signColorBottomSheetView == null) {
            return;
        }
        if (signColorBottomSheetView.H()) {
            readerPreviewActivity.f26275w0.C();
        } else {
            tn.a.b(readerPreviewActivity, ea.a.p("PGlWbg==", "swANQdKg"), ea.a.p("QGksbixhBmoHc0BfCm86bzZfXmE_ZTFfN2gMdw==", "Dca7Ley4"));
            readerPreviewActivity.f26275w0.I();
        }
        readerPreviewActivity.f26268v0.C();
        SignatureImageView signatureImageView = readerPreviewActivity.f26209k5;
        if (signatureImageView != null) {
            readerPreviewActivity.f26275w0.setSelectColor(signatureImageView.getCurrentPathSignColor());
        }
    }
}
