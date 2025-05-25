package ao;

import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.SignSizeBottomSheetView;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignatureImageView;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.data.SignAction;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.data.SignActionInfo;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathActionInfo;
import xo.g;
import yo.c;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class x implements SignSizeBottomSheetView.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5147a;

    public x(ReaderPreviewActivity readerPreviewActivity) {
        this.f5147a = readerPreviewActivity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.SignSizeBottomSheetView.b
    public final void a(int i10) {
        ReaderPreviewActivity readerPreviewActivity = this.f5147a;
        if (readerPreviewActivity.f26209k5 == null) {
            return;
        }
        SignActionInfo signActionInfo = new SignActionInfo(readerPreviewActivity.q5);
        SignActionInfo signActionInfo2 = new SignActionInfo(readerPreviewActivity.q5);
        signActionInfo2.setSignPathActionInfo(readerPreviewActivity.f26209k5.getSignPathActionInfo());
        signActionInfo2.setAction(SignAction.Size);
        c.a.f32211a.a(signActionInfo, signActionInfo2);
        readerPreviewActivity.q5 = new SignActionInfo(signActionInfo2);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.widget.SignSizeBottomSheetView.b
    public final void b(int i10) {
        SignatureImageView signatureImageView = this.f5147a.f26209k5;
        if (signatureImageView != null) {
            SignPathActionInfo signPathActionInfo = signatureImageView.f28456o;
            if (signPathActionInfo != null) {
                signPathActionInfo.setSize(i10);
                kj.b bVar = signatureImageView.f28454m;
                if (bVar != null) {
                    xo.g gVar = g.a.f31902a;
                    long j10 = bVar.f19799a;
                    SignPathActionInfo signPathActionInfo2 = signatureImageView.f28456o;
                    if (signPathActionInfo2 != null) {
                        gVar.f31901a.put(Long.valueOf(j10), signPathActionInfo2);
                    } else {
                        gVar.getClass();
                    }
                }
            }
            signatureImageView.invalidate();
        }
    }
}
