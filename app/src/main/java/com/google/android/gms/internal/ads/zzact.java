package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzact implements zzadi {
    private final zzacv zza;
    private final long zzb;

    public zzact(zzacv zzacvVar, long j10) {
        this.zza = zzacvVar;
        this.zzb = j10;
    }

    private final zzadj zzb(long j10, long j11) {
        return new zzadj((j10 * 1000000) / this.zza.zze, this.zzb + j11);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j10) {
        long j11;
        zzdi.zzb(this.zza.zzk);
        zzacv zzacvVar = this.zza;
        zzacu zzacuVar = zzacvVar.zzk;
        long[] jArr = zzacuVar.zza;
        long[] jArr2 = zzacuVar.zzb;
        int zzc = zzet.zzc(jArr, zzacvVar.zzb(j10), true, false);
        long j12 = 0;
        if (zzc == -1) {
            j11 = 0;
        } else {
            j11 = jArr[zzc];
        }
        if (zzc != -1) {
            j12 = jArr2[zzc];
        }
        zzadj zzb = zzb(j11, j12);
        if (zzb.zzb != j10 && zzc != jArr.length - 1) {
            int i10 = zzc + 1;
            return new zzadg(zzb, zzb(jArr[i10], jArr2[i10]));
        }
        return new zzadg(zzb, zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return true;
    }
}
