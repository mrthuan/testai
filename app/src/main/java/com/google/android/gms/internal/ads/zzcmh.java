package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcmh implements zzcly {
    private final zzeer zza;

    public zzcmh(zzeer zzeerVar) {
        this.zza = zzeerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcly
    public final void zza(Map map) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjz)).booleanValue()) {
            return;
        }
        zzgcj.zzf(zzgca.zzu(this.zza.zza(true)), Throwable.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzcmg
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                Throwable th2 = (Throwable) obj;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjA)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzu.B.f10557g.zzx(th2, "GetTopicsApiWithRecordObservationActionHandlerUnsampled");
                } else {
                    com.google.android.gms.ads.internal.zzu.B.f10557g.zzv(th2, "GetTopicsApiWithRecordObservationActionHandler");
                }
                return zzgcj.zzh(new androidx.privacysandbox.ads.adservices.topics.b(zzfxr.zzm()));
            }
        }, zzbzo.zza);
    }
}
