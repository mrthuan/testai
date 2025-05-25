package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfjc {
    final /* synthetic */ zzfjd zza;
    private final Object zzb;
    private final String zzc;
    private final y9.a zzd;
    private final List zze;
    private final y9.a zzf;

    private zzfjc(zzfjd zzfjdVar, Object obj, String str, y9.a aVar, List list, y9.a aVar2) {
        this.zza = zzfjdVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = aVar;
        this.zze = list;
        this.zzf = aVar2;
    }

    public final zzfiq zza() {
        zzfje zzfjeVar;
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzf(obj);
        }
        final zzfiq zzfiqVar = new zzfiq(obj, str, this.zzf);
        zzfjeVar = this.zza.zzd;
        zzfjeVar.zza(zzfiqVar);
        y9.a aVar = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfiz
            @Override // java.lang.Runnable
            public final void run() {
                zzfje zzfjeVar2;
                zzfjeVar2 = zzfjc.this.zza.zzd;
                zzfjeVar2.zzc(zzfiqVar);
            }
        };
        zzgcu zzgcuVar = zzbzo.zzf;
        aVar.addListener(runnable, zzgcuVar);
        zzgcj.zzr(zzfiqVar, new zzfja(this, zzfiqVar), zzgcuVar);
        return zzfiqVar;
    }

    public final zzfjc zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzfjc zzc(Class cls, zzgbq zzgbqVar) {
        zzgcu zzgcuVar;
        zzgcuVar = this.zza.zzb;
        return new zzfjc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgcj.zzf(this.zzf, cls, zzgbqVar, zzgcuVar));
    }

    public final zzfjc zzd(final y9.a aVar) {
        return zzg(new zzgbq() { // from class: com.google.android.gms.internal.ads.zzfiy
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return y9.a.this;
            }
        }, zzbzo.zzf);
    }

    public final zzfjc zze(final zzfio zzfioVar) {
        return zzf(new zzgbq() { // from class: com.google.android.gms.internal.ads.zzfix
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzgcj.zzh(zzfio.this.zza(obj));
            }
        });
    }

    public final zzfjc zzf(zzgbq zzgbqVar) {
        zzgcu zzgcuVar;
        zzgcuVar = this.zza.zzb;
        return zzg(zzgbqVar, zzgcuVar);
    }

    public final zzfjc zzg(zzgbq zzgbqVar, Executor executor) {
        return new zzfjc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgcj.zzn(this.zzf, zzgbqVar, executor));
    }

    public final zzfjc zzh(String str) {
        return new zzfjc(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfjc zzi(long j10, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.zza.zzc;
        return new zzfjc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgcj.zzo(this.zzf, j10, timeUnit, scheduledExecutorService));
    }
}
