package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment;

import android.content.DialogInterface;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.y0;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.i;
import pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity;
import pdf.pdfreader.viewer.editor.free.office.o;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25227a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f25228b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f25227a = i10;
        this.f25228b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f25227a;
        Object obj = this.f25228b;
        switch (i10) {
            case 0:
                OCRPreviewFragment oCRPreviewFragment = (OCRPreviewFragment) obj;
                g.e(oCRPreviewFragment, ea.a.p("R2gic1cw", "SMIhhUTw"));
                y0 y0Var = oCRPreviewFragment.f25175i0;
                if (y0Var != null) {
                    y0Var.b(null);
                }
                oCRPreviewFragment.y0().e();
                return;
            case 1:
                BasePdf2ImageActivity basePdf2ImageActivity = (BasePdf2ImageActivity) obj;
                String str = BasePdf2ImageActivity.f25476k0;
                g.e(basePdf2ImageActivity, ea.a.p("LmgLc1Uw", "UIZbqTkr"));
                basePdf2ImageActivity.H.postDelayed(new i(basePdf2ImageActivity, 0), 150L);
                return;
            case 2:
                OfficeReaderActivity officeReaderActivity = (OfficeReaderActivity) obj;
                String str2 = OfficeReaderActivity.D2;
                g.e(officeReaderActivity, ea.a.p("R2gic1cw", "bygQZLS7"));
                officeReaderActivity.w2().postDelayed(new o(officeReaderActivity, 1), 150L);
                return;
            default:
                PdfReaderOpenClearDialog pdfReaderOpenClearDialog = (PdfReaderOpenClearDialog) obj;
                int i11 = PdfReaderOpenClearDialog.M;
                g.e(pdfReaderOpenClearDialog, ea.a.p("O2hYc10w", "y3UbwcPr"));
                ro.b<Boolean, PdfReaderOpenClearDialog> bVar = pdfReaderOpenClearDialog.K;
                if (bVar != null) {
                    bVar.d(Boolean.FALSE, pdfReaderOpenClearDialog);
                    return;
                }
                return;
        }
    }
}
