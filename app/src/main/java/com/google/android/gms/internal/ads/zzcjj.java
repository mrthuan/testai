package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcjj implements zzdtm {
    private final Long zza;
    private final String zzb;
    private final zzcif zzc;
    private final zzcjn zzd;

    public /* synthetic */ zzcjj(zzcif zzcifVar, zzcjn zzcjnVar, Long l10, String str, zzcji zzcjiVar) {
        this.zzc = zzcifVar;
        this.zzd = zzcjnVar;
        this.zza = l10;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdtm
    public final zzdtw zza() {
        Context context;
        zzdtp zzc;
        zzcjn zzcjnVar = this.zzd;
        long longValue = this.zza.longValue();
        context = zzcjnVar.zza;
        zzc = zzdtq.zzc(zzcjnVar.zzb);
        return zzdtx.zza(longValue, context, zzc, this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdtm
    public final zzdua zzb() {
        Context context;
        zzdtp zzc;
        zzcjn zzcjnVar = this.zzd;
        long longValue = this.zza.longValue();
        context = zzcjnVar.zza;
        zzc = zzdtq.zzc(zzcjnVar.zzb);
        return zzdub.zza(longValue, context, zzc, this.zzc, this.zzb);
    }
}
