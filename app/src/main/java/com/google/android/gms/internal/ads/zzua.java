package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzua implements zzug, zzuf {
    public final zzui zza;
    private final long zzb;
    private zzuk zzc;
    private zzug zzd;
    private zzuf zze;
    private long zzf = -9223372036854775807L;
    private final zzyk zzg;

    public zzua(zzui zzuiVar, zzyk zzykVar, long j10) {
        this.zza = zzuiVar;
        this.zzg = zzykVar;
        this.zzb = j10;
    }

    private final long zzv(long j10) {
        long j11 = this.zzf;
        if (j11 != -9223372036854775807L) {
            return j11;
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final long zza(long j10, zzlj zzljVar) {
        zzug zzugVar = this.zzd;
        int i10 = zzet.zza;
        return zzugVar.zza(j10, zzljVar);
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final long zzb() {
        zzug zzugVar = this.zzd;
        int i10 = zzet.zza;
        return zzugVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final long zzc() {
        zzug zzugVar = this.zzd;
        int i10 = zzet.zza;
        return zzugVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final long zzd() {
        zzug zzugVar = this.zzd;
        int i10 = zzet.zza;
        return zzugVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final long zze(long j10) {
        zzug zzugVar = this.zzd;
        int i10 = zzet.zza;
        return zzugVar.zze(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final /* bridge */ /* synthetic */ void zzf(zzvz zzvzVar) {
        zzug zzugVar = (zzug) zzvzVar;
        zzuf zzufVar = this.zze;
        int i10 = zzet.zza;
        zzufVar.zzf(this);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final long zzg(zzxv[] zzxvVarArr, boolean[] zArr, zzvx[] zzvxVarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.zzf;
        if (j12 != -9223372036854775807L && j10 == this.zzb) {
            j11 = j12;
        } else {
            j11 = j10;
        }
        this.zzf = -9223372036854775807L;
        zzug zzugVar = this.zzd;
        int i10 = zzet.zza;
        return zzugVar.zzg(zzxvVarArr, zArr, zzvxVarArr, zArr2, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzuf
    public final void zzh(zzug zzugVar) {
        zzuf zzufVar = this.zze;
        int i10 = zzet.zza;
        zzufVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final zzwi zzi() {
        zzug zzugVar = this.zzd;
        int i10 = zzet.zza;
        return zzugVar.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzj(long j10, boolean z10) {
        zzug zzugVar = this.zzd;
        int i10 = zzet.zza;
        zzugVar.zzj(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzk() {
        zzug zzugVar = this.zzd;
        if (zzugVar != null) {
            zzugVar.zzk();
            return;
        }
        zzuk zzukVar = this.zzc;
        if (zzukVar != null) {
            zzukVar.zzz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzl(zzuf zzufVar, long j10) {
        this.zze = zzufVar;
        zzug zzugVar = this.zzd;
        if (zzugVar != null) {
            zzugVar.zzl(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final void zzm(long j10) {
        zzug zzugVar = this.zzd;
        int i10 = zzet.zza;
        zzugVar.zzm(j10);
    }

    public final long zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final boolean zzo(zzkf zzkfVar) {
        zzug zzugVar = this.zzd;
        if (zzugVar != null && zzugVar.zzo(zzkfVar)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final boolean zzp() {
        zzug zzugVar = this.zzd;
        if (zzugVar != null && zzugVar.zzp()) {
            return true;
        }
        return false;
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzui zzuiVar) {
        long zzv = zzv(this.zzb);
        zzuk zzukVar = this.zzc;
        zzukVar.getClass();
        zzug zzI = zzukVar.zzI(zzuiVar, this.zzg, zzv);
        this.zzd = zzI;
        if (this.zze != null) {
            zzI.zzl(this, zzv);
        }
    }

    public final void zzs(long j10) {
        this.zzf = j10;
    }

    public final void zzt() {
        zzug zzugVar = this.zzd;
        if (zzugVar != null) {
            zzuk zzukVar = this.zzc;
            zzukVar.getClass();
            zzukVar.zzG(zzugVar);
        }
    }

    public final void zzu(zzuk zzukVar) {
        boolean z10;
        if (this.zzc == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzf(z10);
        this.zzc = zzukVar;
    }
}
