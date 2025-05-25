package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbyc {
    public static Uri zza(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            StringBuilder sb2 = new StringBuilder(str.substring(0, i10));
            a6.h.l(sb2, str2, "=", str3, "&");
            sb2.append(str.substring(i10));
            return Uri.parse(sb2.toString());
        }
        return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
    }

    public static String zzb(Uri uri, Context context, Map map) {
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        if (!zzuVar.f10574x.zzp(context)) {
            return uri.toString();
        }
        String zza = zzuVar.f10574x.zza(context);
        if (zza == null) {
            return uri.toString();
        }
        zzbbn zzbbnVar = zzbbw.zzZ;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        String str = (String) zzbaVar.c.zza(zzbbnVar);
        String uri2 = uri.toString();
        if (((Boolean) zzbaVar.c.zza(zzbbw.zzY)).booleanValue() && uri2.contains(str)) {
            zzuVar.f10574x.zzj(context, zza, (Map) map.get("_ac"));
            return zzd(uri2, context).replace(str, zza);
        } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            if (!((Boolean) zzbaVar.c.zza(zzbbw.zzX)).booleanValue()) {
                String uri3 = zza(zzd(uri2, context), "fbs_aeid", zza).toString();
                zzuVar.f10574x.zzj(context, zza, (Map) map.get("_ac"));
                return uri3;
            }
            return uri2;
        } else {
            return uri2;
        }
    }

    public static String zzc(String str, Context context, boolean z10, Map map) {
        zzbya zzbyaVar;
        String zza;
        zzbbn zzbbnVar = zzbbw.zzag;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (!((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() || z10) {
            com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
            if (zzuVar.f10574x.zzp(context) && !TextUtils.isEmpty(str) && (zza = (zzbyaVar = zzuVar.f10574x).zza(context)) != null) {
                zzbbn zzbbnVar2 = zzbbw.zzZ;
                zzbbu zzbbuVar = zzbaVar.c;
                String str2 = (String) zzbbuVar.zza(zzbbnVar2);
                boolean booleanValue = ((Boolean) zzbbuVar.zza(zzbbw.zzY)).booleanValue();
                com.google.android.gms.ads.internal.util.zzt zztVar = zzuVar.c;
                if (booleanValue && str.contains(str2)) {
                    zztVar.getClass();
                    if (com.google.android.gms.ads.internal.util.zzt.t(str, zztVar.f10497a, (String) zzbaVar.c.zza(zzbbw.zzV))) {
                        zzbyaVar.zzj(context, zza, (Map) map.get("_ac"));
                        return zzd(str, context).replace(str2, zza);
                    }
                    zztVar.getClass();
                    if (com.google.android.gms.ads.internal.util.zzt.t(str, zztVar.f10498b, (String) zzbaVar.c.zza(zzbbw.zzW))) {
                        zzbyaVar.zzk(context, zza, (Map) map.get("_ai"));
                        return zzd(str, context).replace(str2, zza);
                    }
                    return str;
                } else if (!str.contains("fbs_aeid") && !((Boolean) zzbbuVar.zza(zzbbw.zzX)).booleanValue()) {
                    zztVar.getClass();
                    if (com.google.android.gms.ads.internal.util.zzt.t(str, zztVar.f10497a, (String) zzbaVar.c.zza(zzbbw.zzV))) {
                        zzbyaVar.zzj(context, zza, (Map) map.get("_ac"));
                        return zza(zzd(str, context), "fbs_aeid", zza).toString();
                    }
                    zztVar.getClass();
                    if (com.google.android.gms.ads.internal.util.zzt.t(str, zztVar.f10498b, (String) zzbaVar.c.zza(zzbbw.zzW))) {
                        zzbyaVar.zzk(context, zza, (Map) map.get("_ai"));
                        return zza(zzd(str, context), "fbs_aeid", zza).toString();
                    }
                    return str;
                } else {
                    return str;
                }
            }
            return str;
        }
        return str;
    }

    private static String zzd(String str, Context context) {
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        String zzd = zzuVar.f10574x.zzd(context);
        String zzb = zzuVar.f10574x.zzb(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(zzd)) {
            str = zza(str, "gmp_app_id", zzd).toString();
        }
        if (!str.contains("fbs_aiid") && !TextUtils.isEmpty(zzb)) {
            return zza(str, "fbs_aiid", zzb).toString();
        }
        return str;
    }
}
