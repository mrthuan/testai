package qb;

import am.x2;
import androidx.appcompat.widget.AppCompatTextView;
import com.airbnb.lottie.LottieAnimationView;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.inmobi.media.A4;
import com.inmobi.media.Y1;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.widget.PreviewCreateEditGuideView;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.g2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29192a = 2;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f29193b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f29194d;

    public /* synthetic */ f0(String str, BaseOperatePDFActivity baseOperatePDFActivity, boolean z10) {
        this.f29194d = baseOperatePDFActivity;
        this.f29193b = z10;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f29192a;
        boolean z10 = this.f29193b;
        Object obj = this.f29194d;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                Y1.c((String) obj2, z10, (A4) obj);
                return;
            case 1:
                PreviewCreateEditGuideView previewCreateEditGuideView = (PreviewCreateEditGuideView) obj2;
                x2 x2Var = (x2) obj;
                int i11 = PreviewCreateEditGuideView.f25425s;
                kotlin.jvm.internal.g.e(previewCreateEditGuideView, ea.a.p("O2hYc10w", "TINXWFej"));
                kotlin.jvm.internal.g.e(x2Var, ea.a.p("a3RZaQpfRXVu", "3Ttx3Ns2"));
                if (!z10) {
                    previewCreateEditGuideView.postDelayed(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.b(previewCreateEditGuideView, 2), TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
                }
                previewCreateEditGuideView.setVisibility(0);
                LottieAnimationView lottieAnimationView = x2Var.c;
                lottieAnimationView.setFrame(0);
                lottieAnimationView.setRepeatCount(0);
                lottieAnimationView.j();
                AppCompatTextView appCompatTextView = x2Var.f1653b;
                appCompatTextView.setAlpha(0.0f);
                appCompatTextView.post(new b7.g(x2Var, 25));
                return;
            case 2:
                BaseOperatePDFActivity.l2((String) obj2, (BaseOperatePDFActivity) obj, z10);
                return;
            default:
                int i12 = g2.N;
                ((g2) obj).c((String) obj2, z10);
                return;
        }
    }

    public /* synthetic */ f0(String str, boolean z10, A4 a42) {
        this.c = str;
        this.f29193b = z10;
        this.f29194d = a42;
    }

    public /* synthetic */ f0(g2 g2Var, String str, boolean z10) {
        this.f29194d = g2Var;
        this.c = str;
        this.f29193b = z10;
    }

    public /* synthetic */ f0(boolean z10, PreviewCreateEditGuideView previewCreateEditGuideView, x2 x2Var) {
        this.f29193b = z10;
        this.c = previewCreateEditGuideView;
        this.f29194d = x2Var;
    }
}
