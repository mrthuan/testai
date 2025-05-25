package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdwk extends zzfrx {
    private final Context zza;
    private SensorManager zzb;
    private Sensor zzc;
    private long zzd;
    private int zze;
    private zzdwj zzf;
    private boolean zzg;

    public zzdwk(Context context) {
        super("ShakeDetector", "ads");
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfrx
    public final void zza(SensorEvent sensorEvent) {
        zzbbn zzbbnVar = zzbbw.zzie;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = f10 / 9.80665f;
            float f12 = fArr[1] / 9.80665f;
            float f13 = fArr[2] / 9.80665f;
            float f14 = f12 * f12;
            float f15 = f13 * f13;
            zzbbn zzbbnVar2 = zzbbw.zzif;
            zzbbu zzbbuVar = zzbaVar.c;
            if (((float) Math.sqrt(f15 + f14 + (f11 * f11))) >= ((Float) zzbbuVar.zza(zzbbnVar2)).floatValue()) {
                com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (this.zzd + ((Integer) zzbbuVar.zza(zzbbw.zzig)).intValue() <= currentTimeMillis) {
                    if (this.zzd + ((Integer) zzbbuVar.zza(zzbbw.zzih)).intValue() < currentTimeMillis) {
                        this.zze = 0;
                    }
                    com.google.android.gms.ads.internal.util.zze.h("Shake detected.");
                    this.zzd = currentTimeMillis;
                    int i10 = this.zze + 1;
                    this.zze = i10;
                    zzdwj zzdwjVar = this.zzf;
                    if (zzdwjVar != null && i10 == ((Integer) zzbbuVar.zza(zzbbw.zzii)).intValue()) {
                        zzdvi zzdviVar = (zzdvi) zzdwjVar;
                        zzdviVar.zzh(new zzdvf(zzdviVar), zzdvh.GESTURE);
                    }
                }
            }
        }
    }

    public final void zzb() {
        synchronized (this) {
            if (this.zzg) {
                SensorManager sensorManager = this.zzb;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.zzc);
                    com.google.android.gms.ads.internal.util.zze.h("Stopped listening for shake gestures.");
                }
                this.zzg = false;
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            zzbbn zzbbnVar = zzbbw.zzie;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            if (!((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                return;
            }
            if (this.zzb == null) {
                SensorManager sensorManager2 = (SensorManager) this.zza.getSystemService("sensor");
                this.zzb = sensorManager2;
                if (sensorManager2 == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.e("Shake detection failed to initialize. Failed to obtain accelerometer.");
                    return;
                }
                this.zzc = sensorManager2.getDefaultSensor(1);
            }
            if (!this.zzg && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                sensorManager.registerListener(this, sensor, 2);
                com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
                this.zzd = System.currentTimeMillis() - ((Integer) zzbaVar.c.zza(zzbbw.zzig)).intValue();
                this.zzg = true;
                com.google.android.gms.ads.internal.util.zze.h("Listening for shake gestures.");
            }
        }
    }

    public final void zzd(zzdwj zzdwjVar) {
        this.zzf = zzdwjVar;
    }
}
