package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeaz implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;
    private final zzhfu zzc;
    private final zzhfu zzd;
    private final zzhfu zze;

    public zzeaz(zzhfu zzhfuVar, zzhfu zzhfuVar2, zzhfu zzhfuVar3, zzhfu zzhfuVar4, zzhfu zzhfuVar5, zzhfu zzhfuVar6, zzhfu zzhfuVar7, zzhfu zzhfuVar8) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar4;
        this.zzc = zzhfuVar5;
        this.zzd = zzhfuVar6;
        this.zze = zzhfuVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final /* synthetic */ Object zzb() {
        Context zza = ((zzcgp) this.zza).zza();
        zzgcu zzgcuVar = zzbzo.zza;
        zzhfk.zzb(zzgcuVar);
        return new zzeay(zza, zzgcuVar, new zzbvj(), ((zzcgz) this.zzb).zzb(), ((zzebr) this.zzc).zzb(), (ArrayDeque) this.zzd.zzb(), new zzebn(), (zzfki) this.zze.zzb());
    }
}
