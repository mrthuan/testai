package pdf.pdfreader.viewer.editor.free.ui.act;

import android.view.View;
import com.inmobi.commons.core.configs.TelemetryConfig;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27086a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f27087b;

    public /* synthetic */ y(View.OnClickListener onClickListener, int i10) {
        this.f27086a = i10;
        this.f27087b = onClickListener;
    }

    @Override // cg.a
    public final Object invoke() {
        int i10 = this.f27086a;
        View.OnClickListener onClickListener = this.f27087b;
        switch (i10) {
            case 0:
                ReaderHomeActivity readerHomeActivity = (ReaderHomeActivity) onClickListener;
                if (readerHomeActivity.f26704y1 != 3) {
                    wm.a.c.getClass();
                    if (pdf.pdfreader.viewer.editor.free.utils.q0.g(readerHomeActivity, 86, ea.a.p("JnNucxFvQF8ybydlKnAMZmpjHGUkdApyFmcaaRRlbGkhXwA3Mw==", "tFuCIop3"))) {
                        readerHomeActivity.f26706z0.setVisibility(0);
                        pdf.pdfreader.viewer.editor.free.utils.q0.w(readerHomeActivity, ea.a.p("JnNucxFvQF8ybydlKnAMZmpjHGUkdApyEWcRaRRlM2khXwA3Mw==", "3D6dNdpl"), false);
                        pdf.pdfreader.viewer.editor.free.utils.g1<ReaderHomeActivity> g1Var = readerHomeActivity.N;
                        ReaderHomeActivity.a aVar = readerHomeActivity.q1;
                        g1Var.removeCallbacks(aVar);
                        readerHomeActivity.N.postDelayed(aVar, TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
                        readerHomeActivity.f26703y0.v();
                        return Boolean.TRUE;
                    }
                }
                return Boolean.FALSE;
            default:
                ((pdf.pdfreader.viewer.editor.free.ui.dialog.w0) onClickListener).f27788f.K = true;
                return null;
        }
    }
}
