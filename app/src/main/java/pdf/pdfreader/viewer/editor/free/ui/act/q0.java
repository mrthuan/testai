package pdf.pdfreader.viewer.editor.free.ui.act;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.bean.DataBridge;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptContainer;
import pdf.pdfreader.viewer.editor.free.merge.MergePdfData;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements DecryptAndCopyUIHelper.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26970a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f26971b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q0(int i10, Object obj, Object obj2) {
        this.f26970a = i10;
        this.f26971b = obj;
        this.c = obj2;
    }

    @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.b
    public final void a(List list) {
        int i10 = this.f26970a;
        Object obj = this.c;
        Object obj2 = this.f26971b;
        switch (i10) {
            case 0:
                ReaderSearchActivity readerSearchActivity = (ReaderSearchActivity) obj2;
                ArrayList arrayList = (ArrayList) obj;
                String str = ReaderSearchActivity.f26794c0;
                readerSearchActivity.getClass();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    DecryptContainer decryptContainer = (DecryptContainer) it.next();
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            MergePdfData mergePdfData = (MergePdfData) it2.next();
                            if (mergePdfData.getId() == decryptContainer.getPdfPreviewEntity().getId()) {
                                mergePdfData.setCopyPath(decryptContainer.getNewPath());
                            }
                        }
                    }
                }
                tn.a.b(readerSearchActivity, ea.a.p("FWUIZ2U=", "OGxzklNq"), ea.a.p("LGhebwplUWk2ZRVzEGEaY11fCm8rZQ==", "Dp8vpviW"));
                DataBridge.a().addAll(arrayList);
                readerSearchActivity.e2();
                readerSearchActivity.finish();
                return;
            default:
                pdf.pdfreader.viewer.editor.free.ui.frag.j jVar = (pdf.pdfreader.viewer.editor.free.ui.frag.j) obj2;
                Context context = (Context) obj;
                jVar.getClass();
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(pdf.pdfreader.viewer.editor.free.utils.t0.t0((DecryptContainer) it3.next()));
                }
                pdf.pdfreader.viewer.editor.free.ui.frag.n nVar = jVar.f28044b;
                tn.a.d(nVar.r(), ea.a.p("ImVDZ2U=", "gsiwDdIG"), ea.a.p("UGgkbwBlBGkeZWtzAW93", "bgAaaj0F"), ea.a.p("NmkZZQ==", "9sPuCtXo"), false);
                ReaderMergeChooserActivity.a aVar = ReaderMergeChooserActivity.f26759n0;
                String p10 = ea.a.p("VWknZQ==", "LX2GV28a");
                aVar.getClass();
                ReaderMergeChooserActivity.a.b(context, p10, arrayList2);
                pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(nVar.i());
                return;
        }
    }
}
