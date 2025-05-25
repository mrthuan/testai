package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzckb implements zzfef {
    private final zzcif zza;
    private final zzhfl zzb;
    private final zzhfl zzc;
    private final zzhfl zzd;
    private final zzhfl zze;
    private final zzhfl zzf;
    private final zzhfl zzg;
    private final zzhfl zzh;
    private final zzhfl zzi;

    public /* synthetic */ zzckb(zzcif zzcifVar, Context context, String str, zzcka zzckaVar) {
        zzhfl zzhflVar;
        zzhfl zzhflVar2;
        zzhfl zzhflVar3;
        zzhfl zzhflVar4;
        zzhfl zzhflVar5;
        zzhfl zzhflVar6;
        zzhfl zzhflVar7;
        zzhfl zzhflVar8;
        this.zza = zzcifVar;
        zzhfc zza = zzhfd.zza(context);
        this.zzb = zza;
        zzhflVar = zzcifVar.zzaH;
        zzhflVar2 = zzcifVar.zzaI;
        zzfcf zzfcfVar = new zzfcf(zza, zzhflVar, zzhflVar2);
        this.zzc = zzfcfVar;
        zzhflVar3 = zzcifVar.zzaH;
        zzhfl zzc = zzhfb.zzc(new zzfdp(zzhflVar3));
        this.zzd = zzc;
        zzhfl zzc2 = zzhfb.zzc(zzffd.zza());
        this.zze = zzc2;
        zzhflVar4 = zzcifVar.zzc;
        zzhflVar5 = zzcifVar.zzO;
        zzhfl zzc3 = zzhfb.zzc(new zzfdz(zza, zzhflVar4, zzhflVar5, zzfcfVar, zzc, zzffi.zza(), zzc2));
        this.zzf = zzc3;
        this.zzg = zzhfb.zzc(new zzfej(zzc3, zzc, zzc2));
        zzhfc zzc4 = zzhfd.zzc(str);
        this.zzh = zzc4;
        zzhflVar6 = zzcifVar.zzl;
        zzhflVar7 = zzcifVar.zzQ;
        zzhflVar8 = zzcifVar.zzM;
        this.zzi = zzhfb.zzc(new zzfed(zzc4, zzc3, zza, zzc, zzc2, zzhflVar6, zzhflVar7, zzhflVar8));
    }

    @Override // com.google.android.gms.internal.ads.zzfef
    public final zzfec zza() {
        return (zzfec) this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfef
    public final zzfei zzb() {
        return (zzfei) this.zzg.zzb();
    }
}
