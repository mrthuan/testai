package pdf.pdfreader.viewer.editor.free.ui.frag;

import java.util.List;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptContainer;
import pdf.pdfreader.viewer.editor.free.ui.widget.act.ReaderEditSearchActivity;
import pdf.pdfreader.viewer.editor.free.utils.k0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements DecryptAndCopyUIHelper.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28035a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f28036b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(Object obj, PdfPreviewEntity pdfPreviewEntity, int i10) {
        this.f28035a = i10;
        this.c = obj;
        this.f28036b = pdfPreviewEntity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.b
    public final void a(List list) {
        int i10 = this.f28035a;
        PdfPreviewEntity pdfPreviewEntity = this.f28036b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                n nVar = (n) obj;
                int i11 = n.f28058c1;
                nVar.getClass();
                if (!list.isEmpty()) {
                    k0.k(nVar.r(), pdfPreviewEntity.getPath(), ((DecryptContainer) list.get(0)).getPassword(), ea.a.p("CVJ-TSZMflMOXwdPJ0U=", "gNNLMGRz"));
                    pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(nVar.i());
                    return;
                }
                return;
            default:
                ReaderEditSearchActivity readerEditSearchActivity = (ReaderEditSearchActivity) obj;
                String str = ReaderEditSearchActivity.f28303b0;
                readerEditSearchActivity.getClass();
                if (!list.isEmpty()) {
                    k0.k(readerEditSearchActivity, pdfPreviewEntity.getPath(), ((DecryptContainer) list.get(0)).getPassword(), ea.a.p("IVIlTRBMOVMcXytPZkU=", "HNgjOpP9"));
                    pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(readerEditSearchActivity);
                    return;
                }
                return;
        }
    }
}
