package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdti implements AppEventListener, zzczo, com.google.android.gms.ads.internal.client.zza, zzcwq, zzcxk, zzcxl, zzcye, zzcwt, zzfjm {
    private final List zza;
    private final zzdsw zzb;
    private long zzc;

    public zzdti(zzdsw zzdswVar, zzcgj zzcgjVar) {
        this.zzb = zzdswVar;
        this.zza = Collections.singletonList(zzcgjVar);
    }

    private final void zzg(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzg(com.google.android.gms.ads.internal.client.zza.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        zzg(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zza() {
        zzg(zzcwq.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzb() {
        zzg(zzcwq.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzc() {
        zzg(zzcwq.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfjm
    public final void zzd(zzfjf zzfjfVar, String str) {
        zzg(zzfje.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcwt
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzg(zzcwt.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.f10146a), zzeVar.f10147b, zzeVar.c);
    }

    @Override // com.google.android.gms.internal.ads.zzfjm
    public final void zzdC(zzfjf zzfjfVar, String str) {
        zzg(zzfje.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfjm
    public final void zzdD(zzfjf zzfjfVar, String str, Throwable th2) {
        zzg(zzfje.class, "onTaskFailed", str, th2.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzfjm
    public final void zzdE(zzfjf zzfjfVar, String str) {
        zzg(zzfje.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzdj(Context context) {
        zzg(zzcxl.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzdl(Context context) {
        zzg(zzcxl.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzdm(Context context) {
        zzg(zzcxl.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdn(zzbvb zzbvbVar) {
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        this.zzc = SystemClock.elapsedRealtime();
        zzg(zzczo.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzds(zzbvn zzbvnVar, String str, String str2) {
        zzg(zzcwq.class, "onRewarded", zzbvnVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zze() {
        zzg(zzcwq.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzf() {
        zzg(zzcwq.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcxk
    public final void zzr() {
        zzg(zzcxk.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzs() {
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
        com.google.android.gms.ads.internal.util.zze.h("Ad Request Latency : " + elapsedRealtime);
        zzg(zzcye.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdo(zzfex zzfexVar) {
    }
}
