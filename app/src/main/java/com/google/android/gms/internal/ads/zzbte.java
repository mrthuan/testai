package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbte {
    private static zzbym zza;
    private final Context zzb;
    private final AdFormat zzc;
    private final com.google.android.gms.ads.internal.client.zzdx zzd;
    private final String zze;

    public zzbte(Context context, AdFormat adFormat, com.google.android.gms.ads.internal.client.zzdx zzdxVar, String str) {
        this.zzb = context;
        this.zzc = adFormat;
        this.zzd = zzdxVar;
        this.zze = str;
    }

    public static zzbym zza(Context context) {
        zzbym zzbymVar;
        synchronized (zzbte.class) {
            try {
                if (zza == null) {
                    com.google.android.gms.ads.internal.client.zzaw zzawVar = com.google.android.gms.ads.internal.client.zzay.f10107f.f10109b;
                    zzboi zzboiVar = new zzboi();
                    zzawVar.getClass();
                    zza = (zzbym) new k7.c(context, zzboiVar).d(context, false);
                }
                zzbymVar = zza;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzbymVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.client.zzl a10;
        long currentTimeMillis = System.currentTimeMillis();
        zzbym zza2 = zza(this.zzb);
        if (zza2 == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        Context context = this.zzb;
        com.google.android.gms.ads.internal.client.zzdx zzdxVar = this.zzd;
        ObjectWrapper objectWrapper = new ObjectWrapper(context);
        if (zzdxVar == null) {
            com.google.android.gms.ads.internal.client.zzm zzmVar = new com.google.android.gms.ads.internal.client.zzm();
            zzmVar.f10236m = currentTimeMillis;
            a10 = zzmVar.a();
        } else {
            zzdxVar.f10143k = currentTimeMillis;
            Context context2 = this.zzb;
            com.google.android.gms.ads.internal.client.zzdx zzdxVar2 = this.zzd;
            com.google.android.gms.ads.internal.client.zzp.f10237a.getClass();
            a10 = com.google.android.gms.ads.internal.client.zzp.a(context2, zzdxVar2);
        }
        try {
            zza2.zzf(objectWrapper, new zzbyq(this.zze, this.zzc.name(), null, a10), new zzbtd(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
