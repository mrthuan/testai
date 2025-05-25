package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcjn implements zzdtu {
    private final Context zza;
    private final zzbjw zzb;
    private final zzcif zzc;
    private final zzcjn zzd = this;
    private final zzhfl zze;
    private final zzhfl zzf;
    private final zzhfl zzg;
    private final zzhfl zzh;

    public /* synthetic */ zzcjn(zzcif zzcifVar, Context context, zzbjw zzbjwVar, zzcjm zzcjmVar) {
        this.zzc = zzcifVar;
        this.zza = context;
        this.zzb = zzbjwVar;
        zzhfc zza = zzhfd.zza(this);
        this.zze = zza;
        zzhfc zza2 = zzhfd.zza(zzbjwVar);
        this.zzf = zza2;
        zzdtq zzdtqVar = new zzdtq(zza2);
        this.zzg = zzdtqVar;
        this.zzh = zzhfb.zzc(new zzdts(zza, zzdtqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final zzdtl zzb() {
        return new zzcjh(this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final zzdtr zzd() {
        return (zzdtr) this.zzh.zzb();
    }
}
