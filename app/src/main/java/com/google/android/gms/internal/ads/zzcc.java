package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzcc {
    public static final zzcc zza = new zzbz();

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public final boolean equals(Object obj) {
        int zzh;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcc)) {
            return false;
        }
        zzcc zzccVar = (zzcc) obj;
        if (zzccVar.zzc() == zzc() && zzccVar.zzb() == zzb()) {
            zzcb zzcbVar = new zzcb();
            zzca zzcaVar = new zzca();
            zzcb zzcbVar2 = new zzcb();
            zzca zzcaVar2 = new zzca();
            for (int i10 = 0; i10 < zzc(); i10++) {
                if (!zze(i10, zzcbVar, 0L).equals(zzccVar.zze(i10, zzcbVar2, 0L))) {
                    return false;
                }
            }
            for (int i11 = 0; i11 < zzb(); i11++) {
                if (!zzd(i11, zzcaVar, true).equals(zzccVar.zzd(i11, zzcaVar2, true))) {
                    return false;
                }
            }
            int zzg = zzg(true);
            if (zzg == zzccVar.zzg(true) && (zzh = zzh(true)) == zzccVar.zzh(true)) {
                while (zzg != zzh) {
                    int zzj = zzj(zzg, 0, true);
                    if (zzj != zzccVar.zzj(zzg, 0, true)) {
                        return false;
                    }
                    zzg = zzj;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        zzcb zzcbVar = new zzcb();
        zzca zzcaVar = new zzca();
        int zzc = zzc() + 217;
        int i11 = 0;
        while (true) {
            i10 = zzc * 31;
            if (i11 >= zzc()) {
                break;
            }
            zzc = i10 + zze(i11, zzcbVar, 0L).hashCode();
            i11++;
        }
        int zzb = zzb() + i10;
        for (int i12 = 0; i12 < zzb(); i12++) {
            zzb = (zzb * 31) + zzd(i12, zzcaVar, true).hashCode();
        }
        int zzg = zzg(true);
        while (zzg != -1) {
            zzb = (zzb * 31) + zzg;
            zzg = zzj(zzg, 0, true);
        }
        return zzb;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzca zzd(int i10, zzca zzcaVar, boolean z10);

    public abstract zzcb zze(int i10, zzcb zzcbVar, long j10);

    public abstract Object zzf(int i10);

    public int zzg(boolean z10) {
        if (zzo()) {
            return -1;
        }
        return 0;
    }

    public int zzh(boolean z10) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i10, zzca zzcaVar, zzcb zzcbVar, int i11, boolean z10) {
        int i12 = zzd(i10, zzcaVar, false).zzc;
        if (zze(i12, zzcbVar, 0L).zzo == i10) {
            int zzj = zzj(i12, i11, z10);
            if (zzj == -1) {
                return -1;
            }
            return zze(zzj, zzcbVar, 0L).zzn;
        }
        return i10 + 1;
    }

    public int zzj(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == zzh(z10)) {
                        return zzg(z10);
                    }
                    return i10 + 1;
                }
                throw new IllegalStateException();
            }
            return i10;
        } else if (i10 == zzh(z10)) {
            return -1;
        } else {
            return i10 + 1;
        }
    }

    public int zzk(int i10, int i11, boolean z10) {
        if (i10 == zzg(false)) {
            return -1;
        }
        return i10 - 1;
    }

    public final Pair zzl(zzcb zzcbVar, zzca zzcaVar, int i10, long j10) {
        Pair zzm = zzm(zzcbVar, zzcaVar, i10, j10, 0L);
        zzm.getClass();
        return zzm;
    }

    public final Pair zzm(zzcb zzcbVar, zzca zzcaVar, int i10, long j10, long j11) {
        zzdi.zza(i10, 0, zzc());
        zze(i10, zzcbVar, j11);
        if (j10 == -9223372036854775807L) {
            long j12 = zzcbVar.zzl;
            j10 = 0;
        }
        int i11 = zzcbVar.zzn;
        zzd(i11, zzcaVar, false);
        while (i11 < zzcbVar.zzo) {
            long j13 = zzcaVar.zze;
            int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i12 == 0) {
                break;
            }
            int i13 = i11 + 1;
            long j14 = zzd(i13, zzcaVar, false).zze;
            if (i12 < 0) {
                break;
            }
            i11 = i13;
        }
        zzd(i11, zzcaVar, true);
        long j15 = zzcaVar.zze;
        long j16 = zzcaVar.zzd;
        if (j16 != -9223372036854775807L) {
            j10 = Math.min(j10, j16 - 1);
        }
        long max = Math.max(0L, j10);
        Object obj = zzcaVar.zzb;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public zzca zzn(Object obj, zzca zzcaVar) {
        return zzd(zza(obj), zzcaVar, true);
    }

    public final boolean zzo() {
        if (zzc() == 0) {
            return true;
        }
        return false;
    }
}
