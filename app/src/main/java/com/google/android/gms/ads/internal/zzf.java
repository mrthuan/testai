package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbne;
import com.google.android.gms.internal.ads.zzbni;
import com.google.android.gms.internal.ads.zzbnl;
import com.google.android.gms.internal.ads.zzbno;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzckw;
import com.google.android.gms.internal.ads.zzdsj;
import com.google.android.gms.internal.ads.zzdsk;
import com.google.android.gms.internal.ads.zzfjt;
import com.google.android.gms.internal.ads.zzfju;
import com.google.android.gms.internal.ads.zzfki;
import com.google.android.gms.internal.ads.zzgbq;
import com.google.android.gms.internal.ads.zzgcj;
import com.google.android.gms.internal.ads.zzgcu;
import com.inmobi.commons.core.configs.TelemetryConfig;
import org.json.JSONObject;
import y9.a;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzf {

    /* renamed from: a  reason: collision with root package name */
    public Context f10518a;

    /* renamed from: b  reason: collision with root package name */
    public long f10519b = 0;

    public static final void b(zzdsk zzdskVar, String str, long j10) {
        if (zzdskVar != null) {
            if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzlI)).booleanValue()) {
                zzdsj zza = zzdskVar.zza();
                zza.zzb("action", "lat_init");
                zza.zzb(str, Long.toString(j10));
                zza.zzf();
            }
        }
    }

    public final void a(Context context, VersionInfoParcel versionInfoParcel, boolean z10, zzbyy zzbyyVar, String str, String str2, zzckw zzckwVar, final zzfki zzfkiVar, final zzdsk zzdskVar, final Long l10) {
        PackageInfo c;
        zzu zzuVar = zzu.B;
        zzuVar.f10560j.getClass();
        if (SystemClock.elapsedRealtime() - this.f10519b < TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Not retrying to fetch app settings");
            return;
        }
        DefaultClock defaultClock = zzuVar.f10560j;
        defaultClock.getClass();
        this.f10519b = SystemClock.elapsedRealtime();
        if (zzbyyVar != null && !TextUtils.isEmpty(zzbyyVar.zzc())) {
            long zza = zzbyyVar.zza();
            defaultClock.getClass();
            if (System.currentTimeMillis() - zza <= ((Long) zzba.f10115d.c.zza(zzbbw.zzdJ)).longValue() && zzbyyVar.zzi()) {
                return;
            }
        }
        if (context == null) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Context not provided to fetch application settings");
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            com.google.android.gms.ads.internal.util.client.zzm.e("App settings could not be fetched. Required parameters missing");
        } else {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.f10518a = applicationContext;
            final zzfju zza2 = zzfjt.zza(context, 4);
            zza2.zzi();
            zzbno zza3 = zzuVar.f10566p.zza(this.f10518a, versionInfoParcel, zzfkiVar);
            zzbni zzbniVar = zzbnl.zza;
            zzbne zza4 = zza3.zza("google.afma.config.fetchAppSettings", zzbniVar, zzbniVar);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z10);
                jSONObject.put("pn", context.getPackageName());
                zzbbn zzbbnVar = zzbbw.zza;
                jSONObject.put("experiment_ids", TextUtils.join(",", zzba.f10115d.f10116a.zza()));
                jSONObject.put("js", versionInfoParcel.f10345a);
                try {
                    ApplicationInfo applicationInfo = this.f10518a.getApplicationInfo();
                    if (applicationInfo != null && (c = Wrappers.a(context).c(0, applicationInfo.packageName)) != null) {
                        jSONObject.put("version", c.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.h("Error fetching PackageInfo.");
                }
                a zzb = zza4.zzb(jSONObject);
                zzgbq zzgbqVar = new zzgbq() { // from class: com.google.android.gms.ads.internal.zzd
                    @Override // com.google.android.gms.internal.ads.zzgbq
                    public final a zza(Object obj) {
                        JSONObject jSONObject2 = (JSONObject) obj;
                        boolean optBoolean = jSONObject2.optBoolean("isSuccessful", false);
                        if (optBoolean) {
                            String string = jSONObject2.getString("appSettingsJson");
                            zzu zzuVar2 = zzu.B;
                            zzuVar2.f10557g.zzi().d(string);
                            Long l11 = l10;
                            if (l11 != null) {
                                zzuVar2.f10560j.getClass();
                                zzf.b(zzdskVar, "cld_s", SystemClock.elapsedRealtime() - l11.longValue());
                            }
                        }
                        zzfju zzfjuVar = zza2;
                        zzfjuVar.zzg(optBoolean);
                        zzfkiVar.zzb(zzfjuVar.zzm());
                        return zzgcj.zzh(null);
                    }
                };
                zzgcu zzgcuVar = zzbzo.zzf;
                a zzn = zzgcj.zzn(zzb, zzgbqVar, zzgcuVar);
                if (zzckwVar != null) {
                    zzb.addListener(zzckwVar, zzgcuVar);
                }
                if (l10 != null) {
                    zzb.addListener(new Runnable() { // from class: com.google.android.gms.ads.internal.zze
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzu.B.f10560j.getClass();
                            zzf.b(zzdsk.this, "cld_r", SystemClock.elapsedRealtime() - l10.longValue());
                        }
                    }, zzgcuVar);
                }
                if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzgT)).booleanValue()) {
                    zzbzr.zzb(zzn, "ConfigLoader.maybeFetchNewAppSettings");
                } else {
                    zzbzr.zza(zzn, "ConfigLoader.maybeFetchNewAppSettings");
                }
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                zza2.zzh(e10);
                zza2.zzg(false);
                zzfkiVar.zzb(zza2.zzm());
            }
        }
    }
}
