package pdf.pdfreader.viewer.editor.free.ui.act;

import android.content.Context;
import java.util.Iterator;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.widget.act.ReaderEditSearchActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements androidx.lifecycle.x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26964a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ jl.a f26965b;

    public /* synthetic */ o0(jl.a aVar, int i10) {
        this.f26964a = i10;
        this.f26965b = aVar;
    }

    @Override // androidx.lifecycle.x
    public final void m(Object obj) {
        int i10 = this.f26964a;
        jl.a aVar = this.f26965b;
        switch (i10) {
            case 0:
                ReaderSearchActivity readerSearchActivity = (ReaderSearchActivity) aVar;
                nl.a aVar2 = (nl.a) obj;
                if (aVar2 != null) {
                    Iterator<PdfPreviewEntity> it = readerSearchActivity.G.iterator();
                    while (it.hasNext()) {
                        PdfPreviewEntity next = it.next();
                        if (next.getId() == aVar2.f22579a) {
                            next.setOtherStrTwo(aVar2.c);
                            return;
                        }
                    }
                    return;
                }
                String str = ReaderSearchActivity.f26794c0;
                readerSearchActivity.getClass();
                return;
            default:
                ReaderEditSearchActivity readerEditSearchActivity = (ReaderEditSearchActivity) aVar;
                no.d dVar = (no.d) obj;
                String str2 = ReaderEditSearchActivity.f28303b0;
                if (dVar != null) {
                    Context context = readerEditSearchActivity.f19296j;
                    if (context != null) {
                        pdf.pdfreader.viewer.editor.free.utils.v.K(readerEditSearchActivity, context, dVar.f22614a, dVar.f22615b);
                        ReaderPdfApplication.k().i(null);
                        return;
                    }
                    return;
                }
                readerEditSearchActivity.getClass();
                return;
        }
    }
}
