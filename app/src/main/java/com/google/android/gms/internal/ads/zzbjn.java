package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbjn implements zzbix {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        String concat;
        String str = (String) map.get(FacebookMediationAdapter.KEY_ID);
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str4)) {
            concat = "";
        } else {
            concat = "\n".concat(String.valueOf(str4));
        }
        synchronized (this.zza) {
            zzbjm zzbjmVar = (zzbjm) this.zzb.remove(str);
            if (zzbjmVar == null) {
                com.google.android.gms.ads.internal.util.client.zzm.e("Received result for unexpected method invocation: " + str);
            } else if (!TextUtils.isEmpty(str2)) {
                zzbjmVar.zza(str3 + concat);
            } else if (str5 == null) {
                zzbjmVar.zzb(null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (com.google.android.gms.ads.internal.util.zze.i()) {
                        String jSONObject2 = jSONObject.toString(2);
                        com.google.android.gms.ads.internal.util.zze.h("Result GMSG: " + jSONObject2);
                    }
                    zzbjmVar.zzb(jSONObject);
                } catch (JSONException e10) {
                    zzbjmVar.zza(e10.getMessage());
                }
            }
        }
    }

    public final y9.a zzb(zzbme zzbmeVar, String str, JSONObject jSONObject) {
        zzbzt zzbztVar = new zzbzt();
        com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        String uuid = UUID.randomUUID().toString();
        zzc(uuid, new zzbjl(this, zzbztVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(FacebookMediationAdapter.KEY_ID, uuid);
            jSONObject2.put("args", jSONObject);
            zzbmeVar.zzl(str, jSONObject2);
        } catch (Exception e10) {
            zzbztVar.zzd(e10);
        }
        return zzbztVar;
    }

    public final void zzc(String str, zzbjm zzbjmVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbjmVar);
        }
    }
}
