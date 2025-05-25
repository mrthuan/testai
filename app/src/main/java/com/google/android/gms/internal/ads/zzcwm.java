package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcwm implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;
    private final zzhfu zzc;

    public zzcwm(zzcwl zzcwlVar, zzhfu zzhfuVar, zzhfu zzhfuVar2, zzhfu zzhfuVar3, zzhfu zzhfuVar4) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
        this.zzc = zzhfuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final /* synthetic */ Object zzb() {
        String str;
        Context context = (Context) this.zza.zzb();
        VersionInfoParcel zza = ((zzchc) this.zzb).zza();
        zzfel zza2 = ((zzcsl) this.zzc).zza();
        zzbxh zzbxhVar = new zzbxh();
        zzbxi zzbxiVar = zza2.zzA;
        if (zzbxiVar == null) {
            return null;
        }
        zzfeq zzfeqVar = zza2.zzs;
        if (zzfeqVar == null) {
            str = null;
        } else {
            str = zzfeqVar.zzb;
        }
        return new zzbxg(context, zza, zzbxiVar, str, zzbxhVar);
    }
}
