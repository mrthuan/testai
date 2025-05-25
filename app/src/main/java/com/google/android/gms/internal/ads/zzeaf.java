package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeaf extends zzeai {
    private zzbuc zzh;

    public zzeaf(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zze = context;
        this.zzf = com.google.android.gms.ads.internal.zzu.B.f10568r.a();
        this.zzg = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzeai, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final synchronized void onConnected(Bundle bundle) {
        if (!this.zzc) {
            this.zzc = true;
            try {
                this.zzd.zzp().zzf(this.zzh, new zzeah(this));
            } catch (RemoteException unused) {
                this.zza.zzd(new zzdyp(1));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeai, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i10));
        com.google.android.gms.ads.internal.util.client.zzm.b(format);
        this.zza.zzd(new zzdyp(1, format));
    }

    public final synchronized y9.a zza(zzbuc zzbucVar, long j10) {
        if (this.zzb) {
            return zzgcj.zzo(this.zza, j10, TimeUnit.MILLISECONDS, this.zzg);
        }
        this.zzb = true;
        this.zzh = zzbucVar;
        zzb();
        y9.a zzo = zzgcj.zzo(this.zza, j10, TimeUnit.MILLISECONDS, this.zzg);
        zzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeae
            @Override // java.lang.Runnable
            public final void run() {
                zzeaf.this.zzc();
            }
        }, zzbzo.zzf);
        return zzo;
    }
}
