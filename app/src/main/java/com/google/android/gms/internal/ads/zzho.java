package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzho {
    public final String zza;
    public final zzaf zzb;
    public final zzaf zzc;
    public final int zzd;
    public final int zze;

    public zzho(String str, zzaf zzafVar, zzaf zzafVar2, int i10, int i11) {
        boolean z10 = true;
        if (i10 != 0) {
            if (i11 == 0) {
                i11 = 0;
            } else {
                z10 = false;
            }
        }
        zzdi.zzd(z10);
        zzdi.zzc(str);
        this.zza = str;
        this.zzb = zzafVar;
        zzafVar2.getClass();
        this.zzc = zzafVar2;
        this.zzd = i10;
        this.zze = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzho.class == obj.getClass()) {
            zzho zzhoVar = (zzho) obj;
            if (this.zzd == zzhoVar.zzd && this.zze == zzhoVar.zze && this.zza.equals(zzhoVar.zza) && this.zzb.equals(zzhoVar.zzb) && this.zzc.equals(zzhoVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + ((((this.zzd + 527) * 31) + this.zze) * 31);
        int hashCode2 = this.zzb.hashCode() + (hashCode * 31);
        return this.zzc.hashCode() + (hashCode2 * 31);
    }
}
