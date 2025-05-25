package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcsj {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final y9.a zzc;
    private volatile boolean zzd = true;

    public zzcsj(Executor executor, ScheduledExecutorService scheduledExecutorService, y9.a aVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = aVar;
    }

    public static /* bridge */ /* synthetic */ void zzb(final zzcsj zzcsjVar, List list, final zzgcf zzgcfVar) {
        if (list != null && !list.isEmpty()) {
            y9.a zzh = zzgcj.zzh(null);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final y9.a aVar = (y9.a) it.next();
                zzh = zzgcj.zzn(zzgcj.zzf(zzh, Throwable.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzcsf
                    @Override // com.google.android.gms.internal.ads.zzgbq
                    public final y9.a zza(Object obj) {
                        zzgcf.this.zza((Throwable) obj);
                        return zzgcj.zzh(null);
                    }
                }, zzcsjVar.zza), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzcsg
                    @Override // com.google.android.gms.internal.ads.zzgbq
                    public final y9.a zza(Object obj) {
                        return zzcsj.this.zza(zzgcfVar, aVar, (zzcru) obj);
                    }
                }, zzcsjVar.zza);
            }
            zzgcj.zzr(zzh, new zzcsi(zzcsjVar, zzgcfVar), zzcsjVar.zza);
            return;
        }
        zzcsjVar.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcse
            @Override // java.lang.Runnable
            public final void run() {
                zzgcf.this.zza(new zzdwl(3));
            }
        });
    }

    public final /* synthetic */ y9.a zza(zzgcf zzgcfVar, y9.a aVar, zzcru zzcruVar) {
        if (zzcruVar != null) {
            zzgcfVar.zzb(zzcruVar);
        }
        return zzgcj.zzo(aVar, ((Long) zzbef.zza.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzgcf zzgcfVar) {
        zzgcj.zzr(this.zzc, new zzcsh(this, zzgcfVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
