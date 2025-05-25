package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzecv extends zzecz {
    private final String zza;
    private final String zzb;
    private final Drawable zzc;

    public zzecv(String str, String str2, Drawable drawable) {
        if (str != null) {
            this.zza = str;
            if (str2 != null) {
                this.zzb = str2;
                this.zzc = drawable;
                return;
            }
            throw new NullPointerException("Null imageUrl");
        }
        throw new NullPointerException("Null advertiserName");
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzecz) {
            zzecz zzeczVar = (zzecz) obj;
            if (this.zza.equals(zzeczVar.zzb()) && this.zzb.equals(zzeczVar.zzc()) && ((drawable = this.zzc) != null ? drawable.equals(zzeczVar.zza()) : zzeczVar.zza() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        Drawable drawable = this.zzc;
        if (drawable == null) {
            hashCode = 0;
        } else {
            hashCode = drawable.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        return "OfflineAdAssets{advertiserName=" + this.zza + ", imageUrl=" + this.zzb + ", icon=" + valueOf + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzecz
    public final Drawable zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzecz
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzecz
    public final String zzc() {
        return this.zzb;
    }
}
