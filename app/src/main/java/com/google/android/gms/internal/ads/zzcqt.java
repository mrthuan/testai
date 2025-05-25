package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcqt implements zzhfc {
    private final zzhfu zza;

    public zzcqt(zzhfu zzhfuVar) {
        this.zza = zzhfuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    /* renamed from: zza */
    public final Boolean zzb() {
        boolean z10 = true;
        if (((zzcwh) this.zza).zza().zza() == null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeV)).booleanValue()) {
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }
}
