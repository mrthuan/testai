package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeph implements zzevo {
    final zzbze zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzgcu zzd;
    private final Context zze;

    public zzeph(Context context, zzbze zzbzeVar, ScheduledExecutorService scheduledExecutorService, zzgcu zzgcuVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzcA)).booleanValue()) {
            this.zzb = new com.google.android.gms.internal.appset.zzr(context);
        }
        this.zze = context;
        this.zza = zzbzeVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        Task<AppSetIdInfo> appSetIdInfo;
        zzbbn zzbbnVar = zzbbw.zzcw;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            if (!((Boolean) zzbaVar.c.zza(zzbbw.zzcB)).booleanValue()) {
                if (!((Boolean) zzbaVar.c.zza(zzbbw.zzcx)).booleanValue()) {
                    return zzgcj.zzm(zzfsf.zza(this.zzb.getAppSetIdInfo(), null), new zzful() { // from class: com.google.android.gms.internal.ads.zzepe
                        @Override // com.google.android.gms.internal.ads.zzful
                        public final Object apply(Object obj) {
                            AppSetIdInfo appSetIdInfo2 = (AppSetIdInfo) obj;
                            return new zzepi(appSetIdInfo2.f10793a, appSetIdInfo2.f10794b);
                        }
                    }, zzbzo.zzf);
                }
                if (((Boolean) zzbaVar.c.zza(zzbbw.zzcA)).booleanValue()) {
                    appSetIdInfo = zzfgl.zza(this.zze);
                } else {
                    appSetIdInfo = this.zzb.getAppSetIdInfo();
                }
                if (appSetIdInfo == null) {
                    return zzgcj.zzh(new zzepi(null, -1));
                }
                y9.a zzn = zzgcj.zzn(zzfsf.zza(appSetIdInfo, null), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzepf
                    @Override // com.google.android.gms.internal.ads.zzgbq
                    public final y9.a zza(Object obj) {
                        AppSetIdInfo appSetIdInfo2 = (AppSetIdInfo) obj;
                        if (appSetIdInfo2 == null) {
                            return zzgcj.zzh(new zzepi(null, -1));
                        }
                        return zzgcj.zzh(new zzepi(appSetIdInfo2.f10793a, appSetIdInfo2.f10794b));
                    }
                }, zzbzo.zzf);
                if (((Boolean) zzbaVar.c.zza(zzbbw.zzcy)).booleanValue()) {
                    zzn = zzgcj.zzo(zzn, ((Long) zzbaVar.c.zza(zzbbw.zzcz)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgcj.zze(zzn, Exception.class, new zzful() { // from class: com.google.android.gms.internal.ads.zzepg
                    @Override // com.google.android.gms.internal.ads.zzful
                    public final Object apply(Object obj) {
                        zzeph.this.zza.zzw((Exception) obj, "AppSetIdInfoSignal");
                        return new zzepi(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzgcj.zzh(new zzepi(null, -1));
    }
}
