package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcjx implements zzfcr {
    private final zzcif zza;
    private final zzhfl zzb;
    private final zzhfl zzc;
    private final zzhfl zzd;
    private final zzhfl zze;
    private final zzhfl zzf;
    private final zzhfl zzg;
    private final zzhfl zzh;

    public /* synthetic */ zzcjx(zzcif zzcifVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcjw zzcjwVar) {
        zzhfl zzhflVar;
        zzhfl zzhflVar2;
        zzhfl zzhflVar3;
        zzhfl zzhflVar4;
        zzhfl zzhflVar5;
        zzhfl zzhflVar6;
        zzhfl zzhflVar7;
        this.zza = zzcifVar;
        zzhfc zza = zzhfd.zza(context);
        this.zzb = zza;
        zzhfc zza2 = zzhfd.zza(zzqVar);
        this.zzc = zza2;
        zzhfc zza3 = zzhfd.zza(str);
        this.zzd = zza3;
        zzhflVar = zzcifVar.zzM;
        zzhfl zzc = zzhfb.zzc(new zzeml(zzhflVar));
        this.zze = zzc;
        zzhflVar2 = zzcifVar.zzaH;
        zzhfl zzc2 = zzhfb.zzc(new zzfdp(zzhflVar2));
        this.zzf = zzc2;
        zzhflVar3 = zzcifVar.zzc;
        zzhflVar4 = zzcifVar.zzO;
        zzhfl zzc3 = zzhfb.zzc(new zzfcp(zza, zzhflVar3, zzhflVar4, zzc, zzc2, zzffi.zza()));
        this.zzg = zzc3;
        zzhflVar5 = zzcifVar.zzl;
        zzhflVar6 = zzcifVar.zzQ;
        zzhflVar7 = zzcifVar.zzM;
        this.zzh = zzhfb.zzc(new zzemt(zza, zza2, zza3, zzc3, zzc, zzc2, zzhflVar5, zzhflVar6, zzhflVar7));
    }

    @Override // com.google.android.gms.internal.ads.zzfcr
    public final zzems zza() {
        return (zzems) this.zzh.zzb();
    }
}
