package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24580a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ jl.a f24581b;

    public /* synthetic */ f0(jl.a aVar, int i10) {
        this.f24580a = i10;
        this.f24581b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f24580a;
        jl.a aVar = this.f24581b;
        switch (i10) {
            case 0:
                AIHistoryActivity aIHistoryActivity = (AIHistoryActivity) aVar;
                int i11 = AIHistoryActivity.A;
                kotlin.jvm.internal.g.e(aIHistoryActivity, ea.a.p("O2hYc10w", "ppRVVVjb"));
                pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.c cVar = aIHistoryActivity.f24398v;
                if (cVar != null) {
                    ArrayList arrayList = cVar.f24702d;
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        ArrayList arrayList2 = cVar.f24694h;
                        if (arrayList2.size() == size) {
                            arrayList2.clear();
                        } else {
                            arrayList2.clear();
                            arrayList2.addAll(arrayList);
                        }
                        cg.l<? super Integer, tf.d> lVar = cVar.f24695i;
                        if (lVar != null) {
                            lVar.invoke(Integer.valueOf(arrayList2.size()));
                        }
                        cVar.notifyDataSetChanged();
                    }
                }
                tn.a.b(aIHistoryActivity, ea.a.p("Amk=", "XvcP4HV1"), ea.a.p("M2kKaSd0AXIxXwBpWGUkZVRlDWElbGljGGkSaw==", "LHRbTnhL"));
                return;
            case 1:
                ImageMindPreviewActivity imageMindPreviewActivity = (ImageMindPreviewActivity) aVar;
                String str = ImageMindPreviewActivity.f24429v;
                kotlin.jvm.internal.g.e(imageMindPreviewActivity, ea.a.p("R2gic1cw", "UX8tB80q"));
                imageMindPreviewActivity.finish();
                return;
            case 2:
                OfficeAIReaderActivity officeAIReaderActivity = (OfficeAIReaderActivity) aVar;
                String str2 = OfficeAIReaderActivity.K0;
                kotlin.jvm.internal.g.e(officeAIReaderActivity, ea.a.p("O2hYc10w", "tCFyywTG"));
                officeAIReaderActivity.onBackPressed();
                return;
            default:
                ExecutorService executorService = ReaderAIPreviewActivity.f24476z1;
                ((ReaderAIPreviewActivity) aVar).t2();
                return;
        }
    }
}
