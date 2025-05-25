package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.state.CameraMode;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25815a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraActivity f25816b;

    public /* synthetic */ i(CameraActivity cameraActivity, int i10) {
        this.f25815a = i10;
        this.f25816b = cameraActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f25815a;
        CameraActivity cameraActivity = this.f25816b;
        switch (i10) {
            case 0:
                int i11 = CameraActivity.H0;
                kotlin.jvm.internal.g.e(cameraActivity, ea.a.p("O2hYc10w", "ez4zm6dE"));
                float x22 = cameraActivity.x2();
                cameraActivity.q2().P.setTranslationX(x22);
                cameraActivity.q2().O.setTranslationX(x22);
                cameraActivity.q2().P.setTextAppearance(R.style.font_medium);
                cameraActivity.q2().O.setTextAppearance(R.style.font_regular);
                cameraActivity.j2(CameraMode.Scan);
                return;
            default:
                int i12 = CameraActivity.H0;
                kotlin.jvm.internal.g.e(cameraActivity, ea.a.p("O2hYc10w", "mf3k3hFl"));
                cameraActivity.f25730v0 = true;
                if (cameraActivity.y2()) {
                    cameraActivity.q2().f908f.setVisibility(0);
                    cameraActivity.q2().f909g.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
