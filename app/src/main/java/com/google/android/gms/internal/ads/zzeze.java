package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeze implements zzevo {
    private final zzbze zza;
    private final boolean zzb;
    private final boolean zzc;
    private final ScheduledExecutorService zzd;
    private final zzgcu zze;

    public zzeze(zzbze zzbzeVar, boolean z10, boolean z11, zzbyt zzbytVar, zzgcu zzgcuVar, String str, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzbzeVar;
        this.zzb = z10;
        this.zzc = z11;
        this.zze = zzgcuVar;
        this.zzd = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgu)).booleanValue() && this.zzc) {
            return zzgcj.zzh(null);
        }
        if (!this.zzb) {
            return zzgcj.zzh(null);
        }
        return zzgcj.zze(zzgcj.zzo(zzgcj.zzm(zzgcj.zzh(null), new zzful() { // from class: com.google.android.gms.internal.ads.zzezc
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new zzezf(str);
            }
        }, this.zze), ((Long) zzbeg.zza.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd), Exception.class, new zzful() { // from class: com.google.android.gms.internal.ads.zzezd
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                zzeze.this.zzc((Exception) obj);
                return null;
            }
        }, this.zze);
    }

    public final /* synthetic */ zzezf zzc(Exception exc) {
        this.zza.zzw(exc, "TrustlessTokenSignal");
        return null;
    }
}
