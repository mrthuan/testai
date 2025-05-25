package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbad {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzazz(this);
    private final Object zzc = new Object();
    private zzbag zzd;
    private Context zze;
    private zzbaj zzf;

    public static /* bridge */ /* synthetic */ void zzh(zzbad zzbadVar) {
        synchronized (zzbadVar.zzc) {
            zzbag zzbagVar = zzbadVar.zzd;
            if (zzbagVar == null) {
                return;
            }
            if (zzbagVar.isConnected() || zzbadVar.zzd.isConnecting()) {
                zzbadVar.zzd.disconnect();
            }
            zzbadVar.zzd = null;
            zzbadVar.zzf = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        synchronized (this.zzc) {
            if (this.zze != null && this.zzd == null) {
                zzbag zzd = zzd(new zzbab(this), new zzbac(this));
                this.zzd = zzd;
                zzd.checkAvailabilityAndConnect();
            }
        }
    }

    public final long zza(zzbah zzbahVar) {
        synchronized (this.zzc) {
            try {
                if (this.zzf == null) {
                    return -2L;
                }
                if (this.zzd.zzp()) {
                    try {
                        return this.zzf.zze(zzbahVar);
                    } catch (RemoteException unused) {
                        com.google.android.gms.ads.internal.util.client.zzm.g(6);
                    }
                }
                return -2L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzbae zzb(zzbah zzbahVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzbae();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzg(zzbahVar);
                }
                return this.zzf.zzf(zzbahVar);
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                return new zzbae();
            }
        }
    }

    public final synchronized zzbag zzd(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzbag(this.zze, com.google.android.gms.ads.internal.zzu.B.f10568r.a(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    public final void zzi(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            try {
                if (this.zze != null) {
                    return;
                }
                this.zze = context.getApplicationContext();
                zzbbn zzbbnVar = zzbbw.zzdM;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
                if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                    zzl();
                } else {
                    if (((Boolean) zzbaVar.c.zza(zzbbw.zzdL)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzu.B.f10556f.zzc(new zzbaa(this));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzj() {
        zzbbn zzbbnVar = zzbbw.zzdN;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            synchronized (this.zzc) {
                zzl();
                ScheduledFuture scheduledFuture = this.zza;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.zza = zzbzo.zzd.schedule(this.zzb, ((Long) zzbaVar.c.zza(zzbbw.zzdO)).longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }
}
