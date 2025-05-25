package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.libconvert.helper.NativeSoLoaderHelper;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;

/* compiled from: PdfListMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class w0 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PdfListMoreMenuDialog.a f27785b;
    public final /* synthetic */ PdfPreviewEntity c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f27786d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Context f27787e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ PdfListMoreMenuDialog f27788f;

    public w0(PdfListMoreMenuDialog pdfListMoreMenuDialog, PdfListMoreMenuDialog.a aVar, PdfPreviewEntity pdfPreviewEntity, LinearLayout linearLayout, Context context) {
        this.f27788f = pdfListMoreMenuDialog;
        this.f27785b = aVar;
        this.c = pdfPreviewEntity;
        this.f27786d = linearLayout;
        this.f27787e = context;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        PDF2WordHelper.Companion companion = PDF2WordHelper.f25574a;
        Activity activity = this.f27788f.J;
        final PdfListMoreMenuDialog.a aVar = this.f27785b;
        final PdfPreviewEntity pdfPreviewEntity = this.c;
        cg.a aVar2 = new cg.a() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.u0
            @Override // cg.a
            public final Object invoke() {
                PdfListMoreMenuDialog pdfListMoreMenuDialog = w0.this.f27788f;
                pdfListMoreMenuDialog.K = false;
                PdfListMoreMenuDialog.a aVar3 = aVar;
                if (aVar3 != null) {
                    aVar3.r(pdfPreviewEntity, pdfListMoreMenuDialog.f27445y);
                }
                pdfListMoreMenuDialog.cancel();
                return null;
            }
        };
        cg.a aVar3 = new cg.a() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.v0
            @Override // cg.a
            public final Object invoke() {
                w0.this.f27788f.K = true;
                return null;
            }
        };
        pdf.pdfreader.viewer.editor.free.ui.act.y yVar = new pdf.pdfreader.viewer.editor.free.ui.act.y(this, 1);
        NativeSoLoaderHelper.DownloadSource downloadSource = NativeSoLoaderHelper.DownloadSource.FromMore;
        companion.getClass();
        PDF2WordHelper.Companion.d(activity, aVar2, aVar3, yVar, downloadSource);
        LinearLayout linearLayout = this.f27786d;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            linearLayout.setVisibility(8);
            pdf.pdfreader.viewer.editor.free.utils.q0.w(this.f27787e, "pdf2word_red_dot_show_in_167", false);
        }
        AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
        AppCoreFilterEvent.g(ea.a.p("NTI_XzNuNmU6XwVsXWNr", "DCEHVBc2"));
        AppCoreFilterEvent.e();
    }
}
