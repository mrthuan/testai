package pdf.pdfreader.viewer.editor.free.ui.act;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements androidx.lifecycle.x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27071a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderHomeActivity f27072b;

    public /* synthetic */ u(ReaderHomeActivity readerHomeActivity, int i10) {
        this.f27071a = i10;
        this.f27072b = readerHomeActivity;
    }

    @Override // androidx.lifecycle.x
    public final void m(Object obj) {
        int i10 = this.f27071a;
        ReaderHomeActivity readerHomeActivity = this.f27072b;
        switch (i10) {
            case 0:
                no.d dVar = (no.d) obj;
                String str = ReaderHomeActivity.Y1;
                if (dVar != null) {
                    Context context = readerHomeActivity.f19296j;
                    if (context != null) {
                        pdf.pdfreader.viewer.editor.free.utils.v.K(readerHomeActivity, context, dVar.f22614a, dVar.f22615b);
                        ReaderPdfApplication.k().i(null);
                        return;
                    }
                    return;
                }
                readerHomeActivity.getClass();
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                String str2 = ReaderHomeActivity.Y1;
                readerHomeActivity.getClass();
                if (arrayList != null && !arrayList.isEmpty()) {
                    if (!readerHomeActivity.U.isEmpty()) {
                        HashSet hashSet = new HashSet();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            hashSet.add(((PdfPreviewEntity) it.next()).getPath());
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<PdfPreviewEntity> it2 = readerHomeActivity.U.iterator();
                        while (it2.hasNext()) {
                            PdfPreviewEntity next = it2.next();
                            if (hashSet.contains(next.getPath())) {
                                arrayList2.add(next);
                                FileRepository.f24155a.getClass();
                                FileRepository.k().execute(new androidx.activity.b(next, 25));
                            }
                        }
                        readerHomeActivity.U.removeAll(arrayList2);
                        pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = readerHomeActivity.M;
                        if (aVar != null) {
                            aVar.J0();
                        }
                    }
                    wn.b.f31386a.j(null);
                    return;
                }
                return;
        }
    }
}
