package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbyy {
    private String zzd;
    private String zze;
    private long zzf;
    private JSONObject zzg;
    private boolean zzh;
    private boolean zzj;
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final Map zzc = new HashMap();
    private final List zzi = new ArrayList();

    public zzbyy(String str, long j10) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3;
        this.zzd = "";
        this.zzh = false;
        this.zzj = false;
        this.zze = str;
        this.zzf = j10;
        if (!TextUtils.isEmpty(str)) {
            try {
                this.zzg = new JSONObject(str);
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkM)).booleanValue() || !zzj()) {
                    if (this.zzg.optInt("status", -1) != 1) {
                        this.zzh = false;
                        com.google.android.gms.ads.internal.util.client.zzm.e("App settings could not be fetched successfully.");
                        return;
                    }
                    this.zzh = true;
                    this.zzd = this.zzg.optString("app_id");
                    JSONArray optJSONArray2 = this.zzg.optJSONArray("ad_unit_id_settings");
                    if (optJSONArray2 != null) {
                        for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                            JSONObject jSONObject = optJSONArray2.getJSONObject(i10);
                            String optString = jSONObject.optString("format");
                            String optString2 = jSONObject.optString("ad_unit_id");
                            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.zzb.add(optString2);
                                } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                                    this.zzc.put(optString2, new zzbog(optJSONObject3));
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = this.zzg.optJSONArray("persistable_banner_ad_unit_ids");
                    if (optJSONArray3 != null) {
                        for (int i11 = 0; i11 < optJSONArray3.length(); i11++) {
                            this.zza.add(optJSONArray3.optString(i11));
                        }
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgj)).booleanValue() && (optJSONObject2 = this.zzg.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                        for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                            this.zzi.add(optJSONArray.get(i12).toString());
                        }
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzfE)).booleanValue() && (optJSONObject = this.zzg.optJSONObject("common_settings")) != null) {
                        this.zzj = optJSONObject.optBoolean("is_prefetching_enabled", false);
                    }
                }
            } catch (JSONException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.g(5);
                com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zze;
    }

    public final List zzd() {
        return this.zzi;
    }

    public final Map zze() {
        return this.zzc;
    }

    public final JSONObject zzf() {
        return this.zzg;
    }

    public final void zzg(long j10) {
        this.zzf = j10;
    }

    public final boolean zzh() {
        return this.zzj;
    }

    public final boolean zzi() {
        return this.zzh;
    }

    public final boolean zzj() {
        if (!TextUtils.isEmpty(this.zze) && this.zzg != null) {
            zzbbn zzbbnVar = zzbbw.zzkP;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            long longValue = ((Long) zzbaVar.c.zza(zzbbnVar)).longValue();
            zzbbn zzbbnVar2 = zzbbw.zzkO;
            zzbbu zzbbuVar = zzbaVar.c;
            if (((Boolean) zzbbuVar.zza(zzbbnVar2)).booleanValue() && !TextUtils.isEmpty(this.zze)) {
                longValue = this.zzg.optLong("cache_ttl_sec", ((Long) zzbbuVar.zza(zzbbnVar)).longValue());
            }
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (longValue >= 0) {
                long j10 = this.zzf;
                if (j10 > currentTimeMillis || TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - j10) > longValue) {
                    this.zza.clear();
                    this.zzb.clear();
                    this.zzc.clear();
                    this.zzd = "";
                    this.zze = "";
                    this.zzg = null;
                    this.zzh = false;
                    this.zzi.clear();
                    this.zzj = false;
                    return true;
                }
            }
        }
        return false;
    }
}
