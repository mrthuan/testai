package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeyn implements zzevo {
    final ScheduledExecutorService zza;

    public zzeyn(zzbsr zzbsrVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        return zzgcj.zzm(zzgcj.zzo(zzgcj.zzh(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdK)).longValue(), TimeUnit.MILLISECONDS, this.zza), new zzful() { // from class: com.google.android.gms.internal.ads.zzeym
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                return new zzeyo((Bundle) obj);
            }
        }, zzbzo.zza);
    }
}
