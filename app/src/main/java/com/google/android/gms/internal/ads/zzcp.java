package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcp {
    public static final zzcp zza = new zzcp(0, 0, 0, 1.0f);
    public final int zzb;
    public final int zzc;
    public final int zzd = 0;
    public final float zze;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public zzcp(int i10, int i11, int i12, float f10) {
        this.zzb = i10;
        this.zzc = i11;
        this.zze = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcp) {
            zzcp zzcpVar = (zzcp) obj;
            if (this.zzb == zzcpVar.zzb && this.zzc == zzcpVar.zzc && this.zze == zzcpVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((this.zzb + 217) * 31) + this.zzc;
        return Float.floatToRawIntBits(this.zze) + (i10 * 961);
    }
}
