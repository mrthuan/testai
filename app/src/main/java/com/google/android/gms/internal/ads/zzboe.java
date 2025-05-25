package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzboe {
    private static zzboe zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    public static zzboe zza() {
        if (zza == null) {
            zza = new zzboe();
        }
        return zza;
    }

    public final Thread zzb(final Context context, final String str) {
        if (!this.zzb.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbod
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                zzbbw.zza(context2);
                zzbbn zzbbnVar = zzbbw.zzan;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
                if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                    return;
                }
                Bundle bundle = new Bundle();
                zzbbn zzbbnVar2 = zzbbw.zzac;
                zzbbu zzbbuVar = zzbaVar.c;
                bundle.putBoolean("measurementEnabled", ((Boolean) zzbbuVar.zza(zzbbnVar2)).booleanValue());
                if (((Boolean) zzbbuVar.zza(zzbbw.zzaj)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((zzcgi) com.google.android.gms.ads.internal.util.client.zzq.a(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.internal.ads.zzboc
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.google.android.gms.ads.internal.util.client.zzo
                        public final Object zza(Object obj) {
                            return zzcgh.zzb(obj);
                        }
                    })).zze(new ObjectWrapper(context2), new zzbob(com.google.android.gms.internal.measurement.zzef.zzg(context2, "FA-Ads", "am", str, bundle).zzd()));
                } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException e10) {
                    com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
                }
            }
        });
        thread.start();
        return thread;
    }
}
