package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfso extends zzfsz {
    private final String zza;
    private final String zzb;

    public /* synthetic */ zzfso(String str, String str2, zzfsn zzfsnVar) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfsz) {
            zzfsz zzfszVar = (zzfsz) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzfszVar.zzb()) : zzfszVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzfszVar.zza()) : zzfszVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.zza;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.zzb;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OverlayDisplayDismissRequest{sessionToken=");
        sb2.append(this.zza);
        sb2.append(", appId=");
        return androidx.activity.r.g(sb2, this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfsz
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfsz
    public final String zzb() {
        return this.zza;
    }
}
