package pdf.pdfreader.viewer.editor.free.office;

import android.view.View;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.io.File;
import lib.zj.office.pg.control.Presentation;
import lib.zj.office.wp.control.Word;
import lm.e;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.z;
import pdf.pdfreader.viewer.editor.free.utils.e1;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.q0;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: OfficeReaderActivity.kt */
/* loaded from: classes3.dex */
public final class w implements z.i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OfficeReaderActivity f26142a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ OfficeReaderActivity f26143b;

    public w(OfficeReaderActivity officeReaderActivity, OfficeReaderActivity officeReaderActivity2) {
        this.f26142a = officeReaderActivity;
        this.f26143b = officeReaderActivity2;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.z.i
    public final void a(PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        OfficeReaderActivity officeReaderActivity = this.f26142a;
        pdf.pdfreader.viewer.editor.free.utils.p.c(officeReaderActivity, pdfPreviewEntity, z10);
        if (pdfPreviewEntity != null) {
            pdfPreviewEntity.setFavorite(!z10 ? 1 : 0);
            pdfPreviewEntity.setFavoriteDate(System.currentTimeMillis());
            bm.c.b(officeReaderActivity).i(pdfPreviewEntity);
            FileRepository.I(pdfPreviewEntity);
            qo.m mVar = new qo.m();
            mVar.f29407d = true;
            mVar.f29410g = pdfPreviewEntity;
            wk.b.b().e(mVar);
            int favorite = pdfPreviewEntity.getFavorite();
            t1.b("itemFavorite:" + favorite);
            if (pdfPreviewEntity.getFavorite() == 1) {
                j1.e(officeReaderActivity, officeReaderActivity.getString(R.string.arg_res_0x7f130366, officeReaderActivity.getString(R.string.arg_res_0x7f13036f)), false, androidx.core.content.a.getDrawable(officeReaderActivity, R.drawable.ic_home_bookmark), officeReaderActivity.F2());
            } else {
                j1.e(officeReaderActivity, officeReaderActivity.getString(R.string.arg_res_0x7f1303df, officeReaderActivity.getString(R.string.arg_res_0x7f13036f)), true, null, officeReaderActivity.F2());
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.z.i
    public final void b(PdfPreviewEntity pdfPreviewEntity) {
        String str = pdf.pdfreader.viewer.editor.free.utils.p.f28740a;
        String p10 = ea.a.p("Lmkndw1tKHJl", "GbXBRGHo");
        String p11 = ea.a.p("RWkudx5vEGUtc1xhG2UJYyhpUWs=", "3axS7oxJ");
        String d10 = pdf.pdfreader.viewer.editor.free.utils.p.d(pdfPreviewEntity);
        OfficeReaderActivity officeReaderActivity = this.f26142a;
        pdf.pdfreader.viewer.editor.free.utils.p.b(officeReaderActivity, p10, p11, d10);
        e1.d(this.f26143b, new File(officeReaderActivity.L0));
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.z.i
    public final void c() {
        OfficeReaderActivity officeReaderActivity = this.f26142a;
        if (OfficeReaderActivity.b2(officeReaderActivity)) {
            e.a.b(officeReaderActivity, officeReaderActivity.L0, OS2WindowsMetricsTable.WEIGHT_CLASS_BOLD, 601, ea.a.p("OWlUdxRvRWU=", "ioQDGhbC"), ea.a.p("A2ktdyJvNWU=", "uDuHOGMC"), false);
        }
        if (q0.C(officeReaderActivity)) {
            q0.v(officeReaderActivity);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.z.i
    public final void d() {
        View view;
        OfficeReaderActivity officeReaderActivity = this.f26142a;
        lib.zj.office.system.p pVar = officeReaderActivity.P0;
        if (pVar != null) {
            view = pVar.getView();
        } else {
            view = null;
        }
        if (view instanceof Word) {
            officeReaderActivity.h3(0, true);
        } else if (view instanceof Presentation) {
            officeReaderActivity.h3(1, true);
        }
        PdfPreviewEntity pdfPreviewEntity = officeReaderActivity.N0;
        String str = pdf.pdfreader.viewer.editor.free.utils.p.f28740a;
        pdf.pdfreader.viewer.editor.free.utils.p.b(officeReaderActivity, ea.a.p("RWkudyxtDXJl", "WyggMmNa"), ea.a.p("OWlUdxRvRWUFcCtnEF8LbFxjaw==", "Q8sBnWzA"), pdf.pdfreader.viewer.editor.free.utils.p.d(pdfPreviewEntity));
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.z.i
    public final void e() {
    }
}
