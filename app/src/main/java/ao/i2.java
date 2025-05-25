package ao;

import android.view.View;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import lib.zj.pdfeditor.PDFReaderView;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.AddTextChangeColorBottomSheetView;
import pdf.pdfreader.viewer.editor.free.ui.widget.AddTextColorView;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class i2 implements lj.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5074a;

    public i2(ReaderPreviewActivity readerPreviewActivity) {
        this.f5074a = readerPreviewActivity;
    }

    public final void a(int i10, int i11) {
        tn.a.b(ReaderPdfApplication.m(), ea.a.p("LmRVXw1lT3Q=", "xXDuFYzR"), ea.a.p("H2VLdGxhLGoXdAN4QGI4eGdzOm93", "FBk33HWt"));
        ReaderPreviewActivity readerPreviewActivity = this.f5074a;
        readerPreviewActivity.f26276w1.m0(false);
        if (readerPreviewActivity.f26276w1.getMode() == PDFReaderView.Mode.AddText) {
            readerPreviewActivity.f26276w1.setMode(PDFReaderView.Mode.AdjustText);
        }
        if (readerPreviewActivity.f26276w1.getMode() != PDFReaderView.Mode.AdjustText && readerPreviewActivity.f26276w1.getMode() != PDFReaderView.Mode.Editor) {
            return;
        }
        readerPreviewActivity.x2(i10);
        readerPreviewActivity.r4(i11);
    }

    public final void b() {
        o9.d.s(ea.a.p("KGQ0VFx4GVAncDJhZw==", "L2IP9m8U"), ea.a.p("E2Qicx5pEXMzZFBUDHgiRSBpRlApcGMg", "0oWZNUox"));
        ReaderPreviewActivity readerPreviewActivity = this.f5074a;
        PopupWindow popupWindow = readerPreviewActivity.B5;
        if (popupWindow != null && popupWindow.isShowing()) {
            readerPreviewActivity.B5.dismiss();
        }
    }

    public final void c() {
        tn.a.b(ReaderPdfApplication.m(), ea.a.p("UmQvXwdlGnQ=", "aXtaCyGR"), ea.a.p("R2UzdCxhBmotZFFsDHQzXydsW2Nr", "u58yR3aE"));
        ExecutorService executorService = ReaderPreviewActivity.U5;
        this.f5074a.r3(false, false);
    }

    public final void d(int i10, int i11) {
        int i12;
        AddTextChangeColorBottomSheetView addTextChangeColorBottomSheetView = this.f5074a.f26285x3;
        int i13 = 1;
        if (addTextChangeColorBottomSheetView != null) {
            if (addTextChangeColorBottomSheetView.C == null) {
                addTextChangeColorBottomSheetView.C = new ArrayList();
            }
            if (addTextChangeColorBottomSheetView.C.isEmpty()) {
                int childCount = ((am.z1) addTextChangeColorBottomSheetView.f28172y).c.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = ((am.z1) addTextChangeColorBottomSheetView.f28172y).c.getChildAt(i14);
                    if (childAt instanceof AddTextColorView) {
                        addTextChangeColorBottomSheetView.C.add(Integer.valueOf(((AddTextColorView) childAt).getCenterColor()));
                    }
                }
            }
            i12 = addTextChangeColorBottomSheetView.C.indexOf(Integer.valueOf(i11)) + 1;
        } else {
            i12 = 1;
        }
        if (i10 > 15) {
            if (i10 <= 20) {
                i13 = 2;
            } else if (i10 <= 25) {
                i13 = 3;
            } else if (i10 <= 30) {
                i13 = 4;
            } else if (i10 <= 35) {
                i13 = 5;
            } else if (i10 <= 40) {
                i13 = 6;
            } else if (i10 <= 45) {
                i13 = 7;
            } else {
                i13 = 8;
            }
        }
        tn.a.d(ReaderPdfApplication.m(), ea.a.p("JWQVXwxlInQ=", "pMDqxZt3"), ea.a.p("R2UzdCxhBmotc1V2ZQ==", "06UAg20u"), i12 + ea.a.p("Xw==", "k7iEI0xw") + i13, false);
    }

    public final void e(int i10, int i11) {
        tn.a.b(ReaderPdfApplication.m(), ea.a.p("UmQvXwdlGnQ=", "yKNFaQLa"), ea.a.p("AmVBdCxhL2oXdAN4QGI4eGdzOm93", "46v9sKnl"));
        ReaderPreviewActivity readerPreviewActivity = this.f5074a;
        readerPreviewActivity.f26276w1.m0(false);
        if (readerPreviewActivity.f26276w1.getMode() == PDFReaderView.Mode.AddText) {
            readerPreviewActivity.f26276w1.setMode(PDFReaderView.Mode.AdjustText);
        }
        if (readerPreviewActivity.f26276w1.getMode() != PDFReaderView.Mode.AdjustText && readerPreviewActivity.f26276w1.getMode() != PDFReaderView.Mode.Editor) {
            return;
        }
        readerPreviewActivity.x2(i10);
        readerPreviewActivity.r4(i11);
    }
}
