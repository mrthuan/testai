package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdto {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    public /* synthetic */ zzdto(String str, zzdtn zzdtnVar) {
        this.zzb = str;
    }

    public static String zza(zzdto zzdtoVar) {
        String str = (String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjd);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdtoVar.zza);
            jSONObject.put("eventCategory", zzdtoVar.zzb);
            jSONObject.putOpt("event", zzdtoVar.zzc);
            jSONObject.putOpt("errorCode", zzdtoVar.zzd);
            jSONObject.putOpt("rewardType", zzdtoVar.zze);
            jSONObject.putOpt("rewardAmount", zzdtoVar.zzf);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Could not convert parameters to JSON.");
        }
        return a0.a.j(str, "(\"h5adsEvent\",", jSONObject.toString(), ");");
    }
}
