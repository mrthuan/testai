package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import android.view.View;
import kotlin.Result;
import kotlinx.coroutines.flow.StateFlowImpl;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity;
import pdf.pdfreader.viewer.editor.free.utils.event.ScanEventCenter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25852a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ OperatePDFWatcherActivity f25853b;

    public /* synthetic */ u(OperatePDFWatcherActivity operatePDFWatcherActivity, int i10) {
        this.f25852a = i10;
        this.f25853b = operatePDFWatcherActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f25852a;
        OperatePDFWatcherActivity operatePDFWatcherActivity = this.f25853b;
        switch (i10) {
            case 0:
                ImageAdjustActivity imageAdjustActivity = (ImageAdjustActivity) operatePDFWatcherActivity;
                ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("O2hYc10w", "MzGWZpig"));
                int currentItem = imageAdjustActivity.y2().f695z.getCurrentItem();
                if (currentItem != 0) {
                    try {
                        imageAdjustActivity.K2(currentItem - 1);
                        Result.m13constructorimpl(tf.d.f30009a);
                        return;
                    } catch (Throwable th2) {
                        Result.m13constructorimpl(androidx.activity.s.v(th2));
                        return;
                    }
                }
                return;
            case 1:
                ImageAdjustActivity imageAdjustActivity2 = (ImageAdjustActivity) operatePDFWatcherActivity;
                ImageAdjustActivity.a aVar2 = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity2, ea.a.p("R2gic1cw", "QL0WJplX"));
                tn.a.b(ScanEventCenter.a(), ea.a.p("KWlddBxy", "tJXW8cmO"), ea.a.p("VWkndBZyPXUcc1V2DF81bC1jaw==", "SDNswr55"));
                imageAdjustActivity2.w2();
                on.b C2 = imageAdjustActivity2.C2();
                Boolean bool = C2.f23513f;
                if (bool != null) {
                    C2.f23514g = bool.booleanValue();
                }
                C2.f23513f = null;
                imageAdjustActivity2.C2().m();
                imageAdjustActivity2.C2().h();
                return;
            case 2:
                ImageAdjustActivity imageAdjustActivity3 = (ImageAdjustActivity) operatePDFWatcherActivity;
                ImageAdjustActivity.a aVar3 = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity3, ea.a.p("Fmhec30w", "w4b7Yq7V"));
                tf.c cVar = ScanEventCenter.f28674a;
                tn.a.d(ScanEventCenter.a(), ea.a.p("UHIkcA==", "ndS7Ns4a"), ea.a.p("N3JZcCxzB3YtXwVsXWNr", "uHT6sfzW"), imageAdjustActivity3.b2(), false);
                ImageAdjustFiltersAdapter imageAdjustFiltersAdapter = imageAdjustActivity3.f25743b0;
                if (imageAdjustFiltersAdapter != null) {
                    imageAdjustFiltersAdapter.i();
                }
                imageAdjustActivity3.C2().e();
                imageAdjustActivity3.C2().h();
                imageAdjustActivity3.H.post(new y(imageAdjustActivity3, 1));
                return;
            default:
                CameraActivity cameraActivity = (CameraActivity) operatePDFWatcherActivity;
                int i11 = CameraActivity.H0;
                kotlin.jvm.internal.g.e(cameraActivity, ea.a.p("O2hYc10w", "W1vjgGG3"));
                cameraActivity.f25723o0 = true;
                StateFlowImpl stateFlowImpl = cameraActivity.s2().f23509d;
                stateFlowImpl.setValue(mn.a.a((mn.a) stateFlowImpl.b(), false, !((mn.a) stateFlowImpl.b()).f22146b, false, false, false, 29));
                return;
        }
    }
}
