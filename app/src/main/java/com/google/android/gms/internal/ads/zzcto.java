package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbbc;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcto implements zzcye, com.google.android.gms.ads.internal.client.zza, zzczo, zzcxk, zzcwq, zzdca {
    private final Clock zza;
    private final zzbyx zzb;

    public zzcto(Clock clock, zzbyx zzbyxVar) {
        this.zza = clock;
        this.zzb = zzbyxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zza() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdo(zzfex zzfexVar) {
        this.zzb.zzk(this.zza.b());
    }

    public final String zzg() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzi(zzbbc.zzb zzbVar) {
        this.zzb.zzi();
    }

    public final void zzk(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzj(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzm(zzbbc.zzb zzbVar) {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcxk
    public final void zzr() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzs() {
        this.zzb.zzh(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdn(zzbvb zzbvbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzj(zzbbc.zzb zzbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzl(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzn(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzds(zzbvn zzbvnVar, String str, String str2) {
    }
}
