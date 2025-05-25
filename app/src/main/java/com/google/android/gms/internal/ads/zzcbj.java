package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcbj {
    public final boolean zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final boolean zzi;
    public final boolean zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final long zzm;
    public final long zzn;

    public zzcbj(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.zza = zza(jSONObject, "aggressive_media_codec_release", zzbbw.zzC);
        this.zzb = zzb(jSONObject, "byte_buffer_precache_limit", zzbbw.zzi);
        this.zzc = zzb(jSONObject, "exo_cache_buffer_size", zzbbw.zzq);
        this.zzd = zzb(jSONObject, "exo_connect_timeout_millis", zzbbw.zze);
        zzbbn zzbbnVar = zzbbw.zzd;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.zze = zzb(jSONObject, "exo_read_timeout_millis", zzbbw.zzf);
            this.zzf = zzb(jSONObject, "load_check_interval_bytes", zzbbw.zzg);
            this.zzg = zzb(jSONObject, "player_precache_limit", zzbbw.zzh);
            this.zzh = zzb(jSONObject, "socket_receive_buffer_size", zzbbw.zzj);
            this.zzi = zza(jSONObject, "use_cache_data_source", zzbbw.zzdP);
            zzb(jSONObject, "min_retry_count", zzbbw.zzk);
            this.zzj = zza(jSONObject, "treat_load_exception_as_non_fatal", zzbbw.zzm);
            this.zzk = zza(jSONObject, "enable_multiple_video_playback", zzbbw.zzbH);
            this.zzl = zza(jSONObject, "use_range_http_data_source", zzbbw.zzbJ);
            this.zzm = zzc(jSONObject, "range_http_data_source_high_water_mark", zzbbw.zzbK);
            this.zzn = zzc(jSONObject, "range_http_data_source_low_water_mark", zzbbw.zzbL);
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbnVar);
        this.zze = zzb(jSONObject, "exo_read_timeout_millis", zzbbw.zzf);
        this.zzf = zzb(jSONObject, "load_check_interval_bytes", zzbbw.zzg);
        this.zzg = zzb(jSONObject, "player_precache_limit", zzbbw.zzh);
        this.zzh = zzb(jSONObject, "socket_receive_buffer_size", zzbbw.zzj);
        this.zzi = zza(jSONObject, "use_cache_data_source", zzbbw.zzdP);
        zzb(jSONObject, "min_retry_count", zzbbw.zzk);
        this.zzj = zza(jSONObject, "treat_load_exception_as_non_fatal", zzbbw.zzm);
        this.zzk = zza(jSONObject, "enable_multiple_video_playback", zzbbw.zzbH);
        this.zzl = zza(jSONObject, "use_range_http_data_source", zzbbw.zzbJ);
        this.zzm = zzc(jSONObject, "range_http_data_source_high_water_mark", zzbbw.zzbK);
        this.zzn = zzc(jSONObject, "range_http_data_source_low_water_mark", zzbbw.zzbL);
    }

    private static final boolean zza(JSONObject jSONObject, String str, zzbbn zzbbnVar) {
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbnVar)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
                return booleanValue;
            }
        }
        return booleanValue;
    }

    private static final int zzb(JSONObject jSONObject, String str, zzbbn zzbbnVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbnVar)).intValue();
    }

    private static final long zzc(JSONObject jSONObject, String str, zzbbn zzbbnVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbnVar)).longValue();
    }
}
