package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcvu {
    private final zzfjl zza;
    private final VersionInfoParcel zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzhew zzg;
    private final String zzh;
    private final zzevr zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    private final zzffg zzk;
    private final zzdcc zzl;

    public zzcvu(zzfjl zzfjlVar, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzhew zzhewVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzevr zzevrVar, zzffg zzffgVar, zzdcc zzdccVar) {
        this.zza = zzfjlVar;
        this.zzb = versionInfoParcel;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzhewVar;
        this.zzh = str2;
        this.zzi = zzevrVar;
        this.zzj = zzgVar;
        this.zzk = zzffgVar;
        this.zzl = zzdccVar;
    }

    public final zzbvb zza(y9.a aVar, Bundle bundle) {
        boolean z10;
        Bundle bundle2 = (Bundle) aVar.get();
        String str = (String) ((y9.a) this.zzg.zzb()).get();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgu)).booleanValue() && this.zzj.zzS()) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str2 = this.zzh;
        PackageInfo packageInfo = this.zzf;
        List list = this.zze;
        return new zzbvb(bundle2, this.zzb, this.zzc, this.zzd, list, packageInfo, str, str2, null, null, z10, this.zzk.zzb(), bundle);
    }

    public final y9.a zzb(Bundle bundle) {
        this.zzl.zza();
        return zzfiv.zzc(this.zzi.zza(new Bundle(), bundle), zzfjf.SIGNALS, this.zza).zza();
    }

    public final y9.a zzc() {
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbS)).booleanValue()) {
            Bundle bundle2 = this.zzk.zzs;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final y9.a zzb = zzb(bundle);
        return this.zza.zza(zzfjf.REQUEST_PARCEL, zzb, (y9.a) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcvt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzcvu.this.zza(zzb, bundle);
            }
        }).zza();
    }
}
