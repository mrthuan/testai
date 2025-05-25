package pdf.pdfreader.viewer.editor.free.ui.frag;

import java.util.List;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptContainer;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.act.ReaderEditSearchActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements DecryptAndCopyUIHelper.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28037a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f28038b;
    public final /* synthetic */ boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f28039d;

    public /* synthetic */ g(Object obj, PdfPreviewEntity pdfPreviewEntity, boolean z10, int i10) {
        this.f28037a = i10;
        this.f28039d = obj;
        this.f28038b = pdfPreviewEntity;
        this.c = z10;
    }

    @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.b
    public final void a(List list) {
        boolean z10 = this.c;
        int i10 = this.f28037a;
        PdfPreviewEntity pdfPreviewEntity = this.f28038b;
        Object obj = this.f28039d;
        switch (i10) {
            case 0:
                n nVar = (n) obj;
                int i11 = n.f28058c1;
                nVar.getClass();
                if (list.size() > 0) {
                    int i12 = Pdf2ImagePicPreviewActivity.I0;
                    Pdf2ImagePicPreviewActivity.a.a(nVar.r(), pdfPreviewEntity.getPath(), ea.a.p("N1ItTTBMKlMcXytPZkU=", "CiqbocUI"), ((DecryptContainer) list.get(0)).getPassword(), z10);
                    pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(nVar.i());
                    return;
                }
                return;
            default:
                ReaderEditSearchActivity readerEditSearchActivity = (ReaderEditSearchActivity) obj;
                String str = ReaderEditSearchActivity.f28303b0;
                readerEditSearchActivity.getClass();
                if (list.size() > 0) {
                    int i13 = Pdf2ImagePicPreviewActivity.I0;
                    Pdf2ImagePicPreviewActivity.a.a(readerEditSearchActivity, pdfPreviewEntity.getPath(), ea.a.p("f1I2TRVMDFMcXytPZkU=", "lp9yJEiy"), ((DecryptContainer) list.get(0)).getPassword(), z10);
                    pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(readerEditSearchActivity);
                    return;
                }
                return;
        }
    }
}
