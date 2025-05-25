package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbmm implements zzbix {
    final /* synthetic */ zzblv zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzby zzb;
    final /* synthetic */ zzbna zzc;

    public zzbmm(zzbna zzbnaVar, zzauo zzauoVar, zzblv zzblvVar, com.google.android.gms.ads.internal.util.zzby zzbyVar) {
        this.zza = zzblvVar;
        this.zzb = zzbyVar;
        this.zzc = zzbnaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzbix, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        Object obj2;
        int i10;
        zzbnb zzbnbVar = (zzbnb) obj;
        com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > /requestReload handler: Lock acquired");
            com.google.android.gms.ads.internal.util.client.zzm.d("JS Engine is requesting an update");
            i10 = this.zzc.zzi;
            if (i10 == 0) {
                com.google.android.gms.ads.internal.util.client.zzm.d("Starting reload.");
                this.zzc.zzi = 2;
                this.zzc.zzd(null);
            }
            this.zza.zzr("/requestReload", this.zzb.f10441a);
        }
        com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
