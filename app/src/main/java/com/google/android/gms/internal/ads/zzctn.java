package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzctn implements zzhfc {
    private final zzhfu zza;

    public zzctn(zzhfu zzhfuVar) {
        this.zza = zzhfuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final Object zzb() {
        zzfxw zzn;
        zzctz zzctzVar = (zzctz) this.zza.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeZ)).booleanValue()) {
            zzn = zzfxw.zzo(new zzdei(zzctzVar, zzbzo.zzf));
        } else {
            zzn = zzfxw.zzn();
        }
        zzhfk.zzb(zzn);
        return zzn;
    }
}
