package tl;

import android.hardware.Camera;
import java.util.List;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: ZoomController.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public float f30059a = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    public Float f30060b;
    public Float c;

    public final void a(Camera camera, float f10) {
        float f11 = this.f30059a + f10;
        try {
            if (this.f30060b == null || this.c == null) {
                b(camera);
            }
            Float f12 = this.f30060b;
            if (f12 != null) {
                float floatValue = f12.floatValue();
                Float f13 = this.c;
                if (f13 != null) {
                    float floatValue2 = f13.floatValue();
                    if (f11 > floatValue) {
                        f11 = floatValue;
                    } else if (f11 < floatValue2) {
                        f11 = floatValue2;
                    }
                    this.f30059a = f11;
                    Camera.Parameters parameters = camera.getParameters();
                    if (parameters.isZoomSupported()) {
                        int maxZoom = parameters.getMaxZoom();
                        int o02 = t0.o0(((this.f30059a - floatValue2) / (floatValue - floatValue2)) * maxZoom);
                        if (o02 >= maxZoom) {
                            o02 = maxZoom - 1;
                        }
                        if (o02 < 0) {
                            o02 = 0;
                        }
                        parameters.setZoom(o02);
                        camera.setParameters(parameters);
                    }
                }
            }
        } catch (Throwable unused) {
            ea.a.p("CmMHenI=", "eWptPMpq");
        }
    }

    public final void b(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        if (parameters.isZoomSupported()) {
            List<Integer> zoomRatios = parameters.getZoomRatios();
            g.d(zoomRatios, ea.a.p("LGFcZQthZ2EoYSdlAWUacxt6AW8oUgR0Wm9z", "VQVI3uWG"));
            if (!zoomRatios.isEmpty()) {
                List<Integer> zoomRatios2 = parameters.getZoomRatios();
                g.d(zoomRatios2, ea.a.p("UGEmZQFhMmEAYVllHWUkc2p6XW8rUiJ0HG9z", "ufNTalMX"));
                this.c = Float.valueOf(((Number) m.r0(zoomRatios2)).floatValue() / 100.0f);
                List<Integer> zoomRatios3 = parameters.getZoomRatios();
                g.d(zoomRatios3, ea.a.p("UGEmZQFhMmEAYVllHWUkc2p6XW8rUiJ0M29z", "Zcr0tiEN"));
                this.f30060b = Float.valueOf(((Number) m.x0(zoomRatios3)).floatValue() / 100.0f);
            }
        }
    }
}
