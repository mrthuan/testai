package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzlm implements zzkg {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzbq zzd = zzbq.zza;

    public zzlm(zzdj zzdjVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final long zza() {
        long zza;
        long j10 = this.zzb;
        if (this.zza) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
            zzbq zzbqVar = this.zzd;
            if (zzbqVar.zzb == 1.0f) {
                zza = zzet.zzr(elapsedRealtime);
            } else {
                zza = zzbqVar.zza(elapsedRealtime);
            }
            return j10 + zza;
        }
        return j10;
    }

    public final void zzb(long j10) {
        this.zzb = j10;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final zzbq zzc() {
        return this.zzd;
    }

    public final void zzd() {
        if (!this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
            this.zza = true;
        }
    }

    public final void zze() {
        if (this.zza) {
            zzb(zza());
            this.zza = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zzg(zzbq zzbqVar) {
        if (this.zza) {
            zzb(zza());
        }
        this.zzd = zzbqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final /* synthetic */ boolean zzj() {
        throw null;
    }
}
