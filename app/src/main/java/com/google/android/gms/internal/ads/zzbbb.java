package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbbb {
    zzaxr zza;
    boolean zzb;
    private final ExecutorService zzc;

    public zzbbb() {
        this.zzc = com.google.android.gms.ads.internal.util.client.zzb.f10350b;
    }

    public zzbbb(final Context context) {
        ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.f10350b;
        this.zzc = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbaw
            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzet)).booleanValue();
                zzbbb zzbbbVar = zzbbb.this;
                Context context2 = context;
                if (booleanValue) {
                    try {
                        zzbbbVar.zza = (zzaxr) com.google.android.gms.ads.internal.util.client.zzq.a(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.internal.ads.zzbax
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.google.android.gms.ads.internal.util.client.zzo
                            public final Object zza(Object obj) {
                                return zzaxq.zzb(obj);
                            }
                        });
                        zzbbbVar.zza.zze(new ObjectWrapper(context2), "GMA_SDK");
                        zzbbbVar.zzb = true;
                    } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException unused) {
                        com.google.android.gms.ads.internal.util.client.zzm.b("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
