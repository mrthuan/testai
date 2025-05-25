package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzefg implements zzdgx {
    private final VersionInfoParcel zza;
    private final y9.a zzb;
    private final zzfel zzc;
    private final zzcej zzd;
    private final zzffg zze;
    private final zzbja zzf;
    private final boolean zzg;
    private final zzeds zzh;

    public zzefg(VersionInfoParcel versionInfoParcel, y9.a aVar, zzfel zzfelVar, zzcej zzcejVar, zzffg zzffgVar, boolean z10, zzbja zzbjaVar, zzeds zzedsVar) {
        this.zza = versionInfoParcel;
        this.zzb = aVar;
        this.zzc = zzfelVar;
        this.zzd = zzcejVar;
        this.zze = zzffgVar;
        this.zzg = z10;
        this.zzf = zzbjaVar;
        this.zzh = zzedsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgx
    public final void zza(boolean z10, Context context, zzcxd zzcxdVar) {
        boolean z11;
        boolean z12;
        float f10;
        zzeds zzedsVar;
        zzcov zzcovVar = (zzcov) zzgcj.zzq(this.zzb);
        this.zzd.zzaq(true);
        if (this.zzg) {
            z11 = this.zzf.zze(true);
        } else {
            z11 = true;
        }
        boolean z13 = this.zzg;
        if (z13) {
            z12 = this.zzf.zzd();
        } else {
            z12 = false;
        }
        boolean z14 = z12;
        if (z13) {
            f10 = this.zzf.zza();
        } else {
            f10 = 0.0f;
        }
        com.google.android.gms.ads.internal.zzk zzkVar = new com.google.android.gms.ads.internal.zzk(z11, true, z14, f10, z10, this.zzc.zzO, false);
        if (zzcxdVar != null) {
            zzcxdVar.zzf();
        }
        com.google.android.gms.ads.internal.overlay.zzn zznVar = com.google.android.gms.ads.internal.zzu.B.f10553b;
        zzdgm zzg = zzcovVar.zzg();
        zzcej zzcejVar = this.zzd;
        int i10 = this.zzc.zzQ;
        if (i10 == -1) {
            com.google.android.gms.ads.internal.client.zzw zzwVar = this.zze.zzj;
            if (zzwVar != null) {
                int i11 = zzwVar.f10262a;
                if (i11 == 1) {
                    i10 = 7;
                } else if (i11 == 2) {
                    i10 = 6;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzm.b("Error setting app open orientation; no targeting orientation available.");
            i10 = this.zzc.zzQ;
        }
        int i12 = i10;
        VersionInfoParcel versionInfoParcel = this.zza;
        zzfel zzfelVar = this.zzc;
        String str = zzfelVar.zzB;
        zzfeq zzfeqVar = zzfelVar.zzs;
        String str2 = zzfeqVar.zzb;
        String str3 = zzfeqVar.zza;
        zzffg zzffgVar = this.zze;
        if (zzfelVar.zzai) {
            zzedsVar = this.zzh;
        } else {
            zzedsVar = null;
        }
        com.google.android.gms.ads.internal.overlay.zzn.a(context, new AdOverlayInfoParcel(zzg, zzcejVar, i12, versionInfoParcel, str, zzkVar, str2, str3, zzffgVar.zzf, zzcxdVar, zzedsVar), true);
    }
}
