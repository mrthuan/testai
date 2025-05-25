package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfce implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;
    private final zzhfu zzc;

    public zzfce(zzhfu zzhfuVar, zzhfu zzhfuVar2, zzhfu zzhfuVar3) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
        this.zzc = zzhfuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    /* renamed from: zza */
    public final zzfcc zzb() {
        zzbyy zzi;
        Context context = (Context) this.zza.zzb();
        zzfgq zzfgqVar = (zzfgq) this.zzb.zzb();
        zzfhi zzfhiVar = (zzfhi) this.zzc.zzb();
        zzbbn zzbbnVar = zzbbw.zzfG;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            zzi = com.google.android.gms.ads.internal.zzu.B.f10557g.zzi().zzh();
        } else {
            zzi = com.google.android.gms.ads.internal.zzu.B.f10557g.zzi().zzi();
        }
        boolean z10 = false;
        if (zzi != null && zzi.zzh()) {
            z10 = true;
        }
        if (((Integer) zzbaVar.c.zza(zzbbw.zzfW)).intValue() > 0) {
            if (!((Boolean) zzbaVar.c.zza(zzbbw.zzfF)).booleanValue() || z10) {
                zzfhh zza = zzfhiVar.zza(zzfgy.AppOpen, context, zzfgqVar, new zzfbg(new zzfbd()));
                zzfbs zzfbsVar = new zzfbs(new zzfbr());
                zzfgu zzfguVar = zza.zza;
                zzgcu zzgcuVar = zzbzo.zza;
                return new zzfbi(zzfbsVar, new zzfbo(zzfguVar, zzgcuVar), zza.zzb, zza.zza.zza().zzf, zzgcuVar);
            }
        }
        return new zzfbr();
    }
}
