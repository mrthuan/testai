package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public class zzbdc {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbdc(String str, Object obj, int i10) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i10;
    }

    public static zzbdc zza(String str, double d10) {
        return new zzbdc(str, Double.valueOf(d10), 3);
    }

    public static zzbdc zzb(String str, long j10) {
        return new zzbdc(str, Long.valueOf(j10), 2);
    }

    public static zzbdc zzc(String str, String str2) {
        return new zzbdc(str, str2, 4);
    }

    public static zzbdc zzd(String str, boolean z10) {
        return new zzbdc(str, Boolean.valueOf(z10), 1);
    }

    public final Object zze() {
        zzbeh zza = zzbej.zza();
        if (zza == null) {
            if (zzbej.zzb() != null) {
                zzbej.zzb().zza();
            }
            return this.zzb;
        }
        int i10 = this.zzc - 1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return zza.zzd(this.zza, (String) this.zzb);
                }
                return zza.zzb(this.zza, ((Double) this.zzb).doubleValue());
            }
            return zza.zzc(this.zza, ((Long) this.zzb).longValue());
        }
        return zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
    }
}
