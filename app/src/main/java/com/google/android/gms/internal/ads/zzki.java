package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzki {
    public final zzui zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    public zzki(zzui zzuiVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15 = true;
        if (z13 && !z11) {
            z14 = false;
        } else {
            z14 = true;
        }
        zzdi.zzd(z14);
        if (z12 && !z11) {
            z15 = false;
        }
        zzdi.zzd(z15);
        this.zza = zzuiVar;
        this.zzb = j10;
        this.zzc = j11;
        this.zzd = j12;
        this.zze = j13;
        this.zzf = false;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzki.class == obj.getClass()) {
            zzki zzkiVar = (zzki) obj;
            if (this.zzb == zzkiVar.zzb && this.zzc == zzkiVar.zzc && this.zzd == zzkiVar.zzd && this.zze == zzkiVar.zze && this.zzg == zzkiVar.zzg && this.zzh == zzkiVar.zzh && this.zzi == zzkiVar.zzi && zzet.zzG(this.zza, zzkiVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.zze;
        long j11 = this.zzd;
        return ((((((((((((((this.zza.hashCode() + 527) * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) j11)) * 31) + ((int) j10)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzki zza(long j10) {
        if (j10 == this.zzc) {
            return this;
        }
        return new zzki(this.zza, this.zzb, j10, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzki zzb(long j10) {
        if (j10 == this.zzb) {
            return this;
        }
        return new zzki(this.zza, j10, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}
