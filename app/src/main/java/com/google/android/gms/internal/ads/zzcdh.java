package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcdh implements zzkb {
    private final zzyk zza = new zzyk(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    public final void zza(boolean z10) {
        this.zzf = 0;
        this.zzg = false;
        if (z10) {
            this.zza.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final long zzb(zznz zznzVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final void zzc(zznz zznzVar) {
        zza(false);
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final void zzd(zznz zznzVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final void zze(zznz zznzVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final void zzf(zznz zznzVar, zzcc zzccVar, zzui zzuiVar, zzle[] zzleVarArr, zzwi zzwiVar, zzxv[] zzxvVarArr) {
        int i10;
        int i11 = 0;
        this.zzf = 0;
        while (true) {
            int length = zzleVarArr.length;
            if (i11 < 2) {
                if (zzxvVarArr[i11] != null) {
                    int i12 = this.zzf;
                    if (zzleVarArr[i11].zzb() != 1) {
                        i10 = 131072000;
                    } else {
                        i10 = 13107200;
                    }
                    this.zzf = i12 + i10;
                }
                i11++;
            } else {
                this.zza.zzf(this.zzf);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final boolean zzg(zznz zznzVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final boolean zzh(zzka zzkaVar) {
        boolean z10;
        long j10 = zzkaVar.zzb;
        boolean z11 = true;
        if (j10 > this.zzc) {
            z10 = false;
        } else if (j10 < this.zzb) {
            z10 = true;
        } else {
            z10 = true;
        }
        int zza = this.zza.zza();
        int i10 = this.zzf;
        if (!z10 && (!z10 || !this.zzg || zza >= i10)) {
            z11 = false;
        }
        this.zzg = z11;
        return z11;
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final boolean zzi(zzka zzkaVar) {
        long j10;
        if (zzkaVar.zzd) {
            j10 = this.zze;
        } else {
            j10 = this.zzd;
        }
        if (j10 > 0 && zzkaVar.zzb < j10) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final zzyk zzj() {
        return this.zza;
    }

    public final synchronized void zzk(int i10) {
        this.zzd = i10 * 1000;
    }

    public final synchronized void zzl(int i10) {
        this.zze = i10 * 1000;
    }

    public final synchronized void zzm(int i10) {
        this.zzc = i10 * 1000;
    }

    public final synchronized void zzn(int i10) {
        this.zzb = i10 * 1000;
    }
}
