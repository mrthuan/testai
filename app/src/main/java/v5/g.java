package v5;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: ViewIndexingTrigger.kt */
/* loaded from: classes.dex */
public final class g implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    public a f30680a;

    /* compiled from: ViewIndexingTrigger.kt */
    /* loaded from: classes.dex */
    public interface a {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
        if (k6.a.b(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.g.e(sensor, "sensor");
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        if (k6.a.b(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.g.e(event, "event");
            a aVar = this.f30680a;
            if (aVar != null) {
                float[] fArr = event.values;
                double d10 = fArr[0] / 9.80665f;
                double d11 = fArr[1] / 9.80665f;
                double d12 = fArr[2] / 9.80665f;
                if (Math.sqrt((d12 * d12) + (d11 * d11) + (d10 * d10)) > 2.3d) {
                    ((androidx.privacysandbox.ads.adservices.java.internal.a) aVar).g();
                }
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }
}
