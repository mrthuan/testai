package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeln extends com.google.android.gms.ads.internal.client.zzbp {
    final zzffe zza;
    final zzdjk zzb;
    private final Context zzc;
    private final zzcgj zzd;
    private com.google.android.gms.ads.internal.client.zzbh zze;

    public zzeln(zzcgj zzcgjVar, Context context, String str) {
        zzffe zzffeVar = new zzffe();
        this.zza = zzffeVar;
        this.zzb = new zzdjk();
        this.zzd = zzcgjVar;
        zzffeVar.zzt(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final com.google.android.gms.ads.internal.client.zzbn zze() {
        zzdjm zzg = this.zzb.zzg();
        this.zza.zzE(zzg.zzi());
        this.zza.zzF(zzg.zzh());
        zzffe zzffeVar = this.zza;
        if (zzffeVar.zzh() == null) {
            zzffeVar.zzs(com.google.android.gms.ads.internal.client.zzq.f());
        }
        return new zzelo(this.zzc, this.zzd, this.zza, zzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(zzbgb zzbgbVar) {
        this.zzb.zza(zzbgbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbge zzbgeVar) {
        this.zzb.zzb(zzbgeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(String str, zzbgk zzbgkVar, zzbgh zzbghVar) {
        this.zzb.zzc(str, zzbgkVar, zzbghVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(zzblq zzblqVar) {
        this.zzb.zzd(zzblqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzbgo zzbgoVar, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzb.zze(zzbgoVar);
        this.zza.zzs(zzqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbgr zzbgrVar) {
        this.zzb.zzf(zzbgrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zze = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzr(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzblh zzblhVar) {
        this.zza.zzw(zzblhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbes zzbesVar) {
        this.zza.zzD(zzbesVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzG(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        this.zza.zzV(zzcfVar);
    }
}
