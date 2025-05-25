package com.facebook.ads.redexgen.X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: com.facebook.ads.redexgen.X.8L  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C8L implements SensorEventListener {
    public C8L() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        C8N.A0D(sensorEvent.values);
        C8N.A04();
    }
}
