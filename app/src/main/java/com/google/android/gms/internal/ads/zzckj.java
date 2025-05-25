package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzckj implements com.google.android.gms.ads.nonagon.signalgeneration.zzr {
    private final zzcif zza;
    private zzcwa zzb;
    private com.google.android.gms.ads.nonagon.signalgeneration.zzap zzc;

    public /* synthetic */ zzckj(zzcif zzcifVar, zzcki zzckiVar) {
        this.zza = zzcifVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzr
    public final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzr zza(zzcwa zzcwaVar) {
        this.zzb = zzcwaVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzr
    public final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzr zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzap zzapVar) {
        this.zzc = zzapVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzr
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzs zzc() {
        zzhfk.zzc(this.zzb, zzcwa.class);
        zzhfk.zzc(this.zzc, com.google.android.gms.ads.nonagon.signalgeneration.zzap.class);
        return new zzckl(this.zza, this.zzc, new zzcte(), new zzcvd(), new zzdsy(), this.zzb, null, null, null);
    }
}
