package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzeaw implements zzbnh {
    @Override // com.google.android.gms.internal.ads.zzbnh
    public final JSONObject zzb(Object obj) {
        zzeax zzeaxVar = (zzeax) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzit)).booleanValue()) {
            jSONObject2.put("ad_request_url", zzeaxVar.zzd.zzg());
            jSONObject2.put("ad_request_post_body", zzeaxVar.zzd.zzf());
        }
        jSONObject2.put("base_url", zzeaxVar.zzd.zzd());
        jSONObject2.put("signals", zzeaxVar.zzc);
        jSONObject3.put("body", zzeaxVar.zzb.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzay.f10107f.f10108a.j(zzeaxVar.zzb.zzb));
        jSONObject3.put("response_code", zzeaxVar.zzb.zza);
        jSONObject3.put("latency", zzeaxVar.zzb.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzeaxVar.zzd.zzi());
        return jSONObject;
    }
}
