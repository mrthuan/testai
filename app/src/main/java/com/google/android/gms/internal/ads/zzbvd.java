package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbvd {
    private final List zza;
    private final String zzb;
    private final String zzc;
    private final boolean zzd;
    private final boolean zze;
    private final String zzf;
    private final int zzg;
    private final JSONObject zzh;
    private final String zzi;
    private final long zzj;
    private final long zzk;

    public zzbvd(JSONObject jSONObject) {
        List asList;
        this.zzf = jSONObject.optString(InMobiNetworkValues.URL);
        this.zzb = jSONObject.optString("base_uri");
        this.zzc = jSONObject.optString("post_parameters");
        this.zzd = zzm(jSONObject.optString("drt_include"));
        this.zze = zzm(jSONObject.optString("cookies_include", "true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String optString = jSONObject.optString("errors");
        if (optString == null) {
            asList = null;
        } else {
            asList = Arrays.asList(optString.split(","));
        }
        this.zza = asList;
        this.zzg = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.zzh = optJSONObject == null ? new JSONObject() : optJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.zzi = jSONObject.optString("pool_key");
        this.zzj = zzl(jSONObject.optString("start_time")).longValue();
        this.zzk = zzl(jSONObject.optString("end_time")).longValue();
    }

    private static Long zzl(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        try {
            return Long.valueOf(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private static boolean zzm(String str) {
        if (str == null) {
            return false;
        }
        if (!str.equals("1") && !str.equals("true")) {
            return false;
        }
        return true;
    }

    public final int zza() {
        return this.zzg;
    }

    public final long zzb() {
        return this.zzk;
    }

    public final long zzc() {
        return this.zzj;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zzi;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zza;
    }

    public final JSONObject zzi() {
        return this.zzh;
    }

    public final boolean zzj() {
        return this.zze;
    }

    public final boolean zzk() {
        return this.zzd;
    }
}
