package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdxk {
    private final ScheduledExecutorService zza;
    private final zzgcu zzb;
    private final zzgcu zzc;
    private final zzdyc zzd;
    private final zzhew zze;

    public zzdxk(ScheduledExecutorService scheduledExecutorService, zzgcu zzgcuVar, zzgcu zzgcuVar2, zzdyc zzdycVar, zzhew zzhewVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgcuVar;
        this.zzc = zzgcuVar2;
        this.zzd = zzdycVar;
        this.zze = zzhewVar;
    }

    public final zzdyq zza(zzbvb zzbvbVar) {
        return (zzdyq) this.zzd.zza(zzbvbVar).get(((Integer) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeU)).intValue(), TimeUnit.SECONDS);
    }

    public final /* synthetic */ y9.a zzb(final zzbvb zzbvbVar, int i10, Throwable th2) {
        Bundle bundle;
        if (zzbvbVar != null && (bundle = zzbvbVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgcj.zzn(((zzeay) this.zze.zzb()).zzd(zzbvbVar, i10), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdxh
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzgcj.zzh(new zzdyq((InputStream) obj, zzbvb.this));
            }
        }, this.zzb);
    }

    public final y9.a zzc(final zzbvb zzbvbVar) {
        y9.a zza;
        String str = zzbvbVar.zzd;
        com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        if (com.google.android.gms.ads.internal.util.zzt.c(str)) {
            zza = zzgcj.zzg(new zzdyp(1));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgK)).booleanValue()) {
                zza = this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxi
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzdxk.this.zza(zzbvbVar);
                    }
                });
            } else {
                zza = this.zzd.zza(zzbvbVar);
            }
        }
        final int callingUid = Binder.getCallingUid();
        zzgca zzu = zzgca.zzu(zza);
        zzbbn zzbbnVar = zzbbw.zzeU;
        return zzgcj.zzf((zzgca) zzgcj.zzo(zzu, ((Integer) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbnVar)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdxj
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzdxk.this.zzb(zzbvbVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }
}
