package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaje implements zzajj {
    private final zzacv zza;
    private final zzacu zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzaje(zzacv zzacvVar, zzacu zzacuVar) {
        this.zza = zzacvVar;
        this.zzb = zzacuVar;
    }

    public final void zza(long j10) {
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final long zzd(zzacl zzaclVar) {
        long j10 = this.zzd;
        if (j10 < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j10 + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final zzadi zze() {
        boolean z10;
        if (this.zzc != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzf(z10);
        return new zzact(this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zzg(long j10) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzet.zzc(jArr, j10, true, true)];
    }
}
