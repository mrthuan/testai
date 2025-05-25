package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdul implements zzgcf {
    final /* synthetic */ zzdun zza;

    public zzdul(zzdun zzdunVar) {
        this.zza = zzdunVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        long j10;
        zzbzt zzbztVar;
        synchronized (this) {
            this.zza.zzc = true;
            zzdun zzdunVar = this.zza;
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j10 = this.zza.zzd;
            zzdunVar.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (elapsedRealtime - j10));
            zzbztVar = this.zza.zze;
            zzbztVar.zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zzb(Object obj) {
        long j10;
        Executor executor;
        final String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            zzdun zzdunVar = this.zza;
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j10 = this.zza.zzd;
            zzdunVar.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (elapsedRealtime - j10));
            executor = this.zza.zzi;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduk
                @Override // java.lang.Runnable
                public final void run() {
                    zzdun.zzj(zzdul.this.zza, str);
                }
            });
        }
    }
}
