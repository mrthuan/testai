package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcvb implements zzczo, zzdfc {
    private final Context zza;
    private final zzffg zzb;
    private final VersionInfoParcel zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzdun zze;
    private final zzfki zzf;

    public zzcvb(Context context, zzffg zzffgVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.util.zzg zzgVar, zzdun zzdunVar, zzfki zzfkiVar) {
        this.zza = context;
        this.zzb = zzffgVar;
        this.zzc = versionInfoParcel;
        this.zzd = zzgVar;
        this.zze = zzdunVar;
        this.zzf = zzfkiVar;
    }

    private final void zzc() {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdC)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzd;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzc;
            zzffg zzffgVar = this.zzb;
            zzfki zzfkiVar = this.zzf;
            String str2 = zzffgVar.zzf;
            zzbyy zzh = zzgVar.zzh();
            com.google.android.gms.ads.internal.zzf zzfVar = com.google.android.gms.ads.internal.zzu.B.f10561k;
            if (zzh != null) {
                zzfVar.getClass();
                str = zzh.zzb();
            } else {
                str = null;
            }
            zzfVar.a(context, versionInfoParcel, false, zzh, str, str2, null, zzfkiVar, null, null);
        }
        this.zze.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdn(zzbvb zzbvbVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdfc
    public final void zze(com.google.android.gms.ads.nonagon.signalgeneration.zzay zzayVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdD)).booleanValue()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdo(zzfex zzfexVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdfc
    public final void zzf(String str) {
    }
}
