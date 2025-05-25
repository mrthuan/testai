package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcnt implements zzgcf {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcnu zzb;

    public zzcnt(zzcnu zzcnuVar, String str) {
        this.zza = str;
        this.zzb = zzcnuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        zzffs zzffsVar;
        zzflh zzflhVar;
        zzfex zzfexVar;
        zzfel zzfelVar;
        List zzu;
        zzcnu zzcnuVar = this.zzb;
        zzffsVar = zzcnuVar.zzh;
        zzflhVar = zzcnuVar.zzg;
        zzfexVar = zzcnuVar.zze;
        zzfelVar = zzcnuVar.zzf;
        zzu = zzcnuVar.zzu();
        zzffsVar.zza(zzflhVar.zzd(zzfexVar, zzfelVar, false, this.zza, null, zzu));
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzffs zzffsVar;
        zzflh zzflhVar;
        zzfex zzfexVar;
        zzfel zzfelVar;
        List zzu;
        zzcnu zzcnuVar = this.zzb;
        String str = this.zza;
        String str2 = (String) obj;
        zzffsVar = zzcnuVar.zzh;
        zzflhVar = zzcnuVar.zzg;
        zzfexVar = zzcnuVar.zze;
        zzfelVar = zzcnuVar.zzf;
        zzu = zzcnuVar.zzu();
        zzffsVar.zza(zzflhVar.zzd(zzfexVar, zzfelVar, false, str, str2, zzu));
    }
}
