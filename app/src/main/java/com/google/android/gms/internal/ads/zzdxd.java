package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdxd implements zzhfc {
    private final zzhfu zza;

    public zzdxd(zzhfu zzhfuVar) {
        this.zza = zzhfuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    /* renamed from: zza */
    public final String zzb() {
        String packageName = ((zzcgp) this.zza).zza().getPackageName();
        zzhfk.zzb(packageName);
        return packageName;
    }
}
