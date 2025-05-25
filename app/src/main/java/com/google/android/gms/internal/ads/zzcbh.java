package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcbh extends zzfrx {
    private final SensorManager zza;
    private final Object zzb;
    private final Display zzc;
    private final float[] zzd;
    private final float[] zze;
    private float[] zzf;
    private Handler zzg;
    private zzcbg zzh;

    public zzcbh(Context context) {
        super("OrientationMonitor", "ads");
        this.zza = (SensorManager) context.getSystemService("sensor");
        this.zzc = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.zzd = new float[9];
        this.zze = new float[9];
        this.zzb = new Object();
    }

    @Override // com.google.android.gms.internal.ads.zzfrx
    public final void zza(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.zzb) {
                if (this.zzf == null) {
                    this.zzf = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.zzd, fArr);
            int rotation = this.zzc.getRotation();
            if (rotation != 1) {
                if (rotation != 2) {
                    if (rotation != 3) {
                        System.arraycopy(this.zzd, 0, this.zze, 0, 9);
                    } else {
                        SensorManager.remapCoordinateSystem(this.zzd, ShapeTypes.DOUBLE_WAVE, 1, this.zze);
                    }
                } else {
                    SensorManager.remapCoordinateSystem(this.zzd, 129, ShapeTypes.DOUBLE_WAVE, this.zze);
                }
            } else {
                SensorManager.remapCoordinateSystem(this.zzd, 2, 129, this.zze);
            }
            float[] fArr2 = this.zze;
            float f10 = fArr2[1];
            fArr2[1] = fArr2[3];
            fArr2[3] = f10;
            float f11 = fArr2[2];
            fArr2[2] = fArr2[6];
            fArr2[6] = f11;
            float f12 = fArr2[5];
            fArr2[5] = fArr2[7];
            fArr2[7] = f12;
            synchronized (this.zzb) {
                System.arraycopy(this.zze, 0, this.zzf, 0, 9);
            }
            zzcbg zzcbgVar = this.zzh;
            if (zzcbgVar != null) {
                zzcbgVar.zza();
            }
        }
    }

    public final void zzb(zzcbg zzcbgVar) {
        this.zzh = zzcbgVar;
    }

    public final void zzc() {
        if (this.zzg == null) {
            Sensor defaultSensor = this.zza.getDefaultSensor(11);
            if (defaultSensor == null) {
                com.google.android.gms.ads.internal.util.client.zzm.c("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            zzfru zzfruVar = new zzfru(handlerThread.getLooper());
            this.zzg = zzfruVar;
            if (!this.zza.registerListener(this, defaultSensor, 0, zzfruVar)) {
                com.google.android.gms.ads.internal.util.client.zzm.c("SensorManager.registerListener failed.");
                zzd();
            }
        }
    }

    public final void zzd() {
        if (this.zzg == null) {
            return;
        }
        this.zza.unregisterListener(this);
        this.zzg.post(new zzcbf(this));
        this.zzg = null;
    }

    public final boolean zze(float[] fArr) {
        synchronized (this.zzb) {
            float[] fArr2 = this.zzf;
            if (fArr2 == null) {
                return false;
            }
            System.arraycopy(fArr2, 0, fArr, 0, 9);
            return true;
        }
    }
}
