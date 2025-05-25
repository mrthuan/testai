package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdtw implements zzdtk {
    private final long zza;
    private final zzems zzb;

    public zzdtw(long j10, Context context, zzdtp zzdtpVar, zzcgj zzcgjVar, String str) {
        this.zza = j10;
        zzfcq zzv = zzcgjVar.zzv();
        zzv.zzc(context);
        zzv.zza(new com.google.android.gms.ads.internal.client.zzq());
        zzv.zzb(str);
        zzems zza = zzv.zzd().zza();
        this.zzb = zza;
        zza.zzD(new zzdtv(this, zzdtpVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdtk
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdtk
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzab(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtk
    public final void zzc() {
        this.zzb.zzW(new ObjectWrapper(null));
    }
}
