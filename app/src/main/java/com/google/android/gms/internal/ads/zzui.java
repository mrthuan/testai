package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzui {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    private zzui(Object obj, int i10, int i11, long j10, int i12) {
        this.zza = obj;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10;
        this.zze = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzui)) {
            return false;
        }
        zzui zzuiVar = (zzui) obj;
        if (this.zza.equals(zzuiVar.zza) && this.zzb == zzuiVar.zzb && this.zzc == zzuiVar.zzc && this.zzd == zzuiVar.zzd && this.zze == zzuiVar.zze) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzui zza(Object obj) {
        if (this.zza.equals(obj)) {
            return this;
        }
        return new zzui(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        if (this.zzb != -1) {
            return true;
        }
        return false;
    }

    public zzui(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    public zzui(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public zzui(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }
}
