package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdjf extends zzdjg {
    private final JSONObject zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;
    private final String zzg;
    private final JSONObject zzh;

    public zzdjf(zzfel zzfelVar, JSONObject jSONObject) {
        super(zzfelVar);
        JSONObject optJSONObject;
        String[] strArr = {"tracking_urls_and_actions", "active_view"};
        JSONObject k10 = com.google.android.gms.ads.internal.util.zzbs.k(jSONObject, strArr);
        if (k10 == null) {
            optJSONObject = null;
        } else {
            optJSONObject = k10.optJSONObject(strArr[1]);
        }
        this.zzb = optJSONObject;
        this.zzc = com.google.android.gms.ads.internal.util.zzbs.i(jSONObject, "allow_pub_owned_ad_view");
        this.zzd = com.google.android.gms.ads.internal.util.zzbs.i(jSONObject, "attribution", "allow_pub_rendering");
        this.zze = com.google.android.gms.ads.internal.util.zzbs.i(jSONObject, "enable_omid");
        String[] strArr2 = {"watermark_overlay_png_base64"};
        JSONObject k11 = com.google.android.gms.ads.internal.util.zzbs.k(jSONObject, strArr2);
        this.zzg = k11 != null ? k11.optString(strArr2[0], "") : "";
        this.zzf = jSONObject.optJSONObject("overlay") != null;
        this.zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeF)).booleanValue() ? jSONObject.optJSONObject("omid_settings") : null;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final zzffj zza() {
        JSONObject jSONObject = this.zzh;
        if (jSONObject != null) {
            return new zzffj(jSONObject);
        }
        return this.zza.zzV;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final String zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final JSONObject zzc() {
        JSONObject jSONObject = this.zzb;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.zza.zzz);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final boolean zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final boolean zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final boolean zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final boolean zzg() {
        return this.zzf;
    }
}
