package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdtp {
    private final zzbjw zza;

    public zzdtp(zzbjw zzbjwVar) {
        this.zza = zzbjwVar;
    }

    private final void zzs(zzdto zzdtoVar) {
        String zza = zzdto.zza(zzdtoVar);
        com.google.android.gms.ads.internal.util.client.zzm.d("Dispatching AFMA event on publisher webview: ".concat(zza));
        this.zza.zzb(zza);
    }

    public final void zza() {
        zzs(new zzdto("initialize", null));
    }

    public final void zzb(long j10) {
        zzdto zzdtoVar = new zzdto("interstitial", null);
        zzdtoVar.zza = Long.valueOf(j10);
        zzdtoVar.zzc = "onAdClicked";
        this.zza.zzb(zzdto.zza(zzdtoVar));
    }

    public final void zzc(long j10) {
        zzdto zzdtoVar = new zzdto("interstitial", null);
        zzdtoVar.zza = Long.valueOf(j10);
        zzdtoVar.zzc = "onAdClosed";
        zzs(zzdtoVar);
    }

    public final void zzd(long j10, int i10) {
        zzdto zzdtoVar = new zzdto("interstitial", null);
        zzdtoVar.zza = Long.valueOf(j10);
        zzdtoVar.zzc = "onAdFailedToLoad";
        zzdtoVar.zzd = Integer.valueOf(i10);
        zzs(zzdtoVar);
    }

    public final void zze(long j10) {
        zzdto zzdtoVar = new zzdto("interstitial", null);
        zzdtoVar.zza = Long.valueOf(j10);
        zzdtoVar.zzc = "onAdLoaded";
        zzs(zzdtoVar);
    }

    public final void zzf(long j10) {
        zzdto zzdtoVar = new zzdto("interstitial", null);
        zzdtoVar.zza = Long.valueOf(j10);
        zzdtoVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdtoVar);
    }

    public final void zzg(long j10) {
        zzdto zzdtoVar = new zzdto("interstitial", null);
        zzdtoVar.zza = Long.valueOf(j10);
        zzdtoVar.zzc = "onAdOpened";
        zzs(zzdtoVar);
    }

    public final void zzh(long j10) {
        zzdto zzdtoVar = new zzdto("creation", null);
        zzdtoVar.zza = Long.valueOf(j10);
        zzdtoVar.zzc = "nativeObjectCreated";
        zzs(zzdtoVar);
    }

    public final void zzi(long j10) {
        zzdto zzdtoVar = new zzdto("creation", null);
        zzdtoVar.zza = Long.valueOf(j10);
        zzdtoVar.zzc = "nativeObjectNotCreated";
        zzs(zzdtoVar);
    }

    public final void zzj(long j10) {
        zzdto zzdtoVar = new zzdto("rewarded", null);
        zzdtoVar.zza = Long.valueOf(j10);
        zzdtoVar.zzc = "onAdClicked";
        zzs(zzdtoVar);
    }

    public final void zzk(long j10) {
        zzdto zzdtoVar = new zzdto("rewarded", null);
        zzdtoVar.zza = Long.valueOf(j10);
        zzdtoVar.zzc = "onRewardedAdClosed";
        zzs(zzdtoVar);
    }

    public final void zzl(long j10, zzbwd zzbwdVar) {
        zzdto zzdtoVar = new zzdto("rewarded", null);
        zzdtoVar.zza = Long.valueOf(j10);
        zzdtoVar.zzc = "onUserEarnedReward";
        zzdtoVar.zze = zzbwdVar.zzf();
        zzdtoVar.zzf = Integer.valueOf(zzbwdVar.zze());
        zzs(zzdtoVar);
    }

    public final void zzm(long j10, int i10) {
        zzdto zzdtoVar = new zzdto("rewarded", null);
        zzdtoVar.zza = Long.valueOf(j10);
        zzdtoVar.zzc = "onRewardedAdFailedToLoad";
        zzdtoVar.zzd = Integer.valueOf(i10);
        zzs(zzdtoVar);
    }

    public final void zzn(long j10, int i10) {
        zzdto zzdtoVar = new zzdto("rewarded", null);
        zzdtoVar.zza = Long.valueOf(j10);
        zzdtoVar.zzc = "onRewardedAdFailedToShow";
        zzdtoVar.zzd = Integer.valueOf(i10);
        zzs(zzdtoVar);
    }

    public final void zzo(long j10) {
        zzdto zzdtoVar = new zzdto("rewarded", null);
        zzdtoVar.zza = Long.valueOf(j10);
        zzdtoVar.zzc = "onAdImpression";
        zzs(zzdtoVar);
    }

    public final void zzp(long j10) {
        zzdto zzdtoVar = new zzdto("rewarded", null);
        zzdtoVar.zza = Long.valueOf(j10);
        zzdtoVar.zzc = "onRewardedAdLoaded";
        zzs(zzdtoVar);
    }

    public final void zzq(long j10) {
        zzdto zzdtoVar = new zzdto("rewarded", null);
        zzdtoVar.zza = Long.valueOf(j10);
        zzdtoVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdtoVar);
    }

    public final void zzr(long j10) {
        zzdto zzdtoVar = new zzdto("rewarded", null);
        zzdtoVar.zza = Long.valueOf(j10);
        zzdtoVar.zzc = "onRewardedAdOpened";
        zzs(zzdtoVar);
    }
}
