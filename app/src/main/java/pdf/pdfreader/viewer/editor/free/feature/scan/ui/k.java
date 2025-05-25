package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import pdf.pdfreader.viewer.editor.free.camera.camera.CameraHelper;
import pdf.pdfreader.viewer.editor.free.camera.widget.CameraView;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25825a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ OperatePDFWatcherActivity f25826b;

    public /* synthetic */ k(OperatePDFWatcherActivity operatePDFWatcherActivity, int i10) {
        this.f25825a = i10;
        this.f25826b = operatePDFWatcherActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f25825a;
        OperatePDFWatcherActivity operatePDFWatcherActivity = this.f25826b;
        switch (i10) {
            case 0:
                CameraActivity cameraActivity = (CameraActivity) operatePDFWatcherActivity;
                int i11 = CameraActivity.H0;
                kotlin.jvm.internal.g.e(cameraActivity, ea.a.p("BWgRc28w", "uUqxKz66"));
                CameraHelper r22 = cameraActivity.r2();
                CameraView cameraView = cameraActivity.q2().f910h;
                kotlin.jvm.internal.g.d(cameraView, ea.a.p("NGkjZFtuFC4rYQtlRmEBaV13", "dWVM2sK9"));
                r22.n(cameraView, cameraActivity.q2().M.getWidth(), cameraActivity.q2().f912j.getHeight(), cameraActivity.q2().M.getWidth(), cameraActivity.q2().M.getHeight());
                return;
            default:
                ImageAdjustActivity imageAdjustActivity = (ImageAdjustActivity) operatePDFWatcherActivity;
                ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("MWg4c1Uw", "IkEQquAs"));
                imageAdjustActivity.s2();
                return;
        }
    }
}
