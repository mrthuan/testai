package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzhe extends zzcc {
    private final int zzb;
    private final zzwa zzc;

    public zzhe(boolean z10, zzwa zzwaVar) {
        this.zzc = zzwaVar;
        this.zzb = zzwaVar.zzc();
    }

    private final int zzw(int i10, boolean z10) {
        if (z10) {
            return this.zzc.zzd(i10);
        }
        if (i10 >= this.zzb - 1) {
            return -1;
        }
        return i10 + 1;
    }

    private final int zzx(int i10, boolean z10) {
        if (z10) {
            return this.zzc.zze(i10);
        }
        if (i10 <= 0) {
            return -1;
        }
        return i10 - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zza(Object obj) {
        int zza;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int zzp = zzp(obj2);
            if (zzp != -1 && (zza = zzu(zzp).zza(obj3)) != -1) {
                return zzs(zzp) + zza;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final zzca zzd(int i10, zzca zzcaVar, boolean z10) {
        int zzq = zzq(i10);
        int zzt = zzt(zzq);
        zzu(zzq).zzd(i10 - zzs(zzq), zzcaVar, z10);
        zzcaVar.zzc += zzt;
        if (z10) {
            Object zzv = zzv(zzq);
            Object obj = zzcaVar.zzb;
            obj.getClass();
            zzcaVar.zzb = Pair.create(zzv, obj);
        }
        return zzcaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final zzcb zze(int i10, zzcb zzcbVar, long j10) {
        int zzr = zzr(i10);
        int zzt = zzt(zzr);
        int zzs = zzs(zzr);
        zzu(zzr).zze(i10 - zzt, zzcbVar, j10);
        Object zzv = zzv(zzr);
        if (!zzcb.zza.equals(zzcbVar.zzb)) {
            zzv = Pair.create(zzv, zzcbVar.zzb);
        }
        zzcbVar.zzb = zzv;
        zzcbVar.zzn += zzs;
        zzcbVar.zzo += zzs;
        return zzcbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final Object zzf(int i10) {
        int zzq = zzq(i10);
        return Pair.create(zzv(zzq), zzu(zzq).zzf(i10 - zzs(zzq)));
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzg(boolean z10) {
        int i10;
        if (this.zzb == 0) {
            return -1;
        }
        if (z10) {
            i10 = this.zzc.zza();
        } else {
            i10 = 0;
        }
        while (zzu(i10).zzo()) {
            i10 = zzw(i10, z10);
            if (i10 == -1) {
                return -1;
            }
        }
        return zzu(i10).zzg(z10) + zzt(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzh(boolean z10) {
        int i10;
        int i11 = this.zzb;
        if (i11 == 0) {
            return -1;
        }
        if (z10) {
            i10 = this.zzc.zzb();
        } else {
            i10 = i11 - 1;
        }
        while (zzu(i10).zzo()) {
            i10 = zzx(i10, z10);
            if (i10 == -1) {
                return -1;
            }
        }
        return zzu(i10).zzh(z10) + zzt(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzj(int i10, int i11, boolean z10) {
        int i12;
        int zzr = zzr(i10);
        int zzt = zzt(zzr);
        zzcc zzu = zzu(zzr);
        int i13 = i10 - zzt;
        if (i11 == 2) {
            i12 = 0;
        } else {
            i12 = i11;
        }
        int zzj = zzu.zzj(i13, i12, z10);
        if (zzj != -1) {
            return zzt + zzj;
        }
        int zzw = zzw(zzr, z10);
        while (zzw != -1 && zzu(zzw).zzo()) {
            zzw = zzw(zzw, z10);
        }
        if (zzw != -1) {
            return zzu(zzw).zzg(z10) + zzt(zzw);
        } else if (i11 != 2) {
            return -1;
        } else {
            return zzg(z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzk(int i10, int i11, boolean z10) {
        int zzr = zzr(i10);
        int zzt = zzt(zzr);
        int zzk = zzu(zzr).zzk(i10 - zzt, 0, false);
        if (zzk != -1) {
            return zzt + zzk;
        }
        int zzx = zzx(zzr, false);
        while (zzx != -1 && zzu(zzx).zzo()) {
            zzx = zzx(zzx, false);
        }
        if (zzx == -1) {
            return -1;
        }
        return zzu(zzx).zzh(false) + zzt(zzx);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final zzca zzn(Object obj, zzca zzcaVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int zzp = zzp(obj2);
        int zzt = zzt(zzp);
        zzu(zzp).zzn(obj3, zzcaVar);
        zzcaVar.zzc += zzt;
        zzcaVar.zzb = obj;
        return zzcaVar;
    }

    public abstract int zzp(Object obj);

    public abstract int zzq(int i10);

    public abstract int zzr(int i10);

    public abstract int zzs(int i10);

    public abstract int zzt(int i10);

    public abstract zzcc zzu(int i10);

    public abstract Object zzv(int i10);
}
