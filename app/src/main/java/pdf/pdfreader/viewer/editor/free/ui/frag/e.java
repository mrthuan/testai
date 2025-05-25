package pdf.pdfreader.viewer.editor.free.ui.frag;

import androidx.fragment.app.w;
import java.util.ArrayList;
import java.util.Iterator;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: PdfReaderFilesFragment.java */
/* loaded from: classes3.dex */
public final class e extends w {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ n f28032d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ArrayList f28033e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f28034f;

    public e(a aVar, n nVar, ArrayList arrayList) {
        this.f28034f = aVar;
        this.f28032d = nVar;
        this.f28033e = arrayList;
    }

    @Override // oo.a
    public final void a() {
        boolean z10;
        int indexOf;
        n nVar = this.f28032d;
        nVar.getClass();
        ArrayList<PdfPreviewEntity> arrayList = nVar.F0;
        ArrayList arrayList2 = this.f28033e;
        if (arrayList2 != null && arrayList2.size() > 0 && arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) it.next();
                if (pdfPreviewEntity != null && (indexOf = arrayList.indexOf(pdfPreviewEntity)) < arrayList.size() && indexOf >= 0) {
                    PdfPreviewEntity pdfPreviewEntity2 = arrayList.get(indexOf);
                    pdfPreviewEntity2.setRecent(0);
                    ea.a.p("R2U4dHQ=", "lrO2IQaS");
                    ea.a.p("BmUObyBlMWUrZQh0cmk7ZUs6IA==", "m9tcVcL3");
                    bm.c.b(nVar.Y.get()).i(pdfPreviewEntity2);
                    arrayList.remove(indexOf);
                    nVar.E0.f27210e.remove(indexOf);
                    nVar.E0.notifyItemRemoved(indexOf);
                }
            }
            wk.b.b().e(new qo.j());
            nVar.D0();
        }
        if (arrayList.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        wk.b b10 = wk.b.b();
        a aVar = this.f28034f;
        b10.e(new qo.c(false, aVar.f27998d0, aVar.f28014t0, z10));
    }
}
