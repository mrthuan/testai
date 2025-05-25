package com.google.android.gms.internal.ads;

import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaji {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[FunctionEval.FunctionID.EXTERNAL_FUNC];
    private final zzek zzg = new zzek((int) FunctionEval.FunctionID.EXTERNAL_FUNC);

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzacl zzaclVar, boolean z10) {
        zza();
        this.zzg.zzH(27);
        if (zzaco.zzc(zzaclVar, this.zzg.zzM(), 0, 27, z10) && this.zzg.zzu() == 1332176723) {
            if (this.zzg.zzm() != 0) {
                if (z10) {
                    return false;
                }
                throw zzbo.zzc("unsupported bit stream revision");
            }
            this.zza = this.zzg.zzm();
            this.zzb = this.zzg.zzr();
            this.zzg.zzs();
            this.zzg.zzs();
            this.zzg.zzs();
            int zzm = this.zzg.zzm();
            this.zzc = zzm;
            this.zzd = zzm + 27;
            this.zzg.zzH(zzm);
            if (zzaco.zzc(zzaclVar, this.zzg.zzM(), 0, this.zzc, z10)) {
                for (int i10 = 0; i10 < this.zzc; i10++) {
                    this.zzf[i10] = this.zzg.zzm();
                    this.zze += this.zzf[i10];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzacl zzaclVar, long j10) {
        boolean z10;
        int i10;
        if (zzaclVar.zzf() == zzaclVar.zze()) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzd(z10);
        this.zzg.zzH(4);
        while (true) {
            i10 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
            if ((i10 == 0 || zzaclVar.zzf() + 4 < j10) && zzaco.zzc(zzaclVar, this.zzg.zzM(), 0, 4, true)) {
                this.zzg.zzK(0);
                if (this.zzg.zzu() != 1332176723) {
                    ((zzaby) zzaclVar).zzo(1, false);
                } else {
                    zzaclVar.zzj();
                    return true;
                }
            }
        }
        do {
            if (i10 != 0 && zzaclVar.zzf() >= j10) {
                break;
            }
        } while (zzaclVar.zzc(1) != -1);
        return false;
    }
}
