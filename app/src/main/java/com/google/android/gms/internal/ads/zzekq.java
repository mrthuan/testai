package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzekq implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzbzt zza;
    final /* synthetic */ zzfex zzb;
    final /* synthetic */ zzfel zzc;
    final /* synthetic */ zzekw zzd;
    final /* synthetic */ zzekr zze;

    public zzekq(zzekr zzekrVar, zzbzt zzbztVar, zzfex zzfexVar, zzfel zzfelVar, zzekw zzekwVar) {
        this.zza = zzbztVar;
        this.zzb = zzfexVar;
        this.zzc = zzfelVar;
        this.zzd = zzekwVar;
        this.zze = zzekrVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
        zzela zzelaVar;
        zzekw zzekwVar = this.zzd;
        zzelaVar = this.zze.zzd;
        this.zza.zzc(zzelaVar.zza(this.zzb, this.zzc, view, zzekwVar));
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
    }
}
