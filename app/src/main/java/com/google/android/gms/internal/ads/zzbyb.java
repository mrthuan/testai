package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzbyb {
    static zzbyb zza;

    public static synchronized zzbyb zzd(Context context) {
        synchronized (zzbyb.class) {
            zzbyb zzbybVar = zza;
            if (zzbybVar != null) {
                return zzbybVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbbw.zza(applicationContext);
            com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
            com.google.android.gms.ads.internal.util.zzg zzi = zzuVar.f10557g.zzi();
            zzi.k(applicationContext);
            zzbxt zzbxtVar = new zzbxt(null);
            zzbxtVar.zzb(applicationContext);
            zzbxtVar.zzc(zzuVar.f10560j);
            zzbxtVar.zza(zzi);
            zzbxtVar.zzd(zzuVar.f10574x);
            zzbyb zze = zzbxtVar.zze();
            zza = zze;
            zze.zza().zza();
            zzbyf zzc = zza.zzc();
            zzbbn zzbbnVar = zzbbw.zzal;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                HashMap G = com.google.android.gms.ads.internal.util.zzt.G((String) zzbaVar.c.zza(zzbbw.zzam));
                for (String str : G.keySet()) {
                    zzc.zzc(str);
                }
                zzc.zzd(new zzbyd(zzc, G));
            }
            return zza;
        }
    }

    public abstract zzbxm zza();

    public abstract zzbxq zzb();

    public abstract zzbyf zzc();
}
