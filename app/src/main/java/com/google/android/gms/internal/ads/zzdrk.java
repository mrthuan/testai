package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbbc;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdrk implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;
    private final zzhfu zzc;

    public zzdrk(zzhfu zzhfuVar, zzhfu zzhfuVar2, zzhfu zzhfuVar3, zzhfu zzhfuVar4) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
        this.zzc = zzhfuVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final Object zzb() {
        Set emptySet;
        final String str = (String) this.zza.zzb();
        Context zza = ((zzcgp) this.zzb).zza();
        zzgcu zzgcuVar = zzbzo.zza;
        zzhfk.zzb(zzgcuVar);
        Map zzb = ((zzhfg) this.zzc).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzet)).booleanValue()) {
            zzbav zzbavVar = new zzbav(new zzbbb(zza));
            zzbavVar.zzb(new zzbau() { // from class: com.google.android.gms.internal.ads.zzdrl
                @Override // com.google.android.gms.internal.ads.zzbau
                public final void zza(zzbbc.zzt.zza zzaVar) {
                    zzaVar.zzO(str);
                }
            });
            emptySet = Collections.singleton(new zzdei(new zzdrn(zzbavVar, zzb), zzgcuVar));
        } else {
            emptySet = Collections.emptySet();
        }
        zzhfk.zzb(emptySet);
        return emptySet;
    }
}
