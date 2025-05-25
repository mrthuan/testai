package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.app.Activity;
import android.view.View;
import androidx.appcompat.libconvert.helper.NativeSoLoaderHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.text.SimpleDateFormat;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.PDF2WordSoDownLoadState01View;

/* loaded from: classes3.dex */
public class PdfListMoreMenuDialog extends oo.g implements androidx.lifecycle.x<Integer>, androidx.lifecycle.e {
    public final int A;
    public boolean B;
    public final PdfPreviewEntity C;
    public final a D;
    public boolean E;
    public ConstraintLayout F;
    public View G;
    public ConstraintLayout H;
    public PDF2WordSoDownLoadState01View I;
    public final Activity J;
    public boolean K;
    public SimpleDateFormat L;

    /* renamed from: y  reason: collision with root package name */
    public boolean f27445y;

    /* renamed from: z  reason: collision with root package name */
    public int f27446z;

    /* loaded from: classes3.dex */
    public interface a {
        void a(PdfPreviewEntity pdfPreviewEntity, boolean z10);

        void h(String str);

        void i(PdfPreviewEntity pdfPreviewEntity);

        void j(PdfPreviewEntity pdfPreviewEntity, boolean z10, int i10);

        void k(PdfPreviewEntity pdfPreviewEntity);

        void l(PdfPreviewEntity pdfPreviewEntity);

        void m(PdfPreviewEntity pdfPreviewEntity, boolean z10);

        void n(PdfPreviewEntity pdfPreviewEntity);

        void o(PdfPreviewEntity pdfPreviewEntity);

        void p(PdfPreviewEntity pdfPreviewEntity);

        void q(PdfPreviewEntity pdfPreviewEntity, boolean z10);

        void r(PdfPreviewEntity pdfPreviewEntity, boolean z10);

        void s(PdfPreviewEntity pdfPreviewEntity);

        void t(PdfPreviewEntity pdfPreviewEntity, boolean z10);

        void u(PdfPreviewEntity pdfPreviewEntity);

        void v(PdfPreviewEntity pdfPreviewEntity);

        void w(PdfPreviewEntity pdfPreviewEntity);

        void x(PdfPreviewEntity pdfPreviewEntity);

        void y(PdfPreviewEntity pdfPreviewEntity);

        void z(PdfPreviewEntity pdfPreviewEntity);
    }

    public PdfListMoreMenuDialog(Activity activity, PdfPreviewEntity pdfPreviewEntity, a aVar, int i10) {
        super(activity);
        this.B = false;
        this.E = false;
        this.K = false;
        this.J = activity;
        this.A = i10;
        this.C = pdfPreviewEntity;
        this.D = aVar;
    }

    @Override // oo.g
    public final boolean A() {
        return true;
    }

    @Override // oo.g
    public final boolean B() {
        return true;
    }

    @Override // oo.g
    public final boolean C() {
        return true;
    }

    @Override // oo.g
    public final float E() {
        return 0.9f;
    }

    @Override // oo.g, l.p, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.E = true;
        this.K = false;
        super.dismiss();
        String str = NativeSoLoaderHelper.f1933a;
        NativeSoLoaderHelper.f1942k.i(this);
        Activity activity = this.J;
        if (activity instanceof androidx.appcompat.app.c) {
            ((androidx.appcompat.app.c) activity).getLifecycle().c(this);
        }
    }

    @Override // androidx.lifecycle.e
    public final void e(androidx.lifecycle.p pVar) {
        this.K = false;
    }

    @Override // androidx.lifecycle.x
    public final void m(Integer num) {
        pdf.pdfreader.viewer.editor.free.utils.w0.a().f28791b.execute(new y0(this, num));
    }

    @Override // oo.g, android.app.Dialog
    public final void show() {
        super.show();
        String str = NativeSoLoaderHelper.f1933a;
        NativeSoLoaderHelper.f1942k.f(this);
        Activity activity = this.J;
        if (activity instanceof androidx.appcompat.app.c) {
            ((androidx.appcompat.app.c) activity).getLifecycle().a(this);
        }
    }

    @Override // oo.g
    public final int w() {
        return R.layout.layout_pdf_more_menu_dialog;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x02ad, code lost:
        if (r11.getPath().endsWith(ea.a.p("UHN2", "pXEaPrfN")) != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0543  */
    @Override // oo.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z() {
        /*
            Method dump skipped, instructions count: 1421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog.z():void");
    }

    @Override // androidx.lifecycle.e
    public final void a(androidx.lifecycle.p pVar) {
    }

    @Override // androidx.lifecycle.e
    public final void b(androidx.lifecycle.p pVar) {
    }

    @Override // androidx.lifecycle.e
    public final void h(androidx.lifecycle.p pVar) {
    }

    @Override // androidx.lifecycle.e
    public final void i(androidx.lifecycle.p pVar) {
    }

    @Override // androidx.lifecycle.e
    public final void k(androidx.lifecycle.p pVar) {
    }
}
