package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbv {
    public final Object zza;
    public final int zzb;
    public final zzbc zzc;
    public final Object zzd;
    public final int zze;
    public final long zzf;
    public final long zzg;
    public final int zzh;
    public final int zzi;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public zzbv(Object obj, int i10, zzbc zzbcVar, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this.zza = obj;
        this.zzb = i10;
        this.zzc = zzbcVar;
        this.zzd = obj2;
        this.zze = i11;
        this.zzf = j10;
        this.zzg = j11;
        this.zzh = i12;
        this.zzi = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbv.class == obj.getClass()) {
            zzbv zzbvVar = (zzbv) obj;
            if (this.zzb == zzbvVar.zzb && this.zze == zzbvVar.zze && this.zzf == zzbvVar.zzf && this.zzg == zzbvVar.zzg && this.zzh == zzbvVar.zzh && this.zzi == zzbvVar.zzi && zzfur.zza(this.zzc, zzbvVar.zzc) && zzfur.zza(this.zza, zzbvVar.zza) && zzfur.zza(this.zzd, zzbvVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd, Integer.valueOf(this.zze), Long.valueOf(this.zzf), Long.valueOf(this.zzg), Integer.valueOf(this.zzh), Integer.valueOf(this.zzi)});
    }
}
