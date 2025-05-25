package com.bytedance.sdk.openadsdk.hpZ;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import java.lang.ref.WeakReference;

/* compiled from: SensorHub.java */
/* loaded from: classes.dex */
public class Gm {
    public static WeakReference<Qhi> Qhi;
    protected static final float[] cJ = new float[3];

    /* renamed from: ac  reason: collision with root package name */
    protected static final float[] f9310ac = new float[3];
    protected static final float[] CJ = new float[9];

    /* renamed from: fl  reason: collision with root package name */
    protected static final float[] f9311fl = new float[3];

    public static void CJ(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener != null && context != null) {
            try {
                WeakReference<Qhi> weakReference = Qhi;
                if (weakReference != null) {
                    weakReference.get();
                }
            } catch (Throwable th2) {
                Sf.Qhi("SensorHub", "startListenRotationVector err", th2);
            }
        }
    }

    public static void Qhi(Context context, SensorEventListener sensorEventListener) {
    }

    public static void ac(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener != null && context != null) {
            try {
                WeakReference<Qhi> weakReference = Qhi;
                if (weakReference != null) {
                    weakReference.get();
                }
            } catch (Throwable th2) {
                Sf.Qhi("SensorHub", "startListenLinearAcceleration error", th2);
            }
        }
    }

    public static void cJ(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener != null && context != null) {
            try {
                WeakReference<Qhi> weakReference = Qhi;
                if (weakReference != null) {
                    weakReference.get();
                }
            } catch (Throwable th2) {
                Sf.Qhi("SensorHub", "startListenGyroscope error", th2);
            }
        }
    }

    public static void Qhi(Qhi qhi) {
        Qhi = new WeakReference<>(qhi);
    }

    public static void Qhi(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<Qhi> weakReference = Qhi;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            Sf.Qhi("SensorHub", "startListenAccelerometer error", th2);
        }
    }

    public static void Qhi(Context context, long j10) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(j10);
    }
}
