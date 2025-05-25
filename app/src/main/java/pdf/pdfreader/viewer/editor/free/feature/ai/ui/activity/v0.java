package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.content.Context;
import android.content.DialogInterface;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.PdfReaderAppWidgetNewDialog;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.WidgetFromType;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.utils.event.WidgetEventCenter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24662a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f24663b;

    public /* synthetic */ v0(Object obj, int i10) {
        this.f24662a = i10;
        this.f24663b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f24662a;
        Object obj = this.f24663b;
        switch (i10) {
            case 0:
                final OfficeAIReaderActivity officeAIReaderActivity = (OfficeAIReaderActivity) obj;
                String str = OfficeAIReaderActivity.K0;
                kotlin.jvm.internal.g.e(officeAIReaderActivity, ea.a.p("R2gic1cw", "wW9xPV5w"));
                officeAIReaderActivity.i2().postDelayed(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.r0
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str2 = OfficeAIReaderActivity.K0;
                        String p10 = ea.a.p("O2hYc10w", "zxbG6FX1");
                        OfficeAIReaderActivity officeAIReaderActivity2 = OfficeAIReaderActivity.this;
                        kotlin.jvm.internal.g.e(officeAIReaderActivity2, p10);
                        officeAIReaderActivity2.f2();
                    }
                }, 150L);
                return;
            case 1:
                PdfReaderAppWidgetNewDialog pdfReaderAppWidgetNewDialog = (PdfReaderAppWidgetNewDialog) obj;
                int i11 = PdfReaderAppWidgetNewDialog.O;
                kotlin.jvm.internal.g.e(pdfReaderAppWidgetNewDialog, ea.a.p("R2gic1cw", "4qFTAIF5"));
                ro.a<Boolean> aVar = pdfReaderAppWidgetNewDialog.K;
                if (aVar != null) {
                    aVar.o(Boolean.TRUE);
                }
                boolean z10 = pdfReaderAppWidgetNewDialog.I;
                WidgetFromType widgetFromType = pdfReaderAppWidgetNewDialog.f24831y;
                if (z10) {
                    tn.a.d(ReaderPdfApplication.m(), ea.a.p("KHVYZGU=", "iPK2GcmU"), ea.a.p("OGlVZxx0RF87ZC5fFmwBY2s=", "rn8tfJQE"), a6.h.c(WidgetEventCenter.b(widgetFromType), "_total"), false);
                    Context m10 = ReaderPdfApplication.m();
                    String p10 = ea.a.p("HnUMZGU=", "ZuyeOQB7");
                    String p11 = ea.a.p("RGkvZxZ0EV8TZFBfCmw_Y2s=", "RuLX706x");
                    String b10 = WidgetEventCenter.b(widgetFromType);
                    tn.a.d(m10, p10, p11, b10 + "_" + (pdfReaderAppWidgetNewDialog.L + 1), false);
                    return;
                }
                tn.a.d(ReaderPdfApplication.m(), ea.a.p("VHUiZGU=", "61gS8ke5"), ea.a.p("OGkpZzR0G18rbwpzUV80bFFjaw==", "7YOMQhJM"), WidgetEventCenter.b(widgetFromType), false);
                return;
            case 2:
                pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f fVar = (pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f) obj;
                String str2 = pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f.D;
                kotlin.jvm.internal.g.e(fVar, ea.a.p("O2hYc10w", "PFMitUDR"));
                fVar.f25313t.postDelayed(new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.a(fVar, 1), 150L);
                return;
            default:
                ReaderPreviewActivity readerPreviewActivity = (ReaderPreviewActivity) obj;
                readerPreviewActivity.D.postDelayed(new ao.p(readerPreviewActivity, 2), 150L);
                return;
        }
    }
}
