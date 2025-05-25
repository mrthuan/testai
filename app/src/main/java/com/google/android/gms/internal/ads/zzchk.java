package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzchk implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;

    public zzchk(zzhfu zzhfuVar, zzhfu zzhfuVar2) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    /* renamed from: zza */
    public final zzbuv zzb() {
        Context zza = ((zzcgp) this.zza).zza();
        zzfki zzfkiVar = (zzfki) this.zzb.zzb();
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        zzbno zzb = zzuVar.f10566p.zzb(zza, VersionInfoParcel.d(), zzfkiVar);
        zzbni zzbniVar = zzbnl.zza;
        zzb.zza("google.afma.request.getAdDictionary", zzbniVar, zzbniVar);
        return new zzbux(zza, zzuVar.f10566p.zzb(zza, VersionInfoParcel.d(), zzfkiVar).zza("google.afma.sdkConstants.getSdkConstants", zzbniVar, zzbniVar), VersionInfoParcel.d());
    }
}
