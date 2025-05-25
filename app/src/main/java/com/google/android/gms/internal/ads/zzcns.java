package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcns implements zzgcf {
    final /* synthetic */ zzcnu zza;

    public zzcns(zzcnu zzcnuVar) {
        this.zza = zzcnuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zzb(Object obj) {
        zzffs zzffsVar;
        zzflh zzflhVar;
        zzfex zzfexVar;
        zzfel zzfelVar;
        zzfel zzfelVar2;
        Context context;
        zzcnu zzcnuVar = this.zza;
        String str = (String) obj;
        zzffsVar = zzcnuVar.zzh;
        zzflhVar = zzcnuVar.zzg;
        zzfexVar = zzcnuVar.zze;
        zzfelVar = zzcnuVar.zzf;
        zzfelVar2 = zzcnuVar.zzf;
        List zzd = zzflhVar.zzd(zzfexVar, zzfelVar, false, "", str, zzfelVar2.zzc);
        zzcnu zzcnuVar2 = this.zza;
        zzbze zzbzeVar = com.google.android.gms.ads.internal.zzu.B.f10557g;
        context = zzcnuVar2.zza;
        boolean zzA = zzbzeVar.zzA(context);
        int i10 = 1;
        if (true == zzA) {
            i10 = 2;
        }
        zzffsVar.zzc(zzd, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
    }
}
