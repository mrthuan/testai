package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzwf implements zzug, zzuf {
    private final zzug zza;
    private final long zzb;
    private zzuf zzc;

    public zzwf(zzug zzugVar, long j10) {
        this.zza = zzugVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final long zza(long j10, zzlj zzljVar) {
        long j11 = this.zzb;
        return this.zza.zza(j10 - j11, zzljVar) + j11;
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final long zzd() {
        long zzd = this.zza.zzd();
        if (zzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzd + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final long zze(long j10) {
        long j11 = this.zzb;
        return this.zza.zze(j10 - j11) + j11;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final /* bridge */ /* synthetic */ void zzf(zzvz zzvzVar) {
        zzug zzugVar = (zzug) zzvzVar;
        zzuf zzufVar = this.zzc;
        zzufVar.getClass();
        zzufVar.zzf(this);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final long zzg(zzxv[] zzxvVarArr, boolean[] zArr, zzvx[] zzvxVarArr, boolean[] zArr2, long j10) {
        zzvx[] zzvxVarArr2 = new zzvx[zzvxVarArr.length];
        int i10 = 0;
        while (true) {
            zzvx zzvxVar = null;
            if (i10 >= zzvxVarArr.length) {
                break;
            }
            zzwe zzweVar = (zzwe) zzvxVarArr[i10];
            if (zzweVar != null) {
                zzvxVar = zzweVar.zzc();
            }
            zzvxVarArr2[i10] = zzvxVar;
            i10++;
        }
        long zzg = this.zza.zzg(zzxvVarArr, zArr, zzvxVarArr2, zArr2, j10 - this.zzb);
        for (int i11 = 0; i11 < zzvxVarArr.length; i11++) {
            zzvx zzvxVar2 = zzvxVarArr2[i11];
            if (zzvxVar2 == null) {
                zzvxVarArr[i11] = null;
            } else {
                zzvx zzvxVar3 = zzvxVarArr[i11];
                if (zzvxVar3 == null || ((zzwe) zzvxVar3).zzc() != zzvxVar2) {
                    zzvxVarArr[i11] = new zzwe(zzvxVar2, this.zzb);
                }
            }
        }
        return zzg + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzuf
    public final void zzh(zzug zzugVar) {
        zzuf zzufVar = this.zzc;
        zzufVar.getClass();
        zzufVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final zzwi zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzj(long j10, boolean z10) {
        this.zza.zzj(j10 - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzk() {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzl(zzuf zzufVar, long j10) {
        this.zzc = zzufVar;
        this.zza.zzl(this, j10 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final void zzm(long j10) {
        this.zza.zzm(j10 - this.zzb);
    }

    public final zzug zzn() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final boolean zzo(zzkf zzkfVar) {
        long j10 = zzkfVar.zza;
        long j11 = this.zzb;
        zzkd zza = zzkfVar.zza();
        zza.zze(j10 - j11);
        return this.zza.zzo(zza.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final boolean zzp() {
        return this.zza.zzp();
    }
}
