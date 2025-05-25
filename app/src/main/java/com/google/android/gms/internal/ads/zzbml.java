package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbml implements zzbix {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbmz zzb;
    final /* synthetic */ zzblv zzc;
    final /* synthetic */ zzbna zzd;

    public zzbml(zzbna zzbnaVar, long j10, zzbmz zzbmzVar, zzblv zzblvVar) {
        this.zza = j10;
        this.zzb = zzbmzVar;
        this.zzc = zzblvVar;
        this.zzd = zzbnaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        Object obj2;
        zzbnb zzbnbVar = (zzbnb) obj;
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        long currentTimeMillis = System.currentTimeMillis() - this.zza;
        com.google.android.gms.ads.internal.util.zze.h("onGmsg /jsLoaded. JsLoaded latency is " + currentTimeMillis + " ms.");
        com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        obj2 = this.zzd.zza;
        synchronized (obj2) {
            com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            if (this.zzb.zze() != -1 && this.zzb.zze() != 1) {
                this.zzd.zzi = 0;
                zzblv zzblvVar = this.zzc;
                zzblvVar.zzq("/log", zzbiw.zzg);
                zzblvVar.zzq("/result", zzbiw.zzo);
                this.zzb.zzi(this.zzc);
                this.zzd.zzh = this.zzb;
                com.google.android.gms.ads.internal.util.zze.h("Successfully loaded JS Engine.");
                com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
