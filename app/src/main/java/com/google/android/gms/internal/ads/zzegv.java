package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzegv implements zzdgx {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final y9.a zzc;
    private final zzfel zzd;
    private final zzcej zze;
    private final zzffg zzf;
    private final zzbja zzg;
    private final boolean zzh;
    private final zzeds zzi;

    public zzegv(Context context, VersionInfoParcel versionInfoParcel, y9.a aVar, zzfel zzfelVar, zzcej zzcejVar, zzffg zzffgVar, boolean z10, zzbja zzbjaVar, zzeds zzedsVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = aVar;
        this.zzd = zzfelVar;
        this.zze = zzcejVar;
        this.zzf = zzffgVar;
        this.zzg = zzbjaVar;
        this.zzh = z10;
        this.zzi = zzedsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgx
    public final void zza(boolean z10, Context context, zzcxd zzcxdVar) {
        boolean z11;
        boolean z12;
        float f10;
        zzeds zzedsVar;
        zzdfp zzdfpVar = (zzdfp) zzgcj.zzq(this.zzc);
        this.zze.zzaq(true);
        if (this.zzh) {
            z11 = this.zzg.zze(false);
        } else {
            z11 = false;
        }
        com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        Context context2 = this.zza;
        boolean z13 = this.zzh;
        boolean g10 = com.google.android.gms.ads.internal.util.zzt.g(context2);
        if (z13) {
            z12 = this.zzg.zzd();
        } else {
            z12 = false;
        }
        if (this.zzh) {
            f10 = this.zzg.zza();
        } else {
            f10 = 0.0f;
        }
        com.google.android.gms.ads.internal.zzk zzkVar = new com.google.android.gms.ads.internal.zzk(z11, g10, z12, f10, z10, this.zzd.zzO, false);
        if (zzcxdVar != null) {
            zzcxdVar.zzf();
        }
        zzdgm zzh = zzdfpVar.zzh();
        zzcej zzcejVar = this.zze;
        zzfel zzfelVar = this.zzd;
        VersionInfoParcel versionInfoParcel = this.zzb;
        int i10 = zzfelVar.zzQ;
        String str = zzfelVar.zzB;
        zzfeq zzfeqVar = zzfelVar.zzs;
        String str2 = zzfeqVar.zzb;
        String str3 = zzfeqVar.zza;
        zzffg zzffgVar = this.zzf;
        if (zzfelVar.zzai) {
            zzedsVar = this.zzi;
        } else {
            zzedsVar = null;
        }
        com.google.android.gms.ads.internal.overlay.zzn.a(context, new AdOverlayInfoParcel(zzh, zzcejVar, i10, versionInfoParcel, str, zzkVar, str2, str3, zzffgVar.zzf, zzcxdVar, zzedsVar), true);
    }
}
