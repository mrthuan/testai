package ao;

import android.widget.PopupWindow;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.DrawSignView;
import pdf.pdfreader.viewer.editor.free.ui.widget.SignSizeBottomSheetView;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignColorBottomSheetView;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignCreateView;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class k1 implements SignCreateView.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5093a;

    public k1(ReaderPreviewActivity readerPreviewActivity) {
        this.f5093a = readerPreviewActivity;
    }

    public final boolean a() {
        SignSizeBottomSheetView signSizeBottomSheetView;
        boolean z10;
        ReaderPreviewActivity readerPreviewActivity = this.f5093a;
        if (readerPreviewActivity.f26272v4) {
            readerPreviewActivity.Q0();
            return true;
        }
        SignColorBottomSheetView signColorBottomSheetView = readerPreviewActivity.f26275w0;
        if ((signColorBottomSheetView != null && signColorBottomSheetView.getVisibility() == 0) || ((signSizeBottomSheetView = readerPreviewActivity.f26268v0) != null && signSizeBottomSheetView.getVisibility() == 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        readerPreviewActivity.v3();
        return true;
    }

    public final void b() {
        ReaderPreviewActivity readerPreviewActivity = this.f5093a;
        if (readerPreviewActivity.f26277w2) {
            readerPreviewActivity.L4();
            return;
        }
        DrawSignView drawSignView = readerPreviewActivity.f26244r0;
        if (drawSignView != null) {
            drawSignView.setVisibility(0);
        }
        SignCreateView signCreateView = readerPreviewActivity.f26249s0;
        if (signCreateView != null) {
            signCreateView.setVisibility(8);
        }
        hp.e eVar = readerPreviewActivity.Z;
        if (eVar != null) {
            eVar.f18399e = true;
        }
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.i(readerPreviewActivity)) {
            if (readerPreviewActivity.L2 == 1) {
                readerPreviewActivity.setRequestedOrientation(1);
            } else {
                readerPreviewActivity.setRequestedOrientation(0);
            }
        } else {
            readerPreviewActivity.setRequestedOrientation(0);
        }
        tn.a.b(readerPreviewActivity, ea.a.p("QGksbg==", "eBJD4hrS"), ea.a.p("QGksbixkEGEFX0doBnc=", "AosBSfLt"));
        PopupWindow popupWindow = readerPreviewActivity.f26248r5;
        if (popupWindow != null && popupWindow.isShowing()) {
            readerPreviewActivity.f26248r5.dismiss();
        }
        readerPreviewActivity.B2();
    }
}
