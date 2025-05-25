package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzekr implements zzeet {
    private final zzbcr zza;
    private final zzgcu zzb;
    private final zzfjl zzc;
    private final zzela zzd;

    public zzekr(zzfjl zzfjlVar, zzgcu zzgcuVar, zzbcr zzbcrVar, zzela zzelaVar) {
        this.zzc = zzfjlVar;
        this.zzb = zzgcuVar;
        this.zza = zzbcrVar;
        this.zzd = zzelaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeet
    public final y9.a zza(zzfex zzfexVar, zzfel zzfelVar) {
        zzbzt zzbztVar = new zzbzt();
        zzekw zzekwVar = new zzekw();
        zzekwVar.zzd(new zzekq(this, zzbztVar, zzfexVar, zzfelVar, zzekwVar));
        zzfeq zzfeqVar = zzfelVar.zzs;
        final zzbcm zzbcmVar = new zzbcm(zzekwVar, zzfeqVar.zzb, zzfeqVar.zza);
        zzfjf zzfjfVar = zzfjf.CUSTOM_RENDER_SYN;
        return zzfiv.zzd(new zzfip() { // from class: com.google.android.gms.internal.ads.zzekp
            @Override // com.google.android.gms.internal.ads.zzfip
            public final void zza() {
                zzekr.this.zzc(zzbcmVar);
            }
        }, this.zzb, zzfjfVar, this.zzc).zzb(zzfjf.CUSTOM_RENDER_ACK).zzd(zzbztVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeet
    public final boolean zzb(zzfex zzfexVar, zzfel zzfelVar) {
        zzfeq zzfeqVar;
        if (this.zza != null && (zzfeqVar = zzfelVar.zzs) != null && zzfeqVar.zza != null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void zzc(zzbcm zzbcmVar) {
        this.zza.zze(zzbcmVar);
    }
}
