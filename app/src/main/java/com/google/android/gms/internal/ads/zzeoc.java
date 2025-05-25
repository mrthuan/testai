package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeoc implements zzevo {
    private final y9.a zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    public zzeoc(y9.a aVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = aVar;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        y9.a zzn = zzgcj.zzn(this.zza, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzeny
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                final String str = (String) obj;
                return zzgcj.zzh(new zzevn() { // from class: com.google.android.gms.internal.ads.zzenx
                    @Override // com.google.android.gms.internal.ads.zzevn
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.zzb);
        zzbbn zzbbnVar = zzbbw.zzlz;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Integer) zzbaVar.c.zza(zzbbnVar)).intValue() > 0) {
            zzn = zzgcj.zzo(zzn, ((Integer) zzbaVar.c.zza(zzbbnVar)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgcj.zzf(zzn, Throwable.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzenz
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                if (((Throwable) obj) instanceof TimeoutException) {
                    return zzgcj.zzh(new zzevn() { // from class: com.google.android.gms.internal.ads.zzeoa
                        @Override // com.google.android.gms.internal.ads.zzevn
                        public final void zzj(Object obj2) {
                            ((Bundle) obj2).putString("ms", Integer.toString(17));
                        }
                    });
                }
                return zzgcj.zzh(new zzevn() { // from class: com.google.android.gms.internal.ads.zzeob
                    @Override // com.google.android.gms.internal.ads.zzevn
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putString("ms", null);
                    }
                });
            }
        }, this.zzb);
    }
}
