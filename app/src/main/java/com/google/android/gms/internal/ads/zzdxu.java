package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdxu {
    private final zzcgj zza;
    private final Context zzb;
    private final VersionInfoParcel zzc;
    private final zzffg zzd;
    private final Executor zze;
    private final String zzf;
    private final zzfkf zzg;
    private final zzdsf zzh;
    private final Object zzi = new Object();

    public zzdxu(zzcgj zzcgjVar, Context context, VersionInfoParcel versionInfoParcel, zzffg zzffgVar, Executor executor, String str, zzfkf zzfkfVar, zzdsf zzdsfVar) {
        this.zza = zzcgjVar;
        this.zzb = context;
        this.zzc = versionInfoParcel;
        this.zzd = zzffgVar;
        this.zze = executor;
        this.zzf = str;
        this.zzg = zzfkfVar;
        zzcgjVar.zzx();
        this.zzh = zzdsfVar;
    }

    private final y9.a zzc(final String str, final String str2) {
        zzfju zza = zzfjt.zza(this.zzb, 11);
        zza.zzi();
        zzbno zza2 = com.google.android.gms.ads.internal.zzu.B.f10566p.zza(this.zzb, this.zzc, this.zza.zzz());
        zzbni zzbniVar = zzbnl.zza;
        final zzbne zza3 = zza2.zza("google.afma.response.normalize", zzbniVar, zzbniVar);
        y9.a zzn = zzgcj.zzn(zzgcj.zzn(zzgcj.zzn(zzgcj.zzh(""), new zzgbq(this) { // from class: com.google.android.gms.internal.ads.zzdxr
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                String str3 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str4 = str;
                String str5 = str2;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str4);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str5));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zzgcj.zzh(jSONObject);
                } catch (JSONException e10) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e10.getCause())));
                }
            }
        }, this.zze), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdxs
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzbne.this.zzb((JSONObject) obj);
            }
        }, this.zze), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdxt
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzdxu.this.zzb((JSONObject) obj);
            }
        }, this.zze);
        zzfke.zza(zzn, this.zzg, zza);
        return zzn;
    }

    private final String zzd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzf));
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Failed to update the ad types for rendering. ".concat(e10.toString()));
            return str;
        }
    }

    private static final String zze(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.String zzf(java.lang.String r4, java.lang.String r5, java.lang.String r6, com.google.android.gms.internal.ads.zzdsf r7) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L87
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1c
            r0.<init>(r6)     // Catch: org.json.JSONException -> L1c
            java.lang.String r1 = "is_gbid"
            java.lang.String r0 = r0.optString(r1)     // Catch: org.json.JSONException -> L1c
            java.lang.String r1 = "true"
            boolean r0 = r0.equals(r1)     // Catch: org.json.JSONException -> L1c
            if (r0 == 0) goto L1c
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: org.json.JSONException -> L1c
            goto L1e
        L1c:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L1e:
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L25
            goto L87
        L25:
            java.lang.String r0 = "&"
            int r0 = r4.lastIndexOf(r0)
            r1 = -1
            r2 = 0
            if (r0 == r1) goto L35
            r1 = 0
            java.lang.String r0 = r4.substring(r1, r0)
            goto L36
        L35:
            r0 = r2
        L36:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L87
            r1 = 11
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.String r1 = "UTF-8"
            byte[] r5 = r5.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> L70
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L54 java.io.UnsupportedEncodingException -> L70
            r1.<init>(r6)     // Catch: org.json.JSONException -> L54 java.io.UnsupportedEncodingException -> L70
            java.lang.String r6 = "arek"
            java.lang.String r2 = r1.getString(r6)     // Catch: org.json.JSONException -> L54 java.io.UnsupportedEncodingException -> L70
            goto L6b
        L54:
            r6 = move-exception
            java.lang.String r1 = r6.toString()     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.String r3 = "Failed to get key from QueryJSONMap"
            java.lang.String r1 = r3.concat(r1)     // Catch: java.io.UnsupportedEncodingException -> L70
            com.google.android.gms.ads.internal.util.zze.h(r1)     // Catch: java.io.UnsupportedEncodingException -> L70
            com.google.android.gms.ads.internal.zzu r1 = com.google.android.gms.ads.internal.zzu.B     // Catch: java.io.UnsupportedEncodingException -> L70
            com.google.android.gms.internal.ads.zzbze r1 = r1.f10557g     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.String r3 = "CryptoUtils.getKeyFromQueryJsonMap"
            r1.zzw(r6, r3)     // Catch: java.io.UnsupportedEncodingException -> L70
        L6b:
            java.lang.String r4 = com.google.android.gms.internal.ads.zzffv.zzb(r0, r5, r2, r7)     // Catch: java.io.UnsupportedEncodingException -> L70
            return r4
        L70:
            r5 = move-exception
            java.lang.String r6 = "Failed to decode the adResponse. "
            java.lang.String r7 = r5.toString()
            java.lang.String r6 = r6.concat(r7)
            com.google.android.gms.ads.internal.util.zze.h(r6)
            com.google.android.gms.ads.internal.zzu r6 = com.google.android.gms.ads.internal.zzu.B
            com.google.android.gms.internal.ads.zzbze r6 = r6.f10557g
            java.lang.String r7 = "PreloadedLoader.decryptAdResponseIfNecessary"
            r6.zzw(r5, r7)
        L87:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdxu.zzf(java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.zzdsf):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x012d, code lost:
        if (r5.c(r2, r1, r3) == false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final y9.a zza() {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdxu.zza():y9.a");
    }

    public final /* synthetic */ y9.a zzb(JSONObject jSONObject) {
        return zzgcj.zzh(new zzfex(new zzfeu(this.zzd), zzfew.zza(new StringReader(jSONObject.toString()), null)));
    }
}
