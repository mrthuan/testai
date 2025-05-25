package lib.zj.pdfeditor;

import android.app.AlertDialog;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: PDFPageView.java */
/* loaded from: classes3.dex */
public final class s extends AsyncTask<Void, Void, String> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ PDFPageView f21576i;

    public s(PDFPageView pDFPageView) {
        this.f21576i = pDFPageView;
    }

    @Override // lib.zj.pdfeditor.AsyncTask
    public final String b(Void[] voidArr) {
        return this.f21576i.G0.checkFocusedSignature();
    }

    @Override // lib.zj.pdfeditor.AsyncTask
    public final void f(String str) {
        String str2 = str;
        if (str2 != null) {
            int i10 = PDFPageView.f21175y1;
            PDFPageView pDFPageView = this.f21576i;
            if (pDFPageView.p2()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(pDFPageView.P0);
                builder.setTitle("Signature checked");
                builder.setPositiveButton(R.string.arg_res_0x7f1302e7, new k());
                AlertDialog create = builder.create();
                create.setMessage(str2);
                create.show();
            }
        }
    }
}
