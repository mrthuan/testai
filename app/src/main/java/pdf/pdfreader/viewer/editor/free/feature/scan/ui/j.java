package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import android.util.Size;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.state.CameraMode;
import pdf.pdfreader.viewer.editor.free.feature.scan.widget.CameraGridView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25821a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CameraActivity f25822b;

    public /* synthetic */ j(CameraActivity cameraActivity, int i10) {
        this.f25821a = i10;
        this.f25822b = cameraActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f25821a;
        CameraActivity cameraActivity = this.f25822b;
        switch (i10) {
            case 0:
                int i11 = CameraActivity.H0;
                kotlin.jvm.internal.g.e(cameraActivity, ea.a.p("O2hYc10w", "k633OMfB"));
                float w22 = cameraActivity.w2();
                cameraActivity.q2().P.setTranslationX(w22);
                cameraActivity.q2().O.setTranslationX(w22);
                cameraActivity.q2().O.setTextAppearance(R.style.font_medium);
                cameraActivity.q2().P.setTextAppearance(R.style.font_regular);
                cameraActivity.j2(CameraMode.Ocr);
                return;
            default:
                int i12 = CameraActivity.H0;
                kotlin.jvm.internal.g.e(cameraActivity, ea.a.p("O2hYc10w", "oUwwZ2rN"));
                if (cameraActivity.q2().f906d.getVisibility() == 0 || cameraActivity.q2().f906d.getVisibility() == 4) {
                    try {
                        ea.a.p("bkNU", "NT7uIkxn");
                        ea.a.p("AjJ7OE0-XD5MPgo-Vz5oPnpzV3RmZzFpUSBEaQpl", "57poAxew");
                        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                        if (cameraActivity.Q != null) {
                            CameraGridView cameraGridView = cameraActivity.q2().f906d;
                            Size size = cameraActivity.Q;
                            kotlin.jvm.internal.g.b(size);
                            cameraGridView.setCameraPreviewSize(size);
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        ea.a.p("EUNU", "NCHiI3lM");
                        e10.getMessage();
                        String str2 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                        return;
                    }
                }
                return;
        }
    }
}
