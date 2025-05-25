package com.google.android.gms.internal.ads;

import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbq {
    public static final zzbq zza = new zzbq(1.0f, 1.0f);
    public final float zzb;
    public final float zzc;
    private final int zzd;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbq(float f10, float f11) {
        boolean z10;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzd(z10);
        zzdi.zzd(f11 > 0.0f);
        this.zzb = f10;
        this.zzc = f11;
        this.zzd = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbq.class == obj.getClass()) {
            zzbq zzbqVar = (zzbq) obj;
            if (this.zzb == zzbqVar.zzb && this.zzc == zzbqVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.zzc) + ((Float.floatToRawIntBits(this.zzb) + 527) * 31);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.zzb), Float.valueOf(this.zzc));
    }

    public final long zza(long j10) {
        return j10 * this.zzd;
    }
}
