package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzdxy implements zzgcf {
    final /* synthetic */ Context zza;

    public zzdxy(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        if (((Boolean) zzbdk.zzh.zze()).booleanValue() && (th2 instanceof com.google.android.gms.ads.internal.util.zzba)) {
            zzbbg.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdyq zzdyqVar = (zzdyq) obj;
        if (((Boolean) zzbdk.zzj.zze()).booleanValue()) {
            zzbbg.zze(this.zza);
        }
    }
}
