package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes2.dex */
final class zzam implements zzaw {
    private final zzag zza;
    private final zzdq zzb;
    private final zzdq zzc;
    private final zzdq zzd;
    private final zzdq zze;
    private final zzdq zzf;

    public /* synthetic */ zzam(zzag zzagVar, zzbp zzbpVar, zzal zzalVar) {
        zzdq zzdqVar;
        zzdq zzdqVar2;
        zzas zzasVar;
        zzau zzauVar;
        zzdq zzdqVar3;
        zzdq zzdqVar4;
        zzdq zzdqVar5;
        zzas zzasVar2;
        zzdq zzdqVar6;
        zzdq zzdqVar7;
        zzdq zzdqVar8;
        this.zza = zzagVar;
        zzdqVar = zzagVar.zzb;
        zzdq zzb = zzdm.zzb(new zzbx(zzdqVar));
        this.zzb = zzb;
        zzdn zzb2 = zzdo.zzb(zzbpVar);
        this.zzc = zzb2;
        zzdl zzdlVar = new zzdl();
        this.zzd = zzdlVar;
        zzdqVar2 = zzagVar.zzb;
        zzasVar = zzar.zza;
        zzauVar = zzat.zza;
        zzdqVar3 = zzagVar.zzh;
        zzdqVar4 = zzagVar.zzi;
        zzdqVar5 = zzagVar.zzc;
        zzcb zzcbVar = new zzcb(zzdqVar2, zzb, zzasVar, zzauVar, zzdqVar3, zzdqVar4, zzdlVar, zzdqVar5);
        this.zze = zzcbVar;
        zzasVar2 = zzar.zza;
        zzbv zzbvVar = new zzbv(zzb, zzasVar2, zzcbVar);
        this.zzf = zzbvVar;
        zzdqVar6 = zzagVar.zzb;
        zzdqVar7 = zzagVar.zzd;
        zzdqVar8 = zzagVar.zzc;
        zzdl.zzb(zzdlVar, zzdm.zzb(new zzbc(zzdqVar6, zzdqVar7, zzb, zzdqVar8, zzb2, zzbvVar)));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzaw
    public final zzbb zza() {
        return (zzbb) this.zzd.zza();
    }
}
