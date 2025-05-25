package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfeo {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final int zzf;
    public final long zzg;
    public final boolean zzh;
    public final String zzi;
    public final zzfen zzj;
    public final Bundle zzk;
    public final String zzl;
    public final String zzm;
    public final String zzn;
    public final JSONObject zzo;
    public final JSONObject zzp;
    public final String zzq;
    public final int zzr;

    public zzfeo(JsonReader jsonReader) {
        JSONObject jSONObject;
        List emptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jsonReader.beginObject();
        String str = "";
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        zzfen zzfenVar = null;
        int i12 = -1;
        long j10 = 0;
        int i13 = 1;
        String str6 = str5;
        String str7 = str6;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (Objects.equals(nextName, "nofill_urls")) {
                emptyList = com.google.android.gms.ads.internal.util.zzbs.c(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i10 = jsonReader.nextInt();
            } else if (Objects.equals(nextName, "refresh_load_delay_time_interval")) {
                i12 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str6 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str7 = jsonReader.nextString();
            } else {
                if ("is_idless".equals(nextName)) {
                    jSONObject = jSONObject3;
                    z10 = jsonReader.nextBoolean();
                } else if ("response_code".equals(nextName)) {
                    i11 = jsonReader.nextInt();
                } else if ("latency".equals(nextName)) {
                    j10 = jsonReader.nextLong();
                } else {
                    zzbbn zzbbnVar = zzbbw.zzhw;
                    String str8 = str;
                    com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
                    jSONObject = jSONObject3;
                    if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        zzfenVar = new zzfen(jsonReader);
                    } else if ("bidding_data".equals(nextName)) {
                        str2 = jsonReader.nextString();
                    } else {
                        zzbbn zzbbnVar2 = zzbbw.zzjz;
                        zzbbu zzbbuVar = zzbaVar.c;
                        if (((Boolean) zzbbuVar.zza(zzbbnVar2)).booleanValue() && Objects.equals(nextName, "topics_should_record_observation")) {
                            jsonReader.nextBoolean();
                        } else if ("adapter_response_replacement_key".equals(nextName)) {
                            str = jsonReader.nextString();
                        } else if ("response_info_extras".equals(nextName)) {
                            if (((Boolean) zzbbuVar.zza(zzbbw.zzgf)).booleanValue()) {
                                try {
                                    Bundle a10 = com.google.android.gms.ads.internal.util.zzbs.a(com.google.android.gms.ads.internal.util.zzbs.f(jsonReader));
                                    if (a10 != null) {
                                        bundle = a10;
                                    }
                                } catch (IOException | JSONException unused) {
                                } catch (IllegalStateException unused2) {
                                    jsonReader.skipValue();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if ("adRequestPostBody".equals(nextName)) {
                            if (((Boolean) zzbbuVar.zza(zzbbw.zzit)).booleanValue()) {
                                str4 = jsonReader.nextString();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if ("adRequestUrl".equals(nextName)) {
                            if (((Boolean) zzbbuVar.zza(zzbbw.zzit)).booleanValue()) {
                                str3 = jsonReader.nextString();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else {
                            zzbbn zzbbnVar3 = zzbbw.zziu;
                            if (((Boolean) zzbbuVar.zza(zzbbnVar3)).booleanValue() && Objects.equals(nextName, "adResponseBody")) {
                                str5 = jsonReader.nextString();
                            } else if (((Boolean) zzbbuVar.zza(zzbbnVar3)).booleanValue() && Objects.equals(nextName, "adResponseHeaders")) {
                                jSONObject2 = com.google.android.gms.ads.internal.util.zzbs.f(jsonReader);
                            } else if (Objects.equals(nextName, "max_parallel_renderers")) {
                                i13 = Math.max(1, jsonReader.nextInt());
                            } else if (((Boolean) zzbbuVar.zza(zzbbw.zziB)).booleanValue() && Objects.equals(nextName, "inspector_ad_transaction_extras")) {
                                jSONObject3 = com.google.android.gms.ads.internal.util.zzbs.f(jsonReader);
                                str = str8;
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    str = str8;
                }
                jSONObject3 = jSONObject;
            }
            jSONObject = jSONObject3;
            jSONObject3 = jSONObject;
        }
        JSONObject jSONObject4 = jSONObject3;
        String str9 = str;
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzc = i10;
        if (((Boolean) zzbdy.zzd.zze()).booleanValue()) {
            this.zzd = -1;
        } else {
            zzbdc zzbdcVar = zzbdg.zza;
            if (((Long) zzbdcVar.zze()).longValue() > -1) {
                this.zzd = ((Long) zzbdcVar.zze()).intValue();
            } else {
                this.zzd = i12;
            }
        }
        this.zzb = str6;
        this.zze = str7;
        this.zzf = i11;
        this.zzg = j10;
        this.zzj = zzfenVar;
        this.zzh = z10;
        this.zzi = str2;
        this.zzk = bundle;
        this.zzl = str3;
        this.zzm = str4;
        this.zzn = str5;
        this.zzo = jSONObject2;
        this.zzp = jSONObject4;
        this.zzq = str9;
        zzbdc zzbdcVar2 = zzbdw.zza;
        this.zzr = ((Long) zzbdcVar2.zze()).longValue() > 0 ? ((Long) zzbdcVar2.zze()).intValue() : i13;
    }
}
