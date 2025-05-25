package pdf.pdfreader.viewer.editor.free.ui.frag;

import androidx.fragment.app.w;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: PdfReaderFragment.java */
/* loaded from: classes3.dex */
public final class p extends w {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f28064d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ n f28065e;

    public p(n nVar, PdfPreviewEntity pdfPreviewEntity) {
        this.f28065e = nVar;
        this.f28064d = pdfPreviewEntity;
    }

    @Override // oo.a
    public final void a() {
        ArrayList<PdfPreviewEntity> arrayList;
        n nVar = this.f28065e;
        PdfPreviewEntity pdfPreviewEntity = this.f28064d;
        if (pdfPreviewEntity != null) {
            tn.a.d(nVar.r(), ea.a.p("VWknZSxtDXJl", "hISOEGTv"), ea.a.p("KWldZRRvRWUFci9tGnYNX1FvAGU=", "mmicPz81"), aj.b.t(pdfPreviewEntity.getOtherStrOne()), false);
        }
        ArrayList<PdfPreviewEntity> E0 = nVar.E0();
        if (E0 != null && (arrayList = nVar.F0) != null && arrayList.size() > 0) {
            int indexOf = E0.indexOf(pdfPreviewEntity);
            int indexOf2 = nVar.F0.indexOf(pdfPreviewEntity);
            if (indexOf2 < nVar.F0.size() && indexOf2 >= 0) {
                if (indexOf < E0.size() && indexOf >= 0) {
                    E0.get(indexOf).setRecent(0);
                }
                nVar.F0.get(indexOf2).setRecent(0);
                nVar.E0.f27210e.get(indexOf2).setRecent(0);
                bm.c.b(nVar.Y.get()).i(nVar.F0.get(indexOf2));
                nVar.F0.remove(indexOf2);
                nVar.E0.notifyItemRemoved(indexOf2);
                wk.b.b().e(new qo.o());
                nVar.D0();
            }
        }
    }
}
