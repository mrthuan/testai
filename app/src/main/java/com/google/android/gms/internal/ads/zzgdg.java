package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgdg extends zzgbz {
    private y9.a zza;
    private ScheduledFuture zzb;

    private zzgdg(y9.a aVar) {
        aVar.getClass();
        this.zza = aVar;
    }

    public static y9.a zzf(y9.a aVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgdg zzgdgVar = new zzgdg(aVar);
        zzgdd zzgddVar = new zzgdd(zzgdgVar);
        zzgdgVar.zzb = scheduledExecutorService.schedule(zzgddVar, j10, timeUnit);
        aVar.addListener(zzgddVar, zzgbx.INSTANCE);
        return zzgdgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final String zza() {
        y9.a aVar = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (aVar != null) {
            String d10 = a6.h.d("inputFuture=[", aVar.toString(), "]");
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    return d10 + ", remaining delay=[" + delay + " ms]";
                }
                return d10;
            }
            return d10;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zzb() {
        zzr(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
