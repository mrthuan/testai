package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzduu extends zzfrx {
    private final SensorManager zza;
    private final Sensor zzb;
    private float zzc;
    private Float zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzdut zzi;
    private boolean zzj;

    public zzduu(Context context) {
        super("FlickDetector", "ads");
        this.zzc = 0.0f;
        this.zzd = Float.valueOf(0.0f);
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        this.zze = System.currentTimeMillis();
        this.zzf = 0;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
        this.zzj = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.zza = sensorManager;
        if (sensorManager != null) {
            this.zzb = sensorManager.getDefaultSensor(4);
        } else {
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrx
    public final void zza(SensorEvent sensorEvent) {
        zzbbn zzbbnVar = zzbbw.zzij;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.zze;
            zzbbn zzbbnVar2 = zzbbw.zzil;
            zzbbu zzbbuVar = zzbaVar.c;
            if (j10 + ((Integer) zzbbuVar.zza(zzbbnVar2)).intValue() < currentTimeMillis) {
                this.zzf = 0;
                this.zze = currentTimeMillis;
                this.zzg = false;
                this.zzh = false;
                this.zzc = this.zzd.floatValue();
            }
            Float valueOf = Float.valueOf(this.zzd.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.zzd = valueOf;
            float floatValue = valueOf.floatValue();
            float f10 = this.zzc;
            zzbbn zzbbnVar3 = zzbbw.zzik;
            if (floatValue > ((Float) zzbbuVar.zza(zzbbnVar3)).floatValue() + f10) {
                this.zzc = this.zzd.floatValue();
                this.zzh = true;
            } else if (this.zzd.floatValue() < this.zzc - ((Float) zzbbuVar.zza(zzbbnVar3)).floatValue()) {
                this.zzc = this.zzd.floatValue();
                this.zzg = true;
            }
            if (this.zzd.isInfinite()) {
                this.zzd = Float.valueOf(0.0f);
                this.zzc = 0.0f;
            }
            if (this.zzg && this.zzh) {
                com.google.android.gms.ads.internal.util.zze.h("Flick detected.");
                this.zze = currentTimeMillis;
                int i10 = this.zzf + 1;
                this.zzf = i10;
                this.zzg = false;
                this.zzh = false;
                zzdut zzdutVar = this.zzi;
                if (zzdutVar != null && i10 == ((Integer) zzbbuVar.zza(zzbbw.zzim)).intValue()) {
                    zzdvi zzdviVar = (zzdvi) zzdutVar;
                    zzdviVar.zzh(new zzdvg(zzdviVar), zzdvh.GESTURE);
                }
            }
        }
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                sensorManager.unregisterListener(this, sensor);
                this.zzj = false;
                com.google.android.gms.ads.internal.util.zze.h("Stopped listening for flick gestures.");
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzij)).booleanValue()) {
                return;
            }
            if (!this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                sensorManager.registerListener(this, sensor, 2);
                this.zzj = true;
                com.google.android.gms.ads.internal.util.zze.h("Listening for flick gestures.");
            }
            if (this.zza != null && this.zzb != null) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzm.e("Flick detection failed to initialize. Failed to obtain gyroscope.");
        }
    }

    public final void zzd(zzdut zzdutVar) {
        this.zzi = zzdutVar;
    }
}
