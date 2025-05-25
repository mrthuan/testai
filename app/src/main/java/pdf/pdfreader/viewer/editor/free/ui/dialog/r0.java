package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.text.TextUtils;
import android.view.View;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import lm.e;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog;
import pdf.pdfreader.viewer.editor.free.utils.event.AIEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;

/* compiled from: PdfListMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class r0 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PdfListMoreMenuDialog.a f27732b;
    public final /* synthetic */ PdfPreviewEntity c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ PdfListMoreMenuDialog f27733d;

    public r0(PdfListMoreMenuDialog pdfListMoreMenuDialog, PdfListMoreMenuDialog.a aVar, PdfPreviewEntity pdfPreviewEntity) {
        this.f27733d = pdfListMoreMenuDialog;
        this.f27732b = aVar;
        this.c = pdfPreviewEntity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        boolean z10;
        int i10;
        AIEventCenter.f28648a.getClass();
        AIEventCenter.b();
        PdfPreviewEntity pdfPreviewEntity = this.c;
        PdfListMoreMenuDialog.a aVar = this.f27732b;
        if (aVar != null) {
            aVar.l(pdfPreviewEntity);
        }
        boolean isOtherBoolOne = pdfPreviewEntity.isOtherBoolOne();
        PdfListMoreMenuDialog pdfListMoreMenuDialog = this.f27733d;
        if (isOtherBoolOne) {
            if (aVar != null) {
                aVar.h(pdfListMoreMenuDialog.getContext().getString(R.string.arg_res_0x7f130116));
            }
            pdfListMoreMenuDialog.cancel();
            return;
        }
        long size = pdfPreviewEntity.getSize();
        if (lm.e.f21773a && size > 10485760) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (aVar != null) {
                aVar.h(pdfListMoreMenuDialog.getContext().getString(R.string.arg_res_0x7f13014f, "10".concat(ea.a.p("AkI=", "w2x3lwB2"))));
            }
            pdfListMoreMenuDialog.cancel();
            return;
        }
        if (TextUtils.equals(pdfPreviewEntity.getOtherStrOne(), ea.a.p("Y0RG", "ICC0gFBW"))) {
            i10 = 701;
        } else {
            i10 = OS2WindowsMetricsTable.WEIGHT_CLASS_BOLD;
        }
        e.a.b(pdfListMoreMenuDialog.getContext(), pdfPreviewEntity.getPath(), i10, 603, ea.a.p("KWldZRRvRWU=", "iKGlUPf4"), ea.a.p("VWknZR5vEGU=", "Zt5NtQPa"), false);
        if (pdfListMoreMenuDialog.G.getVisibility() == 0) {
            pdfListMoreMenuDialog.G.setVisibility(8);
            pdf.pdfreader.viewer.editor.free.utils.q0.v(pdfListMoreMenuDialog.getContext());
        }
        pdfListMoreMenuDialog.cancel();
        AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
        AppCoreFilterEvent.g(ea.a.p("U2lpZSp0FHIXYwppV2s=", "Q726DqX1"));
    }
}
