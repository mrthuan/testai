package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzb {
    public static final zzb zza = new zzb(null, new zza[0], 0, -9223372036854775807L, 0);
    private static final zza zze = new zza(0).zzb(0);
    private final zza[] zzf;
    public final long zzc = 0;
    public final int zzb = 0;
    public final int zzd = 0;

    static {
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    private zzb(Object obj, zza[] zzaVarArr, long j10, long j11, int i10) {
        this.zzf = zzaVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzb.class == obj.getClass()) {
            zzb zzbVar = (zzb) obj;
            if (zzet.zzG(null, null) && Arrays.equals(this.zzf, zzbVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (((int) (-9223372036854775807L)) * 961);
    }

    public final String toString() {
        return a0.a.h("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }

    public final zza zza(int i10) {
        if (i10 < 0) {
            return zze;
        }
        return this.zzf[i10];
    }

    public final boolean zzb(int i10) {
        zza(-1);
        int i11 = zza.zzi;
        return false;
    }
}
