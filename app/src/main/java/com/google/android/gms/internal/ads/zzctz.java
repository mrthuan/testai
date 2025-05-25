package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzctz implements zzdce, zzcye {
    private final Clock zza;
    private final zzcub zzb;
    private final zzffg zzc;
    private final String zzd;

    public zzctz(Clock clock, zzcub zzcubVar, zzffg zzffgVar, String str) {
        this.zza = clock;
        this.zzb = zzcubVar;
        this.zzc = zzffgVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdce
    public final void zza() {
        this.zzb.zze(this.zzd, this.zza.b());
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzs() {
        zzffg zzffgVar = this.zzc;
        this.zzb.zzd(zzffgVar.zzf, this.zzd, this.zza.b());
    }
}
