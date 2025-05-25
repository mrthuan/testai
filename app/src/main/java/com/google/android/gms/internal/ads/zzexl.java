package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzexl implements zzevo {
    private final zzbze zza;
    private final ScheduledExecutorService zzb;
    private final zzgcu zzc;

    public zzexl(String str, zzazy zzazyVar, zzbze zzbzeVar, ScheduledExecutorService scheduledExecutorService, zzgcu zzgcuVar) {
        this.zza = zzbzeVar;
        this.zzb = scheduledExecutorService;
        this.zzc = zzgcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        zzbbn zzbbnVar = zzbbw.zzcw;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            if (((Boolean) zzbaVar.c.zza(zzbbw.zzcB)).booleanValue()) {
                y9.a zzn = zzgcj.zzn(zzfsf.zza(Tasks.e(null), null), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzexj
                    @Override // com.google.android.gms.internal.ads.zzgbq
                    public final y9.a zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        if (appSetIdInfo == null) {
                            return zzgcj.zzh(new zzexm(null, -1));
                        }
                        return zzgcj.zzh(new zzexm(appSetIdInfo.f10793a, appSetIdInfo.f10794b));
                    }
                }, this.zzc);
                if (((Boolean) zzbdf.zza.zze()).booleanValue()) {
                    zzn = zzgcj.zzo(zzn, ((Long) zzbdf.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
                }
                return zzgcj.zze(zzn, Exception.class, new zzful() { // from class: com.google.android.gms.internal.ads.zzexk
                    @Override // com.google.android.gms.internal.ads.zzful
                    public final Object apply(Object obj) {
                        return zzexl.this.zzc((Exception) obj);
                    }
                }, this.zzc);
            }
        }
        return zzgcj.zzh(new zzexm(null, -1));
    }

    public final /* synthetic */ zzexm zzc(Exception exc) {
        this.zza.zzw(exc, "AppSetIdInfoGmscoreSignal");
        return new zzexm(null, -1);
    }
}
