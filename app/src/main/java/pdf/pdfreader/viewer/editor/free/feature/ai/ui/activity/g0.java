package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.os.Handler;
import android.view.View;
import lib.zj.office.wp.control.Word;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryDetailActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24586a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ jl.a f24587b;

    public /* synthetic */ g0(jl.a aVar, int i10) {
        this.f24586a = i10;
        this.f24587b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        int i10 = this.f24586a;
        jl.a aVar = this.f24587b;
        switch (i10) {
            case 0:
                AIHistoryDetailActivity aIHistoryDetailActivity = (AIHistoryDetailActivity) aVar;
                AIHistoryDetailActivity.a aVar2 = AIHistoryDetailActivity.A;
                kotlin.jvm.internal.g.e(aIHistoryDetailActivity, ea.a.p("O2hYc10w", "ewRpJd4A"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aIHistoryDetailActivity)) {
                    aIHistoryDetailActivity.f24407x = System.currentTimeMillis();
                    aIHistoryDetailActivity.a2().f805g.c.setVisibility(0);
                    return;
                }
                return;
            case 1:
                OfficeAIReaderActivity officeAIReaderActivity = (OfficeAIReaderActivity) aVar;
                String str = OfficeAIReaderActivity.K0;
                kotlin.jvm.internal.g.e(officeAIReaderActivity, ea.a.p("O2hYc10w", "UMOou8yL"));
                officeAIReaderActivity.u2(true);
                lib.zj.office.system.p pVar = officeAIReaderActivity.Y;
                if (pVar != null && (view = pVar.getView()) != null && (view instanceof Word)) {
                    Word word = (Word) view;
                    if (!word.T) {
                        Handler handler = word.I;
                        Word.b bVar = word.L;
                        handler.removeCallbacks(bVar);
                        handler.postDelayed(bVar, 2000L);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ReaderAIPreviewActivity) aVar).t2();
                return;
        }
    }
}
