package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzetx implements zzevo, zzevn {
    private final ApplicationInfo zza;
    private final PackageInfo zzb;
    private final Context zzc;
    private final zzdsf zzd;

    public zzetx(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context, zzdsf zzdsfVar) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
        this.zzc = context;
        this.zzd = zzdsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 29;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        return zzgcj.zzh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzevn
    public final void zzj(Object obj) {
        Integer valueOf;
        InstallSourceInfo installSourceInfo;
        String installingPackageName;
        String initiatingPackageName;
        Bundle bundle = (Bundle) obj;
        String str = this.zza.packageName;
        PackageInfo packageInfo = this.zzb;
        String str2 = null;
        if (packageInfo == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(packageInfo.versionCode);
        }
        bundle.putString("pn", str);
        if (valueOf != null) {
            bundle.putInt("vc", valueOf.intValue());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbV)).booleanValue()) {
                this.zzd.zzc("vc", valueOf.toString());
            }
        }
        PackageInfo packageInfo2 = this.zzb;
        if (packageInfo2 != null) {
            str2 = packageInfo2.versionName;
        }
        if (str2 != null) {
            bundle.putString("vnm", str2);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbV)).booleanValue()) {
                this.zzd.zzc("vn", str2);
            }
        }
        try {
            Context context = this.zzc;
            String str3 = this.zza.packageName;
            com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzt.f10496l;
            bundle.putString("dl", String.valueOf(Wrappers.a(context).b(str3)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzlN)).booleanValue()) {
                try {
                    installSourceInfo = this.zzc.getPackageManager().getInstallSourceInfo(str);
                    if (installSourceInfo != null) {
                        installingPackageName = installSourceInfo.getInstallingPackageName();
                        if (!TextUtils.isEmpty(installingPackageName)) {
                            bundle.putString("ins_pn", installingPackageName);
                        } else {
                            com.google.android.gms.ads.internal.util.zze.h("No installing package name found");
                        }
                        initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                        if (!TextUtils.isEmpty(initiatingPackageName)) {
                            bundle.putString("ini_pn", initiatingPackageName);
                        } else {
                            com.google.android.gms.ads.internal.util.zze.h("No initiating package name found");
                        }
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "PackageInfoSignalsource.compose");
                }
            }
        }
    }
}
