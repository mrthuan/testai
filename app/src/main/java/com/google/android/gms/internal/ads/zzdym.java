package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdym implements zzdyo {
    private final Map zza;
    private final zzgcu zzb;
    private final zzczm zzc;

    public zzdym(Map map, zzgcu zzgcuVar, zzczm zzczmVar) {
        this.zza = map;
        this.zzb = zzgcuVar;
        this.zzc = zzczmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyo
    public final y9.a zzb(final zzbvb zzbvbVar) {
        this.zzc.zzdn(zzbvbVar);
        y9.a zzg = zzgcj.zzg(new zzdwl(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhs)).split(",")) {
            final zzhfu zzhfuVar = (zzhfu) this.zza.get(str.trim());
            if (zzhfuVar != null) {
                zzg = zzgcj.zzf(zzg, zzdwl.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdyk
                    @Override // com.google.android.gms.internal.ads.zzgbq
                    public final y9.a zza(Object obj) {
                        zzdwl zzdwlVar = (zzdwl) obj;
                        return ((zzdyo) zzhfu.this.zzb()).zzb(zzbvbVar);
                    }
                }, this.zzb);
            }
        }
        zzgcj.zzr(zzg, new zzdyl(this), zzbzo.zzf);
        return zzg;
    }
}
