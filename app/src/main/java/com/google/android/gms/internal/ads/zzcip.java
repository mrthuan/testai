package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcip implements zzezm {
    private final zzcif zza;
    private final zzhfl zzb;
    private final zzhfl zzc;
    private final zzhfl zzd;
    private final zzhfl zze;
    private final zzhfl zzf;
    private final zzhfl zzg;

    public /* synthetic */ zzcip(zzcif zzcifVar, Context context, String str, zzcio zzcioVar) {
        zzhfl zzhflVar;
        zzhfl zzhflVar2;
        zzhfl zzhflVar3;
        zzhfl zzhflVar4;
        zzhfl zzhflVar5;
        zzhfl zzhflVar6;
        zzhfl zzhflVar7;
        zzhfl zzhflVar8;
        zzhfl zzhflVar9;
        this.zza = zzcifVar;
        zzhfc zza = zzhfd.zza(context);
        this.zzb = zza;
        zzhfc zza2 = zzhfd.zza(str);
        this.zzc = zza2;
        zzhflVar = zzcifVar.zzaH;
        zzhflVar2 = zzcifVar.zzaI;
        zzfce zzfceVar = new zzfce(zza, zzhflVar, zzhflVar2);
        this.zzd = zzfceVar;
        zzhflVar3 = zzcifVar.zzaH;
        zzhfl zzc = zzhfb.zzc(new zzfak(zzhflVar3));
        this.zze = zzc;
        zzhflVar4 = zzcifVar.zzc;
        zzhflVar5 = zzcifVar.zzO;
        zzffi zza3 = zzffi.zza();
        zzhflVar6 = zzcifVar.zzl;
        zzhfl zzc2 = zzhfb.zzc(new zzfam(zza, zzhflVar4, zzhflVar5, zzfceVar, zzc, zza3, zzhflVar6));
        this.zzf = zzc2;
        zzhflVar7 = zzcifVar.zzO;
        zzhflVar8 = zzcifVar.zzl;
        zzhflVar9 = zzcifVar.zzM;
        this.zzg = zzhfb.zzc(new zzfas(zzhflVar7, zza, zza2, zzc2, zzc, zzhflVar8, zzhflVar9));
    }

    @Override // com.google.android.gms.internal.ads.zzezm
    public final zzfar zza() {
        return (zzfar) this.zzg.zzb();
    }
}
