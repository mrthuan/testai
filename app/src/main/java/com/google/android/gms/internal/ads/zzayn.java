package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzayn implements Runnable {
    final /* synthetic */ zzayo zza;

    public zzayn(zzayo zzayoVar) {
        this.zza = zzayoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z10;
        boolean z11;
        List<zzayp> list;
        obj = this.zza.zzc;
        synchronized (obj) {
            try {
                zzayo zzayoVar = this.zza;
                z10 = zzayoVar.zzd;
                if (z10) {
                    z11 = zzayoVar.zze;
                    if (z11) {
                        zzayoVar.zzd = false;
                        com.google.android.gms.ads.internal.util.client.zzm.b("App went background");
                        list = this.zza.zzf;
                        for (zzayp zzaypVar : list) {
                            try {
                                zzaypVar.zza(false);
                            } catch (Exception unused) {
                                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                            }
                        }
                    }
                }
                com.google.android.gms.ads.internal.util.client.zzm.b("App is still foreground");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
