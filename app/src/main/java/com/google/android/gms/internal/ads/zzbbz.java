package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbbz {
    private final String zza = (String) zzbdm.zza.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbbz(Context context, String str) {
        String packageName;
        Object obj;
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        com.google.android.gms.ads.internal.util.zzt zztVar = zzuVar.c;
        linkedHashMap.put("device", com.google.android.gms.ads.internal.util.zzt.E());
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        linkedHashMap.put("app", packageName);
        com.google.android.gms.ads.internal.util.zzt zztVar2 = zzuVar.c;
        boolean d10 = com.google.android.gms.ads.internal.util.zzt.d(context);
        String str2 = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        if (true == d10) {
            obj = "1";
        } else {
            obj = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        }
        linkedHashMap.put("is_lite_sdk", obj);
        Future zzb = zzuVar.f10564n.zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbvf) zzb.get()).zzj));
            linkedHashMap.put("network_fine", Integer.toString(((zzbvf) zzb.get()).zzk));
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "CsiConfiguration.CsiConfiguration");
        }
        zzbbn zzbbnVar = zzbbw.zzku;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            Map map = this.zzb;
            com.google.android.gms.ads.internal.util.zzt zztVar3 = com.google.android.gms.ads.internal.zzu.B.c;
            map.put("is_bstar", true == com.google.android.gms.ads.internal.util.zzt.b(context) ? "1" : str2);
        }
        if (((Boolean) zzbaVar.c.zza(zzbbw.zziA)).booleanValue()) {
            if (((Boolean) zzbaVar.c.zza(zzbbw.zzbZ)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu zzuVar2 = com.google.android.gms.ads.internal.zzu.B;
                if (!zzfvj.zzd(zzuVar2.f10557g.zzn())) {
                    this.zzb.put("plugin", zzuVar2.f10557g.zzn());
                }
            }
        }
    }

    public final Context zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zza;
    }

    public final Map zzd() {
        return this.zzb;
    }
}
