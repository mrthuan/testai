package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcjh implements zzdtl {
    private final zzcif zza;
    private final zzcjn zzb;
    private Long zzc;
    private String zzd;

    public /* synthetic */ zzcjh(zzcif zzcifVar, zzcjn zzcjnVar, zzcjg zzcjgVar) {
        this.zza = zzcifVar;
        this.zzb = zzcjnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtl
    public final /* synthetic */ zzdtl zza(String str) {
        str.getClass();
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdtl
    public final /* bridge */ /* synthetic */ zzdtl zzb(long j10) {
        this.zzc = Long.valueOf(j10);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdtl
    public final zzdtm zzc() {
        zzhfk.zzc(this.zzc, Long.class);
        zzhfk.zzc(this.zzd, String.class);
        return new zzcjj(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
