package com.google.android.gms.internal.ads;

import android.app.Activity;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzecy extends zzedu {
    private final Activity zza;
    private final com.google.android.gms.ads.internal.overlay.zzm zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzecy(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, String str, String str2, zzecx zzecxVar) {
        this.zza = activity;
        this.zzb = zzmVar;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzedu) {
            zzedu zzeduVar = (zzedu) obj;
            if (this.zza.equals(zzeduVar.zza()) && ((zzmVar = this.zzb) != null ? zzmVar.equals(zzeduVar.zzb()) : zzeduVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzeduVar.zzc()) : zzeduVar.zzc() == null) && ((str2 = this.zzd) != null ? str2.equals(zzeduVar.zzd()) : zzeduVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.zza.hashCode() ^ 1000003;
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzb;
        int i10 = 0;
        if (zzmVar == null) {
            hashCode = 0;
        } else {
            hashCode = zzmVar.hashCode();
        }
        int i11 = ((hashCode3 * 1000003) ^ hashCode) * 1000003;
        String str = this.zzc;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str2 = this.zzd;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i12 ^ i10;
    }

    public final String toString() {
        StringBuilder f10 = android.support.v4.media.session.h.f("OfflineUtilsParams{activity=", this.zza.toString(), ", adOverlay=", String.valueOf(this.zzb), ", gwsQueryId=");
        f10.append(this.zzc);
        f10.append(", uri=");
        return androidx.activity.r.g(f10, this.zzd, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzedu
    public final Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzedu
    public final com.google.android.gms.ads.internal.overlay.zzm zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzedu
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzedu
    public final String zzd() {
        return this.zzd;
    }
}
