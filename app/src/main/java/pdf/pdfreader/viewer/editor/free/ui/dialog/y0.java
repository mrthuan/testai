package pdf.pdfreader.viewer.editor.free.ui.dialog;

import androidx.appcompat.libconvert.helper.NativeSoLoaderHelper;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.PDF2WordSoDownLoadState01View;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfListMoreMenuDialog;

/* compiled from: PdfListMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class y0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Integer f27806a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PdfListMoreMenuDialog f27807b;

    public y0(PdfListMoreMenuDialog pdfListMoreMenuDialog, Integer num) {
        this.f27807b = pdfListMoreMenuDialog;
        this.f27806a = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PdfListMoreMenuDialog pdfListMoreMenuDialog = this.f27807b;
        PDF2WordSoDownLoadState01View pDF2WordSoDownLoadState01View = pdfListMoreMenuDialog.I;
        if (pDF2WordSoDownLoadState01View != null) {
            pDF2WordSoDownLoadState01View.c();
            int intValue = this.f27806a.intValue();
            String str = NativeSoLoaderHelper.f1933a;
            if (intValue == NativeSoLoaderHelper.f1936e && pdfListMoreMenuDialog.K) {
                PdfListMoreMenuDialog.a aVar = pdfListMoreMenuDialog.D;
                if (aVar != null) {
                    aVar.r(pdfListMoreMenuDialog.C, pdfListMoreMenuDialog.f27445y);
                }
                pdfListMoreMenuDialog.cancel();
            }
        }
    }
}
