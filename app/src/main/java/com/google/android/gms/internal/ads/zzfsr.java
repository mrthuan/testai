package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfsr extends zzftk {
    private final IBinder zza;
    private final String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;
    private final String zzf;

    public /* synthetic */ zzfsr(IBinder iBinder, String str, int i10, float f10, int i11, int i12, String str2, int i13, String str3, String str4, String str5, zzfsq zzfsqVar) {
        this.zza = iBinder;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = f10;
        this.zze = i13;
        this.zzf = str4;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzftk) {
            zzftk zzftkVar = (zzftk) obj;
            if (this.zza.equals(zzftkVar.zzf()) && ((str = this.zzb) != null ? str.equals(zzftkVar.zzh()) : zzftkVar.zzh() == null) && this.zzc == zzftkVar.zzc() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzftkVar.zza())) {
                zzftkVar.zzb();
                zzftkVar.zzd();
                zzftkVar.zzj();
                if (this.zze == zzftkVar.zze()) {
                    zzftkVar.zzi();
                    String str2 = this.zzf;
                    if (str2 != null ? str2.equals(zzftkVar.zzg()) : zzftkVar.zzg() == null) {
                        zzftkVar.zzk();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int floatToIntBits = (((((hashCode2 * 1000003) ^ hashCode) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd);
        int i11 = this.zze;
        String str2 = this.zzf;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((((floatToIntBits * 1525764945) ^ i11) * (-721379959)) ^ i10) * 1000003;
    }

    public final String toString() {
        StringBuilder g10 = b.a.g("OverlayDisplayShowRequest{windowToken=", this.zza.toString(), ", appId=");
        g10.append(this.zzb);
        g10.append(", layoutGravity=");
        g10.append(this.zzc);
        g10.append(", layoutVerticalMargin=");
        g10.append(this.zzd);
        g10.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        g10.append(this.zze);
        g10.append(", deeplinkUrl=null, adFieldEnifd=");
        return androidx.activity.r.g(g10, this.zzf, ", thirdPartyAuthCallerId=null}");
    }

    @Override // com.google.android.gms.internal.ads.zzftk
    public final float zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzftk
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzftk
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzftk
    public final int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzftk
    public final int zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzftk
    public final IBinder zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzftk
    public final String zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzftk
    public final String zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzftk
    public final String zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzftk
    public final String zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzftk
    public final String zzk() {
        return null;
    }
}
