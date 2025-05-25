package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzciz implements zzfba {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzq zzb;
    private final String zzc;
    private final zzcif zzd;
    private final zzhfl zze;
    private final zzhfl zzf;
    private final zzhfl zzg;
    private final zzhfl zzh;
    private final zzhfl zzi;
    private final zzhfl zzj;

    public /* synthetic */ zzciz(zzcif zzcifVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzciy zzciyVar) {
        zzhfl zzhflVar;
        zzhfl zzhflVar2;
        zzhfl zzhflVar3;
        this.zzd = zzcifVar;
        this.zza = context;
        this.zzb = zzqVar;
        this.zzc = str;
        zzhfc zza = zzhfd.zza(context);
        this.zze = zza;
        zzhfc zza2 = zzhfd.zza(zzqVar);
        this.zzf = zza2;
        zzhflVar = zzcifVar.zzM;
        zzhfl zzc = zzhfb.zzc(new zzeml(zzhflVar));
        this.zzg = zzc;
        zzhfl zzc2 = zzhfb.zzc(zzemq.zza());
        this.zzh = zzc2;
        zzhfl zzc3 = zzhfb.zzc(zzdbr.zza());
        this.zzi = zzc3;
        zzhflVar2 = zzcifVar.zzc;
        zzhflVar3 = zzcifVar.zzO;
        this.zzj = zzhfb.zzc(new zzfay(zza, zzhflVar2, zza2, zzhflVar3, zzc, zzc2, zzffi.zza(), zzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzfba
    public final zzelq zza() {
        zzcgm zzcgmVar;
        zzhfl zzhflVar;
        zzfax zzfaxVar = (zzfax) this.zzj.zzb();
        zzemk zzemkVar = (zzemk) this.zzg.zzb();
        zzcgmVar = this.zzd.zza;
        VersionInfoParcel zze = zzcgmVar.zze();
        zzhfk.zzb(zze);
        zzhflVar = this.zzd.zzM;
        return new zzelq(this.zza, this.zzb, this.zzc, zzfaxVar, zzemkVar, zze, (zzdsk) zzhflVar.zzb());
    }
}
