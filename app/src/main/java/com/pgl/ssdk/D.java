package com.pgl.ssdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SDKSensorCollector.java */
/* loaded from: classes2.dex */
public final class D implements SensorEventListener {

    /* renamed from: f  reason: collision with root package name */
    private static D f15752f;

    /* renamed from: a  reason: collision with root package name */
    private SensorManager f15753a;

    /* renamed from: b  reason: collision with root package name */
    private int f15754b;
    private int c = 0;

    /* renamed from: d  reason: collision with root package name */
    private float[] f15755d = new float[3];

    /* renamed from: e  reason: collision with root package name */
    private List<String> f15756e = new ArrayList();

    private D(Context context) {
        this.f15753a = null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            try {
                this.f15753a = (SensorManager) applicationContext.getSystemService("sensor");
            } catch (Throwable unused) {
            }
        }
    }

    private synchronized void c() {
        try {
            SensorManager sensorManager = this.f15753a;
            if (sensorManager != null) {
                int i10 = this.f15754b - 1;
                this.f15754b = i10;
                if (i10 == 0) {
                    sensorManager.unregisterListener(this);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r7.f15753a.registerListener(r7, r3.getDefaultSensor(1), 3) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.D.a():void");
    }

    public synchronized String b() {
        String str = "";
        int size = this.f15756e.size();
        if (size <= 0) {
            return "";
        }
        if (size == 1) {
            return this.f15756e.get(0);
        }
        try {
            List<String> list = this.f15756e;
            int i10 = size - 10;
            if (i10 <= 0) {
                i10 = 0;
            }
            List<String> subList = list.subList(i10, size);
            for (int i11 = 0; i11 < subList.size(); i11++) {
                str = str + subList.get(i11) + "|";
            }
            str = str.substring(0, str.length() - 1);
        } catch (Throwable unused) {
        }
        return str;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        this.f15755d = sensorEvent.values;
        this.c = 1;
    }

    public static D a(Context context) {
        if (f15752f == null) {
            synchronized (D.class) {
                if (f15752f == null) {
                    f15752f = new D(context);
                }
            }
        }
        return f15752f;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
