package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import lib.zj.pdfeditor.Annotation;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdsp extends zzdss {
    private final CsiParamDefaults zzf;

    public zzdsp(Executor executor, com.google.android.gms.ads.internal.util.client.zzr zzrVar, CsiParamDefaults csiParamDefaults, CsiUrlBuilder csiUrlBuilder, Context context) {
        super(executor, zzrVar, csiUrlBuilder, context);
        Object obj;
        this.zzf = csiParamDefaults;
        Map map = this.zza;
        csiParamDefaults.getClass();
        map.put("s", "gmob_sdk");
        map.put(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        com.google.android.gms.ads.internal.util.zzt zztVar = zzuVar.c;
        map.put("device", com.google.android.gms.ads.internal.util.zzt.E());
        map.put("app", csiParamDefaults.f10762b);
        Context context2 = csiParamDefaults.f10761a;
        boolean d10 = com.google.android.gms.ads.internal.util.zzt.d(context2);
        String str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        if (true == d10) {
            obj = "1";
        } else {
            obj = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        }
        map.put("is_lite_sdk", obj);
        zzbbn zzbbnVar = zzbbw.zza;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        List zzb = zzbaVar.f10116a.zzb();
        zzbbn zzbbnVar2 = zzbbw.zzgj;
        zzbbu zzbbuVar = zzbaVar.c;
        boolean booleanValue = ((Boolean) zzbbuVar.zza(zzbbnVar2)).booleanValue();
        zzbze zzbzeVar = zzuVar.f10557g;
        if (booleanValue) {
            zzb.addAll(zzbzeVar.zzi().zzh().zzd());
        }
        map.put(Annotation.KEY_E, TextUtils.join(",", zzb));
        map.put("sdkVersion", csiParamDefaults.c);
        if (((Boolean) zzbbuVar.zza(zzbbw.zzku)).booleanValue()) {
            map.put("is_bstar", true == com.google.android.gms.ads.internal.util.zzt.b(context2) ? "1" : str);
        }
        if (((Boolean) zzbbuVar.zza(zzbbw.zziA)).booleanValue() && ((Boolean) zzbbuVar.zza(zzbbw.zzbZ)).booleanValue()) {
            map.put("plugin", zzfvj.zzc(zzbzeVar.zzn()));
        }
    }

    public final Map zza() {
        return new HashMap(this.zza);
    }
}
