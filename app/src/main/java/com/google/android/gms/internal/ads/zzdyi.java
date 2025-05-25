package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzdyi implements zzczo {
    private final Context zza;
    private final zzbya zzb;

    public zzdyi(Context context, zzbya zzbyaVar) {
        this.zza = context;
        this.zzb = zzbyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdo(zzfex zzfexVar) {
        if (!TextUtils.isEmpty(zzfexVar.zzb.zzb.zze)) {
            this.zzb.zzm(this.zza, zzfexVar.zza.zza.zzd);
            this.zzb.zzi(this.zza, zzfexVar.zzb.zzb.zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdn(zzbvb zzbvbVar) {
    }
}
