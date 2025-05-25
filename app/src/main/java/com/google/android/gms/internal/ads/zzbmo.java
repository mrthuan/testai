package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbmo implements Runnable {
    final /* synthetic */ zzbmz zza;
    final /* synthetic */ zzblv zzb;
    final /* synthetic */ ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzbna zze;

    public zzbmo(zzbna zzbnaVar, zzbmz zzbmzVar, zzblv zzblvVar, ArrayList arrayList, long j10) {
        this.zza = zzbmzVar;
        this.zzb = zzblvVar;
        this.zzc = arrayList;
        this.zzd = j10;
        this.zze = zzbnaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i10;
        String concat;
        com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        obj = this.zze.zza;
        synchronized (obj) {
            com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
            if (this.zza.zze() != -1 && this.zza.zze() != 1) {
                zzbbn zzbbnVar = zzbbw.zzgS;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
                if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                    this.zza.zzh(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                } else {
                    this.zza.zzg();
                }
                zzgcu zzgcuVar = zzbzo.zze;
                final zzblv zzblvVar = this.zzb;
                Objects.requireNonNull(zzblvVar);
                zzgcuVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmn
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzblv.this.zzc();
                    }
                });
                String valueOf = String.valueOf(zzbaVar.c.zza(zzbbw.zzc));
                int zze = this.zza.zze();
                i10 = this.zze.zzi;
                if (this.zzc.isEmpty()) {
                    concat = ". Still waiting for the engine to be loaded";
                } else {
                    concat = ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ".concat(String.valueOf(this.zzc.get(0)));
                }
                com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
                long currentTimeMillis = System.currentTimeMillis() - this.zzd;
                com.google.android.gms.ads.internal.util.zze.h("Could not finish the full JS engine loading in " + valueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + zze + ". Update status(fullLoadTimeout) is " + i10 + concat + " ms. Total latency(fullLoadTimeout) is " + currentTimeMillis + " ms at timeout. Rejecting.");
                com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
        }
    }
}
