package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import android.view.View;
import java.util.HashSet;
import kotlin.Result;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.utils.event.ScanEventCenter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25842a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ImageAdjustActivity f25843b;

    public /* synthetic */ q(ImageAdjustActivity imageAdjustActivity, int i10) {
        this.f25842a = i10;
        this.f25843b = imageAdjustActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object m13constructorimpl;
        int i10 = this.f25842a;
        ImageAdjustActivity imageAdjustActivity = this.f25843b;
        switch (i10) {
            case 0:
                ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("O2hYc10w", "P1ztBErN"));
                tf.c cVar = ScanEventCenter.f28674a;
                String d22 = imageAdjustActivity.d2();
                HashSet<String> hashSet = ScanEventCenter.f28675b;
                if (!hashSet.contains(ea.a.p("ImE1ZSZkPnU7dDljRm8nX1tsO2Nr", "4BRRGTHL"))) {
                    hashSet.add(ea.a.p("P2FWZRhkXXUpdBVjB28YX1ZsB2Nr", "hO36lUy1"));
                    tn.a.d(ScanEventCenter.a(), ea.a.p("Q2EsZSxhBmoHc3Q=", "1SarDTr2"), ea.a.p("P2FWZRhkXXUpdBVjB28YX1ZsB2Nr", "gQ8ifUjF"), d22, false);
                }
                imageAdjustActivity.E2();
                if (imageAdjustActivity.J != null) {
                    imageAdjustActivity.C2().f();
                    return;
                }
                try {
                    m13constructorimpl = Result.m13constructorimpl(imageAdjustActivity.y2().f675f.inflate());
                } catch (Throwable th2) {
                    m13constructorimpl = Result.m13constructorimpl(androidx.activity.s.v(th2));
                }
                Result.m12boximpl(m13constructorimpl);
                return;
            default:
                ImageAdjustActivity.a aVar2 = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("R2gic1cw", "RTGu8YB5"));
                tf.c cVar2 = ScanEventCenter.f28674a;
                tn.a.d(ScanEventCenter.a(), ea.a.p("UHIkcA==", "4E5HgInM"), ea.a.p("O3I5cBJ1LHMpdgNfV2w-Y2s=", "KNXVMBg7"), imageAdjustActivity.b2(), false);
                imageAdjustActivity.C2().m();
                imageAdjustActivity.C2().h();
                return;
        }
    }
}
