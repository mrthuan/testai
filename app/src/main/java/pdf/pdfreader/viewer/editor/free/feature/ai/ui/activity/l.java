package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import jm.c;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24616a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ jl.a f24617b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l(jl.a aVar, Object obj, int i10) {
        this.f24616a = i10;
        this.f24617b = aVar;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f24616a;
        Object obj = this.c;
        jl.a aVar = this.f24617b;
        switch (i10) {
            case 0:
                AIChatActivity aIChatActivity = (AIChatActivity) aVar;
                km.a aVar2 = (km.a) obj;
                kotlin.jvm.internal.g.e(aIChatActivity, ea.a.p("O2hYc10w", "LFF6WFGP"));
                kotlin.jvm.internal.g.e(aVar2, ea.a.p("F2k_ZW0=", "ifR0guHq"));
                if (!aIChatActivity.isFinishing()) {
                    ArrayList arrayList = jm.c.f19315a;
                    c.a.e(aVar2);
                    return;
                }
                return;
            case 1:
                AIChatActivity aIChatActivity2 = (AIChatActivity) aVar;
                km.a aVar3 = (km.a) obj;
                kotlin.jvm.internal.g.e(aIChatActivity2, ea.a.p("AWhacxMw", "ECu374mc"));
                kotlin.jvm.internal.g.e(aVar3, ea.a.p("RnNdbhVDP2E8SQhmbw==", "UUb8qWB7"));
                if (!aIChatActivity2.isFinishing()) {
                    ArrayList arrayList2 = jm.c.f19315a;
                    c.a.c(aVar3);
                    return;
                }
                return;
            default:
                ReaderAIPreviewActivity readerAIPreviewActivity = (ReaderAIPreviewActivity) aVar;
                ExecutorService executorService = ReaderAIPreviewActivity.f24476z1;
                readerAIPreviewActivity.getClass();
                PdfPreviewEntity d10 = bm.c.b(readerAIPreviewActivity).d((String) obj);
                if (d10 != null) {
                    d10.setRecent(1);
                    d10.setRecentDate(System.currentTimeMillis());
                    FileRepository.I(d10);
                    bm.c.b(readerAIPreviewActivity).i(d10);
                    return;
                }
                return;
        }
    }
}
