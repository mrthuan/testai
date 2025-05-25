package pdf.pdfreader.viewer.editor.free.office;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import pdf.pdfreader.viewer.editor.free.thumb.adapter.ThumbnailAdapter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26147a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ OfficeReaderActivity f26148b;

    public /* synthetic */ z(OfficeReaderActivity officeReaderActivity, int i10) {
        this.f26147a = i10;
        this.f26148b = officeReaderActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator withEndAction;
        int i10 = this.f26147a;
        OfficeReaderActivity officeReaderActivity = this.f26148b;
        switch (i10) {
            case 0:
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("BWgicxMw", "7vqK7xWZ"));
                String str = OfficeReaderActivity.D2;
                officeReaderActivity.K2();
                officeReaderActivity.f25943l2 = true;
                androidx.activity.s.z0(officeReaderActivity);
                hp.e eVar = (hp.e) officeReaderActivity.f25959r1.getValue();
                Context a10 = eVar.a();
                if (a10 != null) {
                    if (a10.getResources().getConfiguration().orientation == 1) {
                        eVar.b(0);
                        String str2 = OfficeReaderActivity.D2;
                        ea.a.p("R2gic1cw", "yvMQtKX5");
                        pdf.pdfreader.viewer.editor.free.utils.p.t(officeReaderActivity, officeReaderActivity.N0, false, officeReaderActivity.f25965t0);
                        return;
                    }
                    eVar.b(1);
                    String str3 = OfficeReaderActivity.D2;
                    ea.a.p("R2gic1cw", "yvMQtKX5");
                    pdf.pdfreader.viewer.editor.free.utils.p.t(officeReaderActivity, officeReaderActivity.N0, true, officeReaderActivity.f25965t0);
                    return;
                }
                return;
            case 1:
                String str4 = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("O2hYc10w", "rAyk6Ikt"));
                lo.d.b(officeReaderActivity.B1);
                return;
            case 2:
                String str5 = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("O2hYc10w", "wBh2l6XN"));
                View view = officeReaderActivity.f25930h0;
                if (view != null && (animate = view.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(300L)) != null && (withEndAction = duration.withEndAction(new o(officeReaderActivity, 0))) != null) {
                    withEndAction.start();
                    return;
                }
                return;
            case 3:
                String str6 = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("O2hYc10w", "ugfdNjFo"));
                officeReaderActivity.k3();
                return;
            case 4:
                String str7 = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("O2hYc10w", "LOGcIgh1"));
                if (!officeReaderActivity.R2()) {
                    officeReaderActivity.runOnUiThread(new l(officeReaderActivity, 2));
                    return;
                } else {
                    officeReaderActivity.runOnUiThread(new o(officeReaderActivity, 3));
                    return;
                }
            default:
                String str8 = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("P2gAc00w", "F8KiiHgn"));
                ThumbnailAdapter thumbnailAdapter = officeReaderActivity.f25982x1;
                if (thumbnailAdapter != null) {
                    thumbnailAdapter.f26593r = !rg.c.c;
                }
                if (thumbnailAdapter != null) {
                    thumbnailAdapter.notifyDataSetChanged();
                    return;
                }
                return;
        }
    }
}
