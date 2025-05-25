package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcij implements zzcox {
    private final zzcif zza;
    private zzfcg zzb;
    private zzfbj zzc;
    private zzdck zzd;
    private zzcwa zze;

    public /* synthetic */ zzcij(zzcif zzcifVar, zzcii zzciiVar) {
        this.zza = zzcifVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final /* synthetic */ zzcvw zza(zzfbj zzfbjVar) {
        this.zzc = zzfbjVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final /* synthetic */ zzcvw zzb(zzfcg zzfcgVar) {
        this.zzb = zzfcgVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcox
    public final /* synthetic */ zzcox zzc(zzdck zzdckVar) {
        this.zzd = zzdckVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcox
    public final /* synthetic */ zzcox zzd(zzcwa zzcwaVar) {
        this.zze = zzcwaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    /* renamed from: zze */
    public final zzcoy zzh() {
        zzhfk.zzc(this.zzd, zzdck.class);
        zzhfk.zzc(this.zze, zzcwa.class);
        return new zzcil(this.zza, new zzcte(), new zzfgm(), new zzcvd(), new zzdsy(), this.zzd, this.zze, zzeiy.zza(), null, this.zzb, this.zzc, null);
    }
}
