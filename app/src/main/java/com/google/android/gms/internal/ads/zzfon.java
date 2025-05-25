package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfon extends zzfoj {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;

    public /* synthetic */ zzfon(String str, boolean z10, boolean z11, zzfom zzfomVar) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfoj) {
            zzfoj zzfojVar = (zzfoj) obj;
            if (this.zza.equals(zzfojVar.zzb()) && this.zzb == zzfojVar.zzd() && this.zzc == zzfojVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.zza.hashCode() ^ 1000003;
        int i11 = 1237;
        if (true != this.zzb) {
            i10 = 1237;
        } else {
            i10 = 1231;
        }
        int i12 = ((hashCode * 1000003) ^ i10) * 1000003;
        if (true == this.zzc) {
            i11 = 1231;
        }
        return i12 ^ i11;
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.zza + ", shouldGetAdvertisingId=" + this.zzb + ", isGooglePlayServicesAvailable=" + this.zzc + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfoj
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfoj
    public final boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfoj
    public final boolean zzd() {
        return this.zzb;
    }
}
