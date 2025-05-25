package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhfr implements zzhfl {
    private static final Object zza = new Object();
    private volatile zzhfl zzb;
    private volatile Object zzc = zza;

    private zzhfr(zzhfl zzhflVar) {
        this.zzb = zzhflVar;
    }

    public static zzhfl zza(zzhfl zzhflVar) {
        if (!(zzhflVar instanceof zzhfr) && !(zzhflVar instanceof zzhfb)) {
            return new zzhfr(zzhflVar);
        }
        return zzhflVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj == zza) {
            zzhfl zzhflVar = this.zzb;
            if (zzhflVar == null) {
                return this.zzc;
            }
            Object zzb = zzhflVar.zzb();
            this.zzc = zzb;
            this.zzb = null;
            return zzb;
        }
        return obj;
    }
}
