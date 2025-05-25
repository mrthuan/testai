package pdf.pdfreader.viewer.editor.free.ui.adapter;

import android.view.View;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderSearchActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.c1;
import pdf.pdfreader.viewer.editor.free.ui.adapter.s;
import pdf.pdfreader.viewer.editor.free.utils.k0;
import pdf.pdfreader.viewer.editor.free.utils.l0;

/* compiled from: SearchAdapter.java */
/* loaded from: classes3.dex */
public final class q extends l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f27286b;
    public final /* synthetic */ s c;

    public q(s sVar, PdfPreviewEntity pdfPreviewEntity) {
        this.c = sVar;
        this.f27286b = pdfPreviewEntity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        s sVar = this.c;
        int i10 = sVar.f27293i;
        PdfPreviewEntity pdfPreviewEntity = this.f27286b;
        if (i10 == 1) {
            if (sVar.f27294j.contains(Long.valueOf(pdfPreviewEntity.getId()))) {
                ArrayList<Long> arrayList = sVar.f27295k;
                if (!arrayList.remove(Long.valueOf(pdfPreviewEntity.getId()))) {
                    arrayList.add(Long.valueOf(pdfPreviewEntity.getId()));
                }
            } else {
                ArrayList<Long> arrayList2 = sVar.f27296l;
                if (!arrayList2.remove(Long.valueOf(pdfPreviewEntity.getId()))) {
                    arrayList2.add(Long.valueOf(pdfPreviewEntity.getId()));
                }
            }
            ArrayList<PdfPreviewEntity> arrayList3 = sVar.f27290f;
            int indexOf = arrayList3.indexOf(pdfPreviewEntity);
            if (indexOf >= 0 && indexOf < arrayList3.size()) {
                sVar.notifyItemChanged(indexOf);
            }
        }
        s.a aVar = sVar.f27289e;
        if (aVar != null) {
            ReaderSearchActivity readerSearchActivity = (ReaderSearchActivity) aVar;
            if (sVar.f27293i == 1) {
                readerSearchActivity.f2();
            } else if (pdfPreviewEntity != null) {
                try {
                    String obj = readerSearchActivity.f26804w.getText().toString();
                    ArrayList<String> arrayList4 = readerSearchActivity.I;
                    if (arrayList4 != null && !arrayList4.contains(obj)) {
                        readerSearchActivity.I.add(0, obj);
                        t tVar = readerSearchActivity.Q;
                        if (tVar != null) {
                            tVar.notifyDataSetChanged();
                        }
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                ArrayList<PdfPreviewEntity> arrayList5 = readerSearchActivity.B.f27290f;
                if (arrayList5 != null && arrayList5.size() > 0) {
                    int indexOf2 = arrayList5.indexOf(pdfPreviewEntity);
                    if (indexOf2 < arrayList5.size() && indexOf2 >= 0) {
                        PdfPreviewEntity pdfPreviewEntity2 = arrayList5.get(indexOf2);
                        pdfPreviewEntity2.getRecent();
                        pdfPreviewEntity2.setRecent(1);
                        pdfPreviewEntity2.setRecentDate(System.currentTimeMillis());
                        bm.c.b(readerSearchActivity).i(pdfPreviewEntity2);
                        qo.m mVar = new qo.m();
                        mVar.f29408e = true;
                        mVar.f29410g = pdfPreviewEntity2;
                        wk.b.b().e(mVar);
                    }
                    k0.f(0, readerSearchActivity, pdfPreviewEntity.getPath(), ea.a.p("IVJ4TT1TNkEaQ0g=", "Jrg7bszP"), pdfPreviewEntity, new c1(readerSearchActivity), false);
                    readerSearchActivity.X = pdfPreviewEntity.getPath();
                }
            }
        }
    }
}
