package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzckf implements zzdot {
    private final zzcif zza;
    private zzfcg zzb;
    private zzfbj zzc;
    private zzdck zzd;
    private zzcwa zze;

    public /* synthetic */ zzckf(zzcif zzcifVar, zzcke zzckeVar) {
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

    @Override // com.google.android.gms.internal.ads.zzdot
    public final /* synthetic */ zzdot zzc(zzdck zzdckVar) {
        this.zzd = zzdckVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    public final /* synthetic */ zzdot zzd(zzcwa zzcwaVar) {
        this.zze = zzcwaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    /* renamed from: zze */
    public final zzdou zzh() {
        zzhfk.zzc(this.zzd, zzdck.class);
        zzhfk.zzc(this.zze, zzcwa.class);
        return new zzckh(this.zza, new zzcte(), new zzfgm(), new zzcvd(), new zzdsy(), this.zzd, this.zze, zzeiy.zza(), null, this.zzb, this.zzc, null);
    }
}
