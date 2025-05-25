package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfsu extends zzftm {
    private final int zza;
    private final String zzb;

    public /* synthetic */ zzfsu(int i10, String str, zzfst zzfstVar) {
        this.zza = i10;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzftm) {
            zzftm zzftmVar = (zzftm) obj;
            if (this.zza == zzftmVar.zza() && ((str = this.zzb) != null ? str.equals(zzftmVar.zzb()) : zzftmVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.zzb;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ ((this.zza ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OverlayDisplayState{statusCode=");
        sb2.append(this.zza);
        sb2.append(", sessionToken=");
        return androidx.activity.r.g(sb2, this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzftm
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzftm
    public final String zzb() {
        return this.zzb;
    }
}
