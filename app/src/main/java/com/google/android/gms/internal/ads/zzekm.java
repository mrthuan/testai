package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzekm implements zzeet {
    private final Context zza;
    private final zzcql zzb;
    private final zzbcr zzc;
    private final zzgcu zzd;
    private final zzfjl zze;

    public zzekm(Context context, zzcql zzcqlVar, zzfjl zzfjlVar, zzgcu zzgcuVar, zzbcr zzbcrVar) {
        this.zza = context;
        this.zzb = zzcqlVar;
        this.zze = zzfjlVar;
        this.zzd = zzgcuVar;
        this.zzc = zzbcrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeet
    public final y9.a zza(zzfex zzfexVar, zzfel zzfelVar) {
        zzekk zzekkVar = new zzekk(this, new View(this.zza), null, new zzcrs() { // from class: com.google.android.gms.internal.ads.zzeki
            @Override // com.google.android.gms.internal.ads.zzcrs
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return null;
            }
        }, (zzfem) zzfelVar.zzu.get(0));
        zzcpl zza = this.zzb.zza(new zzcsk(zzfexVar, zzfelVar, null), zzekkVar);
        zzekl zzl = zza.zzl();
        zzfeq zzfeqVar = zzfelVar.zzs;
        final zzbcm zzbcmVar = new zzbcm(zzl, zzfeqVar.zzb, zzfeqVar.zza);
        zzfjf zzfjfVar = zzfjf.CUSTOM_RENDER_SYN;
        return zzfiv.zzd(new zzfip() { // from class: com.google.android.gms.internal.ads.zzekj
            @Override // com.google.android.gms.internal.ads.zzfip
            public final void zza() {
                zzekm.this.zzc(zzbcmVar);
            }
        }, this.zzd, zzfjfVar, this.zze).zzb(zzfjf.CUSTOM_RENDER_ACK).zzd(zzgcj.zzh(zza.zza())).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeet
    public final boolean zzb(zzfex zzfexVar, zzfel zzfelVar) {
        zzfeq zzfeqVar;
        if (this.zzc != null && (zzfeqVar = zzfelVar.zzs) != null && zzfeqVar.zza != null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void zzc(zzbcm zzbcmVar) {
        this.zzc.zze(zzbcmVar);
    }
}
