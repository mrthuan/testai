package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzca {
    public Object zza;
    public Object zzb;
    public int zzc;
    public long zzd;
    public long zze;
    public boolean zzf;
    private zzb zzg = zzb.zza;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzca.class.equals(obj.getClass())) {
            zzca zzcaVar = (zzca) obj;
            if (zzet.zzG(this.zza, zzcaVar.zza) && zzet.zzG(this.zzb, zzcaVar.zzb) && this.zzc == zzcaVar.zzc && this.zzd == zzcaVar.zzd && this.zzf == zzcaVar.zzf && zzet.zzG(this.zzg, zzcaVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.zza;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.zzb;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        int i11 = ((((hashCode + 217) * 31) + i10) * 31) + this.zzc;
        long j10 = this.zzd;
        return this.zzg.hashCode() + (((((i11 * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 961) + (this.zzf ? 1 : 0)) * 31);
    }

    public final int zza(int i10) {
        return this.zzg.zza(i10).zzb;
    }

    public final int zzb() {
        int i10 = this.zzg.zzb;
        return 0;
    }

    public final int zzc(long j10) {
        return -1;
    }

    public final int zzd(long j10) {
        this.zzg.zzb(-1);
        return -1;
    }

    public final int zze(int i10) {
        return this.zzg.zza(i10).zza(-1);
    }

    public final int zzf(int i10, int i11) {
        return this.zzg.zza(i10).zza(i11);
    }

    public final int zzg() {
        int i10 = this.zzg.zzd;
        return 0;
    }

    public final long zzh(int i10, int i11) {
        zza zza = this.zzg.zza(i10);
        if (zza.zzb != -1) {
            return zza.zzf[i11];
        }
        return -9223372036854775807L;
    }

    public final long zzi(int i10) {
        long j10 = this.zzg.zza(i10).zza;
        return 0L;
    }

    public final long zzj() {
        long j10 = this.zzg.zzc;
        return 0L;
    }

    public final long zzk(int i10) {
        long j10 = this.zzg.zza(i10).zzg;
        return 0L;
    }

    public final zzca zzl(Object obj, Object obj2, int i10, long j10, long j11, zzb zzbVar, boolean z10) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = i10;
        this.zzd = j10;
        this.zze = 0L;
        this.zzg = zzbVar;
        this.zzf = z10;
        return this;
    }

    public final boolean zzm(int i10) {
        zzb();
        if (i10 == -1) {
            this.zzg.zzb(-1);
            return false;
        }
        return false;
    }

    public final boolean zzn(int i10) {
        boolean z10 = this.zzg.zza(i10).zzh;
        return false;
    }
}
