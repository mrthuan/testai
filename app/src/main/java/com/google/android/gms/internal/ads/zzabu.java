package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public class zzabu {
    protected final zzabo zza;
    protected final zzabt zzb;
    protected zzabq zzc;
    private final int zzd;

    public zzabu(zzabr zzabrVar, zzabt zzabtVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.zzb = zzabtVar;
        this.zzd = i10;
        this.zza = new zzabo(zzabrVar, j10, 0L, j12, j13, j14, j15);
    }

    public static final int zzf(zzacl zzaclVar, long j10, zzadf zzadfVar) {
        if (j10 == zzaclVar.zzf()) {
            return 0;
        }
        zzadfVar.zza = j10;
        return 1;
    }

    public static final boolean zzg(zzacl zzaclVar, long j10) {
        long zzf = j10 - zzaclVar.zzf();
        if (zzf < 0 || zzf > 262144) {
            return false;
        }
        ((zzaby) zzaclVar).zzo((int) zzf, false);
        return true;
    }

    public final int zza(zzacl zzaclVar, zzadf zzadfVar) {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        while (true) {
            zzabq zzabqVar = this.zzc;
            zzdi.zzb(zzabqVar);
            j10 = zzabqVar.zzf;
            j11 = zzabqVar.zzg;
            int i11 = this.zzd;
            j12 = zzabqVar.zzh;
            if (j11 - j10 <= i11) {
                zzc(false, j10);
                return zzf(zzaclVar, j10, zzadfVar);
            } else if (!zzg(zzaclVar, j12)) {
                return zzf(zzaclVar, j12, zzadfVar);
            } else {
                zzaclVar.zzj();
                zzabt zzabtVar = this.zzb;
                j13 = zzabqVar.zzb;
                zzabs zza = zzabtVar.zza(zzaclVar, j13);
                i10 = zza.zzb;
                if (i10 != -3) {
                    if (i10 == -2) {
                        j19 = zza.zzc;
                        j20 = zza.zzd;
                        zzabq.zzh(zzabqVar, j19, j20);
                    } else if (i10 != -1) {
                        j14 = zza.zzd;
                        zzg(zzaclVar, j14);
                        j15 = zza.zzd;
                        zzc(true, j15);
                        j16 = zza.zzd;
                        return zzf(zzaclVar, j16, zzadfVar);
                    } else {
                        j17 = zza.zzc;
                        j18 = zza.zzd;
                        zzabq.zzg(zzabqVar, j17, j18);
                    }
                } else {
                    zzc(false, j12);
                    return zzf(zzaclVar, j12, zzadfVar);
                }
            }
        }
    }

    public final zzadi zzb() {
        return this.zza;
    }

    public final void zzc(boolean z10, long j10) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        zzabq zzabqVar = this.zzc;
        if (zzabqVar != null) {
            j15 = zzabqVar.zza;
            if (j15 == j10) {
                return;
            }
        }
        zzabo zzaboVar = this.zza;
        long zzf = zzaboVar.zzf(j10);
        j11 = zzaboVar.zzc;
        j12 = zzaboVar.zzd;
        j13 = zzaboVar.zze;
        j14 = zzaboVar.zzf;
        this.zzc = new zzabq(j10, zzf, 0L, j11, j12, j13, j14);
    }

    public final boolean zze() {
        if (this.zzc != null) {
            return true;
        }
        return false;
    }
}
