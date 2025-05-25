package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzblt {
    public static void zza(zzblu zzbluVar, String str, Map map) {
        try {
            zzbluVar.zze(str, com.google.android.gms.ads.internal.client.zzay.f10107f.f10108a.j(map));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzblu zzbluVar, String str, JSONObject jSONObject) {
        StringBuilder f10 = android.support.v4.media.session.h.f("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        com.google.android.gms.ads.internal.util.client.zzm.b("Dispatching AFMA event: ".concat(f10.toString()));
        zzbluVar.zza(f10.toString());
    }

    public static void zzc(zzblu zzbluVar, String str, String str2) {
        zzbluVar.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzblu zzbluVar, String str, JSONObject jSONObject) {
        zzbluVar.zzb(str, jSONObject.toString());
    }
}
