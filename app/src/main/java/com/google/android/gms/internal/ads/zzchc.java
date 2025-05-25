package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzchc implements zzhfc {
    private final zzcgm zza;

    public zzchc(zzcgm zzcgmVar) {
        this.zza = zzcgmVar;
    }

    public final VersionInfoParcel zza() {
        VersionInfoParcel zze = this.zza.zze();
        zzhfk.zzb(zze);
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final /* synthetic */ Object zzb() {
        VersionInfoParcel zze = this.zza.zze();
        zzhfk.zzb(zze);
        return zze;
    }
}
