package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzkh {
    public final zzug zza;
    public final Object zzb;
    public final zzvx[] zzc;
    public boolean zzd;
    public boolean zze;
    public zzki zzf;
    public boolean zzg;
    private final boolean[] zzh;
    private final zzlh[] zzi;
    private final zzyb zzj;
    private final zzkw zzk;
    private zzkh zzl;
    private zzwi zzm;
    private zzyc zzn;
    private long zzo;

    public zzkh(zzlh[] zzlhVarArr, long j10, zzyb zzybVar, zzyk zzykVar, zzkw zzkwVar, zzki zzkiVar, zzyc zzycVar) {
        this.zzi = zzlhVarArr;
        this.zzo = j10;
        this.zzj = zzybVar;
        this.zzk = zzkwVar;
        zzui zzuiVar = zzkiVar.zza;
        this.zzb = zzuiVar.zza;
        this.zzf = zzkiVar;
        this.zzm = zzwi.zza;
        this.zzn = zzycVar;
        this.zzc = new zzvx[2];
        this.zzh = new boolean[2];
        long j11 = zzkiVar.zzb;
        long j12 = zzkiVar.zzd;
        zzug zzp = zzkwVar.zzp(zzuiVar, zzykVar, j11);
        this.zza = j12 != -9223372036854775807L ? new zztm(zzp, true, 0L, j12) : zzp;
    }

    private final void zzs() {
        if (zzu()) {
            int i10 = 0;
            while (true) {
                zzyc zzycVar = this.zzn;
                if (i10 < zzycVar.zza) {
                    zzycVar.zzb(i10);
                    zzxv zzxvVar = this.zzn.zzc[i10];
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private final void zzt() {
        if (zzu()) {
            int i10 = 0;
            while (true) {
                zzyc zzycVar = this.zzn;
                if (i10 < zzycVar.zza) {
                    zzycVar.zzb(i10);
                    zzxv zzxvVar = this.zzn.zzc[i10];
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private final boolean zzu() {
        if (this.zzl == null) {
            return true;
        }
        return false;
    }

    public final long zza(zzyc zzycVar, long j10, boolean z10) {
        return zzb(zzycVar, j10, false, new boolean[2]);
    }

    public final long zzb(zzyc zzycVar, long j10, boolean z10, boolean[] zArr) {
        boolean z11;
        int i10 = 0;
        while (true) {
            boolean z12 = true;
            if (i10 >= zzycVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z10 || !zzycVar.zza(this.zzn, i10)) {
                z12 = false;
            }
            zArr2[i10] = z12;
            i10++;
        }
        int i11 = 0;
        while (true) {
            zzlh[] zzlhVarArr = this.zzi;
            if (i11 >= 2) {
                break;
            }
            zzlhVarArr[i11].zzb();
            i11++;
        }
        zzs();
        this.zzn = zzycVar;
        zzt();
        long zzg = this.zza.zzg(zzycVar.zzc, this.zzh, this.zzc, zArr, j10);
        int i12 = 0;
        while (true) {
            zzlh[] zzlhVarArr2 = this.zzi;
            if (i12 >= 2) {
                break;
            }
            zzlhVarArr2[i12].zzb();
            i12++;
        }
        this.zze = false;
        int i13 = 0;
        while (true) {
            zzvx[] zzvxVarArr = this.zzc;
            if (i13 < 2) {
                if (zzvxVarArr[i13] != null) {
                    zzdi.zzf(zzycVar.zzb(i13));
                    this.zzi[i13].zzb();
                    this.zze = true;
                } else {
                    if (zzycVar.zzc[i13] == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zzdi.zzf(z11);
                }
                i13++;
            } else {
                return zzg;
            }
        }
    }

    public final long zzc() {
        long j10;
        if (!this.zzd) {
            return this.zzf.zzb;
        }
        if (this.zze) {
            j10 = this.zza.zzb();
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == Long.MIN_VALUE) {
            return this.zzf.zze;
        }
        return j10;
    }

    public final long zzd() {
        if (!this.zzd) {
            return 0L;
        }
        return this.zza.zzc();
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        return this.zzf.zzb + this.zzo;
    }

    public final zzkh zzg() {
        return this.zzl;
    }

    public final zzwi zzh() {
        return this.zzm;
    }

    public final zzyc zzi() {
        return this.zzn;
    }

    public final zzyc zzj(float f10, zzcc zzccVar) {
        zzxv[] zzxvVarArr;
        zzyc zzo = this.zzj.zzo(this.zzi, this.zzm, this.zzf.zza, zzccVar);
        for (zzxv zzxvVar : zzo.zzc) {
        }
        return zzo;
    }

    public final void zzk(long j10, float f10, long j11) {
        zzdi.zzf(zzu());
        long j12 = j10 - this.zzo;
        zzkd zzkdVar = new zzkd();
        zzkdVar.zze(j12);
        zzkdVar.zzf(f10);
        zzkdVar.zzd(j11);
        this.zza.zzo(new zzkf(zzkdVar, null));
    }

    public final void zzl(float f10, zzcc zzccVar) {
        this.zzd = true;
        this.zzm = this.zza.zzi();
        zzyc zzj = zzj(f10, zzccVar);
        zzki zzkiVar = this.zzf;
        long j10 = zzkiVar.zzb;
        long j11 = zzkiVar.zze;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long zza = zza(zzj, j10, false);
        long j12 = this.zzo;
        zzki zzkiVar2 = this.zzf;
        this.zzo = (zzkiVar2.zzb - zza) + j12;
        this.zzf = zzkiVar2.zzb(zza);
    }

    public final void zzm(long j10) {
        zzdi.zzf(zzu());
        if (this.zzd) {
            this.zza.zzm(j10 - this.zzo);
        }
    }

    public final void zzn() {
        zzs();
        zzug zzugVar = this.zza;
        try {
            boolean z10 = zzugVar instanceof zztm;
            zzkw zzkwVar = this.zzk;
            if (z10) {
                zzkwVar.zzi(((zztm) zzugVar).zza);
            } else {
                zzkwVar.zzi(zzugVar);
            }
        } catch (RuntimeException e10) {
            zzea.zzd("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final void zzo(zzkh zzkhVar) {
        if (zzkhVar == this.zzl) {
            return;
        }
        zzs();
        this.zzl = zzkhVar;
        zzt();
    }

    public final void zzp(long j10) {
        this.zzo = j10;
    }

    public final void zzq() {
        zzug zzugVar = this.zza;
        if (zzugVar instanceof zztm) {
            long j10 = this.zzf.zzd;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((zztm) zzugVar).zzn(0L, j10);
        }
    }

    public final boolean zzr() {
        if (!this.zzd) {
            return false;
        }
        if (this.zze && this.zza.zzb() != Long.MIN_VALUE) {
            return false;
        }
        return true;
    }
}
