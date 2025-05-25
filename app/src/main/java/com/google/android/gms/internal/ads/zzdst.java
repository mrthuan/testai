package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults_Factory;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder_Factory;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdst implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;
    private final zzhfu zzc;
    private final zzhfu zzd;

    public zzdst(zzhfu zzhfuVar, zzhfu zzhfuVar2, zzhfu zzhfuVar3, zzhfu zzhfuVar4, zzhfu zzhfuVar5) {
        this.zza = zzhfuVar2;
        this.zzb = zzhfuVar3;
        this.zzc = zzhfuVar4;
        this.zzd = zzhfuVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final Object zzb() {
        zzgcu zzgcuVar = zzbzo.zza;
        zzhfk.zzb(zzgcuVar);
        com.google.android.gms.ads.internal.util.client.zzr zzrVar = (com.google.android.gms.ads.internal.util.client.zzr) this.zza.zzb();
        CsiParamDefaults_Factory csiParamDefaults_Factory = (CsiParamDefaults_Factory) this.zzb;
        CsiParamDefaults csiParamDefaults = new CsiParamDefaults((Context) csiParamDefaults_Factory.f10763a.zzb(), (VersionInfoParcel) csiParamDefaults_Factory.f10764b.zzb());
        ((CsiUrlBuilder_Factory) this.zzc).getClass();
        return new zzdsp(zzgcuVar, zzrVar, csiParamDefaults, new CsiUrlBuilder(), ((zzcgp) this.zzd).zza());
    }
}
