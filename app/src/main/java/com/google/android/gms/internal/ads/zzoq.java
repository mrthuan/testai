package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzoq {
    public static final zzoq zza = new zzoo().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    public /* synthetic */ zzoq(zzoo zzooVar, zzop zzopVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        z10 = zzooVar.zza;
        this.zzb = z10;
        z11 = zzooVar.zzb;
        this.zzc = z11;
        z12 = zzooVar.zzc;
        this.zzd = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzoq.class == obj.getClass()) {
            zzoq zzoqVar = (zzoq) obj;
            if (this.zzb == zzoqVar.zzb && this.zzc == zzoqVar.zzc && this.zzd == zzoqVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z10 = this.zzb;
        boolean z11 = this.zzc;
        return (z11 ? 1 : 0) + (z11 ? 1 : 0) + ((z10 ? 1 : 0) << 2) + (this.zzd ? 1 : 0);
    }
}
