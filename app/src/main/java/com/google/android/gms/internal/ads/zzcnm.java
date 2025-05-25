package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcnm implements zzcwt {
    private final zzfeo zza;
    private final zzfex zzb;
    private final zzflh zzc;
    private final zzfll zzd;

    public zzcnm(zzfex zzfexVar, zzfll zzfllVar, zzflh zzflhVar) {
        this.zzb = zzfexVar;
        this.zzd = zzfllVar;
        this.zzc = zzflhVar;
        this.zza = zzfexVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcwt
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        List list = this.zza.zza;
        this.zzd.zzd(this.zzc.zzc(this.zzb, null, list));
    }
}
