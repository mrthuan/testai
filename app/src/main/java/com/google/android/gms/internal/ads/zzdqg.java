package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdqg {
    private final Map zza = new ConcurrentHashMap();
    private JSONObject zzb;
    private final Executor zzc;
    private boolean zzd;
    private JSONObject zze;

    public zzdqg(Executor executor) {
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzg */
    public final synchronized void zzf() {
        JSONObject zzf;
        JSONObject jSONObject;
        Map map;
        this.zzd = true;
        zzbyy zzh = com.google.android.gms.ads.internal.zzu.B.f10557g.zzi().zzh();
        if (zzh != null && (zzf = zzh.zzf()) != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdF)).booleanValue()) {
                jSONObject = zzf.optJSONObject("common_settings");
            } else {
                jSONObject = null;
            }
            this.zzb = jSONObject;
            this.zze = zzf.optJSONObject("ad_unit_patterns");
            JSONArray optJSONArray = zzf.optJSONArray("ad_unit_id_settings");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("ad_unit_id");
                        String optString2 = optJSONObject.optString("format");
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                        if (optString != null && optJSONObject2 != null && optString2 != null) {
                            if (this.zza.containsKey(optString2)) {
                                map = (Map) this.zza.get(optString2);
                            } else {
                                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                this.zza.put(optString2, concurrentHashMap);
                                map = concurrentHashMap;
                            }
                            map.put(optString, optJSONObject2);
                        }
                    }
                }
            }
        }
    }

    public final JSONObject zza() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdF)).booleanValue()) {
            return null;
        }
        return this.zzb;
    }

    public final JSONObject zzb(String str, String str2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdE)).booleanValue() && str != null && str2 != null) {
            if (!this.zzd) {
                zzf();
            }
            Map map = (Map) this.zza.get(str2);
            if (map != null) {
                JSONObject jSONObject = (JSONObject) map.get(str);
                if (jSONObject != null) {
                    return jSONObject;
                }
                String zza = zzdqi.zza(this.zze, str, str2);
                if (zza != null) {
                    return (JSONObject) map.get(zza);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void zzc() {
        com.google.android.gms.ads.internal.zzu.B.f10557g.zzi().q(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqd
            @Override // java.lang.Runnable
            public final void run() {
                zzdqg.this.zze();
            }
        });
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqe
            @Override // java.lang.Runnable
            public final void run() {
                zzdqg.this.zzf();
            }
        });
    }

    public final /* synthetic */ void zze() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqf
            @Override // java.lang.Runnable
            public final void run() {
                zzdqg.this.zzd();
            }
        });
    }
}
